
package com.marketplace;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MarketPlace", targetNamespace = "http://marketplace.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MarketPlace {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.marketplace.Product
     */
    @WebMethod(operationName = "SearchProductWithProductId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchProductWithProductId", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductWithProductId")
    @ResponseWrapper(localName = "SearchProductWithProductIdResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductWithProductIdResponse")
    @Action(input = "http://marketplace.com/MarketPlace/SearchProductWithProductIdRequest", output = "http://marketplace.com/MarketPlace/SearchProductWithProductIdResponse")
    public Product searchProductWithProductId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.marketplace.Product>
     */
    @WebMethod(operationName = "SearchProductWithAccount")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchProductWithAccount", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductWithAccount")
    @ResponseWrapper(localName = "SearchProductWithAccountResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductWithAccountResponse")
    @Action(input = "http://marketplace.com/MarketPlace/SearchProductWithAccountRequest", output = "http://marketplace.com/MarketPlace/SearchProductWithAccountResponse")
    public List<Product> searchProductWithAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.marketplace.Purchases>
     */
    @WebMethod(operationName = "GetPurchaseByName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetPurchaseByName", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetPurchaseByName")
    @ResponseWrapper(localName = "GetPurchaseByNameResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetPurchaseByNameResponse")
    @Action(input = "http://marketplace.com/MarketPlace/GetPurchaseByNameRequest", output = "http://marketplace.com/MarketPlace/GetPurchaseByNameResponse")
    public List<Purchases> getPurchaseByName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.marketplace.Account
     */
    @WebMethod(operationName = "GetAccWithAccountId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAccWithAccountId", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAccWithAccountId")
    @ResponseWrapper(localName = "GetAccWithAccountIdResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAccWithAccountIdResponse")
    @Action(input = "http://marketplace.com/MarketPlace/GetAccWithAccountIdRequest", output = "http://marketplace.com/MarketPlace/GetAccWithAccountIdResponse")
    public Account getAccWithAccountId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.marketplace.Product>
     */
    @WebMethod(operationName = "SearchProductWithProductName")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "SearchProductWithProductName", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductWithProductName")
    @ResponseWrapper(localName = "SearchProductWithProductNameResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.SearchProductWithProductNameResponse")
    @Action(input = "http://marketplace.com/MarketPlace/SearchProductWithProductNameRequest", output = "http://marketplace.com/MarketPlace/SearchProductWithProductNameResponse")
    public List<Product> searchProductWithProductName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.marketplace.Product>
     */
    @WebMethod(operationName = "GetAllProduct")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAllProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAllProduct")
    @ResponseWrapper(localName = "GetAllProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAllProductResponse")
    @Action(input = "http://marketplace.com/MarketPlace/GetAllProductRequest", output = "http://marketplace.com/MarketPlace/GetAllProductResponse")
    public List<Product> getAllProduct();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "CheckLike")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "CheckLike", targetNamespace = "http://marketplace.com/", className = "com.marketplace.CheckLike")
    @ResponseWrapper(localName = "CheckLikeResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.CheckLikeResponse")
    @Action(input = "http://marketplace.com/MarketPlace/CheckLikeRequest", output = "http://marketplace.com/MarketPlace/CheckLikeResponse")
    public int checkLike(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DelLike")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DelLike", targetNamespace = "http://marketplace.com/", className = "com.marketplace.DelLike")
    @ResponseWrapper(localName = "DelLikeResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.DelLikeResponse")
    @Action(input = "http://marketplace.com/MarketPlace/DelLikeRequest", output = "http://marketplace.com/MarketPlace/DelLikeResponse")
    public int delLike(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "AddLike")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddLike", targetNamespace = "http://marketplace.com/", className = "com.marketplace.AddLike")
    @ResponseWrapper(localName = "AddLikeResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.AddLikeResponse")
    @Action(input = "http://marketplace.com/MarketPlace/AddLikeRequest", output = "http://marketplace.com/MarketPlace/AddLikeResponse")
    public int addLike(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg7
     * @param arg6
     * @param arg9
     * @param arg8
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg13
     * @param arg1
     * @param arg0
     * @param arg10
     * @param arg11
     * @param arg12
     * @return
     *     returns int
     */
    @WebMethod(operationName = "AddPurchase")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddPurchase", targetNamespace = "http://marketplace.com/", className = "com.marketplace.AddPurchase")
    @ResponseWrapper(localName = "AddPurchaseResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.AddPurchaseResponse")
    @Action(input = "http://marketplace.com/MarketPlace/AddPurchaseRequest", output = "http://marketplace.com/MarketPlace/AddPurchaseResponse")
    public int addPurchase(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        String arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        String arg9,
        @WebParam(name = "arg10", targetNamespace = "")
        String arg10,
        @WebParam(name = "arg11", targetNamespace = "")
        String arg11,
        @WebParam(name = "arg12", targetNamespace = "")
        String arg12,
        @WebParam(name = "arg13", targetNamespace = "")
        String arg13);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.marketplace.Purchases>
     */
    @WebMethod(operationName = "GetPurchase")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetPurchase", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetPurchase")
    @ResponseWrapper(localName = "GetPurchaseResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetPurchaseResponse")
    @Action(input = "http://marketplace.com/MarketPlace/GetPurchaseRequest", output = "http://marketplace.com/MarketPlace/GetPurchaseResponse")
    public List<Purchases> getPurchase(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "EditProduct")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EditProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.EditProduct")
    @ResponseWrapper(localName = "EditProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.EditProductResponse")
    @Action(input = "http://marketplace.com/MarketPlace/EditProductRequest", output = "http://marketplace.com/MarketPlace/EditProductResponse")
    public int editProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "AddProduct")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "AddProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.AddProduct")
    @ResponseWrapper(localName = "AddProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.AddProductResponse")
    @Action(input = "http://marketplace.com/MarketPlace/AddProductRequest", output = "http://marketplace.com/MarketPlace/AddProductResponse")
    public int addProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(operationName = "DelProduct")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DelProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.DelProduct")
    @ResponseWrapper(localName = "DelProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.DelProductResponse")
    @Action(input = "http://marketplace.com/MarketPlace/DelProductRequest", output = "http://marketplace.com/MarketPlace/DelProductResponse")
    public int delProduct(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
