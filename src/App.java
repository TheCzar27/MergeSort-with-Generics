import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Sorting.Sort;
import person.Student;

public class App {

    @SuppressWarnings ("unchecked")
   public static <T extends Comparable<T>> ArrayList<Student<T>> createRandomArray(int arrayLength, String typeName){
    ArrayList<Student<T>> arrayList = new ArrayList<>(arrayLength);
    Random random = new Random();
    for(int i = 0; i < arrayLength; i ++){
        String ID = String.valueOf(i);
        switch (typeName){
            case "Integer":
            arrayList.add((Student<T>)new Student<Integer>(ID, random.nextInt(100)));
            break;
            case "Float":
            arrayList.add((Student<T>)new Student<Float>(ID, random.nextFloat(100)));
            break;
            case "Double":
            arrayList.add((Student<T>)new Student<Double>(ID, random.nextDouble(100)));
            break;
            default:
            System.out.println("Use an integer as the grade data type");
            arrayList.add((Student<T>)new Student<Integer>(ID, random.nextInt(100)));

        }
        
    }

    return arrayList;
   }
    public static <T extends Comparable<T>> void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Please input the array size: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Please input the grade data type from the following (Choose either: Integer, Float or Double): ");
        String typeName = scanner.next();
        ArrayList <Student<Float>> arrayList = createRandomArray(arrayLength, typeName);
        System.out.println(arrayList.toString());
        System.out.println(Sort.isSorted(arrayList));
        Sort.mergeSort(arrayList);
        System.out.println(arrayList.toString());
        System.out.println(Sort.isSorted(arrayList));
        System.out.println("Want to input another more data? Enter Yes or No: ");
        String yesNo = scanner.next();
        if(yesNo.equals("No")) break;
        }
        scanner.close();
    }
}
