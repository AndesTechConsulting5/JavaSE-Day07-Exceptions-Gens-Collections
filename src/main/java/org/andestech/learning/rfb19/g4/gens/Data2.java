package org.andestech.learning.rfb19.g4.gens;

public class Data2<T extends Number,V extends Number > {

    private T t;
    private V v;

    public Data2(T t, V v) {
        this.t = t;
        this.v = v;
       // T tt = new T();
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void printInfo(){
        System.out.println(t.getClass().getName());

    }

    public double sum() { return  t.doubleValue() + v.doubleValue(); }

    public Number sum2() { return   t.doubleValue() + v.doubleValue(); }



}
