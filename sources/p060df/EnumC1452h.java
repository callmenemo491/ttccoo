package p060df;

/* renamed from: df.h */
/* loaded from: classes.dex */
public enum EnumC1452h extends java.lang.Enum<p060df.EnumC1452h> {

    /* renamed from: Z */
    public static final p060df.EnumC1452h f7192Z = null;

    /* renamed from: a0 */
    public static final p060df.EnumC1452h f7193a0 = null;

    /* renamed from: b0 */
    public static final p060df.EnumC1452h f7194b0 = null;

    /* renamed from: c0 */
    public static final /* synthetic */ p060df.EnumC1452h[] f7195c0 = null;

    /* renamed from: Y */
    public final java.lang.String f7196Y;

    static {
            df.h r0 = new df.h
            java.lang.String r1 = "LOCOMOTIVE"
            r2 = 0
            java.lang.String r3 = "locomotive"
            r0.<init>(r1, r2, r3)
            p060df.EnumC1452h.f7192Z = r0
            df.h r1 = new df.h
            java.lang.String r3 = "CONDUCTOR"
            r4 = 1
            java.lang.String r5 = "conductor"
            r1.<init>(r3, r4, r5)
            p060df.EnumC1452h.f7193a0 = r1
            df.h r3 = new df.h
            java.lang.String r5 = "RAILCAR"
            r6 = 2
            java.lang.String r7 = "railcar"
            r3.<init>(r5, r6, r7)
            p060df.EnumC1452h.f7194b0 = r3
            r5 = 3
            df.h[] r5 = new p060df.EnumC1452h[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            p060df.EnumC1452h.f7195c0 = r5
            return
    }

    EnumC1452h(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f7196Y = r3
            return
    }

    public static p060df.EnumC1452h valueOf(java.lang.String r1) {
            java.lang.Class<df.h> r0 = p060df.EnumC1452h.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            df.h r1 = (p060df.EnumC1452h) r1
            return r1
    }

    public static p060df.EnumC1452h[] values() {
            df.h[] r0 = p060df.EnumC1452h.f7195c0
            java.lang.Object r0 = r0.clone()
            df.h[] r0 = (p060df.EnumC1452h[]) r0
            return r0
    }
}
