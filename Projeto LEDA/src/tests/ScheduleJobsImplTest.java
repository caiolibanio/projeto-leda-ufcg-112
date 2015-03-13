package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import main.JobImpl;
import main.ScheduleJobs;
import main.ScheduleJobsImpl;

import org.junit.Before;
import org.junit.Test;

public class ScheduleJobsImplTest {
        
        private ScheduleJobs schedule;
        private JobImpl j1;
        private JobImpl j2;
        
        @Before
        public void setUp(){
                schedule = new ScheduleJobsImpl();
                j1 = new JobImpl(30, 0, 10);
                j2 = new JobImpl(100, -19, 50);
        }
        
        //Asserting the properties of the Data Structure
        @Test
        public void testScheduleProperties(){
               assertTrue(schedule.verifyProperties());
        }
        
        
        //Insert an Element, and search for it
        @Test
        public void testSearch() throws Exception {
                
                assertNull(schedule.search(100));
                
                for(int i = 1; i < 30; i++){
                        j1 = new JobImpl(i, -20, i + 1);
                        assertNull(schedule.search(i));
                        schedule.insert(j1);
                        assertEquals(i, schedule.search(i).getNumber());
                }
                
                for(int i = 30; i < 60; i++){
                        j1 = new JobImpl(i, -19, i);
                        assertNull(schedule.search(i));
                        schedule.insert(j1);
                        assertEquals(i, schedule.search(i).getNumber());
                }
                
                for(int i = 60; i < 90; i++){
                        j1 = new JobImpl(i, 10, i);
                        assertNull(schedule.search(i));
                        schedule.insert(j1);
                        assertEquals(i, schedule.search(i).getNumber());
                }
        }
        
        //Insert an element (Job) and verify if the Structure Grows Up
        @Test
        public void testInsert() throws Exception {
                
                for(int i = 1; i < 31; i++){
                        j1 = new JobImpl(i, -20, i + 1);
                        schedule.insert(j1);
                }
                
                assertEquals(30, schedule.size());
                
                for(int i = 31; i < 60; i++){
                        j1 = new JobImpl(i, -19, i);
                        schedule.insert(j1);
                }
                assertEquals(59, schedule.size());
                
                for(int i = 60; i < 90; i++){
                        j1 = new JobImpl(i, 10, i);
                        schedule.insert(j1);
                }
                
                assertEquals(89, schedule.size());
        }

        @Test
        public void callProcessWithOneProcessForEachPriority() throws Exception {
                
                for (int i = 10; i < 20; i++) {
                        j1 = new JobImpl(i, i, 10);
                        schedule.insert(j1);
                }
                
                for (int i = 0; i < 10; i++) {
                        schedule.process();
                        //testList.remove(i);
                        // it would be interesting to add a check to the 
                        // length of all the queues on the data structure.
                        // something like
                        // Assert.assertEquals(1, schedule.jobsWithPriority(i)); before process
                        // Assert.assertEquals(0, schedule.jobsWithPriority(i)); after process
                        assertEquals(10 - i - 1, schedule.size());
                        System.out.println(Arrays.toString(schedule.toArray()));
                }
        }
        
        @Test
        public void usePriorityAfterRunAllProcessOfPriority() throws Exception {
                
                for (int i = 10; i < 20; i++) {
                        j1 = new JobImpl(i, i, 10);
                        schedule.insert(j1);
                }
                
                for (int i = 0; i < 10; i++) {
                        schedule.process();
                }
                
                for (int i = 10; i < 20; i++) {
                        j1 = new JobImpl(i, i, 10);
                        schedule.insert(j1);
                }
                
                for (int i = 0; i < 10; i++) {
                        schedule.process();
                        //testList.remove(i);
                        // it would be interesting to add a check to the 
                        // length of all the queues on the data structure.
                        // something like
                        // Assert.assertEquals(1, schedule.jobsWithPriority(i)); before process
                        // Assert.assertEquals(0, schedule.jobsWithPriority(i)); after process
                        assertEquals(10 - i - 1, schedule.size());
                        System.out.println(Arrays.toString(schedule.toArray()));
                }
        }
        
        //Test the processing of a job, when its done, the process disappear from the Structure
        @Test
        public void testProcess() throws Exception {
                
                for(int i = 10; i < 20; i++){
                        j1 = new JobImpl(i, 10, i);
                        schedule.insert(j1);
                }
                
                for(int i = 1; i < 10; i++){
                        j1 = new JobImpl(i, 0, i);
                        schedule.insert(j1);
                }
                
                for(int i = 0 ; i < 5 ; i++)
                        schedule.process();
                assertEquals(14, schedule.size());
        }
        
        //Modifying the priority of a Job, inside the Structure
        @Test
        public void testModifyPriority() throws Exception {
                for(int i = 1; i < 100; i++){
                        j1 = new JobImpl(i, -20, i);
                        schedule.insert(j1);
                        schedule.modifyPriority(j1, 5);
                        assertEquals(5, j1.getPriority());
                }
                
                JobImpl j3 = new JobImpl(120, 10, 50);
                schedule.insert(j3);
                schedule.modifyPriority(schedule.search(120), 19);
                assertEquals(19, j3.getPriority()); 
        }
      
        //Modifying the length of a Job, inside the Structure
        @Test
        public void testModifyLength() throws Exception {
                for(int i = 1; i < 99; i++){
                        j1 = new JobImpl(i, -20, i);
                        schedule.insert(j1);
                        schedule.modifyLength(j1, i + 1);
                        assertEquals(i + 1, j1.getLength());
                }
                
                JobImpl j3 = new JobImpl(120, 10, 50);
                schedule.insert(j3);
                schedule.modifyLength(schedule.search(120), 19);
                assertEquals(19, j3.getLength());
        }

        //Asserting the size of the Structure, after some insertions
        @Test
        public void testSize() throws Exception {
                for(int i = 1; i < 31; i++){
                        j1 = new JobImpl(i, 0, i + 1);
                        schedule.insert(j1);
                        
                }
                
                assertEquals(30, schedule.size());
                
                for(int i = 31; i < 60; i++){
                        j1 = new JobImpl(i, -10, i);
                        schedule.insert(j1);
                }
                assertEquals(59, schedule.size());
                
                for(int i = 60; i < 90; i++){
                        j1 = new JobImpl(i, 10, i);
                        schedule.insert(j1);
                }
                
                assertEquals(89, schedule.size());
        }
        
        //Testing if the top of the Structure returns correctly
        @Test
        public void testTop() throws Exception {
                
                assertEquals(0, schedule.top().getNumber());
                
                schedule.insert(j1);
                schedule.insert(j2);
                
                assertEquals(100, schedule.top().getNumber());
                assertEquals("O topo de schedule esta errado", 0, j2.compareTo(schedule.top()));
                
                schedule.process();
                assertEquals(j1.getNumber(), schedule.top().getNumber());
                
                schedule.process();
                assertEquals(0, schedule.top().getNumber());
        }
        
        //Testing the toArray() method
        @Test
        public void testToArray() throws Exception {
                for(int i = 1; i < 50; i++){
                        j1 = new JobImpl(i, -20, i + 1);
                        schedule.insert(j1);
                }
                
                assertEquals(49, schedule.toArray().length);
                
                for(int i = 50; i < 80; i++){
                        j1 = new JobImpl(i, -10, i + 1);
                        schedule.insert(j1);
                }
                JobImpl[] jobs = schedule.toArray();
                
                assertEquals(79, jobs.length);
                
                for(int i = 1 ; i < jobs.length ; i++){
                        assertEquals(i + 1, jobs[i].getNumber());
                        assertEquals(i + 1, jobs[i - 1].getLength());
                }
                
                for(int i = 0 ; i < 49; i++){ 
                        assertEquals(-20, jobs[i].getPriority());
                }
                
                for(int i = 49 ; i < 79; i++){
                        assertEquals(-10, jobs[i].getPriority());
                }
                
                JobImpl j3 = new JobImpl(9999, 1, 1);
                schedule.insert(j3);
                assertEquals(80, schedule.toArray().length);
        }
}