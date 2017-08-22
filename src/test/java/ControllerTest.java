import com.fayne.springdemo.config.WebMvcConfigurationSupportDemo;
import com.fayne.springdemo.restful.HelloSpring;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * Created by fayne on 2017/8/22
 */@ContextConfiguration("classpath*:/spring-context.xml")
@WebAppConfiguration
public class ControllerTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private HelloSpring helloSpring;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        HelloSpring helloSpring = new HelloSpring();
        mockMvc = MockMvcBuilders.standaloneSetup(helloSpring).build();
    }

    @Test
    public void HelloWorld() throws Exception {

        mockMvc.perform(get("/hello").contentType(MediaType.APPLICATION_JSON_UTF8));
    }


}
