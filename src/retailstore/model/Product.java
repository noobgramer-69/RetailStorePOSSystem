package retailstore.model;

public class Product {
	 
	private String productID;
	private String productName;
	private String productType;
        private Double productPrice;
        private int quantity;
	private boolean fragile;

	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
        
        public int getquantity() {
		return quantity;
	}
	public void setquantity(int quantity) {
		this.quantity = quantity;
        }
        
	public boolean isFragile() {
		return fragile; 
	}
	public void setFragile(boolean fragile) {
		this.fragile = fragile;
	}

    /**
     * @return the productType
     */
    public String getProductType() {
        return productType;
    }

    /**
     * @param productType the productType to set
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }
	
	 
		

}
