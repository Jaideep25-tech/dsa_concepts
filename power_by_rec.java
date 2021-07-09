import java.util.*;
class power_by_rec
{
    int power(int b,int p)
    {
        if(p>=1)
        {
            return(b*power(b,(p-1)));
        }
        else
        {
            return 1;
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any no. and its power");
        int a=sc.nextInt();
        int y=sc.nextInt();
        power_by_rec ob =new power_by_rec();
        int x=ob.power(a,y);
        System.out.println(x);
    }
}