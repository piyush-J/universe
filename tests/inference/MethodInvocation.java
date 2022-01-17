import universe.qual.*;

public class MethodInvocation {

	class B {
		// :: fixable-error: (return.type.incompatible)
		@Rep Object foo (Object o) { return new Object();}

		@Peer Object bar (Object o) { return new Object();}
	}

	void foo(@Peer B b, @Rep Object ro) {
		// :: fixable-error: (argument.type.incompatible)
		Object o = b.foo(ro);
	}

	@Peer B b = new B();
	@Rep Object ro;
	// :: fixable-error: (assignment.type.incompatible)
	// :: fixable-error: (argument.type.incompatible)
	Object o = b.foo(ro);

	// (assignment.type.incompatible)
	// (argument.type.incompatible)
	// @Rep Object o2 = b.foo(ro); // TODO -- shift to typecheck

	@Peer Object po;
	Object o_ = b.bar(po);

}
