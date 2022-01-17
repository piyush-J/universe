import universe.qual.Peer;
import universe.qual.Rep;
import universe.qual.Self;
import universe.qual.*;
import java.util.List;

public class Member {

    void foo(@Self Member this, @Rep E e) {
        // :: fixable-error: (assignment.type.incompatible)
        @Rep List<@Rep Object> l = e.le;
    }

    class E {
        @Peer List<@Peer Object> le;
    }

}
