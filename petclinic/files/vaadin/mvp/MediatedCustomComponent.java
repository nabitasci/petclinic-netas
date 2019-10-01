package vaadin.mvp;

import com.vaadin.ui.CustomComponent;

public abstract class MediatedCustomComponent extends CustomComponent {
	
	private static final long serialVersionUID = 1L;
	

	@Override
	public void attach() {
		super.attach();
		Mediator.INSTANCE.addPresenter(getPresenter());
	}
	
	@Override
	public void detach() {
		Mediator.INSTANCE.removePresenter(getPresenter());
		super.detach();
	}
	
	protected abstract Presenter getPresenter();
	
}