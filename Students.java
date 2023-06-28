package week2.org.system;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Only id will display");
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id & name will display");
	}
	public void getStudentInfo(double phoneNumber,String email) {
		System.out.println("email & phoneNumber will display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(549918);
		s.getStudentInfo(12345, "Kenida");
		s.getStudentInfo(8870615919d,"josephinekenida@gmail.com");
	}

}
