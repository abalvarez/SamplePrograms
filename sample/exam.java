package sample;

import java.util.stream.IntStream;

public class exam {
	public static int ctrX;
	public static int ctry,ctry2, checkM, permIns;
	static int[] a;
	 public static void main (String args[])
	    {
		 	ctrX = 0;
        	checkM = 1;
		 	permIns = 1213;
	        permute(String.valueOf(permIns));
	    }
	    
	    
	    public static   void permute( String input)
	    {
	        int inputLength = input.length();
	        boolean[ ] used = new boolean[ inputLength ];
	        StringBuffer outputString = new StringBuffer();
	        char[ ] in = input.toCharArray( );
	        a = new int [inputLength];
	        doPermute ( in, outputString, used, inputLength, 0 );
	        
	    }
	    
	    public static    void doPermute ( char[ ] in, StringBuffer outputString,
	    boolean[ ] used, int inputLength, int level)
	    {
	        if( level == inputLength) {

	            if(checkM == 1){
	            	for(int ctrS = 0; ctrS<a.length; ctrS++){
	            		checkM = checkM * a[ctrS];
	            	}
	            }else{
	            	for(int ctrS = 0; ctrS<a.length; ctrS++){
	            		ctry = ctry * a[ctrS];
	            	}
	            }
	            if(checkM == ctry){
	            	ctrX++;
	            	System.out.println ( "ctrX: " + ctrX);
	            }
	            ctry = 1;
	            //a = new int [inputLength];
	            return;
	        }
	        
	        for( int i = 0; i < inputLength; ++i )
	        {
	        	
	            if( used[i] ) continue;
	            outputString.append( in[i] );
	            used[i] = true;
	            a[i] = Character.getNumericValue(in[i]);
	        	
	            doPermute( in,   outputString, used, inputLength, level + 1 );

	            used[i] = false;
	            outputString.setLength(   outputString.length() - 1 );
	        }
	    }
}
