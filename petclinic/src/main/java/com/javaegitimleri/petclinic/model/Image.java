package com.javaegitimleri.petclinic.model;

public class Image extends BaseEntity {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String filePath;
	
	private int width;
	
	private int height;
	
	private ImageContent imageContent;
	
	Image() {
	}
	
	public Image(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filename) {
		this.filePath = filename;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public ImageContent getImageContent() {
		return imageContent;
	}
	public void setImageContent(ImageContent imageContent) {
		this.imageContent = imageContent;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Image [name=" + name + ", filePath=" + filePath + ", width=" + width + ", height=" + height
				+ ", getId()=" + getId() + ", getVersion()=" + getVersion() + "]";
	}
}
