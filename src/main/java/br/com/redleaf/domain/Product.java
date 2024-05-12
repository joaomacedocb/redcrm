package br.com.redleaf.domain;
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

    public String getInternalCode() {
        return internalCode;
    }

    public void setInternalCode(String internalCode) {
        this.internalCode = internalCode;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
