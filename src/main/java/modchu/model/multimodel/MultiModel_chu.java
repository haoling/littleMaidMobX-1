package modchu.model.multimodel;
import modchu.lib.characteristic.Modchu_ModelRenderer;
import modchu.model.ModchuModel_IEntityCaps;
	public Modchu_ModelRenderer CatER;
	public Modchu_ModelRenderer CatTail;
	public Modchu_ModelRenderer Prim;
	{
		this(0.0F);
	}
	{
		this(f, 0.0F);
	}
	{
		this(f, f1 , 64, 32);
	}
		super(f, f1, i < 0 ? 64 : i, j < 0 ? 32 : j);
	}
	public void initModel(float f, float f1, boolean isAfterInit) {
		super.initModel(f, f1, false);
		CatEL = new Modchu_ModelRenderer(this, 0, 4);
		CatEL.addBox(1.0F, -11F, -2F, 3, 3, 1, f);
		CatEL.setRotationPoint(0.0F, 0.0F, 0.0F);
		CatER = new Modchu_ModelRenderer(this, 0, 0);
		CatER.addBox(-4F, -11F, -2F, 3, 3, 1, f);
		CatER.setRotationPoint(0.0F, 0.0F, 0.0F);
		CatTail = new Modchu_ModelRenderer(this, 0, 16);
		CatTail.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 1, f);
		CatTail.setRotationPoint(0.0F, 3F, 0.0F);
		Prim = new Modchu_ModelRenderer(this, 24, 16);
		Prim.addBox(-2F, -8.7F, -3.5F, 4, 1, 0, f);
		Prim.setRotationPoint(0.0F, 0.0F, 0.0F);
		CatTail.setRotationPointZ(2.0F);
		CatTail.setRotateAngleX(-4.363323F);
		if (isAfterInit) afterInit(f, f1);
	}
	public void defaultAddChildSetting() {
		super.defaultAddChildSetting();
		bipedHead.addChild(CatEL);
		bipedHead.addChild(CatER);
		bipedHead.addChild(Prim);
		bipedBody.addChild(CatTail);
	}
		super.setRotationAnglesLM(f, f1, f2, f3, f4, f5, entityCaps);
		CatTail.setRotateAngleX(mh_sin(f * 0.6662F) * 0.5F - 4.363323F);
			CatTail.setRotateAngleY(((Modchu_ModelRenderer) bipedBody).getRotateAngleY());
		}
			CatTail.setRotateAngleX(CatTail.getRotateAngleX() + 0.2F);
		}
			CatTail.setRotateAngleX(mh_sin(f2 * 0.6662F) * 0.1F - 4.363323F);
		}
	}
	public String getUsingTexture() {
		return null;
	}
}