package p407x5;

/* renamed from: x5.b */
/* loaded from: classes.dex */
public final class C6947b extends p088f4.AbstractC2008g {

    /* renamed from: j0 */
    public final p142i4.C3073g f27115j0;

    /* renamed from: k0 */
    public final p371v5.C6571u f27116k0;

    /* renamed from: l0 */
    public long f27117l0;

    /* renamed from: m0 */
    public p407x5.InterfaceC6946a f27118m0;

    /* renamed from: n0 */
    public long f27119n0;

    public C6947b() {
            r2 = this;
            r0 = 6
            r2.<init>(r0)
            i4.g r0 = new i4.g
            r1 = 1
            r0.<init>(r1)
            r2.f27115j0 = r0
            v5.u r0 = new v5.u
            r0.<init>()
            r2.f27116k0 = r0
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: D */
    public void mo5244D() {
            r1 = this;
            x5.a r0 = r1.f27118m0
            if (r0 == 0) goto L7
            r0.mo5307e()
        L7:
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: F */
    public void mo5246F(long r1, boolean r3) {
            r0 = this;
            r1 = -9223372036854775808
            r0.f27119n0 = r1
            x5.a r1 = r0.f27118m0
            if (r1 == 0) goto Lb
            r1.mo5307e()
        Lb:
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: J */
    public void mo5250J(p088f4.C2003e0[] r1, long r2, long r4) {
            r0 = this;
            r0.f27117l0 = r4
            return
    }

    @Override // p088f4.InterfaceC2004e1, p088f4.InterfaceC2007f1
    /* renamed from: a */
    public java.lang.String mo5195a() {
            r1 = this;
            java.lang.String r0 = "CameraMotionRenderer"
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: d */
    public boolean mo5197d() {
            r1 = this;
            boolean r0 = r1.mo5201j()
            return r0
    }

    @Override // p088f4.InterfaceC2007f1
    /* renamed from: f */
    public int mo5239f(p088f4.C2003e0 r2) {
            r1 = this;
            java.lang.String r2 = r2.f8896j0
            java.lang.String r0 = "application/x-camera-motion"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Lc
            r2 = 4
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: i */
    public boolean mo5200i() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: m */
    public void mo5203m(long r5, long r7) {
            r4 = this;
        L0:
            boolean r7 = r4.mo5201j()
            if (r7 != 0) goto L8f
            long r7 = r4.f27119n0
            r0 = 100000(0x186a0, double:4.94066E-319)
            long r0 = r0 + r5
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8f
            i4.g r7 = r4.f27115j0
            r7.mo7522t()
            androidx.appcompat.widget.x r7 = r4.m5243C()
            i4.g r8 = r4.f27115j0
            r0 = 0
            int r7 = r4.m5251K(r7, r8, r0)
            r8 = -4
            if (r7 != r8) goto L8f
            i4.g r7 = r4.f27115j0
            boolean r7 = r7.m7517r()
            if (r7 == 0) goto L2c
            goto L8f
        L2c:
            i4.g r7 = r4.f27115j0
            long r1 = r7.f12360c0
            r4.f27119n0 = r1
            x5.a r8 = r4.f27118m0
            if (r8 == 0) goto L0
            boolean r7 = r7.m7516q()
            if (r7 == 0) goto L3d
            goto L0
        L3d:
            i4.g r7 = r4.f27115j0
            r7.m7525w()
            i4.g r7 = r4.f27115j0
            java.nio.ByteBuffer r7 = r7.f12358a0
            int r8 = p371v5.C6552b0.f25624a
            int r8 = r7.remaining()
            r1 = 16
            if (r8 == r1) goto L52
            r7 = 0
            goto L7f
        L52:
            v5.u r8 = r4.f27116k0
            byte[] r1 = r7.array()
            int r2 = r7.limit()
            r8.m13394D(r1, r2)
            v5.u r8 = r4.f27116k0
            int r7 = r7.arrayOffset()
            int r7 = r7 + 4
            r8.m13396F(r7)
            r7 = 3
            float[] r8 = new float[r7]
        L6d:
            if (r0 >= r7) goto L7e
            v5.u r1 = r4.f27116k0
            int r1 = r1.m13405h()
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r8[r0] = r1
            int r0 = r0 + 1
            goto L6d
        L7e:
            r7 = r8
        L7f:
            if (r7 != 0) goto L83
            goto L0
        L83:
            x5.a r8 = r4.f27118m0
            long r0 = r4.f27119n0
            long r2 = r4.f27117l0
            long r0 = r0 - r2
            r8.mo5306c(r0, r7)
            goto L0
        L8f:
            return
    }

    @Override // p088f4.AbstractC2008g, p088f4.C1992a1.b
    /* renamed from: n */
    public void mo5108n(int r2, java.lang.Object r3) {
            r1 = this;
            r0 = 8
            if (r2 != r0) goto L8
            x5.a r3 = (p407x5.InterfaceC6946a) r3
            r1.f27118m0 = r3
        L8:
            return
    }
}
