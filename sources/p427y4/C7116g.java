package p427y4;

/* renamed from: y4.g */
/* loaded from: classes.dex */
public final class C7116g extends p088f4.AbstractC2008g implements android.os.Handler.Callback {

    /* renamed from: j0 */
    public final p427y4.InterfaceC7113d f27509j0;

    /* renamed from: k0 */
    public final p427y4.InterfaceC7115f f27510k0;

    /* renamed from: l0 */
    public final android.os.Handler f27511l0;

    /* renamed from: m0 */
    public final p427y4.C7114e f27512m0;

    /* renamed from: n0 */
    public p427y4.InterfaceC7112c f27513n0;

    /* renamed from: o0 */
    public boolean f27514o0;

    /* renamed from: p0 */
    public boolean f27515p0;

    /* renamed from: q0 */
    public long f27516q0;

    /* renamed from: r0 */
    public long f27517r0;

    /* renamed from: s0 */
    public p427y4.C7110a f27518s0;

    public C7116g(p427y4.InterfaceC7115f r3, android.os.Looper r4) {
            r2 = this;
            y4.d r0 = p427y4.InterfaceC7113d.f27507a
            r1 = 5
            r2.<init>(r1)
            java.util.Objects.requireNonNull(r3)
            r2.f27510k0 = r3
            if (r4 != 0) goto Lf
            r3 = 0
            goto L16
        Lf:
            int r3 = p371v5.C6552b0.f25624a
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r4, r2)
        L16:
            r2.f27511l0 = r3
            r2.f27509j0 = r0
            y4.e r3 = new y4.e
            r3.<init>()
            r2.f27512m0 = r3
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2.f27517r0 = r3
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: D */
    public void mo5244D() {
            r3 = this;
            r0 = 0
            r3.f27518s0 = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f27517r0 = r1
            r3.f27513n0 = r0
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: F */
    public void mo5246F(long r1, boolean r3) {
            r0 = this;
            r1 = 0
            r0.f27518s0 = r1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f27517r0 = r1
            r1 = 0
            r0.f27514o0 = r1
            r0.f27515p0 = r1
            return
    }

    @Override // p088f4.AbstractC2008g
    /* renamed from: J */
    public void mo5250J(p088f4.C2003e0[] r1, long r2, long r4) {
            r0 = this;
            y4.d r2 = r0.f27509j0
            r3 = 0
            r1 = r1[r3]
            y4.c r1 = r2.mo14225a(r1)
            r0.f27513n0 = r1
            return
    }

    /* renamed from: L */
    public final void m14227L(p427y4.C7110a r6, java.util.List<p427y4.C7110a.b> r7) {
            r5 = this;
            r0 = 0
        L1:
            y4.a$b[] r1 = r6.f27506Y
            int r2 = r1.length
            if (r0 >= r2) goto L56
            r1 = r1[r0]
            f4.e0 r1 = r1.mo30D()
            if (r1 == 0) goto L4c
            y4.d r2 = r5.f27509j0
            boolean r2 = r2.mo14226f(r1)
            if (r2 == 0) goto L4c
            y4.d r2 = r5.f27509j0
            y4.c r1 = r2.mo14225a(r1)
            y4.a$b[] r2 = r6.f27506Y
            r2 = r2[r0]
            byte[] r2 = r2.mo31O()
            java.util.Objects.requireNonNull(r2)
            y4.e r3 = r5.f27512m0
            r3.mo7522t()
            y4.e r3 = r5.f27512m0
            int r4 = r2.length
            r3.m7524v(r4)
            y4.e r3 = r5.f27512m0
            java.nio.ByteBuffer r3 = r3.f12358a0
            int r4 = p371v5.C6552b0.f25624a
            r3.put(r2)
            y4.e r2 = r5.f27512m0
            r2.m7525w()
            y4.e r2 = r5.f27512m0
            y4.a r1 = r1.mo14224a(r2)
            if (r1 == 0) goto L53
            r5.m14227L(r1, r7)
            goto L53
        L4c:
            y4.a$b[] r1 = r6.f27506Y
            r1 = r1[r0]
            r7.add(r1)
        L53:
            int r0 = r0 + 1
            goto L1
        L56:
            return
    }

    @Override // p088f4.InterfaceC2004e1, p088f4.InterfaceC2007f1
    /* renamed from: a */
    public java.lang.String mo5195a() {
            r1 = this;
            java.lang.String r0 = "MetadataRenderer"
            return r0
    }

    @Override // p088f4.InterfaceC2004e1
    /* renamed from: d */
    public boolean mo5197d() {
            r1 = this;
            boolean r0 = r1.f27515p0
            return r0
    }

    @Override // p088f4.InterfaceC2007f1
    /* renamed from: f */
    public int mo5239f(p088f4.C2003e0 r3) {
            r2 = this;
            y4.d r0 = r2.f27509j0
            boolean r0 = r0.mo14226f(r3)
            r1 = 0
            if (r0 == 0) goto L13
            int r3 = r3.f8883C0
            if (r3 != 0) goto Lf
            r3 = 4
            goto L10
        Lf:
            r3 = 2
        L10:
            r3 = r3 | r1
            r3 = r3 | r1
            return r3
        L13:
            return r1
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message r2) {
            r1 = this;
            int r0 = r2.what
            if (r0 != 0) goto Lf
            java.lang.Object r2 = r2.obj
            y4.a r2 = (p427y4.C7110a) r2
            y4.f r0 = r1.f27510k0
            r0.mo5295f(r2)
            r2 = 1
            return r2
        Lf:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
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
            r7 = 1
            r8 = 1
        L2:
            if (r8 == 0) goto La0
            boolean r8 = r4.f27514o0
            r0 = 0
            if (r8 != 0) goto L6c
            y4.a r8 = r4.f27518s0
            if (r8 != 0) goto L6c
            y4.e r8 = r4.f27512m0
            r8.mo7522t()
            androidx.appcompat.widget.x r8 = r4.m5243C()
            y4.e r1 = r4.f27512m0
            int r1 = r4.m5251K(r8, r1, r0)
            r2 = -4
            if (r1 != r2) goto L5e
            y4.e r8 = r4.f27512m0
            boolean r8 = r8.m7517r()
            if (r8 == 0) goto L2a
            r4.f27514o0 = r7
            goto L6c
        L2a:
            y4.e r8 = r4.f27512m0
            long r1 = r4.f27516q0
            r8.f27508g0 = r1
            r8.m7525w()
            y4.c r8 = r4.f27513n0
            int r1 = p371v5.C6552b0.f25624a
            y4.e r1 = r4.f27512m0
            y4.a r8 = r8.mo14224a(r1)
            if (r8 == 0) goto L6c
            java.util.ArrayList r1 = new java.util.ArrayList
            y4.a$b[] r2 = r8.f27506Y
            int r2 = r2.length
            r1.<init>(r2)
            r4.m14227L(r8, r1)
            boolean r8 = r1.isEmpty()
            if (r8 != 0) goto L6c
            y4.a r8 = new y4.a
            r8.<init>(r1)
            r4.f27518s0 = r8
            y4.e r8 = r4.f27512m0
            long r1 = r8.f12360c0
            r4.f27517r0 = r1
            goto L6c
        L5e:
            r2 = -5
            if (r1 != r2) goto L6c
            java.lang.Object r8 = r8.f1482a0
            f4.e0 r8 = (p088f4.C2003e0) r8
            java.util.Objects.requireNonNull(r8)
            long r1 = r8.f8900n0
            r4.f27516q0 = r1
        L6c:
            y4.a r8 = r4.f27518s0
            if (r8 == 0) goto L93
            long r1 = r4.f27517r0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 > 0) goto L93
            android.os.Handler r1 = r4.f27511l0
            if (r1 == 0) goto L82
            android.os.Message r8 = r1.obtainMessage(r0, r8)
            r8.sendToTarget()
            goto L87
        L82:
            y4.f r0 = r4.f27510k0
            r0.mo5295f(r8)
        L87:
            r8 = 0
            r4.f27518s0 = r8
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.f27517r0 = r0
            r8 = 1
            goto L94
        L93:
            r8 = 0
        L94:
            boolean r0 = r4.f27514o0
            if (r0 == 0) goto L2
            y4.a r0 = r4.f27518s0
            if (r0 != 0) goto L2
            r4.f27515p0 = r7
            goto L2
        La0:
            return
    }
}
