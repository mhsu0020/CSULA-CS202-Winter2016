package lab4Example;

public class Tile {

	public enum TileType{
		SUN, DRAGON, TIGER
	}
	TileType typeOne;
	TileType typeTwo;
	boolean isTokenPlacedOnTile;
	String tokenOnTile = "black";



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((typeOne == null) ? 0 : typeOne.hashCode());
		result = prime * result + ((typeTwo == null) ? 0 : typeTwo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tile other = (Tile) obj;
		if (typeOne != other.typeOne)
			return false;
		if (typeTwo != other.typeTwo)
			return false;
		return true;
	}


}
