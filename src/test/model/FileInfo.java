
package test.model;

/**
 * Function description.
 *
 * @author xxxxxxx
 * @since 2019-10-24
 */
public class FileInfo {
    public String getFileDestUlr() {
        return fileDestUlr;
    }

    public void setFileDestUlr(String fileDestUlr) {
        this.fileDestUlr = fileDestUlr;
    }

    public String getImageResolution() {
        return imageResolution;
    }

    public void setImageResolution(String imageResolution) {
        this.imageResolution = imageResolution;
    }

    public String getImageResolutionSingature() {
        return imageResolutionSingature;
    }

    public void setImageResolutionSingature(String imageResolutionSingature) {
        this.imageResolutionSingature = imageResolutionSingature;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String fileDestUlr;

    private String imageResolution;

    private String imageResolutionSingature;

    private int size;

    private String fileName;
}
