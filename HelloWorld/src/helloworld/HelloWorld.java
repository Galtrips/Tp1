/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author p2103678
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i =0;
        System.out.println("Hello World!!!");
        i++;
        System.out.println("Valeur de i :"+i);
        
        Date d= new Date(30, 3, 2022);
        d.affiche();
    }
}
