package p088f4;

/* renamed from: f4.m */
/* loaded from: classes.dex */
public final class C2026m implements p371v5.InterfaceC6566p {

    /* renamed from: Y */
    public final p371v5.C6572v f9198Y;

    /* renamed from: Z */
    public final p088f4.C2026m.a f9199Z;

    /* renamed from: a0 */
    public p088f4.InterfaceC2004e1 f9200a0;

    /* renamed from: b0 */
    public p371v5.InterfaceC6566p f9201b0;

    /* renamed from: c0 */
    public boolean f9202c0;

    /* renamed from: d0 */
    public boolean f9203d0;

    /* renamed from: f4.m$a */
    public interface a {
    }

    public C2026m(p088f4.C2026m.a r1, p371v5.InterfaceC6553c r2) {
            r0 = this;
            r0.<init>()
            r0.f9199Z = r1
            v5.v r1 = new v5.v
            r1.<init>(r2)
            r0.f9198Y = r1
            r1 = 1
            r0.f9202c0 = r1
            return
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: c */
    public void mo5331c(p088f4.C2052w0 r2) {
            r1 = this;
            v5.p r0 = r1.f9201b0
            if (r0 == 0) goto Ld
            r0.mo5331c(r2)
            v5.p r2 = r1.f9201b0
            f4.w0 r2 = r2.mo5332e()
        Ld:
            v5.v r0 = r1.f9198Y
            r0.mo5331c(r2)
            return
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: e */
    public p088f4.C2052w0 mo5332e() {
            r1 = this;
            v5.p r0 = r1.f9201b0
            if (r0 == 0) goto L9
            f4.w0 r0 = r0.mo5332e()
            goto Ld
        L9:
            v5.v r0 = r1.f9198Y
            f4.w0 r0 = r0.f25717c0
        Ld:
            return r0
    }

    @Override // p371v5.InterfaceC6566p
    /* renamed from: y */
    public long mo5333y() {
            r2 = this;
            boolean r0 = r2.f9202c0
            if (r0 == 0) goto Lb
            v5.v r0 = r2.f9198Y
            long r0 = r0.mo5333y()
            goto L14
        Lb:
            v5.p r0 = r2.f9201b0
            java.util.Objects.requireNonNull(r0)
            long r0 = r0.mo5333y()
        L14:
            return r0
    }
}
