package app.models;

public class Dog {
    private String name;
    private String raca;
    private int peso;

    public Dog(final String name, final String raca, final int peso) {
        this.name = name;
        this.raca = raca;
        this.peso = peso;
    }

    

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getRaca() {
        return raca;
    }

    // public void setRaca(String raca) {
    //     this.raca = raca;
    // }

    public int getPeso() {
        return peso;
    }

    @Override
	public String toString() {
		return "Dog [name=" + getName() + ", peso=" + getPeso() + ", raca=" + getRaca() + "]";
	}}

//     public void setPeso(int peso) {
//         this.peso = peso;
//     }
// }