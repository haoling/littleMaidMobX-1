package modchu.model.multimodel.base;
	public Modchu_ModelRenderer bipedJacket;
	public Modchu_ModelRenderer bipedRightSleeve;
	public Modchu_ModelRenderer bipedLeftSleeve;
	public Modchu_ModelRenderer bipedRightPants;
	public Modchu_ModelRenderer bipedLeftPants;
	public boolean slimFlag;
		this(0.0F);
	}
		this(0.0F, o);
	}
		this(f, 0.0F);
	}
		this(f, 0.0F, o);
	}
		this(f, f1, 64, f == 0.0F ? 64 : 64);
	}
		this(f, f1, 64, f == 0.0F ? 64 : 64, o);
	}
		super(f, f1, i < 0 ? 64 : i, j < 0 ? 64 : j);
	}
		super(f, f1, i < 0 ? 64 : i, j < 0 ? 64 : j, o);
	}
	public void initModel(float f, float f1, Object... o) {
		initModel(f, f1, true, (Object[]) o);
	}
	public void initModel(float f, float f1, boolean isAfterInit, Object... o) {
		slimFlag = o != null
		if (slimFlag) {
			bipedLeftArm = new Modchu_ModelRenderer(this, 32, 48);
			bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, f);
			bipedLeftArm.setRotationPoint(3.0F, 0.0F, 0.0F);
			bipedRightArm = new Modchu_ModelRenderer(this, 40, 16);
			bipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, f);
			bipedRightArm.setRotationPoint(-3.0F, 0.0F, 0.0F);
		}
		if (f == 0.0F) {
			bipedJacket = new Modchu_ModelRenderer(this, 16, 32);
			bipedJacket.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, f + 0.49F);
			if (slimFlag) {
				bipedRightSleeve = new Modchu_ModelRenderer(this, 40, 32);
				bipedRightSleeve.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, f + 0.249F);
				bipedLeftSleeve = new Modchu_ModelRenderer(this, 48, 48);
				bipedLeftSleeve.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, f + 0.249F);
			} else {
				bipedRightSleeve = new Modchu_ModelRenderer(this, 40, 32);
				bipedRightSleeve.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, f + 0.49F);
				bipedLeftSleeve = new Modchu_ModelRenderer(this, 48, 48);
				bipedLeftSleeve.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, f + 0.49F);
			}
			bipedRightPants = new Modchu_ModelRenderer(this, 0, 32);
			bipedRightPants.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, f + 0.49F);
			bipedLeftPants = new Modchu_ModelRenderer(this, 0, 48);
			bipedLeftPants.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, f + 0.49F);
		}
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		if (modelSize != 0.0F) return;
			if (bipedJacket != null) bipedBody.addChild(bipedJacket);
		}
		if (bipedRightSleeve != null) bipedRightArm.addChild(bipedRightSleeve);
		if (bipedLeftSleeve != null) bipedLeftArm.addChild(bipedLeftSleeve);
		if (bipedRightPants != null) bipedRightLeg.addChild(bipedRightPants);
		if (bipedLeftPants != null) bipedLeftLeg.addChild(bipedLeftPants);
	}
	public void actionPartsAddChild() {
		if (modelSize != 0.0F) return;
	public void actionRelease(ModchuModel_IEntityCaps entityCaps, int i) {
		super.actionRelease(entityCaps, i);
		if (modelSize != 0.0F) return;
	public void defaultPartsSettingBefore(ModchuModel_IEntityCaps entityCaps) {
		String[] s = {
				"rightArm", "rightArm2", "rightArmPlus", "rightArmPlus2", "rightHand",
				"rightLeg", "rightLeg2", "rightLegPlus", "rightLegPlus2", "leftArm",
				"leftArm2", "leftArmPlus", "leftArmPlus2", "leftHand", "leftLeg",
				"leftLeg2", "leftLegPlus", "leftLegPlus2", "HeadMount", "mainFrame"
		};
		setCapsValue(entityCaps, caps_showPartsHideList, (Object) s);
		String[] s1 = {
				"bipedHead", "bipedHeadwear", "bipedBody", "bipedRightArm", "bipedLeftArm",
				"bipedRightLeg", "bipedLeftLeg", "bipedJacket", "bipedRightSleeve", "bipedLeftSleeve",
				"bipedRightPants", "bipedLeftPants", "c", "d", "e",
				"f", "g", "h", "i", "j",
				"k", "field_78116_c", "field_78114_d", "field_78115_e", "field_78112_f",
				"field_78113_g", "field_78123_h", "field_78124_i", "field_78121_j", "field_78122_k"
		};
		String[] s2 = {
				"Head", "Headwear", "Body", "RightArm", "LeftArm",
				"RightLeg", "LeftLeg", "Jacket", "RightSleeve", "LeftSleeve",
				"RightPants", "LeftPants", "Head", "Headwear", "Body",
				"RightArm", "LeftArm", "RightLeg", "LeftLeg", "bipedCloak",
				"bipedEars", "bipedHead", "Headwear", "Body", "RightArm",
				"LeftArm", "RightLeg", "LeftLeg", "bipedEars", "bipedCloak"
		};
		setCapsValue(entityCaps, caps_showPartsRenemeMap, s1, s2);
	}
