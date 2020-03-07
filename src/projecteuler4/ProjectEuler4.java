/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler4;

/**
 *
 * @author Fernando Baladi
 */
public class ProjectEuler4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=100, num2=10;
        long aux=0, aux2=0;
        for (int i = 100; i <1000; i++) {
            aux=num1*num2;
            if ((Add(aux)==aux)&&(aux>aux2)){
                aux2=aux;
                System.out.println(num1+ " * "+ num2 + " = " + aux);
            }
            for (int j = 100; j <1000; j++) {
                aux=num1*num2;
                if ((Add(aux)==aux)&&(aux>aux2)){
                    aux2=aux;
                    System.out.println(num1+ " * "+ num2 + " = " + aux);
                }
                num2++;
            }
            num1++;
            num2 = 100;
        }
        System.out.println(aux2);
    }

    public static long Add(long num){
        long rev2, rev4=0;    
        while(num!=0){
            rev2 = num % 10;
            num = num / 10;
            rev4 = (rev4 *10) + rev2;
        }
        return rev4;
    }    
}
