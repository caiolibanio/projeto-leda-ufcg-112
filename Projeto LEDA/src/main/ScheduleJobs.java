package main;
/**
 * This interface represents the schedule
 * of process in one computer cpu. 
 * 
 * @author Guilherme Gadelha, Armstrong Goes, Daniell Azevedo, Caio Libanio
 *
 */
public interface ScheduleJobs {
	/**
	 * Search a given job in the schedule.
	 * 
	 * @param j is the job to be searched
	 * @return job if found or null if not found
	 */
	public JobImpl search(int number);
	
	/**
	 * Schedule a job.
	 * 
	 * @param j is the job to be inserted
	 */
	public void insert(JobImpl j) throws Exception;
	
	/**
	 * Process the job in top position by the time slice it,
	 * that is equivalent to the length. Print for each slice
	 * the situation of the job which be processed in the current
	 * time. The method process one job per time, i.e., one job
	 * not can interrupted.
	 * 
	 * If the head of process (top) is NIL, the next job is processed,
	 * otherwise only the top.
	 * 
	 * If the queue of process stay empty, the NIL job is placed
	 * in the head of list. 
	 * 
	 * Example: Processing Job...
	 * Number: <number> Priority: <priority> Length: <length>
	 */
	public void process();
	
	/**
	 * Modify the priority of given job. If the priority exceed the
	 * maximum or minimum schedule's bounds, the priority is placed to the limit.
	 * 
	 * @param j is the job to be modify the priority
	 * @param newPriority
	 */
	public void modifyPriority(Job j, int newPriority) throws Exception;
	
	/**
	 * Modify the length of the job given. If the length exceed the
	 * maximum or minimum schedule's bounds, the length is placed to the limit. 
	 * 
	 * @param j
	 * @param newLength
	 */
	public void modifyLength(Job j, int newLength);
	
	/**
	 * Returns a count of jobs presents in the schedule.
	 */
	public int size();
	
	/**
	 * Return a job in the top position
	 * @return job 
	 */
	public JobImpl top();
	
	/**
	 * Returns the representation of jobs in schedule.
	 * 
	 * @return array
	 */
	public JobImpl[] toArray();
	

	/**
	 * Check the properties of the schedule after instantiation
	 *  
	 * @return true if all the properties are correct
	 */
	public boolean verifyProperties();
}
