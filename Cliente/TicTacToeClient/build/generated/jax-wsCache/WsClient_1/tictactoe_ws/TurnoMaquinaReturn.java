
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
 *         &lt;element name="turnoMaquinaResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "turnoMaquinaResult"
})
@XmlRootElement(name = "turnoMaquinaReturn")
public class TurnoMaquinaReturn {

    @XmlElement(required = true)
    protected String turnoMaquinaResult;

    /**
     * Gets the value of the turnoMaquinaResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoMaquinaResult() {
        return turnoMaquinaResult;
    }

    /**
     * Sets the value of the turnoMaquinaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoMaquinaResult(String value) {
        this.turnoMaquinaResult = value;
    }

}
