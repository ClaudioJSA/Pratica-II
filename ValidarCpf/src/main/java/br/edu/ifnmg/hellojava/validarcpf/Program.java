/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.hellojava.validarcpf;

/**
 *
 * @author Claudio Alcantara &lt;claudio.alcantara at ifnmg.edi.br&gt;
 */
public class Program {
    public static void main(String[] args) {
        
        System.out.println("CPF: 14230703058");
        if(Util.validarCpf(14230703058L))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");
        
        System.out.println("CPF: 142.307.030-58");
        if(Util.validarCpf("142.307.030-58"))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");
        
        System.out.println("CPF: 230703058");
        if(Util.validarCpf(230703058L))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");
        
        System.out.println("CPF: 002.307.030-58");
        if(Util.validarCpf("002.307.030-58"))
            System.out.println("Resposta: Válido.\n");
        else
            System.out.println("Resposta: Inválido.\n");
    }
}
