package org.openmes.jws.handler;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public class LogicDebugHandler implements LogicalHandler<LogicalMessageContext> {

	public boolean handleMessage(LogicalMessageContext logicalMessageContext) {
		
			System.out.println(LogicDebugHandler.class.getSimpleName());

			LogicalMessage logicalMessage = logicalMessageContext.getMessage();

			Source source = logicalMessage.getPayload();

			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer;

			try {
				transformer = transformerFactory.newTransformer();
				StreamResult result = new StreamResult(System.out);
				transformer.transform(source, result);

			} catch (Exception e) {

				e.printStackTrace();
			}

			System.out.println(LogicDebugHandler.class.getSimpleName()
					+ "called");
		
		return true;

	}

	@Override
	public void close(MessageContext arg0) {
	}

	@Override
	public boolean handleFault(LogicalMessageContext logicalMessageContext) {
		return false;
	}

}
