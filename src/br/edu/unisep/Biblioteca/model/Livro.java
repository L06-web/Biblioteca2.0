package br.edu.unisep.Biblioteca.model;

public abstract class Livro {
    private String titulo;
    private Autor autor;
    private Genero genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = true;
    }

    public abstract String getDetalhes();

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }
}
