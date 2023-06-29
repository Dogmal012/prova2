/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.prova2;

/**
 *
 * @author Aluno
 */
public interface SalarioFinal {
    
    /**
     *
     * @return
     */
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * this.PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }
    
}
