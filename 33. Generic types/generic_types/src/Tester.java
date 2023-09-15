public class Tester {
    public static void main(String[] args) {

//        IntContainer intContainer = new IntContainer();
//
//        intContainer.setArray(new int[] {1,2,3,4,5});
//        intContainer.printArray();
//
//        StringContainer stringContainer = new StringContainer();
//
//        stringContainer.setArray(new String[] {"a","b","c","d","e"});
//        stringContainer.printArray();

        Container<Integer> container = new Container<>();

        container.setArray(new Integer[] {5,10,15});
        container.printArray();

        Integer[] array = container.getArray();
        System.out.println(array[0] + array[1]);


        Container<String> strContainer = new Container<>();

        strContainer.setArray(new String[] {"a","b","c"});
        String[] strArray = strContainer.getArray();
        for (String s : strArray) {
            System.out.println(s.toUpperCase());
        }
    }
}
