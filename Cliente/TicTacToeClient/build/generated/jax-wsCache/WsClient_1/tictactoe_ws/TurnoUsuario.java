
package tictactoe_ws;

import java.math.BigInteger;
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
 *         &lt;element name="posX" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="posY" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "posX",
    "posY"
})
@XmlRootElement(name = "turnoUsuario")
public class TurnoUsuario {

    @XmlElement(required = true)
    protected BigInteger posX;
    @XmlElement(required = true)
    protected BigInteger posY;

    /**
     * Obtiene el valor de la propiedad posX.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosX() {
        return posX;
    }

    /**
     * Define el valor de la propiedad posX.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosX(BigInteger value) {
        this.posX = value;
    }

    /**
     * Obtiene el valor de la propiedad posY.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosY() {
        return posY;
    }

    /**
     * Define el valor de la propiedad posY.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosY(BigInteger value) {
        this.posY = value;
    }

}
