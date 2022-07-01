//Using Collections.sort() to sort the list-
//TC= O(n!n), SC= O(n)
class Solution {
    public void createList(String S, String temp, Set<String> uniqueOutput)
    {
       
        if(S.length()==0)
        {
            uniqueOutput.add(temp);
            return;
        }
        
        for(int i=0;i<S.length();i++)
        {
            String s1 = S.substring(0,i)+S.substring(i+1,S.length());
            createList(s1,temp+S.charAt(i),uniqueOutput);
        }
        return;
    }
    
    public List<String> find_permutation(String S) {
        // Code here
        Set<String> uniqueOutput = new HashSet<>();
        createList(S,"",uniqueOutput);
        List<String> output = new ArrayList<>();
        for(String temp: uniqueOutput){
            output.add(temp);
        }
        Collections.sort(output);
        return output;
    }
}

//Use TreeSet to sort and remove duplicate in the list
class Solution {
    public void createList(String S, String temp, TreeSet<String> uniqueOutput)
    {
       
        if(S.length()==0)
        {
            uniqueOutput.add(temp);
            return;
        }
        
        for(int i=0;i<S.length();i++)
        {
            String s1 = S.substring(0,i)+S.substring(i+1,S.length());
            createList(s1,temp+S.charAt(i),uniqueOutput);
        }
        return;
    }
    
    public List<String> find_permutation(String S) {
        // Code here
        TreeSet<String> uniqueOutput = new TreeSet<>();
        createList(S,"",uniqueOutput);
        List<String> output = new ArrayList<>();
        for(String temp: uniqueOutput){
            output.add(temp);
        }
        //Collections.sort(output);
        return output;
    }
}
