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
public class Delfin extends Animal implements ComportamientoRuido{

    @Override
    public String hacerRuido() {
        return "brriiiippp "+getNombre();
    }

}