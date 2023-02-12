package Q2;

public class MinMaxObjectClass {

	public MinMax findMinMax(int arr[]) {
		MinMax obj=new MinMax();
		obj.max=arr[1];
		obj.min=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<obj.min) {
				obj.min=arr[i];
			}
			if(arr[i]>obj.max) {
				obj.max=arr[i];
			}
		}
		return obj;
	}
}
