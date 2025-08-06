package collection.compare;

public class MyUser implements Comparable<MyUser> {

    private String id;
    private int age;

    public MyUser(String id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyUser{" +
            "id='" + id + '\'' +
            ", age=" + age +
            '}';
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    @Override
    public int compareTo(MyUser o) {
        return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }
    
}
