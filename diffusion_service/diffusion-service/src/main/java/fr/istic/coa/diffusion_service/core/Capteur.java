package fr.istic.coa.diffusion_service.core;

public interface Capteur extends Subject {
	public int getValue();

	public void tick();
}
