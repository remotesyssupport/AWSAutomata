//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.21 at 05:35:52 PM IST 
//


package com.automata.cloudcore.xmlbindings;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EC2SecurityGroupList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EC2SecurityGroupList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EC2SecurityGroup" type="{}EC2SecurityGroup" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EC2SecurityGroupList", propOrder = {
    "ec2SecurityGroup"
})
public class EC2SecurityGroupList {

    @XmlElement(name = "EC2SecurityGroup", required = true)
    protected List<EC2SecurityGroup> ec2SecurityGroup;

    /**
     * Gets the value of the ec2SecurityGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ec2SecurityGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEC2SecurityGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EC2SecurityGroup }
     * 
     * 
     */
    public List<EC2SecurityGroup> getEC2SecurityGroup() {
        if (ec2SecurityGroup == null) {
            ec2SecurityGroup = new ArrayList<EC2SecurityGroup>();
        }
        return this.ec2SecurityGroup;
    }
    
	public void setEc2SecurityGroup(List<EC2SecurityGroup> ec2SecurityGroup) {
		this.ec2SecurityGroup = ec2SecurityGroup;
	}
    
    

}