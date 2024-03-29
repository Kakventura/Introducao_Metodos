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
public class Exemplo02 {
     public static void main(String[] args) {
        int t;
        //String p;
        digite();
       /* p = JOptionPane.showInputDialog ("Digite uma palavra qualquer:");
        t = tamanho (p);
        JOptionPane.showMessageDialog(null, p+" possui "+t+" caracteres");*/
    }
    static void digite(){
        //JOptionPane.showMessageDialog(null, "Digite uma palavra");
        int t;
        String p;
        p = JOptionPane.showInputDialog ("Digite uma palavra qualquer:");
        t = tamanho (p);
        JOptionPane.showMessageDialog(null, p+" possui "+t+" caracteres");
        
    }
    // MÉTODO COM RETORNO DE VALOR //
    static int tamanho(String x){
        return x.length();
    }
}
