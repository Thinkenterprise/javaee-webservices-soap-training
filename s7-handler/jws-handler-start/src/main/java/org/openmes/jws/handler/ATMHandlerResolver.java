package org.openmes.jws.handler;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class ATMHandlerResolver implements HandlerResolver {

	@Override
	public List<Handler> getHandlerChain(PortInfo portInfo) {
		
		List<Handler> hanlderList = new ArrayList<Handler>();
		hanlderList.add(new LogicDebugHandler());
		
		return hanlderList;
		
	}

}
