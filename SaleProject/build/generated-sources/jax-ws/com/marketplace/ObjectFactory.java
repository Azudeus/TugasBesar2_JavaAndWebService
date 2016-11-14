
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

    private final static QName _AddLike_QNAME = new QName("http://marketplace.com/", "AddLike");
    private final static QName _AddLikeResponse_QNAME = new QName("http://marketplace.com/", "AddLikeResponse");
    private final static QName _AddProduct_QNAME = new QName("http://marketplace.com/", "AddProduct");
    private final static QName _AddProductResponse_QNAME = new QName("http://marketplace.com/", "AddProductResponse");
    private final static QName _AddPurchase_QNAME = new QName("http://marketplace.com/", "AddPurchase");
    private final static QName _AddPurchaseResponse_QNAME = new QName("http://marketplace.com/", "AddPurchaseResponse");
    private final static QName _CheckLike_QNAME = new QName("http://marketplace.com/", "CheckLike");
    private final static QName _CheckLikeResponse_QNAME = new QName("http://marketplace.com/", "CheckLikeResponse");
    private final static QName _DelLike_QNAME = new QName("http://marketplace.com/", "DelLike");
    private final static QName _DelLikeResponse_QNAME = new QName("http://marketplace.com/", "DelLikeResponse");
    private final static QName _DelProduct_QNAME = new QName("http://marketplace.com/", "DelProduct");
    private final static QName _DelProductResponse_QNAME = new QName("http://marketplace.com/", "DelProductResponse");
    private final static QName _EditProduct_QNAME = new QName("http://marketplace.com/", "EditProduct");
    private final static QName _EditProductResponse_QNAME = new QName("http://marketplace.com/", "EditProductResponse");
    private final static QName _GetAccWithAccountId_QNAME = new QName("http://marketplace.com/", "GetAccWithAccountId");
    private final static QName _GetAccWithAccountIdResponse_QNAME = new QName("http://marketplace.com/", "GetAccWithAccountIdResponse");
    private final static QName _GetAllProduct_QNAME = new QName("http://marketplace.com/", "GetAllProduct");
    private final static QName _GetAllProductResponse_QNAME = new QName("http://marketplace.com/", "GetAllProductResponse");
    private final static QName _GetPurchase_QNAME = new QName("http://marketplace.com/", "GetPurchase");
    private final static QName _GetPurchaseByName_QNAME = new QName("http://marketplace.com/", "GetPurchaseByName");
    private final static QName _GetPurchaseByNameResponse_QNAME = new QName("http://marketplace.com/", "GetPurchaseByNameResponse");
    private final static QName _GetPurchaseResponse_QNAME = new QName("http://marketplace.com/", "GetPurchaseResponse");
    private final static QName _SearchProductWithAccount_QNAME = new QName("http://marketplace.com/", "SearchProductWithAccount");
    private final static QName _SearchProductWithAccountResponse_QNAME = new QName("http://marketplace.com/", "SearchProductWithAccountResponse");
    private final static QName _SearchProductWithProductId_QNAME = new QName("http://marketplace.com/", "SearchProductWithProductId");
    private final static QName _SearchProductWithProductIdResponse_QNAME = new QName("http://marketplace.com/", "SearchProductWithProductIdResponse");
    private final static QName _SearchProductWithProductName_QNAME = new QName("http://marketplace.com/", "SearchProductWithProductName");
    private final static QName _SearchProductWithProductNameResponse_QNAME = new QName("http://marketplace.com/", "SearchProductWithProductNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.marketplace
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddLike }
     * 
     */
    public AddLike createAddLike() {
        return new AddLike();
    }

    /**
     * Create an instance of {@link AddLikeResponse }
     * 
     */
    public AddLikeResponse createAddLikeResponse() {
        return new AddLikeResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link AddPurchase }
     * 
     */
    public AddPurchase createAddPurchase() {
        return new AddPurchase();
    }

    /**
     * Create an instance of {@link AddPurchaseResponse }
     * 
     */
    public AddPurchaseResponse createAddPurchaseResponse() {
        return new AddPurchaseResponse();
    }

    /**
     * Create an instance of {@link CheckLike }
     * 
     */
    public CheckLike createCheckLike() {
        return new CheckLike();
    }

    /**
     * Create an instance of {@link CheckLikeResponse }
     * 
     */
    public CheckLikeResponse createCheckLikeResponse() {
        return new CheckLikeResponse();
    }

    /**
     * Create an instance of {@link DelLike }
     * 
     */
    public DelLike createDelLike() {
        return new DelLike();
    }

    /**
     * Create an instance of {@link DelLikeResponse }
     * 
     */
    public DelLikeResponse createDelLikeResponse() {
        return new DelLikeResponse();
    }

    /**
     * Create an instance of {@link DelProduct }
     * 
     */
    public DelProduct createDelProduct() {
        return new DelProduct();
    }

    /**
     * Create an instance of {@link DelProductResponse }
     * 
     */
    public DelProductResponse createDelProductResponse() {
        return new DelProductResponse();
    }

    /**
     * Create an instance of {@link EditProduct }
     * 
     */
    public EditProduct createEditProduct() {
        return new EditProduct();
    }

    /**
     * Create an instance of {@link EditProductResponse }
     * 
     */
    public EditProductResponse createEditProductResponse() {
        return new EditProductResponse();
    }

    /**
     * Create an instance of {@link GetAccWithAccountId }
     * 
     */
    public GetAccWithAccountId createGetAccWithAccountId() {
        return new GetAccWithAccountId();
    }

    /**
     * Create an instance of {@link GetAccWithAccountIdResponse }
     * 
     */
    public GetAccWithAccountIdResponse createGetAccWithAccountIdResponse() {
        return new GetAccWithAccountIdResponse();
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
     * Create an instance of {@link GetPurchase }
     * 
     */
    public GetPurchase createGetPurchase() {
        return new GetPurchase();
    }

    /**
     * Create an instance of {@link GetPurchaseByName }
     * 
     */
    public GetPurchaseByName createGetPurchaseByName() {
        return new GetPurchaseByName();
    }

    /**
     * Create an instance of {@link GetPurchaseByNameResponse }
     * 
     */
    public GetPurchaseByNameResponse createGetPurchaseByNameResponse() {
        return new GetPurchaseByNameResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseResponse }
     * 
     */
    public GetPurchaseResponse createGetPurchaseResponse() {
        return new GetPurchaseResponse();
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
     * Create an instance of {@link SearchProductWithProductId }
     * 
     */
    public SearchProductWithProductId createSearchProductWithProductId() {
        return new SearchProductWithProductId();
    }

    /**
     * Create an instance of {@link SearchProductWithProductIdResponse }
     * 
     */
    public SearchProductWithProductIdResponse createSearchProductWithProductIdResponse() {
        return new SearchProductWithProductIdResponse();
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
     * Create an instance of {@link Purchases }
     * 
     */
    public Purchases createPurchases() {
        return new Purchases();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "AddLike")
    public JAXBElement<AddLike> createAddLike(AddLike value) {
        return new JAXBElement<AddLike>(_AddLike_QNAME, AddLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "AddLikeResponse")
    public JAXBElement<AddLikeResponse> createAddLikeResponse(AddLikeResponse value) {
        return new JAXBElement<AddLikeResponse>(_AddLikeResponse_QNAME, AddLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "AddProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "AddProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "AddPurchase")
    public JAXBElement<AddPurchase> createAddPurchase(AddPurchase value) {
        return new JAXBElement<AddPurchase>(_AddPurchase_QNAME, AddPurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "AddPurchaseResponse")
    public JAXBElement<AddPurchaseResponse> createAddPurchaseResponse(AddPurchaseResponse value) {
        return new JAXBElement<AddPurchaseResponse>(_AddPurchaseResponse_QNAME, AddPurchaseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "CheckLike")
    public JAXBElement<CheckLike> createCheckLike(CheckLike value) {
        return new JAXBElement<CheckLike>(_CheckLike_QNAME, CheckLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "CheckLikeResponse")
    public JAXBElement<CheckLikeResponse> createCheckLikeResponse(CheckLikeResponse value) {
        return new JAXBElement<CheckLikeResponse>(_CheckLikeResponse_QNAME, CheckLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelLike }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "DelLike")
    public JAXBElement<DelLike> createDelLike(DelLike value) {
        return new JAXBElement<DelLike>(_DelLike_QNAME, DelLike.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelLikeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "DelLikeResponse")
    public JAXBElement<DelLikeResponse> createDelLikeResponse(DelLikeResponse value) {
        return new JAXBElement<DelLikeResponse>(_DelLikeResponse_QNAME, DelLikeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "DelProduct")
    public JAXBElement<DelProduct> createDelProduct(DelProduct value) {
        return new JAXBElement<DelProduct>(_DelProduct_QNAME, DelProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "DelProductResponse")
    public JAXBElement<DelProductResponse> createDelProductResponse(DelProductResponse value) {
        return new JAXBElement<DelProductResponse>(_DelProductResponse_QNAME, DelProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "EditProduct")
    public JAXBElement<EditProduct> createEditProduct(EditProduct value) {
        return new JAXBElement<EditProduct>(_EditProduct_QNAME, EditProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EditProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "EditProductResponse")
    public JAXBElement<EditProductResponse> createEditProductResponse(EditProductResponse value) {
        return new JAXBElement<EditProductResponse>(_EditProductResponse_QNAME, EditProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccWithAccountId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetAccWithAccountId")
    public JAXBElement<GetAccWithAccountId> createGetAccWithAccountId(GetAccWithAccountId value) {
        return new JAXBElement<GetAccWithAccountId>(_GetAccWithAccountId_QNAME, GetAccWithAccountId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccWithAccountIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetAccWithAccountIdResponse")
    public JAXBElement<GetAccWithAccountIdResponse> createGetAccWithAccountIdResponse(GetAccWithAccountIdResponse value) {
        return new JAXBElement<GetAccWithAccountIdResponse>(_GetAccWithAccountIdResponse_QNAME, GetAccWithAccountIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetPurchase")
    public JAXBElement<GetPurchase> createGetPurchase(GetPurchase value) {
        return new JAXBElement<GetPurchase>(_GetPurchase_QNAME, GetPurchase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetPurchaseByName")
    public JAXBElement<GetPurchaseByName> createGetPurchaseByName(GetPurchaseByName value) {
        return new JAXBElement<GetPurchaseByName>(_GetPurchaseByName_QNAME, GetPurchaseByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetPurchaseByNameResponse")
    public JAXBElement<GetPurchaseByNameResponse> createGetPurchaseByNameResponse(GetPurchaseByNameResponse value) {
        return new JAXBElement<GetPurchaseByNameResponse>(_GetPurchaseByNameResponse_QNAME, GetPurchaseByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPurchaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "GetPurchaseResponse")
    public JAXBElement<GetPurchaseResponse> createGetPurchaseResponse(GetPurchaseResponse value) {
        return new JAXBElement<GetPurchaseResponse>(_GetPurchaseResponse_QNAME, GetPurchaseResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductWithProductId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "SearchProductWithProductId")
    public JAXBElement<SearchProductWithProductId> createSearchProductWithProductId(SearchProductWithProductId value) {
        return new JAXBElement<SearchProductWithProductId>(_SearchProductWithProductId_QNAME, SearchProductWithProductId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchProductWithProductIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://marketplace.com/", name = "SearchProductWithProductIdResponse")
    public JAXBElement<SearchProductWithProductIdResponse> createSearchProductWithProductIdResponse(SearchProductWithProductIdResponse value) {
        return new JAXBElement<SearchProductWithProductIdResponse>(_SearchProductWithProductIdResponse_QNAME, SearchProductWithProductIdResponse.class, null, value);
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
