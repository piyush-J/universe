package universe.lostno;

import universe.qual.*;

public class LostNo {

    // @Lost Object lo; // -Alint=allowLost doesn't forbid explicit annotation

    @Rep Object ro = new @Rep Object();

    void foo(@Rep LostNo rln) {
        // Lost as the result of viewpoint adaptation should be allowed.
        @Any Object a = rln.ro;
    }
}
