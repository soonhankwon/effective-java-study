package com.soon.effectivejavastudy.chapter1.item09.puzzler;

import java.io.*;

public class Copy {

    private static final int BUFFER_SIZE = 8 * 1024;

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);

        try {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                // safe? runtime exception 이 발생한다면?
            }

            try {
                in.close();
            } catch (IOException e) {
                // safe?
            }
        }
    }
}
