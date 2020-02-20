package epampr2;
import java.util.Scanner;
public class Giftpack {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int w[]=new int[n];
for(int i=0;i<n;i++)
{
w[i]=sc.nextInt();

}
int low,high;
low=sc.nextInt();
high=sc.nextInt();
sc.close();
Choclates c= new Choclates();
Sweetspack s=new Sweetspack();
System.out.println(s.weight(w,low,high)+c.weight(w,low,high));
System.out.println(s.count(w,low,high)+c.count(w,low,high));


}
}
 class Sweetspack {
public int weight(int w[],int low, int high)
{
int wgt=0;
for (int i=0;i<w.length;i++)
{
if(w[i]>=low&&w[i]<=high)
{

wgt=wgt+w[i];
}
}
return wgt;
}
public int count(int w[],int low, int high)
{
int cnt=0;
for (int i=0;i<w.length;i++)
{
if(w[i]>=low&&w[i]<=high)
{
cnt++;
}
}
return cnt;
}


}
class Choclates extends Sweetspack {
public int weight(int w[],int low, int high)
{
int wgt=0;
for (int i=0;i<w.length;i++)
{
if(w[i]>=low&&w[i]<=high)
{

wgt=wgt+w[i];
}
}
return wgt;
}
public int count(int w[],int low, int high)
{
int cnt=0;
for (int i=0;i<w.length;i++)
{
if(w[i]>=low&&w[i]<=high)
{
cnt++;
}
}
return cnt;
}
}
