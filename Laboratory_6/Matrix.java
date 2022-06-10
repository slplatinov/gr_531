package Laboratory_6;

public class Matrix {
    double Matr1[][];
    double Matr2[][];
    int i;
    int j;
    double sum;
    int multN;
   Matrix(double[][] table1,double[][] table2)
    {
        this.Matr1 = table1;
        this.Matr2 = table2;
    }

    public static double rnd(int max)
    {
        return (double) (Math.random() * max);
    }

    static void Matr()
    {

    }
    //суммирование матриц
    public void sumMatr() //double tab[][]
    {
        for (j=0;j<=Matr1[0].length-1;j++)
        {
            for(i=0;i<=Matr1.length-1;i++)
            {
                System.out.println("MatrSum " + "("+i+","+j+")");
                System.out.println(Matr1[i][j] + Matr2[i][j]);
            }
        }


        System.out.println(sum);
    }
    //умножение на число
    public void multMatrNumb(int num)
    {
        multN = num;
        for (j=0;j<=Matr1[0].length-1;j++)
        {
            for(i=0;i<=Matr1.length-1;i++)
            {
                System.out.println("multipleMatr " + "("+i+","+j+")"+" * " + multN);
                System.out.println(Matr1[i][j] * multN);
            }
        }


        System.out.println(sum);
    }

    public void multMatr()
    {

    }
}
