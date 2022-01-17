import java.util.*;
import universe.qual.*;

public class PersonSmall {

    PersonSmall spouse;
//    Account savings;
    ArrayList<PersonSmall> friends;

//    PersonSmall(){
//        friends = new ArrayList<PersonSmall>();
//    }
//
    void marry(PersonSmall p) {
        spouse = p;
    }

//    void befriend(PersonSmall p) {
//        friends.add(p);
//    }

//    public int assets() {
//        Account a = spouse.savings;
//        return savings.balance + a.balance;
//    }

    void demo() {
        PersonSmall o1 = new PersonSmall();
        PersonSmall o2 = new PersonSmall();
        this.marry(o1);
//        this.befriend(o2);
    }

//    public class Account {
//        int balance;
//    }
}

