package util;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.*;

/**
 * Created by Administrator
 * 2016/8/24.
 */
public class ModelGenerator {
    public static void main(String[] args) throws IOException, TemplateException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        Template template = freeMarkerConfig.getConfiguration().getTemplate("model.ftl");

        Scanner scanner = new Scanner(System.in);

        Map<String, Object> map = new HashMap<>();
        System.out.println("input Model class Name: ");
        String model = scanner.nextLine();
        map.put("model", model);

        Map<String, String> properties = new TreeMap<>();
        System.out.println("input Model class properties: ");
        String line = scanner.nextLine(); // String name, int age, String gender
        for (String property : line.split(", ")) {
            properties.put(property.split(" ")[0], property.split(" ")[1]);
            System.out.println(property.split(" ")[0]+"<-------------->"+property.split(" ")[1]);
        }

        map.put("properties", properties);

        Writer writer = new FileWriter("src/main/java/model/" + model + ".java");

        template.process(map, writer);
    }
}
