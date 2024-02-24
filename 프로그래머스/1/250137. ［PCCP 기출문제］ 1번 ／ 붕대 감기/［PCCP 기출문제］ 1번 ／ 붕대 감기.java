class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // bandage : 시전시간 (t), 1초당 회복량 (x), 추가 회복량(y)
        // health: 최대 체력
        // attacks: 공격 시간, 피해량
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int continusY = 0;
        int realHealth = health;
        int index = 0; 
        for (int i = 0; i <= attacks[attacks.length-1][0] ; i++){
            if(attacks[index][0] == i){ // 공격했다면?
                continusY = 0;
                realHealth -= attacks[index][1];
                // 공격해서 체력이 없다면
                if(realHealth <= 0) return -1;
                index++;
            }
            else{ // 붕대감기 중이라면? 
                continusY++;
                if(continusY == t){ // 추가 회복량
                    if(realHealth + y > health) {
                        realHealth = health;
                    }else realHealth += y;
                    continusY = 0; // 초기화
                }
                if(realHealth + x > health){ // 1초당 회복량
                    realHealth = health;
                }else realHealth += x;
            }
        }
        
        return realHealth;
    }
}