package com.xworkz.checkedexcpetion.exetrnal;

import com.xworkz.checkedexcpetion.event.Checked;
import org.omg.CosNaming.NamingContextPackage.AlreadyBound;
import sun.security.util.PropertyExpander;

import javax.management.JMException;
import javax.naming.NamingException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.soap.SOAPException;
import javax.xml.xpath.XPathException;
import java.awt.*;
import java.awt.print.PrinterAbortException;
import java.io.IOException;
import java.lang.instrument.IllegalClassFormatException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.GeneralSecurityException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.acl.NotOwnerException;
import java.security.cert.CertificateEncodingException;
import java.util.concurrent.BrokenBarrierException;
import java.util.zip.DataFormatException;

public class CheckedRunner {
    public static void main(String[] args)throws AclNotFoundException, AlreadyBound, AWTException , XPathException,
            XMLSignatureException, SOAPException ,FontFormatException, PrinterAbortException, DataFormatException,
            GeneralSecurityException, JMException, LastOwnerException, IOException, BrokenBarrierException,
            JAXBException, DatatypeConfigurationException, CertificateEncodingException, KeySelectorException ,
            NamingException , NotBoundException, NotOwnerException,NotOwnerException, PropertyExpander.ExpandException,
            IllegalClassFormatException, MarshalException {
        Checked checked = new Checked();
        checked.aclnotFoundExcpetion();
        checked.alraduBoundExcpetion();
        checked.awaitExcption();
        checked.xml();
        checked.sopa();
        checked.fontformatiom();
        checked.printExcption();
        checked.dataformation();
        checked.Jmi();
        checked.lastOwner();
        checked.ioexcpetion();
        checked.broken();
        checked.jax();
        checked.data();
        checked.certficate();
        checked.certficate();
        checked.naming();
        checked.notbound();
        checked.notOwner();
        checked.notactive();
        checked.expand();
        checked.illigal();
        checked.marshal();
    }
}
