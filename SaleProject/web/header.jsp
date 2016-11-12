<%-- 
    Document   : header
    Created on : Nov 11, 2016, 8:06:43 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
table, td, th {
    border: 1px solid black;
}

table {
    border-collapse: collapse;
    width: 100%;
}

td {
    text-align: center;
}

h1{
    text-align: center;
}
</style>

<html>
    <h1>SaleProject</h1>
    <table width = "100%">
        <tr>
            <td>
                <a href=catalog.jsp> CATALOG </a>
            </td>
            <td>
                <a href=your_product.jsp> YOUR PRODUCT </a>
            </td>
            <td>
                <a href=add_product.jsp> ADD PRODUCT </a>
            </td>
            <td>
                <a href=sales.jsp> SALES </a>
            </td>
            <td>
                <a href=purchases.jsp> PURCHASES </a>
            </td>
        </tr>
    </table>
</html>
