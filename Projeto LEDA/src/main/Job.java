package main;
/**
 * Job interface.
 * 
 * @author Guilherme Gadelha, Armstrong Goes, Daniell Azevedo, Caio Libanio
 *
 */
public interface Job extends Comparable<Job> {
	/**
	 * Returns the length of the job.
	 * 
	 * @return length
	 */
	public int getLength();
	
	/**
	 * Establish the length of the job.
	 * 
	 * @param newLength is the length to be established
	 */
	public void setLength(int newLength);
	
	/**
	 * Returns the priority of the job.
	 * 
	 * @return priority
	 */
	public int getPriority();
	
	/**
	 * Establish the priority of the job.
	 * 
	 * @param newPriority is the priority to be established
	 */
	public void setPriority(int newPriority);
	
	/**
	 * Returns the number of the job.
	 * 
	 * @return number
	 */
	public int getNumber();
	
	/**
	 * Establish the number of the job.
	 * 
	 * @param number is the number to be established
	 */
	public void setNumber(int number);
	
	/**
	 * Returns true if the job is NIL.
	 * 
	 * @return job.number == 0
	 */
	public boolean isNIL();
	
	/**
	 * Returns the string representation of the job.
	 * Example: <Number: n, Priority: p, Length: l>  
	 * 
	 * @return job's string
	 */
	public String toString();
	
	/**
	 * Compares a job with other job. Returns 0 if the job's priority is
	 * equal to other, -1 if this is smaller and 1 if is bigger. The factors of comparison
	 * is the number, the length and the priority.
	 * 
	 * @param obj
	 * @return result of comparison
	 */
	@Override
	public int compareTo(Job o);
	
	/**
	 * Returns true if two objects are equals.
	 * 
	 * @param o is the object to be compared
	 * @return comparison
	 */
	@Override
	public boolean equals(Object o);
}
