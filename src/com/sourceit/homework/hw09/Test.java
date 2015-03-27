package com.sourceit.homework.hw09;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TasksStorage;
import com.sourceit.homework.Output.CopyFileFactoryImpl;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Still on 27.03.2015.
 */
public class Test extends  Thread {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        final PrintStream ps = new PrintStream("D:\\JavaProject\\111.txt");
        FindFilesTask task1 = new FindImpl();
        final TasksStorage tasksStorage = new TasksStorageImpl();
        final CopyFileFactory copyFF = new CopyFileFactoryImpl();
        CopyImpl task2 = new CopyImpl(copyFF.createChannelsCopyFileStrategy(),ps,"D:\\JavaProject\\1112.txt");


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    tasksStorage.add(new CopyImpl(copyFF.createChannelsCopyFileStrategy(),ps,"D:\\JavaProject\\1112.txt"));
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    tasksStorage.add(new CopyImpl(copyFF.createChannelsCopyFileStrategy(),ps,"D:\\JavaProject\\1112.txt"));
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    tasksStorage.add(new CopyImpl(copyFF.createChannelsCopyFileStrategy(),ps,"D:\\JavaProject\\1112.txt"));
                }
            }
        });

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread thread7 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        Thread thread8 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new TaskExecutorImpl(tasksStorage).start();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                }
            }
        });

        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);
        thread4.setDaemon(true);
        thread5.setDaemon(true);
        thread6.setDaemon(true);
        thread7.setDaemon(true);
        thread8.setDaemon(true);


        thread1.start();
        thread2.start();
        thread3.start();


        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}







