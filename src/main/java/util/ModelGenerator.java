package util;

import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/8/24.
 */
public class ModelGenerator {
    public static void main(String[] args) throws IOException, TemplateException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        FreeMarkerConfig freeMarkerConfig = (FreeMarkerConfig) applicationContext.getBean("freemarker");

        Template template = freeMarkerConfig.getConfiguration().getTemplate("model.ftl");
        Map<String, String> map = new HashMap<>();
        System.out.println("input Model class Name: ");
        String model = new Scanner(System.in).nextLine();
        map.put("model", model);
        Writer writer = new FileWriter("src/main/java/model/" + model + ".java");

        template.process(map, writer);
    }
}
