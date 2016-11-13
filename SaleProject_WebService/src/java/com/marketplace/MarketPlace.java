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

    private Connection conn;
    private String url;
    private String dbName;
    private String driver;
    private String userName;
    private String password;
    private List<product> allProduct;
    
    private void initialize(String password){
        conn = null;
        url = "jdbc:mysql://localhost:3306/";
        dbName = "SaleProject";
        driver = "com.mysql.jdbc.Driver";
        userName = "root";
        this.password = password;
        allProduct = new ArrayList<product>();
    }
    
    private void initialize(String username, String password){
        conn = null;
        url = "jdbc:mysql://localhost:3306/";
        dbName = "SaleProject";
        driver = "com.mysql.jdbc.Driver";
        userName = userName;
        this.password = password;
        allProduct = new ArrayList<product>();
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "GetAllProduct")
    public List<product> GetAllProduct() {
            initialize("");
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
    
     public List<product> SearchProductWithAccount(String username){
            initialize("");
            try {
              Class.forName(driver).newInstance();
              conn = DriverManager.getConnection(url+dbName,userName,password);
              System.out.println("Connected to the database");
              Statement stmt=conn.createStatement();  
              ResultSet rs=stmt.executeQuery("select * from product where username like '%" + username + "%';");
          
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
     
      public List<product> SearchProductWithProductName(String productname){
            initialize("");
            try {
              Class.forName(driver).newInstance();
              conn = DriverManager.getConnection(url+dbName,userName,password);
              System.out.println("Connected to the database");
              Statement stmt=conn.createStatement();  
              ResultSet rs=stmt.executeQuery("select * from product where product_name like '%" + productname + "%';");
          
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
    private boolean validateToken(int accessToken, account a){
        //Untuk accessToken yang diberikan, cek kevalidan accessToken melalui identity service
        if(false/*fail*/){
            return false;
        }
        return true;
    }  
      
     /**
     * 
     * @param p
     * @return 
     */
    @WebMethod(operationName = "AddProd")
    public int AddProduct(int accessToken, account a, product p){
        //Untuk accessToken yang diberikan, cek kevalidan accessToken melalui identity service
        if(!validateToken(accessToken, a)){
            return 0;
        }
        else{
            //Copy product
            //Tambahkan produk ke dalam database
            try{
                conn = DriverManager.getConnection(url+dbName,userName,password);
                System.out.println("Connected to the database");
                Statement stmt=conn.createStatement();  
                ResultSet rs=stmt.executeQuery("INSERT INTO product "
                        + "VALUES ("+p.product_id+","
                                +p.product_name+","
                                +p.username+","
                                +p.product_description+","
                                +p.product_price+","
                                +p.likes+","
                                +p.purchase+","
                                +p.product_datetime+","
                                +p.imgsrc+")");
            }
            catch(Exception e){
                System.out.println(e);
            }
            return 1;
        }
    } 
    
    /***
     * 
     * @param p
     * @return 
     */
    @WebMethod(operationName = "DelProd")
    public int DeleteProduct(int accessToken, account a, product p){
        //Untuk accessToken yang diberikan, cek kevalidan accessToken melalui identity service
        if(!validateToken(accessToken, a)){
            return 0;
        }
        else{
            //Copy product
            //Delete produk ke dalam database
            try{
                conn = DriverManager.getConnection(url+dbName,userName,password);
                System.out.println("Connected to the database");
                Statement stmt=conn.createStatement();  
                ResultSet rs=stmt.executeQuery("DELETE FROM product "
                        + "WHERE product_id = "+p.product_id+"");
            }
            catch(Exception e){
                System.out.println(e);
            }
            return 1;
        }
    }
    
    /**
     * 
     * @param p
     * @return 
     */
    @WebMethod(operationName = "EditProd")
    public int EditProduct(int accessToken, account a, product p, 
            String newDesc, String newPrice){
        //Untuk accessToken yang diberikan, cek kevalidan accessToken melalui identity service
        if(!validateToken(accessToken, a)){
            return 0;
        }
        else{
            //Copy product
            //Tambahkan produk ke dalam database
            try{
                conn = DriverManager.getConnection(url+dbName,userName,password);
                System.out.println("Connected to the database");
                Statement stmt=conn.createStatement();  
                ResultSet rs=stmt.executeQuery("UPDATE product "
                        + "SET product_description = "
                                +newDesc+", product_price = "
                                +newPrice+""
                        + "WHERE product_id = "+p.product_id+")");
            }
            catch(Exception e){
                System.out.println(e);
            }
            return 1;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CheckLike")
    public int CheckLike(int productId, int accountId) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "SaleProject";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";

        
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connected to the database");
            Statement stmt=conn.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT EXISTS(SELECT * FROM likes where product_id ="+ productId +" and account_id =" + accountId + ") as exist;");
            while(rs.next()){
                return rs.getInt("exist");
            }
            
            

        } catch (Exception e){
            
            
        }
        
        //TODO write your implementation code here:
        return -1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AddLike")
    public int AddLike(int productId ,int accountId ) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "SaleProject";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
              
         try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connected to the database");
            Statement stmt=conn.createStatement();  
         
            int rs=stmt.executeUpdate("UPDATE product SET likes = likes + 1 WHERE product_id =" + productId +";");
            
            rs=stmt.executeUpdate("INSERT INTO likes(product_id, account_id) VALUES ("+ productId + ","+ accountId + ");");
            return 1;
            

        } catch (Exception e){
            return 0;
            
        }
        
    }
    @WebMethod(operationName = "DelLike")
    public int DelLike(int productId ,int accountId ) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "SaleProject";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "";
              
         try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url+dbName,userName,password);
            System.out.println("Connected to the database");
            Statement stmt=conn.createStatement();  
           
            int rs=stmt.executeUpdate("UPDATE product SET likes = likes - 1 WHERE product_id =" + productId +";");
            
            rs=stmt.executeUpdate("DELETE FROM likes where product_id = "+ productId + " and account_id = "+ accountId + ";");
            return 1;
            

        } catch (Exception e){
            return 0;
            
        }
        
    }
}
