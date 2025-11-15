class Char
{
    char value[]=new char[10];

}
public class Main
{
    public static void main(String[] args)
    {
        Char n1;
        n1=new Char();
        int i;
        char[] charArray = {'o', 'l', 'l', 'l', 'o'};
        int l=5;
        for(i=0;i<5;i++)
        {
            n1.value[i] = charArray[i];
        }
        for(i=0;i<l;i++)
        {
            if(n1.value[i]!=n1.value[l-i-1])
            {
                System.out.println("Not a pallindrome");
                break;
            }
        }
        if(i==l)
        {
            System.out.println("paindrome");
        }
       
    
        
    }
}
