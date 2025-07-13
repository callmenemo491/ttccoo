package p124h7;

/* renamed from: h7.e2 */
/* loaded from: classes.dex */
public final class C2596e2 implements p124h7.InterfaceC2632g2 {

    /* renamed from: a */
    public final /* synthetic */ p124h7.AbstractC2847s1 f11477a;

    public C2596e2(p124h7.AbstractC2847s1 r1) {
            r0 = this;
            r0.f11477a = r1
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: a */
    public final <Q> p124h7.C2661hd mo6637a(java.lang.Class<Q> r3) {
            r2 = this;
            h7.hd r0 = new h7.hd     // Catch: java.lang.IllegalArgumentException -> L8
            h7.s1 r1 = r2.f11477a     // Catch: java.lang.IllegalArgumentException -> L8
            r0.<init>(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L8
            return r0
        L8:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Primitive type not supported"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: b */
    public final p124h7.C2661hd mo6638b() {
            r3 = this;
            h7.hd r0 = new h7.hd
            h7.s1 r1 = r3.f11477a
            java.lang.Class<?> r2 = r1.f11904c
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: c */
    public final java.lang.Class<?> mo6639c() {
            r1 = this;
            h7.s1 r0 = r1.f11477a
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: d */
    public final java.util.Set<java.lang.Class<?>> mo6640d() {
            r1 = this;
            h7.s1 r0 = r1.f11477a
            java.util.Set r0 = r0.m7121f()
            return r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: f */
    public final java.lang.Class<?> mo6641f() {
            r1 = this;
            r0 = 0
            return r0
    }
}
