package me.hch.model;

import java.util.Map;

/**
 * Created by hch on 2014/4/26.
 */
public class NameIdMapper {
    public String id;

    public class Hospital extends NameIdMapper {
        private Map<String, Department> departments;
    }

    public class Department extends NameIdMapper {
        private Map<String, Doctor> doctors;
    }

    public class Doctor extends NameIdMapper {
    }
}
