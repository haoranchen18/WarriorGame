

// Interfaces are empty classes
// They define the metods you must use, but
// none of the code

// Classes can only inherit from 1 class
// but they can inherit numerous interfaces

// We'll use an interface to define whether
// a warrior can or can't teleport. We will
// add this capability without making many
// changes to the class effected

public interface Teleports {
    String teleport();
}

/* ---- TRADITIONAL INTERFACE ----
public interface Pizza {
    public String getDescription();
    public double getCost();
}

public class PlainPizza implements Pizza {
	public String getDescription() {
		return "Thin dough";
	}
	public double getCost() {
		System.out.println("Cost of Dough: " + 4.00);
		return 4.00;
	}

}

// ---- ABSTRACT CLASSES ----
// Used when you don't require all methods to
 * be implemented. They can also have methods
 * with code

public abstract class Crashable{
	boolean carDrivable = true;
	public void youCrashed(){
		this.carDrivable = false;
	}
	public abstract void setCarStrength(int carStrength);
	public abstract int getCarStrength();
}

*/