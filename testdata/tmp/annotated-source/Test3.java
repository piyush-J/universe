import universe.qual.Rep;
import universe.qual.Any;
import universe.qual.Rep;
import universe.qual.Peer;

public class Test3 {

    class T {
        T(){

        }
    }

    @Rep Object foo;
    Test3() {
        @Any T t = new @Rep T();
    }
}
