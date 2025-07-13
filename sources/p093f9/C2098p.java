package p093f9;

/* renamed from: f9.p */
/* loaded from: classes.dex */
public class C2098p implements p093f9.C2100r.a {

    /* renamed from: a */
    public final /* synthetic */ p093f9.AbstractC2089g f9523a;

    public C2098p(p093f9.AbstractC2089g r1) {
            r0 = this;
            r0.f9523a = r1
            r0.<init>()
            return
    }

    @Override // p093f9.C2100r.a
    /* renamed from: a */
    public <Q> p093f9.InterfaceC2086d<Q> mo5543a(java.lang.Class<Q> r3) {
            r2 = this;
            f9.e r0 = new f9.e     // Catch: java.lang.IllegalArgumentException -> L8
            f9.g r1 = r2.f9523a     // Catch: java.lang.IllegalArgumentException -> L8
            r0.<init>(r1, r3)     // Catch: java.lang.IllegalArgumentException -> L8
            return r0
        L8:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "Primitive type not supported"
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // p093f9.C2100r.a
    /* renamed from: b */
    public p093f9.InterfaceC2086d<?> mo5544b() {
            r3 = this;
            f9.e r0 = new f9.e
            f9.g r1 = r3.f9523a
            java.lang.Class<?> r2 = r1.f9509c
            r0.<init>(r1, r2)
            return r0
    }

    @Override // p093f9.C2100r.a
    /* renamed from: c */
    public java.lang.Class<?> mo5545c() {
            r1 = this;
            f9.g r0 = r1.f9523a
            java.lang.Class r0 = r0.getClass()
            return r0
    }

    @Override // p093f9.C2100r.a
    /* renamed from: d */
    public java.util.Set<java.lang.Class<?>> mo5546d() {
            r1 = this;
            f9.g r0 = r1.f9523a
            java.util.Map<java.lang.Class<?>, f9.g$b<?, KeyProtoT extends m9.q0>> r0 = r0.f9508b
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
