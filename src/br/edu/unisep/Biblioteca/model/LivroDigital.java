package br.edu.unisep.Biblioteca.model;

public class LivroDigital extends Livro {
    private double tamanhoArquivo; // Em MB

    public LivroDigital(String titulo, Autor autor, Genero genero, double tamanhoArquivo) {
        super(titulo, autor, genero);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public String getDetalhes() {
        return "Livro Digital - " + getTitulo() + ", Tamanho: " + tamanhoArquivo + " MB";
    }
}
