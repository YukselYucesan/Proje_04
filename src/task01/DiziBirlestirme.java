package task01;

import java.util.*;

public class DiziBirlestirme {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.print("Array 1 elements = ");
        String array1Elements=read.nextLine().trim();
        String[] array1= array1Elements.split(",");

        System.out.print("Array 2 elements = ");
        String array2Elements=read.nextLine().trim();
        String[] array2= array2Elements.split(",");

        TreeSet<Integer> ts=new TreeSet<>();
        for (int i = 0; i < array1.length; i++) {
            ts.add(Integer.valueOf(array1[i]));
        }
        for (int i = 0; i < array2.length; i++) {
            ts.add(Integer.valueOf(array2[i]));
        }
        System.out.println("ts = " + ts);

    }
}
