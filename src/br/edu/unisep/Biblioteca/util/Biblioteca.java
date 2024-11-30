package br.edu.unisep.Biblioteca.util;

import br.edu.unisep.Biblioteca.model.*;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Genero> generos = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarAutor(Autor autor) {
        autores.add(autor);
    }

    public void cadastrarGenero(Genero genero) {
        generos.add(genero);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public List<Livro> consultarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
}
