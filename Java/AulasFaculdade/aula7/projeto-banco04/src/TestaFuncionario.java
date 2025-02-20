
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Andrade");
		f1.setSalario(2000);
		f1.aumentarSalario(20);
		f1.setDepartamento("FRONT");
		
		f2.setNome("Meneses");
		f2.setSalario(3000);
		f2.aumentarSalario(10);
		f2.setDepartamento("BACK");
		
		System.out.println("Funcionario f1:");
		System.out.println("Nome: "+f1.getNome());
		System.out.println("Salario: "+f1.getSalario());
		System.out.println("Departamento: "+f1.getDepartamento());
		if(f1.isAtivo())
			System.out.println("Status: ativo");
		else
			System.out.println("Status: inativo");

		System.out.println("Funcionario f2:");
		f2.mostra();

	}

}
