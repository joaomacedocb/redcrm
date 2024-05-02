package br.com.redleaf.models;
import java.lang.*;

public class CustomerOld {
    private String document;
    private String name;
    private Integer age;
    private String phone;
    public CustomerOld(String document, String name, Integer age, String phone) {
        this.document = document;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public void checkAge(){
        if (this.age >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
