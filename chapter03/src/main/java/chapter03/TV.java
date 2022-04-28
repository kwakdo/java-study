package chapter03;

public class TV {
	private int channel; // 0 ~ 255 rotation
	private int volume; // 0 ~ 100 rotation
	private boolean power;

	public void volume(boolean up) {
		volume(volume + (up ? 1 : -1));

	}

	public void volume(int volume) {
		this.volume = volume;
	}

	public void status() {
		System.out.println("TV[channel=" + channel + ", volume=" + volume + ", power=" + (power ? "on" : "off"));
	}

}
