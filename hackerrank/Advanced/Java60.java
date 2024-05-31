package hackerrank.Advanced;


class Singleton{
	
	private static final Singleton INSTANCE = new Singleton();
	public String str;
	public Singleton() {}
	public static Singleton getSingletonInstance() {
		return INSTANCE;
	}
	
}

class Java60{
	
}