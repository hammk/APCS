package peak;

class Peak {
	/** @param array an array of positive integer vales
	 *  @param stop the last index to check;
	 *  @return true if for each j such that 0 <= j < stop, array[j] < arrray[j+1]
	 *           false otehrwise
	 */
	public boolean isIncreasing(int[] array, int stop)
	{
		for(int j = 0; j < stop; j++)
		{
			if(array[j] >= array[j+1])
				return false;
				
		}
		return true;
	}
	
	/** @param array an array of positive integer vales
	 *  @param start the first index to check;
	 *  @return true if for each j such that start <= j < array.length - 1, array[j] < arrray[j+1]
	 *           false otehrwise
	 */
	
	public boolean isDecreasing(int [] array, int start)
	{
		for(int j = start; j < array.length-1; j++)
		{
			if(array[j] < array[j+1])
				return false;
				
		}
		return true;
	}
	
	/**
	 * Calculates the highest number in an array. It runs
	 * through a loop looking for the highest number. If
	 * the highest number isn't the last or first number,
	 * then it is considered the peak and it's index is
	 * returned. Otherwise, return -1.
	 * @param array - array to find peak of
	 * @return index of array peak or -1
	 */
	public int getPeak(int[] array)
	{
	    int peak = 0;
	    int pIndex = -1;
	    if(!isIncreasing(array, array.length - 1) && !isDecreasing(array, 0)) {
	        for(int j = 0; j < array.length; j++)
	        {
	            if(array[j] >= peak)
	                if(j != 0 && j != (array.length - 1))
	                {
	                    peak = array[j];
	                    pIndex = j;
	                }             
	        }
	    }
	    return pIndex;
	}
	
	/**
	 * Checks if a given array is arranged in a triangle
	 * with no extra peaks. It uses included method getPeak
	 * to find the index of the peak, then runs included
	 * methods isIncreasing and isDecreasing, using the
	 * index as a starting/stopping point. If both methods
	 * return true, this method return true.
	 * @param array - array to check if arranged like a triangle
	 * @return true/false
	 */
	public boolean hasPeak(int[] array)
	{
	    if(getPeak(array) != -1)
	        if(isIncreasing(array, getPeak(array)) && isDecreasing(array, getPeak(array)))return true;
	    return false;
	}
	
}