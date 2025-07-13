package p255od;

/* renamed from: od.v0 */
/* loaded from: classes.dex */
public enum EnumC5234v0 extends java.lang.Enum<p255od.EnumC5234v0> {
    private static final /* synthetic */ p255od.EnumC5234v0[] $VALUES = null;
    public static final p255od.EnumC5234v0 ANCHOR = null;
    public static final p255od.EnumC5234v0 WAX_CLOUD_WALLET = null;

    private static final /* synthetic */ p255od.EnumC5234v0[] $values() {
            r0 = 2
            od.v0[] r0 = new p255od.EnumC5234v0[r0]
            od.v0 r1 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
            r2 = 0
            r0[r2] = r1
            od.v0 r1 = p255od.EnumC5234v0.ANCHOR
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            od.v0 r0 = new od.v0
            java.lang.String r1 = "WAX_CLOUD_WALLET"
            r2 = 0
            r0.<init>(r1, r2)
            p255od.EnumC5234v0.WAX_CLOUD_WALLET = r0
            od.v0 r0 = new od.v0
            java.lang.String r1 = "ANCHOR"
            r2 = 1
            r0.<init>(r1, r2)
            p255od.EnumC5234v0.ANCHOR = r0
            od.v0[] r0 = $values()
            p255od.EnumC5234v0.$VALUES = r0
            return
    }

    EnumC5234v0(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p255od.EnumC5234v0 valueOf(java.lang.String r1) {
            java.lang.Class<od.v0> r0 = p255od.EnumC5234v0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            od.v0 r1 = (p255od.EnumC5234v0) r1
            return r1
    }

    public static p255od.EnumC5234v0[] values() {
            od.v0[] r0 = p255od.EnumC5234v0.$VALUES
            java.lang.Object r0 = r0.clone()
            od.v0[] r0 = (p255od.EnumC5234v0[]) r0
            return r0
    }
}
