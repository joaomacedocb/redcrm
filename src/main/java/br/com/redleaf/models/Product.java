package br.com.redleaf.models;
import java.lang.*;

public class Product {
    private String internalCode;
    private String ean;
    private String name;
    private String quantity;
    private boolean isActive;

    public Product(String internalCode, String ean, String name, String quantity, boolean isActive) {
        this.internalCode = internalCode;
        this.ean = ean;
        this.name = name;
        this.quantity = quantity;
        this.isActive = isActive;
    }

    
}
