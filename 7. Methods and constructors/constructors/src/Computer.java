public class Computer {
    String procesor;
    int memory;
    Computer (String proc) { //default constructor
        procesor = proc;
    }
    void printInfo(){
        System.out.println(procesor+" "+memory);
    }
}
