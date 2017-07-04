import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 1 on 04.07.2017.
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int length = sc.nextInt();
        sc.nextLine();
        int i = 0;
        int arr[] = new int[length];
        System.out.println("Введите 5 случайных чисел:");

        while (i < arr.length){
            arr[i] = sc.nextInt(); //заполняем массив случайными числами
            i++;
        }
        int min = arr[0];
        int max = arr[0];
        int five = 0;
        for(int x = 0; x < arr.length; x++){ // вычисляем максимальное и минимальное значения
            if(arr[x] > max){
                max = arr[x];
            }else{
                min = arr[x];
            }
            if (arr[x]==5){
                five++;
            }
            }
        System.out.println("Количество повторений числа 5 = " + five);

        for(int s = arr.length - 1; s >= 0; s--){
            for(int j = 0; j < s; j++) {
                if (arr[j] > arr[j + 1]) {   // сортировка пузырьком
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
            }
        System.out.print("Отсортированный массив выглядит следующим образом: ");
            for(int z:arr){
            System.out.print(z);}
        }

        }



