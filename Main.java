import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String []arg){
        Scanner sc = new Scanner(System.in);



        System.out.println("Digite a primeira numero: ");
        double num1= sc.nextDouble();
        System.out.println("Digite a segundo numero2a: ");
        double num2 = sc.nextDouble();
        System.out.println("Digite a terceiro numero: ");
        double num3 = sc.nextDouble();
        System.out.println("Digite o Quarto numero: ");
        double num4 = sc.nextDouble();
        System.out.println("Digite o Quinto numero: ");
        double num5 = sc.nextDouble();
        System.out.println("Digite o Seisto numero: ");
        double num6 = sc.nextDouble();
        System.out.println("Digite o Setimo numero: ");
        double num7 = sc.nextDouble();
        System.out.println("Digite o Oitavo numero: ");
        double num8 = sc.nextDouble();
        System.out.println("Digite o nono numero: ");
        double num9 = sc.nextDouble();

        double[] numeros = {num1,num2,num3,num4,num5,num6,num7,num8,num9};

        Arrays.sort(numeros);
        System.out.println("\nOrdem Decrescente: "  );
        for(double num : numeros){
            System.out.println(num + "");

        }
        System.out.println("\nOrdem Crescente:");
        for(int i = numeros.length - 1; i >=0 ; i --){
            System.out.println(numeros[i] + "");
        }
    }
}