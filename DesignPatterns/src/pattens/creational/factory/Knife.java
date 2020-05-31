package pattens.creational.factory;

public class Knife {
	protected String knifeType = new String();
	private boolean sharpenned = false;
	private boolean polished = false;
	private boolean packaged = false;	
	
	public Knife(String knifeType) {
		this.setKnifeType(knifeType);
	}
	
	public void sharpenKnife() {
		this.setSharpenned(true);
	}
	
	public void polishKnife() {
		this.setPolished(true);
	}
	
	public void packageKnife() {
		this.setPackaged(true);
	}

	public String getKnifeType() {
		return knifeType;
	}

	public void setKnifeType(String knifeType) {
		this.knifeType = knifeType;
	}

	public boolean isSharpenned() {
		return sharpenned;
	}

	public void setSharpenned(boolean sharpenned) {
		this.sharpenned = sharpenned;
	}

	public boolean isPolished() {
		return polished;
	}

	public void setPolished(boolean polished) {
		this.polished = polished;
	}

	public boolean isPackaged() {
		return packaged;
	}

	public void setPackaged(boolean packaged) {
		this.packaged = packaged;
	}
	
	
}
