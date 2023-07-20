import java.util.Random;

public class Controller {
    public static void main(String[] args) {
        Random random = new Random();

        long startTime;
        long endTime;
        long elapsedTime;
        int[] array = randomArray();
        int[] arrayTwo = array.clone();

        System.out.println("Unsorted Array");
        printArray(array);
        lineBreak();

        System.out.println("quicksorted Array");
        IntegerQuickSort.quickSort(arrayTwo);
        printArray(arrayTwo);


        int[] tenMilArray = new int[10000000];
        for (int i = 0; i < tenMilArray.length; i++){
            tenMilArray[i] = random.nextInt(77777);
        }
        lineBreak();
        System.out.print("Here's how long it takes to sort through an array with 10 million items in nanoseconds: ");
        startTime = System.nanoTime();
        IntegerQuickSort.quickSort(tenMilArray);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);

    }//end main
    public static void lineBreak(){
        System.out.println();
    }

    public static int[] randomArray(){
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(8000);
        }
        return array;
    }
    public static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}//end class
