/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.sql.DataSource;
import pe.edu.upeu.maven30.config.AppConfig;
import pe.edu.upeu.maven30.dao.PrestamoDAO;

import pe.edu.upeu.maven30.dao.ReservaDAO;

import pe.edu.upeu.maven30.dao.UsuarioDAO;
import pe.edu.upeu.maven30.model.UsuarioDTO;

/**
 *
 * @author junio
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Conex();
        //Procedure_pedido();
        
//        pedido();
Valida();
    }
   
    public static void Conex()
    {
          DataSource as=AppConfig.getDataSource();
          if (as!=null) {
              System.out.println("si");
        }
          else
          {
              System.out.println("no");
          }
  
    }
    public static void Valida()
    {
          DataSource as=AppConfig.getDataSource();

        UsuarioDAO uo = new UsuarioDAO(as);
        UsuarioDTO u = uo.Validar("joss", "12345");
        
        if (u != null){
            System.out.println("si");
        }else {
            System.out.println("no");
        }
    }
    
    public static void Procedure_pedido(){
        String idusuario = "2";
        String idprod = "1";
        int cant = 2;
        String Lugar = "Lab8";
        String fecha = "05/07/17";
        String dess = "fui agregado con call";
        String estado = "bueno";
         DataSource as=AppConfig.getDataSource();
        PrestamoDAO a =new PrestamoDAO(as);
        a.Prestamo(idusuario, idprod, cant, Lugar, fecha, dess, estado);
    } 
     
    public static  void Procedure_reserva (){
        String fechaIn = "07/07/17";
        String fchafin ="10/07/17";
        String p_usid = "2";
        String p_des ="esto fue insertado por procedure hoy";
        String p_estado ="susscessful";
        String p_eq ="1";        
        DataSource as=AppConfig.getDataSource();
        ReservaDAO r = new ReservaDAO(as);
        r.reservas(fechaIn, fchafin, p_usid, p_des, p_estado, p_eq);
         //jt.update(sql, p_fechainicio, p_fechafin , p_usid , p_descripcion , p_estado ,p_eq_id );
    }
    
}
