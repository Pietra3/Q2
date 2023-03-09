
package q2;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    
    public void setNome(String Nome) {
        this.nome = Nome;
    }
    public String getNome() {
        return nome;
    }
    public void setEndereco(String Endereco) {
        this.endereco = Endereco;
    }

    public String getEnderco() {
        return endereco;
    }
    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void status(){
        System.out.println("Sobre a pessoa:");
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("Telefone: "+this.telefone);
    }
}


