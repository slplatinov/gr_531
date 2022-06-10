package Laboratory_6;

import static Laboratory_6.Matrix.rnd;

public class Mass {
    public static void main(String[] args) {
        int rw,col;
        double table1[][] = new double[5][10];
        double table2[][] = new double[5][10];
        int max = 10;
        int multipleNumber = 7;
        Matrix t1 = new Matrix(table1,table2);

        double rnd = rnd(max);;
        for (int c=0; c <= table1[0].length-1;c++)
        {
            for (int r = 0; r <= table1.length-1; r++)
            {
                table1[r][c] = rnd(max);
                table2[r][c] = rnd(max);
                System.out.println("row= "+ r + " col= "+ c + " = " + table1[r][c]);
            }
        }
        t1.sumMatr();                       //Суммирование элементов массива
        t1.multMatrNumb(multipleNumber);    //Умножение элементов массива на число



    }
}
