package com.mycompany.listametodos;


import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aange
 */
public class Lampada {
    // PROGRAMA PRINCIPAL
    public static void main(String[] args) {
        
        // ATRIBUIÇÃO DE VARIÁVEIS
        int estado;
        
        // CONDIÇÃO DE EXECUÇÃO DO PROGRAMA
        do{
            // RECIBIMENTO DE VALORES
            estado = Integer.parseInt(JOptionPane.showInputDialog("Defina o estado da lâmpada:\n0. Desligada;\n1. Ligada."));
            
            // VERIFICAÇÃO DE INFORMAÇÃO INVÁLIDA
            if (estado > 1 || estado < 0)
                JOptionPane.showMessageDialog(null,"Insira uma opção válida.");
            else
                // EXIBIÇÃO
                mostrarEstado(estado);
        }
        while(estado > 1 || estado < 0 );
        JOptionPane.showMessageDialog(null,"Encerrando o programa...");
    }
    // CRIAÇÃO DO MÉTODO
    static void mostrarEstado(int lampada){
        if (lampada == 1)
            JOptionPane.showMessageDialog(null, "A lâmpada está ligada/acesa.");
        else
            JOptionPane.showMessageDialog(null,"A lâmpada está desligada/apagada.");
    }
}
