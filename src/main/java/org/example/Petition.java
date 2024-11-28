package org.example;

import java.util.ArrayList;
import java.util.List;

// Represents a petition with a title, description, author, and a list of signatures
public class Petition {
    private String title; // Title of the petition
    private String description; // Description of the petition
    private String author; // Author of the petition
    private List<org.example.Signature> signatures = new ArrayList<>(); // List to store signatures

    // Constructor to initialize a petition with title, description, and author
    public Petition(String title, String description, String author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    // Get the title of the petition
    public String getTitle() {
        return title;
    }

    // Get the description of the petition
    public String getDescription() {
        return description;
    }

    // Get the author of the petition
    public String getAuthor() {
        return author;
    }

    // Get the list of signatures for the petition
    public List<org.example.Signature> getSignatures() {
        return signatures;
    }

    // Add a new signature to the petition
    public void addSignature(org.example.Signature signature) {
        signatures.add(signature);
    }
}
