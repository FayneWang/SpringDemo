import com.fayne.springdemo.config.WebMvcConfigurationSupportDemo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by fayne on 2017/8/22
 *
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebMvcConfigurationSupportDemo.class)
public class WithWebAppCongiurationTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    private MockHttpServletRequestBuilder mockMvcRequestBuilder;
    private MockHttpServletResponse mockHttpServletResponse;

    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void test() throws Exception {
        mockMvcRequestBuilder = get("/test");
        mockMvcRequestBuilder.contentType(MediaType.APPLICATION_JSON_UTF8);
        ResultActions resultActions = mockMvc.perform(mockMvcRequestBuilder);
        mockHttpServletResponse = resultActions.andReturn().getResponse();
        String conteynt = mockHttpServletResponse.getContentAsString();
        conteynt = conteynt;
    }

    @Test
    public void testDataTest() throws Exception {

        String url = "/test/{data}";

        mockMvcRequestBuilder = get(url,"everything");
        mockMvcRequestBuilder.contentType(MediaType.APPLICATION_JSON_UTF8);
        ResultActions resultActions = mockMvc.perform(mockMvcRequestBuilder);
        mockHttpServletResponse = resultActions.andReturn().getResponse();
        String conteynt = mockHttpServletResponse.getContentAsString();
        conteynt = conteynt;
    }
}
