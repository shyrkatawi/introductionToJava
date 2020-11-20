package unit2.decomposition;

public class Task11 {
    //11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    static void task11(int a,int b) {
        int countOfDigitsA = getAmountOfDigits(a);
        int countOfDigitsB = getAmountOfDigits(b);
        if(countOfDigitsA>countOfDigitsB){
            System.out.printf("Число %d содержит больше цифр чем число %d\n", a,b);
        }
        else if(countOfDigitsB>countOfDigitsA){
            System.out.printf("Число %d содержит больше цифр чем число %d\n", b,a);
        }
        else {
            System.out.printf("Число %d содержит такое же количество цифр как и число %d\n", a,b);
        }
    }

    private static int getAmountOfDigits(int n) {
        int amount = 0;
        if (n < 10) {
            amount++;
        } else {
            while (n != 0) {
                amount++;
                n /= 10;
            }
        }
        return amount;
    }
}
