package hand;

import javax.swing.JFrame;

import lan.nagy.InputPanel;

public class MainFrame extends JFrame {
    public InputPanel inputPanel;
    public MainFrame() {
        this.inputPanel = new InputPanel();
        this.inputPanel.setText("Teszt");
        
        this.add(this.inputPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
