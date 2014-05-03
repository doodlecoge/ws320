package me.hch;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by hch on 2014/4/5.
 */

@XmlRootElement(name = "hch")
public class FooCls {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    @XmlAttribute(name = "fid")
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
}
