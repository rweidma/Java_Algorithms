import myAlgorithms.MyMergeSortImplementation;
public class MyMainClass {

    public static void main(String [] args){
        System.out.println("The basic thing works");
        MyMergeSortImplementation mergeSorter = new MyMergeSortImplementation();


        printStep("sort odd number", mergeSorter, new int[]{7, 2, 14, 1, 60});
        printStep("sort even number", mergeSorter, new int[]{7, 2, 14, 1, 60,18});
        printStep("sort one", mergeSorter, new int[]{7});
        printStep("sort two in order", mergeSorter, new int[]{3,5});
        printStep("sort two not in order", mergeSorter, new int[]{5, 3});
        printStep("lots", mergeSorter, new int[]{1,2,4,5,7,8,9,23,64,12,68,43,13,786});
        printStep("three only", mergeSorter, new int[]{11,17,1});


    }

    public static void printStep(String myCase, MyMergeSortImplementation mergeSorter, int[] array){
        System.out.println("____________________________________");
        System.out.println("Case: " + myCase);
        System.out.print("unsorted array: ");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] mergeSortedArray = mergeSorter.sortArray(array);

        System.out.print("Sorted array: ");
        for (int i: mergeSortedArray){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("____________________________________");
    }
}
