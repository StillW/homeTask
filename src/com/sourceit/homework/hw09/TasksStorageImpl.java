package com.sourceit.homework.hw09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TasksStorage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Still on 27.03.2015.
 */
public class TasksStorageImpl implements TasksStorage {

    private List<Task> taskList;

    @Override
    public void add (Task task)throws NullPointerException {

            if (task == null) {
                throw new NullPointerException("Error task is null");
            }

            if (taskList == null) {
                taskList = new ArrayList<>();
            }
            taskList.add(0, task);

        }


    @Override
    synchronized public Task get() {
        if (taskList.size() > 0){
            Task firstTask = taskList.get(0);
            taskList.remove(0);
            return firstTask;
        }
        return null;
    }

    @Override
    public int count() {
        return taskList.size();
    }
}