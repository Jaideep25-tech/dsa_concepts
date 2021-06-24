import java.util.*;
class armstrong_recursion
{
    int n,s,r;
    armstrong_recursion(int x)
    {
        n=x;
        int m=arm(n);
        if(m==n)
        System.out.println("armstrong");
        else
        System.out.println("not");
    }
    int arm(int x)
    {
        if(x==0)
        return 0;
        else
        return (int)Math.pow(x%10,3)+arm(x/10);
    }
}
    