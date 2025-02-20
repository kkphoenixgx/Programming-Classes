
public class TestaAgregacao3 {
	public static void main(String[] args) {
		Conta conta1 = new Conta();//#xpto
		conta1.setNumero(1);	
		conta1.getTitular().setNome("Fabricio");
		conta1.getTitular().setEmail("fabricio@cefet-rj.br");
		
		Conta conta2 = new Conta();//#xyz
		conta2.setNumero(2);	
		conta2.getTitular().setNome("Mariana");
		conta2.getTitular().setEmail("mariana@cefet-rj.br");
		
		//System.out.println(conta1.getTitular().getNome());
		//System.out.println(conta2.getTitular().getEmail());
		
		conta1.mostrarDados();
		conta2.mostrarDados();
	}
}
