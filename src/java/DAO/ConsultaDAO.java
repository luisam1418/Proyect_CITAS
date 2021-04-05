
package DAO;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
public class ConsultaDAO {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    
/** Metodo de SELECT */
/** @return : jdbctemplate llamado datos que se muestra en una vista
*/ 
  public List consultar() {
        List datos = new ArrayList();
        String sql = "select * from examenes";
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        datos = this.jdbcTemplate.queryForList(sql);
        return datos;

    }     
  /** Metodo de INSERT */
/** 
     * @param NombreDoctor
     * @param TipoExamen
     * @param Consultorio
*/ 
  public void insert(String NombreDoctor, String TipoExamen, String Consultorio) {
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
        String sql = "insert into examenes ( NombreDoctor, TipoExamen, Consultorio) values ('"+NombreDoctor+"', '"+TipoExamen+"', '"+Consultorio+"')";
        this.jdbcTemplate.update(sql);
  }

  /** Metodo de UPDATE */
/** 

     * @param NombreDoctor
     * @param TipoExamen
     * @param IdUsuario  
     * @param Consultorio
*/       
 public void update(String NombreDoctor, String TipoExamen, String Consultorio, int IdUsuario) {
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "update examenes set NombreDoctor = '"+NombreDoctor+"', TipoExamen = '"+TipoExamen+"' , Consultorio = '"+Consultorio+"' where IdUsuario = '"+IdUsuario+"' ";
    this.jdbcTemplate.update(sql);
}
/** Metodo de DELETE 
     * @param IdUsuario 
*/
    
    public void delete(int IdUsuario) {
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "delete from examenes where IdUsuario = '"+IdUsuario+"' ";
    this.jdbcTemplate.update(sql);
    }
}
    
    
    
    
    
    
    
    
    
    
    

    