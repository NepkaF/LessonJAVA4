import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Person implements Comparable<Person>{
    String name;
    String gender;
    int age;
    public void _init_(String Name,Integer Age,String Gender){
        Scanner scanner = new Scanner(System.in);
        this.name = Name;
        this.age = Age;
        this.gender = Gender;
    }

    @Override
    public int compareTo(Person o) {
        return this.age;

    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во человек");
        ArrayList<Person> s = new ArrayList<>();
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            String na= scanner.next();
            String g = scanner.next();
            Integer a = scanner.nextInt();
            Person p=new Person();
            p._init_(na,a,g);
            s.add(p);
        }
        System.out.println("Для вывода списка людей введите 1");
        System.out.println("Для вывода списка отсортировонного по возрасту введите 2");
        System.out.println("Для выхода введите 0");
        Integer y = 3;
        while (y!=0){
            y=scanner.nextInt();
            if (y==1){
                for (int i = 0; i<n;i++){
                    System.out.print(s.get(i).name);
                    System.out.print(s.get(i).age);
                    System.out.println(s.get(i).gender);
                }
            }
            if (y==2){
                Collections.sort(s);
                for (int i = 0; i<n;i++){
                    System.out.print(s.get(i).name);
                    System.out.print(s.get(i).age);
                    System.out.println(s.get(i).gender);
                }
            }
        }
    }
}