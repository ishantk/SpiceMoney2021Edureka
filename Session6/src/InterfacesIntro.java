class A{
	
}

class B{
	
}

class C extends A{
	
}

/*class D extends A, B { // Error -> Multiple Inheritance Not Supported in Java
	
}*/

abstract class E{
	abstract void hello();
}

abstract class F{
	abstract void bye();
}

/*
class G extends E, F{ // error -> we cannot extend from 2 classes :(
	void hello() {
		
	}
	
	void bye() {
		
	}
}*/

// Interface is just like an abstract class
// But it is not inherited
// It is implemented
interface H{
	void hello(); // -> public abstract void hello()
	void message();
}

interface I{
	void bye();  // -> public abstract void bye()
}

class J implements H, I{ // Multiple Implementation
	
	public void hello() {
		
	}
	
	public void message() {
		
	}
	
	public void bye(){
		
	}
}

public class InterfacesIntro {

	public static void main(String[] args) {
		

	}

}
