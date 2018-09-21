package Aplicacao;

public class RendimentoBruto {
	
	float capitalInicial; 
	double n; 
	float tempo;
	
	public RendimentoBruto(float capitalInicial, double n, float tempo) {
		this.capitalInicial = capitalInicial;
		this.n = n;
		this.tempo = tempo;
	}
	
	public static float calcularRendimentoBruto(float capitalInicial, double n, float tempo) {
		
		return (float) (capitalInicial*n*(tempo/365));
	}
	
}
