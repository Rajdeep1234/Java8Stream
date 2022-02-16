import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class MainFP04 {
    public static void main(String args[]){
       List<Courses> coursesList= List.of(
               new Courses("Spring", "Framework", 98, 20000),
               new Courses("Spring Boot", "Framework", 95, 18000),
               new Courses("API", "Microservices", 97, 22000),
               new Courses("Microservices", "Microservices", 96, 25000),
               new Courses("FullStack", "FullStack", 91, 14000),
               new Courses("AWS", "Cloud", 92, 21000),
               new Courses("Azure", "Cloud", 99, 21000),
               new Courses("Docker", "Cloud", 92, 20000),
               new Courses("Kubernetes", "Cloud", 91, 20000));


       //Allmatch, nonematch, anymatch


        Predicate<Courses> coursesPredicate = x -> x.getReviewCount() > 95;

        Predicate<Courses> nonecoursesPredicate = x -> x.getReviewCount() > 100;

        Predicate<Courses> anycoursesPredicate = x -> x.getReviewCount() > 95;


        System.out.println(coursesList.stream().allMatch(coursesPredicate));

        System.out.println(coursesList.stream().noneMatch(nonecoursesPredicate));

        System.out.println(coursesList.stream().anyMatch(anycoursesPredicate));

        Comparator<Courses> comparebyNoOfStudentsIncreasig=Comparator.comparing(Courses::getNoOfStudents);
        Comparator<Courses> comparebyNoOfStudentsDecreasing=Comparator.comparing(Courses::getNoOfStudents).reversed();

       System.out.println(coursesList.stream().sorted(comparebyNoOfStudentsIncreasig).collect(Collectors.toList()));

        System.out.println(coursesList.stream().sorted(comparebyNoOfStudentsDecreasing).collect(Collectors.toList()));
        Comparator< Courses> comparebyNoOfStudentsandNoofReviews=Comparator.comparing(Courses::getNoOfStudents).thenComparing(Courses::getReviewCount);;
        System.out.println(coursesList.stream().sorted(comparebyNoOfStudentsandNoofReviews).collect(Collectors.toList()));


        System.out.println(coursesList.stream().sorted(comparebyNoOfStudentsandNoofReviews).limit(5).collect(Collectors.toList()));

        System.out.println(coursesList.stream().sorted(comparebyNoOfStudentsandNoofReviews).skip(3).collect(Collectors.toList()));

        System.out.println(coursesList.stream().max(comparebyNoOfStudentsandNoofReviews).orElse(new Courses("default","default",12,234)));


        System.out.println(coursesList.stream().min(comparebyNoOfStudentsandNoofReviews).orElse(new Courses("default","default",12,234)));


        System.out.println(coursesList.stream().findFirst().orElse(new Courses("default","default",12,234)));

      System.out.println(  coursesList.stream().mapToInt(Courses::getNoOfStudents).average());
        System.out.println(  coursesList.stream().mapToInt(Courses::getNoOfStudents).max());
       OptionalInt val= coursesList.stream().mapToInt(Courses::getNoOfStudents).min();

        System.out.println( val.getAsInt());

       Map<String, List<Courses>> map= coursesList.stream().collect(Collectors.groupingBy(Courses::getCategory));
       System.out.println("map "+map);
        Map<String, Long> map1= coursesList.stream().collect(Collectors.groupingBy(Courses::getCategory,Collectors.counting()));

        System.out.println("map1 "+map1);

        Map<String, Optional<Courses>> map2= coursesList.stream().collect(Collectors.groupingBy(Courses::getCategory, Collectors.maxBy(Comparator.comparing(Courses::getReviewCount))));

        Map<String, List<String>> map3= coursesList.stream().collect(
                Collectors.groupingBy(Courses::getCategory, Collectors.mapping(Courses::getName,Collectors.toList())));
        System.out.println("map "+map3);

    }
}
