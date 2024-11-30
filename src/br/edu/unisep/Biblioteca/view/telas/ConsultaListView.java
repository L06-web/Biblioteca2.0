package br.edu.unisep.Biblioteca.view.telas;

import br.edu.unisep.Biblioteca.model.Livro;
import br.edu.unisep.Biblioteca.util.Biblioteca;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ConsultaListView{
    public ConsultaListView(Biblioteca biblioteca) {
        JFrame frame = new JFrame("Consulta de Livros Disponíveis");
        frame.setSize(700, 700);
        frame.setLayout(new BorderLayout());

        String[] colunas = {"Título", "Autor", "Gênero", "Detalhes"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        JTable tabela = new JTable(modelo);

        for (Livro livro : biblioteca.consultarLivrosDisponiveis()) {
            modelo.addRow(new Object[]{livro.getTitulo(), livro.getAutor().getNome(),
                    livro.getGenero().getNome(), livro.getDetalhes()});
        }

        JScrollPane scrollPane = new JScrollPane(tabela);
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> frame.dispose());
        frame.add(btnFechar, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
