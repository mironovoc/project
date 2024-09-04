public class TextCalculate {
    String[] values;
    char action;
    String answer;
    int index;
    int multiply;
    int share;

    public String getAnswer() {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i].replace("\"", "");
        }
        if (action == '+') {
            answer = values[0] + values[1];
        }
        if (action == '*') {
            String g = "";
            multiply = Integer.parseInt(values[1]);
            for (int i = 0; i<multiply; i++) {
                g+=values[0];
            }
            answer = g;
        }
        if (action == '-') {
            index = values[0].indexOf(values[1]);
            if (index == -1) {
                answer = values[0];
            } else {
                answer = values[0].substring(0, index);
                answer += values[0].substring(index + values[1].length());
            }
        }
        if (action == '/') {
            share = values[0].length() / Integer.parseInt(values[1]);
            answer = values[0].substring(0, share);
        }
        return answer;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public void setAction(char action) {
        this.action = action;
    }


    public void ShowTime() {
        getAnswer();
        String[] s = answer.split("");

        if (s.length > 40) {
            System.out.print("\"");
            for (int i = 0; i < 40; i++) {
                System.out.print(s[i]);
            }
            System.out.print("...\"");
        } else {
            System.out.println("\"" + answer + "\"");
        }


    }
    public void Show() {
        getAnswer();
        System.out.println("\"" + answer + "\"");
    }
}