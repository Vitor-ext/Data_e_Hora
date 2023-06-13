// Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
// Data: 12/06/2023

import com.sun.source.doctree.SystemPropertyTree;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;
import java.util.SortedSet;

public class Main {
    private static Date agora;
    private static long milisegudos = 1000 * 60 * 60 * 24;
    public static void main(String[] args) {

//        // Solicita a Data de Nascimento do Usuario
//        System.out.println("Informe sua data de Nascimento: ");

        Scanner teclado = new Scanner(System.in);
        String userDate = teclado.next();

        // Data e Hora Atual
        agora = new Date();

        // Data Completa
        System.out.println(agora);

        long data = agora.getTime();

        // Print anos desde 1970
        System.out.println(data/milisegudos/365);
        
//        // Print Informações na Tela
//        JOptionPane.showMessageDialog(null, data, "Data e Hora", 2);
    }
}