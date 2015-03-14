package com.sourceit.homework.hw07;

import java.util.*;

/**
 * Created by Still on 13.03.2015.
 */
public class ListUtils implements com.sourceit.hometask.collections.ListUtils{
    @Override
    public List<String> asList(String... strings) throws IllegalArgumentException {

        if (strings == null){
            throw new IllegalArgumentException("Error strings = Null "); //http://javatalks.ru/topics/31991
        }

        List<String> asList = Arrays.asList(strings); //Возвращает список фиксированного размера при поддержке указанного массива .
        return asList;
    }

    @Override
    public <T extends Comparable<T>> List<T> sortedList(List<T> list) throws IllegalArgumentException {

        if (list == null){
            throw new IllegalArgumentException("Error strings = Null "); //http://javatalks.ru/topics/31991
        }

        List<T> sort = new ArrayList<T>();
        sort.addAll(list); // добавляет все элементы коллекции с (если их ещё нет)
        Collections.sort(sort, Collections.reverseOrder()); //сортируем коллекцию в обратном порятке

        return sort;


    }
}
