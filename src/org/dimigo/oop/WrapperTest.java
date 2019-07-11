package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //wrapper 클래스 : Primitive type를 wrapping하는 클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toOctalString(10));
        System.out.println(Integer.toHexString(10));


        //boxing
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        //2) value of
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d = Double.valueOf(3.14);


        //unboxing
        int r1 = i3.intValue();
        double r2 = d.doubleValue();

        //문자열 -> primitiva Type
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("3.14");

        //100 + 200 = 300
        System.out.println(args[0]);
        System.out.println(args[1]);

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n", n1, n2, n1+n2 );

        Integer i5 = new Integer(1000);
        Integer i6 = new Integer(2000);
        System.out.println(i5 + i6);

        Integer obj1 = 1000;
        int r3 = obj1 + 100;


        Integer obj2 = 10; //autoboxing
        Integer obj3 = obj2+20; //autounboxing 1번, autoboxing 1번
        Integer result = obj2+obj3; //autounboxing 2번




  }
}
