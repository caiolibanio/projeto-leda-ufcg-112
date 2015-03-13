package main;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * This class represents the schedule
 * of process in one computer cpu.
 * 
 * @author Guilherme Gadelha, Armstrong Goes, Daniell Azevedo, Caio Libanio
 * 
 * <p>Implementation note: this implementation provides
 * O(n²) (linear time) for the inserting and process methods
 * ({@code insert}, {@code process}), and too
 * {@code search}, {@code modifyPriority},{@code modigyLength},
 * {@code print}, {@code toArray} and {@code size} methods; 
 * and constant time (O(1) time) for the retrieval method
 * ({@code top}).
 *
 */
public class ScheduleJobsImpl implements ScheduleJobs {
	int lengthIntervaloDePrioridades = 40;
	private JobImpl top;
	PriorityQueue<ConcurrentLinkedQueue<JobImpl>> sch = 
			new PriorityQueue<ConcurrentLinkedQueue<JobImpl>>(lengthIntervaloDePrioridades, 
					new ComparatorConcurrentLinkedQueue());
	
	public ScheduleJobsImpl() {
		for(int i = -20; i < 20; i++) {// limites de prioridade
			
			ConcurrentLinkedQueue<JobImpl> jobQueue = new ConcurrentLinkedQueue<JobImpl>();
			JobImpl nil = new JobImpl(0, i, 1);
			
			jobQueue.add(nil);
			
			sch.add(jobQueue);
		}
		//INITIALLY NIL
		top = sch.element().element();
	}
	
	private boolean verifyCorrespondenceBetweenIndexesAndPriorities() {
		
		int listIndex = 0;
		
		for (ConcurrentLinkedQueue<JobImpl> list: sch) {
			if (list.element().getPriority() != listIndex - 20) {
				return false;
			}
			
			listIndex++;
		}
		
		return true;
	}
	
	public boolean verifyProperties() {
		boolean isValid = false;
		
		for (ConcurrentLinkedQueue<JobImpl> list: sch) {
			isValid = list.size() == 1;
		}
		
		isValid &= verifyCorrespondenceBetweenIndexesAndPriorities();
		
		return isValid;
	}
	
	public JobImpl search(int number) {
		for(ConcurrentLinkedQueue<JobImpl> list : sch) {
			for(JobImpl j : list) {
				if(j.getNumber() == number)
					return j;
			}
		}
		return null;
	}

	public void insert(JobImpl j) throws Exception {
		
		if(search(j.getNumber()) != null){
			throw new Exception("Number of Job already exists");
		}
		
		int priority = j.getPriority();
		Iterator<ConcurrentLinkedQueue<JobImpl>> it = sch.iterator();
		ConcurrentLinkedQueue<JobImpl> list = null;
		
		while(it.hasNext()) {
			list = it.next();
			if(list.element().getPriority() == priority){
				list.add(j);
				break;
			}
		}
		
		if(list.element().isNIL()){
			list.poll();
			
		}
		
		refresh();
	}
	
	// FALTA COLOCAR O SLICE PARA O USUARIO PODER VISUALIZAR O PROCESSAMENTO DO JOB
	public void process() {
		ConcurrentLinkedQueue<JobImpl> listWithTop = searchQueue(top);
		
		
		for (int i = top.getLength(); i > 0; i--) {
			System.out.println("Processing job... \nNumber: " + top.getNumber() +
					" Priority: " + top.getPriority() + " Length: " + i);
		}
		
		top.setLength(1);

		listWithTop.remove(top);
		if(listWithTop.isEmpty()) {
			listWithTop.add(new JobImpl(0, top.getPriority(),1)); // insert a NIL Job
			top = searchNewTop(); 
		}
		refresh();
	}
	
	/**
	 * Search for the new top the schedule after
	 * have processed a queue of jobs of same priority.
	 * Returns NIl if the schedule is empty.
	 * 
	 * @return newTop
	 */
	private JobImpl searchNewTop() {
		JobImpl newTop = null;
		for(ConcurrentLinkedQueue<JobImpl> list : sch) {
			if(!list.element().isNIL()) {
				newTop = list.element();
				break;
			}
		}
		return newTop;
	}

	/**
	 * Returns the list that contains the job given.
	 * 
	 * @param j is the job searched
	 * @return list with j
	 */
	private ConcurrentLinkedQueue<JobImpl> searchQueue(JobImpl j) {
		for(ConcurrentLinkedQueue<JobImpl> list : sch) {
			if(list.contains(j))
				return list;
		}
		return null;
	}
	
	public void modifyPriority(Job j, int newPriority) throws Exception {

		JobImpl job = search(j.getNumber());
		ConcurrentLinkedQueue<JobImpl> jobList = searchQueue(job);
		
		if (jobList.size() == 1)
		{
			jobList.add(new JobImpl(0, job.getPriority(), 1));
		}
		
		job.setPriority(newPriority);
		jobList.remove(job);
		
		insert(job);
	}

	public void modifyLength(Job j, int newLength) {
		JobImpl job = search(j.getNumber());
		job.setLength(newLength);
		
	}

	public int size() {
		int size = 0;
		for(ConcurrentLinkedQueue<JobImpl> list : sch) {
			for(JobImpl job : list) {
				if(!job.isNIL())
					size++;
			}
		}
		return size;
	}

	public JobImpl top() {
		return top;
	}
	
	
	/**
	 * Updates the table for the top
	 * to be in the correct position after
	 * some modifications has been made.
	 */
	private void refresh() {
		for(ConcurrentLinkedQueue<JobImpl> list : sch) {
				top = list.element();
			if (!top.isNIL()){ //When find the searched Job, Stop
				break;
			}
		}
	}
	
	public JobImpl[] toArray() {
		JobImpl[] jobs = new JobImpl[size()];
		int i = 0;
		for (ConcurrentLinkedQueue<JobImpl> list : sch) {
			for (JobImpl job : list) {
				if (!job.isNIL()) {
					jobs[i] = (job);
					i++;
				}
			}
		}
		return  jobs;
	}
	
}
