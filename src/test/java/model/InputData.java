package model;

public class InputData {
    private String NAME_INPUT_FROM_INPUT_DATA;
    private String PASSWORD_INPUT_FROM_INPUT_DATA;
    private int COMMENTS_INPUT_FROM_INPUT_DATA;
    private String FILE_DIRECTORY_FROM_INPUT_DATA;

    public InputData(String NAME_INPUT_FROM_INPUT_DATA, String PASSWORD_INPUT_FROM_INPUT_DATA, int COMMENTS_INPUT_FROM_INPUT_DATA, String FILE_DIRECTORY_FROM_INPUT_DATA) {
        this.NAME_INPUT_FROM_INPUT_DATA = NAME_INPUT_FROM_INPUT_DATA;
        this.PASSWORD_INPUT_FROM_INPUT_DATA = PASSWORD_INPUT_FROM_INPUT_DATA;
        this.COMMENTS_INPUT_FROM_INPUT_DATA = COMMENTS_INPUT_FROM_INPUT_DATA;
        this.FILE_DIRECTORY_FROM_INPUT_DATA = FILE_DIRECTORY_FROM_INPUT_DATA;
    }

    public String getNAME_INPUT_FROM_INPUT_DATA() {
        return NAME_INPUT_FROM_INPUT_DATA;
    }

    public void setNAME_INPUT_FROM_INPUT_DATA(String NAME_INPUT_FROM_INPUT_DATA) {
        this.NAME_INPUT_FROM_INPUT_DATA = NAME_INPUT_FROM_INPUT_DATA;
    }

    public String getPASSWORD_INPUT_FROM_INPUT_DATA() {
        return PASSWORD_INPUT_FROM_INPUT_DATA;
    }

    public void setPASSWORD_INPUT_FROM_INPUT_DATA(String PASSWORD_INPUT_FROM_INPUT_DATA) {
        this.PASSWORD_INPUT_FROM_INPUT_DATA = PASSWORD_INPUT_FROM_INPUT_DATA;
    }

    public int getCOMMENTS_INPUT_FROM_INPUT_DATA() {
        return COMMENTS_INPUT_FROM_INPUT_DATA;
    }

    public void setCOMMENTS_INPUT_FROM_INPUT_DATA(int COMMENTS_INPUT_FROM_INPUT_DATA) {
        this.COMMENTS_INPUT_FROM_INPUT_DATA = COMMENTS_INPUT_FROM_INPUT_DATA;
    }

    public String getFILE_DIRECTORY_FROM_INPUT_DATA() {
        return FILE_DIRECTORY_FROM_INPUT_DATA;
    }

    public void setFILE_DIRECTORY_FROM_INPUT_DATA(String FILE_DIRECTORY_FROM_INPUT_DATA) {
        this.FILE_DIRECTORY_FROM_INPUT_DATA = FILE_DIRECTORY_FROM_INPUT_DATA;
    }
}
