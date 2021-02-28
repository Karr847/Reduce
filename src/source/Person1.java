package source;

import java.util.List;

class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + this.name + "'" +
                ", age=" + age + "}";
    }

    public static void main(String[] args) {



            List<Person> list = List.of(new Person(28, "Joshua"),
                    new Person(33, "Abdulla"),
                    new Person(20, "Salman"),
                    new Person(40, "Ali"));

            Person theOldest = list.stream()
                    .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                    .orElse(null);
            System.out.println(theOldest);
            String all=list.stream()
                    .map(p->p.getName())
                    .reduce("All names",(n1,n2)->n1+" , "+n2);
        System.out.println(all);

        }






}