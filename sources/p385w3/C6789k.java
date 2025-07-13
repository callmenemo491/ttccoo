package p385w3;

/* renamed from: w3.k */
/* loaded from: classes.dex */
public final class C6789k<T> implements p335t3.InterfaceC6153f<T> {

    /* renamed from: a */
    public final p385w3.AbstractC6787i f26337a;

    /* renamed from: b */
    public final java.lang.String f26338b;

    /* renamed from: c */
    public final p335t3.C6149b f26339c;

    /* renamed from: d */
    public final p335t3.InterfaceC6152e<T, byte[]> f26340d;

    /* renamed from: e */
    public final p385w3.InterfaceC6790l f26341e;

    public C6789k(p385w3.AbstractC6787i r1, java.lang.String r2, p335t3.C6149b r3, p335t3.InterfaceC6152e<T, byte[]> r4, p385w3.InterfaceC6790l r5) {
            r0 = this;
            r0.<init>()
            r0.f26337a = r1
            r0.f26338b = r2
            r0.f26339c = r3
            r0.f26340d = r4
            r0.f26341e = r5
            return
    }

    /* renamed from: a */
    public void m13809a(p335t3.AbstractC6150c<T> r10, p335t3.InterfaceC6155h r11) {
            r9 = this;
            w3.l r0 = r9.f26341e
            w3.i r1 = r9.f26337a
            java.lang.String r2 = "Null transportContext"
            java.util.Objects.requireNonNull(r1, r2)
            java.lang.String r2 = "Null event"
            java.util.Objects.requireNonNull(r10, r2)
            java.lang.String r2 = r9.f26338b
            java.lang.String r3 = "Null transportName"
            java.util.Objects.requireNonNull(r2, r3)
            t3.e<T, byte[]> r3 = r9.f26340d
            java.lang.String r4 = "Null transformer"
            java.util.Objects.requireNonNull(r3, r4)
            t3.b r4 = r9.f26339c
            java.lang.String r5 = "Null encoding"
            java.util.Objects.requireNonNull(r4, r5)
            w3.m r0 = (p385w3.C6791m) r0
            z3.c r5 = r0.f26345c
            t3.d r6 = r10.mo12697c()
            w3.i$a r7 = p385w3.AbstractC6787i.m13808a()
            java.lang.String r8 = r1.mo13798b()
            r7.mo13802b(r8)
            r7.mo13803c(r6)
            byte[] r1 = r1.mo13799c()
            w3.b$b r7 = (p385w3.C6780b.b) r7
            r7.f26322b = r1
            w3.i r1 = r7.mo13801a()
            w3.a$b r6 = new w3.a$b
            r6.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r6.f26317f = r7
            d4.a r7 = r0.f26343a
            long r7 = r7.mo3736a()
            r6.m13795e(r7)
            d4.a r0 = r0.f26344b
            long r7 = r0.mo3736a()
            r6.m13797g(r7)
            r6.m13796f(r2)
            w3.e r0 = new w3.e
            java.lang.Object r2 = r10.mo12696b()
            java.lang.Object r2 = r3.apply(r2)
            byte[] r2 = (byte[]) r2
            r0.<init>(r4, r2)
            r6.m13794d(r0)
            java.lang.Integer r10 = r10.mo12695a()
            r6.f26313b = r10
            w3.f r10 = r6.mo13792b()
            r5.mo14314a(r1, r10, r11)
            return
    }
}
