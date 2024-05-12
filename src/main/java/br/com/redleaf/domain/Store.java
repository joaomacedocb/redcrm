package br.com.redleaf.domain;
import java.lang.*;

public class Store {
    private String name;
    private String location;
    private String webSite;
    private boolean isEcommerce;

    public Store(String name, String location, String webSite, boolean isEcommerce) {
        this.name = name;
        this.location = location;
        this.webSite = webSite;
        this.isEcommerce = isEcommerce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public boolean isEcommerce() {
        return isEcommerce;
    }

    public void setEcommerce(boolean ecommerce) {
        isEcommerce = ecommerce;
    }
}
