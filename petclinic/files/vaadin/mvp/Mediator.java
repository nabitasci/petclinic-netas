package vaadin.mvp;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	
	public static final Mediator INSTANCE = new Mediator();
	
	private Mediator() {		
	}
	
	private List<Presenter> presenters = new ArrayList<Presenter>();
	
	public synchronized void addPresenter(Presenter presenter) {
		presenters.add(presenter);
	}
	
	public synchronized void removePresenter(Presenter presenter) {
		presenters.remove(presenter);
	}
	
	public synchronized void publish(BusinessEvent event) {
		for(Presenter presenter:presenters) {
			presenter.handle(event);
		}
	}
}
