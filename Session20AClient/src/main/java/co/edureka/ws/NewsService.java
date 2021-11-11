/**
 * NewsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.ws;

public interface NewsService extends javax.xml.rpc.Service {
    public java.lang.String getNewsAddress();

    public co.edureka.ws.News getNews() throws javax.xml.rpc.ServiceException;

    public co.edureka.ws.News getNews(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
