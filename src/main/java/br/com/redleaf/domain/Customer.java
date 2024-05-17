package br.com.redleaf.domain;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String document;

    public Customer (){

    }

    public Customer(String name, String email, String document) {
        this.name = name;
        this.email = email;
        this.document = document;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + name + '\'' +
                ", email='" + email + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
