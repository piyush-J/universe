package typecheck.topol;

import universe.qual.*;

interface MIt<E extends @Any Object> {
    E next();
}

class GenericInterfaces {
    @Peer MIt<@Rep Object> pro;

    void m() {
        @Rep Object ro = pro.next();
    }

    void raw() {
        @Peer MIt raw = null;

        @Any Object ao = raw.next();

        // :: error: (assignment.type.incompatible)
        @Rep Object ro = raw.next();
        // CF starts using optimistic uninferred type argument
        // subtyping checks. So assignment at line 22 is considered to
        // be subtype: ? extends @Any Object <: @Rep Object
    }

}
