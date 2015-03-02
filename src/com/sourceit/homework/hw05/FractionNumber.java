package com.sourceit.homework.hw05;

/**
 * Created by Still on 01.03.2015.
 */
public class FractionNumber implements com.sourceit.hometask.basic.FractionNumber{

    int dividend;
    int divisor = com.sourceit.hometask.basic.FractionNumber.DEFAULT_DIVISOR_VALUE;

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    @Override
    public double doubleValue(){
        return (double)dividend/divisor;
    }

    @Override
    public int compareTo(com.sourceit.hometask.basic.FractionNumber q){

        if (doubleValue()>q.doubleValue()){
            return 1;
        }
        if (doubleValue()==q.doubleValue()){
            return 0;
        }
        if (doubleValue()<q.doubleValue()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        String w =getDividend()+ " / " +getDivisor();
        return w;
    }




}
