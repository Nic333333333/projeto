package com.nicolas.projeto;

public class Exemplo1 {
    public static void main(String[] args) {
        String  name =  "nicolas" ;
        int  notaDoAluno = 60;
        if (notaDoAluno >= 90){
            System.out.println("conceito A: execente ! ");
        }
        else if (notaDoAluno >=80) {
            System.out.println(" conceito B: muito bom ");
        }
        else if (notaDoAluno >=70) {
            System.out.println("conceito c : bom ");
        }
        else  if  (notaDoAluno >=60){
            System.out.println("conceito d: regular ");
        }
            else {
                System.out.println("conceito f: precisa melhorar");
        }
        
        

    }
}
