package silverTest;



public class Buutn {
	public static void main(String[] args) {
		SampleFunction function = (name) ->
	System.out.println("Hellow" + name);
		function.say("テスト トマト");
	}
	private interface SampleFunction{
		public void say(String name);
	}
}