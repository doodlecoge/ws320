package me.hch.util;

import me.hch.Ws320Exception;

import java.io.*;

/**
 * Created by Administrator on 14-4-12.
 */
public class FileUtils {
    private FileUtils ins;
    private String directory;

    private FileUtils(String dir) {
        if (dir == null)
            dir = "." + File.separator;

        if (!dir.endsWith(File.separator))
            dir += File.separator;
    }

    public static FileUtils getInstance() {
        return getInstance("." + File.separator);
    }

    public static FileUtils getInstance(String dir) {
        return new FileUtils(dir);
    }


    /* instance methods */
    public String getFileContent(String fileName) throws IOException {
        if (fileName.startsWith("/"))
            fileName = fileName.substring(1);

        return getFileContent(new File(directory + fileName));
    }

    public void saveAs(String fileName, String content) {
        try {
            File file = new File(directory + fileName);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) parentFile.mkdirs();

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(directory + fileName)
            );

            bw.write(content);
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new Ws320Exception(e);
        }
    }


    /* static methods */
    public static String load(String fileName) {
        InputStream is = FileUtils.class.getClassLoader().getResourceAsStream(fileName);
        if (is == null) is = FileUtils.class.getResourceAsStream(fileName);
        if (is == null) throw new Ws320Exception("file not found[" + fileName + "]");

        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int b;
        try {
            while ((b = bis.read()) != -1) {
                baos.write(b);
            }
        } catch (IOException e) {
            throw new Ws320Exception(e);
        }

        return baos.toString();
    }

    public static String getFileContent(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int b;
        while ((b = bis.read()) != -1) {
            baos.write(b);
        }

        return baos.toString();
    }

    public static boolean ancestorExists(File file) {
        do {
            if (file.exists()) return true;
            else file = file.getParentFile();
        } while (file != null);

        return false;
    }

    public static boolean ancestorExists(String path) {
        return ancestorExists(new File(path));
    }
}
