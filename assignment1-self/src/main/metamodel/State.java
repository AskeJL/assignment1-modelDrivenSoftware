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
		// TODO Auto-generated method stub
		return trans;
	}

	public void addTransition(Transition t) {
		this.trans.add(t);
	}
	public Transition getTransitionByEvent(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
