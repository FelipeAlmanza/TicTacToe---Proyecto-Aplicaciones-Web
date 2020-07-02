
package tictactoe_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad turnoMaquinaResult.
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
     * Define el valor de la propiedad turnoMaquinaResult.
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
