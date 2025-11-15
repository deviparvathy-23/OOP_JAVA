class Matrix
{
    int value[][]=new int[10][10];
    int i,j,k;
    Matrix multiply(Matrix n)
    {
        Matrix c=new Matrix ();
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c.value[i][j]=0;
                for(k=0;k<3;k++)
                {
                    c.value[i][j]+=this.value[i][k]*n.value[k][j];
                }
            }
        }
        return c;
    }
}
public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Matrix m1,m2,m4;
        m1=new Matrix();
        m2=new Matrix();
        m4=new Matrix();
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{1,2},{4,5},{6,2}};
        m1.value=a;
        m2.value=b;
        m4= m1.multiply(m2);
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(m4.value[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
