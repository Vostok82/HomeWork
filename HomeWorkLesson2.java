public class HomeWorkLesson2 {


    public static void main(String[] args) {
System.out.println(intNumbSum(10,5));
positiveOrNegative(-5);
System.out.println(PositiveOrNegative(5));
stringAndNumber("Hi", 3);
System.out.println(year(2000));
    }

    public static boolean intNumbSum(int a, int b) {
        if (a + b > 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }



    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("a это положительное число");
        } else {
            System.out.println("a это отрицательное число");
        }

    }

    public static boolean PositiveOrNegative(int a){
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void stringAndNumber(String srt, int a){
        for (int i = 0; i < a; i++){
            System.out.println(srt);
        }
    }

    public static boolean year(int a) {  //Первый вариант решения
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0){
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else
        {return false;}
    }
}
