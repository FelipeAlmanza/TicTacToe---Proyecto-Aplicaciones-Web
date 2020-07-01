
package tictactoe_ws;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caracJugador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="movimiento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "caracJugador",
    "movimiento"
})
@XmlRootElement(name = "marcarEnTablero")
public class MarcarEnTablero {

    @XmlElement(required = true)
    protected String caracJugador;
    @XmlElement(required = true)
    protected String movimiento;

    /**
     * Gets the value of the caracJugador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracJugador() {
        return caracJugador;
    }

    /**
     * Sets the value of the caracJugador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracJugador(String value) {
        this.caracJugador = value;
    }

    /**
     * Gets the value of the movimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovimiento() {
        return movimiento;
    }

    /**
     * Sets the value of the movimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovimiento(String value) {
        this.movimiento = value;
    }

}
