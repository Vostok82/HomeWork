import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {

        arrayReturn(5, 0); //Задание 5, вызов метода
        System.out.println();

        checkBalance(); //Задание 7*, вызов метода
        System.out.println();

        elemenDislocation(new int[5], 2); //Задание 8*, вызов метода


        int[] arr = {1, 0, 1, 0, 1, 1, 0, 0}; //Задание 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println();

        int[] arr2 = new int[100]; //Задание 2
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; //Задание 3
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[][] array2d = new int[7][7]; //Задание 4
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                if (i == j) {
                    array2d[i][j] = 1;
                }
                if (j == array2d[i].length - 1 - i) {
                    array2d[i][j] = 1;
                }
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();

        int[] arrMaxMin = new int[10]; //Задание 6*
        int n;
        for (int i = 0; i < arrMaxMin.length; i++) {
            for (n = arrMaxMin.length; n > 0; n--)
                if (arrMaxMin[i] > arrMaxMin[arrMaxMin.length - n]) {
                    System.out.println("Value" + arrMaxMin[i] + "is max value");
                }
            if (arrMaxMin[i] < arrMaxMin[arrMaxMin.length - n]) {
                System.out.println("Value" + arrMaxMin[i] + "is min value");
            }
        }
        System.out.println();
        System.out.println();
        
        
    }

    public static int[] arrayReturn(int len, int initialValue) {  //Задание 5
        int[] arrLen = new int[len];
        for (int i = 0; i < arrLen.length; i++) {
            arrLen[i] = initialValue;
            System.out.println(arrLen[i]);
        }
        return arrLen;
    }

    public static boolean checkBalance() { //Задание 7*
        boolean check = true;
        int[] checkSum = new int[10];
        Random random = new Random();
        for (int i = 0; i < checkSum.length; i++) {
            checkSum[i] = random.nextInt(2);
            for (int j = 0; j < i - 1; j++) {
                if (checkSum[i + j] == checkSum[checkSum.length - (i + j)]) {
                    check = true;
                } else {
                    check = false;}
                }
            } return check;
        }

    public static void elemenDislocation(int newArray[], int n){ //Задание 8*
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(10);
            i = i + n;
            if (i + n >= newArray.length - 1) {
                newArray[i] = newArray[0 + n];
            }
        }
    }
    
}



