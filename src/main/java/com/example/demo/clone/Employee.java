package com.example.demo.clone;

import java.util.Map;
import java.util.stream.Collectors;

public class Employee implements Cloneable {
	private int id;

	private String name;

	private Map<String, String> props;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getProps() {
		return props;
	}

	public void setProps(Map<String, String> p) {
		this.props = p;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee)super.clone();
		
		// deep clone map
		Map<String, String> clonedProps = /*new HashMap<>();*/
		this.props.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		//clonedProps.putAll(this.props);
		cloned.setProps(clonedProps);
		
		return cloned;
	}
}
