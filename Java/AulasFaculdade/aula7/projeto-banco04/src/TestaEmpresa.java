
public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa(1);
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Andrade");
		f1.setSalario(2000);
		f1.aumentarSalario(20);
		f1.setDepartamento("FRONT");
		f1.getDataNascimento().setDia("08");
		f1.getDataNascimento().setMes("10");
		f1.getDataNascimento().setAno("2006");
		
		f2.setNome("Meneses");
		f2.setSalario(3000);
		f2.aumentarSalario(10);
		f2.setDepartamento("BACK");
		f1.getDataNascimento().setDia("20");
		f1.getDataNascimento().setMes("12");
		f1.getDataNascimento().setAno("2005");
		
		empresa.adiciona(f1);
		empresa.adiciona(f2);
		empresa.mostraEmpregados();
		System.out.println("#########################");
		empresa.remove(f1);
		empresa.mostraEmpregados();
		System.out.println("#########################");
		empresa.adiciona(f1);
		empresa.mostraEmpregados();

	}

}
