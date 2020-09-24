public class Car {
    
    private String type;
    private double speed;
    
    public Car() {
        type = "";
        speed = 0;
    }
    
    public Car(String type, double speed) {
        this.type = type;
        this.speed = speed;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed() {
        this.speed = speed;
    }
    
    public String toString() {
        return type; 
    }
    
    
}