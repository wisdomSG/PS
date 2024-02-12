class Solution {
    public String solution(String polynomial) {
        StringBuilder answer = new StringBuilder();
        int sumX = 0;
        int sumN = 0;
        String[] arr = polynomial.split(" +");

        for (String part : arr) {
            if (part.equals("x")) {
                sumX++;
            } else if (part.contains("x")) {
                sumX += Integer.parseInt(part.substring(0, part.length() - 1));
            } else if (!part.equals("+")) {
                sumN += Integer.parseInt(part);
            }
        }

        if (sumX != 0) {
            if (sumX == 1) {
                answer.append("x");
            } else {
                answer.append(sumX).append("x");
            }
        }

        if (sumN != 0) {
            if (answer.length() > 0) {
                answer.append(" + ");
            }
            answer.append(sumN);
        }

        if (sumX == 0 && sumN == 0) {
            answer.append(0);
        }

        return answer.toString();
    }
}
