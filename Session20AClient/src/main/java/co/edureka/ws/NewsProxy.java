package co.edureka.ws;

public class NewsProxy implements co.edureka.ws.News {
  private String _endpoint = null;
  private co.edureka.ws.News news = null;
  
  public NewsProxy() {
    _initNewsProxy();
  }
  
  public NewsProxy(String endpoint) {
    _endpoint = endpoint;
    _initNewsProxy();
  }
  
  private void _initNewsProxy() {
    try {
      news = (new co.edureka.ws.NewsServiceLocator()).getNews();
      if (news != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)news)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)news)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (news != null)
      ((javax.xml.rpc.Stub)news)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edureka.ws.News getNews() {
    if (news == null)
      _initNewsProxy();
    return news;
  }
  
  public java.lang.String getNews(java.lang.String city) throws java.rmi.RemoteException{
    if (news == null)
      _initNewsProxy();
    return news.getNews(city);
  }
  
  public int getRate(java.lang.String digitalCurrency) throws java.rmi.RemoteException{
    if (news == null)
      _initNewsProxy();
    return news.getRate(digitalCurrency);
  }
  
  
}