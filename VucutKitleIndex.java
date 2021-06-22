import java.util.Scanner;

public class VucutKitleIndex {

    public static void main(String[] args){

        double boy, kilo, vucutKitleIndex;

        Scanner inp = new Scanner(System.in);
        
        System.out.println("please login your height(metres) : ");
        boy = inp.nextDouble();

        System.out.println("please login your weight(kilogram) : ");
        kilo = inp.nextDouble();
        
        vucutKitleIndex = kilo/(boy*boy);

        System.out.println("your body index : " + vucutKitleIndex);

    }
    
}
