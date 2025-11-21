package JavaVjezbe6;

enum Dan {
	PONEDELJAK,
	UTORAK,
	SRIJEDA,
	CETVRTAK,
	PETAK,
	SUBOTA,
	NEDELJA;
	
	public boolean isWeekend() {
		return this == SUBOTA || this == NEDELJA;
	}
	public boolean isWeek() {
		return !isWeekend();
	}
	public String ispisiDan() {
		return this.name();
	}
}
public class TestVikend {

	public static void main(String[] args) {
		for (Dan d : Dan.values()) {
			if (d.isWeekend()) {
				System.out.println(d.ispisiDan() + " Vikend je!");
			} else {
				System.out.println(d.ispisiDan() + " Radni dan je");
			}
		}

	}

}
