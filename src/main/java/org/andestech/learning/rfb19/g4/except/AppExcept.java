package org.andestech.learning.rfb19.g4.except;



public class AppExcept
{

    private static void try1(){
    try{
        Class.forName("org.andestech.learning.rfb19.g4.except.ABC");}
    catch (ClassNotFoundException ex){

        ex.printStackTrace();

    }
}

    private static void try2() throws ClassNotFoundException{
        Class.forName("ABC");
    }



    public static void main( String[] args ) throws ClassNotFoundException,LibraryException {


     try1();


   //  try2();


      Library library = new Library();

      library.addBook(new Book("AAAA","BBB",1942));


    //  library.addBook(new Book("AAAA","BBB",1942));


    // customer

    Customer customer = null;

    try {
        customer = new Customer(250, "J", "Thomson");
    }
    catch (CustomerException ex)
    {
        ex.printStackTrace();
    }

        System.out.println(customer);


    }
}
