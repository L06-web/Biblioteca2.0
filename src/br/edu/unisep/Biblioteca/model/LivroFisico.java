package br.edu.unisep.Biblioteca.model;

public class LivroFisico extends Livro {
    private int quantidadePaginas;

    public LivroFisico(String titulo, Autor autor, Genero genero, int quantidadePaginas) {
        super(titulo, autor, genero);
        this.quantidadePaginas = quantidadePaginas;
    }

    @Override
    public String getDetalhes() {
        return "Livro Físico - " + getTitulo() + ", Páginas: " + quantidadePaginas;
    }
}

