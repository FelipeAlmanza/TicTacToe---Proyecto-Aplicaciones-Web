
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
     * Obtiene el valor de la propiedad caracJugador.
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
     * Define el valor de la propiedad caracJugador.
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
     * Obtiene el valor de la propiedad movimiento.
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
     * Define el valor de la propiedad movimiento.
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
