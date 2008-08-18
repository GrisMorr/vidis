package ui.events;

public class VidisEvent<D> implements IVidisEvent {

	private int eventId;
	private D data;
	
	public VidisEvent( int eventId, D data ) {
		this.eventId = eventId;
		this.data = data;
	}
	
	public int getID() {
		return eventId;
	}
	
	public D getData() {
		return data;
	}

	@Override
	public String toString() {
		return "VidisEvent<"+data.getClass().getSimpleName()+"> id=" +eventId;
	}
}