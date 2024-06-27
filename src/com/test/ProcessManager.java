package com.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProcessManager {

	public ArrayList<Process> allProcess;
	public LinkedList<Process> pendingProcess;
	public LinkedList<Process> completedProcess;
	public Process process;
	
	

	

	/*
	 * public ProcessManager(ArrayList<Process> allProcess, LinkedList<Process>
	 * pendindProcess, LinkedList<Process> completedProcess) { super();
	 * this.allProcess = allProcess; this.pendingProcess = pendindProcess;
	 * this.completedProcess = completedProcess;
	 * 
	 * }
	 */
	
	 public ProcessManager() {
	        allProcess= new ArrayList<>();
	        pendingProcess= new LinkedList<>();
	        completedProcess = new LinkedList<>();
	    }

	public void addProcess(Process process) {

		allProcess.add(process);
		pendingProcess.add(process);

	}

	public boolean removeProcess(int processId) {
		for (Process process : allProcess) {

			if (process.getProcessId() == processId) {

				allProcess.remove(process);

				return true;
			}

		}
		return false;
	}

	public Process searchProcess(int processId) {
		
		
		for(Process process : allProcess) {
			
			if(process.getProcessId() ==processId){
				
				allProcess.get(processId);
			}
		}
		
           return null;
	}

	public List<Process> listAllProcess() {
		
		
		return allProcess;

	}

  public boolean updateProcess(int processid , String newStatus) {
	  
	  
	  for(Process process : allProcess) {
		  
		  if(process.getProcessId()==processid) {
			  process.setStatus(newStatus);
			  return true;
		  }
		  
		  
	  }
	  
	  return false;
  }
	
	
	
	public void addPendingProcess(Process process) {
		
		pendingProcess.add(process);
	}
	
	public void addcompletedProcess(Process process) {
		
		pendingProcess.add(process);
	}
	
	
	List <Process> getPendingProcess(){
		
	return pendingProcess;
		
		
	}
	
	
	public List <Process> getCompletedProcess(){
		
		return completedProcess;
	}

	@Override
	public String toString() {
		return "ProcessManager [allProcess=" + allProcess + ", pendingProcess=" + pendingProcess + ", completedProcess="
				+ completedProcess + ", process=" + process + "]";
	}
	
	
	
	

}
