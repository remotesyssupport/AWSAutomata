//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.06 at 02:19:19 PM IST 
//


package com.automata.cloudcore.xmlbindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LaunchConfigurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaunchConfigurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LaunchConfigurationName" type="{}XmlStringMaxLen255"/>
 *         &lt;element name="LaunchConfigurationARN" type="{}ResourceName" minOccurs="0"/>
 *         &lt;element name="ImageId" type="{}XmlStringMaxLen255"/>
 *         &lt;element name="KeyName" type="{}XmlStringMaxLen255" minOccurs="0"/>
 *         &lt;element name="SecurityGroups" type="{}SecurityGroups" minOccurs="0"/>
 *         &lt;element name="UserData" type="{}XmlStringUserData" minOccurs="0"/>
 *         &lt;element name="InstanceType" type="{}XmlStringMaxLen255"/>
 *         &lt;element name="KernelId" type="{}XmlStringMaxLen255" minOccurs="0"/>
 *         &lt;element name="RamdiskId" type="{}XmlStringMaxLen255" minOccurs="0"/>
 *         &lt;element name="BlockDeviceMappings" type="{}BlockDeviceMappingsType" minOccurs="0"/>
 *         &lt;element name="InstanceMonitoring" type="{}InstanceMonitoringType" minOccurs="0"/>
 *         &lt;element name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaunchConfigurationType", propOrder = {
    "launchConfigurationName",
    "launchConfigurationARN",
    "imageId",
    "keyName",
    "securityGroups",
    "userData",
    "instanceType",
    "kernelId",
    "ramdiskId",
    "blockDeviceMappings",
    "instanceMonitoring",
    "createdTime"
})
public class LaunchConfigurationType {

    @XmlElement(name = "LaunchConfigurationName", required = true)
    protected String launchConfigurationName;
    @XmlElement(name = "LaunchConfigurationARN")
    protected String launchConfigurationARN;
    @XmlElement(name = "ImageId", required = true)
    protected String imageId;
    @XmlElement(name = "KeyName")
    protected String keyName;
    @XmlElement(name = "SecurityGroups")
    protected SecurityGroups securityGroups;
    @XmlElement(name = "UserData")
    protected String userData;
    @XmlElement(name = "InstanceType", required = true)
    protected String instanceType;
    @XmlElement(name = "KernelId")
    protected String kernelId;
    @XmlElement(name = "RamdiskId")
    protected String ramdiskId;
    @XmlElement(name = "BlockDeviceMappings")
    protected BlockDeviceMappingsType blockDeviceMappings;
    @XmlElement(name = "InstanceMonitoring")
    protected InstanceMonitoringType instanceMonitoring;
    @XmlElement(name = "CreatedTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdTime;

    /**
     * Gets the value of the launchConfigurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * Sets the value of the launchConfigurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaunchConfigurationName(String value) {
        this.launchConfigurationName = value;
    }

    /**
     * Gets the value of the launchConfigurationARN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaunchConfigurationARN() {
        return launchConfigurationARN;
    }

    /**
     * Sets the value of the launchConfigurationARN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaunchConfigurationARN(String value) {
        this.launchConfigurationARN = value;
    }

    /**
     * Gets the value of the imageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the value of the imageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageId(String value) {
        this.imageId = value;
    }

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

    /**
     * Gets the value of the securityGroups property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityGroups }
     *     
     */
    public SecurityGroups getSecurityGroups() {
        return securityGroups;
    }

    /**
     * Sets the value of the securityGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityGroups }
     *     
     */
    public void setSecurityGroups(SecurityGroups value) {
        this.securityGroups = value;
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserData(String value) {
        this.userData = value;
    }

    /**
     * Gets the value of the instanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * Sets the value of the instanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceType(String value) {
        this.instanceType = value;
    }

    /**
     * Gets the value of the kernelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKernelId() {
        return kernelId;
    }

    /**
     * Sets the value of the kernelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKernelId(String value) {
        this.kernelId = value;
    }

    /**
     * Gets the value of the ramdiskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * Sets the value of the ramdiskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamdiskId(String value) {
        this.ramdiskId = value;
    }

    /**
     * Gets the value of the blockDeviceMappings property.
     * 
     * @return
     *     possible object is
     *     {@link BlockDeviceMappingsType }
     *     
     */
    public BlockDeviceMappingsType getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * Sets the value of the blockDeviceMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockDeviceMappingsType }
     *     
     */
    public void setBlockDeviceMappings(BlockDeviceMappingsType value) {
        this.blockDeviceMappings = value;
    }

    /**
     * Gets the value of the instanceMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceMonitoringType }
     *     
     */
    public InstanceMonitoringType getInstanceMonitoring() {
        return instanceMonitoring;
    }

    /**
     * Sets the value of the instanceMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceMonitoringType }
     *     
     */
    public void setInstanceMonitoring(InstanceMonitoringType value) {
        this.instanceMonitoring = value;
    }

    /**
     * Gets the value of the createdTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedTime() {
        return createdTime;
    }

    /**
     * Sets the value of the createdTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedTime(XMLGregorianCalendar value) {
        this.createdTime = value;
    }

}