package fr.istic.coa.diffusion_service.core;

public interface Oberver<T> {
	public void update(T subject);
}
