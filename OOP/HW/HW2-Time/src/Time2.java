public class Time2 implements Time{
	private long secondsFromMidnight;
	
	public Time2(short hours,short minutes,short seconds) {
		this( (hours*(SECS_PER_HOUR)) + (minutes*SECS_PER_MIN) + seconds);
	}
	
	public Time2(long seconds){
		this.secondsFromMidnight = seconds;
	}
	
	public Time2(Time time) {
		this(time.getSecondsFromMidnight());
	}
	
	public Time2() {
		this(0);
	}
	@Override
	public short getHour() {
		long remainder = this.secondsFromMidnight;
		return (short) ((remainder/(SECS_PER_HOUR)) % HOURS_PER_DAY);
	}

	@Override
	public short getMinute() {
		long remainder = this.secondsFromMidnight % SECS_PER_HOUR;
		return (short) (remainder/60);
	}

	@Override
	public short getSecond() {
		long remainder = (this.secondsFromMidnight % SECS_PER_HOUR) % SECS_PER_MIN ;
		return (short) (remainder);
	}

	@Override
	public short[] getHMS() {
		short [] hmsArray = new short[3];
		hmsArray [0] = this.getHour();
		hmsArray [1] = this.getMinute();
		hmsArray [2] = this.getSecond();
		return hmsArray;
	}

	@Override
	public long getSecondsFromMidnight() {
		return this.secondsFromMidnight;
	}

	@Override
	public void setHour(short hour) {
		this.secondsFromMidnight -= ((short)(this.secondsFromMidnight / SECS_PER_HOUR))*(SECS_PER_HOUR);
		this.secondsFromMidnight += (long)(hour*(SECS_PER_HOUR));
	}

	@Override
	public void setMinute(short min) {
		this.secondsFromMidnight -= ((short)(this.secondsFromMidnight) % SECS_PER_HOUR);
		this.secondsFromMidnight += (long)(min*SECS_PER_MIN);
		
	}

	@Override
	public void setSecond(short sec) {
		this.secondsFromMidnight -= ((short)(this.secondsFromMidnight) % SECS_PER_HOUR)%SECS_PER_MIN;
		this.secondsFromMidnight += (long)(sec);
		
	}

	@Override
	public void setHMS(short[] hms) {
		this.secondsFromMidnight = ( hms[0] * (SECS_PER_HOUR) ) + (hms[1] * SECS_PER_MIN) + hms[2];
	}

	@Override
	public void setSecondsFromMidnight(long secondsFromMidnigt) {
		this.secondsFromMidnight = secondsFromMidnigt;
		
	}

	@Override
	public boolean equals(Time t) {
		if(this.getSecondsFromMidnight() == t.getSecondsFromMidnight()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean before(Time t) {
		if(this.getSecondsFromMidnight() < t.getSecondsFromMidnight())
		{
			return true;
		}
		return false;
	}

	@Override
	public boolean after(Time t) {
		return (this.getSecondsFromMidnight() > t.getSecondsFromMidnight());
	}

	@Override
	public long difference(Time t) {
		return this.getSecondsFromMidnight() - t.getSecondsFromMidnight();
	}
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d" ,this.getHour(),this.getMinute(),this.getSecond() );
	}
	
}
