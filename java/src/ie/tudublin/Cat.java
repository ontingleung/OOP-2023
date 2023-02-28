package ie.tudublin;

public class Cat {
    
    int numLives;
    String name;

    public Cat(String name) {
        this.name = name;
        this.numLives = 9;
    }

	public void kill() {
		this.numLives = this.numLives - 1;
        if (this.numLives > 0) {
            System.out.println("Ouch!");
        }
        else {
            
            System.out.println("Dead");
        }
	}

}
