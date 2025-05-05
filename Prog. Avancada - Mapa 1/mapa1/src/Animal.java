public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String fazerSom(){
        return "Som desconhecido!";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;

    }
}
