
package org.example.petlocation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frecuenciaCardiaca" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="frecuenciaRespiratoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idCollar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "latitud",
    "longitud",
    "frecuenciaCardiaca",
    "frecuenciaRespiratoria",
    "idCollar"
})
@XmlRootElement(name = "receiveLocation")
public class ReceiveLocation {

    @XmlElement(required = true)
    protected String latitud;
    @XmlElement(required = true)
    protected String longitud;
    @XmlElement(required = true)
    protected String frecuenciaCardiaca;
    @XmlElement(required = true)
    protected String frecuenciaRespiratoria;
    @XmlElement(required = true)
    protected String idCollar;

    /**
     * Gets the value of the latitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitud(String value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the frecuenciaCardiaca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrecuenciaCardiaca() {
        return frecuenciaCardiaca;
    }

    /**
     * Sets the value of the frecuenciaCardiaca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrecuenciaCardiaca(String value) {
        this.frecuenciaCardiaca = value;
    }

    /**
     * Gets the value of the frecuenciaRespiratoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrecuenciaRespiratoria() {
        return frecuenciaRespiratoria;
    }

    /**
     * Sets the value of the frecuenciaRespiratoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrecuenciaRespiratoria(String value) {
        this.frecuenciaRespiratoria = value;
    }

    /**
     * Gets the value of the idCollar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCollar() {
        return idCollar;
    }

    /**
     * Sets the value of the idCollar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCollar(String value) {
        this.idCollar = value;
    }

}
