package p124h7;

/* renamed from: h7.y2 */
/* loaded from: classes.dex */
public final class C2956y2 extends p124h7.AbstractC2847s1<p124h7.C2545b5> {
    public C2956y2() {
            r4 = this;
            r0 = 1
            h7.r1[] r0 = new p124h7.AbstractC2829r1[r0]
            h7.w2 r1 = new h7.w2
            java.lang.Class<h7.m1> r2 = p124h7.InterfaceC2739m1.class
            r3 = 0
            r1.<init>(r2, r3)
            r0[r3] = r1
            java.lang.Class<h7.b5> r1 = p124h7.C2545b5.class
            r4.<init>(r1, r0)
            return
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: a */
    public final p366v0.AbstractC6484c mo6563a() {
            r2 = this;
            h7.o2 r0 = new h7.o2
            java.lang.Class<h7.d5> r1 = p124h7.C2581d5.class
            r0.<init>(r2, r1)
            return r0
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: b */
    public final p124h7.EnumC2672i6 mo6564b() {
            r1 = this;
            h7.i6 r0 = p124h7.EnumC2672i6.f11618a0
            return r0
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2935x mo6565c(p124h7.AbstractC2574cg r2) {
            r1 = this;
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.b5 r2 = p124h7.C2545b5.m6488v(r2, r0)
            return r2
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: e */
    public final java.lang.String mo6566e() {
            r1 = this;
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesSivKey"
            return r0
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo6567g(p124h7.InterfaceC2935x r4) {
            r3 = this;
            h7.b5 r4 = (p124h7.C2545b5) r4
            int r0 = r4.m6491r()
            r1 = 0
            p124h7.C2584d8.m6594c(r0, r1)
            h7.cg r0 = r4.m6492w()
            int r0 = r0.mo6474h()
            r1 = 64
            if (r0 != r1) goto L17
            return
        L17:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            h7.cg r4 = r4.m6492w()
            int r4 = r4.mo6474h()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 61
            r1.<init>(r2)
            java.lang.String r2 = "invalid key size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ". Valid keys must have 64 bytes."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
