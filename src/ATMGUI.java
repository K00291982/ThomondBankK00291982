import javax.swing.*;
import java.awt.*;
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
    private JButton policyButton;
    private JButton createNewAccountButton;
    private JButton changeAIRButton;
    private JButton changeOverdraftLimitButton;

    public static ArrayList<Account> thomondAccounts = new ArrayList<>();

    public ATMGUI() {

        // Hide all ATM components initially
        depositAccountRadioButton.setVisible(false);
        currentAccountRadioButton.setVisible(false);
        depositButton.setVisible(false);
        withdrawButton.setVisible(false);
        checkBalanceButton.setVisible(false);
        createNewAccountButton.setVisible(false);
        changeAIRButton.setVisible(false);
        changeOverdraftLimitButton.setVisible(false);

        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String input = textField1.getText();

                try {
                    if (input.length() != 1 || !input.matches("\\d")) {
                        throw new NumberFormatException();
                    } else {

                    // Valid input - show the components
                    depositAccountRadioButton.setVisible(true);
                    currentAccountRadioButton.setVisible(true);
                    depositButton.setVisible(true);
                    withdrawButton.setVisible(true);
                    checkBalanceButton.setVisible(true);
                    createNewAccountButton.setVisible(true);
                    changeAIRButton.setVisible(true);
                    changeOverdraftLimitButton.setVisible(true);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(root,
                            "Please enter a valid 1-digit numeric account ID.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
                    textField1.setText("");
                }


            }
        });
        policyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(root, "Card Usage: Customers must use their own ATM card and PIN. Sharing of ATM credentials is strictly prohibited.\n" +
                        "\n" +
                        "Transaction Limit: Daily withdrawal limit is €700. Multiple transactions can be made within this limit.\n" +
                        "\n" +
                        "Security: Customers must ensure no one else views their PIN while entering it. Report lost or stolen cards immediately.\n" +
                        "\n" +
                        "Service Availability: ATM services are available 24/7, except during scheduled maintenance.\n" +
                        "\n" +
                        "Dispute Resolution: Any transaction issues must be reported within 7 days for resolution.", "Thomond Bank Policy",JOptionPane.INFORMATION_MESSAGE );

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Thomond Bank");
        frame.setContentPane(new ATMGUI().root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
//        frame.setLocationRelativeTo(null);
    }

//    private void populateMyAccounts() {
//// used to populate myAccounts ArrayList with test data
//        thomondAccounts.add(new DepositAccount(1, 1));
//        thomondAccounts.get(0).deposit(100);
//        thomondAccounts.add(new DepositAccount(2, 2));
//        thomondAccounts.get(1).deposit(500);
//        thomondAccounts.add(new DepositAccount(3, 3));
//        thomondAccounts.get(2).deposit(300);
//        thomondAccounts.add(new DepositAccount(4, 4));
//        thomondAccounts.get(3).deposit(300);
//        thomondAccounts accounts.add(new CurrentAccount(4, 1, 100));
//        thomondAccounts.add(new CurrentAccount(5, 2, 1000));
//        thomondAccounts.add(new CurrentAccount(6, , 4, 200));
//    }

}
