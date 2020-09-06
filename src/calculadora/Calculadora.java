package calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) throws IOException {
        
        Scanner scan = new Scanner(System.in);
        
        int num1, num2;
        short option;
        
        System.out.print("Seja bem-vindo(a) à calculadora do Rafael!\n");
        
        do {
            do {
                System.out.print("Escolha uma das opções a seguir:\n");
                System.out.print("\n1 - Soma;\n"
                                + "2 - Subtração;\n"
                                + "3 - Multiplicação;\n"
                                + "4 - Divisão;\n"
                                + "5 - Elevar ao quadrado;\n"
                                + "0 - Sair;\n");
                
                option = scan.nextShort();
                
                if (option > 5 || option < 0) {
                    System.out.print("Opção inválida!\nPressione a tecla ENTER para continuar.\n");
                    System.in.read();
                }
            } while (option > 5 || option < 0);
        
            switch (option) {
                case 5:
                    System.out.print("Informe número que será elevado ao quadrado: ");
                    num1 = scan.nextInt();
                    System.out.print("\nO resultado do número " + num1
                            + " elevado ao quadrado é: " + quadrado(num1) + "\n\n" + 
                                            "Pressione a tecla ENTER para continuar.\n");
                    System.in.read();
                    break;
                case 0:
                    System.out.print("Encerrando programa.\n");
                    break;
                default:
                    System.out.print("Informe o primeiro número: ");
                    num1 = scan.nextInt();
                    System.out.print("Informe o segundo número: ");
                    num2 = scan.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print(
                                    "\nO resultado da soma é: " +
                                        somar(num1, num2) + "\n\n" + 
                                            "Pressione a tecla ENTER para continuar.\n");
                            System.in.read();
                            break;
                        case 2:
                            System.out.print(
                                    "\nO resultado da subtração é: " +
                                            subtrair(num1, num2) + "\n\n" + 
                                            "Pressione a tecla ENTER para continuar.\n");
                            System.in.read();
                            break;
                        case 3:
                            System.out.print(
                                    "\nO resultado da multiplicação é: " +
                                            multiplicar(num1, num2) + "\n\n" + 
                                            "Pressione a tecla ENTER para continuar.\n");
                            System.in.read();
                            break;
                        case 4:
                            System.out.printf("%s %.2f\n\n",
                                    "\nO resultado da divisão é: ",
                                            dividir(num1, num2));
                            System.out.print("Pressione a tecla ENTER para continuar.\n");
                            System.in.read();
                            break;
                        default:
                            System.out.print("\nOpção inválida. Encerrando programa!\n");
                    } break;
            } 
        } while (option <= 5 && option != 0);        
    }
    
    public static int somar(int a, int b)
    {
        return (a + b);
    }
    
    public static int subtrair(int a, int b)
    {
        return (a - b);
    }
    
    public static int multiplicar(int a, int b)
    {
        return (a * b);
    }
    
    public static float dividir(float a, float b)
    {
        return (a / b);
    }
    
    public static int quadrado(int a)
    {
        return a * a;
    }
}