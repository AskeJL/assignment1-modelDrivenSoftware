package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StateMachine {
	ArrayList<State> stateList = new ArrayList<State>();
	Map<String, Integer> intCollection = new HashMap<>();
	State initialState = null;
	State currentState = null;
	Transition currentTransition = null;

	public Machine build() {
		Machine m = new Machine(stateList, initialState, initialState, intCollection);
		return m;
	}

	public StateMachine state(String state) {
		for (int i = 0; i < stateList.size(); i++) {
			if(stateList.get(i).getName().equals(state)){
				currentState = stateList.get(i);
				return this;
			}
		}
		State newState = new State(state);
		currentState = newState;
		stateList.add(newState);
		return this;
	}

	public StateMachine initial() {
		initialState = currentState;
		return this;
	}

	public StateMachine when(String event) {
		for (int i = 0; i < currentState.getTransitions().size(); i++) {
			if (currentState.getTransitions().get(i).getEvent().equals(event)){
				return this;
			}
		}

		Transition newTransition = new Transition(event, null, null);
		if(event.equals("GO")){
			newTransition.setOperation();
		}
		currentState.addTransition(newTransition);
		currentTransition = newTransition;
		return this;
	}

	public StateMachine to(String targetState) {
		if(currentTransition.getTarget() != null){
			return this;
		}
		int ict = currentState.getTransitions().indexOf(currentTransition);
		int ics = stateList.indexOf(currentState);
		State ts;
		for (int i = 0; i < stateList.size(); i++) {
			if(stateList.get(i).getName().equals(targetState)){
				ts = stateList.get(i);
				stateList.get(ics).getTransitions().get(ict).setTarget(ts);
				return this;
			}
		}
		State newState = new State(targetState);
		stateList.add(newState);
		for (int i = 0; i < stateList.size(); i++) {
			if (stateList.get(i).getName().equals(targetState)) {
				ts = stateList.get(i);
				stateList.get(ics).getTransitions().get(ict).setTarget(ts);
				return this;
			}
		}
		return this;
	}

	public StateMachine integer(String intVar) {
		intCollection.put(intVar,0);
		return this;
	}

	public StateMachine set(String intVar, int i) {
		State state = stateList.get(stateList.indexOf(currentState));
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setSetOp();
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariable(intVar);
		intCollection.replace(intVar, i);
		return this;
	}

	public StateMachine increment(String intVar) {
		State state = stateList.get(stateList.indexOf(currentState));
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setIncrementOP();
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariable(intVar);
		intCollection.put(intVar , intCollection.get(intVar)+1);
		return this;
	}

	public StateMachine decrement(String intVar) {
		State state = stateList.get(stateList.indexOf(currentState));
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setDecrementOP();
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariable(intVar);
		intCollection.put(intVar , intCollection.get(intVar)-1);
		return this;
	}

	public StateMachine ifEquals(String compareVar, int i) {
		State state = stateList.get(stateList.indexOf(currentState));
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setConditional();
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariable(compareVar);
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setCompareVar(i);
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariableInt(42);
		return this;
	}

	public StateMachine ifGreaterThan(String compareVar, int i) {
		State state = stateList.get(stateList.indexOf(currentState));
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setConditional();
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariable(compareVar);
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariableInt(41);
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setCompareVar(i);
		return this;
	}

	public StateMachine ifLessThan(String compareVar, int i) {
		State state = stateList.get(stateList.indexOf(currentState));
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setConditional();
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariable(compareVar);
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setVariableInt(43);
		state.getTransitions().get(state.getTransitions().indexOf(currentTransition)).setCompareVar(i);
		return this;
	}

}
