package me.hch;

import javax.xml.bind.annotation.*;

/**
 * Created by Administrator on 14-4-20.
 */

@XmlType
@XmlRootElement(name = "Hospital")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person extends IdClass {
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Age")
    protected int age;

    protected String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
