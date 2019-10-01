package com.javaegitimleri.petclinic.javaee;

import javax.naming.Context;

import org.apache.activemq.broker.BrokerService;
import org.apache.activemq.command.ActiveMQDestination;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.apache.activemq.jndi.ActiveMQInitialContextFactory;

public class JMSServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		BrokerService broker = new BrokerService();
		 
		// configure the broker
		broker.addConnector("tcp://localhost:61616");
		ActiveMQDestination topic = new ActiveMQTopic("myTopic");
		ActiveMQDestination queue = new ActiveMQQueue("myQueue");
		
		broker.setDestinations(new ActiveMQDestination[]{topic,queue});
				
		broker.start();

		System.out.println("You can access ActiveMQ internal JNDI Context with the following properties");
		System.out.println(Context.INITIAL_CONTEXT_FACTORY + "=" + ActiveMQInitialContextFactory.class.getName());
		System.out.println(Context.PROVIDER_URL + "=" + "tcp://localhost:61616");
		System.out.println("topic.myTopic=myTopic");
		System.out.println("queue.myQueue=myQueue");
	}

}
