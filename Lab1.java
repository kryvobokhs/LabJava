import java.util.Scanner; // подключение сканера для считки с клавы

public class Welcom
{
    public static void main(String[] args)
    {


        System.out.println("Введите 1 для ввода матрицы с клавиатуры или другую цифру для автоматизации заполнения");
        Scanner input = new Scanner(System.in);
        int temp, N, M;

        temp = input.nextInt();
        System.out.println();

        hMatrix matr = new hMatrix();

        if (temp == 1)
        {//ввод матрицы с клавы
            matr.hHandMatrix();
            System.out.println();

        } else {//Вводд матрицы генерацией случайных чисел
            matr.hAutoMatrix();
            System.out.println();

        }


        System.out.print("Чтобы найти минимум нажмите 0, найти максимум - 1, среднее арифметическое - 2, cреднее геометрическое - 3,");
        System.out.println();
        temp = input.nextInt();
        while(temp!=4){

        switch (temp) {
            case (0) -> {
                matr.hMin();

            }
            case (1) -> {
                matr.hMax();
            }
            case (2)->{
                matr.hSred();
            }
            case (3)->{
                matr.hSredGeom();
            }
            default -> {
                System.out.print("Выберите предложеное значение");
                System.out.println();
            }

        }
        System.out.print("Чтобы найти минимум нажмите 0, найти максимум - 1, среднее арифметическое - 2, cреднее геометрическое - 3, чтобы выйти нажмите 4");
            System.out.println();
            temp = input.nextInt();
    }

    System.out.print("end");
        System.out.println();


    }

}

class hMatrix
{

    int N;
    int M;
    {
        N=20;
        M=20;
    }

    Scanner input = new Scanner(System.in);
    //System.out.println();
    int[][] matrix=new int[N][M];

    hMatrix(){
        System.out.print("Введите кол-во строк:");
        System.out.println();
        N = input.nextInt();

        System.out.print("Введите кол-во столбцов:");
        System.out.println();
        M = input.nextInt();
    }

    void hHandMatrix(){//ввод матрицы с клавы


        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.println("Введите элементы через пробел и нажмите Enter");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    void hAutoMatrix(){
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                matrix[i][j] = (int) (1 + (Math.random() * 100));
            }

        }
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }

    void hMax(){
        int max = matrix[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                max = Math.max(matrix[i][j], max);
            }

        }
        System.out.println("max = " +max);

    }

    void hMin()
    {
        int min = matrix[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                min = Math.min(matrix[i][j], min);
            }

        }
        System.out.println("min = "+min);
    }

    void hSred()
    {
        int sum=0;
        double sred = matrix[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum += matrix[i][j];
            }

        }
        sred=(double)sum/(N*M);
        System.out.print("sred = " +sred);
        System.out.println();
    }

    void hSredGeom()
    {
        double Mul = 1.0;
        //Подсчёт произведения  элементов матрицы
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                Mul *= matrix[i][j];
            }
        }
        //среднее геометрическое значение элементов матрицы
        double averGeom = Math.pow(Mul, 1.0 / ((double)(N*M)));

        System.out.println("Cреднее геометрическое значение элементов матрицы : " + averGeom);


    }




}
