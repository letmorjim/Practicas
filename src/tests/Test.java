package tests;

import static org.junit.Assert.*;

public class Test {
	
	@org.junit.Test
	public void test_1(){
		assertEquals(5,4+1);
		assertEquals(5,sum(4,1));
		assertEquals(5,FuncionSuma.sum(4,1));
		

	}
	
	@org.junit.Test
	public void test_2(){
		assertEquals(4,4,0);
		assertEquals(4,sum(4,0));
		assertEquals(4,FuncionSuma.sum(4,0));
		

	}

	
	int sum (int a, int b){
		return a+b;
	}
	
}
