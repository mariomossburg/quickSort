import java.util.Random;

public class IntegerQuickSort {

    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }
    private static void quickSort(int[] array, int lowIndex, int highIndex) {
        if(lowIndex>=highIndex){
            return;
        }
        //random pivot
        int pivotIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,highIndex);

        int leftPointer = partition(array, lowIndex, highIndex, pivot);

        quickSort(array,lowIndex, leftPointer-1);
        quickSort(array,leftPointer+1, highIndex);

    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && rightPointer > leftPointer){
                rightPointer--;
            }
            swap(array,leftPointer,rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private int random(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    private static void swap(int[] array, int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}

