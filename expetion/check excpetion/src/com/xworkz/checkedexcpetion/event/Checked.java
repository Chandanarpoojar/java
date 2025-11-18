package com.xworkz.checkedexcpetion.event;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.UserException;
import org.omg.CosNaming.NamingContextPackage.AlreadyBound;
import sun.security.util.PropertyExpander;

import javax.management.BadBinaryOpValueExpException;
import javax.management.JMException;
import javax.naming.NamingException;
import javax.script.ScriptException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.xpath.XPathException;
import java.awt.*;
import java.awt.print.PrinterAbortException;
import java.io.IOException;
import java.io.NotActiveException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.InvocationTargetException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateEncodingException;
import java.text.ParseException;
import java.util.concurrent.BrokenBarrierException;
import java.util.zip.DataFormatException;

public class Checked {
    public void aclnotFoundExcpetion() throws AclNotFoundException {
        throw new AclNotFoundException();
    }

    public void alraduBoundExcpetion() throws AlreadyBound {
        throw new AlreadyBound();
    }

    public void awaitExcption() throws AWTException {
        throw new AWTException("");
    }

    public void xml() throws XMLSignatureException {
        throw new XMLSignatureException();
    }

    public void sopa() throws SOAPException {
        throw new SOAPException("");
    }
    public void fontformatiom() throws FontFormatException {
        throw new FontFormatException("");
    }

    public void printExcption() throws PrinterAbortException {
        throw new PrinterAbortException("");
    }
    public void dataformation()throws DataFormatException{
        throw new DataFormatException();
    }
    public void genralsecurity()throws GeneralSecurityException{
        throw new GeneralSecurityException();
    }
    public void Jmi()throws JMException {
        throw new JMException();
    }
    public void lastOwner()throws LastOwnerException{
        throw new LastOwnerException();
    }
    public void ioexcpetion()throws IOException{
        throw new IOException();
    }
    public void broken()throws BrokenBarrierException{
        throw new BrokenBarrierException();
    }
    public void jax()throws JAXBException{
        throw new JAXBException("");

    }
    public void data()throws DatatypeConfigurationException{
        throw new DatatypeConfigurationException();
    }
    public void certficate()throws CertificateEncodingException{
        throw new CertificateEncodingException();

    }
    public void key()throws KeySelectorException{
        throw new KeySelectorException();
    }
    public void naming()throws NamingException{
        throw new NamingException();
    }
    public void notbound()throws NotBoundException{
        throw new NotBoundException();
    }
    public void notOwner()throws NotOwnerException{
        throw new NotOwnerException();
    }
  public void notactive()throws NotActiveException{
        throw new NotActiveException();
  }
  public void expand()throws PropertyExpander.ExpandException{
        throw new PropertyExpander.ExpandException("");
  }
  public void illigal()throws IllegalClassFormatException{
        throw new IllegalClassFormatException();
  }
  public void marshal()throws MarshalException{
        throw new MarshalException("");
  }


}


















