import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //int people = scanner.nextInt(); //2
        //int pizzasSlices = scanner.nextInt(); //9

        int people = 2;
        int pizzasSlices = 9;

        int pizzas = 1;
        while((pizzas * pizzasSlices) % people != 0){
            pizzas++;
        }
        System.out.println(pizzas);
    }
}