
public class Calculator {
	public static double getSum(double first, double second ){
		return first+second;
	}
	public static double getSum(double first, double second, double third){
		return first+second+third;
	}
	public static double getSum1(double [] num){
		double sum=0;
		for(int i=0; i<num.length; i++){
			sum+=num[i];  
	} return sum;
	}
	
    public static double getAvarage(double first, double second){
    	return (first+second)/2.0;
    }
    public static double getAvarage(double first, double second, double third){
    	return (first+second+third)/3.0;
    }
    public static double getAverage(double [] num){
    	double sum=0;
    	for(int i=0;i<num.length; i++){
    		sum+=num[i];
    	} return sum;
     }
    public static double getPraduct(int a, int b){
    	return a*b;
    }
    public static double Product(int [] product){
    	int result=2;
    	for(int i=0; i<product.length; i++){
    		result *=product[i];
    	} return result;
    }
    public static int factorial (int a){
    	int result=1;
    	for(int i=0; i<=a;i++){
    		result *=i;
    	} return result; 
     }
   }

