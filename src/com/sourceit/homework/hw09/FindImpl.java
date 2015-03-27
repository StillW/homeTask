package com.sourceit.homework.hw09;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.PrintStream;

/**
 * Created by Still on 27.03.2015.
 */
public class FindImpl implements FindFilesTask {

    private int tryCountFind;
    private String dir;
    private String searchString;
    private PrintStream outputPrintStream;

    @Override
    public void setDirectory(String s) throws NullPointerException, FileNotFoundException {

        if (s == null){
            throw new NullPointerException("The directory is null");
        }

        if (!(new File(s).exists())){
            throw new FileNotFoundException("Directory error");
        }
        dir = s;

    }

    @Override
    public void setFileNameSearchString(String s) throws IllegalArgumentException {

        if (s == null){
            throw new IllegalArgumentException("Error no filename to search");
        }

        searchString = s;

    }

    @Override
    public void setPrintStream(PrintStream printStream) {

        outputPrintStream = printStream;

    }

    @Override
    public int getTryCount() {
        return tryCountFind;
    }

    @Override
    public void incTryCount() {
        ++tryCountFind;
    }

    @Override
    public void execute() throws TaskExecutionFailedException {

        try{

            File searched = new File(dir);
            String[] list = searched.list(new FilenameFilter() {
                private String search;
                public boolean accept(File dir, String name) {
                    return name.endsWith(search);
                }

            });
            for (int i = 0; i < list.length; i++) {
                outputPrintStream.print(list[i] + " ");
            }
            System.out.println("Searching for files");

        } catch (Exception e){
            throw new TaskExecutionFailedException("Task failed");
        }


    }
}
