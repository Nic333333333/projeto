package com.nicolas.projeto;

public class funcoes3 {
    public static int calcularArea(int largura,int altura){
         int area= largura *altura;
         return area;
    } 
    public static void main(String[] args) {
        int areaCalcuda = calcularArea(5,10);
System.out.println("a area é : "+ areaCalcuda);

}
}