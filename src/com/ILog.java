package com;

interface ILog {
    default void log() {
        System.out.println("ILog");
    }
}
 
abstract class Log {
    public  void log() {
        System.out.println("Log");
    }
}
 
class MyLogger extends Log implements ILog {

    public static void main(String[] args) {
        MyLogger myLogger = new MyLogger();
        myLogger.log();

        final int i3 = 10;

        short s3 = i3;

    }

}