import java.awt.*;
import java.awt.event.*;

public class StylishAWTForm {
    public static void main(String[] args) {
        // Frame
        Frame f = new Frame("🌈 Stylish Interactive AWT Form");
        f.setSize(600, 450);
        f.setLayout(null);
        f.setBackground(new Color(245, 245, 245)); // light gray background

        // Fonts
        Font titleFont = new Font("Arial", Font.BOLD, 20);
        Font labelFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font resultFont = new Font("Consolas", Font.BOLD, 16);

        // Title
        Label title = new Label("🚀 Welcome to AWT Stylish Form");
        title.setBounds(120, 40, 400, 30);
        title.setFont(titleFont);
        title.setForeground(new Color(25, 118, 210)); // blue

        // Name label & field
        Label nameLabel = new Label("Enter your Name:");
        nameLabel.setBounds(80, 100, 120, 30);
        nameLabel.setFont(labelFont);
        TextField nameField = new TextField();
        nameField.setBounds(220, 100, 250, 30);

        // Hobbies
        Label hobbyLabel = new Label("Select Hobbies:");
        hobbyLabel.setBounds(80, 150, 120, 30);
        hobbyLabel.setFont(labelFont);

        Checkbox c1 = new Checkbox("Reading");
        c1.setBounds(220, 150, 100, 30);
        Checkbox c2 = new Checkbox("Gaming");
        c2.setBounds(320, 150, 100, 30);
        Checkbox c3 = new Checkbox("Traveling");
        c3.setBounds(420, 150, 100, 30);

        // Country Choice
        Label countryLabel = new Label("Select Country:");
        countryLabel.setBounds(80, 200, 120, 30);
        countryLabel.setFont(labelFont);
        Choice countryChoice = new Choice();
        countryChoice.setBounds(220, 200, 250, 30);
        countryChoice.add("India");
        countryChoice.add("USA");
        countryChoice.add("UK");
        countryChoice.add("Japan");
        countryChoice.add("Australia");

        // Buttons
        Button submitBtn = new Button("Submit ✅");
        submitBtn.setBounds(200, 260, 100, 40);
        submitBtn.setBackground(new Color(76, 175, 80)); // green
        submitBtn.setForeground(Color.white);

        Button clearBtn = new Button("Clear ❌");
        clearBtn.setBounds(340, 260, 100, 40);
        clearBtn.setBackground(new Color(244, 67, 54)); // red
        clearBtn.setForeground(Color.white);

        // Result Label
        Label resultLabel = new Label("Your details will appear here...");
        resultLabel.setBounds(80, 330, 450, 30);
        resultLabel.setFont(resultFont);
        resultLabel.setForeground(new Color(0, 150, 136)); // teal

        // Submit button action
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String hobbies = "";
                if (c1.getState()) hobbies += "Reading ";
                if (c2.getState()) hobbies += "Gaming ";
                if (c3.getState()) hobbies += "Traveling ";
                String country = countryChoice.getSelectedItem();

                resultLabel.setText("✨ Hello " + name + "! Hobbies: " + hobbies + "| Country: " + country);
            }
        });

        // Clear button action
        clearBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                c1.setState(false);
                c2.setState(false);
                c3.setState(false);
                countryChoice.select(0);
                resultLabel.setText("Your details will appear here...");
            }
        });

        // Hover effect for Submit
        submitBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                submitBtn.setBackground(new Color(56, 142, 60)); // darker green
            }
            public void mouseExited(MouseEvent e) {
                submitBtn.setBackground(new Color(76, 175, 80)); // normal green
            }
        });

        // Hover effect for Clear
        clearBtn.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                clearBtn.setBackground(new Color(211, 47, 47)); // darker red
            }
            public void mouseExited(MouseEvent e) {
                clearBtn.setBackground(new Color(244, 67, 54)); // normal red
            }
        });

        // Close event
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        // Add components
        f.add(title);
        f.add(nameLabel); f.add(nameField);
        f.add(hobbyLabel); f.add(c1); f.add(c2); f.add(c3);
        f.add(countryLabel); f.add(countryChoice);
        f.add(submitBtn); f.add(clearBtn);
        f.add(resultLabel);

        // Show
        f.setVisible(true);
    }
}
