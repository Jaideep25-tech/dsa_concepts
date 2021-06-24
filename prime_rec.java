import java.util.*;
class prime_rec
{ 
    int n,limit;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        limit=sc.nextInt();
        for(int i=1;i<=limit;i++)
        {
            if(isPrime(i,limit-1)==1)
                System.out.println(i);
        }
    }

    int isPrime(int n, int d)
    {
        if(d<=1)
            return 1;
        else if(n%d==0)
            return 0;
        else
            return isPrime(n,--d);
    }
}

