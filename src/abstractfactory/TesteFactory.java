
package abstractfactory;


public class TesteFactory {

    private static Carro MontarCarro(String tipo){
        CarroFactory cf = null;
        switch(tipo){
        case "luxo" :
            cf = new CarroLuxoFactory();
            break;
        case "popular" :
            cf = new CarroPopularFactory();
        }
        Carro carro = new Carro();
        carro.setRoda(cf.montarRoda());
        carro.setSom(cf.montarSom());
        return carro;
    }
  public static void main (String [] args){
      Carro c1 = MontarCarro("luxo");
      Carro c2 = MontarCarro("popular");
      
      
  }
}
