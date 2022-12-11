package ke5ea2; 

public class EggTimerTest {
	public static void main(String[] args) {
		EggTimerModel eggModel = new EggTimerModel(60);
		EggTimerCanvas canvas = new EggTimerCanvas(eggModel);
		EggFrame frame = new EggFrame(canvas);
	}
}
