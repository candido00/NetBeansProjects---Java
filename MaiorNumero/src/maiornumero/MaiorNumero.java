
package maiornumero;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Informe o primeiro numero: ");
        num1 = scan.nextInt();
        System.out.println("Informe o segundo numero: ");
        num2 = scan.nextInt();
        System.out.println("Informe o terceiro numero: ");
        num3 = scan.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
            
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2);
            
        }else if(num3 > num1 && num3 > num2){
            System.out.println(num3);
            
        }else if(num1 == num2 && num2 == num3){
            System.out.println("Os tres numeros sao iguais.");
        }
        }
    }
    
