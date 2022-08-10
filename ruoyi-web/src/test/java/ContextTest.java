import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
public class ContextTest {

    @Test void context() {
        final String wangyaxin = new BCryptPasswordEncoder(8).encode("wangyaxin");
        System.out.println(wangyaxin);
    }

}
