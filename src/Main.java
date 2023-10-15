import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Toy> toys = new ArrayList<Toy>();
        toys.add(new Toy("dog",3));
        toys.add(addToy());
        System.out.println(toys);
        System.out.println(Toy.allCount);

    }
    public static Toy addToy()
    {
        System.out.println("Введите название игрушки");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Введите кол-во данных игрушек");
        int count = in.nextInt();
        return new Toy(name, count);
    }
}