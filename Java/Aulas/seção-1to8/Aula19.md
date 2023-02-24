mod 61                                                                                                 20/05/21

Funções em JAVA

    Para declarar uma função em JAVA, deve-se colocar uma função
fora do escopo main, pois o proprio escopo main é uma função.

   A forma da função fica sendo usada como algo relacionado a ori-
entação a objetos, de forma que possui os parametros public e 
static, aparentemente existem mais desses parametros no JAVA,
então eu vou colocar dois aqui e na aula desses parametros no 
java

public = para ser usada ao público(outras classes)

e outras três que vão depois do public que provavelmente fazem
parte de um grupo com muito mais do que o public:

main  = fala para o java que essa é a função principal que deve ser
lida em primeiro lugar 

static = para essa função ser chamada independente de ser criado
um objeto.

void = não retorna um valor e sim faz uma ação.


essas funções que usam static devem retornar um valor pelo visto
e esse valor deve ser colocado após um prefixo chamado de 
return.

Ex: 

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {

		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
			return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
