import universe.qual.Any;
import universe.qual.Bottom;
import universe.qual.*;

public class Array {

    @Bottom int @Rep[] pi;
    // :: fixable-error: (assignment.type.incompatible)
    @Bottom int @Any [] xpi = pi;

}
