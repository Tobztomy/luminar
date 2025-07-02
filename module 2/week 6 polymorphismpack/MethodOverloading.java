package polymorphismpack;

class Demo{
	public static void sum(int first,int second,float third) {
		System.out.println(first+second);
	}
	int sum(int num,int second,int first) {
		return num+first;
	}
	double sum(double first,float second) {
		return first+second;
	}
	double sum(int first, double second) {
        return first + second;
    }
    double sum(double first, int second) {
        return first + second;
    }
    float sum(int first, float second) {
        return first + second;
    }
}
public class MethodOverloading {
	
	public static void sum(int first,int second,float third) {
		System.out.println(first+second);
	}
	int sum(int num,int second,int first) {
		return num+first;
	}
	
	public static void main(String[] args) {
		int first =34;
		int second=45;
		int num=78;
		float third=89.0f;
		double forth=90.00;
		Demo demo=new Demo();
		Demo.sum(first,second,third);
		System.out.println(demo.sum(num,second,first));
		System.out.println(demo.sum(forth,third));
		System.out.println(demo.sum(first,forth));
		System.out.println(demo.sum(forth,second));
		System.out.println(demo.sum(first,third));
	}
}
