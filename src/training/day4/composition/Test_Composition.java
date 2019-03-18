package training.day4.composition;

import java.util.ArrayList;
import java.util.List;

class Room {
	int doorSize;
	int doorWidth;
	int numberOfWindows;
	public int getDoorSize() {
		return doorSize;
	}
	public void setDoorSize(int doorSize) {
		this.doorSize = doorSize;
	}
	public int getDoorWidth() {
		return doorWidth;
	}
	public void setDoorWidth(int doorWidth) {
		this.doorWidth = doorWidth;
	}
	public int getNumberOfWindows() {
		return numberOfWindows;
	}
	public void setNumberOfWindows(int numberOfWindows) {
		this.numberOfWindows = numberOfWindows;
	}
	
}

class House {
	String name;
	String city;
	List <Room> numberOfrooms;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Room> getNumberOfrooms() {
		return numberOfrooms;
	}
	public void setNumberOfrooms(List<Room> numberOfrooms) {
		this.numberOfrooms = numberOfrooms;
	}
	
	
}

public class Test_Composition {

	public static void main(String[] args) {
		
		Room bedRoom = new Room ();
		bedRoom.setDoorSize(10);
		bedRoom.setDoorWidth(7);
		bedRoom.setNumberOfWindows(1);
		
		Room hall = new Room();
		hall.setDoorSize(8);
		hall.setDoorWidth(7);
		hall.setNumberOfWindows(4);
		
		List <Room> rooms = new ArrayList <>();
		rooms.add(bedRoom);
		rooms.add(hall);
		
		House house = new House();
		house.setName("My Sweet Home");
		house.setCity("Bangalore");
		house.setNumberOfrooms(rooms);
		
		
		


	}

}
