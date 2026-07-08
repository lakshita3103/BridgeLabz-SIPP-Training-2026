package DSA.ScenerioBasedProblems.OnlineShoppingSystem;

public abstract class Person{
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email){
        this.id = id;
        this.name=name;
        this.email=email;
    }
    public int getId(){
        return id ;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void display(){
        System.out.println(id+" "+name+" "+email);
    }
    public void display(String message){
        System.out.println(message);
        display();
    }
    @Override
    public String toString(){
        return "ID : "+id + "\nName : "+name+"\nEmail : "+email;
    }
}