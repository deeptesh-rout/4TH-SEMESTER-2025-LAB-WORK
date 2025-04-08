
public class LambdaWithmultipleParameter {
	interface ReportCard {
		int totalMark(int mark, int physics, int bio, int history, int chem);
	}

	public static void main(String[] args) {
		ReportCard report = (m, p, b, h, c) -> m + p + b + h + c;
		System.out.println(report.totalMark(75, 80, 70, 65, 90));
	}

}
