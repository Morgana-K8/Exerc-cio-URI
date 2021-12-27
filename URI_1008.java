/*
Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
*/

import java.util.Locale; 
import java.util.Scanner; 

public class URI_1008 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int numeroFuncionario = teclado.nextInt();
        int qtdHorasTrabalhadas = teclado.nextInt();
        double valorHora = teclado.nextDouble();
        double salario = qtdHorasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        teclado.close();

    }
  
}

    
/*
Exemplos de Entrada	
25
100
5.50

Exemplos de Saída

NUMBER = 25
SALARY = U$ 550.00

1
200
20.50

NUMBER = 1
SALARY = U$ 4100.00

6
145
15.55

NUMBER = 6
SALARY = U$ 2254.75
*/