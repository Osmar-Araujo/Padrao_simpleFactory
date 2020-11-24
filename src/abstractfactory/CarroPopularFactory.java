
package abstractfactory;


 
public class CarroPopularFactory extends CarroFactory{

   
    public Roda montarRoda() {
        System.out.println("Esta é uma Roda Simples para um Carro Popular");
        return new RodaSimples();
    }

    
    public Som montarSom() {
        System.out.println("Este é um Toca Fitas para um Carro Popular");
        return new TocaFitas();
    }
    
}
