package module3;

import java.util.Scanner;

/**
 * Created by 1 on 09.07.2017.
 */
public class HomeWork3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите массив, раздел€€ числа пробелом, после окончани€ нажмите enter:");

        String [] arrayString = sc.nextLine().split(" ");
        int x[] = new int[arrayString.length];
        for(int i = 0; i < arrayString.length; i++){
        x[i] = Integer.parseInt(arrayString[i]);}


        int min = x[0];
        int max = x[0];
        int five = 0;
        int count = 0;
        for(int i = 0; i < x.length; i++){ // вычисл€ем максимальное и минимальное значени€
            if(x[i] > max){
                max = x[i];
            }else if(x[i] < min){
                min = x[i];
            }
            if (x[i]==5){
                five++;
            }
        }
        System.out.println();

        System.out.println("ћаксимальным числом в массиве €вл€етс€ " + max +"\n");

        System.out.println("ћинимальным числом в массиве €вл€етс€ "+ min + "\n");

        System.out.println(" оличество повторений числа 5 = " + five +"\n");

        for(int s = x.length - 1; s >= 0; s--){
            for(int j = 0; j < s; j++) {
                if (x[j] > x[j + 1]) {   // сортировка пузырьком
                    int t = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = t;
                }
            }
        }
        System.out.print("ќтсортированный массив выгл€дит следующим образом: ");
        for(int z:x){
            System.out.print(z+" ,");}
    }
}
