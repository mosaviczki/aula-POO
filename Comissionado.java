package aula14;

public class Comissionado extends Funcionario{
	private double totalVendas, taxaComissao, comissao;
	
	public Comissionado(String nome, long cpf, double salarioBase, double totalVendas, double taxaComissao) {
		super(nome, cpf, salarioBase);
		this.totalVendas = totalVendas;
		this.taxaComissao = taxaComissao;
	}

	public double calcularSalario() {
		comissao = totalVendas*taxaComissao;
		return (this.salarioBase + comissao);
	}

}
