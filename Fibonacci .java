
public class Test {
	
	public static void main(String[] args) {

	    int n = 40, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci even numbers");

	    for (int i = 1; i <= n; ++i) {
	      if(firstTerm%2==0)
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
      
    }
	
	


