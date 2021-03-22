package scd;

import java.util.HashMap;
//import java.uitl.ArrayList;
import java.util.Map;

public class Observer implements MyObserver{
	private Map<String, String> _myObservations = null;
	
	public Observer() {
		_myObservations = new HashMap<>();
	}
	public void update(String name, String msg) 
	{
		_myObservations.put(name,msg);
	}
	public String State() {
		String observations = "";
		for (String t : _myObservations.keySet()){
			if (observations == "") {
				observations = t + " = " + _myObservations.get(t);	
			}else {
				observations = observations + " | " + t + " = " + _myObservations.get(t);
			}
			
		}
		return observations;
	}
}
