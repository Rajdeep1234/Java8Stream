import java.util.ArrayList;
import java.util.List;

public class MainFP01 {
    public static void main(String args[]){
        System.out.println("HI");
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(8);
        list.add(89);
        list.add(78);
        printAllNumbersInList(list);
        printAllNumbersInListStream(list); //using stream and method reference
        printOddNumbersInListStream(list);
        printSquareOfNumbersInList(list);
        printCubeOfNumbersInList(list);

        List<String>  strlist=new ArrayList<String>();
        strlist.add("aws");
        strlist.add("docker");
        strlist.add("kubernetis");
        strlist.add("spring boot");
        
        printAllStringIndividually(strlist);
        printStringStsrtsWithSprig(strlist);
        printStringLengthMoreThanFour(strlist);
        printLengthOfStringInList(strlist);
    }

    private static void printLengthOfStringInList(List<String> strlist) {
        strlist.stream().map(str->str+" "+str.length()).forEach(System.out::println);
    }

    private static void printCubeOfNumbersInList(List<Integer> list) {
        list.stream().map(num->num*num*num).forEach(System.out::println);
    }

    private static void printSquareOfNumbersInList(List<Integer> list) {
        list.stream().filter(num->num%2==0).map(num->num*num).forEach(System.out::println);
    }

    private static void printStringLengthMoreThanFour(List<String> strlist) {
        strlist.stream().filter(str->str.length()>4).forEach(System.out::println);
    }

    private static void printStringStsrtsWithSprig(List<String> strlist) {
        strlist.stream().filter(str->str.contains("spring")).forEach(System.out::println);
    }

    private static void printAllStringIndividually(List<String> strlist) {
        strlist.stream().forEach(System.out::println);
    }

    private static void printOddNumbersInListStream(List<Integer> list) {
        list.stream().filter(number->number%2==1).forEach(System.out::println);
    }

    private static void printAllNumbersInListStream(List<Integer> list) {
        for(int num:list){
            if(num%2==0)
            System.out.println("Non stream ouput :: "+num);
        }
    }

    private static void printAllNumbersInList(List<Integer> list) {
       // list.stream().forEach(Main::print); //Method reference
       // list.stream().forEach(System.out::println);
       // list.stream().filter(Main :: isEven).forEach(System.out::println);

        list.stream().filter(num->num%2==0).forEach(System.out::println);

    }

//    private static boolean isEven(int number){
//        return number%2==0;
//    }

//    private static void print(Integer integer) {
//        System.out.println("Stream output : "+integer);
//    }
}
