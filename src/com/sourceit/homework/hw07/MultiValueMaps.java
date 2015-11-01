package com.sourceit.homework.hw07;


import com.sourceit.hometask.collections.MultiValueMap;

import java.util.*;

/**
 * Created by Still on 13.03.2015.
 */
public class MultiValueMaps<K, V> extends HashMap<K, List<V>> implements com.sourceit.hometask.collections.MultiValueMap<K, List<V>> {

    private Map<K, List<V>> map = new HashMap<K, List<V>>();



    public String toString() {
        return "MultiValueMap{" + "map = " + map + '}' + "\n";
    }


    @Override
    public int getCountValues(Object k) {
        if (map.containsKey(k)) {
            List<V> list = map.get(k);
            return list.size();
        }
        return 0;
    }

    @Override
    public List<V> get(Object key) {
        return map.get(key);
    }


    @Override
    public Iterator<V> getIterator(Object k) {
        List<V> tmp = map.get(k);
        return tmp.iterator();
    }

    @Override
    public List<V> remove(Object o) {
        return map.remove(o);
    }


    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public boolean isEmpty() {
        if (map == null) {
            return true;
        }
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        for (K key : map.keySet()) {
            List<V> values = map.get(key);
            if (values.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<V> put(K key, List<V> value) {
        return map.put(key, value);
    }

    @Override
    public void putAll(Map<? extends K, ? extends List<V>> m) {
        map.putAll(m);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Set<K> keySet() {
        return map.keySet();
    }

    @Override
    public Collection<List<V>> values() {
        Collection<V> values = new ArrayList<V>();
        for (K key : map.keySet()) {
            values.addAll(map.get(key));
        }
        return (Collection<List<V>>) values;
    }

    @Override
    public Set<Entry<K, List<V>>> entrySet() {
        return map.entrySet();
    }
}

