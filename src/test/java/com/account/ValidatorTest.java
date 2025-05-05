package com.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void testValidName() {
        assertTrue(Validator.isValidName("Nisa"));
        assertFalse(Validator.isValidName("nisa")); // with lowerletter
        assertFalse(Validator.isValidName("N"));    // single letter
        assertFalse(Validator.isValidName("Nisa123")); // includes number
        assertFalse(Validator.isValidName(null));   // null
    }

    @Test
    public void testValidEmail() {
        assertTrue(Validator.isValidEmail("test@example.com"));
        assertFalse(Validator.isValidEmail("test.com"));   // @ missing
        assertFalse(Validator.isValidEmail("test@.com"));  // domain fault
        assertFalse(Validator.isValidEmail(""));           // empty
        assertFalse(Validator.isValidEmail(null));         // null
    }

    @Test
    public void testValidPassword() {
        assertTrue(Validator.isValidPassword("Strong1Pass"));
        assertFalse(Validator.isValidPassword("weakpass"));     // no capital letter and integer
        assertFalse(Validator.isValidPassword("PASSWORD"));     // no integer
        assertFalse(Validator.isValidPassword("12345678"));     // no capital letter
        assertFalse(Validator.isValidPassword("Pw1"));          // too short
        assertFalse(Validator.isValidPassword(null));           // null
    }

    @Test
    public void testPasswordsMatch() {
        assertTrue(Validator.doPasswordsMatch("Secret123", "Secret123"));
        assertFalse(Validator.doPasswordsMatch("Secret123", "secret123")); // difference 
        assertFalse(Validator.doPasswordsMatch("Secret123", null));
        assertFalse(Validator.doPasswordsMatch(null, "Secret123"));
    }

    @Test
    public void testValidDOB() {
        assertTrue(Validator.isValidDOB("01/01/2000"));
        assertFalse(Validator.isValidDOB("2000/01/01")); // wrong format
        assertFalse(Validator.isValidDOB("01-01-2000")); // / should be instead of - 
        assertFalse(Validator.isValidDOB("01/01/00"));   // year missing
        assertFalse(Validator.isValidDOB(null));         // null
    }
}















/* 
package com.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    // --- First Name ---
    @Test
    public void testValidName() {
        assertTrue(Validator.isValidName("Elif"));
    }

    @Test
    public void testInvalidName_empty() {
        assertFalse(Validator.isValidName(""));
    }

    @Test
    public void testInvalidName_lowercase() {
        assertFalse(Validator.isValidName("nisa")); // Sunumda "bakın bu küçük harfle başladığı için hata veriyor" diyebilirsin
    }

    // --- E-mail ---
    @Test
    public void testValidEmail() {
        assertTrue(Validator.isValidEmail("example@mail.com"));
    }

    @Test
    public void testInvalidEmail_missingAt() {
        assertFalse(Validator.isValidEmail("examplemail.com"));
    }

    // --- Password ---
    @Test
    public void testValidPassword() {
        assertTrue(Validator.isValidPassword("12345678"));
    }

    @Test
    public void testInvalidPassword_short() {
        assertFalse(Validator.isValidPassword("abc")); // kısa parola
    }

    // --- Confirm Password ---
    @Test
    public void testPasswordMatch() {
        assertTrue(Validator.doPasswordsMatch("mypassword", "mypassword"));
    }

    @Test
    public void testPasswordMismatch() {
        assertFalse(Validator.doPasswordsMatch("pass1", "pass2")); // uyuşmuyor
    }

    // --- Date of Birth ---
    @Test
    public void testValidDate() {
        assertTrue(Validator.isValidDate("03/05/2000"));
    }

    @Test
    public void testInvalidDate_wrongFormat() {
        assertFalse(Validator.isValidDate("2000-05-03")); // yanlış format
    }
}
*/
/* package com.account;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidatorTest {

    @Test
    public void testValidName() {
        assertTrue(Validator.isValidName("Ahmet"));
        assertFalse(Validator.isValidName("A"));
        assertFalse(Validator.isValidName("123"));
    }

    @Test
    public void testValidEmail() {
        assertTrue(Validator.isValidEmail("test@example.com"));
        assertFalse(Validator.isValidEmail("invalid.com"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(Validator.isValidPassword("strongPass123"));
        assertFalse(Validator.isValidPassword("1234"));
    }

    @Test
    public void testPasswordMatch() {
        assertTrue(Validator.passwordsMatch("pass1234", "pass1234"));
        assertFalse(Validator.passwordsMatch("pass1", "pass2"));
    }

    @Test
    public void testValidDateOfBirth() {
        assertTrue(Validator.isValidDateOfBirth("01/01/2000"));
        assertFalse(Validator.isValidDateOfBirth("2000-01-01"));
    }
}
*/