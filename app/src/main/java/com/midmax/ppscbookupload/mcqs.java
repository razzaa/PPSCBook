package com.midmax.ppscbookupload;

public class mcqs {
    String Statment,A,B,C,D,Answer,ChapterName,ID;

    public mcqs() {
    }

    public String getStatment() {
        return Statment;
    }

    public void setStatment(String statment) {
        Statment = statment;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return C;
    }

    public void setC(String c) {
        C = c;
    }

    public String getD() {
        return D;
    }

    public void setD(String d) {
        D = d;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getChapterName() {
        return ChapterName;
    }

    public void setChapterName(String chapterName) {
        ChapterName = chapterName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "mcqs{" +
                "Statment='" + Statment + '\'' +
                ", A='" + A + '\'' +
                ", B='" + B + '\'' +
                ", C='" + C + '\'' +
                ", D='" + D + '\'' +
                ", Answer='" + Answer + '\'' +
                ", ChapterName='" + ChapterName + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
