package p366v0;

/* renamed from: v0.e */
/* loaded from: classes.dex */
public final class C6486e {

    /* renamed from: a */
    public double f25153a;

    /* renamed from: b */
    public double f25154b;

    /* renamed from: c */
    public boolean f25155c;

    /* renamed from: d */
    public double f25156d;

    /* renamed from: e */
    public double f25157e;

    /* renamed from: f */
    public double f25158f;

    /* renamed from: g */
    public double f25159g;

    /* renamed from: h */
    public double f25160h;

    /* renamed from: i */
    public double f25161i;

    /* renamed from: j */
    public final p366v0.AbstractC6483b.h f25162j;

    public C6486e() {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.f25153a = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.f25154b = r0
            r0 = 0
            r2.f25155c = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.f25161i = r0
            v0.b$h r0 = new v0.b$h
            r0.<init>()
            r2.f25162j = r0
            return
    }

    public C6486e(float r3) {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.f25153a = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.f25154b = r0
            r0 = 0
            r2.f25155c = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.f25161i = r0
            v0.b$h r0 = new v0.b$h
            r0.<init>()
            r2.f25162j = r0
            double r0 = (double) r3
            r2.f25161i = r0
            return
    }

    /* renamed from: a */
    public p366v0.C6486e m13174a(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            double r0 = (double) r3
            double r0 = java.lang.Math.sqrt(r0)
            r2.f25153a = r0
            r3 = 0
            r2.f25155c = r3
            return r2
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Spring stiffness constant must be positive."
            r3.<init>(r0)
            throw r3
    }

    /* renamed from: b */
    public p366v0.AbstractC6483b.h m13175b(double r17, double r19, long r21) {
            r16 = this;
            r0 = r16
            boolean r1 = r0.f25155c
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto L9
            goto L5a
        L9:
            double r4 = r0.f25161i
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L157
            double r4 = r0.f25154b
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3f
            double r6 = -r4
            double r8 = r0.f25153a
            double r6 = r6 * r8
            double r4 = r4 * r4
            double r4 = r4 - r2
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r8
            double r4 = r4 + r6
            r0.f25158f = r4
            double r4 = r0.f25154b
            double r6 = -r4
            double r8 = r0.f25153a
            double r6 = r6 * r8
            double r4 = r4 * r4
            double r4 = r4 - r2
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r8
            double r6 = r6 - r4
            r0.f25159g = r6
            goto L57
        L3f:
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L57
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L57
            double r6 = r0.f25153a
            double r4 = r4 * r4
            double r4 = r2 - r4
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r6
            r0.f25160h = r4
        L57:
            r1 = 1
            r0.f25155c = r1
        L5a:
            r4 = r21
            double r4 = (double) r4
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r6
            double r6 = r0.f25161i
            double r6 = r17 - r6
            double r8 = r0.f25154b
            r10 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lb4
            double r1 = r0.f25159g
            double r8 = r1 * r6
            double r8 = r8 - r19
            double r12 = r0.f25158f
            double r14 = r1 - r12
            double r8 = r8 / r14
            double r8 = r6 - r8
            double r6 = r6 * r1
            double r6 = r6 - r19
            double r12 = r1 - r12
            double r6 = r6 / r12
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r1 = r1 * r8
            double r12 = r0.f25158f
            double r12 = r12 * r4
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 * r6
            double r12 = r12 + r1
            double r1 = r0.f25159g
            double r8 = r8 * r1
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r1 = r1 * r8
            double r8 = r0.f25158f
            double r6 = r6 * r8
            double r8 = r8 * r4
            double r3 = java.lang.Math.pow(r10, r8)
            double r3 = r3 * r6
            double r3 = r3 + r1
            goto L14b
        Lb4:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto Le6
            double r1 = r0.f25153a
            double r8 = r1 * r6
            double r8 = r8 + r19
            double r12 = r8 * r4
            double r12 = r12 + r6
            double r1 = -r1
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r1 = r1 * r12
            double r6 = r0.f25153a
            double r6 = -r6
            double r6 = r6 * r4
            double r6 = java.lang.Math.pow(r10, r6)
            double r6 = r6 * r12
            double r12 = r0.f25153a
            double r14 = -r12
            double r6 = r6 * r14
            double r12 = -r12
            double r12 = r12 * r4
            double r3 = java.lang.Math.pow(r10, r12)
            double r3 = r3 * r8
            double r3 = r3 + r6
            r12 = r1
            goto L14b
        Le6:
            double r12 = r0.f25160h
            double r2 = r2 / r12
            double r12 = r0.f25153a
            double r14 = r8 * r12
            double r14 = r14 * r6
            double r14 = r14 + r19
            double r14 = r14 * r2
            double r1 = -r8
            double r1 = r1 * r12
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r8 = r0.f25160h
            double r8 = r8 * r4
            double r8 = java.lang.Math.cos(r8)
            double r8 = r8 * r6
            double r12 = r0.f25160h
            double r12 = r12 * r4
            double r12 = java.lang.Math.sin(r12)
            double r12 = r12 * r14
            double r12 = r12 + r8
            double r12 = r12 * r1
            double r1 = r0.f25153a
            double r8 = -r1
            double r8 = r8 * r12
            double r10 = r0.f25154b
            double r8 = r8 * r10
            double r10 = -r10
            double r10 = r10 * r1
            double r10 = r10 * r4
            r1 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            double r1 = java.lang.Math.pow(r1, r10)
            double r10 = r0.f25160h
            r17 = r12
            double r12 = -r10
            double r12 = r12 * r6
            double r10 = r10 * r4
            double r6 = java.lang.Math.sin(r10)
            double r6 = r6 * r12
            double r10 = r0.f25160h
            double r14 = r14 * r10
            double r10 = r10 * r4
            double r3 = java.lang.Math.cos(r10)
            double r3 = r3 * r14
            double r3 = r3 + r6
            double r3 = r3 * r1
            double r3 = r3 + r8
            r12 = r17
        L14b:
            v0.b$h r1 = r0.f25162j
            double r5 = r0.f25161i
            double r12 = r12 + r5
            float r2 = (float) r12
            r1.f25148a = r2
            float r2 = (float) r3
            r1.f25149b = r2
            return r1
        L157:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error: Final position of the spring must be set before the animation starts"
            r1.<init>(r2)
            throw r1
    }
}
