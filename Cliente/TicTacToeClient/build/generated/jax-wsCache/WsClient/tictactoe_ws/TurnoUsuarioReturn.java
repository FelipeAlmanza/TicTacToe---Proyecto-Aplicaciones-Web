
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
 *         &lt;element name="turnoUsuarioResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "turnoUsuarioResult"
})
@XmlRootElement(name = "turnoUsuarioReturn")
public class TurnoUsuarioReturn {

    @XmlElement(required = true)
    protected String turnoUsuarioResult;

    /**
     * Gets the value of the turnoUsuarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoUsuarioResult() {
        return turnoUsuarioResult;
    }

    /**
     * Sets the value of the turnoUsuarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoUsuarioResult(String value) {
        this.turnoUsuarioResult = value;
    }

}
