import Tests.TestCarro;
import Tests.TestConta;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("--------------------- Conta ---------------------");
        TestConta testConta = new TestConta();
        testConta.initTest();
        System.out.println("--------------------- Carro ---------------------");
        TestCarro testCarro = new TestCarro();
        testCarro.initTestes();
        System.out.println("------------------------------------------");
    }
}
