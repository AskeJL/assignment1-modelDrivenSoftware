package main;

import main.metamodel.Machine;
import main.metamodel.State;

import java.util.ArrayList;

public class StateMachine {
	ArrayList<State> list = new ArrayList<State>();
	State initialState = null;
	State currentState = null;

	public Machine build() {
		Machine m = new Machine(list, initialState);
		return m;
	}

	public StateMachine state(String state) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(state)){
				currentState = list.get(i);
			}
		}
		return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
