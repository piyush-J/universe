package universe;

import checkers.inference.test.CFInferenceTest;
import org.checkerframework.framework.test.TestUtilities;
import org.checkerframework.javacutil.Pair;
import org.junit.runners.Parameterized.Parameters;
import universe.UniverseChecker;
import universe.solver.UniverseSolverEngine;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniverseInferenceTest extends CFInferenceTest {

    public UniverseInferenceTest(File testFile) {
        super(testFile, UniverseChecker.class, "",
                "-Anomsgtext", "-Astubs=src/universe/jdk.astub", "-d", "testTmp", "-doe");
    }

    @Override
    public Pair<String, List<String>> getSolverNameAndOptions() {
        return Pair.of(UniverseSolverEngine.class.getCanonicalName(),
                new ArrayList<String>(Arrays.asList("useGraph=false", "collectStatistic=true")));
    }

    @Override
    public boolean useHacks() {
        return true;
    }

    @Parameters
    public static List<File> getTestFiles(){
        List<File> testfiles = new ArrayList<>();
        testfiles.addAll(TestUtilities.findRelativeNestedJavaFiles("testinput", "inference"));
        return testfiles;
    }
}
