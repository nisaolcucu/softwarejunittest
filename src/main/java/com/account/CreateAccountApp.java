package com.account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Create New Account");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 400);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        // Input fields
        JLabel firstNameLabel = new JLabel("First Name:");
        JTextField firstNameField = new JTextField();

        JLabel lastNameLabel = new JLabel("Last Name:");
        JTextField lastNameField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField();

        JLabel dobLabel = new JLabel("Date of Birth (dd/mm/yyyy):");
        JTextField dobField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();

        JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
        JPasswordField confirmPasswordField = new JPasswordField();

        JButton submitButton = new JButton("Submit");

        // Add components to panel
        panel.add(firstNameLabel);
        panel.add(firstNameField);
        panel.add(lastNameLabel);
        panel.add(lastNameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(dobLabel);
        panel.add(dobField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmPasswordLabel);
        panel.add(confirmPasswordField);
        panel.add(new JLabel()); // boş hücre
        panel.add(submitButton);

        // Action
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                String dob = dobField.getText();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                StringBuilder errors = new StringBuilder();

                if (!Validator.isValidName(firstName)) {
                    errors.append("Invalid first name. It must start with a capital letter and only contain letters.\n");
                }
                if (!Validator.isValidName(lastName)) {
                    errors.append("Invalid last name. It must start with a capital letter and only contain letters.\n");
                }
                if (!Validator.isValidEmail(email)) {
                    errors.append("Invalid email format.\n");
                }
                if (!Validator.isValidDOB(dob)) {
                    errors.append("Invalid date of birth. Use format dd/mm/yyyy.\n");
                }
                if (!Validator.isValidPassword(password)) {
                    errors.append("Password must be at least 8 characters, include one uppercase letter and one number.\n");
                }
                if (!Validator.doPasswordsMatch(password, confirmPassword)) {
                    errors.append("Passwords do not match.\n");
                }

                if (errors.length() > 0) {
                    JOptionPane.showMessageDialog(frame, errors.toString(), "Validation Errors", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Account successfully created for " + firstName + " " + lastName + "!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
