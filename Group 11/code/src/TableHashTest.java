import jdk.internal.jline.internal.TestAccessible;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class TableHashTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(TableHash.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    private TableHash testClassInstance;
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        testClassInstance = new TableHash();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        testClassInstance = null;
    }
    public static Hashtable<String, Integer> hm = new Hashtable<String, Integer>();
    @TestAccessible

    public void Test putifAbsent{

        try{

        }
    }


}
