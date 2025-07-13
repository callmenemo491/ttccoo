package p083f;

/* renamed from: f.t */
/* loaded from: classes.dex */
public class C1933t implements p180k2.InterfaceC3669a, p425y2.InterfaceC7105b, bh.InterfaceC0769a, p123h6.InterfaceC2509p, p218m6.InterfaceC4396i, p052d6.InterfaceC1307g, p124h7.InterfaceC2685j1, p124h7.InterfaceC2883u1, p124h7.InterfaceC2775o1, p124h7.InterfaceC2697jd {

    /* renamed from: Y */
    public final /* synthetic */ int f8424Y;

    /* renamed from: Z */
    public java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> f8425Z;

    public C1933t(int r2) {
            r1 = this;
            r1.f8424Y = r2
            r0 = 1
            if (r2 == r0) goto L10
            r1.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f8425Z = r2
            return
        L10:
            r1.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(android.content.Context r4) {
            r3 = this;
            r0 = 7
            r3.f8424Y = r0
            r3.<init>()
            r0 = 0
            boolean r1 = p184k6.C3705h.f16411a     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "com.google.android.gms"
            r2 = 3
            android.content.Context r4 = r4.createPackageContext(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L11 java.lang.Throwable -> L20
            goto L12
        L11:
            r4 = r0
        L12:
            if (r4 != 0) goto L16
            r4 = r0
            goto L1d
        L16:
            java.lang.String r1 = "google_ads_flags"
            r2 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r1, r2)     // Catch: java.lang.Throwable -> L20
        L1d:
            r3.f8425Z = r4     // Catch: java.lang.Throwable -> L20
            goto L2a
        L20:
            r4 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r2 = "Error while getting SharedPreferences "
            android.util.Log.w(r1, r2, r4)
            r3.f8425Z = r0
        L2a:
            return
    }

    public C1933t(android.content.res.Resources r2) {
            r1 = this;
            r0 = 5
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(androidx.fragment.app.C0392l0 r2) {
            r1 = this;
            r0 = 18
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(androidx.fragment.app.C0392l0 r1, p139i1.C3058a r2) {
            r0 = this;
            r2 = 22
            r0.f8424Y = r2
            r0.f8425Z = r1
            r0.<init>()
            return
    }

    public C1933t(bh.InterfaceC0769a r2) {
            r1 = this;
            r0 = 6
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(p037c7.C0932h r2) {
            r1 = this;
            r0 = 11
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(com.google.android.gms.cast.C1060d r2) {
            r1 = this;
            r0 = 9
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(p072e7.C1624h1 r2) {
            r1 = this;
            r0 = 12
            r1.f8424Y = r0
            r1.f8425Z = r2
            r1.<init>()
            return
    }

    public C1933t(p123h6.C2507n r2) {
            r1 = this;
            r0 = 8
            r1.f8424Y = r0
            r1.f8425Z = r2
            r1.<init>()
            return
    }

    public C1933t(p124h7.C2587db r2) {
            r1 = this;
            r0 = 21
            r1.f8424Y = r0
            r1.f8425Z = r2
            r1.<init>()
            return
    }

    public C1933t(p124h7.InterfaceC2697jd r2) {
            r1 = this;
            r0 = 23
            r1.f8424Y = r0
            r1.f8425Z = r2
            r1.<init>()
            return
    }

    public C1933t(p124h7.AbstractC2715kd r2) {
            r1 = this;
            r0 = 24
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(p124h7.C2749mb r2) {
            r1 = this;
            r0 = 25
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(p124h7.C2767nb r2) {
            r1 = this;
            r0 = 26
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(p124h7.C2785ob r2) {
            r1 = this;
            r0 = 27
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(p124h7.C2803pb r2) {
            r1 = this;
            r0 = 28
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public /* synthetic */ C1933t(p124h7.C2821qb r2) {
            r1 = this;
            r0 = 29
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(p124h7.AbstractC2847s1 r2) {
            r1 = this;
            r0 = 17
            r1.f8424Y = r0
            r1.f8425Z = r2
            r1.<init>()
            return
    }

    public C1933t(p124h7.C2852s6 r2) {
            r1 = this;
            r0 = 16
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(p124h7.AbstractC2947xb r2) {
            r1 = this;
            r0 = 13
            r1.f8424Y = r0
            r1.f8425Z = r2
            r1.<init>()
            return
    }

    public C1933t(java.io.OutputStream r2) {
            r1 = this;
            r0 = 14
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(java.security.interfaces.ECPrivateKey r2) {
            r1 = this;
            r0 = 19
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(java.security.interfaces.ECPublicKey r2) {
            r1 = this;
            r0 = 20
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(p229n2.InterfaceC4672b r2) {
            r1 = this;
            r0 = 4
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(p248o6.C4930r r2) {
            r1 = this;
            r0 = 10
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    public C1933t(p366v0.AbstractC6484c r2) {
            r1 = this;
            r0 = 15
            r1.f8424Y = r0
            r1.<init>()
            r1.f8425Z = r2
            return
    }

    /* renamed from: A */
    public static final p083f.C1933t m4775A(p124h7.C2852s6 r1) {
            int r0 = r1.m7133r()
            if (r0 <= 0) goto Lc
            f.t r0 = new f.t
            r0.<init>(r1)
            return r0
        Lc:
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r0 = "empty keyset"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: D */
    public static /* synthetic */ void m4776D(p083f.C1933t r8, p124h7.C2752me r9, java.lang.String r10, java.lang.Boolean r11, p124h7.C2624fc r12, p124h7.InterfaceC2697jd r13) {
            r2 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r13
            r0.m4793y(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* renamed from: E */
    public static void m4777E(p083f.C1933t r8, p124h7.C2717kf r9, p124h7.C2624fc r10, p124h7.InterfaceC2697jd r11) {
            boolean r0 = r9.f11709Y
            r1 = 0
            if (r0 != 0) goto L10
            java.lang.String r0 = r9.f11720j0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            goto L10
        Le:
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            if (r0 == 0) goto L4d
            v9.j0 r8 = r9.m6949a()
            java.lang.String r11 = r9.f11713c0
            java.lang.String r0 = r9.f11722l0
            boolean r2 = r9.f11709Y
            if (r2 == 0) goto L28
            com.google.android.gms.common.api.Status r9 = new com.google.android.gms.common.api.Status
            r2 = 17012(0x4274, float:2.3839E-41)
            r3 = 0
            r9.<init>(r2, r3)
            goto L2e
        L28:
            java.lang.String r9 = r9.f11720j0
            com.google.android.gms.common.api.Status r9 = p074e9.C1805a.m4514B(r9)
        L2e:
            h7.va r2 = new h7.va
            r2.<init>(r9, r8, r11, r0)
            java.util.Objects.requireNonNull(r10)
            h7.pc r8 = r10.f11514a     // Catch: android.os.RemoteException -> L3c
            r8.mo6753O(r2)     // Catch: android.os.RemoteException -> L3c
            goto L4c
        L3c:
            r8 = move-exception
            r6.a r9 = r10.f11515b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = r9.f22479a
            java.lang.String r0 = "RemoteException when sending failure result with credential"
            java.lang.String r9 = r9.m12162c(r0, r10)
            android.util.Log.e(r11, r9, r8)
        L4c:
            return
        L4d:
            h7.me r1 = new h7.me
            java.lang.String r0 = r9.f11711a0
            java.lang.String r2 = r9.f11710Z
            long r3 = r9.f11712b0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "Bearer"
            r1.<init>(r0, r2, r3, r4)
            java.lang.String r2 = r9.f11715e0
            java.lang.String r3 = r9.f11714d0
            boolean r0 = r9.f11716f0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            v9.j0 r5 = r9.m6949a()
            r0 = r8
            r6 = r10
            r7 = r11
            r0.m4793y(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    /* renamed from: F */
    public static void m4778F(p083f.C1933t r9, p124h7.C2624fc r10, p124h7.C2752me r11, p124h7.C2536af r12, p124h7.InterfaceC2697jd r13) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r10, r0)
            java.lang.String r0 = r11.f11773Z
            h7.fd r1 = new h7.fd
            r2 = 4
            r1.<init>(r0, r2)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r9.f8425Z
            h7.kd r0 = (p124h7.AbstractC2715kd) r0
            h7.bb r8 = new h7.bb
            r2 = r8
            r3 = r9
            r4 = r13
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.mo6603g(r1, r8)
            return
    }

    /* renamed from: H */
    public static void m4779H(p083f.C1933t r9, p124h7.C2624fc r10, p124h7.C2752me r11, p124h7.C2644ge r12, p124h7.C2536af r13, p124h7.InterfaceC2697jd r14) {
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r10, r0)
            java.util.Objects.requireNonNull(r11, r0)
            java.util.Objects.requireNonNull(r12, r0)
            java.util.Objects.requireNonNull(r13, r0)
            java.util.Objects.requireNonNull(r14, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r9.f8425Z
            h7.kd r0 = (p124h7.AbstractC2715kd) r0
            h7.k3 r8 = new h7.k3
            r1 = r8
            r2 = r9
            r3 = r13
            r4 = r12
            r5 = r10
            r6 = r11
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.mo6607k(r13, r8)
            return
    }

    /* renamed from: K */
    public static final p083f.C1933t m4780K(p124h7.C2661hd r3, p124h7.InterfaceC2703k1 r4) {
            byte[] r3 = r3.m6808h()
            h7.mg r0 = p124h7.C2754mg.m6988a()
            h7.y5 r3 = p124h7.C2959y5.m7316u(r3, r0)
            h7.cg r0 = r3.m7319v()
            int r0 = r0.mo6474h()
            java.lang.String r1 = "empty keyset"
            if (r0 == 0) goto L49
            f.t r0 = new f.t
            h7.cg r3 = r3.m7319v()     // Catch: p124h7.C2611f -> L41
            byte[] r3 = r3.m6537C()     // Catch: p124h7.C2611f -> L41
            r2 = 0
            byte[] r2 = new byte[r2]     // Catch: p124h7.C2611f -> L41
            byte[] r3 = r4.mo6933a(r3, r2)     // Catch: p124h7.C2611f -> L41
            h7.mg r4 = p124h7.C2754mg.m6988a()     // Catch: p124h7.C2611f -> L41
            h7.s6 r3 = p124h7.C2852s6.m7131x(r3, r4)     // Catch: p124h7.C2611f -> L41
            int r4 = r3.m7133r()     // Catch: p124h7.C2611f -> L41
            if (r4 <= 0) goto L3b
            r0.<init>(r3)
            return r0
        L3b:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException     // Catch: p124h7.C2611f -> L41
            r3.<init>(r1)     // Catch: p124h7.C2611f -> L41
            throw r3     // Catch: p124h7.C2611f -> L41
        L41:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "invalid keyset, corrupted key material"
            r3.<init>(r4)
            throw r3
        L49:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            r3.<init>(r1)
            throw r3
    }

    /* JADX WARN: Incorrect return type in method signature: (Lh7/cg;)TKeyProtoT; */
    /* renamed from: B */
    public p124h7.InterfaceC2935x m4781B(p124h7.AbstractC2574cg r2) {
            r1 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            v0.c r0 = (p366v0.AbstractC6484c) r0
            h7.x r2 = r0.mo7013i(r2)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            v0.c r0 = (p366v0.AbstractC6484c) r0
            r0.mo7016l(r2)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            v0.c r0 = (p366v0.AbstractC6484c) r0
            java.lang.Object r2 = r0.mo7014j(r2)
            return r2
    }

    /* renamed from: C */
    public p083f.C1933t m4782C() {
            r9 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r9.f8425Z
            h7.s6 r0 = (p124h7.C2852s6) r0
            if (r0 == 0) goto L127
            h7.p6 r0 = p124h7.C2852s6.m7129u()
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r9.f8425Z
            h7.s6 r1 = (p124h7.C2852s6) r1
            java.util.List r1 = r1.m7136y()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L103
            java.lang.Object r2 = r1.next()
            h7.r6 r2 = (p124h7.C2834r6) r2
            h7.j6 r4 = r2.m7076s()
            h7.i6 r5 = r4.m6859s()
            h7.i6 r6 = p124h7.EnumC2672i6.f11619b0
            if (r5 != r6) goto Lfb
            java.lang.String r5 = r4.m6861x()
            h7.cg r4 = r4.m6860w()
            r6 = 0
            h7.hd r7 = p124h7.C2650h2.m6776g(r5, r6)
            boolean r8 = r7 instanceof p124h7.C2560c2
            if (r8 == 0) goto Lde
            h7.c2 r7 = (p124h7.C2560c2) r7
            java.util.Objects.requireNonNull(r7)
            h7.mg r5 = p124h7.C2754mg.m6988a()     // Catch: p124h7.C2611f -> Ld5
            h7.r5 r4 = p124h7.C2833r5.m7062v(r4, r5)     // Catch: p124h7.C2611f -> Ld5
            p124h7.C2579d3.m6562i(r4)     // Catch: p124h7.C2611f -> Ld5
            h7.t5 r4 = r4.m7066w()     // Catch: p124h7.C2611f -> Ld5
            h7.s1<PublicKeyProtoT extends h7.x> r5 = r7.f11414b0     // Catch: p124h7.C2611f -> Ld5
            r5.mo6567g(r4)     // Catch: p124h7.C2611f -> Ld5
            h7.h6 r5 = p124h7.C2690j6.m6854r()     // Catch: p124h7.C2611f -> Ld5
            java.lang.String r7 = "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey"
            boolean r8 = r5.f11974a0     // Catch: p124h7.C2611f -> Ld5
            if (r8 == 0) goto L68
            r5.m7222d()     // Catch: p124h7.C2611f -> Ld5
            r5.f11974a0 = r3     // Catch: p124h7.C2611f -> Ld5
        L68:
            MessageType extends h7.yg<MessageType, BuilderType> r8 = r5.f11973Z     // Catch: p124h7.C2611f -> Ld5
            h7.j6 r8 = (p124h7.C2690j6) r8     // Catch: p124h7.C2611f -> Ld5
            p124h7.C2690j6.m6857y(r8, r7)     // Catch: p124h7.C2611f -> Ld5
            h7.cg r4 = r4.mo7141m()     // Catch: p124h7.C2611f -> Ld5
            boolean r7 = r5.f11974a0     // Catch: p124h7.C2611f -> Ld5
            if (r7 == 0) goto L7c
            r5.m7222d()     // Catch: p124h7.C2611f -> Ld5
            r5.f11974a0 = r3     // Catch: p124h7.C2611f -> Ld5
        L7c:
            MessageType extends h7.yg<MessageType, BuilderType> r7 = r5.f11973Z     // Catch: p124h7.C2611f -> Ld5
            h7.j6 r7 = (p124h7.C2690j6) r7     // Catch: p124h7.C2611f -> Ld5
            p124h7.C2690j6.m6858z(r7, r4)     // Catch: p124h7.C2611f -> Ld5
            h7.i6 r4 = p124h7.EnumC2672i6.f11620c0     // Catch: p124h7.C2611f -> Ld5
            boolean r7 = r5.f11974a0     // Catch: p124h7.C2611f -> Ld5
            if (r7 == 0) goto L8e
            r5.m7222d()     // Catch: p124h7.C2611f -> Ld5
            r5.f11974a0 = r3     // Catch: p124h7.C2611f -> Ld5
        L8e:
            MessageType extends h7.yg<MessageType, BuilderType> r7 = r5.f11973Z     // Catch: p124h7.C2611f -> Ld5
            h7.j6 r7 = (p124h7.C2690j6) r7     // Catch: p124h7.C2611f -> Ld5
            p124h7.C2690j6.m6853A(r7, r4)     // Catch: p124h7.C2611f -> Ld5
            h7.yg r4 = r5.m7220b()     // Catch: p124h7.C2611f -> Ld5
            h7.j6 r4 = (p124h7.C2690j6) r4     // Catch: p124h7.C2611f -> Ld5
            java.lang.String r5 = r4.m6861x()
            h7.cg r7 = r4.m6860w()
            p124h7.C2650h2.m6778i(r5, r7, r6)
            h7.q6 r5 = p124h7.C2834r6.m7070v()
            r5.m7219a(r2)
            boolean r2 = r5.f11974a0
            if (r2 == 0) goto Lb6
            r5.m7222d()
            r5.f11974a0 = r3
        Lb6:
            MessageType extends h7.yg<MessageType, BuilderType> r2 = r5.f11973Z
            h7.r6 r2 = (p124h7.C2834r6) r2
            p124h7.C2834r6.m7072y(r2, r4)
            h7.yg r2 = r5.m7220b()
            h7.r6 r2 = (p124h7.C2834r6) r2
            boolean r4 = r0.f11974a0
            if (r4 == 0) goto Lcc
            r0.m7222d()
            r0.f11974a0 = r3
        Lcc:
            MessageType extends h7.yg<MessageType, BuilderType> r3 = r0.f11973Z
            h7.s6 r3 = (p124h7.C2852s6) r3
            p124h7.C2852s6.m7128A(r3, r2)
            goto L16
        Ld5:
            r0 = move-exception
            java.security.GeneralSecurityException r1 = new java.security.GeneralSecurityException
            java.lang.String r2 = "expected serialized proto of type "
            r1.<init>(r2, r0)
            throw r1
        Lde:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 48
            r2.<init>(r1)
            java.lang.String r1 = "manager for key type "
            java.lang.String r3 = " is not a PrivateKeyManager"
            java.lang.String r1 = p083f.C1932s.m4774a(r2, r1, r5, r3)
            r0.<init>(r1)
            throw r0
        Lfb:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "The keyset contains a non-private key"
            r0.<init>(r1)
            throw r0
        L103:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r9.f8425Z
            h7.s6 r1 = (p124h7.C2852s6) r1
            int r1 = r1.m7134s()
            boolean r2 = r0.f11974a0
            if (r2 == 0) goto L114
            r0.m7222d()
            r0.f11974a0 = r3
        L114:
            MessageType extends h7.yg<MessageType, BuilderType> r2 = r0.f11973Z
            h7.s6 r2 = (p124h7.C2852s6) r2
            p124h7.C2852s6.m7132z(r2, r1)
            f.t r1 = new f.t
            h7.yg r0 = r0.m7220b()
            h7.s6 r0 = (p124h7.C2852s6) r0
            r1.<init>(r0)
            return r1
        L127:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r1 = "cleartext keyset is not available"
            r0.<init>(r1)
            throw r0
    }

    /* renamed from: G */
    public <P> P m4783G(java.lang.Class<P> r15) {
            r14 = this;
            h7.k6 r0 = p124h7.EnumC2708k6.f11699a0
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, h7.b2<?, ?>> r1 = p124h7.C2650h2.f11572e
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r1 = r1.get(r15)
            h7.b2 r1 = (p124h7.InterfaceC2542b2) r1
            r2 = 0
            if (r1 != 0) goto L11
            r1 = r2
            goto L15
        L11:
            java.lang.Class r1 = r1.mo6477a()
        L15:
            java.lang.String r3 = "No wrapper found for "
            if (r1 != 0) goto L33
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.String r15 = r15.getName()
            int r1 = r15.length()
            if (r1 == 0) goto L2a
            java.lang.String r15 = r3.concat(r15)
            goto L2f
        L2a:
            java.lang.String r15 = new java.lang.String
            r15.<init>(r3)
        L2f:
            r0.<init>(r15)
            throw r0
        L33:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r14.f8425Z
            h7.s6 r4 = (p124h7.C2852s6) r4
            int r5 = p124h7.C2668i2.f11608a
            int r5 = r4.m7134s()
            java.util.List r4 = r4.m7136y()
            java.util.Iterator r4 = r4.iterator()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 1
        L4a:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Ldf
            java.lang.Object r11 = r4.next()
            h7.r6 r11 = (p124h7.C2834r6) r11
            h7.k6 r12 = r11.m7077u()
            if (r12 != r0) goto L4a
            boolean r12 = r11.m7074C()
            if (r12 == 0) goto Lc7
            h7.d7 r12 = r11.m7078x()
            h7.d7 r13 = p124h7.EnumC2583d7.f11441Z
            if (r12 == r13) goto Laf
            h7.k6 r12 = r11.m7077u()
            h7.k6 r13 = p124h7.EnumC2708k6.f11698Z
            if (r12 == r13) goto L97
            int r12 = r11.m7075r()
            if (r12 != r5) goto L84
            if (r9 != 0) goto L7c
            r9 = 1
            goto L84
        L7c:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset contains multiple primary keys"
            r15.<init>(r0)
            throw r15
        L84:
            h7.j6 r11 = r11.m7076s()
            h7.i6 r11 = r11.m6859s()
            h7.i6 r12 = p124h7.EnumC2672i6.f11620c0
            if (r11 == r12) goto L92
            r11 = 0
            goto L93
        L92:
            r11 = 1
        L93:
            r10 = r10 & r11
            int r8 = r8 + 1
            goto L4a
        L97:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.m7075r()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown status"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        Laf:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.m7075r()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has unknown prefix"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        Lc7:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r1 = r11.m7075r()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r6] = r1
            java.lang.String r1 = "key %d has no key data"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r15.<init>(r0)
            throw r15
        Ldf:
            if (r8 == 0) goto L269
            if (r9 != 0) goto Lee
            if (r10 == 0) goto Le6
            goto Lee
        Le6:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset doesn't contain a valid primary key"
            r15.<init>(r0)
            throw r15
        Lee:
            androidx.fragment.app.l0 r4 = new androidx.fragment.app.l0
            r4.<init>(r1)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r5 = r14.f8425Z
            h7.s6 r5 = (p124h7.C2852s6) r5
            java.util.List r5 = r5.m7136y()
            java.util.Iterator r5 = r5.iterator()
        Lff:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L1f2
            java.lang.Object r8 = r5.next()
            h7.r6 r8 = (p124h7.C2834r6) r8
            h7.k6 r9 = r8.m7077u()
            if (r9 != r0) goto Lff
            h7.j6 r9 = r8.m7076s()
            java.lang.String r10 = r9.m6861x()
            h7.cg r9 = r9.m6860w()
            java.lang.Object r9 = p124h7.C2650h2.m6778i(r10, r9, r1)
            h7.k6 r10 = r8.m7077u()
            if (r10 != r0) goto L1ea
            h7.z1 r10 = new h7.z1
            h7.d7 r11 = r8.m7078x()
            int r11 = r11.ordinal()
            r12 = 5
            if (r11 == r7) goto L152
            r13 = 2
            if (r11 == r13) goto L149
            r13 = 3
            if (r11 == r13) goto L146
            r13 = 4
            if (r11 != r13) goto L13e
            goto L149
        L13e:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "unknown output prefix type"
            r15.<init>(r0)
            throw r15
        L146:
            byte[] r11 = p124h7.C2721l1.f11727a
            goto L166
        L149:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r11 = r11.put(r6)
            goto L15a
        L152:
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r11 = r11.put(r7)
        L15a:
            int r12 = r8.m7075r()
            java.nio.ByteBuffer r11 = r11.putInt(r12)
            byte[] r11 = r11.array()
        L166:
            h7.k6 r12 = r8.m7077u()
            h7.d7 r13 = r8.m7078x()
            r10.<init>(r9, r11, r12, r13)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r10)
            h7.a2 r11 = new h7.a2
            byte[] r12 = r10.f12048b
            if (r12 != 0) goto L181
            r12 = r2
            goto L186
        L181:
            int r13 = r12.length
            byte[] r12 = java.util.Arrays.copyOf(r12, r13)
        L186:
            r11.<init>(r12)
            java.util.ArrayList<androidx.fragment.app.n> r12 = r4.f2230Z
            java.util.concurrent.ConcurrentMap r12 = (java.util.concurrent.ConcurrentMap) r12
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            java.lang.Object r9 = r12.put(r11, r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L1af
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r12.addAll(r9)
            r12.add(r10)
            java.util.ArrayList<androidx.fragment.app.n> r9 = r4.f2230Z
            java.util.concurrent.ConcurrentMap r9 = (java.util.concurrent.ConcurrentMap) r9
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r9.put(r11, r12)
        L1af:
            int r8 = r8.m7075r()
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r9 = r14.f8425Z
            h7.s6 r9 = (p124h7.C2852s6) r9
            int r9 = r9.m7134s()
            if (r8 != r9) goto Lff
            h7.k6 r8 = r10.f12049c
            if (r8 != r0) goto L1e2
            byte[] r8 = r10.f12048b
            if (r8 != 0) goto L1c7
            r8 = r2
            goto L1cc
        L1c7:
            int r9 = r8.length
            byte[] r8 = java.util.Arrays.copyOf(r8, r9)
        L1cc:
            java.util.List r8 = r4.m1268Z(r8)
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L1da
            r4.f2231a0 = r10
            goto Lff
        L1da:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry cannot be set to an entry which is not held by this primitive set"
            r15.<init>(r0)
            throw r15
        L1e2:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "the primary entry has to be ENABLED"
            r15.<init>(r0)
            throw r15
        L1ea:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "only ENABLED key is allowed"
            r15.<init>(r0)
            throw r15
        L1f2:
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, h7.b2<?, ?>> r0 = p124h7.C2650h2.f11572e
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r15 = r0.get(r15)
            h7.b2 r15 = (p124h7.InterfaceC2542b2) r15
            if (r15 != 0) goto L21c
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.Object r0 = r4.f2232b0
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = r0.getName()
            int r1 = r0.length()
            if (r1 == 0) goto L213
            java.lang.String r0 = r3.concat(r0)
            goto L218
        L213:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L218:
            r15.<init>(r0)
            throw r15
        L21c:
            java.lang.Class r0 = r15.mo6477a()
            java.lang.Object r1 = r4.f2232b0
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L22f
            java.lang.Object r15 = r15.mo6479c(r4)
            return r15
        L22f:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException
            java.lang.Class r15 = r15.mo6477a()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.Object r1 = r4.f2232b0
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r2 = r15.length()
            int r3 = r1.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 44
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Wrong input primitive class, expected "
            r4.append(r2)
            r4.append(r15)
            java.lang.String r15 = ", got "
            r4.append(r15)
            r4.append(r1)
            java.lang.String r15 = r4.toString()
            r0.<init>(r15)
            throw r0
        L269:
            java.security.GeneralSecurityException r15 = new java.security.GeneralSecurityException
            java.lang.String r0 = "keyset must contain at least one ENABLED key"
            r15.<init>(r0)
            throw r15
    }

    /* renamed from: I */
    public void m4784I(p124h7.InterfaceC2883u1 r5, p124h7.InterfaceC2703k1 r6) {
            r4 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.s6 r0 = (p124h7.C2852s6) r0
            byte[] r1 = r0.mo7142p()
            r2 = 0
            byte[] r3 = new byte[r2]
            byte[] r1 = r6.mo6934b(r1, r3)
            byte[] r3 = new byte[r2]     // Catch: p124h7.C2611f -> L61
            byte[] r6 = r6.mo6933a(r1, r3)     // Catch: p124h7.C2611f -> L61
            h7.mg r3 = p124h7.C2754mg.m6988a()     // Catch: p124h7.C2611f -> L61
            h7.s6 r6 = p124h7.C2852s6.m7131x(r6, r3)     // Catch: p124h7.C2611f -> L61
            boolean r6 = r6.equals(r0)     // Catch: p124h7.C2611f -> L61
            if (r6 == 0) goto L59
            h7.x5 r6 = p124h7.C2959y5.m7314r()
            h7.cg r1 = p124h7.AbstractC2574cg.m6536z(r1)
            boolean r3 = r6.f11974a0
            if (r3 == 0) goto L34
            r6.m7222d()
            r6.f11974a0 = r2
        L34:
            MessageType extends h7.yg<MessageType, BuilderType> r3 = r6.f11973Z
            h7.y5 r3 = (p124h7.C2959y5) r3
            p124h7.C2959y5.m7317w(r3, r1)
            h7.w6 r0 = p124h7.C2668i2.m6825a(r0)
            boolean r1 = r6.f11974a0
            if (r1 == 0) goto L48
            r6.m7222d()
            r6.f11974a0 = r2
        L48:
            MessageType extends h7.yg<MessageType, BuilderType> r1 = r6.f11973Z
            h7.y5 r1 = (p124h7.C2959y5) r1
            p124h7.C2959y5.m7318x(r1, r0)
            h7.yg r6 = r6.m7220b()
            h7.y5 r6 = (p124h7.C2959y5) r6
            r5.mo4787o(r6)
            return
        L59:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException     // Catch: p124h7.C2611f -> L61
            java.lang.String r6 = "cannot encrypt keyset"
            r5.<init>(r6)     // Catch: p124h7.C2611f -> L61
            throw r5     // Catch: p124h7.C2611f -> L61
        L61:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            java.lang.String r6 = "invalid keyset, corrupted key material"
            r5.<init>(r6)
            throw r5
    }

    /* renamed from: J */
    public void m4785J(p124h7.InterfaceC2883u1 r5) {
            r4 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.s6 r0 = (p124h7.C2852s6) r0
            java.util.List r0 = r0.m7136y()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            h7.r6 r1 = (p124h7.C2834r6) r1
            h7.j6 r2 = r1.m7076s()
            h7.i6 r2 = r2.m6859s()
            h7.i6 r3 = p124h7.EnumC2672i6.f11617Z
            if (r2 == r3) goto L3d
            h7.j6 r2 = r1.m7076s()
            h7.i6 r2 = r2.m6859s()
            h7.i6 r3 = p124h7.EnumC2672i6.f11618a0
            if (r2 == r3) goto L3d
            h7.j6 r2 = r1.m7076s()
            h7.i6 r2 = r2.m6859s()
            h7.i6 r3 = p124h7.EnumC2672i6.f11619b0
            if (r2 == r3) goto L3d
            goto Lc
        L3d:
            java.security.GeneralSecurityException r5 = new java.security.GeneralSecurityException
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            h7.j6 r3 = r1.m7076s()
            h7.i6 r3 = r3.m6859s()
            java.lang.String r3 = r3.name()
            r0[r2] = r3
            r2 = 1
            h7.j6 r1 = r1.m7076s()
            java.lang.String r1 = r1.m6861x()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r5.<init>(r0)
            throw r5
        L66:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.s6 r0 = (p124h7.C2852s6) r0
            f.t r5 = (p083f.C1933t) r5
            r5.mo4786l(r0)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: a */
    public /* synthetic */ void mo2867a(p052d6.AbstractC1303e r2, int r3) {
            r1 = this;
            com.google.android.gms.cast.framework.a r2 = (com.google.android.gms.cast.framework.C1062a) r2
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            p072e7.C1624h1.m4210a(r0, r2, r3)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f8424Y
            java.lang.String r1 = "Bearer"
            switch(r0) {
                case 21: goto L33;
                case 22: goto L8;
                default: goto L7;
            }
        L7:
            goto L79
        L8:
            h7.be r11 = (p124h7.C2554be) r11
            java.lang.String r0 = r11.f11406Y
            long r2 = p052d6.C1310h0.m3800b(r0)
            h7.me r5 = new h7.me
            java.lang.String r0 = r11.f11407Z
            java.lang.String r11 = r11.f11406Y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.<init>(r0, r11, r2, r1)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r11 = r10.f8425Z
            androidx.fragment.app.l0 r11 = (androidx.fragment.app.C0392l0) r11
            java.lang.Object r0 = r11.f2232b0
            r4 = r0
            f.t r4 = (p083f.C1933t) r4
            r6 = 0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r11 = r11.f2231a0
            r8 = r11
            h7.fc r8 = (p124h7.C2624fc) r8
            r9 = r10
            m4776D(r4, r5, r6, r7, r8, r9)
            return
        L33:
            h7.qf r11 = (p124h7.C2825qf) r11
            java.lang.String r0 = r11.f11871Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L69
            java.lang.String r0 = r11.f11872Z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L46
            goto L69
        L46:
            java.lang.String r0 = r11.f11871Y
            long r2 = p052d6.C1310h0.m3800b(r0)
            h7.me r5 = new h7.me
            java.lang.String r0 = r11.f11872Z
            java.lang.String r11 = r11.f11871Y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r5.<init>(r0, r11, r2, r1)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r11 = r10.f8425Z
            h7.db r11 = (p124h7.C2587db) r11
            f.t r4 = r11.f11453b0
            r6 = 0
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            h7.fc r8 = r11.f11452a0
            r9 = r10
            m4776D(r4, r5, r6, r7, r8, r9)
            goto L78
        L69:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r11 = r10.f8425Z
            h7.db r11 = (p124h7.C2587db) r11
            h7.fc r11 = r11.f11452a0
            java.lang.String r0 = "INTERNAL_SUCCESS_SIGN_OUT"
            com.google.android.gms.common.api.Status r0 = p074e9.C1805a.m4514B(r0)
            r11.mo6716d(r0)
        L78:
            return
        L79:
            h7.me r11 = (p124h7.C2752me) r11
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r10.f8425Z
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo28b(r11)
            return
    }

    @Override // p218m6.InterfaceC4396i
    /* renamed from: c */
    public void mo813c(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.f8424Y
            r1 = 0
            switch(r0) {
                case 9: goto Lc9;
                case 10: goto Lb0;
                case 11: goto L99;
                case 25: goto L7e;
                case 26: goto L54;
                case 27: goto L2e;
                case 28: goto L8;
                default: goto L6;
            }
        L6:
            goto Lfa
        L8:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.pb r0 = (p124h7.C2803pb) r0
            h7.gc r5 = (p124h7.InterfaceC2642gc) r5
            s7.j r6 = (p327s7.C5986j) r6
            h7.hd r1 = new h7.hd
            r1.<init>(r0, r6)
            r0.f11640m = r1
            h7.tc r5 = r5.m6747j()
            h7.i9 r6 = new h7.i9
            v9.o r1 = r0.f11631d
            java.lang.String r1 = r1.mo13472h0()
            v9.v r2 = r0.f11833n
            r6.<init>(r1, r2)
            h7.gd r0 = r0.f11629b
            r5.mo6873b2(r6, r0)
            return
        L2e:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.ob r0 = (p124h7.C2785ob) r0
            h7.gc r5 = (p124h7.InterfaceC2642gc) r5
            s7.j r6 = (p327s7.C5986j) r6
            h7.hd r1 = new h7.hd
            r1.<init>(r0, r6)
            r0.f11640m = r1
            h7.tc r5 = r5.m6747j()
            h7.g9 r6 = new h7.g9
            v9.o r1 = r0.f11631d
            java.lang.String r1 = r1.mo13472h0()
            h7.if r2 = r0.f11804n
            r6.<init>(r1, r2)
            h7.gd r0 = r0.f11629b
            r5.mo6874i0(r6, r0)
            return
        L54:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.nb r0 = (p124h7.C2767nb) r0
            h7.gc r5 = (p124h7.InterfaceC2642gc) r5
            s7.j r6 = (p327s7.C5986j) r6
            h7.hd r1 = new h7.hd
            r1.<init>(r0, r6)
            r0.f11640m = r1
            h7.tc r5 = r5.m6747j()
            h7.e9 r6 = new h7.e9
            v9.e r1 = r0.f11787n
            java.lang.String r2 = r1.f25775Y
            java.lang.String r1 = r1.f25776Z
            v9.o r3 = r0.f11631d
            java.lang.String r3 = r3.mo13472h0()
            r6.<init>(r2, r1, r3)
            h7.gd r0 = r0.f11629b
            r5.mo6871O0(r6, r0)
            return
        L7e:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.mb r0 = (p124h7.C2749mb) r0
            h7.gc r5 = (p124h7.InterfaceC2642gc) r5
            s7.j r6 = (p327s7.C5986j) r6
            h7.hd r1 = new h7.hd
            r1.<init>(r0, r6)
            r0.f11640m = r1
            h7.tc r5 = r5.m6747j()
            h7.a9 r6 = r0.f11769n
            h7.gd r0 = r0.f11629b
            r5.mo6870N1(r6, r0)
            return
        L99:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            c7.h r0 = (p037c7.C0932h) r0
            c7.i r5 = (p037c7.C0933i) r5
            s7.j r6 = (p327s7.C5986j) r6
            android.os.IInterface r5 = r5.m11053y()
            c7.e r5 = (p037c7.InterfaceC0929e) r5
            c7.j r0 = new c7.j
            r0.<init>(r6)
            r5.mo2634y0(r0)
            return
        Lb0:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            o6.r r0 = (p248o6.C4930r) r0
            q6.d r5 = (p286q6.C5581d) r5
            s7.j r6 = (p327s7.C5986j) r6
            l6.a<l6.a$c$c> r2 = p286q6.C5580c.f21728j
            android.os.IInterface r5 = r5.m11053y()
            q6.b r5 = (p286q6.InterfaceC5579b) r5
            r5.mo11868T(r0)
            s7.q<TResult> r5 = r6.f23075a
            r5.m12473r(r1)
            return
        Lc9:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            com.google.android.gms.cast.d r0 = (com.google.android.gms.cast.C1060d) r0
            h6.e0 r5 = (p123h6.C2496e0) r5
            s7.j r6 = (p327s7.C5986j) r6
            android.os.IInterface r2 = r5.m11053y()
            h6.e r2 = (p123h6.C2495e) r2
            com.google.android.gms.cast.c r0 = r0.f5419j
            android.os.Parcel r3 = r2.m3834k2()
            p072e7.C1632i.m4227d(r3, r0)
            r0 = 18
            r2.m3838o2(r0, r3)
            android.os.IInterface r5 = r5.m11053y()
            h6.e r5 = (p123h6.C2495e) r5
            android.os.Parcel r0 = r5.m3834k2()
            r2 = 17
            r5.m3838o2(r2, r0)
            s7.q<TResult> r5 = r6.f23075a
            r5.m12473r(r1)
            return
        Lfa:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            h7.qb r0 = (p124h7.C2821qb) r0
            h7.gc r5 = (p124h7.InterfaceC2642gc) r5
            s7.j r6 = (p327s7.C5986j) r6
            h7.hd r1 = new h7.hd
            r1.<init>(r0, r6)
            r0.f11640m = r1
            h7.da r6 = new h7.da
            v9.e r1 = r0.f11854n
            v9.o r2 = r0.f11631d
            java.util.Objects.requireNonNull(r1)
            java.lang.String r2 = r2.mo13472h0()
            r1.f25778b0 = r2
            r2 = 1
            r1.f25779c0 = r2
            r6.<init>(r1)
            h7.tc r5 = r5.m6747j()
            h7.gd r0 = r0.f11629b
            r5.mo6875j0(r6, r0)
            return
    }

    @Override // p180k2.InterfaceC3669a
    /* renamed from: d */
    public boolean mo814d(java.lang.Object r5, java.io.File r6, p180k2.C3673e r7) {
            r4 = this;
            java.io.InputStream r5 = (java.io.InputStream) r5
            java.lang.String r7 = "StreamEncoder"
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            n2.b r0 = (p229n2.InterfaceC4672b) r0
            java.lang.Class<byte[]> r1 = byte[].class
            r2 = 65536(0x10000, float:9.1835E-41)
            java.lang.Object r0 = r0.mo10688e(r2, r1)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L33
        L19:
            int r6 = r5.read(r0)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r2 = -1
            if (r6 == r2) goto L24
            r3.write(r0, r1, r6)     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            goto L19
        L24:
            r3.close()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L2e
            r1 = 1
            r3.close()     // Catch: java.io.IOException -> L45
            goto L45
        L2c:
            r5 = move-exception
            goto L4e
        L2e:
            r5 = move-exception
            r2 = r3
            goto L34
        L31:
            r5 = move-exception
            goto L4d
        L33:
            r5 = move-exception
        L34:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L40
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch: java.lang.Throwable -> L31
        L40:
            if (r2 == 0) goto L45
            r2.close()     // Catch: java.io.IOException -> L45
        L45:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r5 = r4.f8425Z
            n2.b r5 = (p229n2.InterfaceC4672b) r5
            r5.mo10687d(r0)
            return r1
        L4d:
            r3 = r2
        L4e:
            if (r3 == 0) goto L53
            r3.close()     // Catch: java.io.IOException -> L53
        L53:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r6 = r4.f8425Z
            n2.b r6 = (p229n2.InterfaceC4672b) r6
            r6.mo10687d(r0)
            throw r5
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f8424Y
            switch(r0) {
                case 21: goto L16;
                case 22: goto L6;
                default: goto L5;
            }
        L5:
            goto L24
        L6:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            androidx.fragment.app.l0 r0 = (androidx.fragment.app.C0392l0) r0
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r0.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
        L16:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            h7.db r0 = (p124h7.C2587db) r0
            h7.fc r0 = r0.f11452a0
            r0.mo6716d(r2)
            return
        L24:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: f */
    public void mo2872f(p052d6.AbstractC1303e r5) {
            r4 = this;
            com.google.android.gms.cast.framework.a r5 = (com.google.android.gms.cast.framework.C1062a) r5
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            e7.q1 r0 = r0.f7579f
            if (r0 == 0) goto L1a
            h6.b r0 = p072e7.C1624h1.f7573g
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r0.f11253a
            java.lang.String r3 = "Start a session while there's already an active session. Create a new one."
            java.lang.String r0 = r0.m6380e(r3, r1)
            android.util.Log.w(r2, r0)
        L1a:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            r0.m4214e(r5)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r5 = r4.f8425Z
            r0 = r5
            e7.h1 r0 = (p072e7.C1624h1) r0
            e7.a2 r0 = r0.f7575b
            e7.h1 r5 = (p072e7.C1624h1) r5
            e7.q1 r5 = r5.f7579f
            e7.y2 r0 = r0.m4116b(r5)
            int r5 = r5.f7753h
            r1 = 1
            if (r5 != r1) goto L4b
            e7.t2 r5 = r0.m4491f()
            e7.s2 r5 = p072e7.C1744t2.m4440l(r5)
            r1 = 17
            r5.m4435f(r1)
            e7.x5 r5 = r5.m4459c()
            e7.t2 r5 = (p072e7.C1744t2) r5
            r0.m4493o(r5)
        L4b:
            e7.x5 r5 = r0.m4459c()
            e7.z2 r5 = (p072e7.C1798z2) r5
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r4.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            e7.l r0 = r0.f7574a
            r1 = 221(0xdd, float:3.1E-43)
            r0.m4321a(r5, r1)
            return
    }

    @Override // p425y2.InterfaceC7105b
    /* renamed from: g */
    public p214m2.InterfaceC4345w<android.graphics.drawable.BitmapDrawable> mo1272g(p214m2.InterfaceC4345w<android.graphics.Bitmap> r1, p180k2.C3673e r2) {
            r0 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r2 = r0.f8425Z
            android.content.res.Resources r2 = (android.content.res.Resources) r2
            m2.w r1 = p334t2.C6126d.m12653e(r2, r1)
            return r1
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r8 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r8.f8425Z
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            d4.a r0 = (p050d4.InterfaceC1277a) r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            t3.d r2 = p335t3.EnumC6151d.f23742Y
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a$a r3 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.m2819a()
            r4 = 30000(0x7530, double:1.4822E-319)
            r3.mo2816b(r4)
            r4 = 86400000(0x5265c00, double:4.2687272E-316)
            r3.mo2817c(r4)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a r3 = r3.mo2815a()
            r1.put(r2, r3)
            t3.d r2 = p335t3.EnumC6151d.f23744a0
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a$a r3 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.m2819a()
            r6 = 1000(0x3e8, double:4.94E-321)
            r3.mo2816b(r6)
            r3.mo2817c(r4)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a r3 = r3.mo2815a()
            r1.put(r2, r3)
            t3.d r2 = p335t3.EnumC6151d.f23743Z
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a$a r3 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.a.m2819a()
            r3.mo2816b(r4)
            r3.mo2817c(r4)
            r4 = 2
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b[] r4 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b[r4]
            r5 = 0
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5245Y
            r4[r5] = r6
            r5 = 1
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$b r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC1044c.b.f5246Z
            r4[r5] = r6
            java.util.HashSet r5 = new java.util.HashSet
            java.util.List r4 = java.util.Arrays.asList(r4)
            r5.<init>(r4)
            java.util.Set r4 = java.util.Collections.unmodifiableSet(r5)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b r3 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.C1043b.b) r3
            java.lang.String r5 = "Null flags"
            java.util.Objects.requireNonNull(r4, r5)
            r3.f5244c = r4
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c$a r3 = r3.mo2815a()
            r1.put(r2, r3)
            java.lang.String r2 = "missing required property: clock"
            java.util.Objects.requireNonNull(r0, r2)
            java.util.Set r2 = r1.keySet()
            int r2 = r2.size()
            t3.d[] r3 = p335t3.EnumC6151d.values()
            int r3 = r3.length
            if (r2 < r3) goto L91
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.a r2 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.a
            r2.<init>(r0, r1)
            return r2
        L91:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Not all priorities have been configured"
            r0.<init>(r1)
            throw r0
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: h */
    public void mo2874h(p052d6.AbstractC1303e r10, java.lang.String r11) {
            r9 = this;
            com.google.android.gms.cast.framework.a r10 = (com.google.android.gms.cast.framework.C1062a) r10
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r10 = r9.f8425Z
            e7.h1 r10 = (p072e7.C1624h1) r10
            android.content.SharedPreferences r0 = r10.f7578e
            boolean r1 = r10.m4216g(r11)
            r2 = 0
            java.lang.String r3 = "null reference"
            if (r1 == 0) goto L21
            h6.b r11 = p072e7.C1624h1.f7573g
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Use the existing ApplicationAnalyticsSession if it is available and valid."
            r11.m6376a(r1, r0)
            e7.q1 r10 = r10.f7579f
            java.util.Objects.requireNonNull(r10, r3)
            goto Ld4
        L21:
            h6.b r1 = p072e7.C1714q1.f7744i
            r1 = 0
            if (r0 != 0) goto L28
            goto L95
        L28:
            e7.q1 r4 = new e7.q1
            r4.<init>()
            java.lang.String r5 = "application_id"
            boolean r6 = r0.contains(r5)
            if (r6 != 0) goto L36
            goto L95
        L36:
            java.lang.String r6 = ""
            java.lang.String r5 = r0.getString(r5, r6)
            r4.f7746a = r5
            java.lang.String r5 = "receiver_metrics_id"
            boolean r7 = r0.contains(r5)
            if (r7 != 0) goto L47
            goto L95
        L47:
            java.lang.String r5 = r0.getString(r5, r6)
            r4.f7747b = r5
            java.lang.String r5 = "analytics_session_id"
            boolean r7 = r0.contains(r5)
            if (r7 != 0) goto L56
            goto L95
        L56:
            r7 = 0
            long r7 = r0.getLong(r5, r7)
            r4.f7748c = r7
            java.lang.String r5 = "event_sequence_number"
            boolean r7 = r0.contains(r5)
            if (r7 != 0) goto L67
            goto L95
        L67:
            int r5 = r0.getInt(r5, r2)
            r4.f7749d = r5
            java.lang.String r5 = "receiver_session_id"
            boolean r7 = r0.contains(r5)
            if (r7 != 0) goto L76
            goto L95
        L76:
            java.lang.String r1 = r0.getString(r5, r6)
            r4.f7750e = r1
            java.lang.String r1 = "device_capabilities"
            int r1 = r0.getInt(r1, r2)
            r4.f7751f = r1
            java.lang.String r1 = "device_model_name"
            java.lang.String r1 = r0.getString(r1, r6)
            r4.f7752g = r1
            java.lang.String r1 = "analytics_session_start_type"
            int r0 = r0.getInt(r1, r2)
            r4.f7753h = r0
            r1 = r4
        L95:
            r10.f7579f = r1
            boolean r0 = r10.m4216g(r11)
            r4 = 1
            if (r0 == 0) goto Lb5
            h6.b r11 = p072e7.C1624h1.f7573g
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Use the restored ApplicationAnalyticsSession if it is valid."
            r11.m6376a(r1, r0)
            e7.q1 r11 = r10.f7579f
            java.util.Objects.requireNonNull(r11, r3)
            e7.q1 r10 = r10.f7579f
            long r10 = r10.f7748c
            long r10 = r10 + r4
            p072e7.C1714q1.f7745j = r10
            goto Ld4
        Lb5:
            h6.b r0 = p072e7.C1624h1.f7573g
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "The restored ApplicationAnalyticsSession is not valid, create a new one."
            r0.m6376a(r2, r1)
            e7.q1 r0 = new e7.q1
            r0.<init>()
            long r1 = p072e7.C1714q1.f7745j
            long r1 = r1 + r4
            p072e7.C1714q1.f7745j = r1
            r10.f7579f = r0
            java.lang.String r1 = p072e7.C1624h1.m4212c()
            r0.f7746a = r1
            e7.q1 r10 = r10.f7579f
            r10.f7750e = r11
        Ld4:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r10 = r9.f8425Z
            e7.h1 r10 = (p072e7.C1624h1) r10
            e7.q1 r10 = r10.f7579f
            java.util.Objects.requireNonNull(r10, r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r10 = r9.f8425Z
            r11 = r10
            e7.h1 r11 = (p072e7.C1624h1) r11
            e7.a2 r11 = r11.f7575b
            e7.h1 r10 = (p072e7.C1624h1) r10
            e7.q1 r10 = r10.f7579f
            e7.y2 r10 = r11.m4116b(r10)
            e7.t2 r11 = r10.m4491f()
            e7.s2 r11 = p072e7.C1744t2.m4440l(r11)
            r0 = 10
            r11.m4435f(r0)
            e7.x5 r11 = r11.m4459c()
            e7.t2 r11 = (p072e7.C1744t2) r11
            r10.m4493o(r11)
            r11 = 1
            p072e7.C1555a2.m4114c(r10, r11)
            e7.x5 r10 = r10.m4459c()
            e7.z2 r10 = (p072e7.C1798z2) r10
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r11 = r9.f8425Z
            e7.h1 r11 = (p072e7.C1624h1) r11
            e7.l r11 = r11.f7574a
            r0 = 226(0xe2, float:3.17E-43)
            r11.m4321a(r10, r0)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: i */
    public /* synthetic */ void mo2875i(p052d6.AbstractC1303e r2, int r3) {
            r1 = this;
            com.google.android.gms.cast.framework.a r2 = (com.google.android.gms.cast.framework.C1062a) r2
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            p072e7.C1624h1.m4210a(r0, r2, r3)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: j */
    public /* synthetic */ void mo2876j(p052d6.AbstractC1303e r2, int r3) {
            r1 = this;
            com.google.android.gms.cast.framework.a r2 = (com.google.android.gms.cast.framework.C1062a) r2
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            p072e7.C1624h1.m4210a(r0, r2, r3)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo2877k(p052d6.AbstractC1303e r1) {
            r0 = this;
            com.google.android.gms.cast.framework.a r1 = (com.google.android.gms.cast.framework.C1062a) r1
            return
    }

    @Override // p124h7.InterfaceC2883u1
    /* renamed from: l */
    public void mo4786l(p124h7.C2852s6 r4) {
            r3 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r3.f8425Z     // Catch: java.lang.Throwable -> L23
            java.io.OutputStream r0 = (java.io.OutputStream) r0     // Catch: java.lang.Throwable -> L23
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Throwable -> L23
            int r1 = r4.mo7243k()     // Catch: java.lang.Throwable -> L23
            java.util.logging.Logger r2 = p124h7.AbstractC2682ig.f11658c     // Catch: java.lang.Throwable -> L23
            r2 = 4096(0x1000, float:5.74E-42)
            if (r1 <= r2) goto L13
            r1 = 4096(0x1000, float:5.74E-42)
        L13:
            h7.hg r2 = new h7.hg     // Catch: java.lang.Throwable -> L23
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L23
            r4.m7334e(r2)     // Catch: java.lang.Throwable -> L23
            int r4 = r2.f11593g     // Catch: java.lang.Throwable -> L23
            if (r4 <= 0) goto L25
            r2.m6812D()     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r4 = move-exception
            goto L2d
        L25:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r3.f8425Z
            java.io.OutputStream r4 = (java.io.OutputStream) r4
            r4.close()
            return
        L2d:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r3.f8425Z
            java.io.OutputStream r0 = (java.io.OutputStream) r0
            r0.close()
            throw r4
    }

    @Override // p123h6.InterfaceC2509p
    /* renamed from: m */
    public void mo3032m(long r1) {
            r0 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r0.f8425Z
            h6.n r1 = (p123h6.C2507n) r1
            s7.j<c6.q> r1 = r1.f11324y
            s7.q<TResult> r1 = r1.f23075a
            r2 = 0
            r1.m12473r(r2)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: n */
    public void mo2880n(p052d6.AbstractC1303e r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.cast.framework.a r3 = (com.google.android.gms.cast.framework.C1062a) r3
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r2.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            h6.b r1 = p072e7.C1624h1.f7573g
            r0.m4213d(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            e7.q1 r0 = r3.f7579f
            r0.f7750e = r4
            e7.a2 r3 = r3.f7575b
            e7.y2 r3 = r3.m4116b(r0)
            e7.x5 r3 = r3.m4459c()
            e7.z2 r3 = (p072e7.C1798z2) r3
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r2.f8425Z
            e7.h1 r4 = (p072e7.C1624h1) r4
            e7.l r4 = r4.f7574a
            r0 = 222(0xde, float:3.11E-43)
            r4.m4321a(r3, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            p072e7.C1624h1.m4211b(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            android.os.Handler r4 = r3.f7577d
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Runnable r3 = r3.f7576c
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 300000(0x493e0, double:1.482197E-318)
            r4.postDelayed(r3, r0)
            return
    }

    @Override // p124h7.InterfaceC2883u1
    /* renamed from: o */
    public void mo4787o(p124h7.C2959y5 r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    @Override // p124h7.InterfaceC2685j1
    /* renamed from: p */
    public /* bridge */ /* synthetic */ java.util.Iterator mo4788p(p124h7.C2661hd r3, java.lang.CharSequence r4) {
            r2 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r2.f8425Z
            h7.xb r0 = (p124h7.AbstractC2947xb) r0
            h7.cc r0 = r0.mo7137d(r4)
            h7.a r1 = new h7.a
            r1.<init>(r3, r4, r0)
            return r1
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: q */
    public void mo2881q(p052d6.AbstractC1303e r3, int r4) {
            r2 = this;
            com.google.android.gms.cast.framework.a r3 = (com.google.android.gms.cast.framework.C1062a) r3
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r2.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            h6.b r1 = p072e7.C1624h1.f7573g
            r0.m4213d(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            e7.q1 r3 = r3.f7579f
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            r0 = r3
            e7.h1 r0 = (p072e7.C1624h1) r0
            e7.a2 r0 = r0.f7575b
            e7.h1 r3 = (p072e7.C1624h1) r3
            e7.q1 r3 = r3.f7579f
            e7.z2 r3 = r0.m4115a(r3, r4)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r2.f8425Z
            e7.h1 r4 = (p072e7.C1624h1) r4
            e7.l r4 = r4.f7574a
            r0 = 225(0xe1, float:3.15E-43)
            r4.m4321a(r3, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            p072e7.C1624h1.m4211b(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            android.os.Handler r4 = r3.f7577d
            java.lang.Runnable r3 = r3.f7576c
            r4.removeCallbacks(r3)
            return
    }

    @Override // p052d6.InterfaceC1307g
    /* renamed from: r */
    public void mo2882r(p052d6.AbstractC1303e r3, boolean r4) {
            r2 = this;
            com.google.android.gms.cast.framework.a r3 = (com.google.android.gms.cast.framework.C1062a) r3
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r2.f8425Z
            e7.h1 r0 = (p072e7.C1624h1) r0
            h6.b r1 = p072e7.C1624h1.f7573g
            r0.m4213d(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            e7.q1 r3 = r3.f7579f
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            e7.a2 r1 = r3.f7575b
            e7.q1 r3 = r3.f7579f
            e7.y2 r3 = r1.m4116b(r3)
            p072e7.C1555a2.m4114c(r3, r4)
            e7.x5 r3 = r3.m4459c()
            e7.z2 r3 = (p072e7.C1798z2) r3
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r2.f8425Z
            e7.h1 r4 = (p072e7.C1624h1) r4
            e7.l r4 = r4.f7574a
            r1 = 227(0xe3, float:3.18E-43)
            r4.m4321a(r3, r1)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            p072e7.C1624h1.m4211b(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            e7.h1 r3 = (p072e7.C1624h1) r3
            android.os.Handler r4 = r3.f7577d
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.Runnable r3 = r3.f7576c
            java.util.Objects.requireNonNull(r3, r0)
            r0 = 300000(0x493e0, double:1.482197E-318)
            r4.postDelayed(r3, r0)
            return
    }

    @Override // p123h6.InterfaceC2509p
    /* renamed from: t */
    public void mo3033t(long r1, int r3, java.lang.Object r4) {
            r0 = this;
            if (r3 == 0) goto L14
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r0.f8425Z
            h6.n r1 = (p123h6.C2507n) r1
            s7.j<c6.q> r1 = r1.f11324y
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "storing session is timeout"
            r2.<init>(r3)
            s7.q<TResult> r1 = r1.f23075a
            r1.m12472q(r2)
        L14:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.f8424Y
            switch(r0) {
                case 16: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r1.f8425Z
            h7.s6 r0 = (p124h7.C2852s6) r0
            h7.w6 r0 = p124h7.C2668i2.m6825a(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public boolean m4789u(java.lang.String r4) {
            r3 = this;
            r0 = 0
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r1 = r3.f8425Z     // Catch: java.lang.Throwable -> L10
            r2 = r1
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto L9
            return r0
        L9:
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch: java.lang.Throwable -> L10
            boolean r4 = r1.getBoolean(r4, r0)     // Catch: java.lang.Throwable -> L10
            return r4
        L10:
            r4 = move-exception
            java.lang.String r1 = "GmscoreFlag"
            java.lang.String r2 = "Error while reading from SharedPreferences "
            android.util.Log.w(r1, r2, r4)
            return r0
    }

    /* renamed from: v */
    public float m4790v(java.lang.Object r3, java.lang.String r4, int r5) {
            r2 = this;
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r2.f8425Z
            java.util.HashMap r0 = (java.util.HashMap) r0
            boolean r0 = r0.containsKey(r3)
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 != 0) goto Ld
            return r1
        Ld:
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r2.f8425Z
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r3 = r0.get(r3)
            java.util.HashMap r3 = (java.util.HashMap) r3
            boolean r0 = r3.containsKey(r4)
            if (r0 != 0) goto L1e
            return r1
        L1e:
            java.lang.Object r3 = r3.get(r4)
            float[] r3 = (float[]) r3
            int r4 = r3.length
            if (r4 <= r5) goto L2a
            r3 = r3[r5]
            return r3
        L2a:
            return r1
    }

    /* renamed from: w */
    public void m4791w(java.lang.String r3, p124h7.InterfaceC2697jd<p124h7.C2752me> r4) {
            r2 = this;
            com.google.android.gms.common.internal.C1101a.m3100e(r3)
            h7.me r3 = p124h7.C2752me.m6985X(r3)
            boolean r0 = r3.m6987Z()
            if (r0 == 0) goto L11
            r4.mo28b(r3)
            return
        L11:
            java.lang.String r3 = r3.f11772Y
            h7.de r0 = new h7.de
            r0.<init>(r3)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r3 = r2.f8425Z
            h7.kd r3 = (p124h7.AbstractC2715kd) r3
            f.t r1 = new f.t
            r1.<init>(r4)
            r3.mo6602f(r0, r1)
            return
    }

    /* renamed from: x */
    public void m4792x(p124h7.C2967yd r4, p124h7.C2624fc r5) {
            r3 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            java.util.Objects.requireNonNull(r5, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r3.f8425Z
            h7.kd r0 = (p124h7.AbstractC2715kd) r0
            h7.ab r1 = new h7.ab
            r2 = 2
            r1.<init>(r3, r5, r2)
            r0.mo6599c(r4, r1)
            return
    }

    /* renamed from: y */
    public void m4793y(p124h7.C2752me r13, java.lang.String r14, java.lang.String r15, java.lang.Boolean r16, p375v9.C6605j0 r17, p124h7.C2624fc r18, p124h7.InterfaceC2697jd r19) {
            r12 = this;
            r7 = r13
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r13, r0)
            r1 = r19
            java.util.Objects.requireNonNull(r1, r0)
            r6 = r18
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r0 = r7.f11773Z
            h7.fd r8 = new h7.fd
            r2 = 4
            r8.<init>(r0, r2)
            r9 = r12
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r9.f8425Z
            r10 = r0
            h7.kd r10 = (p124h7.AbstractC2715kd) r10
            a4.j r11 = new a4.j
            r0 = r11
            r1 = r19
            r2 = r15
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.mo6603g(r8, r11)
            return
    }

    /* renamed from: z */
    public void m4794z(p124h7.C2705k3 r4, p124h7.C2624fc r5) {
            r3 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            java.util.Objects.requireNonNull(r5, r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r0 = r3.f8425Z
            h7.kd r0 = (p124h7.AbstractC2715kd) r0
            h7.cb r1 = new h7.cb
            r2 = 8
            r1.<init>(r5, r2)
            r0.mo6604h(r4, r1)
            return
    }
}
