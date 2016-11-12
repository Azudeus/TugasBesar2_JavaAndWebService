/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketplace;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import com.marketplace.product;
import java.sql.*;
import java.util.*;

/**
 *
 * @author user
 */
@WebService(serviceName = "MarketPlace")
public class MarketPlace {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetAllProduct")
    public List<product> GetAllProduct() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "SaleProject";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
        List<product> allProduct = new ArrayList<product>();
        
            try {
              Class.forName(driver).newInstance();
              conn = DriverManager.getConnection(url+dbName,userName,password);
              System.out.println("Connected to the database");
              Statement stmt=conn.createStatement();  
              ResultSet rs=stmt.executeQuery("select * from product");
          
              while(rs.next()){
                product temp = new product();
                temp.product_id =rs.getInt("product_id");
                 System.out.println(temp.product_id);
                temp.product_name = rs.getString("product_name");
                temp.username = rs.getString("username");
                temp.product_description = rs.getString("product_description");
                temp.product_price = rs.getDouble("product_price");
                temp.likes=rs.getInt("likes");
                temp.purchase = rs.getInt("purchase");
                temp.product_datetime = rs.getInt("product_datetime");
                temp.imgsrc = rs.getString("imgsrc");
                allProduct.add(temp);      
              } 
              conn.close();
              return allProduct;
            } catch (Exception e) {
                System.out.println(e);
                
                
            }
            return null;
    }
    
    
}