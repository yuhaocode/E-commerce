// .toLowerCase is front convertion 
// LinkedList convert to ArrayList list.toArray(new String[0]);
public class Solution {
    public String[] findWords(String[] words) {
        String[] board = new  String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        for(String key : board){
            for(char c : key.toCharArray()){
                map.put(c , i);
            }
            i++;
        }
        List<String> list = new LinkedList<>();
        
        for(String word : words){
            int index = map.get(word.toLowerCase().charAt(0));
            for(char c : word.toLowerCase().toCharArray()){
                if(map.get(c) != index){
                    index = -1;
                    break;
                }
            }
            if(index != -1){
                list.add(word);
            }
        }
        return list.toArray(new String[0]);
    }
}
