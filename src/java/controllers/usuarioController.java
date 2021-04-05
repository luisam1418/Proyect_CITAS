
package controllers;

import models.UsuarioBean;
import models.UsuarioValidation;
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
public class usuarioController {
    UsuarioValidation usuValidar;

    /**
     *
     */
    public usuarioController () {
        this.usuValidar = new UsuarioValidation();
    }
    
    /**
     *
     * @return
     */
    @RequestMapping (value= "AgregarUsuario.htm", method= RequestMethod.GET) 
    
    public ModelAndView cita () {
        return new ModelAndView ("views/AgregarUsuario", "usuario", new UsuarioBean());
    
}

    /**
     *
     * @param user
     * @param result
     * @param status
     * @return
     */
    @RequestMapping (value="AgregarUsuario.htm", method = RequestMethod.POST)
public ModelAndView verUsuario (
    @ModelAttribute ("usuario") UsuarioBean user, 
    BindingResult result,
    SessionStatus status) {
  this.usuValidar.validate(user, result);
  if (result.hasErrors ()) {
      ModelAndView mav =  new ModelAndView();
      mav.addObject("usuario", new UsuarioBean ());
      mav.setViewName ("views/AgregarUsuario");
      return mav;
  }
  else {
      ModelAndView mav = new ModelAndView ();
      mav.addObject("nombre", user.getNombre());
      mav.addObject("correo", user.getCorreo());
      mav.addObject("edad", user.getEdad ());
      
      mav.setViewName("views/vistaUsuario");
          return mav;
    }
    }
}  

    
    
    

