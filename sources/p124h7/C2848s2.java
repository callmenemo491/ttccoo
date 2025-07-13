package p124h7;

/* renamed from: h7.s2 */
/* loaded from: classes.dex */
public final class C2848s2 extends p124h7.AbstractC2847s1<p124h7.C2652h4> {

    /* renamed from: d */
    public final /* synthetic */ int f11905d;

    public C2848s2(int r5) {
            r4 = this;
            java.lang.Class<h7.k1> r0 = p124h7.InterfaceC2703k1.class
            r4.f11905d = r5
            r1 = 0
            r2 = 1
            if (r5 == r2) goto L65
            r3 = 2
            if (r5 == r3) goto L56
            r3 = 3
            if (r5 == r3) goto L47
            r0 = 4
            if (r5 == r0) goto L36
            r0 = 5
            if (r5 == r0) goto L25
            h7.r1[] r5 = new p124h7.AbstractC2829r1[r2]
            h7.q2 r0 = new h7.q2
            java.lang.Class<h7.y7> r2 = p124h7.InterfaceC2961y7.class
            r0.<init>(r2, r1)
            r5[r1] = r0
            java.lang.Class<h7.h4> r0 = p124h7.C2652h4.class
            r4.<init>(r0, r5)
            return
        L25:
            h7.r1[] r5 = new p124h7.AbstractC2829r1[r2]
            h7.q2 r2 = new h7.q2
            java.lang.Class<h7.y1> r3 = p124h7.InterfaceC2955y1.class
            r2.<init>(r3, r0)
            r5[r1] = r2
            java.lang.Class<h7.b6> r0 = p124h7.C2546b6.class
            r4.<init>(r0, r5)
            return
        L36:
            h7.r1[] r5 = new p124h7.AbstractC2829r1[r2]
            h7.q2 r2 = new h7.q2
            java.lang.Class<h7.o1> r3 = p124h7.InterfaceC2775o1.class
            r2.<init>(r3, r0)
            r5[r1] = r2
            java.lang.Class<h7.t5> r0 = p124h7.C2869t5.class
            r4.<init>(r0, r5)
            return
        L47:
            h7.r1[] r5 = new p124h7.AbstractC2829r1[r2]
            h7.q2 r2 = new h7.q2
            r2.<init>(r0, r3)
            r5[r1] = r2
            java.lang.Class<h7.b7> r0 = p124h7.C2547b7.class
            r4.<init>(r0, r5)
            return
        L56:
            h7.r1[] r5 = new p124h7.AbstractC2829r1[r2]
            h7.q2 r2 = new h7.q2
            r2.<init>(r0, r3)
            r5[r1] = r2
            java.lang.Class<h7.f5> r0 = p124h7.C2617f5.class
            r4.<init>(r0, r5)
            return
        L65:
            h7.r1[] r5 = new p124h7.AbstractC2829r1[r2]
            h7.q2 r3 = new h7.q2
            r3.<init>(r0, r2)
            r5[r1] = r3
            java.lang.Class<h7.t4> r0 = p124h7.C2868t4.class
            r4.<init>(r0, r5)
            return
    }

    /* renamed from: h */
    public static p124h7.C2811q1 m7122h(int r2, int r3) {
            h7.u4 r0 = p124h7.C2904v4.m7198s()
            boolean r1 = r0.f11974a0
            if (r1 == 0) goto Le
            r0.m7222d()
            r1 = 0
            r0.f11974a0 = r1
        Le:
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r0.f11973Z
            h7.v4 r1 = (p124h7.C2904v4) r1
            p124h7.C2904v4.m7201w(r1, r2)
            h7.yg r2 = r0.m7220b()
            h7.v4 r2 = (p124h7.C2904v4) r2
            h7.q1 r0 = new h7.q1
            r0.<init>(r2, r3)
            return r0
    }

    /* renamed from: i */
    public static /* synthetic */ p124h7.C2811q1 m7123i(int r3, int r4, p124h7.EnumC2977z5 r5, int r6) {
            h7.q1 r0 = new h7.q1
            h7.c6 r1 = p124h7.C2582d6.m6582s()
            h7.e6 r2 = p124h7.C2618f6.m6704u()
            r2.m6643e(r5)
            r2.m6644f(r4)
            h7.yg r4 = r2.m7220b()
            h7.f6 r4 = (p124h7.C2618f6) r4
            r1.m6524f(r4)
            r1.m6523e(r3)
            h7.yg r3 = r1.m7220b()
            h7.d6 r3 = (p124h7.C2582d6) r3
            r0.<init>(r3, r6)
            return r0
    }

    /* renamed from: j */
    public static final void m7124j(p124h7.C2652h4 r2) {
            int r0 = r2.m6788r()
            r1 = 0
            p124h7.C2584d8.m6594c(r0, r1)
            h7.cg r0 = r2.m6790y()
            int r0 = r0.mo6474h()
            p124h7.C2584d8.m6593b(r0)
            h7.l4 r2 = r2.m6789x()
            m7125k(r2)
            return
    }

    /* renamed from: k */
    public static final void m7125k(p124h7.C2724l4 r2) {
            int r0 = r2.m6958r()
            r1 = 12
            if (r0 < r1) goto L11
            int r2 = r2.m6958r()
            r0 = 16
            if (r2 > r0) goto L11
            return
        L11:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid IV size"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: l */
    public static final void m7126l(p124h7.C2546b6 r2) {
            int r0 = r2.m6500r()
            r1 = 0
            p124h7.C2584d8.m6594c(r0, r1)
            h7.cg r0 = r2.m6502y()
            int r0 = r0.mo6474h()
            r1 = 16
            if (r0 < r1) goto L1c
            h7.f6 r2 = r2.m6501x()
            m7127m(r2)
            return
        L1c:
            java.security.GeneralSecurityException r2 = new java.security.GeneralSecurityException
            java.lang.String r0 = "key too short"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: m */
    public static void m7127m(p124h7.C2618f6 r3) {
            int r0 = r3.m6709r()
            r1 = 10
            if (r0 < r1) goto L74
            h7.z5 r0 = r3.m6710s()
            int r0 = r0.ordinal()
            r1 = 1
            java.lang.String r2 = "tag size too big"
            if (r0 == r1) goto L65
            r1 = 2
            if (r0 == r1) goto L56
            r1 = 3
            if (r0 == r1) goto L47
            r1 = 4
            if (r0 == r1) goto L38
            r1 = 5
            if (r0 != r1) goto L30
            int r3 = r3.m6709r()
            r0 = 28
            if (r3 > r0) goto L2a
            goto L6d
        L2a:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L30:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown hash type"
            r3.<init>(r0)
            throw r3
        L38:
            int r3 = r3.m6709r()
            r0 = 64
            if (r3 > r0) goto L41
            goto L6d
        L41:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L47:
            int r3 = r3.m6709r()
            r0 = 32
            if (r3 > r0) goto L50
            goto L6d
        L50:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L56:
            int r3 = r3.m6709r()
            r0 = 48
            if (r3 > r0) goto L5f
            goto L6d
        L5f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L65:
            int r3 = r3.m6709r()
            r0 = 20
            if (r3 > r0) goto L6e
        L6d:
            return
        L6e:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r2)
            throw r3
        L74:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "tag size too small"
            r3.<init>(r0)
            throw r3
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: a */
    public p366v0.AbstractC6484c mo6563a() {
            r3 = this;
            int r0 = r3.f11905d
            r1 = 0
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L22;
                case 2: goto L1a;
                case 3: goto L12;
                case 4: goto L6;
                case 5: goto La;
                default: goto L6;
            }
        L6:
            super.mo6563a()
            throw r1
        La:
            h7.o2 r0 = new h7.o2
            java.lang.Class<h7.d6> r2 = p124h7.C2582d6.class
            r0.<init>(r3, r2, r1)
            return r0
        L12:
            h7.o2 r0 = new h7.o2
            java.lang.Class<h7.c7> r2 = p124h7.C2565c7.class
            r0.<init>(r3, r2, r1)
            return r0
        L1a:
            h7.o2 r0 = new h7.o2
            java.lang.Class<h7.h5> r2 = p124h7.C2653h5.class
            r0.<init>(r3, r2, r1)
            return r0
        L22:
            h7.o2 r0 = new h7.o2
            java.lang.Class<h7.v4> r1 = p124h7.C2904v4.class
            r0.<init>(r3, r1)
            return r0
        L2a:
            h7.r2 r0 = new h7.r2
            java.lang.Class<h7.j4> r1 = p124h7.C2688j4.class
            r0.<init>(r3, r1)
            return r0
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: b */
    public final p124h7.EnumC2672i6 mo6564b() {
            r2 = this;
            h7.i6 r0 = p124h7.EnumC2672i6.f11618a0
            int r1 = r2.f11905d
            switch(r1) {
                case 0: goto Ld;
                case 1: goto Ld;
                case 2: goto Ld;
                case 3: goto Lb;
                case 4: goto L8;
                default: goto L7;
            }
        L7:
            return r0
        L8:
            h7.i6 r0 = p124h7.EnumC2672i6.f11620c0
            return r0
        Lb:
            h7.i6 r0 = p124h7.EnumC2672i6.f11621d0
        Ld:
            return r0
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ p124h7.InterfaceC2935x mo6565c(p124h7.AbstractC2574cg r2) {
            r1 = this;
            int r0 = r1.f11905d
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L21;
                case 2: goto L18;
                case 3: goto Lf;
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto L33
        L6:
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.t5 r2 = p124h7.C2869t5.m7168x(r2, r0)
            return r2
        Lf:
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.b7 r2 = p124h7.C2547b7.m6505v(r2, r0)
            return r2
        L18:
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.f5 r2 = p124h7.C2617f5.m6699v(r2, r0)
            return r2
        L21:
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.t4 r2 = p124h7.C2868t4.m7156v(r2, r0)
            return r2
        L2a:
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.h4 r2 = p124h7.C2652h4.m6786w(r2, r0)
            return r2
        L33:
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.b6 r2 = p124h7.C2546b6.m6498w(r2, r0)
            return r2
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: e */
    public final java.lang.String mo6566e() {
            r1 = this;
            int r0 = r1.f11905d
            switch(r0) {
                case 0: goto L14;
                case 1: goto L11;
                case 2: goto Le;
                case 3: goto Lb;
                case 4: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.HmacKey"
            return r0
        L8:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"
            return r0
        Lb:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey"
            return r0
        Le:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"
            return r0
        L11:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesGcmKey"
            return r0
        L14:
            java.lang.String r0 = "type.googleapis.com/google.crypto.tink.AesCtrKey"
            return r0
    }

    @Override // p124h7.AbstractC2847s1
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo6567g(p124h7.InterfaceC2935x r3) {
            r2 = this;
            int r0 = r2.f11905d
            r1 = 0
            switch(r0) {
                case 0: goto L55;
                case 1: goto L40;
                case 2: goto L22;
                case 3: goto L18;
                case 4: goto L7;
                default: goto L6;
            }
        L6:
            goto L5b
        L7:
            h7.t5 r3 = (p124h7.C2869t5) r3
            int r0 = r3.m7169r()
            p124h7.C2584d8.m6594c(r0, r1)
            h7.p5 r3 = r3.m7170s()
            p036c6.C0906q0.m2621i(r3)
            return
        L18:
            h7.b7 r3 = (p124h7.C2547b7) r3
            int r3 = r3.m6508r()
            p124h7.C2584d8.m6594c(r3, r1)
            return
        L22:
            h7.f5 r3 = (p124h7.C2617f5) r3
            int r0 = r3.m6702r()
            p124h7.C2584d8.m6594c(r0, r1)
            h7.cg r3 = r3.m6703w()
            int r3 = r3.mo6474h()
            r0 = 32
            if (r3 != r0) goto L38
            return
        L38:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r0 = "invalid ChaCha20Poly1305Key: incorrect key length"
            r3.<init>(r0)
            throw r3
        L40:
            h7.t4 r3 = (p124h7.C2868t4) r3
            int r0 = r3.m7159r()
            p124h7.C2584d8.m6594c(r0, r1)
            h7.cg r3 = r3.m7160w()
            int r3 = r3.mo6474h()
            p124h7.C2584d8.m6593b(r3)
            return
        L55:
            h7.h4 r3 = (p124h7.C2652h4) r3
            m7124j(r3)
            return
        L5b:
            h7.b6 r3 = (p124h7.C2546b6) r3
            m7126l(r3)
            return
    }
}
