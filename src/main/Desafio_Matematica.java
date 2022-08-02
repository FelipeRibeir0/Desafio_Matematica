package main;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

import res.Continue;
import res.IntOrDouble;

public class Desafio_Matematica {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Random gerador = new Random();
		Continue repetir;
		repetir = new Continue();
	    IntOrDouble num1,num2,resp;
		num1 = new IntOrDouble();
		num2 = new IntOrDouble();
		resp = new IntOrDouble();
		int desafio;
	    double n1, n2,resposta;
		boolean acertou;

		do 
		{
			int acertos = 0;
			System.out.println("    Desafios de Matemática!!\n\n"
					+ "             EASY		   \n\n"
					+ "0 - Sair               [<--]\n"
					+ "1 - Soma               [ + ]\n"
					+ "2 - Subtração          [ - ]\n\n"
					+ "     	   NORMAL		   \n\n"
					+ "3 - Multiplicação      [ x ]\n"
					+ "4 - Divisão            [ ÷ ]\n\n"
					+ "     	  DIFÍCIL		   \n\n"
					+ "5 - Potenciação        [ x²]\n"
					+ "6 - Fatorial           [ x!]");
			desafio = sc.nextInt();
			
			switch (desafio)
			{
			case 0:
			{
				
			}
			break;
			
			case 1: do 
			{
				num1.n = gerador.nextInt(1,100);
				num2.n = gerador.nextInt(1,90);

				System.out.print("\n"+num1.check()+" + "+num2.check()+" = " );
				resposta = sc.nextInt();
				if (resposta == num1.n+num2.n) 
				{
					System.out.println("Acertou!!");
					acertos++;
				}

			} while (resposta == num1.n+num2.n);
			break;
			
			case 2: do 
			{
				num1.n = gerador.nextInt(1,100);
				num2.n = gerador.nextInt(1,90);
	
				System.out.print("\n"+num1.check()+" - "+num2.check()+" = " );
				resposta = sc.nextInt();
				if (resposta == num1.n-num2.n) 
				{
					System.out.println("Acertou!!");
					acertos++;
				}
			} while (resposta == num1.n-num2.n);
			break;
			
			case 3: do 
			{
				num1.n = gerador.nextInt(1,80);
				num2.n = gerador.nextInt(1,20);

				System.out.print("\n"+num1.check()+" x "+num2.check()+" = " );
				resposta = sc.nextInt();
				if (resposta == num1.n*num2.n) 
				{
					System.out.println("Acertou!!");
					acertos++;
				}
			} while (resposta == num1.n*num2.n);
			break;
			
			case 4: do 
			{
				acertou = false;
				n1 = gerador.nextInt(1,80);
				n2 = gerador.nextInt(1,60);
	
				 DecimalFormat df = new DecimalFormat("#.##");
				 String txt1 = df.format(n1), txt2 = df.format(n2);
				 int div1 = Integer.parseInt(txt1);
				 int div2 = Integer.parseInt(txt2);
				 
				System.out.print("\n"+df.format(n1)+" ÷ "+df.format(n2)+" = " );
				resposta = sc.nextDouble();
				if (resposta == (div1/div2))
				{
					System.out.println("Acertou!!");
					acertos++;
					acertou = true;
				}
			} while (acertou == true);
			break;
			
			case 5: do 
			{
				acertou = false;
				num1.n = gerador.nextInt(1,20);
				int expo = gerador.nextInt(1,6);

				System.out.printf("\n"+num1.check());
				
				switch (expo) 
				{
				case 1:
					System.out.print("¹ = ");
					break;
				case 2:
					System.out.print("² = ");
					break;
				case 3:
					System.out.print("³ = ");
					break;
				case 4:
					System.out.print("⁴ = ");
					break;
				case 5:
					System.out.print("⁵ = ");
					break;
				case 6:
					System.out.print("⁶ = ");
					break;
				}
				
				resposta = sc.nextDouble();
				if (resposta == Math.pow(num1.n,expo)) 
				{
					System.out.println("Acertou!!");
					acertos++;
					acertou = true;
				}
			} while (acertou == true);
			break;
			
			case 6: do 
			{
				int fat = gerador.nextInt(1,15);
				System.out.print(fat+"! = " );
	            resp.n  = fat;
	            for (double i = fat - 1; i >= 1; i--)
	            {	
	                resp.n *= i;
	            }
	            if (fat == 0) 
	            {
	            	resp.n = 1;
	            }
	            num2.n = sc.nextDouble();
		            
			if (num2.n == resp.n) 
			{
				System.out.println("Acertou!!");
				acertos++;
			}
			
			}while (num2.n == resp.n);
			}
			
			if (acertos == 1) 
			{
				System.out.println("Você acertou "+acertos+" vez.");
			}
			else if (acertos == 0) 
			{
				System.out.println("Você acertou nem 1 vez...");
			}
			else 
			{
				System.out.println("Você acertou "+acertos+" vezes consecutivas.");
			}
			if (desafio != 0)
			{
			System.out.println("\nDeseja tentar novamente? {s/n}");
			repetir.test = sc.next().toLowerCase();
			}
			else 
			{
				repetir.test = "n";
			}
			repetir.go();
			
		}while (repetir.test.charAt(0) == 's');
			
		sc.close();
	}
}
