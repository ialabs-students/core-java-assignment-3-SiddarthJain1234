
public class WrapperClassConvert {
	
	public static void main(String[] args) {
		convertToWrapper(25f);
	}

	public static void convertToWrapper(Object obj) {
		if (obj instanceof Integer) {
			Integer i = (Integer) obj;
			System.out.println("int " + i);
		}
		else if (obj instanceof Boolean) {
			Boolean b = (Boolean) obj;
			System.out.println("Boolean " + b);
		}
		else if (obj instanceof Float) {
			Float f = (Float) obj;
			System.out.println("Float " + f);
		}

		else if (obj instanceof Character) {
			Character c = (Character) obj;
			System.out.println("Char " + c);
		}
		else if (obj instanceof Byte) {
			Byte b = (Byte) obj;
			System.out.println("Byte " + b);
		}
		else if (obj instanceof Double) {
			Double d = (Double) obj;
			System.out.println("Double " + d);
		}

		else if (obj instanceof Short) {
			Short s = (Short) obj;
			System.out.println("Short " + s);
		}
		else if (obj instanceof Long) {
			Long l = (Long) obj;
			System.out.println("Long " + l);
		}

		else {
			System.out.println("Give proper primitive as input");
		}

	}

}
