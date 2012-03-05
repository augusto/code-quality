package org.workshop.tdd.encapsulation.correct;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
	
	private State state;
	
	private List<State> history = new ArrayList<State>();

	public Workflow() {
		setState(State.STARTED);
	}
	
	public void inProgress() {
		//validation
		addCurrentStateToHistory();
		setState(State.IN_PROGRESS);
	}
	
	public void complete() {
		//validation
		addCurrentStateToHistory();
		setState(State.COMPLETE);
	}	
	
	private void setState(State state) {
		this.state = state;
	}

	private void addCurrentStateToHistory() {
		this.history.add(state);
	}

	// methods to check the state;
	public boolean isInProgress() {
		return state == State.IN_PROGRESS;
	}
}
