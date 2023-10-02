import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean flag = true;
        ArrayList<String> grocerList = new ArrayList<>();

        while (flag){
            printActions();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> addItems(grocerList);
                case 2 -> removeItems(grocerList);
                default -> flag = false;

            }
        }

        grocerList.sort(Comparator.naturalOrder());
        System.out.println(grocerList);

    }

    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add the groceries (seperated by commas)");
        String[] array = sc.nextLine().split(",");
        groceries.addAll(List.of(array));
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Insert what you want to remove (seperated by commas)");
        String[] array = sc.nextLine().split(",");
        groceries.removeAll(List.of(array));
    }

    private static void printActions(){
        String textblock = """
                Available actions:
                                
                0 - to shutdown hjkkh
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";

        System.out.println(textblock);
    }


}
