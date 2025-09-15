
package singleton;

public class CalculadoraIMC {
    private static CalculadoraIMC instancia;
    private CalculadoraIMC(){}
    
    public static CalculadoraIMC getInstancia(){
           if(instancia==null){
              instancia=new CalculadoraIMC();
           }
           return instancia;
    }
    
    public double CalcularIMC(double peso, double altura){
      if(peso<=0||altura<=0){
        throw new IllegalArgumentException("El peso y la altura deben ser mayores que cero");
      }
      return peso/(altura*altura);
    }
    
    public String ClasificarIMC(double imc){
          if(imc<18.5) return "Bajo peso";
          else if (imc<24.9) return "Normal";
          else if(imc<29.9) return "Sobrepeso";
          else return "Obesidad";
    }
}
