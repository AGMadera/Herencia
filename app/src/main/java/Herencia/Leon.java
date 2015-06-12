/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author alfonsogalvanmadera
 */
public class Leon extends Animal implements ComportamientoRuido{

    @Override
    public String hacerRuido() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "warrrrr! "+getNombre();
        
        
    }
    
    
}
