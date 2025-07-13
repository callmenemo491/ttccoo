package p181k3;

/* renamed from: k3.a */
/* loaded from: classes.dex */
public abstract class AbstractC3677a extends p181k3.AbstractC3678b {

    /* renamed from: f */
    public p215m3.AbstractC4351c f16251f;

    /* renamed from: g */
    public int f16252g;

    /* renamed from: h */
    public float f16253h;

    /* renamed from: i */
    public int f16254i;

    /* renamed from: j */
    public float f16255j;

    /* renamed from: k */
    public float[] f16256k;

    /* renamed from: l */
    public int f16257l;

    /* renamed from: m */
    public int f16258m;

    /* renamed from: n */
    public int f16259n;

    /* renamed from: o */
    public float f16260o;

    /* renamed from: p */
    public boolean f16261p;

    /* renamed from: q */
    public boolean f16262q;

    /* renamed from: r */
    public boolean f16263r;

    /* renamed from: s */
    public java.util.List<p181k3.C3683g> f16264s;

    /* renamed from: t */
    public boolean f16265t;

    /* renamed from: u */
    public float f16266u;

    /* renamed from: v */
    public float f16267v;

    /* renamed from: w */
    public float f16268w;

    /* renamed from: x */
    public float f16269x;

    /* renamed from: y */
    public float f16270y;

    public AbstractC3677a() {
            r2 = this;
            r2.<init>()
            r0 = -7829368(0xffffffffff888888, float:NaN)
            r2.f16252g = r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.f16253h = r1
            r2.f16254i = r0
            r2.f16255j = r1
            r0 = 0
            float[] r0 = new float[r0]
            r2.f16256k = r0
            r0 = 6
            r2.f16259n = r0
            r2.f16260o = r1
            r0 = 1
            r2.f16261p = r0
            r2.f16262q = r0
            r2.f16263r = r0
            r2.f16265t = r0
            r0 = 0
            r2.f16266u = r0
            r2.f16267v = r0
            r2.f16268w = r0
            r2.f16269x = r0
            r2.f16270y = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            r2.f16274d = r0
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = p323s3.AbstractC5952f.m12377d(r0)
            r2.f16272b = r1
            float r0 = p323s3.AbstractC5952f.m12377d(r0)
            r2.f16273c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f16264s = r0
            return
    }

    /* renamed from: a */
    public void mo8135a(float r3, float r4) {
            r2 = this;
            float r0 = r2.f16266u
            float r3 = r3 - r0
            float r0 = r2.f16267v
            float r4 = r4 + r0
            float r0 = r4 - r3
            float r0 = java.lang.Math.abs(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 + r0
            float r3 = r3 - r0
        L15:
            r2.f16269x = r3
            r2.f16268w = r4
            float r4 = r4 - r3
            float r3 = java.lang.Math.abs(r4)
            r2.f16270y = r3
            return
    }

    /* renamed from: b */
    public java.lang.String m8136b(int r3) {
            r2 = this;
            if (r3 < 0) goto L15
            float[] r0 = r2.f16256k
            int r0 = r0.length
            if (r3 < r0) goto L8
            goto L15
        L8:
            m3.c r0 = r2.m8138d()
            float[] r1 = r2.f16256k
            r3 = r1[r3]
            java.lang.String r3 = r0.mo9734a(r3)
            return r3
        L15:
            java.lang.String r3 = ""
            return r3
    }

    /* renamed from: c */
    public java.lang.String m8137c() {
            r5 = this;
            java.lang.String r0 = ""
            r1 = 0
        L3:
            float[] r2 = r5.f16256k
            int r2 = r2.length
            if (r1 >= r2) goto L1c
            java.lang.String r2 = r5.m8136b(r1)
            if (r2 == 0) goto L19
            int r3 = r0.length()
            int r4 = r2.length()
            if (r3 >= r4) goto L19
            r0 = r2
        L19:
            int r1 = r1 + 1
            goto L3
        L1c:
            return r0
    }

    /* renamed from: d */
    public p215m3.AbstractC4351c m8138d() {
            r2 = this;
            m3.c r0 = r2.f16251f
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof p215m3.C4349a
            if (r1 == 0) goto L19
            m3.a r0 = (p215m3.C4349a) r0
            int r0 = r0.f17837b
            int r1 = r2.f16258m
            if (r0 == r1) goto L19
        L10:
            m3.a r0 = new m3.a
            int r1 = r2.f16258m
            r0.<init>(r1)
            r2.f16251f = r0
        L19:
            m3.c r0 = r2.f16251f
            return r0
    }
}
