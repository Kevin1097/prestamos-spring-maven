/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.maven30.dao.UsuarioDAO;
import pe.edu.upeu.maven30.model.UsuarioDTO;



/**
 *
 * @author UPEU
 */
@Controller
public class HomeController {
    private static UsuarioDAO uO;
@Autowired
    @RequestMapping(value="/")
    public String main(){	
            return "main";
    }
    @RequestMapping(value="/kk")
    public String ListarRol(){	
            return "ListarRol";
    }
    
    @RequestMapping(value="/login")
    public String login(){	
            return "login";
    }
    @RequestMapping(value = "/loguea" ,  method = RequestMethod.POST)
        public ModelAndView Logueo(ModelAndView model ,HttpServletRequest resquest, HttpServletResponse response){
            String user = resquest.getParameter("user");
            String Pass = resquest.getParameter("pass");
            UsuarioDTO d= new UsuarioDTO();
            HttpSession sesion = resquest.getSession();
            d =uO.Validar(user, Pass);
             if (d != null ) {
                 resquest.getSession().setAttribute("user", d);
                
                 //List<UsuarioDTO> listContact = dao.readAll();
//                 model.addObject("listContact", listContact);
                 model.setViewName("main");
             }else{
                 sesion.setAttribute("Persona", null);
                model.setViewName("index");

             }
        return model;
         }
    
}

