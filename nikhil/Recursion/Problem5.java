import java.util.*;

class Demo {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- != 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
		
			
// 			Map<Integer,Integer> m = new HashMap<>();
// 			for(int i=0;i<n;i++)
// 			{
// 			    if(m.get(a[i])==null)
// 			        m.put(a[i],1);
// 			    else    
// 			        m.put(a[i],m.get(a[i])+1);
// 			}
// 			int flag=0;
// 			for(Map.Entry<Integer,Integer> mp: m.entrySet())
// 			{
// 			    if(mp.getValue()>=2){
// 			        flag=1;
// 			        break;
// 			    }
			     
// 			}
// 			if(flag==1)
// 			    System.out.println("yes");
//  			else
// 			    System.out.println("no");
			Set<Integer> map = new HashSet<>();
			for (int i = 0; i < n; i++) {
			    int x = sc.nextInt();
				map.add(x);
			}
			if (n != map.size())
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
