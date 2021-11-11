/**
 * News.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.ws;

public interface News extends java.rmi.Remote {
    public java.lang.String getNews(java.lang.String city) throws java.rmi.RemoteException;
    public int getRate(java.lang.String digitalCurrency) throws java.rmi.RemoteException;
}
