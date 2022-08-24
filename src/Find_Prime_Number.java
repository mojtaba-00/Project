import java.util.Scanner;

public class Find_Prime_Number {
    public static void main(String[] args) {
        int i = 2;
        boolean flag = true;
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = intput.nextInt();

        if ((n == 2) || (n == 3))
            System.out.println(n + " is prime ");
        else if (n == 4)
            System.out.println(n + " is not prime");
        else {
            while ((flag == true)) {
                if (n % i == 0)
                    flag = false;
                i++;
            }
            if (flag == true)
                System.out.println(n + " is prime ");
            else
                System.out.println(n + " is not prime");
        }
    }
}
//0--> محاسبه اعداد اول
//1--> میایم یک متغیر تعریف میکنیم بهش عدد 2 رو بهش پاس میکنیم چون اعداد اول از دو شروع میشن
//2--> یک متغیر تعریف میکنم و مقدار درستو بهش میدیم و فرض میکنیم تمتم عدد های که وارد میشه عدد اوله
//3--> یک اسکنر میسازیم میخایم از کاربر که ععدو بده و توی یک ظرف میریزیم عددو
//4-->عدد اول ععدی که به خودش و یک بخشپذیر باشه
//5--> یک ایف میزنیم و میگیم که اگه عدد گرفته شده از کاربر مساوی دو بود عدد اوله اگر مساوی 4 بود عدد اول نیست
//6--> بعد یک حلقه وایل میزنیم و میگیم که تا زمانی که متغیرمون که بالا برابر درست قرار داده بودم بع میاین شرطو میزاریم و میگیم که ععدمون و متغیر ه مون که 2 بود مساوی صفر شه برابر غلط قرار بده
//7--> بعد میایم یک ایف مینویسیم و میگیم اگراون مساوی درست بود عدد اوله وگرنه عدد اول نیست