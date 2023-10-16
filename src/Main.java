import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean flag = true;
        ArrayList<Toy> toys = new ArrayList<Toy>();
        ArrayList<String> allToy = new ArrayList<>();
        while (flag) {
            System.out.println("Розыгрыш детских игрушек");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Разыграть игрушку");
            System.out.println("0. Выйти");
            Scanner in = new Scanner(System.in);
            int choise;
            try {
                choise = in.nextInt();
            } catch (Exception e) {
                choise = 0;
            }
            switch (choise)
            {
                case 1:
                {
                    toys.add(Toy.addToy());
                    for (int i = 0; i < toys.get(toys.size()-1).getCount(); i++) {
                        allToy.add(toys.get(toys.size()-1).getName());
                    }
                    System.out.println("На данный момент в автомате игрушки:");
                    System.out.println(toys);
                    break;
                }
                case 2:
                {
                    vinnerToy(toys, allToy);
                    System.out.println("На данный момент в автомате игрушки:");
                    System.out.println(toys);
                    break;
                }
                case 0:
                {
                    flag = false;
                    break;
                }
            }
        }
    }
    public static void vinnerToy(ArrayList<Toy> toys, ArrayList<String> allToy)
    {
        int index = (int) Math.round(Math.random() * (allToy.size() - 1));
        System.out.println("Вы выиграли игрушку:");
        System.out.println(allToy.get(index));
        for (int i = 0; i < toys.size(); i++)
        {
            if (allToy.get(index).equals(toys.get(i).getName()))
            {
                if (toys.get(i).getCount() > 1) {
                    int count = toys.get(i).getCount() - 1;
                    toys.get(i).setCount(count);
                }
                else {
                    toys.remove(i);
                }
                break;
            }
        }
    }
}