package com.casadocodigo;

import static org.junit.Assert.*;
import org.junit.Test;

import com.casadocodigo.enums.Cargo;
import com.casadocodigo.model.Funcionario;

public class CalculadoraDeSalarioTest {

	@Test
	public void deveCalcularSalarioParaDesenvolvedorComSalarioAbaixoDoLimite(){
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Maurício", 1500.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}
	
}
