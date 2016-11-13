<%-- 
    Document   : confirmbuy
    Created on : Nov 12, 2016, 7:30:54 PM
    Author     : user
--%>

<%@page import="com.marketplace.Account"%>
<%@page import="com.marketplace.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="script/buy.js"></script>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>  
        
            <%-- start web service invocation --%><hr/>
    <%
    int accountId = Integer.parseInt(request.getParameter("account_id"));
    int productId = Integer.parseInt(request.getParameter("product_id"));
    Product currentProduct = null;
    Account currentAccount = null;
    
    
    try {
	com.marketplace.MarketPlace_Service service = new com.marketplace.MarketPlace_Service();
	com.marketplace.MarketPlace port = service.getMarketPlacePort();

	// TODO process result here
	currentProduct = port.searchProductWithProductId(productId);
        currentAccount = port.getAccWithAccountId(accountId);

    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>



<p id = "SubHeader">Please confirm your purchase</p>
<hr>
<br>
    <form action="confirmbuy_action.jsp" method="post" class = "inline" onsubmit ="return buyVerification()">
    <pre><div class = 'font20 lineheight15'>
    Product		: <% out.println(currentProduct.getProductName());%><br>
    Price                   : <span id="price"></span><br><script>writePriceConfirm(<% out.println(currentProduct.getProductPrice());%>)</script>
    Quantity		: <input name="quantity" price =<% out.println(currentProduct.getProductPrice());%> type = "text" onkeyup ="buy(this)" class = "quantity" required> pcs<br>
    Total Price           : <span class = "total_price"> Please insert Quantity</span>	<br>
    Deliver to		:
    </div>
    </pre>
    <div class = 'font18'>
    Consignee<br>
    <input name="consignee" type="text" required class = "width100" value = "<%out.println(currentAccount.getName());%>">
    <br><br>
    Full Address<br>
    <input name="full_address" type="text" required class = "tworow width100" value = "<%out.println(currentAccount.getAddress());%>" >
    <br><br>
    Postal Code<br>
    <input name="postal_code" type="text" required class = "width100" value = "<%out.println(currentAccount.getPostal());%>">
    <br><br>
    Phone Number<br>
    <input name="phone_number" type="text" required class = "width100" value = "<%out.println(currentAccount.getNumber());%>">
    <br><br>
    12 Digits Credit Card Number
    <input name="credit_number" type="text" required class = "width100">
    <br><br>
    3 Digits Card Verification Value
    <input name="credit_veri" type="text" required class = "width100">
    <input name="account_id" type="hidden" value = "<%out.println(accountId);%>" >
    <input name="product_id" type="hidden" value = "<%out.println(productId);%>" >

    <br><br>
    <div class = "right">
    <br>
    <input type = "submit" value="Submit" class = "button" >
    <a href="catalog.php" class = "button"> Cancel </a></div>
    </form>
</body>
</html>
