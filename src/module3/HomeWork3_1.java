package module3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 1 on 05.07.2017.
 */
public class HomeWork3_1 {
    private static ArrayList<Integer> el = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int length = sc.nextInt();
        int c = 0;
        int arr[] = new int[length];
        System.out.println("Введите " + length + " случайных чисел:");

        while (c < arr.length) {
            arr[c] = sc.nextInt(); //заполняем массив случайными числами
            c++;
        }
        int count;
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            count = 0;
            for(int j = 0; j < arr.length; j++){
                if (arr[i]==arr[j]){
                    count++;
                }
                max = max < count ? count : max;
            }
        }
        System.out.println("Максимальное число повторений в массиве = " + max);


    }
}

