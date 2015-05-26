/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbusiness;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.orm.PersistentException;
import orm.Box;

/**
 *
 * @author rrodriguez
 */
public class LogicBox {
    public double obtenerOcupacionBox(int idBox,String fecha1, String fecha2){
        double porcentaje = 0;
        if(existeBox(idBox)){
             try {
                //validar fechas 
                String sql = "hora_inicio BETWEEN '"+fecha1 +"' AND  '"+ fecha2+"'";
                orm.Hora_medica[] ormHora_medicas;
                ormHora_medicas = orm.Hora_medicaDAO.listHora_medicaByQuery(sql, null);

                int total = 0;
                int totalBox = 0;
                for (int i = 0; i < ormHora_medicas.length; i++) {
                        if(ormHora_medicas[i].getBox().getId_box() == idBox){
                            totalBox = totalBox + ormHora_medicas[i].getTiempo_periodo();
                        }
                        total = total + ormHora_medicas[i].getTiempo_periodo();
                }
                if(total !=0){
                     porcentaje =  totalBox*100/total;
                }
                   
                }catch (PersistentException ex) {
                   Logger.getLogger(LogicBox.class.getName()).log(Level.SEVERE, null, ex);
                }catch(Exception e){
                      Logger.getLogger(LogicBox.class.getName()).log(Level.SEVERE, null, e);
                }
            
            return porcentaje;
        }else{
         return -1;
        }
     
        
  }
    
  private Boolean existeBox(int idBox){
        Boolean existe = Boolean.FALSE; 
        try {
            int box = orm.BoxDAO.loadBoxByQuery("id="+idBox, null).getId_box();
            existe =Boolean.FALSE;
        } catch (PersistentException ex) {
            existe =Boolean.FALSE;
           // Logger.getLogger(LogicBox.class.getName()).log(Level.SEVERE, null, ex);
        }
           
         return existe;
  }
} 