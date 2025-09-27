import java.util.*;

public class TalesOfASort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int maxOps = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    maxOps = Math.max(maxOps, a[i]);
                } else {
                    maxOps = Math.max(maxOps, a[i] - a[i - 1]);
                }
            }
            System.out.println(maxOps);
        }

        sc.close();
    }
}


/*import java.util.*;

public class TalesOfASort {
	
	public static void sort(int[] arr,List<Integer> list) {
		int max=0,f=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				f=0;
				if(max<arr[i]) {
					max=arr[i];
				}
			}
		}
		if(f==1) {
			list.add(0);
		}else {
			list.add(max);
		}
	
	}
	
	public static void main(String Args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		while(n-->0) {
			int t=sc.nextInt();
			int[] arr=new int[t];
			for(int i=0;i<t;i++) {
				arr[i]=sc.nextInt();
			}
			sort(arr,list);
		}
		sc.close();
		for(int a:list) {
			System.out.println(a);
		}
	}
}*/