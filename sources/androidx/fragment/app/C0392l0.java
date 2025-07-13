package androidx.fragment.app;

/* renamed from: androidx.fragment.app.l0 */
/* loaded from: classes.dex */
public class C0392l0 implements p425y2.InterfaceC7105b, p108g5.InterfaceC2288w, p327s7.InterfaceC5982f, p218m6.InterfaceC4396i, p124h7.InterfaceC2885u3, p124h7.InterfaceC2697jd, p240nj.InterfaceC4844b {

    /* renamed from: Y */
    public final /* synthetic */ int f2229Y;

    /* renamed from: Z */
    public java.util.ArrayList<androidx.fragment.app.ComponentCallbacksC0395n> f2230Z;

    /* renamed from: a0 */
    public java.util.HashMap<java.lang.String, androidx.fragment.app.C0388j0> f2231a0;

    /* renamed from: b0 */
    public java.lang.Object f2232b0;

    public C0392l0(int r5) {
            r4 = this;
            r4.f2229Y = r5
            r0 = 17
            r1 = 0
            if (r5 == r0) goto L46
            r0 = 18
            if (r5 == r0) goto L2c
            r0 = 23
            if (r5 == r0) goto L21
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f2230Z = r5
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4.f2231a0 = r5
            return
        L21:
            r4.<init>()
            lj.b r5 = new lj.b
            r5.<init>()
            r4.f2230Z = r5
            return
        L2c:
            r4.<init>()
            r4.f2230Z = r1
            da.j0 r5 = new da.j0
            r0 = 64
            r1 = 1024(0x400, float:1.435E-42)
            r5.<init>(r0, r1)
            r4.f2231a0 = r5
            da.j0 r5 = new da.j0
            r1 = 8192(0x2000, float:1.148E-41)
            r5.<init>(r0, r1)
            r4.f2232b0 = r5
            return
        L46:
            r4.<init>()
            k7.b r5 = new k7.b
            java.lang.String r0 = ""
            r2 = 0
            r5.<init>(r0, r2, r1)
            r4.f2230Z = r5
            k7.b r5 = new k7.b
            r5.<init>(r0, r2, r1)
            r4.f2231a0 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f2232b0 = r5
            return
    }

    public C0392l0(android.content.Intent r3) {
            r2 = this;
            r0 = 1
            r2.f2229Y = r0
            android.net.Uri r0 = r3.getData()
            java.lang.String r1 = r3.getAction()
            java.lang.String r3 = r3.getType()
            r2.<init>(r0, r1, r3)
            return
    }

    public C0392l0(android.net.Uri r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            r1.f2231a0 = r3
            r1.f2232b0 = r4
            return
    }

    public C0392l0(androidx.viewpager2.widget.ViewPager2 r2, androidx.viewpager2.widget.C0648c r3, androidx.recyclerview.widget.RecyclerView r4) {
            r1 = this;
            r0 = 2
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            r1.f2231a0 = r3
            r1.f2232b0 = r4
            return
    }

    public /* synthetic */ C0392l0(com.google.android.gms.cast.C1060d r2, java.lang.String r3, p036c6.C0887h r4) {
            r1 = this;
            r0 = 6
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            r1.f2231a0 = r3
            r1.f2232b0 = r4
            return
    }

    public /* synthetic */ C0392l0(p052d6.C1295a r2, p072e7.C1662l r3, android.content.SharedPreferences r4) {
            r1 = this;
            r0 = 5
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            r1.f2231a0 = r3
            r1.f2232b0 = r4
            return
    }

    public C0392l0(p083f.C1933t r2, p124h7.C2535ae r3, p124h7.C2624fc r4) {
            r1 = this;
            r0 = 13
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(p083f.C1933t r2, p124h7.C2681if r3, p124h7.C2624fc r4) {
            r1 = this;
            r0 = 11
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(p083f.C1933t r2, p124h7.C2789of r3, p124h7.C2624fc r4) {
            r1 = this;
            r0 = 10
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(p083f.C1933t r2, p375v9.C6587a0 r3, p124h7.C2624fc r4) {
            r1 = this;
            r0 = 15
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(p083f.C1933t r2, p375v9.C6594e r3, p124h7.C2624fc r4) {
            r1 = this;
            r0 = 9
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(p124h7.C2532ab r2, p124h7.InterfaceC2697jd r3, p124h7.C2752me r4) {
            r1 = this;
            r0 = 14
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(p124h7.C2587db r2, p124h7.InterfaceC2697jd r3, p124h7.C2752me r4) {
            r1 = this;
            r0 = 12
            r1.f2229Y = r0
            r1.f2232b0 = r2
            r1.f2230Z = r3
            r1.f2231a0 = r4
            r1.<init>()
            return
    }

    public C0392l0(java.lang.Class r2) {
            r1 = this;
            r0 = 7
            r1.f2229Y = r0
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f2230Z = r0
            r1.f2232b0 = r2
            return
    }

    public C0392l0(java.lang.String r2, p422y.C7095e r3) {
            r1 = this;
            r0 = 19
            r1.f2229Y = r0
            aa.c r0 = p011aa.C0047c.f101a
            r1.<init>(r2, r3, r0)
            return
    }

    public C0392l0(java.lang.String r2, p422y.C7095e r3, p011aa.C0047c r4) {
            r1 = this;
            r0 = 19
            r1.f2229Y = r0
            r1.<init>()
            if (r2 == 0) goto L10
            r1.f2232b0 = r4
            r1.f2231a0 = r3
            r1.f2230Z = r2
            return
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "url must not be null."
            r2.<init>(r3)
            throw r2
    }

    public C0392l0(java.util.Map r2, java.util.Map r3, qa.InterfaceC5608e r4) {
            r1 = this;
            r0 = 16
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            r1.f2231a0 = r3
            r1.f2232b0 = r4
            return
    }

    public C0392l0(p185k7.C3738b r2) {
            r1 = this;
            r0 = 17
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            k7.b r2 = r2.m8218a()
            r1.f2231a0 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f2232b0 = r2
            return
    }

    public C0392l0(p216m4.InterfaceC4369n r2) {
            r1 = this;
            r0 = 4
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            return
    }

    public C0392l0(p229n2.InterfaceC4673c r2, p425y2.InterfaceC7105b r3, p425y2.InterfaceC7105b r4) {
            r1 = this;
            r0 = 3
            r1.f2229Y = r0
            r1.<init>()
            r1.f2230Z = r2
            r1.f2231a0 = r3
            r1.f2232b0 = r4
            return
    }

    public C0392l0(p453zb.C7269a r2) {
            r1 = this;
            r0 = 21
            r1.f2229Y = r0
            r1.<init>()
            kc.l r0 = new kc.l
            r0.<init>()
            r1.f2231a0 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.f2232b0 = r0
            r1.f2230Z = r2
            return
    }

    public C0392l0(p453zb.C7270b r8) {
            r7 = this;
            r0 = 20
            r7.f2229Y = r0
            r7.<init>()
            int r0 = r8.f27903Z
            r1 = 8
            if (r0 < r1) goto L50
            r1 = 144(0x90, float:2.02E-43)
            if (r0 > r1) goto L50
            r1 = r0 & 1
            if (r1 != 0) goto L50
            int r2 = r8.f27902Y
            cc.d[] r3 = cc.C0945d.f4924h
            if (r1 != 0) goto L4b
            r1 = r2 & 1
            if (r1 != 0) goto L4b
            cc.d[] r1 = cc.C0945d.f4924h
            int r3 = r1.length
            r4 = 0
        L23:
            if (r4 >= r3) goto L46
            r5 = r1[r4]
            int r6 = r5.f4926b
            if (r6 != r0) goto L43
            int r6 = r5.f4927c
            if (r6 != r2) goto L43
            r7.f2232b0 = r5
            zb.b r8 = r7.m1283r(r8)
            r7.f2230Z = r8
            zb.b r0 = new zb.b
            int r1 = r8.f27902Y
            int r8 = r8.f27903Z
            r0.<init>(r1, r8)
            r7.f2231a0 = r0
            return
        L43:
            int r4 = r4 + 1
            goto L23
        L46:
            sb.f r8 = sb.C6012f.m12491a()
            throw r8
        L4b:
            sb.f r8 = sb.C6012f.m12491a()
            throw r8
        L50:
            sb.f r8 = sb.C6012f.m12491a()
            throw r8
    }

    public C0392l0(byte[] r2, int r3) {
            r1 = this;
            r1.f2229Y = r3
            r0 = 24
            if (r3 == r0) goto L3d
            r1.<init>()
            int r3 = r2.length
            p124h7.C2584d8.m6593b(r3)
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r3.<init>(r2, r0)
            r1.f2230Z = r3
            h7.w7<h7.z7, javax.crypto.Cipher> r2 = p124h7.C2925w7.f11992e
            java.lang.String r3 = "AES/ECB/NoPadding"
            java.lang.Object r2 = r2.m7238a(r3)
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r3 = 1
            java.util.ArrayList<androidx.fragment.app.n> r0 = r1.f2230Z
            javax.crypto.SecretKey r0 = (javax.crypto.SecretKey) r0
            r2.init(r3, r0)
            r3 = 16
            byte[] r3 = new byte[r3]
            byte[] r2 = r2.doFinal(r3)
            byte[] r2 = p036c6.C0906q0.m2623k(r2)
            r1.f2231a0 = r2
            byte[] r2 = p036c6.C0906q0.m2623k(r2)
            r1.f2232b0 = r2
            return
        L3d:
            r1.<init>()
            ri.t r2 = p317ri.AbstractC5915t.m12274C(r2)
            java.util.Enumeration r2 = r2.mo12278H()
        L48:
            boolean r3 = r2.hasMoreElements()
            if (r3 == 0) goto Lba
            java.lang.Object r3 = r2.nextElement()
            ri.e r3 = (p317ri.InterfaceC5870e) r3
            boolean r0 = r3 instanceof p317ri.AbstractC5915t
            if (r0 == 0) goto L5f
            ri.t r3 = p317ri.AbstractC5915t.m12274C(r3)
            r1.f2230Z = r3
            goto L48
        L5f:
            boolean r0 = r3 instanceof p317ri.AbstractC5928y
            if (r0 == 0) goto L6d
            ri.y r3 = (p317ri.AbstractC5928y) r3
            r0 = 0
            ri.t r3 = p317ri.AbstractC5915t.m12275D(r3, r0)
            r1.f2231a0 = r3
            goto L48
        L6d:
            boolean r0 = r3 instanceof p317ri.C5872e1
            if (r0 == 0) goto L48
            if (r3 == 0) goto Lb1
            boolean r0 = r3 instanceof p317ri.C5872e1
            if (r0 == 0) goto L78
            goto Lb1
        L78:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L96
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Exception -> L85
            ri.s r3 = p317ri.AbstractC5912s.m12271u(r3)     // Catch: java.lang.Exception -> L85
            ri.e1 r3 = (p317ri.C5872e1) r3     // Catch: java.lang.Exception -> L85
            goto Lb3
        L85:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "encoding error in getInstance: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r2 = androidx.fragment.app.C0390k0.m1221a(r2, r0)
            r3.<init>(r2)
            throw r3
        L96:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "illegal object in getInstance: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        Lb1:
            ri.e1 r3 = (p317ri.C5872e1) r3
        Lb3:
            java.lang.String r3 = r3.mo12211h()
            r1.f2232b0 = r3
            goto L48
        Lba:
            return
    }

    public C0392l0(sc.C6029c[] r2) {
            r1 = this;
            r0 = 22
            r1.f2229Y = r0
            r1.<init>()
            r0 = 0
            r0 = r2[r0]
            r1.f2230Z = r0
            r0 = 1
            r0 = r2[r0]
            r1.f2231a0 = r0
            r0 = 2
            r2 = r2[r0]
            r1.f2232b0 = r2
            return
    }

    /* renamed from: t */
    public static int m1242t(p453zb.C7269a r4, int r5, int r6) {
            r0 = 0
            r1 = 0
        L2:
            if (r0 >= r6) goto L16
            int r2 = r5 + r0
            boolean r2 = r4.m14364e(r2)
            if (r2 == 0) goto L13
            int r2 = r6 - r0
            r3 = 1
            int r2 = r2 - r3
            int r2 = r3 << r2
            r1 = r1 | r2
        L13:
            int r0 = r0 + 1
            goto L2
        L16:
            return r1
    }

    /* renamed from: A */
    public java.util.List<androidx.fragment.app.ComponentCallbacksC0395n> m1243A() {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r3.f2230Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        Lf:
            java.util.ArrayList<androidx.fragment.app.n> r0 = r3.f2230Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList<androidx.fragment.app.n> r2 = r3.f2230Z     // Catch: java.lang.Throwable -> L1f
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1f
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            return r1
        L1f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r1
    }

    /* renamed from: B */
    public org.json.JSONObject m1244B(java.lang.String r5) {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6
            r0.<init>(r5)     // Catch: java.lang.Exception -> L6
            return r0
        L6:
            r0 = move-exception
            java.lang.Object r1 = r4.f2232b0
            aa.c r1 = (p011aa.C0047c) r1
            java.lang.String r2 = "Failed to parse settings JSON from "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.util.ArrayList<androidx.fragment.app.n> r3 = r4.f2230Z
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.m55f(r2, r0)
            java.lang.Object r0 = r4.f2232b0
            aa.c r0 = (p011aa.C0047c) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Settings response "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.m54e(r5)
            r5 = 0
            return r5
    }

    /* renamed from: C */
    public java.util.Map<java.lang.String, java.lang.String> m1245C(la.C4237e r4) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object r1 = r4.f17405h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "build_version"
            r0.put(r2, r1)
            java.lang.Object r1 = r4.f17404g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "display_version"
            r0.put(r2, r1)
            int r1 = r4.f17406i
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = "source"
            r0.put(r2, r1)
            java.lang.Object r4 = r4.f17403f
            java.lang.String r4 = (java.lang.String) r4
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L31
            java.lang.String r1 = "instance"
            r0.put(r1, r4)
        L31:
            return r0
    }

    /* renamed from: D */
    public org.json.JSONObject m1246D(p127ha.C2995b r5) {
            r4 = this;
            int r0 = r5.f12087a
            java.lang.Object r1 = r4.f2232b0
            aa.c r1 = (p011aa.C0047c) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Settings response code was: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            r1.m53d(r2)
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L2d
            r1 = 201(0xc9, float:2.82E-43)
            if (r0 == r1) goto L2d
            r1 = 202(0xca, float:2.83E-43)
            if (r0 == r1) goto L2d
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 != r1) goto L2b
            goto L2d
        L2b:
            r1 = 0
            goto L2e
        L2d:
            r1 = 1
        L2e:
            if (r1 == 0) goto L37
            java.lang.String r5 = r5.f12088b
            org.json.JSONObject r5 = r4.m1244B(r5)
            goto L52
        L37:
            java.lang.Object r5 = r4.f2232b0
            aa.c r5 = (p011aa.C0047c) r5
            java.lang.String r1 = "Settings request failed; (status: "
            java.lang.String r2 = ") from "
            java.lang.StringBuilder r0 = androidx.appcompat.widget.C0300r0.m777a(r1, r0, r2)
            java.util.ArrayList<androidx.fragment.app.n> r1 = r4.f2230Z
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.m52c(r0)
            r5 = 0
        L52:
            return r5
    }

    /* renamed from: E */
    public void m1247E(p352u5.InterfaceC6314f r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p216m4.InterfaceC4366k r15) {
            r7 = this;
            m4.f r6 = new m4.f
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f2232b0 = r6
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r8 = r7.f2231a0
            m4.i r8 = (p216m4.InterfaceC4364i) r8
            if (r8 == 0) goto L12
            return
        L12:
            java.util.ArrayList<androidx.fragment.app.n> r8 = r7.f2230Z
            m4.n r8 = (p216m4.InterfaceC4369n) r8
            m4.i[] r8 = r8.mo2152l(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L25
            r8 = r8[r13]
            r7.f2231a0 = r8
            goto Lc4
        L25:
            int r10 = r8.length
            r0 = 0
        L27:
            if (r0 >= r10) goto L71
            r1 = r8[r0]
            boolean r2 = r1.mo9805f(r6)     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            if (r2 == 0) goto L36
            r7.f2231a0 = r1     // Catch: java.lang.Throwable -> L43 java.io.EOFException -> L58
            r6.f17901f = r13
            goto L71
        L36:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r7.f2231a0
            m4.i r1 = (p216m4.InterfaceC4364i) r1
            if (r1 != 0) goto L68
            long r1 = r6.f17899d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L66
            goto L68
        L43:
            r8 = move-exception
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r9 = r7.f2231a0
            m4.i r9 = (p216m4.InterfaceC4364i) r9
            if (r9 != 0) goto L52
            long r9 = r6.f17899d
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L51
            goto L52
        L51:
            r14 = 0
        L52:
            p371v5.C6549a.m13291e(r14)
            r6.f17901f = r13
            throw r8
        L58:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r7.f2231a0
            m4.i r1 = (p216m4.InterfaceC4364i) r1
            if (r1 != 0) goto L68
            long r1 = r6.f17899d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L66
            goto L68
        L66:
            r1 = 0
            goto L69
        L68:
            r1 = 1
        L69:
            p371v5.C6549a.m13291e(r1)
            r6.f17901f = r13
            int r0 = r0 + 1
            goto L27
        L71:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r10 = r7.f2231a0
            m4.i r10 = (p216m4.InterfaceC4364i) r10
            if (r10 != 0) goto Lc4
            g5.j0 r10 = new g5.j0
            int r11 = p371v5.C6552b0.f25624a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L80:
            int r12 = r8.length
            if (r13 >= r12) goto L9d
            r12 = r8[r13]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            int r12 = r8.length
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L9a
            java.lang.String r12 = ", "
            r11.append(r12)
        L9a:
            int r13 = r13 + 1
            goto L80
        L9d:
            java.lang.String r8 = r11.toString()
            r11 = 58
            int r11 = p064e.C1489c.m4038a(r8, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.util.Objects.requireNonNull(r9)
            r10.<init>(r8, r9)
            throw r10
        Lc4:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r8 = r7.f2231a0
            m4.i r8 = (p216m4.InterfaceC4364i) r8
            r8.mo9804c(r15)
            return
    }

    /* renamed from: F */
    public boolean m1248F(int r4) {
            r3 = this;
            int r0 = r4 + 3
            java.util.ArrayList<androidx.fragment.app.n> r1 = r3.f2230Z
            zb.a r1 = (p453zb.C7269a) r1
            int r1 = r1.f27901Z
            r2 = 0
            if (r0 <= r1) goto Lc
            return r2
        Lc:
            if (r4 >= r0) goto L1c
            java.util.ArrayList<androidx.fragment.app.n> r1 = r3.f2230Z
            zb.a r1 = (p453zb.C7269a) r1
            boolean r1 = r1.m14364e(r4)
            if (r1 == 0) goto L19
            return r2
        L19:
            int r4 = r4 + 1
            goto Lc
        L1c:
            r4 = 1
            return r4
    }

    /* renamed from: G */
    public boolean m1249G(int r6) {
            r5 = this;
            int r0 = r6 + 1
            java.util.ArrayList<androidx.fragment.app.n> r1 = r5.f2230Z
            zb.a r1 = (p453zb.C7269a) r1
            int r1 = r1.f27901Z
            r2 = 0
            if (r0 <= r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            r1 = 5
            if (r0 >= r1) goto L33
            int r1 = r0 + r6
            java.util.ArrayList<androidx.fragment.app.n> r3 = r5.f2230Z
            r4 = r3
            zb.a r4 = (p453zb.C7269a) r4
            int r4 = r4.f27901Z
            if (r1 >= r4) goto L33
            r4 = 2
            zb.a r3 = (p453zb.C7269a) r3
            if (r0 != r4) goto L29
            int r1 = r6 + 2
            boolean r1 = r3.m14364e(r1)
            if (r1 != 0) goto L30
            return r2
        L29:
            boolean r1 = r3.m14364e(r1)
            if (r1 == 0) goto L30
            return r2
        L30:
            int r0 = r0 + 1
            goto Ld
        L33:
            r6 = 1
            return r6
    }

    /* renamed from: H */
    public boolean m1250H(int r6) {
            r5 = this;
            int r0 = r6 + 1
            java.util.ArrayList<androidx.fragment.app.n> r1 = r5.f2230Z
            zb.a r1 = (p453zb.C7269a) r1
            int r1 = r1.f27901Z
            r2 = 0
            if (r0 <= r1) goto Lc
            return r2
        Lc:
            r0 = 0
        Ld:
            r1 = 4
            if (r0 >= r1) goto L27
            int r1 = r0 + r6
            java.util.ArrayList<androidx.fragment.app.n> r3 = r5.f2230Z
            r4 = r3
            zb.a r4 = (p453zb.C7269a) r4
            int r4 = r4.f27901Z
            if (r1 >= r4) goto L27
            zb.a r3 = (p453zb.C7269a) r3
            boolean r1 = r3.m14364e(r1)
            if (r1 == 0) goto L24
            return r2
        L24:
            int r0 = r0 + 1
            goto Ld
        L27:
            r6 = 1
            return r6
    }

    /* renamed from: I */
    public boolean m1251I(int r7) {
            r6 = this;
            int r0 = r7 + 5
            java.util.ArrayList<androidx.fragment.app.n> r1 = r6.f2230Z
            r2 = r1
            zb.a r2 = (p453zb.C7269a) r2
            int r2 = r2.f27901Z
            r3 = 0
            if (r0 <= r2) goto Ld
            return r3
        Ld:
            zb.a r1 = (p453zb.C7269a) r1
            r0 = 5
            int r1 = m1242t(r1, r7, r0)
            r2 = 1
            r4 = 16
            if (r1 < r0) goto L1c
            if (r1 >= r4) goto L1c
            return r2
        L1c:
            int r0 = r7 + 6
            java.util.ArrayList<androidx.fragment.app.n> r1 = r6.f2230Z
            r5 = r1
            zb.a r5 = (p453zb.C7269a) r5
            int r5 = r5.f27901Z
            if (r0 <= r5) goto L28
            return r3
        L28:
            zb.a r1 = (p453zb.C7269a) r1
            r0 = 6
            int r7 = m1242t(r1, r7, r0)
            if (r7 < r4) goto L36
            r0 = 63
            if (r7 >= r0) goto L36
            return r2
        L36:
            return r3
    }

    /* renamed from: J */
    public boolean m1252J(int r6) {
            r5 = this;
            int r0 = r6 + 5
            java.util.ArrayList<androidx.fragment.app.n> r1 = r5.f2230Z
            r2 = r1
            zb.a r2 = (p453zb.C7269a) r2
            int r2 = r2.f27901Z
            r3 = 0
            if (r0 <= r2) goto Ld
            return r3
        Ld:
            zb.a r1 = (p453zb.C7269a) r1
            r0 = 5
            int r1 = m1242t(r1, r6, r0)
            r2 = 1
            if (r1 < r0) goto L1c
            r0 = 16
            if (r1 >= r0) goto L1c
            return r2
        L1c:
            int r0 = r6 + 7
            java.util.ArrayList<androidx.fragment.app.n> r1 = r5.f2230Z
            r4 = r1
            zb.a r4 = (p453zb.C7269a) r4
            int r4 = r4.f27901Z
            if (r0 <= r4) goto L28
            return r3
        L28:
            zb.a r1 = (p453zb.C7269a) r1
            r0 = 7
            int r0 = m1242t(r1, r6, r0)
            r1 = 64
            if (r0 < r1) goto L38
            r1 = 116(0x74, float:1.63E-43)
            if (r0 >= r1) goto L38
            return r2
        L38:
            int r0 = r6 + 8
            java.util.ArrayList<androidx.fragment.app.n> r1 = r5.f2230Z
            r4 = r1
            zb.a r4 = (p453zb.C7269a) r4
            int r4 = r4.f27901Z
            if (r0 <= r4) goto L44
            return r3
        L44:
            zb.a r1 = (p453zb.C7269a) r1
            r0 = 8
            int r6 = m1242t(r1, r6, r0)
            r0 = 232(0xe8, float:3.25E-43)
            if (r6 < r0) goto L55
            r0 = 253(0xfd, float:3.55E-43)
            if (r6 >= r0) goto L55
            return r2
        L55:
            return r3
    }

    /* renamed from: K */
    public boolean m1253K(int r5) {
            r4 = this;
            int r0 = r5 + 7
            java.util.ArrayList<androidx.fragment.app.n> r1 = r4.f2230Z
            r2 = r1
            zb.a r2 = (p453zb.C7269a) r2
            int r2 = r2.f27901Z
            r3 = 1
            if (r0 <= r2) goto L17
            int r5 = r5 + 4
            zb.a r1 = (p453zb.C7269a) r1
            int r0 = r1.f27901Z
            if (r5 > r0) goto L15
            return r3
        L15:
            r5 = 0
            return r5
        L17:
            r0 = r5
        L18:
            int r1 = r5 + 3
            if (r0 >= r1) goto L2a
            java.util.ArrayList<androidx.fragment.app.n> r1 = r4.f2230Z
            zb.a r1 = (p453zb.C7269a) r1
            boolean r1 = r1.m14364e(r0)
            if (r1 == 0) goto L27
            return r3
        L27:
            int r0 = r0 + 1
            goto L18
        L2a:
            java.util.ArrayList<androidx.fragment.app.n> r5 = r4.f2230Z
            zb.a r5 = (p453zb.C7269a) r5
            boolean r5 = r5.m14364e(r1)
            return r5
    }

    /* renamed from: L */
    public void m1254L(androidx.fragment.app.C0388j0 r4) {
            r3 = this;
            androidx.fragment.app.n r0 = r4.f2202c
            java.lang.String r1 = r0.f2281c0
            boolean r1 = r3.m1276k(r1)
            if (r1 == 0) goto Lb
            return
        Lb:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r3.f2231a0
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r2 = r0.f2281c0
            r1.put(r2, r4)
            r4 = 2
            boolean r4 = androidx.fragment.app.AbstractC0375d0.m1131O(r4)
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Added fragment to active set "
            r4.append(r1)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L31:
            return
    }

    /* renamed from: M */
    public void m1255M(androidx.fragment.app.C0388j0 r4) {
            r3 = this;
            androidx.fragment.app.n r4 = r4.f2202c
            boolean r0 = r4.f2303y0
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r3.f2232b0
            androidx.fragment.app.g0 r0 = (androidx.fragment.app.C0382g0) r0
            r0.m1202d(r4)
        Ld:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r3.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = r4.f2281c0
            r2 = 0
            java.lang.Object r0 = r0.put(r1, r2)
            androidx.fragment.app.j0 r0 = (androidx.fragment.app.C0388j0) r0
            if (r0 != 0) goto L1d
            return
        L1d:
            r0 = 2
            boolean r0 = androidx.fragment.app.AbstractC0375d0.m1131O(r0)
            if (r0 == 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Removed fragment from active set "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r4)
        L3a:
            return
    }

    /* renamed from: N */
    public p371v5.C6557g m1256N() {
            r6 = this;
        L0:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r6.m1251I(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L44
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            kc.m r0 = r6.m1279n(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r6.f2231a0
            kc.l r3 = (p190kc.C4091l) r3
            int r4 = r0.f12333Y
            r3.f17007a = r4
            char r0 = r0.f17009Z
            r3 = 36
            if (r0 != r3) goto L27
            r1 = 1
        L27:
            if (r1 == 0) goto L3c
            kc.n r0 = new kc.n
            java.lang.Object r1 = r6.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            v5.g r1 = new v5.g
            r1.<init>(r0, r2)
            return r1
        L3c:
            java.lang.Object r1 = r6.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r0)
            goto L0
        L44:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r6.m1248F(r0)
            r3 = 3
            if (r0 == 0) goto L5f
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r0.m9180a(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r0.f17008b = r2
            goto L87
        L5f:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r6.m1249G(r0)
            if (r0 == 0) goto L87
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r2 = r0.f17007a
            r4 = 5
            int r2 = r2 + r4
            java.util.ArrayList<androidx.fragment.app.n> r5 = r6.f2230Z
            zb.a r5 = (p453zb.C7269a) r5
            int r5 = r5.f27901Z
            if (r2 >= r5) goto L7f
            r0.m9180a(r4)
            goto L81
        L7f:
            r0.f17007a = r5
        L81:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r0.f17008b = r3
        L87:
            v5.g r0 = new v5.g
            r2 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: O */
    public p190kc.C4093n m1257O() {
            r6 = this;
        L0:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r6.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r1 = r0.f17007a
            int r0 = r0.f17008b
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 != r2) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            if (r2 == 0) goto L17
            v5.g r0 = r6.m1256N()
            goto L28
        L17:
            r2 = 3
            if (r0 != r2) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L24
            v5.g r0 = r6.m1258P()
            goto L28
        L24:
            v5.g r0 = r6.m1259Q()
        L28:
            boolean r2 = r0.f25643b
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r5 = r6.f2231a0
            kc.l r5 = (p190kc.C4091l) r5
            int r5 = r5.f17007a
            if (r1 == r5) goto L33
            r3 = 1
        L33:
            if (r3 != 0) goto L37
            if (r2 == 0) goto L39
        L37:
            if (r2 == 0) goto L0
        L39:
            java.lang.Object r0 = r0.f25642a
            kc.n r0 = (p190kc.C4093n) r0
            return r0
    }

    /* renamed from: P */
    public p371v5.C6557g m1258P() {
            r5 = this;
        L0:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r5.m1252J(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L44
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            kc.m r0 = r5.m1281p(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r5.f2231a0
            kc.l r3 = (p190kc.C4091l) r3
            int r4 = r0.f12333Y
            r3.f17007a = r4
            char r0 = r0.f17009Z
            r3 = 36
            if (r0 != r3) goto L27
            r1 = 1
        L27:
            if (r1 == 0) goto L3c
            kc.n r0 = new kc.n
            java.lang.Object r1 = r5.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            v5.g r1 = new v5.g
            r1.<init>(r0, r2)
            return r1
        L3c:
            java.lang.Object r1 = r5.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r0)
            goto L0
        L44:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r5.m1248F(r0)
            if (r0 == 0) goto L5f
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r3 = 3
            r0.m9180a(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r0.f17008b = r2
            goto L88
        L5f:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r5.m1249G(r0)
            if (r0 == 0) goto L88
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r2 = r0.f17007a
            r3 = 5
            int r2 = r2 + r3
            java.util.ArrayList<androidx.fragment.app.n> r4 = r5.f2230Z
            zb.a r4 = (p453zb.C7269a) r4
            int r4 = r4.f27901Z
            if (r2 >= r4) goto L7f
            r0.m9180a(r3)
            goto L81
        L7f:
            r0.f17007a = r4
        L81:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r5.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r2 = 2
            r0.f17008b = r2
        L88:
            v5.g r0 = new v5.g
            r2 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: Q */
    public p371v5.C6557g m1259Q() {
            r7 = this;
        L0:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r7.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r7.m1253K(r0)
            r1 = 0
            if (r0 == 0) goto L86
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r7.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            kc.o r0 = r7.m1282q(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r7.f2231a0
            kc.l r2 = (p190kc.C4091l) r2
            int r3 = r0.f12333Y
            r2.f17007a = r3
            int r2 = r0.f17013Z
            r4 = 10
            r5 = 1
            if (r2 != r4) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 0
        L29:
            if (r6 == 0) goto L56
            int r2 = r0.f17014a0
            if (r2 != r4) goto L30
            r1 = 1
        L30:
            if (r1 == 0) goto L40
            kc.n r0 = new kc.n
            java.lang.Object r1 = r7.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r1 = r1.toString()
            r0.<init>(r3, r1)
            goto L50
        L40:
            kc.n r1 = new kc.n
            java.lang.Object r2 = r7.f2232b0
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            int r0 = r0.f17014a0
            r1.<init>(r3, r2, r0)
            r0 = r1
        L50:
            v5.g r1 = new v5.g
            r1.<init>(r0, r5)
            return r1
        L56:
            java.lang.Object r3 = r7.f2232b0
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            r3.append(r2)
            int r0 = r0.f17014a0
            if (r0 != r4) goto L62
            r1 = 1
        L62:
            if (r1 == 0) goto L7d
            kc.n r0 = new kc.n
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r7.f2231a0
            kc.l r1 = (p190kc.C4091l) r1
            int r1 = r1.f17007a
            java.lang.Object r2 = r7.f2232b0
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            v5.g r1 = new v5.g
            r1.<init>(r0, r5)
            return r1
        L7d:
            java.lang.Object r1 = r7.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r0)
            goto L0
        L86:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r7.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            boolean r0 = r7.m1250H(r0)
            if (r0 == 0) goto L9d
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r7.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            r2 = 2
            r0.f17008b = r2
            r2 = 4
            r0.m9180a(r2)
        L9d:
            v5.g r0 = new v5.g
            r2 = 0
            r0.<init>(r2, r1)
            return r0
    }

    /* renamed from: R */
    public int m1260R(int r6, int r7) {
            r5 = this;
            int r0 = r6 + (-1)
            r1 = 0
            boolean r2 = r5.m1264V(r0, r1, r6, r7)
            r3 = 1
            int r2 = r2 << r3
            boolean r4 = r5.m1264V(r0, r3, r6, r7)
            if (r4 == 0) goto L11
            r2 = r2 | 1
        L11:
            int r2 = r2 << r3
            r4 = 2
            boolean r0 = r5.m1264V(r0, r4, r6, r7)
            if (r0 == 0) goto L1b
            r2 = r2 | 1
        L1b:
            int r0 = r2 << 1
            int r2 = r7 + (-2)
            boolean r2 = r5.m1264V(r1, r2, r6, r7)
            if (r2 == 0) goto L27
            r0 = r0 | 1
        L27:
            int r0 = r0 << r3
            int r2 = r7 + (-1)
            boolean r1 = r5.m1264V(r1, r2, r6, r7)
            if (r1 == 0) goto L32
            r0 = r0 | 1
        L32:
            int r0 = r0 << r3
            boolean r1 = r5.m1264V(r3, r2, r6, r7)
            if (r1 == 0) goto L3b
            r0 = r0 | 1
        L3b:
            int r0 = r0 << r3
            boolean r1 = r5.m1264V(r4, r2, r6, r7)
            if (r1 == 0) goto L44
            r0 = r0 | 1
        L44:
            int r0 = r0 << r3
            r1 = 3
            boolean r6 = r5.m1264V(r1, r2, r6, r7)
            if (r6 == 0) goto L4e
            r0 = r0 | 1
        L4e:
            return r0
    }

    /* renamed from: S */
    public int m1261S(int r5, int r6) {
            r4 = this;
            int r0 = r5 + (-3)
            r1 = 0
            boolean r0 = r4.m1264V(r0, r1, r5, r6)
            r2 = 1
            int r0 = r0 << r2
            int r3 = r5 + (-2)
            boolean r3 = r4.m1264V(r3, r1, r5, r6)
            if (r3 == 0) goto L13
            r0 = r0 | 1
        L13:
            int r0 = r0 << r2
            int r3 = r5 + (-1)
            boolean r3 = r4.m1264V(r3, r1, r5, r6)
            if (r3 == 0) goto L1e
            r0 = r0 | 1
        L1e:
            int r0 = r0 << r2
            int r3 = r6 + (-4)
            boolean r3 = r4.m1264V(r1, r3, r5, r6)
            if (r3 == 0) goto L29
            r0 = r0 | 1
        L29:
            int r0 = r0 << r2
            int r3 = r6 + (-3)
            boolean r3 = r4.m1264V(r1, r3, r5, r6)
            if (r3 == 0) goto L34
            r0 = r0 | 1
        L34:
            int r0 = r0 << r2
            int r3 = r6 + (-2)
            boolean r3 = r4.m1264V(r1, r3, r5, r6)
            if (r3 == 0) goto L3f
            r0 = r0 | 1
        L3f:
            int r0 = r0 << r2
            int r3 = r6 + (-1)
            boolean r1 = r4.m1264V(r1, r3, r5, r6)
            if (r1 == 0) goto L4a
            r0 = r0 | 1
        L4a:
            int r0 = r0 << r2
            boolean r5 = r4.m1264V(r2, r3, r5, r6)
            if (r5 == 0) goto L53
            r0 = r0 | 1
        L53:
            return r0
    }

    /* renamed from: T */
    public int m1262T(int r8, int r9) {
            r7 = this;
            int r0 = r8 + (-1)
            r1 = 0
            boolean r2 = r7.m1264V(r0, r1, r8, r9)
            r3 = 1
            int r2 = r2 << r3
            int r4 = r9 + (-1)
            boolean r0 = r7.m1264V(r0, r4, r8, r9)
            if (r0 == 0) goto L13
            r2 = r2 | 1
        L13:
            int r0 = r2 << 1
            int r2 = r9 + (-3)
            boolean r5 = r7.m1264V(r1, r2, r8, r9)
            if (r5 == 0) goto L1f
            r0 = r0 | 1
        L1f:
            int r0 = r0 << r3
            int r5 = r9 + (-2)
            boolean r6 = r7.m1264V(r1, r5, r8, r9)
            if (r6 == 0) goto L2a
            r0 = r0 | 1
        L2a:
            int r0 = r0 << r3
            boolean r1 = r7.m1264V(r1, r4, r8, r9)
            if (r1 == 0) goto L33
            r0 = r0 | 1
        L33:
            int r0 = r0 << r3
            boolean r1 = r7.m1264V(r3, r2, r8, r9)
            if (r1 == 0) goto L3c
            r0 = r0 | 1
        L3c:
            int r0 = r0 << r3
            boolean r1 = r7.m1264V(r3, r5, r8, r9)
            if (r1 == 0) goto L45
            r0 = r0 | 1
        L45:
            int r0 = r0 << r3
            boolean r8 = r7.m1264V(r3, r4, r8, r9)
            if (r8 == 0) goto L4e
            r0 = r0 | 1
        L4e:
            return r0
    }

    /* renamed from: U */
    public int m1263U(int r5, int r6) {
            r4 = this;
            int r0 = r5 + (-3)
            r1 = 0
            boolean r0 = r4.m1264V(r0, r1, r5, r6)
            r2 = 1
            int r0 = r0 << r2
            int r3 = r5 + (-2)
            boolean r3 = r4.m1264V(r3, r1, r5, r6)
            if (r3 == 0) goto L13
            r0 = r0 | 1
        L13:
            int r0 = r0 << r2
            int r3 = r5 + (-1)
            boolean r3 = r4.m1264V(r3, r1, r5, r6)
            if (r3 == 0) goto L1e
            r0 = r0 | 1
        L1e:
            int r0 = r0 << r2
            int r3 = r6 + (-2)
            boolean r3 = r4.m1264V(r1, r3, r5, r6)
            if (r3 == 0) goto L29
            r0 = r0 | 1
        L29:
            int r0 = r0 << r2
            int r3 = r6 + (-1)
            boolean r1 = r4.m1264V(r1, r3, r5, r6)
            if (r1 == 0) goto L34
            r0 = r0 | 1
        L34:
            int r0 = r0 << r2
            boolean r1 = r4.m1264V(r2, r3, r5, r6)
            if (r1 == 0) goto L3d
            r0 = r0 | 1
        L3d:
            int r0 = r0 << r2
            r1 = 2
            boolean r1 = r4.m1264V(r1, r3, r5, r6)
            if (r1 == 0) goto L47
            r0 = r0 | 1
        L47:
            int r0 = r0 << r2
            r1 = 3
            boolean r5 = r4.m1264V(r1, r3, r5, r6)
            if (r5 == 0) goto L51
            r0 = r0 | 1
        L51:
            return r0
    }

    /* renamed from: V */
    public boolean m1264V(int r1, int r2, int r3, int r4) {
            r0 = this;
            if (r1 >= 0) goto La
            int r1 = r1 + r3
            int r3 = r3 + 4
            r3 = r3 & 7
            int r3 = 4 - r3
            int r2 = r2 + r3
        La:
            if (r2 >= 0) goto L14
            int r2 = r2 + r4
            int r4 = r4 + 4
            r3 = r4 & 7
            int r3 = 4 - r3
            int r1 = r1 + r3
        L14:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r0.f2231a0
            zb.b r3 = (p453zb.C7270b) r3
            r3.m14376f(r2, r1)
            java.util.ArrayList<androidx.fragment.app.n> r3 = r0.f2230Z
            zb.b r3 = (p453zb.C7270b) r3
            boolean r1 = r3.m14372b(r2, r1)
            return r1
    }

    /* renamed from: W */
    public int m1265W(int r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = r6 + (-2)
            int r1 = r7 + (-2)
            boolean r2 = r5.m1264V(r0, r1, r8, r9)
            int r2 = r2 << 1
            int r3 = r7 + (-1)
            boolean r0 = r5.m1264V(r0, r3, r8, r9)
            if (r0 == 0) goto L14
            r2 = r2 | 1
        L14:
            int r0 = r2 << 1
            int r2 = r6 + (-1)
            boolean r4 = r5.m1264V(r2, r1, r8, r9)
            if (r4 == 0) goto L20
            r0 = r0 | 1
        L20:
            int r0 = r0 << 1
            boolean r4 = r5.m1264V(r2, r3, r8, r9)
            if (r4 == 0) goto L2a
            r0 = r0 | 1
        L2a:
            int r0 = r0 << 1
            boolean r2 = r5.m1264V(r2, r7, r8, r9)
            if (r2 == 0) goto L34
            r0 = r0 | 1
        L34:
            int r0 = r0 << 1
            boolean r1 = r5.m1264V(r6, r1, r8, r9)
            if (r1 == 0) goto L3e
            r0 = r0 | 1
        L3e:
            int r0 = r0 << 1
            boolean r1 = r5.m1264V(r6, r3, r8, r9)
            if (r1 == 0) goto L48
            r0 = r0 | 1
        L48:
            int r0 = r0 << 1
            boolean r6 = r5.m1264V(r6, r7, r8, r9)
            if (r6 == 0) goto L52
            r0 = r0 | 1
        L52:
            return r0
    }

    /* renamed from: X */
    public void m1266X(androidx.fragment.app.ComponentCallbacksC0395n r3) {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r2.f2230Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n> r1 = r2.f2230Z     // Catch: java.lang.Throwable -> L11
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L11
            r1.remove(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = 0
            r3.f2287i0 = r0
            return
        L11:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    /* renamed from: Y */
    public void m1267Y(java.lang.Object r5, java.io.OutputStream r6) {
            r4 = this;
            i7.c r0 = new i7.c
            java.util.ArrayList<androidx.fragment.app.n> r1 = r4.f2230Z
            java.util.Map r1 = (java.util.Map) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r4.f2231a0
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r4.f2232b0
            qa.e r3 = (qa.InterfaceC5608e) r3
            r0.<init>(r6, r1, r2, r3)
            if (r5 != 0) goto L14
            goto L23
        L14:
            java.lang.Class r6 = r5.getClass()
            java.lang.Object r6 = r1.get(r6)
            qa.e r6 = (qa.InterfaceC5608e) r6
            if (r6 == 0) goto L24
            r6.mo5556a(r5, r0)
        L23:
            return
        L24:
            qa.c r6 = new qa.c
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            int r0 = r5.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 15
            r1.<init>(r0)
            java.lang.String r0 = "No encoder for "
            java.lang.String r5 = p346u.C6269n.m12888a(r1, r0, r5)
            r6.<init>(r5)
            throw r6
    }

    /* renamed from: Z */
    public java.util.List<p124h7.C2973z1<P>> m1268Z(byte[] r3) {
            r2 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r2.f2230Z
            java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0
            h7.a2 r1 = new h7.a2
            r1.<init>(r3)
            java.lang.Object r3 = r0.get(r1)
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L12
            return r3
        L12:
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
    }

    @Override // p124h7.InterfaceC2885u3
    /* renamed from: a */
    public byte[] mo1269a(byte[] r9, int r10) {
            r8 = this;
            r0 = 16
            if (r10 > r0) goto L6b
            h7.w7<h7.z7, javax.crypto.Cipher> r1 = p124h7.C2925w7.f11992e
            java.lang.String r2 = "AES/ECB/NoPadding"
            java.lang.Object r1 = r1.m7238a(r2)
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            java.util.ArrayList<androidx.fragment.app.n> r2 = r8.f2230Z
            javax.crypto.SecretKey r2 = (javax.crypto.SecretKey) r2
            r3 = 1
            r1.init(r3, r2)
            int r2 = r9.length
            double r4 = (double) r2
            r6 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r3 = java.lang.Math.max(r3, r4)
            int r4 = r3 * 16
            r5 = 0
            if (r4 != r2) goto L36
            int r2 = r3 + (-1)
            int r2 = r2 * 16
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r4 = r8.f2231a0
            byte[] r4 = (byte[]) r4
            byte[] r2 = p124h7.C2939x3.m7258H(r9, r2, r4, r5, r0)
            goto L4a
        L36:
            int r4 = r3 + (-1)
            int r4 = r4 * 16
            byte[] r2 = java.util.Arrays.copyOfRange(r9, r4, r2)
            byte[] r2 = p036c6.C0906q0.m2617e(r2)
            java.lang.Object r4 = r8.f2232b0
            byte[] r4 = (byte[]) r4
            byte[] r2 = p124h7.C2939x3.m7255E(r2, r4)
        L4a:
            byte[] r4 = new byte[r0]
            r6 = 0
        L4d:
            int r7 = r3 + (-1)
            if (r6 >= r7) goto L5e
            int r7 = r6 * 16
            byte[] r4 = p124h7.C2939x3.m7258H(r4, r5, r9, r7, r0)
            byte[] r4 = r1.doFinal(r4)
            int r6 = r6 + 1
            goto L4d
        L5e:
            byte[] r9 = p124h7.C2939x3.m7255E(r2, r4)
            byte[] r9 = r1.doFinal(r9)
            byte[] r9 = java.util.Arrays.copyOf(r9, r10)
            return r9
        L6b:
            java.security.InvalidAlgorithmParameterException r9 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r10 = "outputLength too large, max is 16 bytes"
            r9.<init>(r10)
            throw r9
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: b */
    public void mo28b(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f2229Y
            r1 = 0
            r2 = 0
            switch(r0) {
                case 9: goto Le7;
                case 10: goto Lcc;
                case 11: goto La7;
                case 12: goto L51;
                case 13: goto L36;
                case 14: goto L9;
                default: goto L7;
            }
        L7:
            goto L100
        L9:
            h7.ee r7 = (p124h7.C2608ee) r7
            h7.ie r7 = r7.f11490Y
            java.util.List<h7.ge> r7 = r7.f11641Y
            if (r7 == 0) goto L2c
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L18
            goto L2c
        L18:
            java.lang.Object r0 = r6.f2232b0
            h7.ab r0 = (p124h7.C2532ab) r0
            h7.fc r0 = r0.f11371Z
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r6.f2231a0
            h7.me r2 = (p124h7.C2752me) r2
            java.lang.Object r7 = r7.get(r1)
            h7.ge r7 = (p124h7.C2644ge) r7
            r0.m6717e(r2, r7)
            goto L35
        L2c:
            java.util.ArrayList<androidx.fragment.app.n> r7 = r6.f2230Z
            h7.jd r7 = (p124h7.InterfaceC2697jd) r7
            java.lang.String r0 = "No users"
            r7.mo29e(r0)
        L35:
            return
        L36:
            h7.me r7 = (p124h7.C2752me) r7
            java.util.ArrayList<androidx.fragment.app.n> r0 = r6.f2230Z
            h7.ae r0 = (p124h7.C2535ae) r0
            java.lang.String r7 = r7.f11773Z
            r0.f11376a0 = r7
            java.lang.Object r7 = r6.f2232b0
            f.t r7 = (p083f.C1933t) r7
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r7 = r7.f8425Z
            h7.kd r7 = (p124h7.AbstractC2715kd) r7
            f.t r1 = new f.t
            r1.<init>(r6, r2)
            r7.mo6600d(r2, r0, r1)
            return
        L51:
            h7.ee r7 = (p124h7.C2608ee) r7
            h7.ie r7 = r7.f11490Y
            java.util.List<h7.ge> r7 = r7.f11641Y
            if (r7 == 0) goto L9d
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L60
            goto L9d
        L60:
            java.lang.Object r7 = r7.get(r1)
            r3 = r7
            h7.ge r3 = (p124h7.C2644ge) r3
            h7.af r4 = new h7.af
            r4.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r7 = r6.f2231a0
            h7.me r7 = (p124h7.C2752me) r7
            java.lang.String r7 = r7.f11773Z
            com.google.android.gms.common.internal.C1101a.m3100e(r7)
            r4.f11380Y = r7
            java.lang.Object r7 = r6.f2232b0
            h7.db r7 = (p124h7.C2587db) r7
            java.lang.String r7 = r7.f11451Z
            com.google.android.gms.common.internal.C1101a.m3100e(r7)
            h7.gf r0 = r4.f11387f0
            java.util.List<java.lang.String> r0 = r0.f11558Z
            r0.add(r7)
            java.lang.Object r7 = r6.f2232b0
            h7.db r7 = (p124h7.C2587db) r7
            f.t r0 = r7.f11453b0
            h7.fc r1 = r7.f11452a0
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r7 = r6.f2231a0
            r2 = r7
            h7.me r2 = (p124h7.C2752me) r2
            java.util.ArrayList<androidx.fragment.app.n> r7 = r6.f2230Z
            r5 = r7
            h7.jd r5 = (p124h7.InterfaceC2697jd) r5
            p083f.C1933t.m4779H(r0, r1, r2, r3, r4, r5)
            goto La6
        L9d:
            java.util.ArrayList<androidx.fragment.app.n> r7 = r6.f2230Z
            h7.jd r7 = (p124h7.InterfaceC2697jd) r7
            java.lang.String r0 = "No users."
            r7.mo29e(r0)
        La6:
            return
        La7:
            h7.me r7 = (p124h7.C2752me) r7
            java.util.ArrayList<androidx.fragment.app.n> r0 = r6.f2230Z
            h7.if r0 = (p124h7.C2681if) r0
            r1 = 1
            r0.f11656m0 = r1
            java.lang.String r7 = r7.f11773Z
            com.google.android.gms.common.internal.C1101a.m3100e(r7)
            r0.f11643Z = r7
            java.lang.Object r7 = r6.f2232b0
            f.t r7 = (p083f.C1933t) r7
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r7 = r7.f8425Z
            h7.kd r7 = (p124h7.AbstractC2715kd) r7
            java.util.ArrayList<androidx.fragment.app.n> r0 = r6.f2230Z
            h7.if r0 = (p124h7.C2681if) r0
            h7.hd r1 = new h7.hd
            r1.<init>(r6, r6, r2)
            r7.mo6612p(r2, r0, r1)
            return
        Lcc:
            h7.me r7 = (p124h7.C2752me) r7
            java.util.ArrayList<androidx.fragment.app.n> r0 = r6.f2230Z
            h7.of r0 = (p124h7.C2789of) r0
            java.lang.String r7 = r7.f11773Z
            r0.f11815c0 = r7
            java.lang.Object r7 = r6.f2232b0
            f.t r7 = (p083f.C1933t) r7
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r7 = r7.f8425Z
            h7.kd r7 = (p124h7.AbstractC2715kd) r7
            h7.hd r1 = new h7.hd
            r1.<init>(r6, r6)
            r7.mo6615s(r2, r0, r1)
            return
        Le7:
            h7.me r7 = (p124h7.C2752me) r7
            h7.yd r0 = new h7.yd
            java.util.ArrayList<androidx.fragment.app.n> r1 = r6.f2230Z
            v9.e r1 = (p375v9.C6594e) r1
            java.lang.String r7 = r7.f11773Z
            r0.<init>(r1, r7)
            java.lang.Object r7 = r6.f2232b0
            f.t r7 = (p083f.C1933t) r7
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r6.f2231a0
            h7.fc r1 = (p124h7.C2624fc) r1
            r7.m4792x(r0, r1)
            return
        L100:
            h7.me r7 = (p124h7.C2752me) r7
            h7.af r0 = new h7.af
            r0.<init>()
            java.lang.String r1 = r7.f11773Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            r0.f11380Y = r1
            java.util.ArrayList<androidx.fragment.app.n> r1 = r6.f2230Z
            v9.a0 r1 = (p375v9.C6587a0) r1
            boolean r2 = r1.f25769a0
            if (r2 != 0) goto L11a
            java.lang.String r2 = r1.f25767Y
            if (r2 == 0) goto L12a
        L11a:
            java.lang.String r1 = r1.f25767Y
            if (r1 != 0) goto L128
            h7.gf r1 = r0.f11386e0
            java.util.List<java.lang.String> r1 = r1.f11558Z
            java.lang.String r2 = "DISPLAY_NAME"
            r1.add(r2)
            goto L12a
        L128:
            r0.f11381Z = r1
        L12a:
            java.util.ArrayList<androidx.fragment.app.n> r1 = r6.f2230Z
            v9.a0 r1 = (p375v9.C6587a0) r1
            boolean r2 = r1.f25770b0
            if (r2 != 0) goto L136
            android.net.Uri r2 = r1.f25771c0
            if (r2 == 0) goto L146
        L136:
            java.lang.String r1 = r1.f25768Z
            if (r1 != 0) goto L144
            h7.gf r1 = r0.f11386e0
            java.util.List<java.lang.String> r1 = r1.f11558Z
            java.lang.String r2 = "PHOTO_URL"
            r1.add(r2)
            goto L146
        L144:
            r0.f11385d0 = r1
        L146:
            java.lang.Object r1 = r6.f2232b0
            f.t r1 = (p083f.C1933t) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r2 = r6.f2231a0
            h7.fc r2 = (p124h7.C2624fc) r2
            p083f.C1933t.m4778F(r1, r2, r7, r0, r6)
            return
    }

    @Override // p218m6.InterfaceC4396i
    /* renamed from: c */
    public void mo813c(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r4.f2230Z
            com.google.android.gms.cast.d r0 = (com.google.android.gms.cast.C1060d) r0
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r4.f2231a0
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.f2232b0
            c6.h r2 = (p036c6.C0887h) r2
            h6.e0 r5 = (p123h6.C2496e0) r5
            s7.j r6 = (p327s7.C5986j) r6
            r0.m2963i()
            android.os.IInterface r5 = r5.m11053y()
            h6.e r5 = (p123h6.C2495e) r5
            android.os.Parcel r3 = r5.m3834k2()
            r3.writeString(r1)
            p072e7.C1632i.m4225b(r3, r2)
            r1 = 13
            r5.m3838o2(r1, r3)
            r0.m2965k(r6)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r4 = this;
            int r0 = r4.f2229Y
            switch(r0) {
                case 17: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = super.clone()
            return r0
        La:
            androidx.fragment.app.l0 r0 = new androidx.fragment.app.l0
            java.util.ArrayList<androidx.fragment.app.n> r1 = r4.f2230Z
            k7.b r1 = (p185k7.C3738b) r1
            k7.b r1 = r1.m8218a()
            r0.<init>(r1)
            java.lang.Object r1 = r4.f2232b0
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            k7.b r2 = (p185k7.C3738b) r2
            java.lang.Object r3 = r0.f2232b0
            java.util.List r3 = (java.util.List) r3
            k7.b r2 = r2.m8218a()
            r3.add(r2)
            goto L1f
        L37:
            return r0
    }

    @Override // p327s7.InterfaceC5982f
    /* renamed from: d */
    public void mo1270d(java.lang.Object r6) {
            r5 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r5.f2230Z
            d6.a r0 = (p052d6.C1295a) r0
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r5.f2231a0
            e7.l r1 = (p072e7.C1662l) r1
            java.lang.Object r2 = r5.f2232b0
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            android.os.Bundle r6 = (android.os.Bundle) r6
            d6.f r3 = r0.f6810c
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r3, r4)
            android.content.Context r3 = r0.f6808a
            java.lang.String r3 = r3.getPackageName()
            d6.f r0 = r0.f6810c
            e7.h1 r4 = new e7.h1
            r4.<init>(r2, r1, r6, r3)
            f.t r6 = new f.t
            r6.<init>(r4)
            java.lang.Class<com.google.android.gms.cast.framework.a> r1 = com.google.android.gms.cast.framework.C1062a.class
            r0.m3768a(r6, r1)
            return
    }

    @Override // p124h7.InterfaceC2697jd
    /* renamed from: e */
    public void mo29e(java.lang.String r2) {
            r1 = this;
            int r0 = r1.f2229Y
            switch(r0) {
                case 9: goto L40;
                case 10: goto L34;
                case 11: goto L28;
                case 12: goto L1a;
                case 13: goto Le;
                case 14: goto L6;
                default: goto L5;
            }
        L5:
            goto L4c
        L6:
            java.util.ArrayList<androidx.fragment.app.n> r0 = r1.f2230Z
            h7.jd r0 = (p124h7.InterfaceC2697jd) r0
            r0.mo29e(r2)
            return
        Le:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
        L1a:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.lang.Object r0 = r1.f2232b0
            h7.db r0 = (p124h7.C2587db) r0
            h7.fc r0 = r0.f11452a0
            r0.mo6716d(r2)
            return
        L28:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
        L34:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
        L40:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
        L4c:
            com.google.android.gms.common.api.Status r2 = p074e9.C1805a.m4514B(r2)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            h7.fc r0 = (p124h7.C2624fc) r0
            r0.mo6716d(r2)
            return
    }

    /* renamed from: f */
    public void m1271f(androidx.fragment.app.ComponentCallbacksC0395n r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r3.f2230Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L1e
            java.util.ArrayList<androidx.fragment.app.n> r0 = r3.f2230Z
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.n> r1 = r3.f2230Z     // Catch: java.lang.Throwable -> L1b
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L1b
            r1.add(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            r4.f2287i0 = r0
            return
        L1b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Fragment already added: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // p425y2.InterfaceC7105b
    /* renamed from: g */
    public p214m2.InterfaceC4345w<byte[]> mo1272g(p214m2.InterfaceC4345w<android.graphics.drawable.Drawable> r3, p180k2.C3673e r4) {
            r2 = this;
            java.lang.Object r0 = r3.get()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            boolean r1 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r1 == 0) goto L21
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r3 = r2.f2231a0
            y2.b r3 = (p425y2.InterfaceC7105b) r3
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            java.util.ArrayList<androidx.fragment.app.n> r1 = r2.f2230Z
            n2.c r1 = (p229n2.InterfaceC4673c) r1
            t2.d r0 = p334t2.C6126d.m12654f(r0, r1)
            m2.w r3 = r3.mo1272g(r0, r4)
            return r3
        L21:
            boolean r0 = r0 instanceof p404x2.C6914c
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r2.f2232b0
            y2.b r0 = (p425y2.InterfaceC7105b) r0
            m2.w r3 = r0.mo1272g(r3, r4)
            return r3
        L2e:
            r3 = 0
            return r3
    }

    /* renamed from: h */
    public p127ha.C2994a m1273h(p127ha.C2994a r3, la.C4237e r4) {
            r2 = this;
            java.lang.Object r0 = r4.f17398a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "X-CRASHLYTICS-GOOGLE-APP-ID"
            r2.m1274i(r3, r1, r0)
            java.lang.String r0 = "X-CRASHLYTICS-API-CLIENT-TYPE"
            java.lang.String r1 = "android"
            r2.m1274i(r3, r0, r1)
            java.lang.String r0 = "X-CRASHLYTICS-API-CLIENT-VERSION"
            java.lang.String r1 = "18.2.3"
            r2.m1274i(r3, r0, r1)
            java.lang.String r0 = "Accept"
            java.lang.String r1 = "application/json"
            r2.m1274i(r3, r0, r1)
            java.lang.Object r0 = r4.f17399b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "X-CRASHLYTICS-DEVICE-MODEL"
            r2.m1274i(r3, r1, r0)
            java.lang.Object r0 = r4.f17400c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "X-CRASHLYTICS-OS-BUILD-VERSION"
            r2.m1274i(r3, r1, r0)
            java.lang.Object r0 = r4.f17401d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "X-CRASHLYTICS-OS-DISPLAY-VERSION"
            r2.m1274i(r3, r1, r0)
            java.lang.Object r4 = r4.f17402e
            da.i0 r4 = (p056da.InterfaceC1363i0) r4
            da.h0 r4 = (p056da.C1361h0) r4
            java.lang.String r4 = r4.m3877c()
            java.lang.String r0 = "X-CRASHLYTICS-INSTALLATION-ID"
            r2.m1274i(r3, r0, r4)
            return r3
    }

    /* renamed from: i */
    public void m1274i(p127ha.C2994a r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            if (r3 == 0) goto L7
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f12086c
            r1.put(r2, r3)
        L7:
            return
    }

    /* renamed from: j */
    public void m1275j() {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r2.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.removeAll(r1)
            return
    }

    /* renamed from: k */
    public boolean m1276k(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    /* renamed from: l */
    public p127ha.C2994a m1277l(java.util.Map<java.lang.String, java.lang.String> r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r3.f2231a0
            y.e r0 = (p422y.C7095e) r0
            java.util.ArrayList<androidx.fragment.app.n> r1 = r3.f2230Z
            java.lang.String r1 = (java.lang.String) r1
            java.util.Objects.requireNonNull(r0)
            ha.a r0 = new ha.a
            r0.<init>(r1, r4)
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f12086c
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = "Crashlytics Android SDK/18.2.3"
            r4.put(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f12086c
            java.lang.String r1 = "X-CRASHLYTICS-DEVELOPER-TOKEN"
            java.lang.String r2 = "470fa2b4ae81cd56ecbcda9735803434cec591fa"
            r4.put(r1, r2)
            return r0
    }

    /* renamed from: m */
    public java.lang.String m1278m(java.lang.StringBuilder r4, int r5) {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            kc.n r1 = r3.m1280o(r5, r1)
            java.lang.String r2 = r1.f17010Z
            java.lang.String r2 = p190kc.C4095p.m9181a(r2)
            if (r2 == 0) goto L11
            r4.append(r2)
        L11:
            boolean r2 = r1.f17012b0
            if (r2 == 0) goto L1c
            int r2 = r1.f17011a0
            java.lang.String r2 = java.lang.String.valueOf(r2)
            goto L1d
        L1c:
            r2 = r0
        L1d:
            int r1 = r1.f12333Y
            if (r5 == r1) goto L24
            r5 = r1
            r1 = r2
            goto L2
        L24:
            java.lang.String r4 = r4.toString()
            return r4
    }

    /* renamed from: n */
    public p190kc.C4092m m1279n(int r4) {
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r3.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            r1 = 5
            int r0 = m1242t(r0, r4, r1)
            r2 = 15
            if (r0 != r2) goto L16
            kc.m r0 = new kc.m
            int r4 = r4 + r1
            r1 = 36
            r0.<init>(r4, r1)
            return r0
        L16:
            if (r0 < r1) goto L25
            if (r0 >= r2) goto L25
            kc.m r2 = new kc.m
            int r4 = r4 + r1
            int r0 = r0 + 48
            int r0 = r0 - r1
            char r0 = (char) r0
            r2.<init>(r4, r0)
            return r2
        L25:
            java.util.ArrayList<androidx.fragment.app.n> r0 = r3.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            r1 = 6
            int r0 = m1242t(r0, r4, r1)
            r2 = 32
            if (r0 < r2) goto L40
            r2 = 58
            if (r0 >= r2) goto L40
            kc.m r2 = new kc.m
            int r4 = r4 + r1
            int r0 = r0 + 33
            char r0 = (char) r0
            r2.<init>(r4, r0)
            return r2
        L40:
            switch(r0) {
                case 58: goto L5b;
                case 59: goto L58;
                case 60: goto L55;
                case 61: goto L52;
                case 62: goto L4f;
                default: goto L43;
            }
        L43:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r1 = "Decoding invalid alphanumeric value: "
            java.lang.String r0 = p422y.C7094d.m14209a(r1, r0)
            r4.<init>(r0)
            throw r4
        L4f:
            r0 = 47
            goto L5d
        L52:
            r0 = 46
            goto L5d
        L55:
            r0 = 45
            goto L5d
        L58:
            r0 = 44
            goto L5d
        L5b:
            r0 = 42
        L5d:
            kc.m r2 = new kc.m
            int r4 = r4 + r1
            r2.<init>(r4, r0)
            return r2
    }

    /* renamed from: o */
    public p190kc.C4093n m1280o(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.Object r0 = r2.f2232b0
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r1 = 0
            r0.setLength(r1)
            if (r4 == 0) goto L11
            java.lang.Object r0 = r2.f2232b0
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r0.append(r4)
        L11:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r4 = r2.f2231a0
            kc.l r4 = (p190kc.C4091l) r4
            r4.f17007a = r3
            kc.n r3 = r2.m1257O()
            if (r3 == 0) goto L37
            boolean r4 = r3.f17012b0
            if (r4 == 0) goto L37
            kc.n r4 = new kc.n
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r2.f2231a0
            kc.l r0 = (p190kc.C4091l) r0
            int r0 = r0.f17007a
            java.lang.Object r1 = r2.f2232b0
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r1 = r1.toString()
            int r3 = r3.f17011a0
            r4.<init>(r0, r1, r3)
            return r4
        L37:
            kc.n r3 = new kc.n
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r4 = r2.f2231a0
            kc.l r4 = (p190kc.C4091l) r4
            int r4 = r4.f17007a
            java.lang.Object r0 = r2.f2232b0
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r0 = r0.toString()
            r3.<init>(r4, r0)
            return r3
    }

    /* renamed from: p */
    public p190kc.C4092m m1281p(int r5) {
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r4.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            r1 = 5
            int r0 = m1242t(r0, r5, r1)
            r2 = 15
            if (r0 != r2) goto L16
            kc.m r0 = new kc.m
            int r5 = r5 + r1
            r1 = 36
            r0.<init>(r5, r1)
            return r0
        L16:
            if (r0 < r1) goto L25
            if (r0 >= r2) goto L25
            kc.m r2 = new kc.m
            int r5 = r5 + r1
            int r0 = r0 + 48
            int r0 = r0 - r1
            char r0 = (char) r0
            r2.<init>(r5, r0)
            return r2
        L25:
            java.util.ArrayList<androidx.fragment.app.n> r0 = r4.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            r1 = 7
            int r0 = m1242t(r0, r5, r1)
            r2 = 64
            r3 = 90
            if (r0 < r2) goto L40
            if (r0 >= r3) goto L40
            kc.m r2 = new kc.m
            int r5 = r5 + r1
            int r0 = r0 + 1
            char r0 = (char) r0
            r2.<init>(r5, r0)
            return r2
        L40:
            if (r0 < r3) goto L4f
            r2 = 116(0x74, float:1.63E-43)
            if (r0 >= r2) goto L4f
            kc.m r2 = new kc.m
            int r5 = r5 + r1
            int r0 = r0 + r1
            char r0 = (char) r0
            r2.<init>(r5, r0)
            return r2
        L4f:
            java.util.ArrayList<androidx.fragment.app.n> r0 = r4.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            r1 = 8
            int r0 = m1242t(r0, r5, r1)
            switch(r0) {
                case 232: goto L9d;
                case 233: goto L9a;
                case 234: goto L97;
                case 235: goto L94;
                case 236: goto L91;
                case 237: goto L8e;
                case 238: goto L8b;
                case 239: goto L88;
                case 240: goto L85;
                case 241: goto L82;
                case 242: goto L7f;
                case 243: goto L7c;
                case 244: goto L79;
                case 245: goto L76;
                case 246: goto L73;
                case 247: goto L70;
                case 248: goto L6d;
                case 249: goto L6a;
                case 250: goto L67;
                case 251: goto L64;
                case 252: goto L61;
                default: goto L5c;
            }
        L5c:
            sb.f r5 = sb.C6012f.m12491a()
            throw r5
        L61:
            r0 = 32
            goto L9f
        L64:
            r0 = 95
            goto L9f
        L67:
            r0 = 63
            goto L9f
        L6a:
            r0 = 62
            goto L9f
        L6d:
            r0 = 61
            goto L9f
        L70:
            r0 = 60
            goto L9f
        L73:
            r0 = 59
            goto L9f
        L76:
            r0 = 58
            goto L9f
        L79:
            r0 = 47
            goto L9f
        L7c:
            r0 = 46
            goto L9f
        L7f:
            r0 = 45
            goto L9f
        L82:
            r0 = 44
            goto L9f
        L85:
            r0 = 43
            goto L9f
        L88:
            r0 = 42
            goto L9f
        L8b:
            r0 = 41
            goto L9f
        L8e:
            r0 = 40
            goto L9f
        L91:
            r0 = 39
            goto L9f
        L94:
            r0 = 38
            goto L9f
        L97:
            r0 = 37
            goto L9f
        L9a:
            r0 = 34
            goto L9f
        L9d:
            r0 = 33
        L9f:
            kc.m r2 = new kc.m
            int r5 = r5 + r1
            r2.<init>(r5, r0)
            return r2
    }

    /* renamed from: q */
    public p190kc.C4094o m1282q(int r4) {
            r3 = this;
            int r0 = r4 + 7
            java.util.ArrayList<androidx.fragment.app.n> r1 = r3.f2230Z
            r2 = r1
            zb.a r2 = (p453zb.C7269a) r2
            int r2 = r2.f27901Z
            if (r0 <= r2) goto L30
            r0 = 4
            zb.a r1 = (p453zb.C7269a) r1
            int r4 = m1242t(r1, r4, r0)
            r0 = 10
            if (r4 != 0) goto L22
            kc.o r4 = new kc.o
            java.util.ArrayList<androidx.fragment.app.n> r1 = r3.f2230Z
            zb.a r1 = (p453zb.C7269a) r1
            int r1 = r1.f27901Z
            r4.<init>(r1, r0, r0)
            return r4
        L22:
            kc.o r1 = new kc.o
            java.util.ArrayList<androidx.fragment.app.n> r2 = r3.f2230Z
            zb.a r2 = (p453zb.C7269a) r2
            int r2 = r2.f27901Z
            int r4 = r4 + (-1)
            r1.<init>(r2, r4, r0)
            return r1
        L30:
            zb.a r1 = (p453zb.C7269a) r1
            r2 = 7
            int r4 = m1242t(r1, r4, r2)
            int r4 = r4 + (-8)
            int r1 = r4 / 11
            int r4 = r4 % 11
            kc.o r2 = new kc.o
            r2.<init>(r0, r1, r4)
            return r2
    }

    /* renamed from: r */
    public p453zb.C7270b m1283r(p453zb.C7270b r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.Object r2 = r0.f2232b0
            cc.d r2 = (cc.C0945d) r2
            int r3 = r2.f4926b
            int r4 = r2.f4927c
            int r5 = r1.f27903Z
            if (r5 != r3) goto L58
            int r5 = r2.f4928d
            int r2 = r2.f4929e
            int r3 = r3 / r5
            int r4 = r4 / r2
            int r6 = r3 * r5
            int r7 = r4 * r2
            zb.b r8 = new zb.b
            r8.<init>(r7, r6)
            r7 = 0
        L20:
            if (r7 >= r3) goto L57
            int r9 = r7 * r5
            r10 = 0
        L25:
            if (r10 >= r4) goto L54
            int r11 = r10 * r2
            r12 = 0
        L2a:
            if (r12 >= r5) goto L51
            int r13 = r5 + 2
            int r13 = r13 * r7
            int r13 = r13 + 1
            int r13 = r13 + r12
            int r14 = r9 + r12
            r15 = 0
        L36:
            if (r15 >= r2) goto L4e
            int r16 = r2 + 2
            int r16 = r16 * r10
            int r16 = r16 + 1
            int r6 = r16 + r15
            boolean r6 = r1.m14372b(r6, r13)
            if (r6 == 0) goto L4b
            int r6 = r11 + r15
            r8.m14376f(r6, r14)
        L4b:
            int r15 = r15 + 1
            goto L36
        L4e:
            int r12 = r12 + 1
            goto L2a
        L51:
            int r10 = r10 + 1
            goto L25
        L54:
            int r7 = r7 + 1
            goto L20
        L57:
            return r8
        L58:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Dimension of bitMarix must match the version size"
            r1.<init>(r2)
            throw r1
    }

    /* renamed from: s */
    public int m1284s(int r2, int r3) {
            r1 = this;
            java.util.ArrayList<androidx.fragment.app.n> r0 = r1.f2230Z
            zb.a r0 = (p453zb.C7269a) r0
            int r2 = m1242t(r0, r2, r3)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f2229Y
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.String r0 = "NavDeepLinkRequest"
            java.lang.String r1 = "{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0143b.m255a(r0, r1)
            java.util.ArrayList<androidx.fragment.app.n> r1 = r2.f2230Z
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L28
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.util.ArrayList<androidx.fragment.app.n> r1 = r2.f2230Z
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L28:
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r2.f2231a0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L3a
            java.lang.String r1 = " action="
            r0.append(r1)
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r2.f2231a0
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L3a:
            java.lang.Object r1 = r2.f2232b0
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L4c
            java.lang.String r1 = " mimetype="
            r0.append(r1)
            java.lang.Object r1 = r2.f2232b0
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
        L4c:
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public androidx.fragment.app.ComponentCallbacksC0395n m1285u(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.j0 r2 = (androidx.fragment.app.C0388j0) r2
            if (r2 == 0) goto Lf
            androidx.fragment.app.n r2 = r2.f2202c
            return r2
        Lf:
            r2 = 0
            return r2
    }

    /* renamed from: v */
    public androidx.fragment.app.ComponentCallbacksC0395n m1286v(java.lang.String r4) {
            r3 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r3.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.j0 r1 = (androidx.fragment.app.C0388j0) r1
            if (r1 == 0) goto Lc
            androidx.fragment.app.n r1 = r1.f2202c
            java.lang.String r2 = r1.f2281c0
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L25
            goto L2d
        L25:
            androidx.fragment.app.d0 r1 = r1.f2296r0
            androidx.fragment.app.l0 r1 = r1.f2115c
            androidx.fragment.app.n r1 = r1.m1286v(r4)
        L2d:
            if (r1 == 0) goto Lc
            return r1
        L30:
            r4 = 0
            return r4
    }

    /* renamed from: w */
    public java.util.List<androidx.fragment.app.C0388j0> m1287w() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r3.f2231a0
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.j0 r2 = (androidx.fragment.app.C0388j0) r2
            if (r2 == 0) goto L11
            r0.add(r2)
            goto L11
        L23:
            return r0
    }

    /* renamed from: x */
    public java.util.List<androidx.fragment.app.ComponentCallbacksC0395n> m1288x() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r1 = r3.f2231a0
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.j0 r2 = (androidx.fragment.app.C0388j0) r2
            if (r2 == 0) goto L22
            androidx.fragment.app.n r2 = r2.f2202c
            goto L23
        L22:
            r2 = 0
        L23:
            r0.add(r2)
            goto L11
        L27:
            return r0
    }

    /* renamed from: y */
    public long m1289y() {
            r2 = this;
            java.lang.Object r0 = r2.f2232b0
            r1 = r0
            m4.j r1 = (p216m4.InterfaceC4365j) r1
            if (r1 == 0) goto Le
            m4.j r0 = (p216m4.InterfaceC4365j) r0
            long r0 = r0.mo9797q()
            goto L10
        Le:
            r0 = -1
        L10:
            return r0
    }

    /* renamed from: z */
    public androidx.fragment.app.C0388j0 m1290z(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.j0> r0 = r1.f2231a0
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r2 = r0.get(r2)
            androidx.fragment.app.j0 r2 = (androidx.fragment.app.C0388j0) r2
            return r2
    }
}
