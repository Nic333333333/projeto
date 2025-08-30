package com.nicolas.projeto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class VotacaoControllerr {  
    @GetMapping("/votacao")
    public String ContraVotos() {
      int[] votos= {1,2,3,3,2,1,3,3,2,1,4,4,4,2};
      
      int candidato1=0;
      int candidato2=0;
      int candidato3=0;
      int candidato4=0;
      
      for( int voto:votos)// int votos:votos
    {
       if (voto==1){
        candidato1++;
       }
       else if (voto==2) {
           candidato2++;
       } 
        else if (voto==3) {
           candidato3++;
        }
         else if (voto==4) {
           candidato4++;
         }
        }
        String resultado = "";
        resultado += "candidato 1 : " + candidato1 + "votos<br>";
        resultado += "candidato 2 : " + candidato2 + "votos<br>";
        resultado += "candidato 3 : " + candidato3 + "votos<br>";
        resultado += "candidato 4 : " + candidato4 + "votos<br>";
        return resultado;
                
        
       }
    }
    
  

    

