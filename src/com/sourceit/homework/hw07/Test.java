package com.sourceit.homework.hw07;



import com.sourceit.hometask.collections.*;

import java.util.*;

/**
 * Created by Still on 08.03.2015.
 */

public class Test{

    public static void main(String[] args) {

        Collection<Integer> var1 = Arrays.asList(2,6,4,8,9);
        Collection<Integer>var2 = Arrays.asList(5,8,6,1,0);

        CollectionUtil test01 = new CollectionUtil();

        test01.union(var1,var2);

        System.out.println(test01.union(var1,var2));
        System.out.println(test01.intersection(var1, var2));
        System.out.println(test01.unionWithoutDuplicates(var1, var2));
        System.out.println(test01.intersectionWithoutDuplicates(var1, var2));
        System.out.println(test01.difference(var1, var2));
        System.out.println();

        com.sourceit.hometask.collections.MultiValueMap test02 = new MultiValueMaps();
        ArrayList<String> arr1= new ArrayList<String>(Arrays.asList("hello","my","friend"));
        ArrayList<String> arr2= new ArrayList<String>(Arrays.asList("thanks","my","comp"));
        ArrayList<String> arr3= new ArrayList<String>(Arrays.asList("usually","is","good"));
        ArrayList<String> arr4= new ArrayList<String>(Arrays.asList("hello","my","friend"));

        ArrayList<ArrayList<String>> arrtest = new ArrayList<ArrayList<String>>();
        arrtest.add(arr1);
        arrtest.add(arr2);
        arrtest.add(arr3);
        arrtest.add(arr4);

        test02.put(4, arr4);
        test02.put(3, arr3);
        test02.put(2, arr2);
        test02.put(1,arr1);

        System.out.println(test02);

        ListUtils test03 = new ListUtils();

        System.out.println(test03.asList("Hello", "thats", "my", "new", "prog"));
        System.out.println(test03.sortedList(Arrays.asList(5,4,5,8,9)));

        SetUtils test04 = new SetUtils();

        Collection<Integer>collection = new ArrayList<Integer>();
        collection.add(5);
        collection.add(7);
        collection.add(9);
        collection.add(1);


        Set<String> str = new TreeSet<String>();
        str.add("h");
        str.add("my");
        str.add("dear");
        str.add("dar");
        str.add("fsdr");
        str.add("hesda");

        System.out.println(test04.orderedSet(collection,str).toString());




    }
}

