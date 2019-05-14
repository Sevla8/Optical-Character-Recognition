import java.util.ArrayList;
import java.lang.Math;

public class Coord {
	public int x;
	public int y;

	public Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getNearest(ArrayList<Coord> list) {
		Coord result = list.get(0);
		int distance = Math.abs(result.x - this.x) + Math.abs(result.y - this.y);
		for (Coord coord : list) {
			if (Math.abs(coord.x - this.x) + Math.abs(coord.y - this.y) < distance) {
				distance = Math.abs(coord.x - this.x) + Math.abs(coord.y - this.y);
				result = coord;
			}
		}
		return list.indexOf(result);
	}

	public boolean equals(Object object) {
		if (object == null)
			return false;
		if (this.getClass() != object.getClass())
			return false;
		Coord coord = (Coord) object;
		if (this.x != coord.x)
			return false;
		if (this.y != coord.y)
			return false;
		return true;
	}

	public String toString() {
		String string = new String("");
		string += "x : \n";
		string += this.x + "\n";
		string += "y : \n";
		string += this.y + "\n";
		return string;
	}
}
