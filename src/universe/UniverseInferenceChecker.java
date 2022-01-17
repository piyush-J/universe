package universe;

import checkers.inference.BaseInferenceRealTypeFactory;
import checkers.inference.BaseInferrableChecker;
import checkers.inference.InferenceAnnotatedTypeFactory;
import checkers.inference.InferenceChecker;
import checkers.inference.InferenceVisitor;
import checkers.inference.InferrableChecker;
import checkers.inference.SlotManager;
import universe.qual.Any;
import universe.qual.Bottom;
import universe.qual.Lost;
import universe.qual.Peer;
import universe.qual.Rep;
import universe.qual.Self;
import universe.UniverseDeclareAnnotationMirror;
import checkers.inference.model.ConstraintManager;
import org.checkerframework.common.basetype.BaseAnnotatedTypeFactory;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.framework.source.SupportedLintOptions;
import org.checkerframework.javacutil.AnnotationBuilder;

import javax.lang.model.element.AnnotationMirror;


/**
 * The main checker class for the Generic Universe Types checker.
 *
 * @author wmdietl
 */
@SupportedLintOptions({"checkOaM", "checkStrictPurity"})
public class UniverseInferenceChecker extends BaseInferrableChecker {

    @Override
    public void initChecker() {
        super.initChecker();
        UniverseDeclareAnnotationMirror.init(this);
    }

    @Override
    public BaseInferenceRealTypeFactory createRealTypeFactory(boolean infer) {
        return new UniverseAnnotatedTypeFactory(this, infer);
    }

    @Override
    public InferenceVisitor<?, ?> createVisitor(InferenceChecker checker,
            BaseAnnotatedTypeFactory factory, boolean infer) {
        return new UniverseInferenceVisitor(this, checker, factory, infer);
    }

    @Override
    public boolean withCombineConstraints() {
        return true;
    }

    @Override
    public InferenceAnnotatedTypeFactory createInferenceATF(
            InferenceChecker inferenceChecker, InferrableChecker realChecker,
            BaseAnnotatedTypeFactory realTypeFactory, SlotManager slotManager,
            ConstraintManager constraintManager) {
        return new UniverseInferenceAnnotatedTypeFactory(inferenceChecker,
                withCombineConstraints(), realTypeFactory, realChecker,
                slotManager, constraintManager);
    }

    @Override
    public boolean isInsertMainModOfLocalVar() {
        return true;
    }
}
