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
public class Exemplo04 {
     public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Entre com um número: "));
        
        // USO DE MÉTODOS EM CONDIÇÕES
        if (RestoPorDois(num) == 0)
            JOptionPane.showMessageDialog(null, "O número é par.");
        else
            JOptionPane.showMessageDialog(null, "O número é impar.");
    }
    
    // CLASSE COM MÉTODOS DE RETORNO
    static int RestoPorDois(int a){
            return a % 2;
    }
}
