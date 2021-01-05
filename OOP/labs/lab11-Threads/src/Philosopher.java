import java.util.List;
import java.util.concurrent.locks.Lock;


public class Philosopher implements IPhilosopher {
	private int place;
	private List<Fork> forks; 
	private int meals;
	private Lock lock;
	private RandomSleep rndSleep;
	private boolean isEating;
	private int cntMeals;
	
	public Philosopher(int place, List<Fork> forks, int meals , Lock lock) {
		this.place = place;
		this.forks = forks;
		this.meals = meals;
		this.lock = lock;
		rndSleep = new RandomSleep(10);
		this.isEating = false;
		this.cntMeals = 0;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(cntMeals < meals) 		
		{
			Fork fRight = forks.get(this.place%5);
			Fork fLeft = forks.get((this.place+1)%forks.size());
			
			rndSleep.sleep();
			
			lock.lock();
			
			synchronized (fRight) {	
				fRight.setOwner(place);
				
				synchronized (fLeft) {
					
					lock.unlock();
					fLeft.setOwner(place);
					isEating = true;
					this.cntMeals++;
					rndSleep.sleep();
					
				}
			}		
			
			fRight.setOwner(0);
			fLeft.setOwner(0);
			isEating = false;
		}
	}
	@Override
	public boolean isEating() {
		return isEating;
	}

	@Override
	public int getPlace() {
		return this.place;
	}

	@Override
	public int getCount() {
		return this.cntMeals;
	}

}
