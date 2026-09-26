package lab1_java;

import java.util.Arrays;

public class lab1 {
    static void main() {
        lab1 main = new lab1();
        System.out.print(main.fraction(125.25D));

        System.out.println(main.sumLastNums(9292));

        System.out.println(main.charToNum('1'));

        System.out.println(main.isPositive(-15));

        System.out.println(main.is2Digits(851));

        System.out.println(main.abs(-15));

        System.out.println(main.safeDiv(12, 5));

        System.out.println(main.is35(33));

        System.out.println(main.makeDecision(2, 1));

        System.out.println(main.max3(1, 2, 3));

        System.out.println(main.listNums(5));

        System.out.println(main.listNums1(5));

        System.out.println(main.chet(10));

        System.out.println(main.pow(2, 5));

        System.out.println(main.numLen(12345L));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(main.findFirst(arr, 2));

        int[] arr1 = {1, 2, 3, 4, 2, 2, 5};
        System.out.println(main.findLast(arr1, 2));

        int[] arr2 = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(main.maxAbs(arr2));

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(main.add(arr3, 9, 3)));

        int[] arr4 = {1, 2, 3, 4, 5};
        int[] ins = {7, 8, 9};
        System.out.println(Arrays.toString(main.add(arr4, ins, 3)));
    }
    public double fraction (double x) {
        double y = x % 1;
        return y;
    }

    public int sumLastNums (int x) {
        int lastDvaNum = x % 100;
        int lastNum = x % 10;
        return (lastDvaNum - lastNum) / 10 + lastNum;
    }

    public int charToNum (char x) {
        return x - '0';
    }

    public boolean isPositive (int x) {
        return x >= 0;
    }

    public boolean is2Digits (int x) {
        return ((100 > x) && (x > 9)) || ((x > -100) && (x <-9));
    }

    public int abs (int x) {
        if (x > 0) { return x; }
        else { return x * (-1);}
    }

    public double safeDiv (int x, int y) {
        if (y == 0) {return 0D;}
        else {return (double) x / y;}
    }

    public boolean is35 (int x) {
        if (x % 15 == 0) {return false;}
        else if (x % 3 == 0) {return true;}
        else if (x % 5 == 0) {return true;}
        else {return false;}
    }

    public String makeDecision (int x, int y) {
        if (x < y) {return x + "<" + y;}
        else if (x > y) {return x + ">" + y;}
        else {return x + "=" + y;}
    }

    public int max3 (int x, int y, int z) {
        int maxNum = x;
        if (maxNum < y) {maxNum = y;}
        if (maxNum < z) {maxNum = z;}
        return maxNum;
    }

    public String listNums (int x) {
        String resUlt = "";
        for (int i = 0; i <= x; i++) {
            resUlt += i + " ";
        }
        return resUlt;
    }

    public String listNums1 (int x) {
        String resUlt = "";
        for (int i = x; i >= 0; i--) {
            resUlt += i + " ";
        }
        return resUlt;
    }

    public String chet (int x) {
        String resUlt = "";
        for (int i = 0; i <= x; i += 2) {
            resUlt += i + " ";
        }
        return resUlt;
    }

    public int pow (int x, int y) {
        int xy = 1;
        for (int i = 1; i <= y; i++) {
            xy = xy * x;
        }
        return xy;
    }

    public int numLen (long x) {
        String y = Long.toString(x);
        int xy = 0;
        for (int i = 0; i < y.length(); i++) {
            xy += 1;
        }
        return xy;
    }

    public int findFirst (int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) { return i; }
        }
        return -1;
    }

    public int findLast (int[] arr, int x) {
        int yo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {yo = i;}
        }
        return yo;
    }

    public int maxAbs (int[] arr) {
        int yo = 0;
        for (int i = 0; i < arr.length; i++) {
            if (yo < Math.abs(arr[i])) { yo = arr[i]; }
        }
        return yo;
    }

    public int[] add (int[] arr, int x, int pos) {
        int[] arr1 = new int[arr.length + 1];
        System.arraycopy(arr, 0, arr1, 0, pos);
        arr1[pos] = x;
        System.arraycopy(arr, pos, arr1, pos + 1, arr.length - pos);
        return arr1;
    }

    public int[] add (int[] arr, int[] ins, int pos) {
        int[] arr1 = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, arr1, 0, pos);
        int j = 0;
        for (int i = pos; i < pos + ins.length; i++) {
            arr1[i] = ins[j];
            j += 1;
        }
        System.arraycopy(arr, pos, arr1, pos + ins.length, arr.length - pos);
        return arr1;
    }
}