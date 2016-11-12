<%-- 
    Document   : catalog
    Created on : Nov 11, 2016, 7:54:13 AM
    Author     : user
--%>

<%@page import="com.marketplace.Product"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>
        <%@include file="header.jsp" %>   
        <%-- set variable --%>
        <%
            List<Product> Products;
        %>
        
        
         <%-- start web service invocation --%><hr/>
         <%
         try {
             com.marketplace.MarketPlace_Service service = new com.marketplace.MarketPlace_Service();
             com.marketplace.MarketPlace port = service.getMarketPlacePort();
             // TODO process result here
             Products = port.getAllProduct();

         } catch (Exception ex) {
             throw new RuntimeException("Error condition!!!");
         }
         %>
         <%-- end web service invocation --%><hr/>
 
        
        <% 
              for(int i = 0; i < Products.size(); i++){
                 Product temp = Products.get(i);
                 out.println(temp.getProductId() + "<br>");
                 out.println(temp.getProductName() + "<br>");
                 out.println(temp.getProductDescription() + "<br>");
                 out.println("<br>");
             }
        %>
        
        
        
        
    </body>
</html>
