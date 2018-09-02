import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Login loginPanl = new Login();
        frame.setContentPane(loginPanl.getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
