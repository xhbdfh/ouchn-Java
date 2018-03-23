/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p20myapplication;

/**
 *
 * @author liyue
 */
public class MyClass {
    private int val1,val2;
    public void myFun(int x ,int y){
        val1=x;
        val2=y;
    System.out.println("The sum is:" + (val1 + val2));
    }
    public static void main(String arg[]){
        MyClass MyObj=new MyClass();
        MyObj.myFun(1,2);
        System.out.println("hello github");
    }
}
