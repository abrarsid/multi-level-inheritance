package com.company;

import java.util.Scanner;
import java.util.concurrent.Callable;

class A
{
    Scanner in=new Scanner(System.in);
    public
    int a,b,c;
    public void data()
    {
        System.out.println("Enter the two number=:");
        a=in.nextInt();
        b=in.nextInt();
    }
}
class B extends A {
    public void Getdata() {
        c = a + b;
        System.out.println("Sum is two number =:" + c);
    }
}
class C extends A
{
    public void show()
    {
        c=a-b;
        System.out.println("Sub is number=:"+c);
    }
}

public class Main {

    public static void main(String[] args)
    {
        // write your code here
      B t=new B();
      t.data();
      t.Getdata();
       C t2=new C();
       t2.data();
       t2.show();


            }
        }


