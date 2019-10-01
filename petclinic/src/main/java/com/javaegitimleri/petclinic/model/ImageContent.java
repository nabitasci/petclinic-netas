package com.javaegitimleri.petclinic.model;

public class ImageContent extends BaseEntity {
	private static final long serialVersionUID = 1L;
	
	private Image image;
	
	private byte[] content;
	
	ImageContent() {
	}
	
	public ImageContent(Image image) {
		super();
		this.image = image;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public byte[] getContent() {
		return content;
	}
	
	public void setContent(byte[] content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
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
		ImageContent other = (ImageContent) obj;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ImageContent [image=" + image + ", getId()=" + getId() + ", getVersion()=" + getVersion() + "]";
	}
}
