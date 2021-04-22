package arrays;

public class FrequencyOfEachCahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="she sells sea shells";
		char[] chr=Str.toCharArray();
		
		int[]count=new int[Str.length()];
		int i,j;
		
		for(i=0;i<Str.length();i++) {
			count[i]=1;
			for(j=i+1;j<Str.length();j++) {
				
				if(chr[i]==chr[j]) {
					count[i]++;
				
				
				chr[j]='0';//To avoid the printed charecter
			}
		}
	}
		
		for(i=0;i<count.length;i++) {
			
			if(chr[i]!= ' ' && chr[i]!='0') {
				System.out.println(chr[i] +" "+count[i]);
				
			}
		}
	}

}
