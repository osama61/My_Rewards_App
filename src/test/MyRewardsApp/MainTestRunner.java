import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        HomeScreenTest.class,
        LoginFlowTest.class,
        FoodPageTest.class,
        ScrollingTest.class,
        SearchFunctionalityTest.class,
        StoreSectionTest.class,
        LifeStyleTest.class
})
public class MainTestRunner {



}


