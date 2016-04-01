package areas;

// if an Area is a two-dimensional x, y coordinate plane, then each coordinate is an AreaBlock

public abstract class AreaBlock {
	protected final String entranceText;
	
	public AreaBlock(String entranceText) {
		this.entranceText = entranceText;
	}
}
