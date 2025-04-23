package march_26;

public class Person {
	private String name;
    private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void displayPersonDetails(){
        System.out.print(this.name+" "+this.age);
    }

}
