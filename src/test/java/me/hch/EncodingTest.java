package me.hch;

import me.hch.util.FileUtils;
import org.mozilla.universalchardet.UniversalDetector;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/**
 * Created by hch on 2014/5/2.
 */
public class EncodingTest {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\tmp\\cache\\a.txt");

        ByteArrayOutputStream bytes = FileUtils.getBytes(file.getAbsolutePath());
        String encoding = getEncoding(bytes);
        System.out.println(encoding);
    }

    public static String getEncoding(ByteArrayOutputStream baos) {
        UniversalDetector detector = new UniversalDetector(null);

        byte[] bytearr = baos.toByteArray();
        int size = bytearr.length;
        int blockSize = 4096;
        int idx = 0;

        while (idx < size) {
            int n = Math.min(blockSize, size - idx);
            detector.handleData(bytearr, idx, n);
            idx += blockSize;
            if (detector.isDone())
                break;
        }

        detector.dataEnd();

        String encoding = detector.getDetectedCharset();
        detector.reset();

        return encoding;
    }
}
