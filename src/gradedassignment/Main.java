package gradedassignment;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String,String> specification = new LinkedHashMap<>();
		
		System.out.println("SPECIFICATIONS::\nos\ncamera\nspeaker\nprocessor\nbattery\nscreen\nram\nhardDiskSpace\n");
		System.out.print("How many specifications you are excepting:");
		int num=sc.nextInt();
		System.out.println();
		for(int i=0;i<num;i++)
		{
			System.out.print("Choose your Specification:");
			String s1=sc.next().toLowerCase();
			System.out.print(s1+"=");
			switch(s1)
			{
			case "os"           :specification.put(s1,sc.next());break;
			case "camera"       :specification.put(s1,sc.next());break;
			case "speaker"      :specification.put(s1,sc.next());break;
			case "processor"    :specification.put(s1,sc.next());break;
			case "battery"      :specification.put(s1,sc.next());break;
			case "screen"       :specification.put(s1,sc.next());break;
			case "ram"          :specification.put(s1,sc.next());break;
		    case "harddiskspace":specification.put(s1,sc.next());break;
		    default:System.out.println("There is no such specification");
			}
		}
		Laptop laptop = new Laptop.LaptopBuilder(specification).build();
		System.out.println(laptop);
	}

}
