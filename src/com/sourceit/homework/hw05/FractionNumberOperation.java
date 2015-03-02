package com.sourceit.homework.hw05;


import com.sourceit.hometask.basic.FractionNumber;
import com.sourceit.hometask.basic.*;

/**
 * Created by Still on 01.03.2015.
 */
public class FractionNumberOperation implements com.sourceit.hometask.basic.FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber frNum1, FractionNumber frNum2){
        com.sourceit.homework.hw05.FractionNumber fn1 = new com.sourceit.homework.hw05.FractionNumber();
        fn1.setDivisor(frNum1.getDivisor()*frNum2.getDivisor());
        fn1.setDividend(frNum1.getDivisor()*frNum1.getDividend()+(frNum2.getDivisor())*frNum2.getDividend());
        return fn1;
    }

    @Override
    public FractionNumber sub(FractionNumber fnNum1, FractionNumber fnNum2){
        com.sourceit.homework.hw05.FractionNumber fn1 = new com.sourceit.homework.hw05.FractionNumber();
        fn1.setDivisor(fnNum1.getDivisor()*fnNum2.getDivisor());
        fn1.setDividend(((fn1.getDivisor()/fnNum1.getDivisor())*fnNum1.getDividend())+((fn1.getDivisor()/fnNum2.getDivisor())*fnNum2.getDividend()));
        return fn1;
    }

    @Override
    public FractionNumber mul(FractionNumber fnNum1, FractionNumber fnNum2){
        com.sourceit.homework.hw05.FractionNumber fn1 = new com.sourceit.homework.hw05.FractionNumber();
        fn1.setDivisor(fnNum1.getDivisor()*fnNum2.getDivisor());
        fn1.setDividend(((fn1.getDivisor()/fnNum1.getDivisor())*fnNum1.getDividend())+((fn1.getDivisor()/fnNum2.getDivisor())*fnNum2.getDividend()));
        return fn1;
    }

    @Override
    public FractionNumber div(FractionNumber fnNum1, FractionNumber fnNum2){
        com.sourceit.homework.hw05.FractionNumber fn1 = new com.sourceit.homework.hw05.FractionNumber();
        fn1.setDivisor(fnNum1.getDivisor()*fnNum2.getDivisor());
        fn1.setDividend(((fn1.getDivisor()/fnNum1.getDivisor())*fnNum1.getDividend())+((fn1.getDivisor()/fnNum2.getDivisor())*fnNum2.getDividend()));
        return fn1;
    }

    @Override
    public FractionNumber parseFractionNumber(String e){
        FractionNumber g = new com.sourceit.homework.hw05.FractionNumber();
        int index = e.indexOf("/");
        if(index<0){
            g.setDividend((Integer.valueOf(e)));
            g.setDivisor(com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE);
            return g;
        }

        String a1 = e.substring(0,index);
        Integer i = Integer.valueOf(a1);
        g.setDividend(i);
        a1 = e.substring(index + 1, e.length());
        i = Integer.valueOf(a1);
        g.setDivisor(i);
        return g;

    }


}
