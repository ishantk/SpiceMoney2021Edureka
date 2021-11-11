/**
 * NewsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edureka.ws;

public class NewsServiceLocator extends org.apache.axis.client.Service implements co.edureka.ws.NewsService {

    public NewsServiceLocator() {
    }


    public NewsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NewsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for News
    private java.lang.String News_address = "http://localhost:8080/Session20A/services/News";

    public java.lang.String getNewsAddress() {
        return News_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NewsWSDDServiceName = "News";

    public java.lang.String getNewsWSDDServiceName() {
        return NewsWSDDServiceName;
    }

    public void setNewsWSDDServiceName(java.lang.String name) {
        NewsWSDDServiceName = name;
    }

    public co.edureka.ws.News getNews() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(News_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNews(endpoint);
    }

    public co.edureka.ws.News getNews(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.edureka.ws.NewsSoapBindingStub _stub = new co.edureka.ws.NewsSoapBindingStub(portAddress, this);
            _stub.setPortName(getNewsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNewsEndpointAddress(java.lang.String address) {
        News_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.edureka.ws.News.class.isAssignableFrom(serviceEndpointInterface)) {
                co.edureka.ws.NewsSoapBindingStub _stub = new co.edureka.ws.NewsSoapBindingStub(new java.net.URL(News_address), this);
                _stub.setPortName(getNewsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("News".equals(inputPortName)) {
            return getNews();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.edureka.co", "NewsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.edureka.co", "News"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("News".equals(portName)) {
            setNewsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
