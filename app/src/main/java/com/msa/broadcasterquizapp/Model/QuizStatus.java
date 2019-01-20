package com.msa.broadcasterquizapp.Model;

public class QuizStatus {
    private String live,showques,curques,video;

    public QuizStatus() {
    }

    public QuizStatus(String live, String showques, String curques, String video) {
        this.live = live;
        this.showques = showques;
        this.curques = curques;
        this.video = video;
    }

    public String getLive() {
        return live;
    }

    public String getShowques() {
        return showques;
    }

    public String getCurques() {
        return curques;
    }

    public String getVideo(){ return video; }
}
