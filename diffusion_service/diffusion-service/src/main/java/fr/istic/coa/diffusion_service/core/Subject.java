package fr.istic.coa.diffusion_service.core;

public interface Subject {
	public void attach(Oberver<Subject> o);

	public void detach(Oberver<Subject> o);
}
