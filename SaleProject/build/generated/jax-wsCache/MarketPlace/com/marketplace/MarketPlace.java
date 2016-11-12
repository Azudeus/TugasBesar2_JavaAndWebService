
package com.marketplace;

import java.util.List;
import javax.jws.WebMethod;
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
     * @return
     *     returns java.util.List<com.marketplace.Product>
     */
    @WebMethod(operationName = "GetAllProduct")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAllProduct", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAllProduct")
    @ResponseWrapper(localName = "GetAllProductResponse", targetNamespace = "http://marketplace.com/", className = "com.marketplace.GetAllProductResponse")
    @Action(input = "http://marketplace.com/MarketPlace/GetAllProductRequest", output = "http://marketplace.com/MarketPlace/GetAllProductResponse")
    public List<Product> getAllProduct();

}
