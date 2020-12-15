public class MainHW2 {
	public static void main(String[] args) {
		Time t1 = new Time1((short) 5, (short) 34, (short) 13);
		Time t2 = new Time2((short) 15, (short) 3, (short) 49);
		System.out.println("t1 " + t1);
		System.out.println("t2 " + t2);
		System.out.println("equals " + t1.equals(t2));
		System.out.println("before " + t1.before(t2));
		System.out.println("after " + t1.after(t2));

		t1.setHour((short) 7);
		System.out.println("t1 " + t1);
		t2.setHour((short) 7);
		System.out.println("t2 " + t2);
	}

}