package com.tts;
//import static java.lang.Math.sqrt;
//import java.io.*;

 public class Calculator {
    static int a;
    static int b;
    static double x;

    Calculator(int a, int b){
        this.a=a;
        this.b=b;
    }
     Calculator(double x){
         this.x=x;
     }

     public Calculator() {
              }

    int add() {return a+b;}
    int sub() {return a-b;}
    int mul() {return a*b;}
    int div() {return a/b;}
   double  sqr() {return x*x;}
}

class MagicCalc extends Calculator {
     double n;
     int f;
     float r;
    MagicCalc(double n){
        super();
        this.n=n;

    }
    MagicCalc(int f){
        super();
        this.f=f;

    }

    MagicCalc(float r){
        super();
        this.r=r;
    }


    double squareRoot() {return Math.sqrt(n);}

    double sin(double r) {

        return Math.sin(r);
    }


    double Cosin(double r) {

        return Math.cos(r);
    }

    double Tangent(double r) {
        return Math.tan(r);
    }


    public long factorial(int f) {
        long fact = 1;
        for (int i = 2; i <= f; i++) {
            fact = fact * i;
        }
        return fact;
    }

}




