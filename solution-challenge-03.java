class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if((n&1) == 0){
            for(int i=0 ; i<n-1 ; i++){
                sb.append("a");
            }
            sb.append("b");
            return sb.toString();
        }
        
        for(int i=0 ; i<n ; i++){
            sb.append("a");
        }
     
        return sb.toString();
    }
}
