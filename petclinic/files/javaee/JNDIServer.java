package com.javaegitimleri.petclinic.javaee;
import java.net.InetAddress;

import javax.naming.Context;

import org.jnp.server.Main;
import org.jnp.server.NamingBeanImpl;

public class JNDIServer implements Runnable {

	private void setup() throws Exception {
		System.setProperty(Context.INITIAL_CONTEXT_FACTORY,
				"org.jnp.interfaces.NamingContextFactory");

		NamingBeanImpl naming = new NamingBeanImpl();
		/*
		 * naming object tries to create an InitialContext with default
		 * properties, and dumps the env through its log4j logger. Therefore
		 * it is important NOT to have classpath:jndi.properties
		 */
		naming.setInstallJavaComp(true);
		naming.start();

		Main server = new Main();
		server.setNamingInfo(naming);
		server.setBindAddress(InetAddress.getLocalHost().getHostAddress());
		server.start();
		System.out.println(Context.INITIAL_CONTEXT_FACTORY + "=" + System.getProperty(Context.INITIAL_CONTEXT_FACTORY));
		System.out.println(Context.PROVIDER_URL + "=" + "jnp://" + server.getBindAddress() + ":" + server.getPort());
		System.out.println("");
		System.out.println("Standalone JNDI Server has started, you can access its Context using above properties");
	}

	public static void main(String... args) {
		Thread t = new Thread(new JNDIServer());
		t.setDaemon(false);
		t.start();
	}

	@Override
	public void run() {
		try {
			setup();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
