package p352u5;

/* renamed from: u5.f0 */
/* loaded from: classes.dex */
public final class C6315f0 implements p352u5.InterfaceC6320i {

    /* renamed from: a */
    public final p352u5.InterfaceC6320i f24679a;

    /* renamed from: b */
    public long f24680b;

    /* renamed from: c */
    public android.net.Uri f24681c;

    /* renamed from: d */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> f24682d;

    public C6315f0(p352u5.InterfaceC6320i r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f24679a = r1
            android.net.Uri r1 = android.net.Uri.EMPTY
            r0.f24681c = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f24682d = r1
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r3, int r4, int r5) {
            r2 = this;
            u5.i r0 = r2.f24679a
            int r3 = r0.mo6020b(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Lf
            long r4 = r2.f24680b
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.f24680b = r4
        Lf:
            return r3
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r3) {
            r2 = this;
            android.net.Uri r0 = r3.f24704a
            r2.f24681c = r0
            java.util.Map r0 = java.util.Collections.emptyMap()
            r2.f24682d = r0
            u5.i r0 = r2.f24679a
            long r0 = r0.mo6021c(r3)
            android.net.Uri r3 = r2.mo6024l()
            java.util.Objects.requireNonNull(r3)
            r2.f24681c = r3
            java.util.Map r3 = r2.mo6022g()
            r2.f24682d = r3
            return r0
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r1 = this;
            u5.i r0 = r1.f24679a
            r0.close()
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: g */
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> mo6022g() {
            r1 = this;
            u5.i r0 = r1.f24679a
            java.util.Map r0 = r0.mo6022g()
            return r0
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: j */
    public void mo6023j(p352u5.InterfaceC6317g0 r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            u5.i r0 = r1.f24679a
            r0.mo6023j(r2)
            return
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            u5.i r0 = r1.f24679a
            android.net.Uri r0 = r0.mo6024l()
            return r0
    }
}
