package package115.gui;

import package115.listener.CleanButtonListener;

import javax.swing.*;
import java.awt.*;

public class MainView {
    JFrame mainFrame;
    JTextField extTextField;
    JTextField dirTextField;

    public MainView() {
        init();
    }

    private void init() {
        mainFrame = new JFrame("Clean your workspace");
        mainFrame.setSize(500, 200);
        mainFrame.setLayout(new GridBagLayout());

        JLabel extLabel = new JLabel("Useless files extensions:");
        addToContainer(0, 0, extLabel);
        extTextField = new JTextField("");
        extTextField.setColumns(20);
        addToContainer(1, 0, extTextField);
        final JLabel dirLabel = new JLabel("Dirs to clean:");
        addToContainer(0, 1, dirLabel);
        dirTextField = new JTextField("");
        dirTextField.setColumns(20);
        addToContainer(1, 1, dirTextField);
        JButton cleanButton = new JButton("Clean");
        cleanButton.addActionListener(new CleanButtonListener(extTextField, dirTextField));
        addToContainer(1, 2, cleanButton);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void go() {
        mainFrame.setVisible(true);
    }

    private void addToContainer(int x, int y, JComponent component) {
        GridBagConstraints cons = new GridBagConstraints();
        cons.gridx = x;
        cons.gridy = y;
        cons.insets = new Insets(5, 5, 5, 5);
        mainFrame.getContentPane().add(component, cons);
    }

    public JTextField getExtTextField() {
        return extTextField;
    }

    public JTextField getDirTextField() {
        return dirTextField;
    }
}
