package DSA.ScenerioBasedProblems.OnlineShoppingSystem;

public class Customer extends Person {

    private String city;
    private boolean primeMember;

    public Customer(int id, String name, String email,
                    String city, boolean primeMember) {
        super(id, name, email);
        this.city = city;
        this.primeMember = primeMember;
    }

    public String getCity() {
        return city;
    }

    public boolean isPrimeMember() {
        return primeMember;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCity : " + city +
                "\nPrime Member : " + primeMember;
    }
}