public class Main {
    public static void main(String[] args){

        int[] numbers = {1, 2, 3, 4, 5};
        int n = numbers.length;
        double sum = 0.0;
        double harmonicAverage = 0;

        for(int i = 0; i < numbers.length; ++i){
            sum += 1.0 / numbers[i];
        }

        harmonicAverage = n / sum;

        System.out.println("Harmonic average of array elements: " + harmonicAverage);

    }
}