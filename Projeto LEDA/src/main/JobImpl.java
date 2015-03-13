package main;

import commons.Preconditions;

/**
 * This class represents one job on
 * the computer cpu. 
 * 
 * @author Guilherme Gadelha, Armstrong Goes, Daniell Azevedo, Caio Libanio
 * 
 * <p>Implementation note: this implementation provides
 * constant time for all methods.
 *
 */
public class JobImpl implements Job {
	private int length;    // x * 0.5 seconds: x belongs [1,100] and x integer
	private int priority; // [-20,19]
	private int number;   // randomico [00000, 10000]

	private static final int MIN_LENGTH = 1;
	private static final int MAX_LENGTH = 100;
	
	private static final int MIN_NUMBER = 0;
	private static final int MAX_NUMBER = 10000;
	
	private static final int MAX_PRIORITY = -20;
	private static final int MIN_PRIORITY = 19;
	
	private static final int NIL_JOB_NUMBER = 0;
	
	public JobImpl(int number, int priority, int length) {
		setNumber(number);
		setPriority(priority);
		setLength(length);
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int newLength) {
		Preconditions.check(newLength >= MIN_LENGTH && newLength <= MAX_LENGTH, 
				"Length of process invalid.");
		this.length = newLength;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int newPriority) {
		Preconditions.check(newPriority <= MIN_PRIORITY && newPriority >= MAX_PRIORITY,
				"Priority of process invalid.");
		this.priority = newPriority;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		Preconditions.check(number >= MIN_NUMBER && number <= MAX_NUMBER, 
				"Number of process invalid.");
		this.number = number;
	}
	
	@Override
	public String toString() {
		if(this.getNumber() == NIL_JOB_NUMBER)
			return "<NIL>";
		return "<Number: " + number + ", Priority: " 
	+ priority + ", Length: " + length + ">";
	
	}

	@Override
	public int compareTo(Job o) {
		Preconditions.checkNotNull(o, "Object invalid, is null");
		return this.getPriority() - o.getPriority(); 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + number;
		result = prime * result + priority;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobImpl other = (JobImpl) obj;
		if (length != other.length)
			return false;
		if (number != other.number)
			return false;
		if (priority != other.priority)
			return false;
		return true;
	}	
	
	public boolean isNIL() {
		return this.getNumber() == NIL_JOB_NUMBER;
	}
}