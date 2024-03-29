/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listametodos;

import javax.swing.JOptionPane;

/**
 *
 * @author dti
 */
public class Diferenca {
    public static void main(String[] args) {
        // PROGRAMA PRINCIPAL
        Diferenca();
    }
    
    // CRIAÇÃO DE MÉTODOS
    static void Diferenca(){
        
        // ATRIBUIÇÃO DE VARIÁVEIS
        double n1, n2, resultado;
        
        // APRESENTAÇÃO DO PROGRAMA
        JOptionPane.showMessageDialog(null, "Este programa calcula a diferença entre dois valores.");
        
        // RECIBIMENTO DE VARIÁVEIS
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 1° valor:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o 2° valor:"));
        
        if(n2 > n1){
            double numMaior = n2;
            resultado = numMaior - n1;
            JOptionPane.showMessageDialog(null, " A diferença entre os números "+ numMaior +" e " + n1 +" é de: " + resultado);
        }
        else if (n1 > n2){
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, " A diferença entre os números "+ n1 +" e " + n2 +" é de: " + resultado);
            }
        else
            JOptionPane.showMessageDialog(null, " O números são iguais, portanto não possuem diferença");
    }
}
