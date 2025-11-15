class Matrix
{
    int value[][]=new int[5][5];
}
public class Multiply
{
    public static void main(String args[])
    {
        int i,j,k;
        Matrix m1,m2,m3;
        m1=new Matrix();
        m2=new Matrix();
        m3=new Matrix();
        int mat1[][]={{1,2,3},{4,5,6}};
        int mat2[][]={{1,2},{3,4},{5,6}};
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                m1.value[i][j]=mat1[i][j];
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<2;j++)
            {
                m2.value[i][j]=mat2[i][j];
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                m3.value[i][j]=0;
                for(k=0;k<3;k++)
                {
                    m3.value[i][j]+=m1.value[i][k]*m2.value[k][j];
                }
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(m3.value[i][j]+" ");
            }
            System.out.println();
        }
    }
}
