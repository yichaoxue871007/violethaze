package violethaze.message.request;

/**
 * location message
 * 
 * @author violethaze
 *
 */
public class LocationRequestMessage extends BaseRequestMessage {
	private String Location_X;
	private String Location_Y;
	private String Scale;
	private String Label; // message content

	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}
}
