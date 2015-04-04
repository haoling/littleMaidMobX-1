package modchu.model.multimodel;
import modchu.model.ModchuModel_IEntityCaps;
import modchu.model.multimodel.base.MultiModel_SR2;
	public Modchu_ModelRenderer longhear;
	public Modchu_ModelRenderer kamidome;
		this(0.0F);
	}
		this(f, 0.0F);
	}
		this(f, f1, 64, 32);
	}
		super(f, f1, i < 0 ? 64 : i, j < 0 ? 32 : j);
	}
	public void initModel(float f, float f1, boolean isAfterInit) {
		super.initModel(f, f1, false);
		longhear = new Modchu_ModelRenderer(this, 52, 12);
		longhear.addBox(-1.5F, -9F, 7F, 3, 17, 3);
		longhear.setRotationPoint(0F, 0F, 0F);
		kamidome = new Modchu_ModelRenderer(this, 46, 19);
		kamidome.addBox(-1F, -7F, 6F, 2, 2, 1);
		kamidome.setRotationPoint(0F, 0F, 0F);
		longhear.rotateAngleX = 0.2974289F;
		setCapsValue(null, caps_visible, Tail, false);
		setCapsValue(null, caps_visible, SideTailL, false);
		setCapsValue(null, caps_visible, SideTailR, false);
		setCapsValue(null, caps_visible, ChignonB, false);
		if (isAfterInit) afterInit(f, f1);
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.addChild(longhear);
		bipedHead.addChild(kamidome);
	}
	public void defaultPartsSettingBefore(ModchuModel_IEntityCaps entityCaps) {
		super.defaultPartsSettingBefore(entityCaps);
		String[] s = {
				"Tail", "SideTailL", "SideTailR", "ChignonB"
		};
		setCapsValue(entityCaps, caps_showPartsHideList, (Object) s);
	}
	public void showModelSettingReflects(ModchuModel_IEntityCaps entityCaps) {
		super.showModelSettingReflects(entityCaps);
		setCapsValue(entityCaps, caps_visible, Tail, false);
		setCapsValue(entityCaps, caps_visible, SideTailL, false);
		setCapsValue(entityCaps, caps_visible, SideTailR, false);
		setCapsValue(entityCaps, caps_visible, ChignonB, false);
	}
}