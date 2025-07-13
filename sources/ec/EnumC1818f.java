package ec;

/* renamed from: ec.f */
/* loaded from: classes.dex */
public enum EnumC1818f extends java.lang.Enum<ec.EnumC1818f> {

    /* renamed from: Y */
    public static final ec.EnumC1818f f7946Y = null;

    /* renamed from: Z */
    public static final ec.EnumC1818f f7947Z = null;

    /* renamed from: a0 */
    public static final ec.EnumC1818f f7948a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ ec.EnumC1818f[] f7949b0 = null;

    static {
            ec.f r0 = new ec.f
            java.lang.String r1 = "FORCE_NONE"
            r2 = 0
            r0.<init>(r1, r2)
            ec.EnumC1818f.f7946Y = r0
            ec.f r1 = new ec.f
            java.lang.String r3 = "FORCE_SQUARE"
            r4 = 1
            r1.<init>(r3, r4)
            ec.EnumC1818f.f7947Z = r1
            ec.f r3 = new ec.f
            java.lang.String r5 = "FORCE_RECTANGLE"
            r6 = 2
            r3.<init>(r5, r6)
            ec.EnumC1818f.f7948a0 = r3
            r5 = 3
            ec.f[] r5 = new ec.EnumC1818f[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            ec.EnumC1818f.f7949b0 = r5
            return
    }

    EnumC1818f(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static ec.EnumC1818f valueOf(java.lang.String r1) {
            java.lang.Class<ec.f> r0 = ec.EnumC1818f.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ec.f r1 = (ec.EnumC1818f) r1
            return r1
    }

    public static ec.EnumC1818f[] values() {
            ec.f[] r0 = ec.EnumC1818f.f7949b0
            java.lang.Object r0 = r0.clone()
            ec.f[] r0 = (ec.EnumC1818f[]) r0
            return r0
    }
}
