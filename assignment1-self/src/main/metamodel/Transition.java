package main.metamodel;

import java.util.Map;

public class Transition {
	private String event;
	private State to;
	private Map effect;

	public Transition(String event, State to, Map<String, String> effect) {
		super();
		this.event = event;
		this.to = to;
		this.effect = effect;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return to;
	}

	public void setTarget(State state){
		this.to = state;
	}

	public boolean hasSetOperation() {
		if(effect.containsKey("SET")){
			return true;
		}
		return false;
	}

	public boolean hasIncrementOperation() {
		if(effect.containsKey("INCREMENT")){
			return true;
		}
		return false;
	}

	public boolean hasDecrementOperation() {
		if(effect.containsKey("DECREMENT")){
			return true;
		}
		return false;
	}

	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isConditionEqual() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionGreaterThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConditionLessThan() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasOperation() {
		// TODO Auto-generated method stub
		return false;
	}

}
