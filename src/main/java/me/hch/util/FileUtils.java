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
        if (dir == null) dir = "./";
        if (!dir.endsWith("/")) dir += "/";
        directory = dir;
    }

    public static FileUtils getInstance() {
        return getInstance("./");
    }

    public static FileUtils getInstance(String dir) {
        return new FileUtils(dir);
    }

    public String getFileContent(String fileName) throws IOException {
        if (fileName.startsWith("/"))
            fileName = fileName.substring(1);

        InputStream is = new FileInputStream(directory + fileName);

        BufferedInputStream bis = new BufferedInputStream(is);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        int b;
        while ((b = bis.read()) != -1) {
            baos.write(b);
        }

        return baos.toString();
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
}
