package modchu.model.multimodel;
	public void initModel(float f, float f1, boolean isAfterInit) {
		super.initModel(f, f1, false);
		f = f > 0.0F ? 0.3F : 0.2F;
		bipedHead = new Modchu_ModelRenderer(this, 0, 0);
		bipedHead.addBox(-4.0F, -8F, -4.0F, 8, 8, 8, f - 0.5F);
		bipedHead.setTextureOffset(35, 39).addBox(-1.5F, -1.0F, -1.2F, 3, 1, 3, f - 0.5F);//neck
		Headwear = new Modchu_ModelRenderer(this, 32, 0);
		Headwear.addBox(-4.0F, -9F, -4.0F, 8, 12, 8, f);
		if (isAfterInit) afterInit(f, f1);
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.addChild(Headwear);
		bipedHead.addChild(eyeR);
		bipedHead.addChild(eyeL);
	}
}