package p412xa;

/* renamed from: xa.f */
/* loaded from: classes.dex */
public class C7013f implements p412xa.InterfaceC7016i {

    /* renamed from: a */
    public final p412xa.C7017j f27327a;

    /* renamed from: b */
    public final p327s7.C5986j<com.google.firebase.installations.AbstractC1244a> f27328b;

    public C7013f(p412xa.C7017j r1, p327s7.C5986j<com.google.firebase.installations.AbstractC1244a> r2) {
            r0 = this;
            r0.<init>()
            r0.f27327a = r1
            r0.f27328b = r2
            return
    }

    @Override // p412xa.InterfaceC7016i
    /* renamed from: a */
    public boolean mo14166a(za.AbstractC7268d r10) {
            r9 = this;
            boolean r0 = r10.m14359j()
            if (r0 == 0) goto L63
            xa.j r0 = r9.f27327a
            boolean r0 = r0.m14172d(r10)
            if (r0 != 0) goto L63
            s7.j<com.google.firebase.installations.a> r0 = r9.f27328b
            java.lang.String r2 = r10.mo14342a()
            java.lang.String r1 = "Null token"
            java.util.Objects.requireNonNull(r2, r1)
            long r3 = r10.mo14343b()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            long r3 = r10.mo14348g()
            java.lang.Long r10 = java.lang.Long.valueOf(r3)
            java.lang.String r3 = ""
            if (r1 != 0) goto L33
            java.lang.String r4 = " tokenExpirationTimestamp"
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
        L33:
            if (r10 != 0) goto L3b
            java.lang.String r4 = " tokenCreationTimestamp"
            java.lang.String r3 = p064e.C1493g.m4049a(r3, r4)
        L3b:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L57
            xa.a r8 = new xa.a
            long r3 = r1.longValue()
            long r5 = r10.longValue()
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r5, r7)
            s7.q<TResult> r10 = r0.f23075a
            r10.m12473r(r8)
            r10 = 1
            return r10
        L57:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Missing required properties:"
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r3)
            r10.<init>(r0)
            throw r10
        L63:
            r10 = 0
            return r10
    }

    @Override // p412xa.InterfaceC7016i
    /* renamed from: b */
    public boolean mo14167b(java.lang.Exception r2) {
            r1 = this;
            s7.j<com.google.firebase.installations.a> r0 = r1.f27328b
            r0.m12458a(r2)
            r2 = 1
            return r2
    }
}
