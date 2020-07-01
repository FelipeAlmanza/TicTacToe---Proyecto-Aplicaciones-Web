
package tictactoe_ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tictactoe_ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetTableroReturn_QNAME = new QName("urn:TicTacToe", "get_TableroReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tictactoe_ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TurnoMaquinaReturn }
     * 
     */
    public TurnoMaquinaReturn createTurnoMaquinaReturn() {
        return new TurnoMaquinaReturn();
    }

    /**
     * Create an instance of {@link Tablero }
     * 
     */
    public Tablero createTablero() {
        return new Tablero();
    }

    /**
     * Create an instance of {@link MarcarEnTablero }
     * 
     */
    public MarcarEnTablero createMarcarEnTablero() {
        return new MarcarEnTablero();
    }

    /**
     * Create an instance of {@link EstadoDeJuegoReturn }
     * 
     */
    public EstadoDeJuegoReturn createEstadoDeJuegoReturn() {
        return new EstadoDeJuegoReturn();
    }

    /**
     * Create an instance of {@link EstadoDeJuego }
     * 
     */
    public EstadoDeJuego createEstadoDeJuego() {
        return new EstadoDeJuego();
    }

    /**
     * Create an instance of {@link TurnoMaquina }
     * 
     */
    public TurnoMaquina createTurnoMaquina() {
        return new TurnoMaquina();
    }

    /**
     * Create an instance of {@link GetTablero }
     * 
     */
    public GetTablero createGetTablero() {
        return new GetTablero();
    }

    /**
     * Create an instance of {@link TurnoUsuarioReturn }
     * 
     */
    public TurnoUsuarioReturn createTurnoUsuarioReturn() {
        return new TurnoUsuarioReturn();
    }

    /**
     * Create an instance of {@link TurnoUsuario }
     * 
     */
    public TurnoUsuario createTurnoUsuario() {
        return new TurnoUsuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tablero }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:TicTacToe", name = "get_TableroReturn")
    public JAXBElement<Tablero> createGetTableroReturn(Tablero value) {
        return new JAXBElement<Tablero>(_GetTableroReturn_QNAME, Tablero.class, null, value);
    }

}
