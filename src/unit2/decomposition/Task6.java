package unit2.decomposition;

public class Task6 {
    //6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    //Взаимно простые числа — целые числа, не имеющие никаких общих делителей, кроме ±1.
    //Равносильное определение: целые числа взаимно просты, если их наибольший общий делитель (НОД) равен 1.
    static void task6(int i1, int i2, int i3) {
        int nod = nod(i1, nod(i2, i3));
        System.out.printf("Числа %d %d %d",i1,i2,i3);
        if (nod==1){
            System.out.println(" являются взаимно простыми");
        }
        else {
            System.out.println(" не являются взаимно простыми");

        }
    }

    private static int nod(int a, int b) {
        return (b == 0) ? a : nod(b, a % b);
    }
}
