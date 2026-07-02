import java.util.*;
import java.util.stream.Collectors;

//==================== Pair<T,U> ====================
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

//==================== Generic Stack ====================
class MyStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        System.out.println(stack);
    }
}

//==================== Generic Repository ====================
class Repository<T> {
    private List<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public List<T> getAll() {
        return list;
    }
}

//==================== Generic Interface ====================
interface Printer<T> {
    void print(T item);
}

class ConsolePrinter<T> implements Printer<T> {
    public void print(T item) {
        System.out.println(item);
    }
}

//==================== Generic Constructor ====================
class Display {

    public <T> Display(T value) {
        System.out.println("Generic Constructor Value : " + value);
    }
}

//==================== Employee ====================
class Employee {
    private int id;
    private String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

//==================== Utility Class ====================
class Utility {

    // Generic Method
    public static <T extends Comparable<T>> T findMax(T[] arr) {

        T max = arr[0];

        for (T value : arr) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }

        return max;
    }

    // Wildcard
    public static void printList(List<?> list) {
        System.out.println(list);
    }

    // Upper Bounded Wildcard
    public static double sum(List<? extends Number> list) {

        double total = 0;

        for (Number n : list) {
            total += n.doubleValue();
        }

        return total;
    }

    // Lower Bounded Wildcard
    public static void addNumbers(List<? super Integer> list) {
        list.add(100);
        list.add(200);
    }
}

public class wildCard {

    public static void main(String[] args) {
        
        Pair<String, Integer> pair = new Pair<>("Age", 21);

        System.out.println("Pair");
        System.out.println(pair);

        //================ Stack ==================
        MyStack<String> stack = new MyStack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("\nStack");
        stack.display();

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());

        //================ findMax ==================
        Integer arr[] = {10, 20, 55, 80, 40};

        System.out.println("\nMaximum : " + Utility.findMax(arr));

        //================ Repository ==================
        Repository<Employee> repo = new Repository<>();

        repo.add(new Employee(1, "Sona"));
        repo.add(new Employee(2, "Rahul"));
        repo.add(new Employee(3, "Priya"));

        System.out.println("\nRepository");

        for (Employee e : repo.getAll()) {
            System.out.println(e);
        }

        //================ Wildcard ==================
        List<String> names = Arrays.asList("A", "B", "C");

        System.out.println("\nWildcard Print");
        Utility.printList(names);

        //================ Upper Bound ==================
        List<Integer> numbers = Arrays.asList(10, 20, 30);

        System.out.println("\nSum = " + Utility.sum(numbers));

        //================ Lower Bound ==================
        List<Number> list = new ArrayList<>();

        Utility.addNumbers(list);

        System.out.println("After adding integers : " + list);

        //================ Generic Interface ==================
        Printer<String> printer = new ConsolePrinter<>();

        System.out.println("\nGeneric Interface");
        printer.print("Hello Generics");

        //================ Generic Constructor ==================
        System.out.println("\nGeneric Constructor");
        Display d1 = new Display("Java");
        Display d2 = new Display(100);
        Display d3 = new Display(45.67);

        //================ Streams + Generics ==================
        List<String> language = Arrays.asList(
                "java",
                "python",
                "c++",
                "java");

        List<String> result = language.stream()
                .distinct()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\nStreams with Generics");
        System.out.println(result);

        //================ Type Erasure ==================
        List<String> s = new ArrayList<>();
        List<Integer> i = new ArrayList<>();

        System.out.println("\nType Erasure");
        System.out.println(s.getClass() == i.getClass());

        //================ Composition ==================
        Repository<Pair<String, Integer>> pairRepo = new Repository<>();

        pairRepo.add(new Pair<>("Math", 90));
        pairRepo.add(new Pair<>("Science", 95));

        System.out.println("\nComposition Example");
        System.out.println(pairRepo.getAll());
    }
}