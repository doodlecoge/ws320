package me.hch.util;

import me.hch.Ws320RuntimeException;
import org.hibernate.HibernateException;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;
import org.springframework.util.ObjectUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;

/**
 * Created by hch on 2014/7/12.
 */
public class TopEnumType implements UserType, ParameterizedType {
    private Method getEnum;

    private Method getValue;

    private Class<Enum<?>> enumClass;

    private Object enumObject;

    /**
     * This method uses the parameter values passed during enum mapping
     * definition and sets corresponding properties defined
     */
    @SuppressWarnings("unchecked")
    public void setParameterValues(Properties parameters) {
        if (parameters == null) return;
        String className = parameters.get("enumClass").toString();
        try {
            enumClass = (Class<Enum<?>>) Class.forName(className);
            enumObject = enumClass.getEnumConstants()[0];
            getValue = enumClass.getMethod("getPersistedValue");
            getEnum = enumClass.getMethod(
                    "returnEnum",
                    new Class[]{String.class}
            );
        } catch (Exception e) {
            throw new Ws320RuntimeException(e);
        }
    }

    /**
     * This method maps the database mapping
     */
    public int[] sqlTypes() {
        return new int[]{Types.VARCHAR};
    }

    /**
     * This method maps the class for which user type is created
     */
    public Class<?> returnedClass() {
        return enumClass;
    }

    public boolean equals(Object x, Object y) throws HibernateException {
        return ObjectUtils.nullSafeEquals(x, y);
    }

    /**
     * Fetch the hash code
     */
    public int hashCode(Object x) throws HibernateException {
        return x.hashCode();
    }

    /**
     * Recreate the enum from the resultset
     */
    public Object nullSafeGet(ResultSet rs, String[] names, Object owner)
            throws HibernateException, SQLException {

        String value = rs.getString(names[0]);
        Object returnVal = null;

        if (value == null)
            return null;
        else {
            try {
                returnVal = getEnum.invoke(enumObject, new Object[]{value});
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return returnVal;
    }

    /**
     * Fetch the data from enum and set it in prepared statement
     */
    public void nullSafeSet(PreparedStatement st, Object value, int index)
            throws HibernateException, SQLException {
        String prepStmtVal = null;

        if (value == null) {
            st.setObject(index, null);
        } else {
            try {
                prepStmtVal = getValue.invoke(value).toString();
                st.setString(index, prepStmtVal);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Deep copy method
     */
    public Object deepCopy(Object value) throws HibernateException {
        return value;
    }

    public boolean isMutable() {
        return false;
    }

    public Serializable disassemble(Object value) throws HibernateException {
        Object deepCopy = deepCopy(value);

        if (!(deepCopy instanceof Serializable))
            return (Serializable) deepCopy;

        return null;
    }

    public Object assemble(Serializable cached, Object owner)
            throws HibernateException {
        return deepCopy(cached);
    }

    public Object replace(Object original, Object target, Object owner)
            throws HibernateException {
        return deepCopy(original);
    }
}
