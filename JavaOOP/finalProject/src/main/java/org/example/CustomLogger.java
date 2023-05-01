package org.example;

import java.util.logging.*;

public class CustomLogger {
    private static final Logger logger = Logger.getLogger(CustomLogger.class.getName());

    public void log(String message) {
        logger.log(Level.INFO, message);
    }
}

