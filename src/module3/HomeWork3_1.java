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
        int i = 0;
        int arr[] = new int[length];
        System.out.println("Введите " + length + " случайных чисел:");

        while (i < arr.length){
            arr[i] = sc.nextInt(); //заполняем массив случайными числами
            i++;
        }
        int element = 0;                                                                             //сохраняем элемент для вывода
        int count = 0;
        int value[] = new int[arr.length]; //сохоаняем колличество совпадений для вывода
        for (int c = 0; c < arr.length; c++) {                                                  //тут считаем элемены
            if (c_element(arr[c])) {
                for (int j = 0; j < arr.length; j ++) {
                    if (arr[c] == arr[j]) {
                        count++;
                        element = arr[j];
                        el.add(arr[c]);

                    }
                    value[c] = count;

                }
            }
            if (count > 1) System.out.println("Число = " + element + "; количество повторений = " + count);  //если совпадений больше 1 то выводим на экран
            count = 0;                                                                                    //тут сбрасываем счетчик
        }

        int max = value[0];
        for(int z = 0; z < value.length; z++){
            if(value[z] > max){
                max = value[z];
            }
        }
        System.out.println("Максимальное количество повторений чисел = " + max);
    }
    private static boolean c_element (int arr_i) {               //тут бует проверка элемента, считали ли мы его?
        for (int k = 0; k < el.size(); k++) {
            if (arr_i == el.get(k)) return false;
        }
        return true;
    }

    }

