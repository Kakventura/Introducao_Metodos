/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listametodos;

import javax.swing.JOptionPane;

/**
 *
 * @author aange
 */
public class Hipotenusa {
    // PRINCIPAL PROGRAMA
    public static void main(String[] args) {
        
        //ATRIBUINDO O MÉTODO A UMA VARIÁVEL
         String resultado = hipotenusa();
         // EXIBIÇÃO DO CÁLCULO
         JOptionPane.showMessageDialog(null, resultado);
    }
    
    // CRIAÇÃO DO MÉTODO
    static String hipotenusa(){
        
        // ATRIBUIÇÃO DE VARIÁVEIS
        double base, altura, hipo;
        
        // RECIBIMENTO DE VALORES
        base = Double.parseDouble(JOptionPane.showInputDialog("Insira a base do triângulo em cm:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo em cm:"));
        
        // CÁLCULO DA OPERAÇÃO
        hipo = (base*base) + (altura*altura);
        
        return " A hipotenusa de um triângulo com as medidas:\n Base: "+ base + " cm;\nAltura: "+ altura + " cm;\n É de: "+ Math.sqrt(hipo) + "cm²." ;
    }
}
