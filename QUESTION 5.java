class Laptop {
    private String brand;
    private double price;
    private String processorType;
	
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
	
    public void printDetails() {
        System.out.println("Brand: " + brand + ", Price: Rs" + price + ", Processor: " + processorType);
    }
}

class User {
    private String username;
    private String address;

    // Getter methods for User
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
	
    public void compareAndPurchaseLaptop(Laptop[] laptops) {
        boolean purchased = false;

        for (Laptop laptop : laptops) {
            if ("Intel Core Ultra".equals(laptop.getProcessorType())) {
                System.out.println(username + " has purchased the " + laptop.getBrand() + " laptop with Intel Core Ultra processor.");
                laptop.printDetails();
                purchased = true;
                break;
            }
        }
		
        if (!purchased) {
            System.out.println(username + " did not purchase any laptop as none have the Intel Core Ultra processor.");
        }
    }
}

class LaptopPurchaseSystem {
	
    public static void createAndCompareLaptops() {
        Laptop hpLaptop = new Laptop();
        hpLaptop.setBrand("HP");
        hpLaptop.setPrice(72000.00);
        hpLaptop.setProcessorType("Intel Core i7");

        Laptop lenovoLaptop = new Laptop();
        lenovoLaptop.setBrand("Lenovo");
        lenovoLaptop.setPrice(60000.00);
        lenovoLaptop.setProcessorType("Intel Core Ultra");

        Laptop dellLaptop = new Laptop();
        dellLaptop.setBrand("Dell");
        dellLaptop.setPrice(68000.00);
        dellLaptop.setProcessorType("Intel Core i5");

        Laptop[] laptops = { hpLaptop, lenovoLaptop, dellLaptop };
		
        User user = new User();
        user.setUsername("Souparno");
        user.setAddress("madhyamgram, kolkata");

        
        user.compareAndPurchaseLaptop(laptops);
    }

    public static void main(String[] args) {
		
        createAndCompareLaptops();
    }
}