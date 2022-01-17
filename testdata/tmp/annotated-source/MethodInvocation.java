import universe.qual.Any;
import universe.qual.Lost;
import universe.qual.Peer;
import universe.qual.Self;
import universe.qual.Rep;
import universe.qual.*;

public class MethodInvocation {

	class B {
		// :: fixable-error: (return.type.incompatible)
		@Rep Object foo (@Self MethodInvocation.B this, @Any Object o) { return new @Rep Object();}

		@Peer Object bar (@Self MethodInvocation.B this, @Any Object o) { return new @Peer Object();}
	}

	void foo(@Self MethodInvocation this, @Peer B b, @Rep Object ro) {
		// :: fixable-error: (argument.type.incompatible)
		@Any Object o = b.foo(ro);
	}

	@Peer B b = new @Peer B();
	@Rep Object ro;
	// :: fixable-error: (assignment.type.incompatible)
	// :: fixable-error: (argument.type.incompatible)
	@Lost Object o = b.foo(ro);

	// (assignment.type.incompatible)
	// (argument.type.incompatible)
	// @Rep Object o2 = b.foo(ro); // TODO -- shift to typecheck

	@Peer Object po;
	@Any Object o_ = b.bar(po);

}
