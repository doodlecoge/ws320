package me.hch.init;

import me.hch.bean.Hospital;
import me.hch.model.MemoryCache;

/**
 * Created by huaiwang on 14-3-28.
 */
public class PopulateMemoryCache {

    public static void populateSchedules() {

    }

    public static void populatePatients() {

    }

    private static void populateHospitalFromDb() {

        Hospital hospital = new Hospital();
        hospital.setHospName("虎丘医院");
        hospital.id = "FQYY";



    }
}
