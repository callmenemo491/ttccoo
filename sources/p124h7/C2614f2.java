package p124h7;

/* renamed from: h7.f2 */
/* loaded from: classes.dex */
public final class C2614f2 implements p124h7.InterfaceC2632g2 {

    /* renamed from: a */
    public final /* synthetic */ p124h7.AbstractC2578d2 f11507a;

    /* renamed from: b */
    public final /* synthetic */ p124h7.AbstractC2847s1 f11508b;

    public C2614f2(p124h7.AbstractC2578d2 r1, p124h7.AbstractC2847s1 r2) {
            r0 = this;
            r0.f11507a = r1
            r0.f11508b = r2
            r0.<init>()
            return
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: a */
    public final <Q> p124h7.C2661hd mo6637a(java.lang.Class<Q> r4) {
            r3 = this;
            h7.c2 r0 = new h7.c2     // Catch: java.lang.IllegalArgumentException -> La
            h7.d2 r1 = r3.f11507a     // Catch: java.lang.IllegalArgumentException -> La
            h7.s1 r2 = r3.f11508b     // Catch: java.lang.IllegalArgumentException -> La
            r0.<init>(r1, r2, r4)     // Catch: java.lang.IllegalArgumentException -> La
            return r0
        La:
            r4 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Primitive type not supported"
            r0.<init>(r1, r4)
            throw r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: b */
    public final p124h7.C2661hd mo6638b() {
            r4 = this;
            h7.c2 r0 = new h7.c2
            h7.d2 r1 = r4.f11507a
            h7.s1 r2 = r4.f11508b
            java.lang.Class<?> r3 = r1.f11904c
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: c */
    public final java.lang.Class<?> mo6639c() {
            r1 = this;
            h7.d2 r0 = r1.f11507a
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: d */
    public final java.util.Set<java.lang.Class<?>> mo6640d() {
            r1 = this;
            h7.d2 r0 = r1.f11507a
            java.util.Set r0 = r0.m7121f()
            return r0
    }

    @Override // p124h7.InterfaceC2632g2
    /* renamed from: f */
    public final java.lang.Class<?> mo6641f() {
            r1 = this;
            h7.s1 r0 = r1.f11508b
            java.lang.Class r0 = r0.getClass()
            return r0
    }
}
