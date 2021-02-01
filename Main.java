package com.tts;



public class Main {

    public static void main(String[] args) {
        int a =5;
        int b =4;
        double x =3;
        double n = 25;
        int f =5;
        float r= (float) 3.14;


        Calculator calc1=new Calculator(5, 4);
        System.out.println("The Sum of a+b is :"+calc1.add());
        System.out.println("The Sum of a-b is :"+calc1.sub());
        System.out.println("The product of a*b is :"+calc1.mul());
        System.out.println("The divisor of a/b is :"+calc1.div());
        Calculator calc2=new Calculator(x);
        System.out.println("The Square of x is :"+calc2.sqr());


        MagicCalc calc3=new MagicCalc(n);
        MagicCalc calc5=new MagicCalc(r);
        System.out.println("The Square root of n is :"+calc3.squareRoot());
        System.out.println("The sin  of r is :"+calc3.sin(r));
        System.out.println("The Cosin  of r is :"+calc3.Cosin(r));
        System.out.println("The Tangent  of r is :"+calc3.Tangent(r));
        MagicCalc calc4=new MagicCalc(f);
        System.out.println("Factorial is :"+calc4.factorial(f));
    }
}
