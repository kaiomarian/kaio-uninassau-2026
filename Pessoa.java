
public class Pessoa {
    public String nome;
        public int idade;
    public Pessoa(String n){
        nome = n;
    }
    public Pessoa(String n, int i){
        nome = n;
        idade = i;
    }
    void imprimenome(){
        System.out.println("o nome da pessoa é "+nome);
    }
}