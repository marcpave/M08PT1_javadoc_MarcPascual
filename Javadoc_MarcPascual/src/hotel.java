public class Hotel {

    // Variables to store hotel information
    String name; // Name of the hotel
    String address; // Address of the hotel
    String web; // Website of the hotel

    Manager manager; // Manager object associated with the hotel

    // Getter method for retrieving the hotel name
    public String getName() {
        return name;
    }

    // Setter method for updating the hotel name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for retrieving the hotel address
    public String getAddress() {
        return address;
    }

    // Setter method for updating the hotel address
    public void setAddress(String address) {
        this.address = address;
    }

    // Getter method for retrieving the hotel website
    public String getWeb() {
        return web;
    }

    // Setter method for updating the hotel website
    public void setWeb(String web) {
        this.web = web;
    }

    // Getter method for retrieving the manager associated with the hotel
    public Manager getManager() {
        return manager;
    }

    // Setter method for updating the manager associated with the hotel
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // Default constructor for the Hotel class
    public Hotel() {
    }

    // Constructor with parameters to initialize hotel attributes
    public Hotel(String name, String address, String web, Manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.manager = manager;
    }
}
