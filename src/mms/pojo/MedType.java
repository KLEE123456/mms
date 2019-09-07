package mms.pojo;

/**
 *药品类别类
 */
public class MedType {
    private int mdtypeid;

    private String mdo;

    private String mdname;

    public MedType() {
    }

    public MedType(int mdtypeid, String mdo, String mdname) {
        this.mdtypeid = mdtypeid;
        this.mdo = mdo;
        this.mdname = mdname;
    }

    public int getMdtypeid() {
        return mdtypeid;
    }

    public void setMdtypeid(int mdtypeid) {
        this.mdtypeid = mdtypeid;
    }

    public String getMdo() {
        return mdo;
    }

    public void setMdo(String mdo) {
        this.mdo = mdo;
    }

    public String getMdname() {
        return mdname;
    }

    public void setMdname(String mdname) {
        this.mdname = mdname;
    }

    @Override
    public String toString() {
        return "MedType{" +
                "mdtypeid=" + mdtypeid +
                ", mdo='" + mdo + '\'' +
                ", mdname='" + mdname + '\'' +
                '}';
    }
}
