<%-- 
    Document   : likes
    Created on : Nov 13, 2016, 2:33:53 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        <%
        int accountId = Integer.parseInt(request.getParameter("account_id"));
        int productId = Integer.parseInt(request.getParameter("product_id"));
        String type = request.getParameter("type");
//        out.println("account id = " +accountId);
//        out.println("product_id = "+productId);
//        out.println("type = " + type);
        com.marketplace.MarketPlace_Service service = new com.marketplace.MarketPlace_Service();
        com.marketplace.MarketPlace port = service.getMarketPlacePort();
        if(type.equals("add")){
            
            int result = port.addLike(productId,accountId);
        }
        else{
        
            int result = port.delLike(productId,accountId);
        
        }
 
        %>

        
      <% response.sendRedirect("catalog.jsp"); %>

    </body>
</html>
