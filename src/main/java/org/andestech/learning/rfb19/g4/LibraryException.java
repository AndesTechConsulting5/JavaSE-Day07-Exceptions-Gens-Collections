package org.andestech.learning.rfb19.g4;

import java.util.logging.Logger;

public class LibraryException extends Exception {

    Logger logger;

    public LibraryException(){
        super();
    }

    public LibraryException(String m, int level)
    {super(m);

     logger = Logger.getLogger("mylog");

    }

    public LibraryException(String m)
    {this(m,0);

    }

}
