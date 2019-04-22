package org.andestech.learning.rfb19.g4.gens;


import org.andestech.learning.rfb19.g4.except.Customer;
import org.andestech.learning.rfb19.g4.except.CustomerException;

public class AppGens {

    public static void main(String[] args) throws CustomerException
    {

        Data<String> st = new Data<>("KJHKJHKJH");

        st.printInfo();

        st.setT("123");

        Data<Integer> integerData = new Data<>(12334444);

        integerData.setT(3333);

        // int -> Integer
        // byte -> Byte
        // short -> Short
        // bool -> Boolean
        //.....
        // double -> Double


        Double d1 = 123.123;
        double d2 = d1;


        Data2<Double, Double> data2 = new Data2<>(12.22, 33.55);
        System.out.println(data2.sum());
        System.out.println(data2.sum2());

        //-----------------------------------
        Data2<Integer, Integer> data3 = new Data2<>(12, 33);
        System.out.println(data3.sum());
        System.out.println(data3.sum2());


        //----------------------------------------------------

        Data<Object> dataO = new Data<>( (Object)"AAAAA");

        dataO.printInfo();
        dataO.setT(11);

       // ------------------------------------------------------

        Data dataO2 = new Data<>( "AAAAA");

        dataO2.printInfo();
        dataO2.setT(222);
        dataO2.printInfo();

    //-------------------------------------

      new Data3().getData(new Object());
      new Data3().getData(new Customer(23,"qqqq","wwww"));


    }
}
