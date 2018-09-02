import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField txtUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton btnSubmit;
    private JButton btnChear;
    private JLabel pwdUser;
    private JPanel mainPanel;


    public Login() {
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,txtUserLogin.getText()
                +" " + new String(pwdUserPassword.getPassword()));
            }
        });
        btnChear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserLogin.setText("");
                pwdUserPassword.setText("");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

}
