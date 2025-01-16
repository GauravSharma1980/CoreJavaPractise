package com;


interface ILogger {
    void log();
}

public class Test42 {
    public static void main(String[] args) {
        ILogger [] loggers = new ILogger[2]; //Line n1
        for(ILogger logger : loggers)
            logger.log(); //Line n2
    }
}

