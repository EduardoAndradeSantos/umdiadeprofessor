package testetetetete;

//Classe
public class Orientado {
	//propriedades
	public int valor1=2;
	public int valor2=3;
	public int soma;
	public int multiplicacao;
	public int subtracao;
	
	//m�todos
	public void somarValores() {
		soma = (valor1 + valor2);
		System.out.println("Soma: "+soma);
	}
	
	//m�todos
	public void multiplicarValores() {
		multiplicacao = (valor1 * valor2);
		System.out.println("Multiplica��o: "+multiplicacao);
	}
	
	//m�todos
	public void subtrairValores() {
		subtracao = (valor1 - valor2);
		System.out.println("Subtra��o: "+subtracao);
	}

}
