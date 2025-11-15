class frequency{
    int c=0,i;
    int fcount(char []S,char a){
    for(i=0;i<5;i++){
      if (S[i]==a){
        c=c+1;
      }   
    }
    return c;
    }
    }
public class Stringfrequency {
    public static void main(String args[]){
        int count;
        frequency f =new frequency();
        char []arr={'h','e','l','l','o'};
        char k='l';
        count=f.fcount(arr,k);
        System.out.println(count);
    }
}
