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
public class Exemplo03 {
    public static void main(String[] args) {
        
        // VARIÁVEIS
        int idade1, idade2;
        String nome1, nome2;
        
        // RECEBER VARIÁVEIS
        nome1 = JOptionPane.showInputDialog("Digite o nome da 1° pessoa:");
        idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 1° pessoa:"));
        nome2 = JOptionPane.showInputDialog("Digite o nome da 2° pessoa:");
        idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da 2° pessoa:"));
        
        // COLOCAR MÉTODO A UMA VARIÁVEL
        String texto = PessoaMaisVelha(nome1, idade1, nome2, idade2);
    }
    
    // CRIAÇÃO DE MÉTODOS COM PARAMETROS E DECISÃO
    static String PessoaMaisVelha(String n1, int id1, String n2, int id2){
        if (id1 > id2)
            // RETORNO 
            return n1 + "é a pessoa mais velha";
        else
            if(id2 > id1)
                return n2 + "é a pessoa mais velha";
            else
                return n1 + " e " + n2 + " tem a mesma idade";
    }
}
