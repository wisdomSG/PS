class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int lastTime = attacks[attacks.length-1][0];
        int castingTime = bandage[0];
        int hpPerSecond = bandage[1];
        int additionalHealing = bandage[2];
        int index = 0 ; 
        int result = health;
        int count = 0;
        
        for(int i=1; i<=lastTime; i++) {
            // 1. 공격
            if(attacks[index][0] == i) {
                result -= attacks[index][1];
                if(result <= 0 ) return -1;
                index ++;
                count = 0;
            } else {
                result += hpPerSecond;
                count ++;
                if(count == castingTime) {
                    count = 0;
                    result += additionalHealing;
                }
                if(result >= health) {
                    result = health;
                }
            }    
        }
        
        return result;
    }
}