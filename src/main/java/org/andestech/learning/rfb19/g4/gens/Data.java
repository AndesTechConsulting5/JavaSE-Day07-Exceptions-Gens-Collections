package org.andestech.learning.rfb19.g4.gens;

public class Data<T> {

    private T t;

    public Data(T t) {
        this.t = t;
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
}
