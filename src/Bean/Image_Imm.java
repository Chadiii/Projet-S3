package Bean;

public class Image_Imm {
private int id_image;
private String filename;
private String path;
private int code_imm;

public Image_Imm() {
	super();
	
}

public Image_Imm(int id_image, String filename, String path, int code_imm) {
	super();
	this.id_image = id_image;
	this.filename = filename;
	this.path = path;
	this.code_imm = code_imm;
}

public int getId_image() {
	return id_image;
}

public void setId_image(int id_image) {
	this.id_image = id_image;
}

public String getFilename() {
	return filename;
}

public void setFilename(String filename) {
	this.filename = filename;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public int getCode_imm() {
	return code_imm;
}

public void setCode_imm(int code_imm) {
	this.code_imm = code_imm;
}


}
