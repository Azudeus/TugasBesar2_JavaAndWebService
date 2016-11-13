
package com.marketplace;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="product_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="product_price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="likes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="purchase" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="product_datetime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="imgsrc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product", propOrder = {
    "productId",
    "productName",
    "username",
    "productDescription",
    "productPrice",
    "likes",
    "purchase",
    "productDatetime",
    "imgsrc"
})
public class Product {

    @XmlElement(name = "product_id")
    protected int productId;
    @XmlElement(name = "product_name")
    protected String productName;
    protected String username;
    @XmlElement(name = "product_description")
    protected String productDescription;
    @XmlElement(name = "product_price")
    protected double productPrice;
    protected int likes;
    protected int purchase;
    @XmlElement(name = "product_datetime")
    protected long productDatetime;
    protected String imgsrc;

    /**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDescription(String value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productPrice property.
     * 
     */
    public double getProductPrice() {
        return productPrice;
    }

    /**
     * Sets the value of the productPrice property.
     * 
     */
    public void setProductPrice(double value) {
        this.productPrice = value;
    }

    /**
     * Gets the value of the likes property.
     * 
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Sets the value of the likes property.
     * 
     */
    public void setLikes(int value) {
        this.likes = value;
    }

    /**
     * Gets the value of the purchase property.
     * 
     */
    public int getPurchase() {
        return purchase;
    }

    /**
     * Sets the value of the purchase property.
     * 
     */
    public void setPurchase(int value) {
        this.purchase = value;
    }

    /**
     * Gets the value of the productDatetime property.
     * 
     */
    public long getProductDatetime() {
        return productDatetime;
    }

    /**
     * Sets the value of the productDatetime property.
     * 
     */
    public void setProductDatetime(long value) {
        this.productDatetime = value;
    }

    /**
     * Gets the value of the imgsrc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgsrc() {
        return imgsrc;
    }

    /**
     * Sets the value of the imgsrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgsrc(String value) {
        this.imgsrc = value;
    }

}
