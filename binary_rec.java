import java.util.*;
class binary_rec
{
    int size,ar[],v,m,l,e;
    binary_rec(int s)
    {   size=s;
        v=0;m=0;l=0;e=size-1;
        ar=new int[size];
    }
    void fill()
    {  Scanner sc=new Scanner(System.in);
       for(int i=0;i<size;i++)
       {   System.out.print("Enter numbers :");
           ar[i]=sc.nextInt();
       }
       System.out.print("Enter number to be searched : ");
       v=sc.nextInt();
    }
    void main()
    {   fill();
        int x=bsearch(ar,l,e);
        if(x==1)
            System.out.println("number found");
        else
            System.out.println("number not found");
    }        
    int bsearch(int ar[],int l,int e)
    {  m=(l+e)/2;
       if(l>e)
          return -1;
       else if(v==ar[m])
          return 1;
       else if(v<ar[m])
          e=m-1;
       else
          l=m+1;
       return bsearch(ar,l,e);
    }   
}    
    
    
