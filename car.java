public class Car {
    private String carId;
    private String model;
    private  double price;
    private String brand;

    private boolean isAvailable;


    public Car(String carId,String model,String brand,double price){
        this.carId=carId;
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.isAvailable=true;
    }

    public String getCarId(){
        return carId;
    }
    public  String getModel(){
        return model;
    }

    public String getBrand(){
        return brand;
    }
    public double calculateprice(int rentalDays) {
            return rentalDays*price;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void returnCar(){
        isAvailable=true;
    }


    public void rent(){
        isAvailable=false;
    }
}
