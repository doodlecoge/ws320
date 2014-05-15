package me.hch.trigger;

import me.hch.Ws320Exception;
import me.hch.trigger.impl.CancelRegistrationTrigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by hch on 2014/5/11.
 */
public class TriggerFactory {
    private static final Logger log = LoggerFactory.getLogger(TriggerFactory.class);

    public static void main(String[] args) {
        List<Class> triggerClasses = getTriggerClasses();
        for (Class triggerClass : triggerClasses) {
            System.out.println(triggerClass);
        }
    }

    public TriggerInterface getTrigger() {
        return null;
    }

    private static List<Class> getTriggerClasses() {
        List<Class> triggerClasses = new ArrayList<Class>();
        URL impl = TriggerFactory.class.getResource("./impl");

        if (impl == null) {
            throw new Ws320Exception("package impl not found");
        }

        File dir = new File(impl.getFile());
        File[] files = dir.listFiles();
        for (File file : files) {
            String name = file.getName();
            if (!name.endsWith(".class")) continue;
            name = name.substring(0, name.length() - 6);
            Class c = null;
            try {
                c = Class.forName("me.hch.trigger.impl." + name);
            } catch (ClassNotFoundException e) {
                log.error("class not found: " + name, e);
            }

            if (!TriggerInterface.class.isAssignableFrom(c)) {
                log.warn(name + " is not inherit from TriggerInterface");
                continue;
            }

            triggerClasses.add(c);
        }
        return triggerClasses;
    }

    /**
     * Scans all classes accessible from the context class loader which belong to the given package and subpackages.
     *
     * @param packageName The base package
     * @return The classes
     * @throws ClassNotFoundException
     * @throws IOException
     */
    private static Class[] getClasses(String packageName)
            throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace('.', '/');
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<File>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class> classes = new ArrayList<Class>();
        for (File directory : dirs) {
            classes.addAll(findClasses(directory, packageName));
        }
        return classes.toArray(new Class[classes.size()]);
    }

    /**
     * Recursive method used to find all classes in a given directory and subdirs.
     *
     * @param directory   The base directory
     * @param packageName The package name for classes found inside the base directory
     * @return The classes
     * @throws ClassNotFoundException
     */
    private static List<Class> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class> classes = new ArrayList<Class>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }
        return classes;
    }
}
