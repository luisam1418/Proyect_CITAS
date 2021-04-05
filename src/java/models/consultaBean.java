
package models;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class consultaBean {
    private int IdUsuario;
    private String NombreDoctor;
    private String TipoExamen;
    private String Consultorio;

    /**
     *
     * @param IdUsuario
     * @param NombreDoctor
     * @param TipoExamen
     * @param Consultorio
     */
    public consultaBean(int IdUsuario, String NombreDoctor, String TipoExamen, String Consultorio) {
        this.IdUsuario = IdUsuario;
        this.NombreDoctor = NombreDoctor;
        this.TipoExamen = TipoExamen;
        this.Consultorio = Consultorio;
    }

    /**
     *
     */
    public consultaBean() {
        
    }

    /**
     *
     * @return
     */
    public int getIdUsuario() {
        return IdUsuario;
    }

    /**
     *
     * @param IdUsuario
     */
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    /**
     *
     * @return
     */
    public String getNombreDoctor() {
        return NombreDoctor;
    }

    /**
     *
     * @param NombreDoctor
     */
    public void setNombreDoctor(String NombreDoctor) {
        this.NombreDoctor = NombreDoctor;
    }

    /**
     *
     * @return
     */
    public String getTipoExamen() {
        return TipoExamen;
    }

    /**
     *
     * @param TipoExamen
     */
    public void setTipoExamen(String TipoExamen) {
        this.TipoExamen = TipoExamen;
    }

    /**
     *
     * @return
     */
    public String getConsultorio() {
        return Consultorio;
    }

    /**
     *
     * @param Consultorio
     */
    public void setConsultorio(String Consultorio) {
        this.Consultorio = Consultorio;
    }
    
    
}
