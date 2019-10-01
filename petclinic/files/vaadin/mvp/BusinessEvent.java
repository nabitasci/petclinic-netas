package vaadin.mvp;

import java.util.EventObject;

public abstract class BusinessEvent extends EventObject {

	private static final long serialVersionUID = 1L;

	public BusinessEvent(Object source) {
		super(source);
	}
}
