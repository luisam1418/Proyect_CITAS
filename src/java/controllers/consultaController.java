
package controllers;

import DAO.ConectarDB;
import DAO.ConsultaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import models.consultaBean;
import models.consultaValidation;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @since 31-03-2021
 * @author Luisa Manrique
 */
@Controller
    public class consultaController {
        private JdbcTemplate jdbcTemplate;
        consultaValidation examValidar;
    
    /**
     *
     */
    public consultaController() {
            this.examValidar = new consultaValidation();
            ConectarDB con = new ConectarDB();
            this.jdbcTemplate = new JdbcTemplate(con.conectar());
        }
/**SELECT
     * @return  */
        @RequestMapping(value="consulExamen.htm", method=RequestMethod.GET)
        public ModelAndView consultarCurso(){
        ModelAndView mav = new ModelAndView();
        consultaBean consultar = new consultaBean();        
        mav.addObject("consultar",consultar);
        mav.setViewName("views/consulExamen");
        return mav;
        }
        
    /**
     *
     * @return
     */
    @RequestMapping(value="consulExamen.htm", method=RequestMethod.POST)
        public ModelAndView mostrarExamen(){
        ModelAndView mav = new ModelAndView();
        ConsultaDAO condao = new ConsultaDAO();
        mav.addObject("consultar",condao.consultar());
        mav.setViewName("views/mostrarExamen");
        return mav;
        }
//------------------ Agregar------------------     

    /**
     *
     * @return
     */
              @RequestMapping(value="agregarExamen.htm", method=RequestMethod.GET)
            public ModelAndView cargarDoctor(){
            ModelAndView mav = new ModelAndView();
            mav.addObject("consulta", new consultaBean());
            mav.setViewName("views/agregarExamen");
            return mav;
            }
/**
 * 
 * 
 * @param consul
 * @param result
 * @param status
 * @return 
 */
                
        @RequestMapping(value="agregarExamen.htm", method=RequestMethod.POST)
        public ModelAndView cargarDoctor(
            @ModelAttribute("consulta") consultaBean consul,
            BindingResult result,
            SessionStatus status
        )
        {
            this.examValidar.validate(consul, result);
            if(result.hasErrors()){
                ModelAndView mav = new ModelAndView();
                mav.addObject("consulta", new consultaBean());
                mav.setViewName("views/agregarExamen");
                return mav;
            }else{
                ModelAndView mav = new ModelAndView();
                ConsultaDAO condao = new ConsultaDAO();
                 String NombreDoctor = consul.getNombreDoctor();
                String TipoExamen = consul.getTipoExamen();
                 String Consultorio = consul.getConsultorio();
                condao.insert(NombreDoctor, TipoExamen, Consultorio);
                mav.setViewName("redirect:/consulExamen.htm");
                return mav;
            }
        }
//------------------- Actualizar --------------       

    /**
     *
     * @param request
     * @return
     */
            @RequestMapping(value="actExamen.htm", method=RequestMethod.GET)
            public ModelAndView actExamen(HttpServletRequest request){
            ModelAndView mav = new ModelAndView();
            int IdUsuario = Integer.parseInt(request.getParameter("IdUsuario"));
            consultaBean consul = this.cargarExamenbyIdUsuario(IdUsuario);
            mav.addObject("consulta", new consultaBean (IdUsuario, consul.getNombreDoctor(), consul.getTipoExamen(), consul.getConsultorio()));
            mav.setViewName("views/actExamen");
            return mav;
            }
            
    /**
     *
     * @param consul
     * @param result
     * @param status
     * @return
     */
    @RequestMapping(value="actExamen.htm", method=RequestMethod.POST)
           public ModelAndView actExamen(
                   @ModelAttribute("consulta") consultaBean consul,
                   BindingResult result,
                   SessionStatus status
           )
           {
               this.examValidar.validate(consul, result);
               if(result.hasErrors()){
                    ModelAndView mov = new ModelAndView();
                    mov.addObject("consulta", new consultaBean());
                    mov.setViewName("views/actExamen");
                    return mov;
               }
               else{
                    ModelAndView mav = new ModelAndView();
                    ConsultaDAO condao = new ConsultaDAO();
                    String NombreDoctor = consul.getNombreDoctor();
                    String TipoExamen = consul.getTipoExamen();
                    String Consultorio = consul.getConsultorio();
                    int IdUsuario = consul.getIdUsuario();
                    condao.update(NombreDoctor, TipoExamen, Consultorio, IdUsuario);
                    mav.setViewName("redirect:/consulExamen.htm");
                    return mav;
                    }
            }
           
/*----------------------- METODO cargarExamenbyIdUsuario---------------*/

    /**
     *
     * @param IdUsuario
     * @return
     */
    
            public consultaBean cargarExamenbyIdUsuario(int IdUsuario){
                final consultaBean consul = new consultaBean();
                String sql = "select * from examenes where IdUsuario = " + IdUsuario;
                return (consultaBean) jdbcTemplate.query(sql, new ResultSetExtractor<consultaBean>()
                {
                        public consultaBean extractData(ResultSet rs) throws SQLException, DataAccessException {
                            if(rs.next()){
                                consul.setIdUsuario(rs.getInt("IdUsuario"));
                                consul.setNombreDoctor(rs.getString("NombreDoctor"));
                                consul.setTipoExamen(rs.getString("TipoExamen"));
                                consul.setConsultorio(rs.getString("Consultorio"));
                            }
                        return consul;
                        }
                    });
            }


/*------------------------------- ELIMINAR -------------------*/

    /**
     *
     * @param request
     * @return
     */
    
        @RequestMapping("borrarExamen.htm")
        public ModelAndView borrarExamen(HttpServletRequest request ){
         ModelAndView mav = new ModelAndView();
        int IdUsuario = Integer.parseInt(request.getParameter("IdUsuario"));
        ConsultaDAO coldao = new ConsultaDAO();
        coldao.delete(IdUsuario);
        mav.setViewName("redirect:/consulExamen.htm");
        return mav;
        }
    
}


