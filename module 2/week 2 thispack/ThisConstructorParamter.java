package thispack;
//this can be used as a parameter in parameter call
class Demo{
	Demo(Test ob){
		System.out.println("demo");
	}
}
class Test{
	Test(){
		Demo obj1=new Demo(this);
		System.out.println("Test");
	}
}
public class ThisConstructorParamter {

	public static void main(String[] args) {
		Test obj =new Test();

	}

}
