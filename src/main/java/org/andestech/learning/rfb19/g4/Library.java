package org.andestech.learning.rfb19.g4;




public class Library {

    static private final int MAX_BOOKS = 100000;

    static private int counter = 99998;

    //...
    //...

    public void addBook(Book book) throws LibraryException
    {

        if(++counter >= MAX_BOOKS) {
            GlobalFlags.libOverflow = true;
            throw new LibraryException("Max books error: " + counter);
        }
        //...
        //...
    }


}
