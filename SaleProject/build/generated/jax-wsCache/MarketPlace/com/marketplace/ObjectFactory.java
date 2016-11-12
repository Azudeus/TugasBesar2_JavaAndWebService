
package com.marketplace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.marketplace package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllProduct_QNAME = new QName("http://marketplace.com/", "GetAllProduct");
    private final static QName _GetAllProductResponse_QNAME = new QName("http://marketplace.com/", "GetAllProductResponse");
    private final static QName _SearchProductWithAccount_QNAME = new QName("http://marketplace.com/", "SearchProductWithAccount");
    private final static QName _SearchProductWithAccountResponse_QNAME = new QName("http://marketplace.com/", "SearchProductWithAccountResponse");
    private final static QName _SearchProductWithProductName_QNAME = new QName("http://marketplace.com/", "SearchProductWithProductName");
    private final static QName _SearchProductWithProductNameResponse_QNAME = new QName("http://marketplace.com/", "SearchProductWithProductNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.marketplace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProduct }
     * 
     */
    public GetAllProduct createGetAllProduct() {
        return new GetAllProduct();
    }

    /**
     * Create an instance of {@link GetAllProductResponse }
     * 
     */
    public GetAllProductResponse createGetAllProductResponse() {
        return new GetAllProductResponse();
    }

    /**
     * Create an instance of {@link SearchProductWithAccount }
     * 
     */
    public SearchProductWithAccount createSearchProductWithAccount() {
        return new SearchProductWithAccount();
    }

    /**
     * Create an instance of {@link SearchProductWithAccountResponse }
     * 
     */
    public SearchProductWithAccountResponse createSearchProductWithAccountResponse() {
        return new SearchProductWithAccountResponse();
    }

    /**
     * Create an instance of {@link SearchProductWithProductName }
     * 
     */
    public SearchProductWithProductName createSearchProductWithProductName() {
        return new SearchProductWithProductName();
    }

    /**
     * Create an instance of {@link SearchProductWithProductNameResponse }
     * 
     */
    public SearchProductWithProductNameResponse createSearchProductWithProductNameResponse() {
        return new SearchProductWithProductNameResponse();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetAllProduct")
    public JAXBElement<GetAllProduct> createGetAllProduct(GetAllProduct value) {
        return new JAXBElement<GetAllProduct>(_GetAllProduct_QNAME, GetAllProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetAllProductResponse")
    public JAXBElement<GetAllProductResponse> createGetAllProductResponse(GetAllProductResponse value) {
        return new JAXBElement<GetAllProductResponse>(_GetAllProductResponse_QNAME, GetAllProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductWithAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "SearchProductWithAccount")
    public JAXBElement<SearchProductWithAccount> createSearchProductWithAccount(SearchProductWithAccount value) {
        return new JAXBElement<SearchProductWithAccount>(_SearchProductWithAccount_QNAME, SearchProductWithAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductWithAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "SearchProductWithAccountResponse")
    public JAXBElement<SearchProductWithAccountResponse> createSearchProductWithAccountResponse(SearchProductWithAccountResponse value) {
        return new JAXBElement<SearchProductWithAccountResponse>(_SearchProductWithAccountResponse_QNAME, SearchProductWithAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductWithProductName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "SearchProductWithProductName")
    public JAXBElement<SearchProductWithProductName> createSearchProductWithProductName(SearchProductWithProductName value) {
        return new JAXBElement<SearchProductWithProductName>(_SearchProductWithProductName_QNAME, SearchProductWithProductName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductWithProductNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "SearchProductWithProductNameResponse")
    public JAXBElement<SearchProductWithProductNameResponse> createSearchProductWithProductNameResponse(SearchProductWithProductNameResponse value) {
        return new JAXBElement<SearchProductWithProductNameResponse>(_SearchProductWithProductNameResponse_QNAME, SearchProductWithProductNameResponse.class, null, value);
    }

}
