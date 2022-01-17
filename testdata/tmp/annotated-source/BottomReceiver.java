import universe.qual.Any;
import universe.qual.Bottom;
import universe.qual.Self;
import universe.qual.*;

public class BottomReceiver {
    void foo(@Self BottomReceiver this, @Bottom char @Any [] a) {
        String s = "Hello";
        // :: fixable-error: (assignment.type.incompatible)
        a = s.toCharArray();
    }
}
