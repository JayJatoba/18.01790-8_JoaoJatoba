package br.maua.models;

public class Cliente {
    private String email;
    private String name;
    private String id;

    public Cliente(String email, String name,String id) {
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}