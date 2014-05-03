package me.hch;

import me.hch.util.FileUtils;

import java.io.*;

/**
 * Created by hch on 2014/5/1.
 */
public class TestFile {
    static private String fileStr = "E:\\tmp\\cache\\a.xml";

    public static void main(String[] args) throws Exception {
        foo();
//        String property = System.getProperty("file.encoding");
//        System.out.println(property);
//
//        String inEncoding = "gbk";
//        String outEncoding = "GB18030";
//
//
//
//
//        String fileContent = FileUtils.getFileContent(new File(fileStr));
//        System.out.println(fileContent);


//        InputStreamReader isr = new InputStreamReader(
//                new FileInputStream(fileStr),
//                inEncoding
//        );
//
//        BufferedReader br = new BufferedReader(isr);
//
//        String ret = "";
//        String line = null;
//
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//            ret += line;
//        }
//
//        System.out.println(ret);

//        CharArrayWriter caw = new CharArrayWriter();
//        int b = -1;
//        while ((b = isr.read()) != -1) {
//            caw.write(b);
//        }
//        System.out.println(caw.toString());

    }


    public static void foo() throws IOException {
        FileInputStream fis = new FileInputStream(fileStr);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int b = -1;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
            baos.write(b);
        }
        System.out.println(baos.toString("utf8"));
    }
}
