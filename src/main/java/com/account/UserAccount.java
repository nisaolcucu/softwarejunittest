package com.account;

public class UserAccount {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String confirmPassword;
    private String dateOfBirth;

    // Constructor
    public UserAccount(String firstName, String lastName, String email,
                       String password, String confirmPassword, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getConfirmPassword() { return confirmPassword; }
    public String getDateOfBirth() { return dateOfBirth; }
}
