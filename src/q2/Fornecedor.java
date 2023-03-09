package q2;
public class Fornecedor extends Pessoa {
    protected int valorCredito;
    protected int valorDivida;
    protected int obterSaldo;
    public void setvalorCredito(int valorCredito){
        this.valorCredito= valorCredito;
    }
    public int getvalorCredito(){
        return valorCredito;
    }
    public void setvalorDivida(int valorDivida){
        this.valorDivida= valorDivida;
    }
    public int getvalorDivida(){
        return valorDivida;
    }
    public void setobterSaldo(int obterSaldo){
        this.obterSaldo=obterSaldo;
    }
    public int getobterSaldo(){
        return obterSaldo;
    }
    public int saldo(){
        return obterSaldo = valorCredito-valorDivida;
}
    public String imprimir(){
        return "Saldo: "+obterSaldo;       
    }
    Fornecedor (int valorCredito,int valorDivida){
        this.valorCredito= valorCredito;
        this.valorDivida= valorDivida;
    }
    Fornecedor (){}
}
