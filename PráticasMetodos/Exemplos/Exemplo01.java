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
public class Exemplo01 {
    
    // CLASSE DE EXECUÇÃO //
    public static void main(String[] args) {
        digite();
    }
    
    // MÉTODOS //
    static void digite(){
        //JOptionPane.showMessageDialog(null, "Digite um número");
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        dobro (a);
    }
    static void dobro(int n){
        int d = n * 2;
        JOptionPane.showMessageDialog (null, "Dobro de "+n+" é " +d);
    }
}