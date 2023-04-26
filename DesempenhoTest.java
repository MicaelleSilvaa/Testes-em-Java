package aula_junit.parte01;

import static org.junit.Assert.*;

import org.junit.Test;

public class DesempenhoTest {

	@Test
	public void testValoresValidos1() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 7;
		float nota2 = 8;
		float freq = 0.88f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("", desempenho, desempenho);
		 assertEquals("CT01", esperado, obtido);
		
	}

	@Test
	public void testValoresValidos2() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 7;
		float nota2 = 7;
		float freq = 0.75f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT04", esperado, obtido);
		
	}
	
	@Test(expected=ValorInvalidoException.class)
	public void testValoresInvalidos1() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = -1;
		float nota2 = -1;
		float freq = 0.88f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT11", esperado, obtido);
		
	}
	
	@Test
	public void testValoresValidos3() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 9;
		float nota2 = 10;
		float freq = 0.60f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT04", esperado, obtido);
		
	}
	
	
	@Test
	public void testValoresValidos4() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 0;
		float nota2 = 11;
		float freq = 0.88f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT04", esperado, obtido);
		
	}
	
	@Test
	public void testValoresValidos5() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 8;
		float nota2 = 9;
		float freq = 7.0f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT04", esperado, obtido);
		
	}
	
	
	@Test
	public void testValoresValidos6() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = -5;
		float nota2 = 9;
		float freq = 7.0f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT04", esperado, obtido);
		
	}
	
	@Test
	public void testValoresValidos7() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 15;
		float nota2 = 9;
		float freq = 7.0f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, freq);
		
		// Verificacao do teste
		assertEquals("CT04", esperado, obtido);
		
	}
	
	@Test
	public void testValoresValidos8() throws ValorInvalidoException {
		// Dados de entrada e saida - do caso de teste CT01
		float nota1 = 15;
		float nota2 = 9;
		float media = 8.0f;
		boolean esperado = true;
		
		// Execucao do metodo
		Desempenho desempenho = new Desempenho();
		boolean obtido = desempenho.verificarAprovacao(nota1, nota2, media);
		
		// Verificacao do teste
		assertEquals("CT05", esperado, obtido);
		
	}
	


	
	
	

	
	

}
