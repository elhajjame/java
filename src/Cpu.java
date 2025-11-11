public class Cpu {
    String brand;
    double speed;

    Cpu(String brand,double speed){
        this.brand = brand;
        this.speed = speed;
    }

    void displayCpu(){
        System.out.println("Cpu brand: " + brand + " speed: " + speed);

    }
}
