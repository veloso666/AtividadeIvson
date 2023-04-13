package atividade2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Viagem;

public class program {

	public static void main(String[] args) throws ParseException {//inicio do programa, com um possivel exceção 
		Scanner sc = new Scanner(System.in);
		  
		System.out.println("informe o modal(1(aereo), 2(terrestre), 3(naval)): ");//pergunta ao usuario
		Integer modal = sc.nextInt();
		System.out.println("qual transporte ira utilizar: ");
		String trans = sc.next();
		System.out.println("Qual a data: ");
		String data = sc.next();
		System.out.println("Quantas pessoas vão: ");
		Integer pessoas = sc.nextInt();
		
		Viagem viagem = new Viagem(modal, trans, data, pessoas);
		
		System.out.println("Qual o modal ira ser usado: "+ viagem.getModel());//saida de dados
		System.out.println("qualo tipo do transporte: "+ viagem.getTransporte());
		System.out.println("Qual a data da viagem: " + viagem.getDesclocamento());
		System.out.println("Qual a quantidade de pessoas: " + viagem.getQuantidade());
		System.out.println("Total de gastos: " + viagem.total(modal, pessoas));
	
	}

}
