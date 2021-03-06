package bridgelabz.employeewageproblem;

public class EmpWageSwitchCase {
	public static final int is_fulltime_Present = 1;
	public static final int is_parttime_Present = 2;
	public static final int wage_pr_hr=20;

	public static void main(String[] args) {
		getFullOrPartTimeWage();
	}
	static void getFullOrPartTimeWage() {
		int working_hour = 0;
		int daily_wage = 0;
		int emp_check=(int)(Math.floor(Math.random()* 10) % 3);
		switch (emp_check) {
		case is_parttime_Present:
			working_hour=4;
			break;
		case is_fulltime_Present:
			working_hour=8;
			break;
		default:
			working_hour=0;
	}
	daily_wage = working_hour * wage_pr_hr;
	System.out.println("Daily_wage: " + daily_wage);
 }
}