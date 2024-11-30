package br.edu.unisep.Biblioteca.view;

import br.edu.unisep.Biblioteca.util.Biblioteca;
import br.edu.unisep.Biblioteca.view.telas.CadastroAddView;
import br.edu.unisep.Biblioteca.view.telas.ConsultaListView;
import br.edu.unisep.Biblioteca.view.telas.DevolucaoAddView;
import br.edu.unisep.Biblioteca.view.telas.EmprestimoAddView;

import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        JFrame frame = new JFrame("Biblioteca");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        JButton btnCadastrarLivro = new JButton("Cadastrar Livro");
        btnCadastrarLivro.addActionListener(e -> new CadastroAddView(biblioteca));

        JButton btnConsultarLivros = new JButton("Consultar Livros");
        btnConsultarLivros.addActionListener(e -> new ConsultaListView(biblioteca));

        JButton btnEmprestimo = new JButton("Registrar Empréstimo");
        btnEmprestimo.addActionListener(e -> new EmprestimoAddView(biblioteca));

        JButton btnDevolucao = new JButton("Registrar Devolução");
        btnDevolucao.addActionListener(e -> new DevolucaoAddView(biblioteca));

        frame.add(btnCadastrarLivro);
        frame.add(btnConsultarLivros);
        frame.add(btnEmprestimo);
        frame.add(btnDevolucao);

        frame.setVisible(true);
    }
}
