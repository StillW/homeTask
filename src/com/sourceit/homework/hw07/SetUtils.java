package com.sourceit.homework.hw07;

import java.util.*;

/**
 * Created by Still on 13.03.2015.
 *  Если я правильно понял в первом случае нужно отсортировать коллекцию интов и коллекцию стрингов
 *  http://docs.oracle.com/javase/7/docs/api/java/util/SortedSet.html
 */
public class SetUtils implements com.sourceit.hometask.collections.SetUtils{

    @Override
    public SortedSet<String> orderedSet(Collection<Integer> collection, Set<String> set) throws NullPointerException {

        if (collection == null || set == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }

        System.out.println(set);
        System.out.println(collection);

        final ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.addAll(collection);

        final ArrayList<String> strin = new ArrayList<String>();
        strin.addAll(set);

        for (String str : set){
            strin.add(str);
        }

        final Map <String, Integer> map1= new HashMap<String, Integer>();
        for (int i=0;i<strin.size();i++){
            map1.put(strin.get(i), ints.get(i));
        }

        //http://docs.oracle.com/javase/7/docs/api/java/util/SortedSet.html
        SortedSet<String> sort = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map1.get(o1).compareTo(map1.get(o2));
            }
        });
        sort.addAll(strin);
        return  sort;
    }


    @Override
    public Set<Integer> customOrderSet(Integer... integers) throws NullPointerException { // с пользовательскими настройками

        if (integers == null) {
            throw new NullPointerException("Error var1 or var2 = null");
        }

        Set<Integer> set = new HashSet<Integer>();

            for(int i = 0; i<integers.length; i++){
                set.add(integers[i]);
            }
        System.out.println(set);

        Set<Integer> customOrderSet = new TreeSet<Integer>(set);
        customOrderSet.addAll(set);

        return customOrderSet;

    }
}
