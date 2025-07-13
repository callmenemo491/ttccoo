package ge;

/* renamed from: ge.a */
/* loaded from: classes.dex */
public enum EnumC2328a extends java.lang.Enum<ge.EnumC2328a> {

    /* renamed from: Y */
    public static final ge.EnumC2328a f10580Y = null;

    /* renamed from: Z */
    public static final ge.EnumC2328a f10581Z = null;

    /* renamed from: a0 */
    public static final ge.EnumC2328a f10582a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ ge.EnumC2328a[] f10583b0 = null;

    static {
            ge.a r0 = new ge.a
            java.lang.String r1 = "RAM"
            r2 = 0
            r0.<init>(r1, r2)
            ge.EnumC2328a.f10580Y = r0
            ge.a r1 = new ge.a
            java.lang.String r3 = "CPU"
            r4 = 1
            r1.<init>(r3, r4)
            ge.EnumC2328a.f10581Z = r1
            ge.a r3 = new ge.a
            java.lang.String r5 = "NET"
            r6 = 2
            r3.<init>(r5, r6)
            ge.EnumC2328a.f10582a0 = r3
            r5 = 3
            ge.a[] r5 = new ge.EnumC2328a[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            ge.EnumC2328a.f10583b0 = r5
            return
    }

    EnumC2328a(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static ge.EnumC2328a valueOf(java.lang.String r1) {
            java.lang.Class<ge.a> r0 = ge.EnumC2328a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ge.a r1 = (ge.EnumC2328a) r1
            return r1
    }

    public static ge.EnumC2328a[] values() {
            ge.a[] r0 = ge.EnumC2328a.f10583b0
            java.lang.Object r0 = r0.clone()
            ge.a[] r0 = (ge.EnumC2328a[]) r0
            return r0
    }
}
