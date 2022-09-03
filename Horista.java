package aula14;

public class Horista extends Funcionario{
	private int horasTrabalhadas;
	private double precoHora, salario;
	
	public Horista(String nome, long cpf, double salarioBase, int horasTrabalhadas, double precoHora) {
		super(nome, cpf, salarioBase);
		this.horasTrabalhadas = horasTrabalhadas;
		this.precoHora = precoHora;
	}
	
	public double calcularSalario() {
		salario = horasTrabalhadas*precoHora;
		return (this.salarioBase + salario);
	}
}
