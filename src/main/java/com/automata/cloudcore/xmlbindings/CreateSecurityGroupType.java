//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.30 at 07:01:24 PM IST 
//


package com.automata.cloudcore.xmlbindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateSecurityGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateSecurityGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SecurityGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SecurityGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateSecurityGroupType", propOrder = {
    "securityGroupName",
    "securityGroupDesc",
    "region"
})
public class CreateSecurityGroupType {

    @XmlElement(name = "SecurityGroupName", required = true)
    protected String securityGroupName;
    @XmlElement(name = "SecurityGroupDesc", required = true)
    protected String securityGroupDesc;
    @XmlElement(name = "Region", required = true)
    protected String region;

    /**
     * Gets the value of the securityGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityGroupName() {
        return securityGroupName;
    }

    /**
     * Sets the value of the securityGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityGroupName(String value) {
        this.securityGroupName = value;
    }

    /**
     * Gets the value of the securityGroupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityGroupDesc() {
        return securityGroupDesc;
    }

    /**
     * Sets the value of the securityGroupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityGroupDesc(String value) {
        this.securityGroupDesc = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

}
