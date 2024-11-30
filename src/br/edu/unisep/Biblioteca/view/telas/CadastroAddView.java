package br.edu.unisep.Biblioteca.view.telas;

import br.edu.unisep.Biblioteca.model.*;
import br.edu.unisep.Biblioteca.util.Biblioteca;

import javax.swing.*;
import java.awt.*;

public class CadastroAddView{
    public CadastroAddView(Biblioteca biblioteca) {
        JFrame frame = new JFrame("Cadastro de Livro");
        frame.setSize(700, 700);
        frame.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel lblTitulo = new JLabel("Título:");
        JTextField txtTitulo = new JTextField();

        JLabel lblAutor = new JLabel("Autor:");
        JTextField txtAutor = new JTextField();

        JLabel lblGenero = new JLabel("Gênero:");
        JTextField txtGenero = new JTextField();

        JLabel lblTipo = new JLabel("Tipo do Livro:");
        String[] tipos = {"Físico", "Digital"};
        JComboBox<String> cmbTipo = new JComboBox<>(tipos);

        JLabel lblInfoAdicional = new JLabel("Páginas ou Tamanho (MB):");
        JTextField txtInfoAdicional = new JTextField();

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(e -> {
            String titulo = txtTitulo.getText();
            String nomeAutor = txtAutor.getText();
            String nomeGenero = txtGenero.getText();
            String tipo = (String) cmbTipo.getSelectedItem();
            String infoAdicional = txtInfoAdicional.getText();

            Autor autor = new Autor(nomeAutor);
            Genero genero = new Genero(nomeGenero);

            biblioteca.cadastrarAutor(autor);
            biblioteca.cadastrarGenero(genero);

            Livro livro;
            if ("Físico".equals(tipo)) {
                int paginas = Integer.parseInt(infoAdicional);
                livro = new LivroFisico(titulo, autor, genero, paginas);
            } else {
                double tamanho = Double.parseDouble(infoAdicional);
                livro = new LivroDigital(titulo, autor, genero, tamanho);
            }

            biblioteca.cadastrarLivro(livro);
            JOptionPane.showMessageDialog(frame, "Livro cadastrado com sucesso!");
            frame.dispose();
        });

        frame.add(lblTitulo);
        frame.add(txtTitulo);
        frame.add(lblAutor);
        frame.add(txtAutor);
        frame.add(lblGenero);
        frame.add(txtGenero);
        frame.add(lblTipo);
        frame.add(cmbTipo);
        frame.add(lblInfoAdicional);
        frame.add(txtInfoAdicional);
        frame.add(new JLabel());
        frame.add(btnSalvar);

        frame.setVisible(true);
    }
}
