//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.06 at 11:41:42 PM IST 
//


package com.automata.cloudcore.xmlbindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DescribeScalingProcessTypesResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescribeScalingProcessTypesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescribeScalingProcessTypesResult" type="{}DescribeScalingProcessTypesResultType"/>
 *         &lt;element name="ResponseMetadata" type="{}ResponseMetadataType"/>
 *         &lt;element name="Region" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescribeScalingProcessTypesResponse", propOrder = {
    "describeScalingProcessTypesResult",
    "responseMetadata",
    "region",
    "status"
})
public class DescribeScalingProcessTypesResponse {

    @XmlElement(name = "DescribeScalingProcessTypesResult", required = true)
    protected DescribeScalingProcessTypesResultType describeScalingProcessTypesResult;
    @XmlElement(name = "ResponseMetadata", required = true)
    protected ResponseMetadataType responseMetadata;
    @XmlElement(name = "Region", required = true)
    protected String region;
    @XmlElement(name = "Status", required = true)
    protected String status;

    /**
     * Gets the value of the describeScalingProcessTypesResult property.
     * 
     * @return
     *     possible object is
     *     {@link DescribeScalingProcessTypesResultType }
     *     
     */
    public DescribeScalingProcessTypesResultType getDescribeScalingProcessTypesResult() {
        return describeScalingProcessTypesResult;
    }

    /**
     * Sets the value of the describeScalingProcessTypesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescribeScalingProcessTypesResultType }
     *     
     */
    public void setDescribeScalingProcessTypesResult(DescribeScalingProcessTypesResultType value) {
        this.describeScalingProcessTypesResult = value;
    }

    /**
     * Gets the value of the responseMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMetadataType }
     *     
     */
    public ResponseMetadataType getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Sets the value of the responseMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMetadataType }
     *     
     */
    public void setResponseMetadata(ResponseMetadataType value) {
        this.responseMetadata = value;
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

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
