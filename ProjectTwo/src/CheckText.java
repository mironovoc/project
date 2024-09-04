public class CheckText {
    String example;
    String[] data;
    char action;

    public void setExample(String example) {
        this.example = example;
    }

    public char getAction() throws Exception {
        if (example.contains(" + ")) {
            action = '+';
        } else if (example.contains(" - ")) {
            action = '-';
        } else if (example.contains(" * ")) {
            action = '*';
        } else if (example.contains(" / ")) {
            action = '/';
        } else {
            throw new Exception("Некорректный знак действия");
        }
        return action;
    }


    public String[] getValues(){
        if (example.contains(" + ")) {
            data = example.split(" \\+ ");
        }
        if (example.contains(" - ")) {
            data = example.split(" - ");
        }
        if (example.contains(" * ")) {
            data = example.split(" \\* ");
        }
        if (example.contains(" / ")) {
            data = example.split(" / ");
        }
        return data;
    }
}