package bi;

/* renamed from: bi.b0 */
/* loaded from: classes.dex */
public enum EnumC0773b0 extends java.lang.Enum<bi.EnumC0773b0> {

    /* renamed from: Z */
    public static final bi.EnumC0773b0 f4184Z = null;

    /* renamed from: a0 */
    public static final bi.EnumC0773b0 f4185a0 = null;

    /* renamed from: b0 */
    public static final bi.EnumC0773b0 f4186b0 = null;

    /* renamed from: c0 */
    public static final bi.EnumC0773b0 f4187c0 = null;

    /* renamed from: d0 */
    public static final bi.EnumC0773b0 f4188d0 = null;

    /* renamed from: e0 */
    public static final bi.EnumC0773b0 f4189e0 = null;

    /* renamed from: f0 */
    public static final /* synthetic */ bi.EnumC0773b0[] f4190f0 = null;

    /* renamed from: Y */
    public final java.lang.String f4191Y;

    static {
            r0 = 6
            bi.b0[] r0 = new bi.EnumC0773b0[r0]
            bi.b0 r1 = new bi.b0
            java.lang.String r2 = "HTTP_1_0"
            r3 = 0
            java.lang.String r4 = "http/1.0"
            r1.<init>(r2, r3, r4)
            bi.EnumC0773b0.f4184Z = r1
            r0[r3] = r1
            bi.b0 r1 = new bi.b0
            java.lang.String r2 = "HTTP_1_1"
            r3 = 1
            java.lang.String r4 = "http/1.1"
            r1.<init>(r2, r3, r4)
            bi.EnumC0773b0.f4185a0 = r1
            r0[r3] = r1
            bi.b0 r1 = new bi.b0
            java.lang.String r2 = "SPDY_3"
            r3 = 2
            java.lang.String r4 = "spdy/3.1"
            r1.<init>(r2, r3, r4)
            bi.EnumC0773b0.f4186b0 = r1
            r0[r3] = r1
            bi.b0 r1 = new bi.b0
            java.lang.String r2 = "HTTP_2"
            r3 = 3
            java.lang.String r4 = "h2"
            r1.<init>(r2, r3, r4)
            bi.EnumC0773b0.f4187c0 = r1
            r0[r3] = r1
            bi.b0 r1 = new bi.b0
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE"
            r3 = 4
            java.lang.String r4 = "h2_prior_knowledge"
            r1.<init>(r2, r3, r4)
            bi.EnumC0773b0.f4188d0 = r1
            r0[r3] = r1
            bi.b0 r1 = new bi.b0
            java.lang.String r2 = "QUIC"
            r3 = 5
            java.lang.String r4 = "quic"
            r1.<init>(r2, r3, r4)
            bi.EnumC0773b0.f4189e0 = r1
            r0[r3] = r1
            bi.EnumC0773b0.f4190f0 = r0
            return
    }

    EnumC0773b0(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f4191Y = r3
            return
    }

    public static bi.EnumC0773b0 valueOf(java.lang.String r1) {
            java.lang.Class<bi.b0> r0 = bi.EnumC0773b0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bi.b0 r1 = (bi.EnumC0773b0) r1
            return r1
    }

    public static bi.EnumC0773b0[] values() {
            bi.b0[] r0 = bi.EnumC0773b0.f4190f0
            java.lang.Object r0 = r0.clone()
            bi.b0[] r0 = (bi.EnumC0773b0[]) r0
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f4191Y
            return r0
    }
}
