class Solution
{
    //Function to find list of all words possible by pressing given numbers.
    static void createList(int a[], int N, HashMap<Integer, String> hm, ArrayList<String> output, int i, String temp)
    {
        if(i==N)
        {
            output.add(temp);
            return;
        }
    
        for(int j=0;j<hm.get(a[i]).length();j++)
        {
            temp = temp+hm.get(a[i]).charAt(j);
            createList(a,N,hm,output,i+1,temp);
            temp = temp.substring(0,temp.length()-1);
        }
        return;
    }
    
    static ArrayList <String> possibleWords(int a[], int N)
    {
        // your code here 
        ArrayList<String> output = new ArrayList<>();
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        createList(a,N,hm,output,0,"");
        return output;
    }
}
