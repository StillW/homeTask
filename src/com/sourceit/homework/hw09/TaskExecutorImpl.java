package com.sourceit.homework.hw09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TaskExecutionFailedException;
import com.sourceit.hometask.threads.TaskExecutor;
import com.sourceit.hometask.threads.TasksStorage;

/**
 * Created by Still on 27.03.2015.
 */
public class TaskExecutorImpl implements TaskExecutor {

    private TasksStorage storage;
    private static boolean startPoint = false;

    public TaskExecutorImpl(TasksStorage tasksStorage) {
    }

    @Override
    public void setStorage(TasksStorage tasksStorage) throws NullPointerException {
        if (tasksStorage == null){
            throw new NullPointerException("Specified storage is null");
        }

        storage = tasksStorage;
    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        if (startPoint){
            throw new IllegalStateException("Error");
        }

        startPoint = true;

        if (storage == null || storage.count() == 0){
            throw new NullPointerException("Storage is null or empty");
        }

        Task t = storage.get();

        try {
            System.out.println("executing");
            t.incTryCount();
            t.execute();
        } catch (TaskExecutionFailedException e) {
            System.out.println(e.getMessage());
            if (t.getTryCount()<6){
                storage.add(t);
            }
        }
        stop();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("My Thread was interrupted.");
        }
    }

    @Override
    public void stop() throws IllegalStateException {
        if (!startPoint){
            throw new IllegalStateException("Execution hasn't been started yet");
        }

        startPoint = false;
    }
}


