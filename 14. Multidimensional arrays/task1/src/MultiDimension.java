public class MultiDimension {
    public static void main(String[] args) {
//        double[][] numbers = new double[3][];
//        double[] numbers0 = {1.0,1.5,2.0};
//        double[] numbers1 = {1.5,2.0,2.5};
//        double[] numbers2 = {2.0,2.5,3.0};
//
//        numbers[0] = numbers0;
//        numbers[1] = numbers1;
//        numbers[2] = numbers2;

        double[][] numbers = {
                {1.0,1.5,2.0},
                {1.5,2.0,2.5},
                {2.0,2.5,3.0}
        };
        
        System.out.println("|"+numbers[0][0]+" | "+numbers[0][1]+" | "+numbers[0][2]+"|");
        System.out.println("|"+numbers[1][0]+" | "+numbers[1][1]+" | "+numbers[1][2]+"|");
        System.out.println("|"+numbers[2][0]+" | "+numbers[2][1]+" | "+numbers[2][2]+"|");

        double result = (numbers[0][0]*numbers[1][1]*numbers[2][2])+(numbers[0][2]*numbers[1][1]*numbers[0][2]);
        System.out.println("Suma iloczynów przekątnych tablicy: "+result);

        result = ((numbers[0][1]*numbers[1][1]*numbers[2][1])+(numbers[1][0]*numbers[1][1]*numbers[1][2]));
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy wynosi: "+result);

        result = numbers[0][0] + numbers[0][1] + numbers[0][2] + numbers[1][2] + numbers[2][2] + numbers[2][1]
                + numbers[2][0] + numbers[1][0];
        System.out.println("Suma wszystkich elementów znajdujących się przy krawędzi tablicy wynosi: "+result);
    }
}