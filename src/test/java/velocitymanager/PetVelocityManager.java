package velocitymanager;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

/**
 * 
 * @author Sheetal_Singh, May 2018
 * 
 * Velocity Manager is best for making template of any kind
 * e.g. data to be read from excel and we need to create some user defined file
 *
 */
public class PetVelocityManager {

	public static void main(String[] args) throws IOException {

		// Initialize an engine
        VelocityEngine ve = new VelocityEngine();
        ve.init();
		
        
        // Get the Template
        String path = "\\src\\test\\java\\velocitymanager\\pettemplate2.vm";
        Template template = ve.getTemplate(path);
        
        
        //Get data
        PetDataClass obj = new PetDataClass();
        List<PetDomain> lsPetDomain = obj.getData();
        
		
        // Create a context and add data into context
        VelocityContext context = new VelocityContext();
        context.put("petList", lsPetDomain);
        
        
        // Create a String Writer
        StringWriter writer = new StringWriter();
        
        
        //Merge Context and Writer using Template
        template.merge(context, writer);
        
        
        //Print
        System.out.println(writer.toString());     
	}

}
