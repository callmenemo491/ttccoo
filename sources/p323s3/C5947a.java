package p323s3;

/* renamed from: s3.a */
/* loaded from: classes.dex */
public final class C5947a extends p323s3.C5950d.a {

    /* renamed from: d */
    public static p323s3.C5950d<p323s3.C5947a> f22831d;

    /* renamed from: b */
    public float f22832b;

    /* renamed from: c */
    public float f22833c;

    static {
            s3.a r0 = new s3.a
            r1 = 0
            r0.<init>(r1, r1)
            r1 = 256(0x100, float:3.59E-43)
            s3.d r0 = p323s3.C5950d.m12361a(r1, r0)
            p323s3.C5947a.f22831d = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.m12365e(r1)
            return
    }

    public C5947a() {
            r0 = this;
            r0.<init>()
            return
    }

    public C5947a(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f22832b = r1
            r0.f22833c = r2
            return
    }

    /* renamed from: b */
    public static p323s3.C5947a m12356b(float r1, float r2) {
            s3.d<s3.a> r0 = p323s3.C5947a.f22831d
            s3.d$a r0 = r0.m12362b()
            s3.a r0 = (p323s3.C5947a) r0
            r0.f22832b = r1
            r0.f22833c = r2
            return r0
    }

    @Override // p323s3.C5950d.a
    /* renamed from: a */
    public p323s3.C5950d.a mo12357a() {
            r2 = this;
            s3.a r0 = new s3.a
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r4 != r5) goto L8
            return r1
        L8:
            boolean r2 = r5 instanceof p323s3.C5947a
            if (r2 == 0) goto L1f
            s3.a r5 = (p323s3.C5947a) r5
            float r2 = r4.f22832b
            float r3 = r5.f22832b
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L1f
            float r2 = r4.f22833c
            float r5 = r5.f22833c
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L1f
            r0 = 1
        L1f:
            return r0
    }

    public int hashCode() {
            r2 = this;
            float r0 = r2.f22832b
            int r0 = java.lang.Float.floatToIntBits(r0)
            float r1 = r2.f22833c
            int r1 = java.lang.Float.floatToIntBits(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.f22832b
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            float r1 = r2.f22833c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
