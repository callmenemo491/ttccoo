package p365v;

/* renamed from: v.c */
/* loaded from: classes.dex */
public class C6476c implements p124h7.InterfaceC2775o1, p124h7.InterfaceC2697jd, p124h7.InterfaceC2534ad {

    /* renamed from: Y */
    public p365v.C6478e f25075Y;

    /* renamed from: Z */
    public p365v.C6478e f25076Z;

    /* renamed from: a0 */
    public p365v.C6478e f25077a0;

    /* renamed from: b0 */
    public java.lang.Object f25078b0;

    public C6476c(int r3) {
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L48
            r0 = 2
            if (r3 == r0) goto L28
            r2.<init>()
            v.e r3 = new v.e
            r0 = 256(0x100, float:3.59E-43)
            r1 = 0
            r3.<init>(r0, r1)
            r2.f25075Y = r3
            v.e r3 = new v.e
            r3.<init>(r0, r1)
            r2.f25076Z = r3
            v.e r3 = new v.e
            r3.<init>(r0, r1)
            r2.f25077a0 = r3
            r3 = 32
            v.h[] r3 = new p365v.C6481h[r3]
            r2.f25078b0 = r3
            return
        L28:
            r2.<init>()
            s.a r3 = new s.a
            r3.<init>()
            r2.f25075Y = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.f25076Z = r3
            s.e r3 = new s.e
            r3.<init>()
            r2.f25077a0 = r3
            s.a r3 = new s.a
            r3.<init>()
            r2.f25078b0 = r3
            return
        L48:
            r2.<init>()
            v.e r3 = new v.e
            r1 = 10
            r3.<init>(r1, r0)
            r2.f25075Y = r3
            s.h r3 = new s.h
            r3.<init>()
            r2.f25076Z = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f25077a0 = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.f25078b0 = r3
            return
    }

    public C6476c(android.content.Context r3, p394wc.InterfaceC6830a r4) {
            r2 = this;
            r2.<init>()
            r2.f25077a0 = r3
            k7.h4 r0 = new k7.h4
            r1 = 3
            r0.<init>(r3, r1)
            r2.f25078b0 = r0
            r2.f25075Y = r4
            uc.e r3 = new uc.e
            r3.<init>(r0)
            r2.f25076Z = r3
            return
    }

    public C6476c(p083f.C1933t r1, java.lang.String r2, java.lang.String r3, p124h7.C2624fc r4) {
            r0 = this;
            r0.f25078b0 = r1
            r0.f25075Y = r2
            r0.f25076Z = r3
            r0.f25077a0 = r4
            r0.<init>()
            return
    }

    public C6476c(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "phone"
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            r1.f25075Y = r0
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            r1.f25076Z = r2
            r1.f25077a0 = r3
            r1.f25078b0 = r4
            return
    }

    public C6476c(java.lang.String r1, byte[] r2, byte[] r3, p364uj.InterfaceC6472b r4) {
            r0 = this;
            r0.<init>()
            r0.f25075Y = r1
            r0.f25076Z = r2
            r0.f25077a0 = r3
            r0.f25078b0 = r4
            return
    }

    public C6476c(java.lang.Throwable r2, ma.InterfaceC4509c r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = r2.getLocalizedMessage()
            r1.f25075Y = r0
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.f25076Z = r0
            java.lang.StackTraceElement[] r0 = r2.getStackTrace()
            java.lang.StackTraceElement[] r0 = r3.mo10389a(r0)
            r1.f25077a0 = r0
            java.lang.Throwable r2 = r2.getCause()
            if (r2 == 0) goto L29
            v.c r0 = new v.c
            r0.<init>(r2, r3)
            goto L2a
        L29:
            r0 = 0
        L2a:
            r1.f25078b0 = r0
            return
    }

    public C6476c(java.security.interfaces.ECPublicKey r2, byte[] r3, java.lang.String r4, int r5, p124h7.C2687j3 r6) {
            r1 = this;
            r1.<init>()
            java.security.spec.ECPoint r5 = r2.getW()
            java.security.spec.ECParameterSpec r0 = r2.getParams()
            java.security.spec.EllipticCurve r0 = r0.getCurve()
            p036c6.C0906q0.m2628p(r5, r0)
            f.t r5 = new f.t
            r5.<init>(r2)
            r1.f25075Y = r5
            r1.f25077a0 = r3
            r1.f25076Z = r4
            r1.f25078b0 = r6
            return
    }

    public C6476c(p365v.C6476c r2, androidx.appcompat.widget.C0311x r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f25077a0 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f25078b0 = r0
            r1.f25075Y = r2
            r1.f25076Z = r3
            return
    }

    @Override // p124h7.InterfaceC2534ad
    /* renamed from: a */
    public java.lang.String mo27a() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            v.e r1 = r4.f25075Y
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = "mfaProvider"
            r2 = 1
            r0.put(r1, r2)
            v.e r1 = r4.f25076Z
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "mfaPendingCredential"
            r0.put(r2, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            v.e r2 = r4.f25077a0
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2b
            java.lang.String r3 = "sessionInfo"
            r1.put(r3, r2)
        L2b:
            java.lang.Object r2 = r4.f25078b0
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L36
            java.lang.String r3 = "code"
            r1.put(r3, r2)
        L36:
            java.lang.String r2 = "phoneVerificationInfo"
            r0.put(r2, r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(java.lang.Object r4) {
            r3 = this;
            h7.me r4 = (p124h7.C2752me) r4
            h7.af r0 = new h7.af
            r0.<init>()
            java.lang.String r1 = r4.f11773Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f11380Y = r1
            v.e r1 = r3.f25075Y
            java.lang.String r1 = (java.lang.String) r1
            r0.m6468b(r1)
            v.e r1 = r3.f25076Z
            java.lang.String r1 = (java.lang.String) r1
            r0.m6469c(r1)
            java.lang.Object r1 = r3.f25078b0
            f.t r1 = (p083f.C1933t) r1
            v.e r2 = r3.f25077a0
            h7.fc r2 = (p124h7.C2624fc) r2
            p083f.C1933t.m4778F(r1, r2, r4, r0, r3)
            return
    }

    /* renamed from: c */
    public void m13112c(T r3) {
            r2 = this;
            v.e r0 = r2.f25076Z
            s.h r0 = (p319s.C5941h) r0
            int r0 = r0.m12340e(r3)
            if (r0 < 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L17
            v.e r0 = r2.f25076Z
            s.h r0 = (p319s.C5941h) r0
            r1 = 0
            r0.put(r3, r1)
        L17:
            return
    }

    /* renamed from: d */
    public void m13113d(T r5, java.util.ArrayList<T> r6, java.util.HashSet<T> r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L35
            r7.add(r5)
            v.e r0 = r4.f25076Z
            s.h r0 = (p319s.C5941h) r0
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r5, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2e
            r1 = 0
            int r2 = r0.size()
        L22:
            if (r1 >= r2) goto L2e
            java.lang.Object r3 = r0.get(r1)
            r4.m13113d(r3, r6, r7)
            int r1 = r1 + 1
            goto L22
        L2e:
            r7.remove(r5)
            r6.add(r5)
            return
        L35:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "This graph contains cyclic dependencies"
            r5.<init>(r6)
            throw r5
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            v.e r0 = r1.f25077a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
    }

    /* renamed from: f */
    public java.util.ArrayList<T> m13114f() {
            r1 = this;
            v.e r0 = r1.f25075Y
            m0.c r0 = (p212m0.InterfaceC4313c) r0
            java.lang.Object r0 = r0.mo6231b()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L11:
            return r0
    }

    /* renamed from: g */
    public void m13115g(java.util.ArrayList<T> r2) {
            r1 = this;
            r2.clear()
            v.e r0 = r1.f25075Y
            m0.c r0 = (p212m0.InterfaceC4313c) r0
            r0.mo6230a(r2)
            return
    }

    /* renamed from: h */
    public p365v.C6476c m13116h() {
            r2 = this;
            v.c r0 = new v.c
            v.e r1 = r2.f25076Z
            androidx.appcompat.widget.x r1 = (androidx.appcompat.widget.C0311x) r1
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: i */
    public p185k7.InterfaceC3916o m13117i(p185k7.InterfaceC3916o r2) {
            r1 = this;
            v.e r0 = r1.f25076Z
            androidx.appcompat.widget.x r0 = (androidx.appcompat.widget.C0311x) r0
            k7.o r2 = r0.m826r(r1, r2)
            return r2
    }

    /* renamed from: j */
    public p185k7.InterfaceC3916o m13118j(p185k7.C3766d r4) {
            r3 = this;
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            java.util.Iterator r1 = r4.m8364w()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r0 = r1.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            v.e r2 = r3.f25076Z
            androidx.appcompat.widget.x r2 = (androidx.appcompat.widget.C0311x) r2
            k7.o r0 = r4.m8362q(r0)
            k7.o r0 = r2.m826r(r3, r0)
            boolean r2 = r0 instanceof p185k7.C3794f
            if (r2 == 0) goto L6
        L26:
            return r0
    }

    /* renamed from: k */
    public p185k7.InterfaceC3916o m13119k(java.lang.String r4) {
            r3 = this;
            v.e r0 = r3.f25077a0
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L15
            v.e r0 = r3.f25077a0
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r4 = r0.get(r4)
            k7.o r4 = (p185k7.InterfaceC3916o) r4
            return r4
        L15:
            v.e r0 = r3.f25075Y
            v.c r0 = (p365v.C6476c) r0
            if (r0 == 0) goto L20
            k7.o r4 = r0.m13119k(r4)
            return r4
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "%s is not defined"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: l */
    public void m13120l(java.lang.String r2, p185k7.InterfaceC3916o r3) {
            r1 = this;
            java.lang.Object r0 = r1.f25078b0
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lb
            return
        Lb:
            if (r3 != 0) goto L15
            v.e r3 = r1.f25077a0
            java.util.Map r3 = (java.util.Map) r3
            r3.remove(r2)
            return
        L15:
            v.e r0 = r1.f25077a0
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r2, r3)
            return
    }

    /* renamed from: m */
    public void m13121m(java.lang.String r2, p185k7.InterfaceC3916o r3) {
            r1 = this;
            v.e r0 = r1.f25077a0
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L1f
            v.e r0 = r1.f25075Y
            v.c r0 = (p365v.C6476c) r0
            if (r0 == 0) goto L1f
            boolean r0 = r0.m13122n(r2)
            if (r0 != 0) goto L17
            goto L1f
        L17:
            v.e r0 = r1.f25075Y
            v.c r0 = (p365v.C6476c) r0
            r0.m13121m(r2, r3)
            return
        L1f:
            java.lang.Object r0 = r1.f25078b0
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L2a
            return
        L2a:
            if (r3 != 0) goto L34
            v.e r3 = r1.f25077a0
            java.util.Map r3 = (java.util.Map) r3
            r3.remove(r2)
            return
        L34:
            v.e r0 = r1.f25077a0
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r2, r3)
            return
    }

    /* renamed from: n */
    public boolean m13122n(java.lang.String r2) {
            r1 = this;
            v.e r0 = r1.f25077a0
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            v.e r0 = r1.f25075Y
            v.c r0 = (p365v.C6476c) r0
            if (r0 == 0) goto L17
            boolean r2 = r0.m13122n(r2)
            return r2
        L17:
            r2 = 0
            return r2
    }
}
