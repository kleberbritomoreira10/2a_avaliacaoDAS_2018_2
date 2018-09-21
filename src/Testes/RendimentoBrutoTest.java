package Testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Aplicacao.RendimentoBruto;

@RunWith(Parameterized.class)
class RendimentoBrutoTest {
	
	float capitalInicial; 
	double n; 
	float tempo;
	
	@BeforeEach
	private void setUp() throws Exception {
		
	}
	
	public RendimentoBrutoTest(float capitalInicial, double n, float tempo) {
		this.capitalInicial = capitalInicial;
		this.n = n;
		this.tempo = tempo;
	}
	
	@Parameters
	public static Collection<Object[]> getParameters() {
		// PARAMETROS 1 - Cadastro de um rendimento apenas
		        RendimentoBruto[] rendimentos1 = new RendimentoBruto[] {
						new RendimentoBruto(1000, 0.085, 60)
				};
				Object[] parametros1 = new Object[]{rendimentos1};
		
				// PARAMETROS 2 - Cadastro de um rendimento apenas
		        RendimentoBruto[] rendimentos2 = new RendimentoBruto[] {
						new RendimentoBruto(100, 0.075, 390)
				};
				Object[] parametros2 = new Object[]{rendimentos2};
		
			// PARAMETROS 3 - Cadastro de um rendimento apenas
		        RendimentoBruto[] rendimentos3 = new RendimentoBruto[] {
						new RendimentoBruto(250, 0.080, 420)
				};
				Object[] parametros3 = new Object[]{rendimentos3};		
		
				return Arrays.asList(new Object[][] {
					parametros1, 
					parametros2, 
					parametros3
				});
	}

	@Test
	public void testCadastrarRendimento() {
		assertEquals(13.97, parametros1);
		assertEquals(8.01, parametros2);
		assertEquals(23.01, parametros3);
	}
	
}
