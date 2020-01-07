
public class Bottle {
	protected double qta;
	protected double maxqta= 500.0;
	public String content;
	
	
	public Bottle (String content, double qta) {
		this.qta = qta;
		this.content = content;

	}

	public void bevi(double b) {
		System.out.println(b);
		qta = qta - b;
	}

		
	public void riempi(double r) {
		System.out.println(r);
		qta = qta + r;	
		if (qta > maxqta) {
			qta=maxqta;
		}
	}

	public void getContent() {
		String content1 = "Content: " + Integer.toString((int) qta) + "ml of " + content + "\n";
		System.out.println(content1);
	}
}

