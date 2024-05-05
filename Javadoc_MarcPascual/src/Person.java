/**
 * This class represents a person entity with basic information.
 * It includes methods to access and modify the person's attributes.
 * 
 * @author marc
 */
public class Person {

    // Variables to store person information
    String name; // Name of the person
    String identifier; // Identifier of the person

    /**
     * Getter method for retrieving the person's name.
     * 
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for updating the person's name.
     * 
     * @param name The new name for the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for retrieving the person's identifier.
     * 
     * @return The identifier of the person.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for updating the person's identifier.
     * 
     * @param identifier The new identifier for the person.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Constructor with parameters to initialize person attributes.
     * 
     * @param name The name of the person.
     * @param identifier The identifier of the person.
     */
    public Person(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    /**
     * Default constructor for the Person class.
     */
    public Person() {
    }
}
