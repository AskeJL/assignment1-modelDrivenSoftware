package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private List<Transition> trans = new ArrayList<>();
	public State(String name) {
		super();
		this.name = name;
	}
	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return trans;
	}

	public void addTransition(Transition t) {
		this.trans.add(t);
	}

	public Transition getTransitionByEvent(String event) {
		for (int i = 0; i < trans.size(); i++) {
			if(trans.get(i).getEvent().equals(event)){
				return trans.get(i);
			}
		}
		return null;
	}

}
