package mms.pojo;

public class Doctor {
    private int dotid;

    private String doto;

    private String dotname;

    private  String dotsex;

    private  String dotphone;

    private String dotpro;

    public Doctor() {
    }

    public Doctor(int dotid, String doto, String dotname, String dotsex, String dotphone, String dotpro) {
        this.dotid = dotid;
        this.doto = doto;
        this.dotname = dotname;
        this.dotsex = dotsex;
        this.dotphone = dotphone;
        this.dotpro = dotpro;
    }

    public int getDotid() {
        return dotid;
    }

    public void setDotid(int dotid) {
        this.dotid = dotid;
    }

    public String getDoto() {
        return doto;
    }

    public void setDoto(String doto) {
        this.doto = doto;
    }

    public String getDotname() {
        return dotname;
    }

    public void setDotname(String dotname) {
        this.dotname = dotname;
    }

    public String getDotsex() {
        return dotsex;
    }

    public void setDotsex(String dotsex) {
        this.dotsex = dotsex;
    }

    public String getDotphone() {
        return dotphone;
    }

    public void setDotphone(String dotphone) {
        this.dotphone = dotphone;
    }

    public String getDotpro() {
        return dotpro;
    }

    public void setDotpro(String dotpro) {
        this.dotpro = dotpro;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "dotid=" + dotid +
                ", doto='" + doto + '\'' +
                ", dotname='" + dotname + '\'' +
                ", dotsex='" + dotsex + '\'' +
                ", dotphone='" + dotphone + '\'' +
                ", dotpro='" + dotpro + '\'' +
                '}';
    }
}
