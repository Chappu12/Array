public class KthLargestElement {
    public static int findKthLargest(int[] a,int k) {
		int min = a[0],max = a[0];
		for(int i = 0;i<a.length;i++) { 
			if(min>a[i]) min = a[i];
			if(max<a[i]) max = a[i];
		}
		int c = 0;
		for(int i = max;i>=min;i--) {
			for(int j = 0;j<a.length;j++) {
				if(i==a[j]) {
					c++;
					break;
				} 
			}
			if(c==k) {
				return i;
			}
		}
		 return -1;
	}

    public static void main(String ar[]){
        int[] a = {3,2,1,5,6,4};

        System.out.println(findKthLargest(a, 2));
    }
}


