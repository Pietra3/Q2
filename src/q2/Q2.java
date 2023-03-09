package q2;

public class Q2 {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setEndereco("Rua Castelo do Piaui 4345");
        p.setTelefone("88849761");
        p.status();
        Fornecedor f = new Fornecedor(5000, 2000);
        System.out.println(f.imprimir());
        Empregado E = new Empregado();
        E.setCodSetor("B-22 Finanças.");
        E.status2();
        Administrador A= new Administrador(2100,2000);
        A.status3();
    }
}
