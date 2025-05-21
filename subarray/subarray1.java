class MinlenSubArray{
	public static void main(String[] args){
		int arr[]=new int[]{1,2,3,1,3,4,6,4,6,3};
		//int arr[]=new int[]{3,6,4,6,4,3,1,3,2,1};

		int maxValue=Integer.MIN_VALUE;
		int minValue=Integer.MAX_VALUE;

		int minlength=Integer.MAX_VALUE;
		int count=0;
		int min_index=0;
		int max_index=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]<minValue){
				minValue=arr[i];
				min_index=i;
			}
			if(arr[i]>maxValue){
				maxValue=arr[i];
				max_index=i;
			}
		}
                System.out.println(min_index);
		System.out.println(max_index);
		for(int i=0;i<arr.length;i++){
			if(arr[i]==minValue)
				count++;
			else if(arr[i]==maxValue){
				int len=i-count;

				if(len<minlength)
					minlength=len;

			}
		}
		System.out.println(minlength);
	}
}
