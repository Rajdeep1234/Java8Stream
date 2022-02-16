import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        System.out.println("HI");
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(8);
        list.add(89);
        list.add(78);
        printAllNumbersInList(list);
        printAllNumbersInListStream(list);

    }

    private static void printAllNumbersInListStream(List<Integer> list) {
        for(int num:list){
            System.out.println("Non stream ouput :: "+num);
        }
    }

    private static void printAllNumbersInList(List<Integer> list) {
        list.stream().forEach(Main::print); //Method reference
    }

    private static void print(Integer integer) {
        System.out.println("Stream output : "+integer);
    }
}
