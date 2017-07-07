/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.maven30.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author UPEU
 */
@Controller
public class HomeController {
@Autowired
    @RequestMapping(value="/")
    public String main(){	
            return "main";
    }
    @RequestMapping(value="/kk")
    public String ListarRol(){	
            return "ListarRol";
    }
    
}

