/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.sql.DataSource;
import pe.edu.upeu.maven30.config.AppConfig;
import pe.edu.upeu.maven30.dao.PrestamoDAO;

/**
 *
 * @author junio
 */
public class Test {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conex();
        pedido();
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
    
    public static void pedido(){
        String idusuario = "2";
        String idprod = "1";
        int cant = 2;
        String Lugar = "Lab8";
        String fecha = "07/07/17";
        String dess = "fui agregado con call";
        String estado = "bueno";
         DataSource as=AppConfig.getDataSource();
        PrestamoDAO a =new PrestamoDAO(as);
        a.Prestamo(idusuario, idprod, cant, Lugar, fecha, dess, estado);
        //jt.update(sql, idUsuario, idProdcuto , cantidad , lugar , fecha ,dess , estado );
    } 
}
