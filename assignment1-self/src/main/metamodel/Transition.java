package main.metamodel;

public class Transition {
	private String event;
	private State to;
	private Runnable effect;
	private  Boolean setOP = false;
	private  Boolean incrementOP = false;
	private  Boolean decrementOP = false;
	private  Boolean isConditional = false;
	public Transition(String event, State to, Runnable effect) {
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

	public void setSetOp(){this.setOP = true;}

	public boolean hasSetOperation() {
		return setOP;
	}

	public boolean hasIncrementOperation() {
		// TODO Auto-generated method stub
		return incrementOP;
	}

	public boolean hasDecrementOperation() {
		// TODO Auto-generated method stub
		return decrementOP;
	}

	public Object getOperationVariableName() {
		// TODO Auto-generated method stub
		return "var";
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return isConditional;
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

	public void setIncrementOP() {
		this.incrementOP = true;
	}

	public void setDecrementOP() {
		this.decrementOP = true;
	}

	public void setConditional() {
		isConditional = true;
	}
}
