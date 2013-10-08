package tn.edu.esprit.erpBi.clientProject.serviceLocator;

import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceLocator {

	private Context context;
	private Map<String, Object> cache;

	private static ServiceLocator instance;

	private ServiceLocator() {

		cache = new HashMap<String, Object>();

		try {

			context = new InitialContext();

		} catch (NamingException e) {

			// throw new ServiceLocatorException(e);
			e.printStackTrace();

		}

	}

	public synchronized static ServiceLocator getInstance() {
		if (instance == null) {
			instance = new ServiceLocator();
		}
		return instance;
	}

	public synchronized Object getProxy(String jndiName) {
		Object proxy = null;

		proxy = cache.get(jndiName);
		if (proxy == null) {
			try {
				proxy = context.lookup(jndiName);
			} catch (NamingException e) {
				e.printStackTrace();
			}
			cache.put(jndiName, proxy);
		}
		return proxy;
	}

}
