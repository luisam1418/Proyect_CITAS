

package models;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class CitaBean {
   private String Nombre;
   private String Ident;
   private String Fecha;
   private String Tipo;

    /**
     *
     */
    public CitaBean() {
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     *
     * @param Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     *
     * @return
     */
    public String getIdent() {
        return Ident;
    }

    /**
     *
     * @param Ident
     */
    public void setIdent(String Ident) {
        this.Ident = Ident;
    }

    /**
     *
     * @return
     */
    public String getFecha() {
        return Fecha;
    }

    /**
     *
     * @param Fecha
     */
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    /**
     *
     * @return
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     *
     * @param Tipo
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
   

}