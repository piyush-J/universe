package universe.lostno;

import universe.qual.*;

public class LostNo {

    // TODO: without -Alint=allowLost explicit use of Lost should be forbidden
    // TODO :: error: (uts.explicit.lost.forbidden)
    // @Lost Object lo;

    @Rep Object ro = new @Rep Object();

    void foo(@Rep LostNo rln) {
        // Lost as the result of viewpoint adaptation should be allowed.
        @Any Object a = rln.ro;
    }
}
