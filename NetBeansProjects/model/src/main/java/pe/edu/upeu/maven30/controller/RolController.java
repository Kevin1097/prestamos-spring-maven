/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.maven30.dao.RolDAO;
import pe.edu.upeu.maven30.model.Rol;

/**
 *
 * @author junio
 */
@Controller
public class RolController {
    @Autowired
    private RolDAO rdao;
    @RequestMapping(value="/Allroles")
	public ModelAndView listRol(ModelAndView model) throws IOException{
		List<Rol> listRol = rdao.list();
		model.addObject("listRol", listRol);
		model.setViewName("ListarRol");
		return model;
        }
    
}
