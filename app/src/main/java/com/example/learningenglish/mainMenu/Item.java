package com.example.learningenglish.mainMenu;

public class Item {
    private String lessonNum;
    private String lessonName;
    private boolean lessonFin;

    public Item(String lessonNum, String lessonName, boolean lessonFin) {
        this.lessonNum = lessonNum;
        this.lessonName = lessonName;
        this.lessonFin = lessonFin;
    }

    public boolean isLessonFin() {
        return lessonFin;
    }

    public void setLessonFin(boolean lessonFin) {
        this.lessonFin = lessonFin;
    }

    public String getLessonNum() {
        return lessonNum;
    }

    public void setLessonNum(String lessonNum) {
        this.lessonNum = lessonNum;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }
}
