package Application.Domain;

public class Keplerian {
    private int a;
    private int e;
    private int i;
    private int raan;
    private int pa;
    private int anomaly;
    private String positionAngle;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getRaan() {
        return raan;
    }

    public void setRaan(int raan) {
        this.raan = raan;
    }

    public int getPa() {
        return pa;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public int getAnomaly() {
        return anomaly;
    }

    public void setAnomaly(int anomaly) {
        this.anomaly = anomaly;
    }

    public String getPositionAngle() {
        return positionAngle;
    }

    public void setPositionAngle(String positionAngle) {
        this.positionAngle = positionAngle;
    }
}
