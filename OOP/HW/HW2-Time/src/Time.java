/**
 * @author Ron Sivan (ronny.sivan@gmail.com)
 * @author Michal Horovitz
 */


public interface Time {
	
	public static final short SECS_PER_MIN = 60;
	public static final short MINS_PER_HOUR = 60;
	public static final short HOURS_PER_DAY = 24;

	public static final int SECS_PER_HOUR = MINS_PER_HOUR * SECS_PER_MIN;
	public static final int SECS_PER_DAY = HOURS_PER_DAY * SECS_PER_HOUR;

	/**
	 * @return the hours - an integer number between 0 to 23.
	 */
	public short getHour();

	/**
	 * @return the minutes - an integer number between 0 to 59.
	 */
	public short getMinute();

	/**
	 * @return the seconds - an integer number between 0 to 59.
	 */
	public short getSecond();

	/**
	 * @return a short array contains the hour, the minute, and the second in this order.
	 */
	public short[] getHMS();
	

	/**
	 * @return the number of seconds from midnight.
	 */
	public long getSecondsFromMidnight();
	
	/**
	 * @param hour
	 * update the hours to be the new parameter.
	 */
	public void setHour(short hour);

	/**
	 * @param min
	 * update the minutes to be the new parameter.
	 */
	public void setMinute(short min);

	/**
	 * @param sec
	 * update the seconds to be the new parameter.
	 */
	public void setSecond(short sec);
	
	/**
	 * @param hms - an array contains the hour, the minute, and the second in this order.
	 * update the time to represent the time in the parameter.
	 */
	public void setHMS(short[] hms);
	
	/**
	 * @param secondsFromMidnigt
	 * update the time to represent the time according to the parameter.
	 */
	public void setSecondsFromMidnight(long secondsFromMidnigt);
	
	/**
	 * @param t
	 * @return return true if this instance represents the same time as t. Otherwise return false
	 */
	public boolean equals(Time t);

	/**
	 * @param t
	 * @return return true if this instance is before t. Otherwise return false
	 */
	public boolean before(Time t);

	/**
	 * @param t
	 * @return return true if this instance is after t. Otherwise return false
	 */
	public boolean after(Time t);

	/**
	 * @param t
	 * @return the number of seconds from this instance till t
	 */
	public long difference(Time t);

}
