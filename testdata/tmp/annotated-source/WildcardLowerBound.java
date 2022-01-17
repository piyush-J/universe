import universe.qual.Self;
import universe.qual.Any;
import universe.qual.Rep;
import java.util.Collections;
import java.util.Set;
import java.util.LinkedHashSet;

public class WildcardLowerBound {

    private @Rep Set _classNames = new @Rep LinkedHashSet();

    @Any Set extract(@Self WildcardLowerBound this) {
        return true ? _classNames : Collections.EMPTY_SET;
    }
}
