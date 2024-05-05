/**
 * This class represents a hotel with its name, address, website, and manager information.
 * 
 * @author Marc
 */
public class hotel {

    // Variables to store hotel information
    String name; // Name of the hotel
    String address; // Address of the hotel
    String web; // Website of the hotel

    Manager manager; // Manager object associated with the hotel

    /**
     * Getter method for retrieving the hotel name.
     * 
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for updating the hotel name.
     * 
     * @param name The new name of the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for retrieving the hotel address.
     * 
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter method for updating the hotel address.
     * 
     * @param address The new address of the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter method for retrieving the hotel website.
     * 
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Setter method for updating the hotel website.
     * 
     * @param web The new website of the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Getter method for retrieving the manager associated with the hotel.
     * 
     * @return The manager associated with the hotel.
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * Setter method for updating the manager associated with the hotel.
     * 
     * @param manager The new manager associated with the hotel.
     */
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    /**
     * Default constructor for the Hotel class.
     */
    public hotel() {
    }

    /**
     * Constructor with parameters to initialize hotel attributes.
     * 
     * @param name    The name of the hotel.
     * @param address The address of the hotel.
     * @param web     The website of the hotel.
     * @param manager The manager associated with the hotel.
     */
    public hotel(String name, String address, String web, Manager manager) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.manager = manager;
    }
}
