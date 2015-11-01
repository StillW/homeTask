package com.sourceit.webtask.controller.common.admin;

/**
 * Created by Still on 20.10.2015.
 */
public class Item {

    public String art;
    public String type1;

    public Item(){
        this.art = art;
        this.type1 = type1;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{type: " + type1
                + ", articles " + art
        + "}";
    }
}
