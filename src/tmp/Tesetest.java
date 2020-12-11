package tmp;

public class Tesetest {
    public static void main(String[] args) {
        A a1 = new A();
        a1.show();

        A b = me(a1);
        b.change();
        a1.show();

        A[] arr1 = new A[]{a1};
        A[] arr2 = arr1.clone();

        arr1[0].show();
        arr2[0].change();
        arr1[0].show();

        String s = new String(new char[]{'c'});
    }

    static A me(A a) {
        return a;
    }
}

class A {
    int a;

    void change() {
        a++;
    }

    void show() {
        System.out.println(a);
    }
}

