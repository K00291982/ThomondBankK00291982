import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ATMGUI {
    private JTabbedPane tabbedPane1;
    private JPanel root;
    private JTextField textField1;
    private JRadioButton depositAccountRadioButton;
    private JRadioButton currentAccountRadioButton;
    private JButton depositButton;
    private JButton withdrawButton;
    private JButton checkBalanceButton;
    private JButton logoutButton;
    private JButton createNewAccountButton;
    private JButton changeAIRButton;
    private JButton changeOverdraftLimitButton;

    public static ArrayList<Account> thomondAccounts = new ArrayList<>();

    public ATMGUI() {

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thomond Bank");
        frame.setContentPane(new ATMGUI().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void populateMyAccounts() {
// used to populate myAccounts ArrayList with test data
        thomondAccounts.add(new DepositAccount(1, 1));
        thomondAccounts.get(0).deposit(100);
        thomondAccounts.add(new DepositAccount(2, 2));
        thomondAccounts.get(1).deposit(500);
        thomondAccounts.add(new DepositAccount(3, 3));
        thomondAccounts.get(2).deposit(300);
        thomondAccounts.add(new DepositAccount(4, 4));
        thomondAccounts.get(3).deposit(300);
        thomondAccounts accounts.add(new CurrentAccount(4, 1, 100));
        thomondAccounts.add(new CurrentAccount(5, 2, 1000));
        thomondAccounts.add(new CurrentAccount(6, , 4, 200));
    }

}
