package p371v5;

/* renamed from: v5.v */
/* loaded from: classes.dex */
public final class C6572v implements p371v5.InterfaceC6566p {

    /* renamed from: Y */
    public final p371v5.InterfaceC6553c f25713Y;

    /* renamed from: Z */
    public boolean f25714Z;

    /* renamed from: a0 */
    public long f25715a0;

    /* renamed from: b0 */
    public long f25716b0;

    /* renamed from: c0 */
    public p088f4.C2052w0 f25717c0;

    public C6572v(p371v5.InterfaceC6553c r1) {
            r0 = this;
            r0.<init>()
            r0.f25713Y = r1
            f4.w0 r1 = p088f4.C2052w0.f9371b0
            r0.f25717c0 = r1
            return
    }

    /* renamed from: a */
    public void m13424a(long r1) {
            r0 = this;
            r0.f25715a0 = r1
            boolean r1 = r0.f25714Z
            if (r1 == 0) goto Le
            v5.c r1 = r0.f25713Y
            long r1 = r1.mo13337d()
            r0.f25716b0 = r1
        Le:
            return
    }

    /* renamed from: b */
    public void m13425b() {
            r2 = this;
            boolean r0 = r2.f25714Z
            if (r0 != 0) goto Lf
            v5.c r0 = r2.f25713Y
            long r0 = r0.mo13337d()
            r2.f25716b0 = r0
            r0 = 1
            r2.f25714Z = r0
        Lf:
            return
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: c */
    public void mo5331c(p088f4.C2052w0 r3) {
            r2 = this;
            boolean r0 = r2.f25714Z
            if (r0 == 0) goto Lb
            long r0 = r2.mo5333y()
            r2.m13424a(r0)
        Lb:
            r2.f25717c0 = r3
            return
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: e */
    public p088f4.C2052w0 mo5332e() {
            r1 = this;
            f4.w0 r0 = r1.f25717c0
            return r0
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: y */
    public long mo5333y() {
            r7 = this;
            long r0 = r7.f25715a0
            boolean r2 = r7.f25714Z
            if (r2 == 0) goto L25
            v5.c r2 = r7.f25713Y
            long r2 = r2.mo13337d()
            long r4 = r7.f25716b0
            long r2 = r2 - r4
            f4.w0 r4 = r7.f25717c0
            float r5 = r4.f9372Y
            r6 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L1f
            long r2 = p371v5.C6552b0.m13297A(r2)
            long r0 = r0 + r2
            goto L25
        L1f:
            int r4 = r4.f9374a0
            long r4 = (long) r4
            long r2 = r2 * r4
            long r0 = r0 + r2
        L25:
            return r0
    }
}
