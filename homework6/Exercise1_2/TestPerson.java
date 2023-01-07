package Exercise1_2;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student("Hao", "HN", "Chuan", 2003, 6000);
		System.out.println("Thong tin hoc sinh" + student1.toString());
		System.out.println("Ten hoc sinh: " + student1.getName());
		System.out.println("Nơi ở: " + student1.getAddress());
		System.out.println("Hệ học: " + student1.getProgram());
		System.out.println("Năm sinh: " + student1.getYear());
		System.out.println("Học phí: " + student1.getFee());

		Staff staff1 = new Staff("Ha", "HN", "UET", 10000);
		System.out.println("Thong tin nv: " + staff1.toString());
		System.out.println("Tên nhân viên: " + staff1.getName());
		System.out.println("Nơi ở: "  + staff1.getAddress());
		System.out.println("Trường: " + staff1.getSchool());
		System.out.println("Lương: " + staff1.getPay());
	}

}
