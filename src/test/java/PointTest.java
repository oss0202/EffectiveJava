import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import java.util.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import third.PhoneNumber;

import java.util.logging.LogManager;


public class PointTest {

    static final Logger logger = Logger.getLogger(PointTest.class.getName());

    @BeforeAll
    void beforeAllTests() {
        logger.info("Before all tests");
    }

    @Test
    void 포인트_테스트(){
        PhoneNumber phoneNumber = new PhoneNumber(010,1111,2222);

    }
}
