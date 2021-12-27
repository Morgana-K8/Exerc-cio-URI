/*
Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/

import java.util.Locale;
import java.util.Scanner;

public class URI_1009 {
   public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner teclado = new Scanner(System.in);

       String nomeFuncionario = teclado.next();
       double salarioFixo = teclado.nextDouble();
       double vendasEfetuadas = teclado.nextDouble();
       double comissao = vendasEfetuadas * 0.15;
       double salarioFinal = salarioFixo + comissao;

       System.out.println("NOME = " + nomeFuncionario);
       System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

       teclado.close();

   }

}
    
/*

Exemplos de Entrada
JOAO
500.00
1230.30
NOME = Anna      
TOTAL = R$ 684.55

PEDRO
700.00
0.00
NOME = PEDRO     
TOTAL = R$ 700.00

MANGOJATA 
1700.00
1230.50
NOME = MANGOJATA
TOTAL = R$ 1884.58
*/