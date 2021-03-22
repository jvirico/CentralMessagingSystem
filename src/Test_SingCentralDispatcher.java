package scd;

public class Test_SingCentralDispatcher {

	public static void main(String[] args) 
	{
		Observer Ob_1 = new Observer();
		Observer Ob_2 = new Observer();
		
		//System.out.println(Ob_1.);
		
		SingCentralDispatcher.Instance().get_TopicA().addObserver(Ob_1);
		SingCentralDispatcher.Instance().get_TopicB().addObserver(Ob_1);
		SingCentralDispatcher.Instance().get_TopicB().addObserver(Ob_2);
		
		System.out.println("Topic A in Singleton Central Dispatcher (instance // message): " + SingCentralDispatcher.Instance() + " // " + SingCentralDispatcher.Instance().get_msg_topicA());
		System.out.println("Topic B in Singleton Central Dispatcher (instance // message): " + SingCentralDispatcher.Instance() + " // " + SingCentralDispatcher.Instance().get_msg_topicB());
		System.out.println("Topic C in Singleton Central Dispatcher (instance // message): " + SingCentralDispatcher.Instance() + " // " + SingCentralDispatcher.Instance().get_msg_topicC());
		System.out.println("");
		
		System.out.println("Ob_1 list of topics suscribed (topic_name=topic_message): " + Ob_1.State());
		System.out.println("Ob_2 list of topics suscribed (topic_name=topic_message): " + Ob_2.State());
		System.out.println("");		
		System.out.println("");	
		
		System.out.println("Updating Topic A in Singleton " + SingCentralDispatcher.Instance());
		SingCentralDispatcher.Instance().set_msg_topicA("Sports");
		System.out.println("----------------------------------------------------");
		System.out.println("Ob_1 state is: " + Ob_1.State());
		System.out.println("Ob_2 state is; " + Ob_2.State());
		System.out.println("");		
		
		
		System.out.println("Updating Topic B in Singleton " + SingCentralDispatcher.Instance());
		SingCentralDispatcher.Instance().set_msg_topicB("Numerical Analysis");
		System.out.println("----------------------------------------------------");
		System.out.println("Ob_1 state is: " + Ob_1.State());
		System.out.println("Ob_2 state is; " + Ob_2.State());
		System.out.println("");	
		
		System.out.println("Updating Topic C in Singleton " + SingCentralDispatcher.Instance());
		SingCentralDispatcher.Instance().set_msg_topicC("Nobody watching!!");
		System.out.println("----------------------------------------------------");
		System.out.println("Ob_1 state is: " + Ob_1.State());
		System.out.println("Ob_2 state is; " + Ob_2.State());
	}
}
