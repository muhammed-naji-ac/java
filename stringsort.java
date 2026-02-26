import java.util.Scanner;
import java.util.Arrays;
public class  stringsort{
public static void main(String [] args){
Scanner scanner=new Scanner(System.in);
System.out.println("enter the string number");
int n=scanner.nextInt();
String[] strings=new String[n];
System.out.println("enter the string");
for(int i=0;i<n;i++)
{
strings[i]=scanner.next();
}
Arrays.sort(strings);
System.out.println("sorted array is");
for(String str:strings)
{
System.out.println(str);
}
scanner.close();
}
}
