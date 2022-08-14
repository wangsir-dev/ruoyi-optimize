import cn.hutool.core.lang.Console;
import com.bless.admin.starter.App;
import com.bless.service.SysDeptService;
import com.bless.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest(classes = {App.class})
public class ContextTest {

    @Autowired
    SysDeptService sysUserService;

    @Test void context() {
        System.out.println("");
        Console.log(sysUserService.list());
    }

}
