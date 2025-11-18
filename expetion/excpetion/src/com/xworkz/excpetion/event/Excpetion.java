package com.xworkz.excpetion.event;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import javax.lang.model.type.MirroredTypeException;
import javax.management.JMRuntimeException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.NoSuchMechanismException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.reflect.MalformedParametersException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.security.ProviderException;
import java.time.DateTimeException;
import java.util.*;
import java.util.concurrent.CompletionException;
import java.util.concurrent.RejectedExecutionException;

public class Excpetion {
    public void annotationExcpetion() {
        throw new AnnotationTypeMismatchException(null,null);
    }
    public void  arithmeticExcption(){
        throw new ArithmeticException();
    }
    public void arraystoreExcption(){
        throw new ArrayStoreException();
    }
    public void bufferExcpetion(){
        throw new BufferOverflowException();
    }
    public void buffersExcpetion(){
        throw new BufferUnderflowException();
    }
    public  void cannotReadException(){
        throw  new CannotRedoException();
    }
    public  void cannotundoExcpetion(){
        throw new CannotUndoException();
    }
    public  void  classCastExcpetion(){
        throw  new ClassCastException();
    }
    public  void cmmExcpetion(){
        throw new CMMException("");
    }
    public  void completionExcpetion(){
        throw new CompletionException(null);
    }
    public  void concurrentModificationExcpetion(){
        throw new ConcurrentModificationException();
    }
    public  void  dataTimeExcpetion(){
        throw  new DateTimeException("");
    }
    public void  domExcpetion(){
        throw new DOMException((short)0,"");
    }
    public  void  emptyStackException(){
        throw  new EmptyStackException();
    }
    public void enumConstantPresentExcption(){
        throw new EnumConstantNotPresentException(Thread.State.class,"RUNNING");
    }
    public  void eventExcpetion(){
        throw new EventException((short)0,"");
    }
    public void fileSystemAlreadyExcpetion(){
        throw new FileSystemAlreadyExistsException();
    }
    public void fileSystemNotFoundExcpetion(){
        throw new FileSystemNotFoundException();
    }
    public void illegalargument(){
        throw new IllegalArgumentException();
    }
    public  void illegalPathStateException(){
        throw new IllegalPathStateException();
    }
    public  void illegarStateExcpetion(){
        throw new IllformedLocaleException();
    }
    public void illegalformedlocalExcpetion(){
        throw new IllformedLocaleException();
    }

    public void imagineOpExcpection(){
        throw new ImagingOpException("");
    }
      public void incompleteAnnotationExcpetion() {
          throw new IncompleteAnnotationException(Override.class, "");
      }
      public void indexOutOfBoundException(){
        throw new IndexOutOfBoundsException();
      }
      public void  jmRuntimeExcpetion(){
        throw new JMRuntimeException();
      }
    public void lsException(){
        throw new LSException((short) 0,"null");
    }
    public void malformedParameterizedTypeException(){
        throw new MalformedParametersException();
    }
    public void malformedParametersException(){
        throw new MalformedParametersException();
    }
    public void mirroredTypesException(){
        throw new MirroredTypeException(null);
    }
    public void mirroredTypeException(){
        throw new MirroredTypeException(null);
    }
    public void missingResourceException(){
        throw new MissingResourceException("","","");
    }
    public void negativeArraySizeException(){
        throw new NegativeArraySizeException();
    }
    public void noSuchElementException(){
        throw new NoSuchElementException();

    }
    public void noSuchMechanismException(){
        throw new NoSuchMechanismException();

    }
    public void nullPointerException(){
        throw new NullPointerException();
    }
    public void profileDataException(){
        throw new ProfileDataException("");
    }
    public void providerException(){
        throw new ProviderException();

    }
    public void providerNotFoundException(){
        throw new ProviderNotFoundException();

    }
    public void rasterFormatException(){
        throw new RasterFormatException("");

    }
    public void rejectedExecutionException(){
        throw new RejectedExecutionException();

    }
    public void securityException(){
        throw new SecurityException();
    }
    //    public void systemException(){
//        throw new SystemException();
//    }
    public void typeConstraintException(){
        throw new TypeConstraintException("");
    }
    public void typeNotPresentException(){
        throw new TypeNotPresentException("", null);

    }
    public void uncheckedIOException(){
        throw new UncheckedIOException(new IOException());
    }

    public void undeclaredThrowableException(){
        throw new UndeclaredThrowableException(null);
    }
}
