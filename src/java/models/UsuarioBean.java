
package models;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class UsuarioBean {
   private String Nombre;
   private String Correo;
   private String Edad;

    /**
     *
     */
    public UsuarioBean() {
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
    public String getCorreo() {
        return Correo;
    }

    /**
     *
     * @param Correo
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     *
     * @return
     */
    public String getEdad() {
        return Edad;
    }

    /**
     *
     * @param Edad
     */
    public void setEdad(String Edad) {
        this.Edad = Edad;
    }
    
   
}

