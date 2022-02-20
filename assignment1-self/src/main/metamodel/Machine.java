package main.metamodel;

import java.util.*;

public class Machine {

	private List<State> states = new ArrayList<State>();
	private State initialState;
	Map<String, Integer> intCollection = new HashMap();
	public Machine(Collection<State> states, State initialState, Map<String, Integer> ints) {
		super();
		this.states.addAll(states);
		this.intCollection.putAll(ints);
		this.initialState = initialState;
	}

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String state) {
		for (int i = 0; i < states.size(); i++) {
			if (states.get(i).getName().equals(state)){
				return states.get(i);
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		return intCollection.size();
	}

	public boolean hasInteger(String integer) {
		return intCollection.containsKey(integer);
	}

}
