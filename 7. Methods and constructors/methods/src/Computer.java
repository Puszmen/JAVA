public class Computer {
    String procesor;
    int memory;
    void printInfo(){
        System.out.println(getInfo());
    }
    String getInfo() {
        return procesor+" "+memory;
    }
}
