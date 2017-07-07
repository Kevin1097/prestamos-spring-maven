/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import pe.edu.upeu.maven30.dao.DetalleDAO;
import pe.edu.upeu.maven30.dao.VentaDAO;

/**
 *
 * @author junio
 */
@Controller
public class DetalleController {
    @Autowired
private DetalleDAO ddao;
//   @RequestMapping(value="/Detalle")
//	public ModelAndView listVenta(ModelAndView model) throws IOException{
//		List<Map<String,Object>> listVenta = vdao.listar();
//		model.addObject("listVenta", listVenta);
//		model.setViewName("ListarVentas");
//		return model;
//    }
        @RequestMapping(value = "/listarDetalle", method = RequestMethod.GET)
	public ModelAndView deleteContact(ModelAndView model,HttpServletRequest request) {
		int ventaid = Integer.parseInt(request.getParameter("id"));
                List<Map<String,Object>> listDetalle = ddao.listarDetalle(ventaid);
                model.addObject("listDetalle",listDetalle);
                model.setViewName("detalle");
		return model;
	}
}
