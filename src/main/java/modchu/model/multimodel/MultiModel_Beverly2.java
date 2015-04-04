package modchu.model.multimodel;
	public void initModel(float f, float f1, boolean isAfterInit) {
		super.initModel(f, f1, false);
		eyeR = new Modchu_ModelRenderer(this);
		eyeL = new Modchu_ModelRenderer(this);
		shield = new Modchu_ModelRenderer(this);
		if (isAfterInit) afterInit(f, f1);
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.removeChild(eyeR);
		bipedHead.removeChild(eyeL);
		leftArm2.removeChild(shield);
	}
}