Problem 13: Decode the string 

class Solution{
    static String decodedString(String s){
        Stack<String> st = new Stack<>();
            int curNum = 0;
            String curStr = "";
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '[') {
                    st.push(curStr);
                    st.push(Integer.toString(curNum));
                    curStr = "";
                    curNum = 0;

                } else if (s.charAt(i) == ']') {
                    int num = Integer.parseInt(st.pop());
                    String pstr = st.pop();
                    curStr = pstr + curStr.repeat(num);

                } else if (Character.isDigit(s.charAt(i))) {

                    curNum = curNum * 10 + s.charAt(i) - '0';
                } else
                    curStr = curStr + s.charAt(i);
            }
            return curStr;
    }
}
