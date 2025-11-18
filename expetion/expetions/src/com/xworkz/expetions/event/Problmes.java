package com.xworkz.expetions.event;

import com.sun.deploy.net.DownloadException;
import org.w3c.dom.DOMException;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;

public class Problmes {

    public void excption1() {
        throw new ArithmeticException();
    }

    public void excption2() {
        throw new NullPointerException();
    }

    public void excption3() {
        throw new BufferUnderflowException();
    }

    public void excption4() {
        throw new BufferOverflowException();

    }

    public void excption5() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public void excption6() {
        throw new ArrayStoreException();
    }

    public  void excption7(){
      

    }
}
