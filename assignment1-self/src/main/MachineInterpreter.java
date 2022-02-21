package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class MachineInterpreter {
	private Machine machine; // metamodel (i.e., state machine program) to execute
	private State currentState; // runtime state

	public void run(Machine m) {
		machine = m;
		
	}

	public State getCurrentState() {

		return machine.getCurrentState();
	}

	public void processEvent(String event) {
		currentState = machine.getCurrentState();
		if(machine.getCurrentState().getTransitionByEvent(event).getTarget() != null) {
			State targetState = machine.getCurrentState().getTransitionByEvent(event).getTarget();
			machine.setCurrentState(targetState);
			currentState = targetState;
		}

	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
