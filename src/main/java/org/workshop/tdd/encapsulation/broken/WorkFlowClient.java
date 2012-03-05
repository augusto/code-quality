package org.workshop.tdd.encapsulation.broken;

public class WorkFlowClient {

	public Workflow create() {
		Workflow workflow = new Workflow();
		workflow.setState(State.STARTED);
		
		return workflow;
	}
	
	public void inProgress(Workflow workflow) {
		workflow.getHistory().add(workflow.getState());
		workflow.setState(State.IN_PROGRESS);
	}
	
	public void complete(Workflow workflow) {
		workflow.getHistory().add(workflow.getState());
		workflow.setState(State.COMPLETE);
	}
}
