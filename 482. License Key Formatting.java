public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        S = S.replaceAll("-", "").toUpperCase();
        if(S.length() < K || S.length() == 0){
            return S;
        }
        int time = K;
        for(int i = S.length() - 1; i >= 0; i--){
            if(time == 0){
                sb.append("-");
                time = K;
            }
            sb.append(S.charAt(i));
            time--;
        }
        return sb.reverse().toString();
    }
}
