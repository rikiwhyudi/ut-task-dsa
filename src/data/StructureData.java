package data;

public class StructureData {
    private int strukurBaris;
    private String kataBaru;

    public StructureData(int strukurBaris, String kataBaru) {
        this.strukurBaris = strukurBaris;
        this.kataBaru = kataBaru;
    }
    public int getStrukurBaris() {
        return strukurBaris;
    }

    public String getKataBaru() {
        return kataBaru;
    }
}
