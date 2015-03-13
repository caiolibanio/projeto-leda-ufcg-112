package main;

import java.util.Comparator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ComparatorConcurrentLinkedQueue implements Comparator<ConcurrentLinkedQueue<JobImpl>> 
{

	@Override
	public int compare(ConcurrentLinkedQueue<JobImpl> o1,
			ConcurrentLinkedQueue<JobImpl> o2) {
		return o1.element().getPriority() - o2.element().getPriority();
	}
	
}
