package Application.Domain;

public class OrbitBulletin {
    private String date;
    private String timeScale;
    private String eciFrameName;

    private Cartesian cartesian;
    private Keplerian keplerian;
    private Equinoctial equinoctial;
    private Circular circular;

    private String toType;
    private String positionAngleOut;
    private int mu;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimeScale() {
        return timeScale;
    }

    public void setTimeScale(String timeScale) {
        this.timeScale = timeScale;
    }

    public String getEciFrameName() {
        return eciFrameName;
    }

    public void setEciFrameName(String eciFrameName) {
        this.eciFrameName = eciFrameName;
    }

    public Cartesian getCartesian() {
        return cartesian;
    }

    public void setCartesian(Cartesian cartesian) {
        this.cartesian = cartesian;
    }

    public Keplerian getKeplerian() {
        return keplerian;
    }

    public void setKeplerian(Keplerian keplerian) {
        this.keplerian = keplerian;
    }

    public Equinoctial getEquinoctial() {
        return equinoctial;
    }

    public void setEquinoctial(Equinoctial equinoctial) {
        this.equinoctial = equinoctial;
    }

    public Circular getCircular() {
        return circular;
    }

    public void setCircular(Circular circular) {
        this.circular = circular;
    }

    public String getToType() {
        return toType;
    }

    public void setToType(String toType) {
        this.toType = toType;
    }

    public String getPositionAngleOut() {
        return positionAngleOut;
    }

    public void setPositionAngleOut(String positionAngleOut) {
        this.positionAngleOut = positionAngleOut;
    }

    public int getMu() {
        return mu;
    }

    public void setMu(int mu) {
        this.mu = mu;
    }
}
