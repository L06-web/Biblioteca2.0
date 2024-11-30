package br.edu.unisep.Biblioteca.view.telas;

import br.edu.unisep.Biblioteca.model.Emprestimo;
import br.edu.unisep.Biblioteca.util.Biblioteca;

import javax.swing.*;
import java.awt.*;

public class DevolucaoAddView {
    public DevolucaoAddView(Biblioteca biblioteca) {
        JFrame frame = new JFrame("Registrar Devolução");
        frame.setSize(700, 700);
        frame.setLayout(new GridLayout(3, 1, 10, 10));

        JComboBox<Emprestimo> cmbEmprestimo = new JComboBox<>();
        for (Emprestimo emprestimo : biblioteca.getEmprestimos()) {
            if (!emprestimo.isDevolvido()) {
                cmbEmprestimo.addItem(emprestimo);
            }
        }

        JButton btnDevolver = new JButton("Registrar Devolução");
        btnDevolver.addActionListener(e -> {
            Emprestimo emprestimo = (Emprestimo) cmbEmprestimo.getSelectedItem();
            emprestimo.devolver();

            JOptionPane.showMessageDialog(frame, "Devolução registrada com sucesso!");
            frame.dispose();
        });

        frame.add(new JLabel("Selecione o Empréstimo:"));
        frame.add(cmbEmprestimo);
        frame.add(btnDevolver);

        frame.setVisible(true);
    }
}
