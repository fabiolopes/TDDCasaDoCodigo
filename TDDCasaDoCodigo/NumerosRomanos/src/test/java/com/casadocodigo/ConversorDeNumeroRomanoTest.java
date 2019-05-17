package com.casadocodigo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderOSimboloI(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		System.out.println("deveEntenderOSimboloI:" + numero);
		assertEquals(1, numero);
	}
	
	@Test
	public void deveEntenderOSimboloV(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("V");
		System.out.println("deveEntenderOSimboloV:" + numero);
		assertEquals(5, numero);
	}
	
	@Test
	public void deveEntenderDoisSimbolosComoII(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		System.out.println("deveEntenderDoisSimbolosComoII:" + numero);
		assertEquals(2, numero);
	}
	
	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		System.out.println("deveEntenderQuatroSimbolosDoisADoisComoXXII:" + numero);
		assertEquals(24, numero);
	}
	
	@Test
	public void deveEntenderSimbolosComoIX(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		System.out.println("deveEntenderSimbolosComoIX:" + numero);
		assertEquals(9, numero);
	} 	
	
	@Test
	public void deveEntenderNumerosComplexosComoXXIV(){
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXIV");
		System.out.println("deveEntenderQuatroSimbolosDoisADoisComoXXII:" + numero);
		assertEquals(24, numero);
	}
	
}
