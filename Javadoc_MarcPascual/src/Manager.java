import java.time.LocalDate;

public class Manager extends Person { // Manager class inherits from Person class

    // Variables to store manager information
    LocalDate startDate; // Start date of the manager's tenure
    int experience; // Years of experience of the manager

    // Getter method for retrieving the start date of the manager
    public LocalDate getStartDate() {
        return startDate;
    }

    // Setter method for updating the start date of the manager
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // Getter method for retrieving the experience of the manager
    public int getExperience() {
        return experience;
    }

    // Setter method for updating the experience of the manager
    public void setExperience(int experience) {
        this.experience = experience;
    }

    // Constructor with parameters to initialize manager attributes
    public Manager(String name, String identifier, LocalDate startDate, int experience) {
        super(name, identifier); // Call the constructor of the superclass (Person) with name and identifier
        this.startDate = startDate;
        this.experience = experience;
    }

    // Constructor with parameters to initialize manager attributes
    public Manager(LocalDate startDate, int experience) {
        this.startDate = startDate;
        this.experience = experience;
    }

    // Default constructor for the Manager class
    public Manager() {
    }
}
