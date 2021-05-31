package gradedassignment;

import java.util.*;

public class Laptop {
	
	private String os;
	private String camera;
	private String speaker;
	private String processor;
	private String battery;
	private String screen;
	private String ram;
	private String hardDiskSpace;
	
	public Laptop(LaptopBuilder builder) {
		super();
		this.os =builder.os;
		this.camera = builder.camera;
		this.speaker = builder.speaker;
		this.processor =builder. processor;
		this.battery = builder.battery;
		this.screen = builder.screen;
		this.ram =builder. ram;
		this.hardDiskSpace = builder.hardDiskSpace;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getSpeaker() {
		return speaker;
	}

	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getHardDiskSpace() {
		return hardDiskSpace;
	}

	public void setHardDiskSpace(String hardDiskSpace) {
		this.hardDiskSpace = hardDiskSpace;
	}
	
	/*========================Builder=============================*/
	public static class LaptopBuilder
	{
		private String os;
		private String camera;
		private String speaker;
		private String processor;
		private String battery;
		private String screen;
		private String ram;
		private String hardDiskSpace;
		
		@SuppressWarnings("rawtypes")
		public LaptopBuilder(Map<String,String> map) {
			Set keys = map.keySet();
			Iterator itr = keys.iterator();
			while(itr.hasNext())
			 {
				String s1=(String)itr.next();
				switch(s1) 
				{
				case "os"           :this.os       =map.get(s1);break;
				case "camera"       :this.camera   =map.get(s1);break;
				case "speaker"      :this.speaker  =map.get(s1);break;
				case "processor"    :this.processor=map.get(s1);break;
				case "battery"      :this.battery  =map.get(s1);break;
				case "screen"       :this.screen   =map.get(s1);break;
				case "ram"          :this.ram      =map.get(s1);break;
				case "harddiskspace":this.hardDiskSpace=map.get(s1);break;
				
				}
			 }
		}
		
		/*=====================Build Method=============*/
		public Laptop build() {
			return new Laptop(this);
		}	
	}
    /*===================================================================*/
	
	@Override
	public String toString() {
		return "Laptop [os=" + os + ", camera=" + camera + ", speaker=" + speaker + ", processor=" + processor
				+ ", battery=" + battery + ", screen=" + screen + ", ram=" + ram + ", hardDiskSpace=" + hardDiskSpace
				+ "]";
	}
	
	
}
