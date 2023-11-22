class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        for(int i: arr) 
            System.out.print(i + " ");
        int numOfOccur = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]) {
                numOfOccur++;                    
            }
            else {
                if(map.containsValue(numOfOccur))
                    return false;
                else {
                    map.put(arr[i - 1], numOfOccur);
                    numOfOccur = 1;
                }
            }
        }
        if(map.containsValue(numOfOccur)) {
            return false;
        } else {
            map.put(arr[arr.length - 1], numOfOccur);
        }

        return true;
    }
}