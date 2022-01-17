import universe.qual.Rep;
import universe.qual.Self;
import universe.qual.Rep;
import universe.qual.Peer;

public class Test2 {
    @Rep Object foo;

    public void init(@Self Test2 this) {
        // :: fixable-error: (assignment.type.incompatible)
        this.foo = new @Rep Object();

        do_something(this.foo);
        if(foo == null) {
		}
    }

    void do_something(@Self Test2 this, @Rep Object a) {}
}
