class Solution {
    public int solution(int[][] dots) {
        // (1, 2) (3, 4)
        double line1 = calculateInc(dots[0], dots[1]);
        double line2 = calculateInc(dots[2], dots[3]);
        if(checkAnswer(line1, line2)) return 1;
        // (1, 3) (2, 4)
        line1 = calculateInc(dots[0], dots[2]);
        line2 = calculateInc(dots[1], dots[3]);
        if(checkAnswer(line1, line2)) return 1;
        // (1, 4) (2, 3)
        line1 = calculateInc(dots[0], dots[3]);
        line2 = calculateInc(dots[1], dots[2]);
        if(checkAnswer(line1, line2)) return 1;
        
        return 0;
    }
    public boolean checkAnswer(double inc1, double inc2){
        if(inc1 == 0 || inc2 == 0) return false;
        if(inc1 == inc2) return true;
        else return false;
    }
    
    public double calculateInc(int[] dots1, int[] dots2){
        if (dots1[0]-dots2[0] == 0) return 0;
        else return (double)(dots1[1]-dots2[1])/(double) (dots1[0]-dots2[0]);
    }
}