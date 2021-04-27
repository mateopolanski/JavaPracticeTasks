import java.util.Scanner;

abstract class Shape {

    int width;
    int result;
    double result2;
    abstract void area();

}
//your code goes here

    class Square extends Shape {

        Square(int width) {

            super();
            this.width = width;

        }

        @Override
        void area() {
            result = width * width;
            System.out.println(result);
        }
    }

    class Circle extends Shape {

         Circle(int width) {
            super();
            this.width = width;
        }

        @Override
        void area() {
            result2 = Math.PI * width * width;
            System.out.println(result2);
        }
    }


     class Program {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();

            Square a = new Square(x);
            Circle b = new Circle(y);
            a.area();
            b.area();
        }
    }
