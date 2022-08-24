package com.Mojtaba;

import java.util.Scanner;

public class Find_the_larger_number {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("please Enter number of elements: ");
        int numofelement = reader.nextInt();
        int[] array = new int[numofelement];
        System.out.println("please Enter number:");
        for (int i = 0; i < numofelement; i++) {
            array[i] = reader.nextInt();
        }
        int max=array[0];
        for (int j=1 ; j<numofelement ; j++){
            if (array[j]>max){
                max=array[j];
            }

        }
        System.out.println("max is :"+max);
      }
    }
//
//1--> از کلاس اسکنر یک شی میسازیم که کاربر بتونه ورودی وارد کنه
//2--> به کاربر پیغام میدیم میخای چند تا عدد وارد کنی
//3--> یک ورودی میگیرم که کاربر تعداد عدادارو وارد میکنه
//4--> یک ارایه به اندازیه تعداد اعداد میسازیم و اینجا ذخیره میکنیم
//5--> الان باید عدادارو با کمک حلقه فور وارد کنیم و میگیم تا زمانی که به این اعداد وارد شده نرسیدی ادامه بده
//6--> الان میخایم عدد بزرکترو پیدا کنیم یک متغیر مکس تعریف میکنیم و مقدارشو برابر صفر میزاریم و میگیم خونه اولمون مکسه
//7--> الان با کمک حلقه فور میخایم مکسو پیدا کنیم
//8--> یک ایف مینویسیم و میگیم تا زمانی ارایه جی بزرگتر از مکس بود میگیم که مکس تو باش یعنی جی
