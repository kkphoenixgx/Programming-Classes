# ReapostaP3
2025-02-12
tags: [[☕ indexJava]]

## Questão: 

Aqui está a transcrição do conteúdo da prova para texto:

---

**CEFET – Disciplina: Programação Orientada a Objetos (p3)**

Considere a existência da seguinte tabela na base de dados `testebd`.

```sql
USE testebd;
CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descrição VARCHAR(30) NOT NULL,
    preço_de_custo DECIMAL(10,2)
) ENGINE=InnoDB;
```

Considere a existência da classe `BDSingleton` conforme o código abaixo.

```java
public class BDSingleton {
    private Connection conexao = null;
    private static BDSingleton instanceio = null;

    // Construtor privado
    private BDSingleton() {
        String urlCon = "jdbc:mysql://localhost/testebd?useUnicode=yes&characterEncoding=UTF-8";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conexao = DriverManager.getConnection(urlCon, "root", "");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Erro ao conectar com o BD: " + e.getMessage());
        }
    }

    // Método synchronized para acesso exclusivo ao método
    public static synchronized BDSingleton getInstanceio() {
        if (BDSingleton.instanceio == null) {
            BDSingleton.instanceio = new BDSingleton();
        }
        return BDSingleton.instanceio;
    }

    public Connection getConexao() {
        return this.conexao;
    }
}
```

Considere a existência de uma classe `Produto` com os atributos `id`, `descrição` e `precoDeCusto`.

Observe atentamente o código abaixo e, com exceção de `BDSingleton` e `Produto`, escreva todo o código necessário para o sistema funcionar.

```java
public class TestaProdutoDao {
    public static void main(String[] args) {
        Connection conexao = BDSingleton.getInstanceio().getConexao();
        ProdutoDao dao = new ProdutoDao(conexao);
        Produto p1 = new Produto("Cerveja Heineken 350ml", 4.99);
        Produto p2 = new Produto("Cerveja Becks 350ml", 4.79);
        List<Produto> produtos = new ArrayList<Produto>();

        try {
            dao.insert(p1);
            dao.insert(p2);
            produtos = dao.getAll();
        } catch (DaoException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Lista de produtos:");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId());
            System.out.println("DESCRIÇÃO: " + produto.getDescrição());
            System.out.println("PREÇO DE CUSTO: " + produto.getPrecoDeCusto());
            System.out.println("############################");
        }
    }
}
```

## Gabarito


```java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection conexao;

    // Construtor para inicializar a conexão com o banco
    public ProdutoDAO(Connection conexao) {
        this.conexao = conexao;
    }

    // Método para listar todos os produtos
    public List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos";

        try (
		    PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setPrecoCusto(rs.getDouble("preco_custo"));
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar produtos: " + e.getMessage());
        }

        return produtos;
    }

    // Método para inserir um novo produto no banco de dados
    public void inserirProduto(Produto produto) {
        String sql = "INSERT INTO produtos (descricao, preco_custo) VALUES (?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPrecoCusto());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    // Método para atualizar um produto no banco de dados
    public void atualizarProduto(Produto produto) {
        String sql = "UPDATE produtos SET descricao = ?, preco_custo = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getDescricao());
            stmt.setDouble(2, produto.getPrecoCusto());
            stmt.setInt(3, produto.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    // Método para excluir um produto do banco de dados
    public void excluirProduto(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }
}
```
