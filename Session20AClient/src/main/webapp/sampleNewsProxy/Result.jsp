<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleNewsProxyid" scope="session" class="co.edureka.ws.NewsProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleNewsProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleNewsProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleNewsProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        co.edureka.ws.News getNews10mtemp = sampleNewsProxyid.getNews();
if(getNews10mtemp == null){
%>
<%=getNews10mtemp %>
<%
}else{
        if(getNews10mtemp!= null){
        String tempreturnp11 = getNews10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String city_1id=  request.getParameter("city16");
            java.lang.String city_1idTemp = null;
        if(!city_1id.equals("")){
         city_1idTemp  = city_1id;
        }
        java.lang.String getNews13mtemp = sampleNewsProxyid.getNews(city_1idTemp);
if(getNews13mtemp == null){
%>
<%=getNews13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getNews13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String digitalCurrency_2id=  request.getParameter("digitalCurrency21");
            java.lang.String digitalCurrency_2idTemp = null;
        if(!digitalCurrency_2id.equals("")){
         digitalCurrency_2idTemp  = digitalCurrency_2id;
        }
        int getRate18mtemp = sampleNewsProxyid.getRate(digitalCurrency_2idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getRate18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>