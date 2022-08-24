package com.Mojtaba;

import java.util.Scanner;

public class Find_Perfect_Number {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("please Enter number:");
        int number=reader.nextInt();
        int sum=0;
        for (int i=1 ; i<number ; i++){
            if (number % i==0){
                sum+=i;
            }
        }if (sum==number){
            System.out.println(number+"is perfect");
        }else {
            System.out.println(number+"is not perfect");
        }


    }
}
//0--> محاسبه کامل بودن یک عدد
//1--> عدد کامل چه ععدی است عددس است تمام مقسوم علیه هاشو باهم جمع کنیم خود عدد میاد مثل عدد28=1+2+4+7+17=28
//2--> از کلاس اسکنر یک شی میسازیم ار کاربر میخایم عدد وارد کنه و اون عددو توی یک ظرف میریزیم که بت.نیم استفاده کنیم ازش
//3--> بعد یک متغیر جمع درست میکنیم
//4--> و یک حلقه فور میزنیم و میگیم تا عدد داده شده از کاربر برو جلو تکرار کن
//5--> روش محاسبه مقسوم علیه که یاقی مانده مساوی صفر باشد
//6--> پس یک ایف میزنیم و میگیم این عدد ما که از کاربر گرفتیم تا زمانی که شمارنده ما یعنی ای مساوی صفر بود یعنی مقسوم علیه یعنی عدد کامله
//7--> و همون جا هم جمع رو += ای میکنیم
//8--> از حلقه میایم بیرون و میگیم اگه جمع ما مساوی عدد ما بو عدد کامل و د غیر این صورت عدد کامل نیست