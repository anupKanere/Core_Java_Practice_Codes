package com.app.thread;

public class ThreadAndProcessExample {

    public static void main(String[] args) {
        // Creating and running a thread
        MyThread thread = new MyThread();
        thread.start();

        // Creating and running a separate process
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe"); // Run the Notepad application
        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            System.out.println("Notepad process exited with code: " + exitCode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished.");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread is running.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyThread has finished.");
    }
}
