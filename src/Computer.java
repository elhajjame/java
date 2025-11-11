public class Computer {
    Cpu cpu;

    Computer(){
        cpu = new  Cpu("ryzen", 4.5);
    }
    void displayComputer() {
        System.out.println("Computer Details:");
        cpu.displayCpu();
    }
}
