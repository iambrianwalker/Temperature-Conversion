import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userInterface {
    private static double fahrenheit(double n, char t) {
        double result = 0;
        if (t == 'K') {
            result = (n - 273.15) * 1.8 + 32;
        } else if (t == 'C') {
            result = (n * 9.0/5.0) + 32;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry. Not valid.");
        }
        return result;
    }

    private static double celsius(double n, char t) {
        double result = 0;
        if (t == 'F') {
            result = (n - 32) * 5.0/9.0;
        } else if (t == 'K') {
            result = n - 273.15;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry. Not valid.");
        }
        return result;
    }

    private static double kelvins(double n, char t) {
        double result = 0;
        if (t == 'F') {
            result = (n - 32) * 5.0/9.0 + 273.15;
        } else if (t == 'C') {
            result = n + 273.15;
        } else {
            JOptionPane.showMessageDialog(null, "Sorry. Not valid");
        }
        return result;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Temperature Converter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Enter temperature:");
        userLabel.setBounds(10, 20, 150, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(170, 20, 165, 25);
        panel.add(userText);

        JLabel typeLabel = new JLabel("Select type:");
        typeLabel.setBounds(10, 50, 80, 25);
        panel.add(typeLabel);

        String[] tempTypes = {"F", "C", "K"};
        JComboBox<String> tempList = new JComboBox<>(tempTypes);
        tempList.setBounds(170, 50, 50, 25);
        panel.add(tempList);

        JLabel convertLabel = new JLabel("Convert to:");
        convertLabel.setBounds(10, 80, 80, 25);
        panel.add(convertLabel);

        JComboBox<String> convertList = new JComboBox<>(tempTypes);
        convertList.setBounds(170, 80, 50, 25);
        panel.add(convertList);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(10, 110, 150, 25);
        panel.add(convertButton);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(10, 140, 80, 25);
        panel.add(resultLabel);

        JLabel result = new JLabel("");
        result.setBounds(170, 140, 165, 25);
        panel.add(result);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double temper = Double.parseDouble(userText.getText());
                    char temp = tempList.getSelectedItem().toString().charAt(0);
                    char convert = convertList.getSelectedItem().toString().charAt(0);
                    double convertedTemp = 0;

                    switch (temp) {
                        case 'F':
                            if (convert == 'C') {
                                convertedTemp = celsius(temper, temp);
                            } else if (convert == 'K') {
                                convertedTemp = kelvins(temper, temp);
                            }
                            break;
                        case 'K':
                            if (convert == 'C') {
                                convertedTemp = celsius(temper, temp);
                            } else if (convert == 'F') {
                                convertedTemp = fahrenheit(temper, temp);
                            }
                            break;
                        case 'C':
                            if (convert == 'F') {
                                convertedTemp = fahrenheit(temper, temp);
                            } else if (convert == 'K') {
                                convertedTemp = kelvins(temper, temp);
                            }
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Maybe next time -_-");
                            return;
                    }
                    result.setText(String.format("%.2f", convertedTemp));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid temperature.");
                }
            }
        });
    }
}
