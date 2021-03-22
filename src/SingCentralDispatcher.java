package scd;

public class SingCentralDispatcher {
	protected Topic _topic_A;
	protected Topic _topic_B;
	protected Topic _topic_C;
	
	protected static SingCentralDispatcher global_ptr = null;
	
	public static SingCentralDispatcher Instance() 
	{
		if (global_ptr == null) {
			global_ptr = new SingCentralDispatcher();
		}
		return global_ptr;
	}
	private SingCentralDispatcher() 
	{
		_topic_A = new Topic("Topic A","-");
		_topic_B = new Topic("Topic B","-");
		_topic_C = new Topic("Topic C","-");
	}
	
	public Topic get_TopicA() {
		return _topic_A;
	}
	public Topic get_TopicB() {
		return _topic_B;
	}
	public Topic get_TopicC() {
		return _topic_C;
	}
	
	public String get_msg_topicA() 
	{
		return _topic_A.get_msg();
	}
	public void set_msg_topicA(String msg)
	{
		_topic_A.set_msg(msg);
	}
	public String get_msg_topicB() 
	{
		return _topic_B.get_msg();
	}
	public void set_msg_topicB(String msg)
	{
		_topic_B.set_msg(msg);
	}
	public String get_msg_topicC() 
	{
		return _topic_C.get_msg();
	}
	public void set_msg_topicC(String msg)
	{
		_topic_C.set_msg(msg);
	}
}
