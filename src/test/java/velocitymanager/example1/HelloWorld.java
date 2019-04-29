package velocitymanager.example1;

import java.io.StringWriter;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
public class HelloWorld
{
    public static void main( String[] args ) throws Exception
    {
        // Initialize an engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();
        
        // Get the Template
        String path = "\\src\\test\\java\\velocitymanager\\helloworld.vm";
        Template template = ve.getTemplate(path);
        
        //Create Data
        String data = "World";
        
        // Create a context and add data
        VelocityContext context = new VelocityContext();
        context.put("name", data);
        
        // Create a String Writer
        StringWriter writer = new StringWriter();
        
        //Merge Context and Writer using Template
        template.merge( context, writer );
        
        //Print
        System.out.println(writer.toString());     
    }
}