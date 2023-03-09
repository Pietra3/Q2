package q2;
public class Administrador extends Empregado {
   public int ajudaCusto;
   public int Salario;
   public void setajudaCusto(int ajudaCusto){
       this.ajudaCusto=ajudaCusto;
   }
   public int getajudacusto(){
       return ajudaCusto;
   }

    public void setCalcularSalario(int calcularSalario){
        this.CalcularSalario=calcularSalario;
    }
  
    public int getCalculo(){
        return CalcularSalario;
    }
    
    public int calculo(){
        return CalcularSalario = Salario-ajudaCusto;      
    } 
    Administrador (int ajudaCusto,int Salario ){
        this.ajudaCusto= ajudaCusto;
        this.Salario=Salario ;
    }
       public void status3(){
        System.out.println("Salario do Adm: "+this.CalcularSalario);
      }
    Administrador (){}
}
