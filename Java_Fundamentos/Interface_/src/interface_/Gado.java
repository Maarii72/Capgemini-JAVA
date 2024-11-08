
package interface_;
public class Gado implements InterfaceAnimal{

    @Override
    public void animalSom() {
        System.out.println("Muuuuu");
    }

    @Override
    public void animalComer() {
        System.out.println("Capim e ração");
    }

    @Override
    public void animalAbrigo() {
        System.out.println("Estrebaria");
    }
    
}
