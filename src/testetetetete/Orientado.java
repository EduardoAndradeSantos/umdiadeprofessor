package testetetetete;

//Classe
public class Orientado {
	//propriedades
	public int valor1=2;
	public int valor2=3;
	public int soma;
	public int multiplicacao;
	public int subtracao;
	
	//métodos
	public void somarValores() {
		soma = (valor1 + valor2);
		System.out.println("Soma: "+soma);
	}
	
	//métodos
	public void multiplicarValores() {
		multiplicacao = (valor1 * valor2);
		System.out.println("Multiplicação: "+multiplicacao);
	}
	
	//métodos
	public void subtrairValores() {
		subtracao = (valor1 - valor2);
		System.out.println("Subtração: "+subtracao);
	}

}
