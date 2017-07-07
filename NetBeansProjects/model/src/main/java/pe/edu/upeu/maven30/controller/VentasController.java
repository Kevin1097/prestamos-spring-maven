  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.controller;

import java.io.IOException;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.maven30.dao.VentaDAO;


/**
 *
 * @author junio
 */
@Controller
public class VentasController {
   @Autowired
private VentaDAO vdao;
   @RequestMapping(value="/Allventas")
	public ModelAndView listVenta(ModelAndView model) throws IOException{
		List<Map<String,Object>> listVenta = vdao.listar();
		model.addObject("listVenta", listVenta);
		model.setViewName("ListarVentas");
		return model;
    }
}
