/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack1;

/**
 *
 * @author Sayas
 */
public class Humano extends SerVivo {

  String genero;
    public Humano(String ge)
    {
        genero=ge;
    }
    
    public void Alimentarse()
    {
        System.out.println("Soy un Humano, me estoy alimentando"+"soy de genero"+genero); 
    }
    
}
