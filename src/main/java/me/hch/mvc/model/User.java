package me.hch.mvc.model;

import me.hch.Ws320RuntimeException;
import me.hch.util.EnumIface;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by huaiwang on 7/14/14.
 */
@Entity
@Table(name = "users", schema = "ws320")
public class User {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    @Type(
            type = "me.hch.util.EnumType",
            parameters = {
                    @Parameter(
                            name = "enumClass",
                            value = "me.hch.mvc.model.User$Sex"
                    )
            }
    )
    private Sex sex;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public static enum Sex implements EnumIface<Sex> {
        M("Male"),
        F("Female");

        public String value;

        Sex(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }

        @Override
        public Sex getEnum(String value) {
            for (Sex sex : Sex.values()) {
                if (sex.value.equals(value)) return sex;
            }
            throw new Ws320RuntimeException("not found:" + value);
        }
    }
}
