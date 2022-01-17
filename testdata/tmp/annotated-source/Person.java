import universe.qual.Bottom;
import universe.qual.Rep;
import universe.qual.Any;
import universe.qual.Self;
import universe.qual.Peer;
import java.util.ArrayList;

// Based on the example in the Universe paper
public class Person {

    @Rep Person spouse;
    @Peer Account savings;
    @Rep ArrayList<@Any Person> friends;

    Person() {

        friends = new @Rep ArrayList<@Any Person>();
    }

    void marry(@Self Person this, @Rep Person p) {
        spouse = p;
    }

    void befriend(@Self Person this, @Any Person p) {
        friends.add(p);
    }

    public @Bottom int assets(@Self Person this) {
        @Any Account a = spouse.savings;
        return savings.balance + a.balance;
    }

    void demo(@Self Person this) {
        @Any Person o1 = new @Rep Person();
        @Any Person o2 = new @Rep Person();
        this.marry(o1);
        o1.befriend(o2);
    }

    public class Account {
        @Bottom int balance;
    }
}
