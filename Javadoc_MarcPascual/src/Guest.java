/**
 * This class represents a guest entity, inheriting from the Person class.
 * It includes methods to access and modify the guest's attributes.
 * 
 * @author marc
 */
public class Guest extends Person {

    // Variable to store guest nationality
    String nationality;

    /**
     * Getter method for retrieving the guest's nationality.
     * 
     * @return The nationality of the guest.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Setter method for updating the guest's nationality.
     * 
     * @param nationality The new nationality for the guest.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Constructor with parameter to initialize guest nationality.
     * 
     * @param nationality The nationality of the guest.
     */
    public Guest(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Default constructor for the Guest class.
     */
    public Guest() {
    }
}
