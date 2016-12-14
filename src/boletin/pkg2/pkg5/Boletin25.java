/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg5;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float metros, millas;
         final int VALOR=1852;
    Scanner obx = new Scanner(System.in);
     System.out.println("teclea millas");
      millas= obx.nextFloat();
     System.out.println("resultado"+millas*VALOR);
    }
    
}
