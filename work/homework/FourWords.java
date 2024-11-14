//สิรภพ สมเชย
//6509612070
package homework;

public class FourWords {
	private String word1;
	private String word2;
	private String word3;
	private String word4;
	private int count=0;
	public void add(String word) {
		if(count==4) {
			System.out.printf("Can't add a new word %s!%n",word);
		}
		else if (word1==null) {
			word1=word;
			count+=1;
		}
		else if (word2==null) {
			word2=word;
			count+=1;
		}
		else if (word3==null) {
			word3=word;
			count+=1;
		}
		else if (word4==null) {
			word4=word;
			count+=1;
		}
		
	}
	public String getMin() {
		String min = word1;
		if(word1==null) {return null;}
		if(word2==null) {return min;}
		if (min.compareTo(word2)>0 ){
			min=word2;
		
		}
		if(word3==null) {return min;}
		if (min.compareTo(word3)>0 ){
			min=word3;
		}
		if(word4==null) {return min;}
		if (min.compareTo(word4)>0 ){
			min=word4;
		}

		return min;
	}
	public String getMax() {
		String max =word1;
		if(word1==null) {return null;}
		if(word2==null) {return max;}
		if (max.compareTo(word2)<0 ){
			max=word2;
		}
		if(word3==null) {return max;}
		if (max.compareTo(word3)<0 ){
			max=word3;
		}
		if(word4==null) {return max;}
		if (max.compareTo(word4)<0 ){
			max=word4;
		}
		return max;
	}
	public void printWords() {
		int length = 0;
		double average=0;
		if(word1==null) {
			System.out.println("No words set up yet!");
			/*System.out.println("List of words:");
			System.out.println("The lexicographic minimum is null");
			System.out.println("The lexicographic maximum is null");
			System.out.println("Total length 0");
			System.out.println("Average length 0.000000");*/
		}
		{
			if(word1!=null) {
				length = word1.length();
			    average = (double)length/count;}
		    if(word2!=null) {
		    	length+=word2.length();
		        average = (double)length/count;}
			if(word3!=null) {
				length+=word3.length();
				average = (double)length/count;}
			if(word4!=null) {
				length+=word4.length();
				average = (double)length/count;}
		System.out.println("List of words:");
		if(word1!=null) {System.out.printf("     %s%n",word1);}
		if(word2!=null) {System.out.printf("     %s%n",word2);}
		if(word3!=null) {System.out.printf("     %s%n",word3);}
		if(word4!=null) {System.out.printf("     %s%n",word4);}
		if(count!=4) {System.out.printf("%n");}
		System.out.printf("The lexicographic minimum is %s%n",getMin());
		System.out.printf("The lexicographic maximum is %s%n",getMax());
		System.out.printf("Total length %d%n",length);
		System.out.printf("Average length %.6f%n%n",average);
		}

	}

}
