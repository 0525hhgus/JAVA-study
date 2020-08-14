import java.util.*;

class Location {
	private String latitude; // 위도
	private String longitude; // 경도

	public Location() {
	}

	public Location(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public void set_latitude(String latitude) {
		this.latitude = latitude;
	}

	public void set_longitude(String longitude) {
		this.longitude = longitude;
	}


	public String get_latitude() {
		return this.latitude;
	}

	public String get_longitude() {
		return this.longitude;
	}

}

public class ch7_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Location> loc = new HashMap<String, Location>();
		String input = "";
		String[] array;
		
		System.out.println("도시, 경도, 위도를 입력하세요.");
		for (int i = 0; i < 4; i++) {
			input = sc.nextLine();
			array = input.split(", ");
			
			loc.put(array[0], new Location(array[1], array[2]));
		}
		
		Set<String> keys = loc.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Location value = loc.get(key);
			System.out.println(key+" "+value.get_latitude()+" "+value.get_longitude());
		}
		
		while(true) {
			System.out.print("도시 이름 >> ");
			String name = sc.next();
			
			if(name.equals("그만"))
				break;
			
			Location location = loc.get(name);
			
			if(location == null)
				System.out.println(name+"는 없습니다.");
			else
				System.out.println(name + " " + location.get_latitude() + " " + location.get_longitude());
		}
		

	}

}
