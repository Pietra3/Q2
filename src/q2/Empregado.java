
package q2;

class Empregado extends Pessoa {
    public String CodSetor;
    public int SalBase;
    public int CalcularSalario;
    
    public void setCodSetor(String codSetor){
        this.CodSetor= codSetor;
    }
    public String getCodSetor(){
        return CodSetor;  
    }
    public void setSalBase(int salBase){
        this.SalBase=salBase;
    }
    public int getSalbase(){
        return SalBase;
    }
     public void setCalcularSalario(int calcularSalario){
        this.CalcularSalario=calcularSalario;
    }
    public int getCalculo(){
        return CalcularSalario = (int)(SalBase- 0.3);      
    }
    Empregado (int salBase ){
        this.SalBase= salBase;
    }
     public void status2(){
        System.out.println("Codigo: "+this.CodSetor);
        System.out.println("Salario do Empregado: "+this.CalcularSalario);
     }
    Empregado(){}

}