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
public class Util {
    public static int obterDigito(long numero, int posicao){
        long aux = numero;
        int soma = 0;
        for (int i = 2; i <= 10; i++) {
            soma += (int)aux%10*i;
            aux /= 10;
        }
        if(posicao==2){
            aux = numero;
            soma = (int)(((soma*10)%11)%10)*2;
            for (int i = 3; i <= 11; i++) {
                soma += (int)aux%10*i;
                aux /= 10;
            }
            return (int)((soma*10)%11)%10;
        }
        return (int)((soma*10)%11)%10;
    }
    
    public static boolean validarCpf(long cpf){
        return obterDigito(cpf/100, 2) == cpf%10 && Util.obterDigito(cpf/100, 1) == (cpf%100)/10;
    }
    
    public static boolean validarCpf(String cpf){
        long lcpf = 0;
        lcpf = Character.getNumericValue(cpf.charAt(0));
        for (int i = 1; i < 14; i++) {
            if(i!=11&&i!=7&&i!=3){
                lcpf *=10;
                lcpf += Character.getNumericValue(cpf.charAt(i));
            }
        }
        return validarCpf(lcpf);
    }
}
