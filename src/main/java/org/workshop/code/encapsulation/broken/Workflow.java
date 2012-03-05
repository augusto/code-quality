package org.workshop.code.encapsulation.broken;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
	
	private State state;
	
	private List<State> history = new ArrayList<State>();

	public void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setHistory(List<State> history) {
		this.history = history;
	}

	public List<State> getHistory() {
		return history;
	}
	
	

}
