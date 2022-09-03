package aula14;

public class Assalariado extends Funcionario{
	private double adicional;
	
	public Assalariado(String nome, long cpf, double salarioBase, double adicional) {
		super(nome, cpf, salarioBase);
		this.adicional = adicional;
	}
	
	public double calcularSalario() {
		return (this.salarioBase + this.adicional);
	}

}
