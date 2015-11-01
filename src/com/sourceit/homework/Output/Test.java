package com.sourceit.homework.Output;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Still on 22.03.2015.
 */
public class Test {
    public static void main(String[] args){
        CopyFileFactoryImpl test01 = new CopyFileFactoryImpl();

        com.sourceit.hometask.io.CopyFileStrategy simple = test01.createSimpleCopyFileStrategy();
        com.sourceit.hometask.io.CopyFileStrategy buffer = test01.createBufferedCopyFileStrategy();
        com.sourceit.hometask.io.CopyFileStrategy channels = test01.createChannelsCopyFileStrategy();
        com.sourceit.hometask.io.CopyFileStrategy filesCopy = test01.createFilesCopyFileStrategy();

        String pathTxt = "D:\\JavaProject\\111.txt";
        String pathDoc = "D:\\JavaProject\\Zad.doc";
        String pathJpeg = "D:\\JavaProject\\pic.jpeg";

        File txt = new File ("D:\\JavaProject\\1113.txt");
        File doc = new File ("D:\\JavaProject\\Zad3.doc");
        File jpeg = new File ("D:\\JavaProject\\pic2.jpeg");

        long start;
        long end;

        start = System.nanoTime();
        try {
            simple.copyFile(pathDoc, pathTxt);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");

        start = System.nanoTime();
        try {
            simple.copyFile(doc, txt);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            buffer.copyFile(txt, doc);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            buffer.copyFile(txt, doc);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e1) {
            e1.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            channels.copyFile(txt, doc);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            channels.copyFile(txt, doc);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            filesCopy.copyFile(txt, doc);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            System.out.println("FileCopyFailedException");
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");


        start = System.nanoTime();
        try {
            filesCopy.copyFile(txt, doc);
        } catch (FileAlreadyPresentsException a) {
            System.out.println(a.getMessage());
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
        end = System.nanoTime() - start;
        System.out.println(end / 1000000.0 + " msec");

    }
}
