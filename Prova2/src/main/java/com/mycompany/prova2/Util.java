/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova2;

/**
 *
 * @author Aluno
 */
public class Util {
    
   
public static String formataData(LocalData data){
DataTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
return formater.format(data);
}
public static String formatarMonetario (double valor){
NumberFormat formatar = NumberFormat.getCurrencyInstance();
return formatar.format(valor);
}
}
    

