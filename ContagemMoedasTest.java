package aula_junit.parte02;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContagemMoedasTest {

	private ContagemMoedas cont = new ContagemMoedas();
	
	@Test
	public void testValido1() throws Exception {

		
		int [] entrada = {10,0,0,0,0,0};
		int [] esperado = {0,10};
		
		assertArrayEquals(esperado, cont.calcularValorMoedas(entrada));
		
	}

	@Test
	public void testValido2() throws Exception {

		
		int [] entrada = {0,0,0,0,0,250};
		int [] esperado = {250,00};
		
		assertArrayEquals(esperado, cont.calcularValorMoedas(entrada));
		
	}

	
	@Test
	public void testValido3() throws Exception {

		
		int [] entrada = {0,0,0,0,1000,0};
		int [] esperado = {500,00};
		
		assertArrayEquals(esperado, cont.calcularValorMoedas(entrada));
		
	}
	
	@Test
	public void testValido4() throws Exception {

		
		int [] entrada = {0,0,0,0,0,10000};
		int [] esperado = {10,000};
		
		assertArrayEquals(esperado, cont.calcularValorMoedas(entrada));
		
	}

	
	@Test
	public void testValido5() throws Exception {

		
		int [] entrada = {0,0,0,0,100,1000};
		int [] esperado = {1,050};
		
		assertArrayEquals(esperado, cont.calcularValorMoedas(entrada));
		
	}



	


}