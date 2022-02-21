package main.metamodel;

public class Transition {
	private String event;
	private State to;
	private Runnable effect;
	private  Boolean setOP = false;
	private  Boolean incrementOP = false;
	private  Boolean decrementOP = false;
	private  Boolean isConditional = false;
	private Boolean operation = false;
	private String variable;
	private int variableInt;
	private int compareVar;
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
		return variable;
	}

	public boolean isConditional() {
		// TODO Auto-generated method stub
		return isConditional;
	}

	public Object getConditionVariableName() {
		// TODO Auto-generated method stub
		return variable;
	}

	public Integer getConditionComparedValue() {
		// TODO Auto-generated method stub
		return compareVar;
	}

	public boolean isConditionEqual() {
		if(variableInt == compareVar){
			return true;
		}
		return false;
	}

	public boolean isConditionGreaterThan() {
		if(variableInt < compareVar){
			return true;
		}
		return false;
	}

	public boolean isConditionLessThan() {
		if(variableInt > compareVar){
			return true;
		}
		return false;
	}

	public boolean hasOperation() {
		return operation;
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

	public void setCompareVar(int compareVar) {
		this.compareVar = compareVar;
	}

	public void setVariableInt(int variableInt) {
		this.variableInt = variableInt;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public void setOperation() {
		this.operation = true;
	}
}
