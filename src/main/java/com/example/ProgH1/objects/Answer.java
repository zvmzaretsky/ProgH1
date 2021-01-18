package com.example.ProgH1.objects;

public class Answer {

    private final int uid;
    private final int type;
    private final int answer;

    public Answer(int uid, int type, int answer) {
        this.uid = uid;
        this.type = type;
        this.answer = answer;
    }

    public int getUid() {
        return uid;
    }

    public int getType() {
        return type;
    }

    public int getAnswer() {
        return answer;
    }
}
