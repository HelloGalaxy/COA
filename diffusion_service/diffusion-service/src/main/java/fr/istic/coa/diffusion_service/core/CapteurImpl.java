package fr.istic.coa.diffusion_service.core;

public class CapteurImpl implements Capteur {

	private AlgoDiffusion algoDiffusion;

	public AlgoDiffusion getAlgoDiffusion() {
		return algoDiffusion;
	}

	public void setAlgoDiffusion(AlgoDiffusion algoDiffusion) {
		this.algoDiffusion = algoDiffusion;
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
