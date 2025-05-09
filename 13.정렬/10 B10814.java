import java.util.*;
public class B10814 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Person p[] = new Person[N];
        for(int i=0; i<N; i++){
            p[i] = new Person(scanner.nextInt(), scanner.next());
        }

        Arrays.sort(p, (p1, p2) ->{
            return p1.age - p2.age;
        });

        StringBuilder sb = new StringBuilder();
        for(Person ps : p){
            sb.append(ps.age + " " + ps.name + "\n");
        }
        System.out.print(sb);
    }

    public static class Person{
        int age;
        String name;
        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
}