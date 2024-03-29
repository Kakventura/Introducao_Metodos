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
public class Menu {
    public static void main(String[] args) {
        
        int decisao;
        
        // CONDIÇÃO DE EXECUÇÃO DE PROGRAMA
        do{
        decisao = Integer.parseInt(JOptionPane.showInputDialog( "Analise o seguinte menu e escolha uma opção válida:"
                + "\n1 - Soma;"
                + "\n2 - Subtração;"
                + "\n3 - Divisão;"
                + "\n4 - Multiplicação;"
                + "\n5 - Resto da Divisão;"
                + "\n6 - Dobro"
                + "\n7 - Quadrado;"
                + "\n8 - Cubo;"
                + "\n9 - Raiz Quadrada;"
                + "\n0 - Sair."));
        
        // EXECUÇÃO DOS MÉTODOS
        switch (decisao){
            case 0:
                JOptionPane.showMessageDialog(null, "Encerrando o programa.");
            break;
            case 1:
                soma();
            break;
            case 2:
                subtracao();
            break;
            case 3:
                divisao();
            break;
            case 4:
                multiplicacao();
            break;
            case 5:
                resto();
            break;
            case 6:
                dobro();
            break;
            case 7:
                quadrado();
            break;
            case 8:
                cubo();
            break;
            case 9:
                raizQuadrada();
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "Insira uma opção válida.");
           }
        }
        while ( decisao !=0 );
    }
    
    // MÉTODOS DE SOMA
    static void soma(){
        JOptionPane.showMessageDialog(null, "Este programa realiza a soma de dois valores.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1, v2;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 1° valor:"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 2° valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "A soma de "+v1+" e "+v2+" é de: "+(v1+v2));
        
    }
    // MÉTODO DE SUBTRAÇÃO
    static void subtracao(){
        JOptionPane.showMessageDialog(null, "Este programa realiza a diferença de dois valores.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1, v2;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 1° valor:"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 2° valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "A diferença de "+v1+" e "+v2+" é de: "+(v1-v2));
    }
    // MÉTODO DE DIVISÃO
    static void divisao(){
        JOptionPane.showMessageDialog(null, "Este programa realiza a divisão de dois valores.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1, v2;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 1° valor:"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 2° valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "A divisão entre "+v1+" e "+v2+" é: "+(v1/v2));
    }
    // MÉTODO DE MULTIPLICAÇÃO
    static void multiplicacao(){
        JOptionPane.showMessageDialog(null, "Este programa realiza a multiplicação de dois valores.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1, v2;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 1° valor:"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 2° valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "A multiplicação entre "+v1+" e "+v2+" é: "+(v1*v2));
    }
    // MÉTODO DE RESTO
    static void resto(){
        JOptionPane.showMessageDialog(null, "Este programa realiza a divisão de dois valores e determina o resto da operação.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1, v2, resto;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 1° valor:"));
        v2 = Double.parseDouble(JOptionPane.showInputDialog("Declare o 2° valor:"));
        // RESPOSTA
        resto = v1 % v2;
        JOptionPane.showMessageDialog(null, "O resto da divisão entre "+v1+" e "+v2+" é de: "+resto);
    }
    // MÉTODO DE DOBRO
    static void dobro(){
        JOptionPane.showMessageDialog(null, "Este programa realiza o dobro de um valor.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "O dobro de "+v1+" é "+(v1*2));
    }
    // MÉTODO DE QUADRADO
    static void quadrado(){
        JOptionPane.showMessageDialog(null, "Este programa realiza o quadrado (²) de um valor.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "O quadrado de "+v1+" é "+Math.pow(v1,2));
    }
    // MÉTODO DE CUBO
    static void cubo(){
        JOptionPane.showMessageDialog(null, "Este programa realiza o cubo (³) de um valor.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o valor:"));
        // RESPOSTA
        JOptionPane.showMessageDialog(null, "O quadrado de "+v1+" é "+Math.pow(v1,3));
    }
    // MÉTODO DE RAIZ QUADRADA
    static void raizQuadrada(){
        JOptionPane.showMessageDialog(null, "Este programa realiza a raíz quadrada de um valor.");
        // ATRIBUIÇÃO E RECEBIEMNTO DE VALORES
        double v1;
        v1 = Double.parseDouble(JOptionPane.showInputDialog("Declare o valor:"));
        // CONDIÇÃO DE NÚMERO
        if(v1<0)
            JOptionPane.showMessageDialog(null, "Não é possiível calcular a raiz quadrada de números negativos");
        else
            JOptionPane.showMessageDialog(null, "O quadrado de "+v1+" é "+Math.sqrt(v1));
    }
    
    
    /* MÉTODO PARA O PROGRAMA CONTINUAR RODANDO
    public static void perguntarSeContinua() {
        int continuar = JOptionPane.showConfirmDialog(null, "Deseja fazer outra operação?", "Continuar?", JOptionPane.YES_NO_OPTION);
        if (continuar == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Saindo do programa.");
            System.exit(0);
        }

    }
*/
}
