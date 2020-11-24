
package abstractfactory;


public class CarroLuxoFactory extends CarroFactory{

    
    public Roda montarRoda() {
        System.out.println("Esta é uma Roda de Liga Leve para um carro de Luxo");
        return new RodaLigaLeve();
    }

    
    public Som montarSom() {
        System.out.println("Este é um CD Player para um carro de Luxo");
        return new CDPlayer();
    }
    
}
