package me.hch;

import me.hch.init.H2DatabaseInitialize;
import me.hch.init.PopulateMemoryCache;
import me.hch.job.CacheUpdatingJob;
import org.springframework.web.util.WebUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;

/**
 * Created by huaiwang on 14-3-28.
 */
public class Ws320Listener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent event) {
        // set system property "webapp.root" to the absolute path
        // the .war file is exploded. You can get it by calling
        // System.getProperty("webapp.root") in any class.
        WebUtils.setWebAppRootSystemProperty(event.getServletContext());


        try {
            H2DatabaseInitialize.init();
        } catch (SQLException e) {
            //throw new Ws320Exception(e);
        }

        // put initialization code here including
        // Schedule, Hospital, Doctor, Department
        // and Patient in memory data.


        PopulateMemoryCache populateMemoryCache = new PopulateMemoryCache();

        // load schedules
//        populateMemoryCache.populateSchedules();
        populateMemoryCache.populateHospitalFromDb();

        // load patients
        populateMemoryCache.populatePatients();


        CacheUpdatingJob.getInstance().start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {
        // put code here to perform the following task:
        // - release any resources;
        // - save in memory data to database if needed.

        CacheUpdatingJob.getInstance().stop();
    }
}
