package com.javaegitimleri.petclinic.javaee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

import com.dumbster.smtp.SimpleSmtpServer;
import com.dumbster.smtp.SmtpMessage;

public class SMTPServer implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new SMTPServer());
		t.start();
	}

	@Override
	public void run() {
		SimpleSmtpServer smtpServer = SimpleSmtpServer.start(1125);
		try {
			System.out.println("Smtp Server started on port 1125, type help to get list of commands that can be executed");
			while(true) {
				if(System.in.available() != 0) {
					BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
					String command = reader.readLine();
					if("stop".equals(command)) {
						smtpServer.stop();
						System.out.println("Smtp Server stopped, terminating application...");
						break;
					} else if ("list".equals(command)) {
						if(smtpServer.getReceivedEmailSize() > 0) {
							Iterator receivedEmailIterator = smtpServer.getReceivedEmail();
							while(receivedEmailIterator.hasNext()) {
								SmtpMessage message = (SmtpMessage) receivedEmailIterator.next();
								
								System.out.println(message.toString());
								receivedEmailIterator.remove();
							}
						} else {
							System.out.println("There is no received message");
						}
					} else if("help".equals(command)) {
						System.out.println("Type one of those commands following with Enter :\nhelp - shows this message\nlist - shows received messages and deletes them\nstop - stops the server and terminates application\n");
					} else {
						System.err.println("Unknown command >" + command + "< type help to get a list of available commands");
					}
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			smtpServer.stop();		
		}
	}
}