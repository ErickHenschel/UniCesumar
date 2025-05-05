public class Cachorro extends Animal {
    
    Animal cachorro = new Animal("Naomi");

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String fazerSom(){
        return "Au au!";
    }
    
}
