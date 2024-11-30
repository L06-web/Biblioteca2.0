package br.edu.unisep.Biblioteca.model;
import java.time.LocalDate;
public class Autor {
    private String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}