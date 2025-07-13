package p005a4;

/* renamed from: a4.j */
/* loaded from: classes.dex */
public final class C0021j implements bh.InterfaceC0769a, p124h7.InterfaceC2697jd, p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public final bh.InterfaceC0769a<android.content.Context> f44Y;

    /* renamed from: Z */
    public final bh.InterfaceC0769a<p405x3.InterfaceC6922d> f45Z;

    /* renamed from: a0 */
    public final bh.InterfaceC0769a<p021b4.InterfaceC0666c> f46a0;

    /* renamed from: b0 */
    public final bh.InterfaceC0769a<p005a4.InterfaceC0023l> f47b0;

    /* renamed from: c0 */
    public final bh.InterfaceC0769a<java.util.concurrent.Executor> f48c0;

    /* renamed from: d0 */
    public final bh.InterfaceC0769a<p034c4.InterfaceC0867b> f49d0;

    /* renamed from: e0 */
    public bh.InterfaceC0769a<p050d4.InterfaceC1277a> f50e0;

    public C0021j(bh.InterfaceC0769a r1, bh.InterfaceC0769a r2, bh.InterfaceC0769a r3, bh.InterfaceC0769a r4, bh.InterfaceC0769a r5, bh.InterfaceC0769a r6, bh.InterfaceC0769a r7) {
            r0 = this;
            r0.<init>()
            r0.f44Y = r1
            r0.f45Z = r2
            r0.f46a0 = r3
            r0.f47b0 = r4
            r0.f48c0 = r5
            r0.f49d0 = r6
            r0.f50e0 = r7
            return
    }

    public C0021j(p124h7.InterfaceC2697jd r1, java.lang.String r2, java.lang.String r3, java.lang.Boolean r4, p375v9.C6605j0 r5, p124h7.C2624fc r6, p124h7.C2752me r7) {
            r0 = this;
            r0.f44Y = r1
            r0.f45Z = r2
            r0.f46a0 = r3
            r0.f47b0 = r4
            r0.f48c0 = r5
            r0.f49d0 = r6
            r0.f50e0 = r7
            r0.<init>()
            return
    }

    public C0021j(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f44Y = r1
            java.lang.String r1 = "phone"
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f45Z = r1
            r0.f46a0 = r2
            r0.f47b0 = r3
            r0.f48c0 = r4
            r0.f49d0 = r5
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public java.lang.String mo27a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            bh.a<android.content.Context> r1 = r4.f44Y
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "idToken"
            r0.put(r2, r1)
            bh.a<x3.d> r1 = r4.f45Z
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = "mfaProvider"
            r2 = 1
            r0.put(r1, r2)
            bh.a<b4.c> r1 = r4.f46a0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L69
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            bh.a<b4.c> r2 = r4.f46a0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "phoneNumber"
            r1.put(r3, r2)
            bh.a<java.util.concurrent.Executor> r2 = r4.f48c0
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L42
            bh.a<java.util.concurrent.Executor> r2 = r4.f48c0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "recaptchaToken"
            r1.put(r3, r2)
        L42:
            bh.a<c4.b> r2 = r4.f49d0
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L55
            bh.a<c4.b> r2 = r4.f49d0
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "safetyNetToken"
            r1.put(r3, r2)
        L55:
            bh.a<d4.a> r2 = r4.f50e0
            h7.fd r2 = (p124h7.C2625fd) r2
            if (r2 == 0) goto L64
            org.json.JSONObject r2 = r2.m6721b()
            java.lang.String r3 = "autoRetrievalInfo"
            r1.put(r3, r2)
        L64:
            java.lang.String r2 = "phoneEnrollmentInfo"
            r0.put(r2, r1)
        L69:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(java.lang.Object r5) {
            r4 = this;
            h7.ee r5 = (p124h7.C2608ee) r5
            h7.ie r5 = r5.f11490Y
            java.util.List<h7.ge> r5 = r5.f11641Y
            if (r5 == 0) goto L74
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lf
            goto L74
        Lf:
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            h7.ge r5 = (p124h7.C2644ge) r5
            h7.se r1 = r5.f11549d0
            if (r1 == 0) goto L1d
            java.util.List<h7.qe> r1 = r1.f11911Y
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L58
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L58
            bh.a<x3.d> r2 = r4.f45Z
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L4c
        L30:
            int r2 = r1.size()
            if (r0 >= r2) goto L58
            java.lang.Object r2 = r1.get(r0)
            h7.qe r2 = (p124h7.C2824qe) r2
            java.lang.String r2 = r2.f11867b0
            bh.a<x3.d> r3 = r4.f45Z
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            goto L4c
        L49:
            int r0 = r0 + 1
            goto L30
        L4c:
            java.lang.Object r0 = r1.get(r0)
            h7.qe r0 = (p124h7.C2824qe) r0
            bh.a<b4.c> r1 = r4.f46a0
            java.lang.String r1 = (java.lang.String) r1
            r0.f11868c0 = r1
        L58:
            bh.a<a4.l> r0 = r4.f47b0
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5.f11554i0 = r0
            bh.a<java.util.concurrent.Executor> r0 = r4.f48c0
            v9.j0 r0 = (p375v9.C6605j0) r0
            r5.f11555j0 = r0
            bh.a<c4.b> r0 = r4.f49d0
            h7.fc r0 = (p124h7.C2624fc) r0
            bh.a<d4.a> r1 = r4.f50e0
            h7.me r1 = (p124h7.C2752me) r1
            r0.m6717e(r1, r5)
            return
        L74:
            bh.a<android.content.Context> r5 = r4.f44Y
            h7.jd r5 = (p124h7.InterfaceC2697jd) r5
            java.lang.String r0 = "No users."
            r5.mo29e(r0)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            bh.a<android.content.Context> r0 = r1.f44Y
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r9 = this;
            bh.a<android.content.Context> r0 = r9.f44Y
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r2 = r0
            android.content.Context r2 = (android.content.Context) r2
            bh.a<x3.d> r0 = r9.f45Z
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r3 = r0
            x3.d r3 = (p405x3.InterfaceC6922d) r3
            bh.a<b4.c> r0 = r9.f46a0
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r4 = r0
            b4.c r4 = (p021b4.InterfaceC0666c) r4
            bh.a<a4.l> r0 = r9.f47b0
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r5 = r0
            a4.l r5 = (p005a4.InterfaceC0023l) r5
            bh.a<java.util.concurrent.Executor> r0 = r9.f48c0
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r6 = r0
            java.util.concurrent.Executor r6 = (java.util.concurrent.Executor) r6
            bh.a<c4.b> r0 = r9.f49d0
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r7 = r0
            c4.b r7 = (p034c4.InterfaceC0867b) r7
            bh.a<d4.a> r0 = r9.f50e0
            bh.a r0 = (bh.InterfaceC0769a) r0
            java.lang.Object r0 = r0.get()
            r8 = r0
            d4.a r8 = (p050d4.InterfaceC1277a) r8
            a4.i r0 = new a4.i
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }
}
