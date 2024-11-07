package Usuarios;

import java.time.LocalDateTime;

public class Denuncia {
    private Usuarios usuario;
    private Categoria categoria;
    private String descricao;
    private String status;
    private LocalDateTime dataCriacao;
	private String nome;

    // Construtor de dados
    
    public Denuncia(Usuarios usuario, Categoria categoria, String descricao) {
        this.usuario = usuario;
        this.categoria = categoria;
        this.descricao = descricao;
        this.status = "aberta"; 
        this.dataCriacao = LocalDateTime.now();
    }

    //Get e SET 
 
    public Usuarios getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    

    @Override
    public String toString() {
        return"Denúncia por " + usuario.getNome() + " (" + categoria.getNome() + "): " + descricao + " - Status: " + status;
    }
}

