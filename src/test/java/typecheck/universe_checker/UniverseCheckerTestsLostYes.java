package universe;

import java.io.File;
import java.util.List;

import org.checkerframework.framework.test.CheckerFrameworkPerDirectoryTest;
import org.junit.runners.Parameterized.Parameters;

public class UniverseCheckerTestsLostYes extends CheckerFrameworkPerDirectoryTest {
    public UniverseCheckerTestsLostYes(List <File> testFiles) {
        super(testFiles, UniverseChecker.class, "", "-Anomsgtext", "-d", "testTmp");
    }

    @Parameters
    public static String [] getTestDirs(){
        return new String[]{"typecheck/lostyes"};
    }
}
