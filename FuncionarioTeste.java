package aula14;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario func1 = null;
		Funcionario func2 = null;
		Funcionario func3 = null;
		
		func1 = new Assalariado("Joao Andrade", 810271374, 2000.00, 500.00);
		System.out.println("Assalariado: R$" + func1.calcularSalario());
		
		func2 = new Comissionado("Ana de Oliveira", 46572819, 2000.00, 35, 20);
		System.out.println("Comissionado: R$" + func2.calcularSalario());
		
		func3 = new Horista("Paula Santana", 17016009, 2000.00,40, 25);
		System.out.println("Horista: R$" + func3.calcularSalario());

	}

}
