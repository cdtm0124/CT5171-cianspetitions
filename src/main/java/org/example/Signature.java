package org.example;

// Represents a signature with a name and an email address
public class Signature {
    private String name; // Name of the person signing
    private String email; // Email of the person signing

    // Constructor to initialize a signature with name and email
    public Signature(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Get the name of the signer
    public String getName() {
        return name;
    }

    // Get the email of the signer
    public String getEmail() {
        return email;
    }
}
