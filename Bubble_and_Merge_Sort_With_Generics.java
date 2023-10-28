import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;



public class Bubble_and_Merge_Sort_With_Generics {

    public static void main (String[] args) throws Exception {

        /**********initialization**********/
        Bubble_Sort bubble_sort_object = new Bubble_Sort();
        Merge_Sort merge_sort_object = new Merge_Sort();

        /*****the array lists that will be sorted. feel free to change them!*****/
        ArrayList<Double> array_list_to_sort = new ArrayList<>();
        ArrayList<Double> array_list_to_sort_2 = new ArrayList<>();
        ArrayList<Integer> array_list_to_sort_3 = new ArrayList<>();
        ArrayList<Integer> array_list_to_sort_4 = new ArrayList<>();
        
        array_list_to_sort.add(0.5); 
        array_list_to_sort.add(312.5);
        array_list_to_sort.add(208432.45);
        array_list_to_sort.add(25.32); 

        array_list_to_sort_2.add(0.5); 
        array_list_to_sort_2.add(312.5);
        array_list_to_sort_2.add(208432.45);
        array_list_to_sort_2.add(25.32);         

        array_list_to_sort_3 = bubble_sort_object.create_a_random_integer_array_list(10, 2);
        array_list_to_sort_4 = merge_sort_object.create_a_random_integer_array_list(10, 2);

        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");

        /**********bubble sort with doubles**********/
        System.out.println("Unsorted list of numbers:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort.size(); a++) {
            System.out.println(array_list_to_sort.get(a));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Sorting specified numbers with bubble sort. Please wait...");
        bubble_sort_object.bubble_sort(array_list_to_sort);
        System.out.println("Sorted list of numbers using bubble sort:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort.size(); a++) {
            System.out.println(array_list_to_sort.get(a));
        }

        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");

        /**********merge sort with doubles**********/
        System.out.println("Unsorted list of numbers:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort_2.size(); a++) {
            System.out.println(array_list_to_sort_2.get(a));
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorting specified numbers with merge sort. Please wait...");
        merge_sort_object.merge_sort (array_list_to_sort_2);
        System.out.println("Sorted list of numbers using merge sort:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort_2.size(); a++) {
            System.out.println(array_list_to_sort_2.get(a));
        }

        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");

        /**********bubble sort with integers**********/
        System.out.println("Unsorted list of numbers:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort_3.size(); a++) {
            System.out.println(array_list_to_sort_3.get(a));
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Sorting specified numbers with bubble sort. Please wait...");
        bubble_sort_object.bubble_sort(array_list_to_sort_3);
        System.out.println("Sorted list of numbers using bubble sort:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort_3.size(); a++) {
            System.out.println(array_list_to_sort_3.get(a));
        }

        System.out.println("*******************************************************");
        System.out.println("*******************************************************");
        System.out.println("*******************************************************");

        /**********merge sort with integers**********/
        System.out.println("Unsorted list of numbers:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort_4.size(); a++) {
            System.out.println(array_list_to_sort_4.get(a));
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Sorting specified numbers with merge sort. Please wait...");
        merge_sort_object.merge_sort (array_list_to_sort_4);
        System.out.println("Sorted list of numbers using merge sort:");
        //print contents of random array
        for (int a = 0; a < array_list_to_sort_4.size(); a++) {
            System.out.println(array_list_to_sort_4.get(a));
        }
        
    }
}