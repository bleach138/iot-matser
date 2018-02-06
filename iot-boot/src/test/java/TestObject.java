import com.fnic.bean.RspData;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.slf4j.Logger;

public class TestObject {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void TestPasswdEncode(){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String passwd = "tenant";

        logger.debug(encoder.encode(passwd));
    }

    @Test
    public void TestRspData() {
        RspData rspData = new RspData();

        rspData.put("2222","22222");

        logger.debug("@@@@@@@");
    }
}
