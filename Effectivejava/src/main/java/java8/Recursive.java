package java8;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-06 20:01
 * @see
 **/
public class Recursive {
	public static int recursiveFun(int x){
		if(x==0){
			return 0;
		}else{
			return 2*recursiveFun(x-1)+x*x;
		}
	}

	public static void main(String[] args) {
		int x = 5;
//		System.out.println(recursiveFun(x));
		System.out.println(jicheng(x));
		System.out.println(leijia(x));
	}
	public static int jicheng(int x){
		if(x==1){
			return 1;
		}else{
			return jicheng(x-1)*x;
		}
	}

	public static int leijia(int x){
		if(x==1){
			return 1;
		}else{
			return leijia(x-1)+x;
		}
	}
}
