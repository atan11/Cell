import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Cell {
    //private instance variables to prevent it from being editable by user
    private int strength;
    private int x;
    private int y;
    private int id;

    //this.strength is used to call the instance variables
    //Constructor
    public Cell(int strength, int x, int y, int id) {

        //put setters here to set the values as Cell(-1,-1,-1,-1) will be called in the main function
        setstrength(strength);
        setx(x);
        sety(y);
        setid(id);
    }

    public Cell() {
        this(0, 0, 0, 0);
    }

    public void setstrength(int strength) {
        if (strength >= 0) {
            this.strength = strength;
        } else {
            this.strength = 0;
        }
    }

    public int getstrength() {
        return this.strength;
    }

    public void setx(int x) {
        if (x < 0) {
            this.x = Math.abs(x);
        } else {
            this.x = x;
        }
    }

    public int getx() {
        return this.x;
    }

    public void sety(int y) {
        if (this.y < 0) {
            this.y = 0;
        } else {
            this.y = y;
        }
    }

    public int gety() {
        return this.y;
    }

    public void setid(int id1) {
        if (id < 0) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public int getid() {
        return this.id;
    }

    public static void interactNeighbors(int neighbors[]) {



    }

    public static void main(String[] args) {
        //Cell strength, position, and id
        Cell a = new Cell(-1,-1,-1,-1);

        //Concentration of Various Chemicals
        Concentration b = new Concentration(5,6,7);

        HashMap<String, Integer> chemicals = new HashMap<>();

        chemicals.put("lactate", b.lactate);
        chemicals.put("ATP", b.ATP);
        chemicals.put("glucose", b.glucose);

        System.out.println(chemicals);

        //Signal Molecules interacted with cell

        Interaction c = new Interaction ("bacteria");
        Set<String> interaction = new HashSet<String>();
        interaction.add(c.types);

        System.out.println(interaction);
    }

}
