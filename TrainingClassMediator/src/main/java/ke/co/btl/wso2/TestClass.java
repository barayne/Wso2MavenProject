package ke.co.btl.wso2;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class TestClass extends AbstractMediator { 

	public boolean mediate(MessageContext context) { 
		// TODO Implement your mediation logic here 
		System.out.println("some thinf from class mediator" + context.getProperty("myTestProperty")); 
		
		context.setProperty("myTestProperty2", "bye bye");
		
		
		return true;
	}
}
