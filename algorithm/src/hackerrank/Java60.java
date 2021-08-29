package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


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