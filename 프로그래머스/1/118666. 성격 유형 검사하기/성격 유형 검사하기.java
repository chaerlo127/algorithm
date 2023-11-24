import java.util.Vector;

class Solution {
    private class Personal{
        private String personality;
        private Integer personalScore;
        private String reactPersonal;
        private Integer reactPersonalScore;

        public Personal(String personality, Integer personalScore, String reactPersonal, Integer reactPersonalScore) {
            this.personality = personality;
            this.personalScore = personalScore;
            this.reactPersonal = reactPersonal;
            this.reactPersonalScore = reactPersonalScore;
        }

        public String getPersonality() {
            return personality;
        }

        public Integer getPersonalScore() {
            return personalScore;
        }

        public String getReactPersonal() {
            return reactPersonal;
        }

        public Integer getReactPersonalScore() {
            return reactPersonalScore;
        }

        public void setPersonalScore(Integer personalScore) {
            this.personalScore = personalScore;
        }

        public void setReactPersonalScore(Integer reactPersonalScore) {
            this.reactPersonalScore = reactPersonalScore;
        }
    }

    private Vector<Personal> personals = new Vector<>();
    
    public String solution(String[] survey, int[] choices) {
        savePersonal();
        for(int i = 0; i < survey.length ; i++){
            String[] s = survey[i].split("");
            int index = checkIndexOfPersonals(s);
            // an 이면
            // choices check score 1, 2, 3 -> a 쪽, 5, 6, 7이면 -> n 쪽으로
            checkPersonalScore(s[0], index, choices[i]);
        }
        StringBuilder answer = new StringBuilder();
        for (Personal personal : personals) {
            System.out.println(personal.getPersonality() + " : " + personal.getPersonalScore() +  " " + personal.getReactPersonal() + " : " + personal.getReactPersonalScore());
            if(personal.getPersonalScore() > personal.reactPersonalScore) answer.append(personal.getPersonality());
            else if(personal.getPersonalScore() < personal.reactPersonalScore) answer.append(personal.getReactPersonal());
            else {
                if (personal.getPersonality().charAt(0) < personal.getReactPersonal().charAt(0)) answer.append(personal.getPersonality());
                else answer.append(personal.getReactPersonal());
            }
        }
        return answer.toString();
    }
    private void checkPersonalScore(String s, int index, int score) {
        Personal personal = personals.get(index);

        if(score>0 && score<4){
            if (s.equals(personal.getPersonality())) personal.setPersonalScore(personal.getPersonalScore() + (3 - score + 1));
            else personal.setReactPersonalScore(personal.getReactPersonalScore() + (3 - score + 1));
        }
        else if(score>4 && score<8){
            if (!s.equals(personal.getPersonality())) personal.setPersonalScore(personal.getPersonalScore() + (score - 4));
            else personal.setReactPersonalScore(personal.getReactPersonalScore() + (score - 4));
        }
    }

    private int checkIndexOfPersonals(String[] s) {
        for (int i = 0; i < personals.size(); i++) {
            String check = personals.get(i).personality;
            if (check.equals(s[0]) || check.equals(s[1])){
                return i;
            }
        }
        return -1;
    }

    private void savePersonal() {
        personals.add(new Personal("R", 0, "T", 0));
        personals.add(new Personal("C", 0, "F", 0));
        personals.add(new Personal("J", 0, "M", 0));
        personals.add(new Personal("A", 0, "N", 0));
    }
}