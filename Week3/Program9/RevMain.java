import java.util.Scanner;
class Rev
{
    int a[],m;
    Scanner sc=new Scanner(System.in);
    void takeInput()
    {
        System.out.print("ENTER SIZE: ");
        m=sc.nextInt();
        a=new int[m];
       
        System.out.print("ENTER VALUES OF ARRAY: ");
        for(int i=0;i<m;i++)
        {  
            a[i]=sc.nextInt();
        }
    }
    void rev()
    {
        int flag=0;
        int va=0;
        int vb=m-1;
        while(va<=vb){
        flag=a[va]; a[va]=a[vb];a[vb]=flag;
        va++; vb--;
        }
        for(int i=0;i<m;i++)
        {  
            System.out.print(a[i]+" ");
        }
    }
}
class RevMain
{
    public static void main(String[] args)
    {
        Rev ob=new Rev();
        ob.takeInput();
        ob.rev();
    }
}