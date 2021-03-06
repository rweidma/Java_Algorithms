package myAlgorithms;
import java.util.Arrays;

public class MyMergeSortImplementation {
    public void testMergeClassStructure(){
        System.out.println("dude, another basic thing works!");
    }

    public static int[] sortArray(int[] inputArray){
        switch(inputArray.length){
            case 0:
            case 1:
                return inputArray;
            case 2:
                if(inputArray[0] < inputArray[1]){
                    return inputArray;
                }
                else{
                    return new int[]{inputArray[1],inputArray[0]};
                }
            default:
                int halfLength = inputArray.length/2;
                int[] firstHalf = Arrays.copyOfRange(inputArray,0,halfLength);
                firstHalf = sortArray(firstHalf);
                int[] secondHalf;
                if(inputArray.length % 2 != 0){
                    secondHalf = Arrays.copyOfRange(inputArray,halfLength,2*halfLength+1);
                    secondHalf = sortArray(secondHalf);
                }
                else{
                    secondHalf = sortArray(Arrays.copyOfRange(inputArray,halfLength,2*halfLength));
                }
                int [] sortedArray = new int[inputArray.length];
                int i = 0;
                int j = 0;
                for(int cnt = 0; cnt <sortedArray.length; cnt++){//This is
                    if(i <firstHalf.length && j < secondHalf.length){
                        if(firstHalf[i] <= secondHalf[j]){
                            sortedArray[cnt] = firstHalf[i];
                            i++;
                        }
                        else {
                            sortedArray[cnt] = secondHalf[j];
                            j++;
                        }
                    }
                    else if(j == secondHalf.length){
                        if(i < firstHalf.length){
                            sortedArray[cnt] = firstHalf[i];
                            i++;
                        }
                    }
                    else if(i == firstHalf.length){
                            if(j < secondHalf.length){
                            sortedArray[cnt] = secondHalf[j];
                            j++;
                        }

                    }
                }
                return sortedArray;



        }


    }


    public static void printArray(int[] array){
        System.out.println("\n PrintArray Called");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
