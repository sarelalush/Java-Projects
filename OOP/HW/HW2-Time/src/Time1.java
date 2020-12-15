
public class Time1 implements Time {

	private short[] arr = new short[3];

	
	public Time1(short hour,short minute,short secound) {
		if (hour<=24 && hour >= 0 && minute <= 60 && minute >= 0 && secound <= 60 && secound >= 0) {
			arr[0] = hour;
			arr[1] = minute;
			arr[2] = secound;
		}
		else
			System.out.println("Wroung input try again!");	
	}
	
	public Time1(long time) {
		arr[0] = (short) ((time/3600)%24);
		arr[1] = (short) ((time/60)%60);
		arr[2] = (short) (time%60);	
	}
	
	public Time1(Time z) {
		arr[0] = z.getHour();
		arr[1] = z.getMinute();
		arr[2] = z.getSecond();	
	}
	
	public Time1() {
		arr[0] = 00;
		arr[1] = 00;
		arr[2] = 00;
	}

	@Override
	public short getHour() {
		return arr[0];
	}

	@Override
	public short getMinute() {
		return arr[1];
	}

	@Override
	public short getSecond() {
		return arr[2];
	}

	@Override
	public short[] getHMS() {
		return arr;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d" ,arr[0],arr[1],arr[2] );	}

	@Override
	public long getSecondsFromMidnight() {
		return ((long) ((arr[0]*3600) + (arr[1]*60) + (arr[2])));
	}

	@Override
	public void setHour(short hour) {
		if(hour<=24 && hour >= 0)
			arr[0] = hour;
		else
			System.out.println("Hours not between 0-24");
	}

	@Override
	public void setMinute(short min) {
		if(min <= 60 && min >= 0)
			arr[1] = min;
		else
			System.out.println("Minutes not between 0-24");
	}

	@Override
	public void setSecond(short sec) {
		if(sec <= 60 && sec >= 0)
			arr[2] = sec;
		else
			System.out.println("Secounds not between 0-60");
	}

	@Override
	public void setHMS(short[] hms) {
		arr[0] = hms[0];
		arr[1] = hms[1];
		arr[2] = hms[2];
	}

	@Override
	public void setSecondsFromMidnight(long secondsFromMidnigt) {
		arr[0] = (short) ((secondsFromMidnigt/3600)%24);
		arr[1] = (short) ((secondsFromMidnigt/60)%60);
		arr[2] = (short) (secondsFromMidnigt%60);	
	}

	@Override
	public boolean equals(Time t) {
		if (arr[0] != t.getHour() || arr[1] != t.getMinute() || arr[2] != t.getSecond())
			return false;
		return true;
	}

	@Override
	public boolean before(Time t) {
		if(t.getHour() > arr[0]) 
			return true;
		if((t.getHour() == arr[0]) &&t.getMinute() > arr[1])
			return true;
		if((t.getHour() == arr[0]) && t.getMinute() == arr[1] && t.getSecond() > arr[2])
			return true;
		return false;
	}

	@Override
	public boolean after(Time t) {
		if(t.getHour() > arr[0]) 
			return false;
		if((t.getHour() == arr[0]) &&t.getMinute() > arr[1])
			return false;
		if((t.getHour() == arr[0]) && t.getMinute() == arr[1] && t.getSecond() > arr[2])
			return false;
		return true;
	}

	@Override
	public long difference(Time t) {
		long count = 0;
		count += getSecondsFromMidnight() - t.getSecondsFromMidnight();
		return count;
		
	}

}
