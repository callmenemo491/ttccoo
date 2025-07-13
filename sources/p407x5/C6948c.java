package p407x5;

/* renamed from: x5.c */
/* loaded from: classes.dex */
public final class C6948c {

    /* renamed from: a */
    public final java.lang.Object f27120a;

    /* renamed from: b */
    public java.lang.Object f27121b;

    /* renamed from: c */
    public p371v5.C6575y<float[]> f27122c;

    /* renamed from: d */
    public boolean f27123d;

    public C6948c() {
            r2 = this;
            r2.<init>()
            r0 = 16
            float[] r1 = new float[r0]
            r2.f27120a = r1
            float[] r0 = new float[r0]
            r2.f27121b = r0
            v5.y r0 = new v5.y
            r0.<init>()
            r2.f27122c = r0
            return
    }

    public C6948c(p453zb.C7270b r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.f27903Z
            r1 = 21
            if (r0 < r1) goto L11
            r0 = r0 & 3
            r1 = 1
            if (r0 != r1) goto L11
            r2.f27120a = r3
            return
        L11:
            sb.f r3 = sb.C6012f.m12491a()
            throw r3
    }

    /* renamed from: a */
    public static void m14111a(float[] r6, float[] r7) {
            r0 = 0
            android.opengl.Matrix.setIdentityM(r6, r0)
            r1 = 10
            r2 = r7[r1]
            r3 = r7[r1]
            float r2 = r2 * r3
            r3 = 8
            r4 = r7[r3]
            r5 = r7[r3]
            float r4 = r4 * r5
            float r4 = r4 + r2
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r2 = (float) r4
            r4 = r7[r1]
            float r4 = r4 / r2
            r6[r0] = r4
            r0 = r7[r3]
            float r0 = r0 / r2
            r4 = 2
            r6[r4] = r0
            r0 = r7[r3]
            float r0 = -r0
            float r0 = r0 / r2
            r6[r3] = r0
            r7 = r7[r1]
            float r7 = r7 / r2
            r6[r1] = r7
            return
    }

    /* renamed from: b */
    public int m14112b(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.f27123d
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r1.f27120a
            zb.b r0 = (p453zb.C7270b) r0
            boolean r2 = r0.m14372b(r3, r2)
            goto L15
        Ld:
            java.lang.Object r0 = r1.f27120a
            zb.b r0 = (p453zb.C7270b) r0
            boolean r2 = r0.m14372b(r2, r3)
        L15:
            if (r2 == 0) goto L1c
            int r2 = r4 << 1
            r2 = r2 | 1
            return r2
        L1c:
            int r2 = r4 << 1
            return r2
    }

    /* renamed from: c */
    public void m14113c() {
            r5 = this;
            r0 = 0
        L1:
            java.lang.Object r1 = r5.f27120a
            zb.b r1 = (p453zb.C7270b) r1
            int r1 = r1.f27902Y
            if (r0 >= r1) goto L38
            int r1 = r0 + 1
            r2 = r1
        Lc:
            java.lang.Object r3 = r5.f27120a
            r4 = r3
            zb.b r4 = (p453zb.C7270b) r4
            int r4 = r4.f27903Z
            if (r2 >= r4) goto L36
            zb.b r3 = (p453zb.C7270b) r3
            boolean r3 = r3.m14372b(r0, r2)
            java.lang.Object r4 = r5.f27120a
            zb.b r4 = (p453zb.C7270b) r4
            boolean r4 = r4.m14372b(r2, r0)
            if (r3 == r4) goto L33
            java.lang.Object r3 = r5.f27120a
            zb.b r3 = (p453zb.C7270b) r3
            r3.m14371a(r2, r0)
            java.lang.Object r3 = r5.f27120a
            zb.b r3 = (p453zb.C7270b) r3
            r3.m14371a(r0, r2)
        L33:
            int r2 = r2 + 1
            goto Lc
        L36:
            r0 = r1
            goto L1
        L38:
            return
    }

    /* renamed from: d */
    public p312rc.C5810e m14114d() {
            r6 = this;
            v5.y<float[]> r0 = r6.f27122c
            r1 = r0
            rc.e r1 = (p312rc.C5810e) r1
            if (r1 == 0) goto La
            rc.e r0 = (p312rc.C5810e) r0
            return r0
        La:
            r0 = 0
            r1 = 0
            r2 = 0
        Ld:
            r3 = 6
            r4 = 8
            if (r1 >= r3) goto L19
            int r2 = r6.m14112b(r1, r4, r2)
            int r1 = r1 + 1
            goto Ld
        L19:
            r1 = 7
            int r2 = r6.m14112b(r1, r4, r2)
            int r2 = r6.m14112b(r4, r4, r2)
            int r1 = r6.m14112b(r4, r1, r2)
            r2 = 5
        L27:
            if (r2 < 0) goto L30
            int r1 = r6.m14112b(r4, r2, r1)
            int r2 = r2 + (-1)
            goto L27
        L30:
            java.lang.Object r2 = r6.f27120a
            zb.b r2 = (p453zb.C7270b) r2
            int r2 = r2.f27903Z
            int r3 = r2 + (-7)
            int r5 = r2 + (-1)
        L3a:
            if (r5 < r3) goto L43
            int r0 = r6.m14112b(r4, r5, r0)
            int r5 = r5 + (-1)
            goto L3a
        L43:
            int r3 = r2 + (-8)
        L45:
            if (r3 >= r2) goto L4e
            int r0 = r6.m14112b(r3, r4, r0)
            int r3 = r3 + 1
            goto L45
        L4e:
            rc.e r2 = p312rc.C5810e.m12181a(r1, r0)
            if (r2 == 0) goto L55
            goto L5d
        L55:
            r1 = r1 ^ 21522(0x5412, float:3.0159E-41)
            r0 = r0 ^ 21522(0x5412, float:3.0159E-41)
            rc.e r2 = p312rc.C5810e.m12181a(r1, r0)
        L5d:
            r6.f27122c = r2
            r0 = r2
            rc.e r0 = (p312rc.C5810e) r0
            if (r0 == 0) goto L67
            rc.e r2 = (p312rc.C5810e) r2
            return r2
        L67:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
    }

    /* renamed from: e */
    public p312rc.C5813h m14115e() {
            r7 = this;
            java.lang.Object r0 = r7.f27121b
            r1 = r0
            rc.h r1 = (p312rc.C5813h) r1
            if (r1 == 0) goto La
            rc.h r0 = (p312rc.C5813h) r0
            return r0
        La:
            java.lang.Object r0 = r7.f27120a
            zb.b r0 = (p453zb.C7270b) r0
            int r0 = r0.f27903Z
            int r1 = r0 + (-17)
            int r1 = r1 / 4
            r2 = 6
            if (r1 > r2) goto L1c
            rc.h r0 = p312rc.C5813h.m12186d(r1)
            return r0
        L1c:
            int r1 = r0 + (-11)
            r2 = 5
            r3 = 0
            r4 = 5
            r5 = 0
        L22:
            if (r4 < 0) goto L32
            int r6 = r0 + (-9)
        L26:
            if (r6 < r1) goto L2f
            int r5 = r7.m14112b(r6, r4, r5)
            int r6 = r6 + (-1)
            goto L26
        L2f:
            int r4 = r4 + (-1)
            goto L22
        L32:
            rc.h r4 = p312rc.C5813h.m12185b(r5)
            if (r4 == 0) goto L41
            int r5 = r4.m12187c()
            if (r5 != r0) goto L41
            r7.f27121b = r4
            return r4
        L41:
            if (r2 < 0) goto L51
            int r4 = r0 + (-9)
        L45:
            if (r4 < r1) goto L4e
            int r3 = r7.m14112b(r2, r4, r3)
            int r4 = r4 + (-1)
            goto L45
        L4e:
            int r2 = r2 + (-1)
            goto L41
        L51:
            rc.h r1 = p312rc.C5813h.m12185b(r3)
            if (r1 == 0) goto L60
            int r2 = r1.m12187c()
            if (r2 != r0) goto L60
            r7.f27121b = r1
            return r1
        L60:
            sb.f r0 = sb.C6012f.m12491a()
            throw r0
    }

    /* renamed from: f */
    public void m14116f() {
            r3 = this;
            v5.y<float[]> r0 = r3.f27122c
            rc.e r0 = (p312rc.C5810e) r0
            if (r0 != 0) goto L7
            return
        L7:
            rc.b[] r0 = p312rc.EnumC5807b.values()
            v5.y<float[]> r1 = r3.f27122c
            rc.e r1 = (p312rc.C5810e) r1
            byte r1 = r1.f22508b
            r0 = r0[r1]
            java.lang.Object r1 = r3.f27120a
            zb.b r1 = (p453zb.C7270b) r1
            int r2 = r1.f27903Z
            r0.m12174g(r1, r2)
            return
    }
}
