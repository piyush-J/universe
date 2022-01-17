import universe.qual.Bottom;
import universe.qual.Self;
import java.util.Arrays;

public class InvalidString {
    void foo(@Self InvalidString this) {
        throwException("" + Arrays.asList("", ""));
    }

    void throwException(@Self InvalidString this, @Bottom String s) {}
}
