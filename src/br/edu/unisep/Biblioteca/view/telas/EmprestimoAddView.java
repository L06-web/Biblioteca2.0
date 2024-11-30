package br.edu.unisep.Biblioteca.view.telas;

import br.edu.unisep.Biblioteca.model.Emprestimo;
import br.edu.unisep.Biblioteca.model.Livro;
import br.edu.unisep.Biblioteca.model.Usuario;
import br.edu.unisep.Biblioteca.util.Biblioteca;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;

public class EmprestimoAddView {
    public EmprestimoAddView(Biblioteca biblioteca) {
        JFrame frame = new JFrame("Registrar Empréstimo");
        frame.setSize(700, 700);
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel lblLivro = new JLabel("Livro:");
        JComboBox<Livro> cmbLivro = new JComboBox<>();
        for (Livro livro : biblioteca.consultarLivrosDisponiveis()) {
            cmbLivro.addItem(livro);
        }

        JLabel lblUsuario = new JLabel("Usuário:");
        JTextField txtUsuario = new JTextField();

        JButton btnRegistrar = new JButton("Registrar Empréstimo");
        btnRegistrar.addActionListener(e -> {
            Livro livro = (Livro) cmbLivro.getSelectedItem();
            String nomeUsuario = txtUsuario.getText();
            Usuario usuario = new Usuario(nomeUsuario);

            biblioteca.cadastrarUsuario(usuario);
            biblioteca.registrarEmprestimo(new Emprestimo(livro, usuario, LocalDate.now()));

            JOptionPane.showMessageDialog(frame, "Empréstimo registrado com sucesso!");
            frame.dispose();
        });

        frame.add(lblLivro);
        frame.add(cmbLivro);
        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(new JLabel()); // Espaço vazio
        frame.add(btnRegistrar);

        frame.setVisible(true);
    }
}
