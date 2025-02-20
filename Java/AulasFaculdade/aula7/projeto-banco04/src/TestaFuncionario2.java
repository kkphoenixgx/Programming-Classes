
public class TestaFuncionario2 {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Andrade");
		f1.setSalario(2000);
		f1.aumentarSalario(20);
		f1.setDepartamento("FRONT");
		
		f2.setNome("Andrade");
		f2.setSalario(2000);
		f2.aumentarSalario(20);
		f2.setDepartamento("FRONT");
		
		System.out.println("Funcionario f1:");
		f1.mostra();
		System.out.println("Funcionario f2:");
		f2.mostra();
		System.out.println("#######################################");
		if(f1==f2)
			System.out.println("IGUAIS");
		else
			System.out.println("DIFERENTES");

	}

}
