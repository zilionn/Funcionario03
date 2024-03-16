package view;

import model.Funcionario;

public class RegistrarFuncionario {

	public static void main(String[] args) {
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		
		func1.setNome("Fernando");
		func1.setCargo("Analista");
		func1.setSalario(4000.00);
		
		double salLiquido1 = func1.getSalarioLiquido(150, 300);
		
		func2.setNome("João");
		func2.setCargo("Estagiário");
		func2.setSalario(1412.00);
		
		double salLiquido2 = func2.getSalarioLiquido(100, 0);
		
		System.out.println("----------------------------");
		System.out.println("/FUNCIONARIOS/");
		System.out.println("----------------------------");
		
		System.out.println("NOME: " + func1.getNome());
		System.out.println("CARGO: " + func1.getCargo());
		System.out.println("SALÁRIO BRUTO: " + func1.getSalario());
		System.out.println("SALÁRIO LÍQUIDO: " + salLiquido1);
		
		System.out.println("-----------------------------");
		
		System.out.println("NOME: " + func2.getNome());
		System.out.println("CARGO: " + func2.getCargo());
		System.out.println("SALÁRIO BRUTO: " + func2.getSalario());
		System.out.println("SALÁRIO LÍQUIDO: " + salLiquido2);
		
		System.out.println("-----------------------------");
		
	}

}
