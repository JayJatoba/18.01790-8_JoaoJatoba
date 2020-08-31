package br.maua.models;

import br.maua.interfaces.Validator;

import java.util.Objects;


public class Vendedor implements Validator {
    private String id;
    private String name;
    private String password;

    public Vendedor(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
    @Override
    public String toString() {
        // nao deixar senha a mostra
        return "Vendedor{" +
                "id='" + id + '\'' +
                ", nome='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean validate(String pass) {
        return hashCode()==Objects.hash(pass);
    }



    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    public String getSenhaHash() {
    return ""+hashCode();
    }
}

