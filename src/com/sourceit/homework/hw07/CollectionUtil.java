package com.sourceit.homework.hw07;

import com.sourceit.hometask.collections.CollectionUtils;
import com.sourceit.hometask.collections.ListUtils;
import com.sourceit.hometask.collections.MultiValueMap;
import com.sourceit.hometask.collections.SetUtils;

import java.util.*;

/**
 * Created by Still on 08.03.2015.
 */

public class CollectionUtil implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> var1, Collection<Integer> var2) throws NullPointerException {

        if (var1 == null || var2 == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }
        Collection<Integer> union = new ArrayList<Integer>();
        //var1 = new ArrayList<Integer>();
        //var2 = new ArrayList<Integer>();

        union.addAll(var1); //объединение, обозначается как A \cup B — множество, содержащее все элементы из A и B,
        union.addAll(var2);

        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {

        if (collection == null || collection1 == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }
        Collection<Integer> intersection = new ArrayList<Integer>();
        intersection.addAll(collection);
        intersection.retainAll(collection1); //удаляет элементы, не принадлежащие переданной коллекции

        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {

        if (collection == null || collection1 == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }
        Set<Integer> union01 = new TreeSet<Integer>(); //хранит элементы упорядоченно, в какм бы порядке мы не добавляли
        union01.addAll(collection);                   //и не удаляли элементы, коллекция останется строго упорядоченной.
        union01.addAll(collection1);

        return union01;

    }

    @Override
    public Set<Integer> intersectionWithoutDuplicates(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {

        if (collection == null || collection1 == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }
        Set<Integer> intersection = new TreeSet<Integer>();
        intersection.addAll(collection);
        intersection.retainAll(collection1);

        return intersection;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> collection, Collection<Integer> collection1) throws NullPointerException {

        if (collection == null || collection1 == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }

        Collection<Integer> difference = new ArrayList<Integer>();
        Collection<Integer> time = new ArrayList<Integer>();

        difference.addAll(collection); //добавляем в основную колекцию элемент 1 колекции
        difference.addAll(collection1); //и второй
        time.addAll(collection); // во временную коллекцию заносим элементы 1 коллекции
        time.retainAll(collection1); //удаляем элемент не пренадлежащие второй колекции
        difference.removeAll(time);//удаляем элемент не пренадлежащие временной колекции

        return difference;

    }
}
