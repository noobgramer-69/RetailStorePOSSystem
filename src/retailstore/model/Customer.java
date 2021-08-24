package retailstore.model;

public class Customer {

    private String customerID;
    private String customerName;
    private String address;
    private String contactNumber;
    private String orderAmount;
    private String orderDate;
    private String orderItem;

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * @return the orderAmount
     */
    public String getOrderAmount() {
        return orderAmount;
    }

    /**
     * @param orderAmount the orderAmount to set
     */
    public void setOrderAmount(String orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * @return the orderDate
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * @param orderDate the orderDate to set
     */
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    /**
     * @return the orderItem
     */
    public String getOrderItem() {
        return orderItem;
    }

    /**
     * @param orderItem the orderItem to set
     */
    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }
}