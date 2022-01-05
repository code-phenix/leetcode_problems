// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 

// Constraints:

// 1 <= numRows <= 30


class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> res=new ArrayList<>();
        int preArr=1,temp;
        List<Integer> ls;
        ls=new ArrayList<Integer>();
        ls.add(1);
        res.add(ls);
        if(numRows==1)
            return res;
        ls=new ArrayList<Integer>();
        ls.add(1);
        ls.add(1);
        res.add(ls);
        if(numRows==2)
            return res;
        for(int iterI=1;iterI<numRows-1;iterI++){
            temp=0;
            ls=new ArrayList<Integer>();
            ls.add(1);
            int size=res.get(preArr).size();
            while(temp<size-1){
                ls.add(res.get(preArr).get(temp)+res.get(preArr).get(temp+1));
                temp++;
            }
            ls.add(1);
            res.add(ls);  
            preArr++;
        }
        return res;
    }
}

//Runtime: 0 ms
// Memory Usage: 38.7 MB
