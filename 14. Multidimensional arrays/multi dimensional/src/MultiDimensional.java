public class MultiDimensional {
    public static void main(String[] args) {
        String[] firstNames = {"Jan","Andrzej","Paweł"};
        String[] lastNames = {"Kowalski","Nowak","Polak"};
        String[][] firstLast = {firstNames,lastNames};

        int[][] numbers = new int[3][3];
        numbers[0][0] = 10;
        numbers[2][2] = 15;
        System.out.println(numbers[0][0] + " i "+numbers[2][2]);

        System.out.println("Pierwsza osoba to:");
        System.out.println(firstLast[0][0]+" "+firstLast[1][0]);
        System.out.println("Trzecia osoba to:");
        System.out.println(firstLast[0][2]+" "+firstLast[1][2]);

        System.out.println(firstLast.length);
        System.out.println(firstLast[0].length);
    }
}