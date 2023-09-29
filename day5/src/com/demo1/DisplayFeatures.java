package com.demo1;

import java.util.Optional;

public class DisplayFeatures 
{
	private int size;
	private Optional<Screenresol> resol;
	private Optional<Camera> camera;
	
	public DisplayFeatures(int size, Optional<Screenresol> resol,Optional<Camera> camera) {
		super();
		this.size = size;
		this.resol = resol;
		this.camera=camera;
	}

	public Optional<Camera> getCamera() {
		return camera;
	}

	public void setCamera(Optional<Camera> camera) {
		this.camera = camera;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Optional<Screenresol> getResol() {
		return resol;
	}

	public void setResol(Optional<Screenresol> resol) {
		this.resol = resol;
	}
	
	
	

}
