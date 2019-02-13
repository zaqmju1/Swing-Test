package swing;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SwingEx extends JFrame {

    public SwingEx() {

        initUI();
    }

    private void initUI() {
        
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SwingEx ex = new SwingEx();
            ex.setVisible(true);
        });
    }
}
