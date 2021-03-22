package scd;

import java.util.ArrayList;


public class Topic {
	private String _name;
	private String _msg;
	
	protected ArrayList<MyObserver> list = new ArrayList<>();
	
	public Topic() {
		_name = "no_name";
		_msg = "no_msg";
	}
	public Topic(String name, String msg) 
	{
		_name = name;
		_msg = msg;		
	}
	public void set_msg(String msg) {
		_msg = msg;
		notifyObservers();
	}
	public String get_name() {
		return _name;
	}
	public String get_msg() {
		return _msg;
	}
	public void notifyObservers() {
		for (MyObserver o : list) {
			o.update(_name,_msg);
		}
	}
	public void addObserver(MyObserver o) {
		list.add(o);
		o.update(_name,_msg);
	}

	public void removeObserver(MyObserver o) {
		list.remove(o);
	}
}
