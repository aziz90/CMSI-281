public class NumberList implements java.util.Collection {
	public Object data ;
	public NumberList next ; 
	public  NumberList head = null;
	public static int size = 0 ; 
    /** Constructs an empty number list. */
  
    
    /** Increases by one the number of instances of the given element in this collection. */
    public boolean add ( Object obj ) { 
    	
    	
    	
    	
    	NumberList node = new NumberList (); 
    	node.data = obj ; 
    	node.next = null ; 
    	head = node; 


    	if (head == null)
    	{
    return false ; 
    	}
    	else
    	{
    		NumberList temp = new NumberList(); 
    		temp = head ;

    		while (temp.next != null)
    		{
    
    			
    			temp= temp.next ; 
    	
    			
    		}
		++size; 
		NumberList [] List = new NumberList[size];
		NumberList lis = new NumberList ();
		for (int i = 0 ; i<size ; i++)
		{
			List[i] = (NumberList)temp.data; 
			lis = List[i] ; 
			addAll(lis);
		
		
		}
		
    	
    	}
    	
    	
    return  true; 
    }
    

    /** Adds all of the elements of the given number list to this one. */
    public boolean addAll ( java.util.Collection c  ) {
    	NumberList [] l = new NumberList [size];
    for (int i = 0 ; i<size ; i++)
    {
    	
    	
    }
       return true ; 
    }
 

    /** Removes all of the elements from this collection. */
    public void clear () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
     
    }
 

    /** Returns true iff this number list contains at least one instance of the specified element. */
    public boolean contains ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
     return true  ;
    }
 

    public boolean containsAll ( java.util.Collection c ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
 return true ; 
    }
 
 


    /** Compares the specified object with this collection for equality. */
    public boolean equals ( Object obj ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
     NumberList list = new NumberList ();
     list.data  = obj ; 
     list.next = null ; 
     head = null; 
     if (head == null )
     {
    	 
    	 System.out.println("List is Empty");
    	 
     }
     else 
     {
    		NumberList temp = new NumberList(); 
		temp = head ;

    	 
    	 while (temp.next != null)
    	 {
    		 
    		 if (temp.data == obj )
    		 {
    			 
    			 return true ; 
    			 
    		 }
    		 temp = temp.next ; 
    		 
    		
    	 }
    
    }
    
     return false ; 
     }
 



    /** Returns the hashcode value for this collection. */
    public int hashCode () {
    
      return  0 ;  
    }



    /** Returns true if this collection contains no elements. */
    public boolean isEmpty () {
 if (head==null)
 {
 return true;
 }
 else 
	 return false ; 
 }



    /** Returns an iterator over the elements in this collection. Replicated elements should
        be "iterated over" just once. */
    public java.util.Iterator iterator () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        throw new UnsupportedOperationException();
    }



    /** Removes a single instance of the specified element from 
        this collection, if it is present. */
    public boolean remove ( Object obj ) {
     return true ; 
    }



    /** Removes all of this collection's elements that are also contained 
        in the specified collection. */
    public boolean removeAll ( java.util.Collection c ) {
       
    	if (head == null) 
    	{
    		return true ;
    	}
    	else
    		return false ; 
       
    }




	/** Retains only the elements in this collection that are contained in the specified collection. 
		 In other words, removes from this collection all of its elements that are not contained in the 
		 specified collection. */
	public boolean retainAll ( java.util.Collection c ) {
		throw new UnsupportedOperationException();
	}


    /** Returns the number of elements in this number list, including duplicates. */
    public int sizeIncludingDuplicates () {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        throw new UnsupportedOperationException();
    }
    
    

    /** Returns a Long[] containing all of the elements in this collection, not including duplicates. */
    public Long[] toArray () {
Long []ar = new Long [size];

return ar; 

    }



    /** Not supported for this class. */
    public Object[] toArray ( Object[] obj ) {
        throw new UnsupportedOperationException();
    }




    /** Returns the number of elements in this number list, not including duplicates. */
    public int size () {
     
        return size; 
   
    }




    /** Returns the number of instances of the given element in this number list. */
    public int count ( Object obj ) {

return size ; 
    }
    

    
    /** This returns a stringy version of this number list. */
    public String toString () { // overrides Object.toString()
    	String s = "";
  NumberList a = new NumberList (); 
  
NumberList tostring =new  NumberList (); 
tostring.data =a.data ; 
tostring.next = null ;
tostring = head ; 
while (tostring != null)
	
{
	s= s+ a.data ; 
}
    	
return s ;
    }


    
    /** This so-called "static factory" returns a new number list comprised of the numbers in the specified array.
        Note that the given array is long[], not Long[]. */
    public static NumberList fromArray ( long[] l ) {
        /* REPLACE THE NEXT STATEMENT WITH YOUR CODE */
        throw new UnsupportedOperationException();
    }

    
    /** This main method is just a comprehensive test program for the class. */
    public static void main ( String[] args ) {
        NumberList list = new NumberList();
NumberList l = new NumberList ();

   
    

System.out.println(l.count(l));



 
    }
    
}
