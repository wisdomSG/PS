class Solution {
    public int solution(String s) {

        StringBuilder answer = new StringBuilder();
        int i = 0;
        
        while(true) {
            char c = s.charAt(i);
            if(!Character.isAlphabetic(c)) {
                answer.append(c);
                i ++;
            } else {
                switch(c) {
                    case 'z':
                        answer.append("0");
                        i += 4;
                        break;
                    case 'o':
                        answer.append("1");
                        i += 3;
                        break;
                    case 't':
                        if(s.charAt(i+1) == 'w') {
                            answer.append("2");
                            i+=3;
                        } else {
                            answer.append("3");
                            i+=5;
                        }
                        break;
                    case 'f':
                        if(s.charAt(i+1) =='o') {
                            answer.append("4");
                            i+=4;
                        } else {
                            answer.append("5");
                            i+=4;
                        }
                        break;
                    case 's':
                        if(s.charAt(i+1) =='i'){
                            answer.append("6");
                            i+=3;
                        } else {
                            answer.append("7");
                            i+=5;
                        }
                        break;
                    case 'e':
                        answer.append("8");
                        i+=5;
                        break;
                    case 'n':
                        answer.append("9");
                        i+=4;
                        break;
                }

            }
            
            if(i>=s.length()) {
                break;
            }
        }
        
        // StringBuilder를 String으로 변환한 뒤 정수로 파싱
        String resultString = answer.toString();
        int result = Integer.parseInt(resultString);
        return result;
    }
}