package problemSolvingEasy;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(35);
        list.add(40);
        list.add(90);
//        list.stream().forEach(i -> System.out.println(i));
//        List<Integer> filteredlist = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        List<Integer> transformedlist =  list.stream().map(i -> i * 2).collect(Collectors.toList());
        List<Integer> passedList=list.stream().filter(i -> i>=35).collect(Collectors.toList());
        List<Integer> failedList=list.stream().filter(i -> i<35).map(i -> i+5).collect(Collectors.toList());

        System.out.println(failedList);

    }
}
