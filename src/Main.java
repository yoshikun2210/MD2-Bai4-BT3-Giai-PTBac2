import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a ,b,c;
        System.out.println("nhap a");
        a = scanner.nextDouble();
        while (a==0){
            System.out.println("nhap lai a");
            a = scanner.nextDouble();
        }
        System.out.println("nhap b");
        b = scanner.nextDouble();
        System.out.println("nhap c");
        c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation();
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
        double delta = equation.getDiscriminant();
        System.out.println("delta===="+delta);
        if (delta < 0){
            System.out.println("phuong trinh vo nghiem");
        }else if (delta == 0){

            System.out.println("phuong trinh co nghiem kep = " + equation.getRoot1());
        }else {
            System.out.println("phuong trinh co 2 nghiem phan biet : " + "x1 = "+ equation.getRoot1() + " ;" +"x2 = "+ equation.getRoot2());

        }

    }

}