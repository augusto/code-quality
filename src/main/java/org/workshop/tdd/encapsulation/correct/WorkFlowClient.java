package org.workshop.tdd.encapsulation.correct;

public class WorkFlowClient {

	public Workflow create() {
		return new Workflow();
	}
	
	public void inProgress(Workflow workflow) {
		workflow.inProgress();
	}
	
	public void complete(Workflow workflow) {
		workflow.complete();
	}
}
