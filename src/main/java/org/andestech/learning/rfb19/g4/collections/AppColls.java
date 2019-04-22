package org.andestech.learning.rfb19.g4.collections;

import org.andestech.learning.rfb19.g4.except.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppColls {

    public static void main(String[] args)
    {
        Customer[] customers = new Customer[20];

        List<String> list = new ArrayList<>(10);

        list.add("111");
        list.add("2AAA");
        list.add("GHGHG");
        list.add("UUUU");
        list.add("333");
        list.add("2AAA");

        list.remove("2AAA");
        System.out.println(list.size());

        //1
        for(String st: list){
            System.out.println(st);
        }

        //2
        System.out.println("------------------------------------------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //3
        System.out.println("------------------------------------------------");
        list.forEach( t-> System.out.println(t));

        //4
        System.out.println("------------------------------------------------");
        for(int i=0; i<list.size(); i++) System.out.println(list.get(i));


        //System.out.println(list.);




    }
}
