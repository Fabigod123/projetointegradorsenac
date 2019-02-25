/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package three.kings;

/**
 *
 * @author sala302b
 */
public class ThreeKings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Refrigerante meuRefrigerante = new Refrigerante();
        
        meuRefrigerante.marca = "Coca-Cola";
        meuRefrigerante.tamanho = "F50";
        meuRefrigerante.preco = 7.50;
        
        System.out.println(meuRefrigerante.marca);
        System.out.println(meuRefrigerante.tamanho);
        System.out.println(meuRefrigerante.preco);
        
        
        
        
        String resp;
        meuRefrigerante.setmarca("Coca-Cola");
        
       
    }
    }
    

