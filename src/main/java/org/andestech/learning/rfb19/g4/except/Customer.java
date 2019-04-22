package org.andestech.learning.rfb19.g4.except;

public class Customer {

    private static final int MAX_AGE = 110, MIN_AGE=14;

    private int age;
    private String sname, name;


    private static void checkCustomer(int age) throws CustomerException
    {
        if(age < MIN_AGE || age > MAX_AGE){
//            CustomerException customerException =
//                    new CustomerException("Age exception, try to set age=" + age);
//            throw  customerException;

        throw new CustomerException("Age exception, try to set age=" + age);}
    }

   // check
    public Customer(int age, String sname, String name) throws CustomerException{

        this.sname = sname;
        this.name = name;

        checkCustomer(age);
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws CustomerException{
        checkCustomer(age);
        this.age = age;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
