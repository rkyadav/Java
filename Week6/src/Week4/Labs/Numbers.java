package Week4.Labs;


public class Numbers{
	public final int value1;
	public final int value2;
	
	public Numbers(int value1, int value2){
		this.value1 = value1;
		this.value2 = value2;
		
	}
	public Numbers plus(Numbers b){ //sums of this Numbers and b
		int num1 = this.value1 + this.value2;
		int num2 = b.value1 + b.value2;
		
		return new Numbers(num1, num2);
		
	}

	public Numbers minus(Numbers b){ //difference of this Numbers and b
		int num1 = this.value1 - this.value2;
		int num2 = b.value1 - b.value2;
		return new Numbers(num1, num2);
	}
	public Numbers times(Numbers b){	//product of this Numbers and b
		int num1 = this.value1 * this.value2;
		int num2 = b.value1 * b.value2;
		return new Numbers(num1, num2);
	}
	public Numbers divideBy(Numbers b){	//quotient of this Numbers and b	
		int num1 = (int)(this.value1 / this.value2);
		int num2 = (int)(b.value1 / b.value2);
		return new Numbers(num1, num2);
	}
	public boolean equals(Object that){	//is this Numbers equal to that?	
		if (this == that) 
			return true;
	    if (that == null) 
	    	return false;
	    if (this.getClass() != that.getClass()) 
	    	return false;
	    Numbers y = (Numbers) that;
	      if (this.value1 != y.value1)            
	    	  return false;
	      if (this.value2 != y.value2)        
	    	  return false;
	      return true;
	}
	public String  toString(){		//string representation
		return this.value1 + " " + this.value2;
	}
}

