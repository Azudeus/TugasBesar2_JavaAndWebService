<%-- 
    Document   : header
    Created on : Nov 11, 2016, 8:06:43 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="style.css">
<html>
    <h1 id = "title"><span id="sale">Sale</span><span id="project">Project</span></h1>

    <h2 id = "hellouser">Hi, asd !</h2>
    <h2 id = "logout"><a href = "login.php" class = "redlink">logout</a></h3><br>  
    <table width = "100%" id = 'catalog'>
        <tr>
            <td class = 'nobg'>
                <a href=catalog.jsp> CATALOG </a>
            </td>
            <td class = 'nobg'>
                <a href=your_product.jsp> YOUR PRODUCT </a>
            </td>
            <td class = 'nobg'>
                <a href=add_product.jsp> ADD PRODUCT </a>
            <td class = 'nobg'>
                <a href=sales.jsp> SALES </a>
            </td>
            <td class = 'nobg'>
                <a href=purchases.jsp> PURCHASES </a>
            </td>
        </tr>
    </table>
</html>
