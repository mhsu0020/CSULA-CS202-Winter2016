package lab4Example;

import java.util.ArrayList;

public class EnumExample {

	public enum TileType{
		SUN, DRAGON, TIGER
	}
	public static void main(String[] args) {
		ArrayList<TileType> tileTypes = new ArrayList<>();
		tileTypes.add(TileType.DRAGON);
		tileTypes.add(TileType.TIGER);
		tileTypes.add(TileType.SUN);

		System.out.println(tileTypes.contains(TileType.TIGER));
		for(TileType type : tileTypes){
			System.out.println(type);
		}
	}

}
