package fr.istic.coa.diffusion_service.core;

public class Canal implements OberserverDeCapteur, Capteur {

	private Capteur capteur;
	private OberserverDeCapteur afficheur;

	public Capteur getCapteur() {
		return capteur;
	}

	public void setCapteur(Capteur capteur) {
		this.capteur = capteur;
	}

	public OberserverDeCapteur getAfficheur() {
		return afficheur;
	}

	public void setAfficheur(OberserverDeCapteur afficheur) {
		this.afficheur = afficheur;
	}

	@Override
	public void update(Capteur subject) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attach(Oberver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void detach(Oberver o) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub

	}

}
