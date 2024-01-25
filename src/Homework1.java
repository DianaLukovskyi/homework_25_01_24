import java.util.Arrays;
import java.util.List;

public class Homework1 {

    public static void printNameList (List<String> names){
        names.stream().distinct()
                .forEach(System.out :: println);

    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Eva","John","Svetlana","Martin",
                "Eva","Monika");
        System.out.println("Names from list");
        printNameList(nameList);
    }

}
