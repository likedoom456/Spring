package test;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator
 * 2016/8/24.
 */
public class FreemarkerTest {
    public static void main(String[] args) throws IOException, TemplateException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        Template template = freeMarkerConfig.getConfiguration().getTemplate("test.ftl"); // 1. template
//        Map<String, String> map = new HashMap<>(); // 2. Java object
//        map.put("name", "Freemarker");
        Writer writer = new FileWriter("test.txt"); // 3. output
        template.process(null, writer); // 4. process
    }
}
