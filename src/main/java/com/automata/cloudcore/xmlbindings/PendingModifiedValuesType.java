//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.05 at 03:50:31 PM IST 
//


package com.automata.cloudcore.xmlbindings;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingModifiedValuesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingModifiedValuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBInstanceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllocatedStorage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MasterUserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="BackupRetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultiAZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EngineVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingModifiedValuesType", propOrder = {
    "dbInstanceClass",
    "allocatedStorage",
    "masterUserPassword",
    "port",
    "backupRetentionPeriod",
    "multiAZ",
    "engineVersion"
})
public class PendingModifiedValuesType {

    @XmlElement(name = "DBInstanceClass")
    protected String dbInstanceClass;
    @XmlElement(name = "AllocatedStorage")
    protected Integer allocatedStorage;
    @XmlElement(name = "MasterUserPassword")
    protected String masterUserPassword;
    @XmlElement(name = "Port")
    protected Integer port;
    @XmlElement(name = "BackupRetentionPeriod")
    protected Integer backupRetentionPeriod;
    @XmlElement(name = "MultiAZ")
    protected Boolean multiAZ;
    @XmlElement(name = "EngineVersion")
    protected String engineVersion;

    /**
     * Gets the value of the dbInstanceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBInstanceClass() {
        return dbInstanceClass;
    }

    /**
     * Sets the value of the dbInstanceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBInstanceClass(String value) {
        this.dbInstanceClass = value;
    }

    /**
     * Gets the value of the allocatedStorage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * Sets the value of the allocatedStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllocatedStorage(Integer value) {
        this.allocatedStorage = value;
    }

    /**
     * Gets the value of the masterUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * Sets the value of the masterUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterUserPassword(String value) {
        this.masterUserPassword = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPort(Integer value) {
        this.port = value;
    }

    /**
     * Gets the value of the backupRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * Sets the value of the backupRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBackupRetentionPeriod(Integer value) {
        this.backupRetentionPeriod = value;
    }

    /**
     * Gets the value of the multiAZ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * Sets the value of the multiAZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiAZ(Boolean value) {
        this.multiAZ = value;
    }

    /**
     * Gets the value of the engineVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * Sets the value of the engineVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineVersion(String value) {
        this.engineVersion = value;
    }

	

}