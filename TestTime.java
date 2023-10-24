import java.util.Scanner;
class Time
{
int hour,min,sec;
public Time(int h,int m,int s)
{
hour=h;
min=m;
sec=s;
}
public Time()
{
hour=0;
min=0;
sec=0;
}
void showTime()
{
int h, m,s;
s=sec%60;
m=(min+sec/60)%60;
h=hour+(min+sec/60)/60;


String x,y,z;
 x= String.format("%02d",h);
y=String.format("%02d",m);
z=String.format("%02d",s);
System.out.println("hh:mm:ss :-");
System.out.println(x+":"+y+":"+z);

}

Time addTime(Time a)
{
Time T=new Time();
T.hour=a.hour+hour;
T.min=a.min+min;
T.sec=a.sec+sec;
return T;
}
}

class TestTime{
public static void main(String a[])
{
Scanner sc = new Scanner(System.in);

System.out.println("Enter Time in hh:mm:ss format :");
int hour=sc.nextInt();
int min=sc.nextInt();
int sec=sc.nextInt();

Time ob1=new Time(hour,min,sec);
ob1.showTime();

System.out.println("Enter Time in hh:mm:ss format :");
int hour1=sc.nextInt();
int min1=sc.nextInt();
int sec1=sc.nextInt();

Time ob2=new Time(hour1,min1,sec1);
ob2.showTime();

Time ob3=new Time();
ob3=ob1.addTime(ob2);

ob3.showTime();
}
}