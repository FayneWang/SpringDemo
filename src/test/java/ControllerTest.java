import com.fayne.springdemo.config.WebMvcConfigurationSupportDemo;
import com.fayne.springdemo.mvctest.TestController;
import com.fayne.springdemo.restful.HelloSpring;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

/**
 * Created by fayne on 2017/8/22
 *
 */
public class ControllerTest {



    @Autowired
    HelloSpring helloSpring;

    private MockMvc mockMvc;

    @Before
    public void setup(){
        TestController controller = new TestController();
        mockMvc = MockMvcBuilders.standaloneSetup(helloSpring).build();
    }

    @Test
    public void HelloWorld() throws Exception {

//        ClassPathXmlApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

        mockMvc.perform(get("/hello").contentType(MediaType.APPLICATION_JSON_UTF8));
    }


}
