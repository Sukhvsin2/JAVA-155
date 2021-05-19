class Math {

	//computes the sum of two values
	public static float add( float first, float second ) {
		return (first+second);
	}
	
	//computes the sum of array
	public static float add( float[] arr ) {
		float temp = 0;
		for(int i=0;i<arr.length;i++){
			temp += arr[i];
		}
		return temp;
	}
	
	//computes the mulpication of two values
	public static float multiply( float first, float second ) {
		return (first*second);
	}
	
	//computes the mulpication of array
	public static float multiply( float[] arr ) {
		float temp = 1;
		for(int i=0;i<arr.length;i++){
			temp *= arr[i];
		}
		return temp;
	}
}