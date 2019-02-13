package swing;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameIconEx extends JFrame {

    public JFrameIconEx() {

        initUI();
    }

    private void initUI() {

        ImageIcon webIcon = new ImageIcon("src/IMGA0282.png");

        setIconImage(webIcon.getImage());

        setTitle("Icon");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            JFrameIconEx ex = new JFrameIconEx();
            ex.setVisible(true);
        });
    }
}

