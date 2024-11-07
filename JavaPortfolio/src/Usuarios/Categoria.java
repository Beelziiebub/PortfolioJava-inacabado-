package Usuarios;

public class Categoria {
    private String nome;

    // Construtor de dados 
    
    public Categoria(String nome) {
        this.nome = nome;
    }

   // Funções básicas
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
