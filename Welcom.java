import java.util.Scanner; // подключение сканера для считки с клавы

public class Welcom
{
    public static void main(String[] args)
    {
        System.out.println("Введите 1 для ввода матрицы с клавиатуры или другую цифру для автоматизации заполнения");
        Scanner input = new Scanner(System.in);
        System.out.println();

        int N=20,M=20;
        int[][] matrix = new int[20][20];
        int i, j;
        int temp;
        temp = input.nextInt();


        if (temp == 1)
        {//ввод матрицы с клавы
            System.out.print("Введите кол-во столбцов ");
             N = input.nextInt();
            System.out.print("Введите кол-во строк ");
             M = input.nextInt();


            for (i = 0; i < N; i++)
            {
                for (j = 0; j < M; j++)
                {
                    matrix[i][j] = input.nextInt();
                }
            }
            for (i = 0; i < N; i++)
            {
                for (j = 0; j < M; j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();

        } else {//Вводд матрицы генерацией случайных чисел
            System.out.print("Введите кол-во столбцов ");
            N = input.nextInt();
            System.out.print("Введите кол-во строк ");
            M = input.nextInt();
            for (i = 0; i < N; i++)
            {
                for (j = 0; j < M; j++)
                {
                    matrix[i][j] = (int) (1 + (Math.random() * 100));
                }

            }
            for (i = 0; i < N; i++)
            {
                for (j = 0; j < M; j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }




        System.out.print("Чтобы найти минимум нажмите 0, найти максимум - 1, среднее арифметическое - 2");
        System.out.println();
        temp = input.nextInt();
        while(temp!=3){

        switch (temp) {
            case (0) -> {
                int min = matrix[0][0];
                for (i = 0; i < N; i++) {
                    for (j = 0; j < M; j++) {
                        min = Math.min(matrix[i][j], min);
                    }

                }
                System.out.print("min = "+min);
                System.out.println();
            }
            case (1) -> {
                int max = matrix[0][0];
                for (i = 0; i < N; i++) {
                    for (j = 0; j < M; j++) {
                        max = Math.max(matrix[i][j], max);
                    }

                }
                System.out.print("max = " +max);
                System.out.println();
            }
            case (2)->{
                int sum=0;
                double sred = matrix[0][0];
                for (i = 0; i < N; i++) {
                    for (j = 0; j < M; j++) {
                        sum += matrix[i][j];
                    }

                }
                sred=(double)sum/(N*M);
                System.out.print("sred = " +sred);
                System.out.println();
            }
            default -> {
                System.out.print("Выберите предложеное значение");
                System.out.println();
            }

        }
        System.out.print("Чтобы найти минимум нажмите 0, найти максимум - 1, среднее арифметическое - 2, чтобы выйти нажмите 3");
            System.out.println();
            temp = input.nextInt();
    }

    System.out.print("end");
        System.out.println();


    }

}