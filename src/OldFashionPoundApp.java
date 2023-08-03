package src;


import src.operations.*;

public class OldFashionPoundApp {

    public static void main(String[] args) {
        OldPound pound1 = new OldPound(2, 3, 12);
        OldPound pound2 = new OldPound(3, 5, 12);

        System.out.println(pound1);
        System.out.println(pound2);
        Operation sum = new Sum(pound1, pound2);
        Operation substraction = new Substraction(pound1, pound2);
        Operation multip = new Multiplication(pound1, 10);
        Operation divide = new Division(pound2, 2);
        sum.executeOperation();
        substraction.executeOperation();
        multip.executeOperation();
        divide.executeOperation();


        System.out.println(sum);
        System.out.println(substraction);
        System.out.println(multip);
        System.out.println(divide);


    }
}