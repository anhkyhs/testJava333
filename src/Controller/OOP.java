package Controller;

import Model.Coder;
import Model.Person;

import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Coder coder = new Coder();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap tuoi: ");
        int tuoi = sc.nextInt();
        while (coder.getAge() == 0) {
            System.out.println("Nhap lai tuoi: ");
            tuoi = sc.nextInt();
            coder.setAge(tuoi);

        }

        System.out.println("ten:");
        String name = sc.next();
        coder.setName(name);

        System.out.println("sdt:");
        String phone = sc.next();
        coder.setPhone(phone);

        System.out.println("Chon ngon ngu: ");
        System.out.println("1. Java");
        System.out.println("2. C");
        System.out.println("3. C#");
        System.out.println("4. Python");
        System.out.println("Nhap lua chon: ");
        int choice = sc.nextInt();
        String courseName = "";
        switch (choice) {
            case 1:
                courseName = "Java";
                break;
            case 2:
                courseName = "C";
                break;
            case 3:
                courseName = "C#";
                break;
            case 4:
                courseName = "Python";
                break;
        }

//        System.out.println("ngon ngu:" );
//        String language = sc.next();
//        coder.setProgramming_Language(language);

        System.out.println("ngon ngu:" + courseName);
        System.out.println("ten:" + coder.getName());
        System.out.println("tuoi:" + coder.getAge());
        System.out.println("sdt:" + coder.getPhone());
    }

}
