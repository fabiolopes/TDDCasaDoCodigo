package com.casadocodigo;

import java.util.HashMap;
import java.util.Map;

public class ConversorDeNumeroRomano {

	@SuppressWarnings("serial")
	private static final Map<Character, Integer> tabela = 
			new HashMap<Character, Integer>(){{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}};	
	
	public int converte(String numeroEmRomano){
		int acumulador = 0;
		int ultimoVizinhoDaDireita = 0;
		int atual = 0;
		for(int i = numeroEmRomano.length() - 1; i >= 0; i--){
			int multiplicador = 1;
			atual = tabela.get(numeroEmRomano.charAt(i));
			if(atual < ultimoVizinhoDaDireita) multiplicador = -1;
			acumulador += atual * multiplicador;
			ultimoVizinhoDaDireita = tabela.get(numeroEmRomano.charAt(i));
		}
		return acumulador;
	}
	
}
