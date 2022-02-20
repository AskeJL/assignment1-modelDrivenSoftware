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

		return machine.getInitialState();
	}

	public void processEvent(String string) {
		// TODO Auto-generated method stub
		
	}

	public int getInteger(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
