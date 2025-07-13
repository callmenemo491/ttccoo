package androidx.fragment.app;

/* renamed from: androidx.fragment.app.t0 */
/* loaded from: classes.dex */
public class C0408t0 {

    /* renamed from: a */
    public static final int[] f2373a = null;

    /* renamed from: b */
    public static final androidx.fragment.app.AbstractC0412v0 f2374b = null;

    /* renamed from: c */
    public static final androidx.fragment.app.AbstractC0412v0 f2375c = null;

    /* renamed from: androidx.fragment.app.t0$a */
    public interface a {
    }

    /* renamed from: androidx.fragment.app.t0$b */
    public static class b {

        /* renamed from: a */
        public androidx.fragment.app.ComponentCallbacksC0395n f2376a;

        /* renamed from: b */
        public boolean f2377b;

        /* renamed from: c */
        public androidx.fragment.app.C0365a f2378c;

        /* renamed from: d */
        public androidx.fragment.app.ComponentCallbacksC0395n f2379d;

        /* renamed from: e */
        public boolean f2380e;

        /* renamed from: f */
        public androidx.fragment.app.C0365a f2381f;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 11
            int[] r0 = new int[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10} // fill-array
            androidx.fragment.app.C0408t0.f2373a = r0
            androidx.fragment.app.u0 r0 = new androidx.fragment.app.u0
            r0.<init>()
            androidx.fragment.app.C0408t0.f2374b = r0
            java.lang.Class<t1.d> r0 = p333t1.C6100d.class
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L22
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r2)     // Catch: java.lang.Exception -> L22
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L22
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L22
            androidx.fragment.app.v0 r0 = (androidx.fragment.app.AbstractC0412v0) r0     // Catch: java.lang.Exception -> L22
            goto L23
        L22:
            r0 = 0
        L23:
            androidx.fragment.app.C0408t0.f2375c = r0
            return
    }

    /* renamed from: a */
    public static void m1356a(java.util.ArrayList<android.view.View> r3, p319s.C5934a<java.lang.String, android.view.View> r4, java.util.Collection<java.lang.String> r5) {
            int r0 = r4.f22812a0
            int r0 = r0 + (-1)
        L4:
            if (r0 < 0) goto L1e
            java.lang.Object r1 = r4.m12344l(r0)
            android.view.View r1 = (android.view.View) r1
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            java.lang.String r2 = p227n0.C4661t.h.m10606k(r1)
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L1b
            r3.add(r1)
        L1b:
            int r0 = r0 + (-1)
            goto L4
        L1e:
            return
    }

    /* renamed from: b */
    public static void m1357b(androidx.fragment.app.C0365a r8, androidx.fragment.app.AbstractC0394m0.a r9, android.util.SparseArray<androidx.fragment.app.C0408t0.b> r10, boolean r11, boolean r12) {
            androidx.fragment.app.n r0 = r9.f2250b
            if (r0 != 0) goto L5
            return
        L5:
            int r1 = r0.f2299u0
            if (r1 != 0) goto La
            return
        La:
            if (r11 == 0) goto L13
            int[] r2 = androidx.fragment.app.C0408t0.f2373a
            int r9 = r9.f2249a
            r9 = r2[r9]
            goto L15
        L13:
            int r9 = r9.f2249a
        L15:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L7a
            r4 = 3
            if (r9 == r4) goto L56
            r4 = 4
            if (r9 == r4) goto L3e
            r4 = 5
            if (r9 == r4) goto L2c
            r4 = 6
            if (r9 == r4) goto L56
            r4 = 7
            if (r9 == r4) goto L7a
            r9 = 0
            r2 = 0
            goto L87
        L2c:
            if (r12 == 0) goto L3b
            boolean r9 = r0.f2264G0
            if (r9 == 0) goto L7c
            boolean r9 = r0.f2301w0
            if (r9 != 0) goto L7c
            boolean r9 = r0.f2287i0
            if (r9 == 0) goto L7c
            goto L86
        L3b:
            boolean r9 = r0.f2301w0
            goto L87
        L3e:
            if (r12 == 0) goto L4d
            boolean r9 = r0.f2264G0
            if (r9 == 0) goto L76
            boolean r9 = r0.f2287i0
            if (r9 == 0) goto L76
            boolean r9 = r0.f2301w0
            if (r9 == 0) goto L76
            goto L74
        L4d:
            boolean r9 = r0.f2287i0
            if (r9 == 0) goto L76
            boolean r9 = r0.f2301w0
            if (r9 != 0) goto L76
            goto L74
        L56:
            boolean r9 = r0.f2287i0
            if (r12 == 0) goto L6e
            if (r9 != 0) goto L76
            android.view.View r9 = r0.f2260C0
            if (r9 == 0) goto L76
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L76
            float r9 = r0.f2265H0
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L76
            goto L74
        L6e:
            if (r9 == 0) goto L76
            boolean r9 = r0.f2301w0
            if (r9 != 0) goto L76
        L74:
            r9 = 1
            goto L77
        L76:
            r9 = 0
        L77:
            r4 = r9
            r9 = 0
            goto L8b
        L7a:
            if (r12 == 0) goto L7e
        L7c:
            r9 = 0
            goto L87
        L7e:
            boolean r9 = r0.f2287i0
            if (r9 != 0) goto L7c
            boolean r9 = r0.f2301w0
            if (r9 != 0) goto L7c
        L86:
            r9 = 1
        L87:
            r3 = r9
            r9 = r2
            r2 = 0
            r4 = 0
        L8b:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.t0$b r5 = (androidx.fragment.app.C0408t0.b) r5
            if (r3 == 0) goto La4
            if (r5 != 0) goto L9e
            androidx.fragment.app.t0$b r3 = new androidx.fragment.app.t0$b
            r3.<init>()
            r10.put(r1, r3)
            r5 = r3
        L9e:
            r5.f2376a = r0
            r5.f2377b = r11
            r5.f2378c = r8
        La4:
            r3 = 0
            if (r12 != 0) goto Lc5
            if (r9 == 0) goto Lc5
            if (r5 == 0) goto Lb1
            androidx.fragment.app.n r9 = r5.f2379d
            if (r9 != r0) goto Lb1
            r5.f2379d = r3
        Lb1:
            boolean r9 = r8.f2248p
            if (r9 != 0) goto Lc5
            androidx.fragment.app.d0 r9 = r8.f2030q
            androidx.fragment.app.j0 r6 = r9.m1171h(r0)
            androidx.fragment.app.l0 r7 = r9.f2115c
            r7.m1254L(r6)
            int r6 = r9.f2129q
            r9.m1151U(r0, r6)
        Lc5:
            if (r4 == 0) goto Lde
            if (r5 == 0) goto Lcd
            androidx.fragment.app.n r9 = r5.f2379d
            if (r9 != 0) goto Lde
        Lcd:
            if (r5 != 0) goto Ld8
            androidx.fragment.app.t0$b r9 = new androidx.fragment.app.t0$b
            r9.<init>()
            r10.put(r1, r9)
            r5 = r9
        Ld8:
            r5.f2379d = r0
            r5.f2380e = r11
            r5.f2381f = r8
        Lde:
            if (r12 != 0) goto Lea
            if (r2 == 0) goto Lea
            if (r5 == 0) goto Lea
            androidx.fragment.app.n r8 = r5.f2376a
            if (r8 != r0) goto Lea
            r5.f2376a = r3
        Lea:
            return
    }

    /* renamed from: c */
    public static void m1358c(androidx.fragment.app.ComponentCallbacksC0395n r0, androidx.fragment.app.ComponentCallbacksC0395n r1, boolean r2, p319s.C5934a<java.lang.String, android.view.View> r3, boolean r4) {
            if (r2 == 0) goto L6
            r1.m1345y()
            goto L9
        L6:
            r0.m1345y()
        L9:
            return
    }

    /* renamed from: d */
    public static boolean m1359d(androidx.fragment.app.AbstractC0412v0 r4, java.util.List<java.lang.Object> r5) {
            int r0 = r5.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L16
            java.lang.Object r3 = r5.get(r2)
            boolean r3 = r4.mo1376e(r3)
            if (r3 != 0) goto L13
            return r1
        L13:
            int r2 = r2 + 1
            goto L6
        L16:
            r4 = 1
            return r4
    }

    /* renamed from: e */
    public static p319s.C5934a<java.lang.String, android.view.View> m1360e(androidx.fragment.app.AbstractC0412v0 r3, p319s.C5934a<java.lang.String, java.lang.String> r4, java.lang.Object r5, androidx.fragment.app.C0408t0.b r6) {
            androidx.fragment.app.n r0 = r6.f2376a
            android.view.View r1 = r0.f2260C0
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L38
            if (r5 == 0) goto L38
            if (r1 != 0) goto Lf
            goto L38
        Lf:
            s.a r5 = new s.a
            r5.<init>()
            r3.m1394i(r5, r1)
            androidx.fragment.app.a r3 = r6.f2378c
            boolean r6 = r6.f2377b
            if (r6 == 0) goto L23
            r0.m1296B()
            java.util.ArrayList<java.lang.String> r3 = r3.f2246n
            goto L28
        L23:
            r0.m1345y()
            java.util.ArrayList<java.lang.String> r3 = r3.f2247o
        L28:
            if (r3 == 0) goto L34
            p319s.AbstractC5940g.m12333k(r5, r3)
            java.util.Collection r3 = r4.values()
            p319s.AbstractC5940g.m12333k(r5, r3)
        L34:
            m1368m(r4, r5)
            return r5
        L38:
            r4.clear()
            r3 = 0
            return r3
    }

    /* renamed from: f */
    public static p319s.C5934a<java.lang.String, android.view.View> m1361f(androidx.fragment.app.AbstractC0412v0 r2, p319s.C5934a<java.lang.String, java.lang.String> r3, java.lang.Object r4, androidx.fragment.app.C0408t0.b r5) {
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L35
            if (r4 != 0) goto L9
            goto L35
        L9:
            androidx.fragment.app.n r4 = r5.f2379d
            s.a r0 = new s.a
            r0.<init>()
            android.view.View r1 = r4.m1336t0()
            r2.m1394i(r0, r1)
            androidx.fragment.app.a r2 = r5.f2381f
            boolean r5 = r5.f2380e
            if (r5 == 0) goto L23
            r4.m1345y()
            java.util.ArrayList<java.lang.String> r2 = r2.f2247o
            goto L28
        L23:
            r4.m1296B()
            java.util.ArrayList<java.lang.String> r2 = r2.f2246n
        L28:
            if (r2 == 0) goto L2d
            p319s.AbstractC5940g.m12333k(r0, r2)
        L2d:
            java.util.Set r2 = r0.keySet()
            p319s.AbstractC5940g.m12333k(r3, r2)
            return r0
        L35:
            r3.clear()
            r2 = 0
            return r2
    }

    /* renamed from: g */
    public static androidx.fragment.app.AbstractC0412v0 m1362g(androidx.fragment.app.ComponentCallbacksC0395n r2, androidx.fragment.app.ComponentCallbacksC0395n r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L1c
            r2.m1294A()
            java.lang.Object r1 = r2.m1306J()
            if (r1 == 0) goto L13
            r0.add(r1)
        L13:
            java.lang.Object r2 = r2.m1308L()
            if (r2 == 0) goto L1c
            r0.add(r2)
        L1c:
            if (r3 == 0) goto L2d
            r3.m1343x()
            java.lang.Object r2 = r3.m1304H()
            if (r2 == 0) goto L2a
            r0.add(r2)
        L2a:
            r3.m1307K()
        L2d:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L35
            r2 = 0
            return r2
        L35:
            androidx.fragment.app.v0 r2 = androidx.fragment.app.C0408t0.f2374b
            boolean r3 = m1359d(r2, r0)
            if (r3 == 0) goto L3e
            return r2
        L3e:
            androidx.fragment.app.v0 r2 = androidx.fragment.app.C0408t0.f2375c
            if (r2 == 0) goto L49
            boolean r3 = m1359d(r2, r0)
            if (r3 == 0) goto L49
            return r2
        L49:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid Transition types"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: h */
    public static java.util.ArrayList<android.view.View> m1363h(androidx.fragment.app.AbstractC0412v0 r1, java.lang.Object r2, androidx.fragment.app.ComponentCallbacksC0395n r3, java.util.ArrayList<android.view.View> r4, android.view.View r5) {
            if (r2 == 0) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r3 = r3.f2260C0
            if (r3 == 0) goto Le
            r1.m1393f(r0, r3)
        Le:
            if (r4 == 0) goto L13
            r0.removeAll(r4)
        L13:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L21
            r0.add(r5)
            r1.mo1374b(r2, r0)
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    /* renamed from: i */
    public static java.lang.Object m1364i(androidx.fragment.app.AbstractC0412v0 r1, androidx.fragment.app.ComponentCallbacksC0395n r2, boolean r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r3 == 0) goto Lb
            java.lang.Object r0 = r2.m1304H()
            goto Le
        Lb:
            r2.m1343x()
        Le:
            java.lang.Object r1 = r1.mo1377g(r0)
            return r1
    }

    /* renamed from: j */
    public static java.lang.Object m1365j(androidx.fragment.app.AbstractC0412v0 r1, androidx.fragment.app.ComponentCallbacksC0395n r2, boolean r3) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            if (r3 == 0) goto Lb
            java.lang.Object r0 = r2.m1306J()
            goto Le
        Lb:
            r2.m1294A()
        Le:
            java.lang.Object r1 = r1.mo1377g(r0)
            return r1
    }

    /* renamed from: k */
    public static android.view.View m1366k(p319s.C5934a<java.lang.String, android.view.View> r0, androidx.fragment.app.C0408t0.b r1, java.lang.Object r2, boolean r3) {
            androidx.fragment.app.a r1 = r1.f2378c
            if (r2 == 0) goto L25
            if (r0 == 0) goto L25
            java.util.ArrayList<java.lang.String> r2 = r1.f2246n
            if (r2 == 0) goto L25
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L25
            r2 = 0
            if (r3 == 0) goto L16
            java.util.ArrayList<java.lang.String> r1 = r1.f2246n
            goto L18
        L16:
            java.util.ArrayList<java.lang.String> r1 = r1.f2247o
        L18:
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            return r0
        L25:
            r0 = 0
            return r0
    }

    /* renamed from: l */
    public static java.lang.Object m1367l(androidx.fragment.app.AbstractC0412v0 r0, androidx.fragment.app.ComponentCallbacksC0395n r1, androidx.fragment.app.ComponentCallbacksC0395n r2, boolean r3) {
            if (r3 == 0) goto L7
            java.lang.Object r1 = r2.m1308L()
            goto Lb
        L7:
            r1.m1307K()
            r1 = 0
        Lb:
            java.lang.Object r1 = r0.mo1377g(r1)
            java.lang.Object r0 = r0.mo1389y(r1)
            return r0
    }

    /* renamed from: m */
    public static void m1368m(p319s.C5934a<java.lang.String, java.lang.String> r2, p319s.C5934a<java.lang.String, android.view.View> r3) {
            int r0 = r2.f22812a0
        L2:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L16
            java.lang.Object r1 = r2.m12344l(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r3.containsKey(r1)
            if (r1 != 0) goto L2
            r2.mo5830j(r0)
            goto L2
        L16:
            return
    }

    /* renamed from: n */
    public static void m1369n(androidx.fragment.app.AbstractC0412v0 r1, java.lang.Object r2, java.lang.Object r3, p319s.C5934a<java.lang.String, android.view.View> r4, boolean r5, androidx.fragment.app.C0365a r6) {
            java.util.ArrayList<java.lang.String> r0 = r6.f2246n
            if (r0 == 0) goto L26
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            r0 = 0
            if (r5 == 0) goto L10
            java.util.ArrayList<java.lang.String> r5 = r6.f2247o
            goto L12
        L10:
            java.util.ArrayList<java.lang.String> r5 = r6.f2246n
        L12:
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.get(r5)
            android.view.View r4 = (android.view.View) r4
            r1.mo1385t(r2, r4)
            if (r3 == 0) goto L26
            r1.mo1385t(r3, r4)
        L26:
            return
    }

    /* renamed from: o */
    public static void m1370o(java.util.ArrayList<android.view.View> r2, int r3) {
            if (r2 != 0) goto L3
            return
        L3:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L9:
            if (r0 < 0) goto L17
            java.lang.Object r1 = r2.get(r0)
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            int r0 = r0 + (-1)
            goto L9
        L17:
            return
    }

    /* renamed from: p */
    public static void m1371p(android.content.Context r37, androidx.fragment.app.AbstractC0415x r38, java.util.ArrayList<androidx.fragment.app.C0365a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, androidx.fragment.app.C0408t0.a r44) {
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r5 = r41
        Lf:
            r6 = 0
            r7 = 1
            if (r5 >= r2) goto L61
            java.lang.Object r8 = r0.get(r5)
            androidx.fragment.app.a r8 = (androidx.fragment.app.C0365a) r8
            java.lang.Object r9 = r1.get(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L47
            androidx.fragment.app.d0 r6 = r8.f2030q
            androidx.fragment.app.x r6 = r6.f2131s
            boolean r6 = r6.mo1241d()
            if (r6 != 0) goto L30
            goto L5e
        L30:
            java.util.ArrayList<androidx.fragment.app.m0$a> r6 = r8.f2233a
            int r6 = r6.size()
            int r6 = r6 - r7
        L37:
            if (r6 < 0) goto L5e
            java.util.ArrayList<androidx.fragment.app.m0$a> r9 = r8.f2233a
            java.lang.Object r9 = r9.get(r6)
            androidx.fragment.app.m0$a r9 = (androidx.fragment.app.AbstractC0394m0.a) r9
            m1357b(r8, r9, r4, r7, r3)
            int r6 = r6 + (-1)
            goto L37
        L47:
            java.util.ArrayList<androidx.fragment.app.m0$a> r7 = r8.f2233a
            int r7 = r7.size()
            r9 = 0
        L4e:
            if (r9 >= r7) goto L5e
            java.util.ArrayList<androidx.fragment.app.m0$a> r10 = r8.f2233a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.m0$a r10 = (androidx.fragment.app.AbstractC0394m0.a) r10
            m1357b(r8, r10, r4, r6, r3)
            int r9 = r9 + 1
            goto L4e
        L5e:
            int r5 = r5 + 1
            goto Lf
        L61:
            int r5 = r4.size()
            if (r5 == 0) goto L407
            android.view.View r5 = new android.view.View
            r8 = r37
            r5.<init>(r8)
            int r15 = r4.size()
            r14 = 0
        L73:
            if (r14 >= r15) goto L407
            int r8 = r4.keyAt(r14)
            s.a r13 = new s.a
            r13.<init>()
            int r9 = r2 + (-1)
            r12 = r41
        L82:
            if (r9 < r12) goto Lea
            java.lang.Object r10 = r0.get(r9)
            androidx.fragment.app.a r10 = (androidx.fragment.app.C0365a) r10
            boolean r11 = r10.m1085o(r8)
            if (r11 != 0) goto L91
            goto Ldf
        L91:
            java.lang.Object r11 = r1.get(r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.ArrayList<java.lang.String> r7 = r10.f2246n
            if (r7 == 0) goto Ldf
            int r7 = r7.size()
            if (r11 == 0) goto Laa
            java.util.ArrayList<java.lang.String> r11 = r10.f2246n
            java.util.ArrayList<java.lang.String> r10 = r10.f2247o
            goto Lb3
        Laa:
            java.util.ArrayList<java.lang.String> r11 = r10.f2246n
            java.util.ArrayList<java.lang.String> r10 = r10.f2247o
            r36 = r11
            r11 = r10
            r10 = r36
        Lb3:
            if (r6 >= r7) goto Ldf
            java.lang.Object r16 = r10.get(r6)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r16 = r11.get(r6)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r13.remove(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Ld3
            r13.put(r0, r2)
            goto Ld6
        Ld3:
            r13.put(r0, r1)
        Ld6:
            int r6 = r6 + 1
            r0 = r39
            r1 = r40
            r2 = r42
            goto Lb3
        Ldf:
            int r9 = r9 + (-1)
            r0 = r39
            r1 = r40
            r2 = r42
            r6 = 0
            r7 = 1
            goto L82
        Lea:
            java.lang.Object r0 = r4.valueAt(r14)
            androidx.fragment.app.t0$b r0 = (androidx.fragment.app.C0408t0.b) r0
            boolean r1 = r38.mo1241d()
            if (r1 == 0) goto L3ef
            r1 = r38
            android.view.View r2 = r1.mo1240c(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L102
            goto L3ef
        L102:
            if (r3 == 0) goto L282
            androidx.fragment.app.n r7 = r0.f2376a
            androidx.fragment.app.n r8 = r0.f2379d
            androidx.fragment.app.v0 r9 = m1362g(r8, r7)
            if (r9 != 0) goto L117
            r30 = r4
            r31 = r14
            r32 = r15
        L114:
            r7 = 0
            goto L295
        L117:
            boolean r10 = r0.f2377b
            boolean r11 = r0.f2380e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r10 = m1364i(r9, r7, r10)
            java.lang.Object r11 = m1365j(r9, r8, r11)
            androidx.fragment.app.n r3 = r0.f2376a
            r30 = r4
            androidx.fragment.app.n r4 = r0.f2379d
            if (r3 == 0) goto L140
            android.view.View r12 = r3.m1336t0()
            r31 = r14
            r14 = 0
            r12.setVisibility(r14)
            goto L142
        L140:
            r31 = r14
        L142:
            if (r3 == 0) goto L1e5
            if (r4 != 0) goto L148
            goto L1e5
        L148:
            boolean r12 = r0.f2377b
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L154
            r32 = r15
            r14 = 0
            goto L15a
        L154:
            java.lang.Object r14 = m1367l(r9, r3, r4, r12)
            r32 = r15
        L15a:
            s.a r15 = m1361f(r9, r13, r14, r0)
            r33 = r7
            s.a r7 = m1360e(r9, r13, r14, r0)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L176
            if (r15 == 0) goto L16f
            r15.clear()
        L16f:
            if (r7 == 0) goto L174
            r7.clear()
        L174:
            r14 = 0
            goto L188
        L176:
            r16 = r14
            java.util.Set r14 = r13.keySet()
            m1356a(r1, r15, r14)
            java.util.Collection r14 = r13.values()
            m1356a(r6, r7, r14)
            r14 = r16
        L188:
            if (r10 != 0) goto L193
            if (r11 != 0) goto L193
            if (r14 != 0) goto L193
            r35 = r6
            r34 = r13
            goto L1ed
        L193:
            r34 = r13
            r13 = 1
            m1358c(r3, r4, r12, r15, r13)
            if (r14 == 0) goto L1c9
            r6.add(r5)
            r9.mo1387w(r14, r5, r1)
            boolean r13 = r0.f2380e
            r35 = r6
            androidx.fragment.app.a r6 = r0.f2381f
            r16 = r9
            r17 = r14
            r18 = r11
            r19 = r15
            r20 = r13
            r21 = r6
            m1369n(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.view.View r0 = m1366k(r7, r0, r10, r12)
            if (r0 == 0) goto L1c4
            r9.mo1384s(r10, r6)
        L1c4:
            r27 = r0
            r29 = r6
            goto L1cf
        L1c9:
            r35 = r6
            r27 = 0
            r29 = 0
        L1cf:
            androidx.fragment.app.r0 r0 = new androidx.fragment.app.r0
            r22 = r0
            r23 = r3
            r24 = r4
            r25 = r12
            r26 = r7
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r2, r0)
            r6 = r14
            goto L1ee
        L1e5:
            r35 = r6
            r33 = r7
            r34 = r13
            r32 = r15
        L1ed:
            r6 = 0
        L1ee:
            if (r10 != 0) goto L1f6
            if (r6 != 0) goto L1f6
            if (r11 != 0) goto L1f6
            goto L114
        L1f6:
            java.util.ArrayList r0 = m1363h(r9, r11, r8, r1, r5)
            r3 = r33
            r4 = r35
            java.util.ArrayList r3 = m1363h(r9, r10, r3, r4, r5)
            r7 = 4
            m1370o(r3, r7)
            java.lang.Object r7 = r9.mo1379m(r11, r10, r6)
            if (r8 == 0) goto L22e
            if (r0 == 0) goto L22e
            int r12 = r0.size()
            if (r12 > 0) goto L21a
            int r12 = r1.size()
            if (r12 <= 0) goto L22e
        L21a:
            j0.b r12 = new j0.b
            r12.<init>()
            r13 = r44
            androidx.fragment.app.d0$d r13 = (androidx.fragment.app.AbstractC0375d0.d) r13
            r13.m1195b(r8, r12)
            androidx.fragment.app.n0 r14 = new androidx.fragment.app.n0
            r14.<init>(r13, r8, r12)
            r9.mo1386u(r8, r7, r12, r14)
        L22e:
            if (r7 == 0) goto L114
            if (r8 == 0) goto L253
            if (r11 == 0) goto L253
            boolean r12 = r8.f2287i0
            if (r12 == 0) goto L253
            boolean r12 = r8.f2301w0
            if (r12 == 0) goto L253
            boolean r12 = r8.f2264G0
            if (r12 == 0) goto L253
            r12 = 1
            r8.m1348z0(r12)
            android.view.View r12 = r8.f2260C0
            r9.mo1382q(r11, r12, r0)
            android.view.ViewGroup r8 = r8.f2259B0
            androidx.fragment.app.o0 r12 = new androidx.fragment.app.o0
            r12.<init>(r0)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r8, r12)
        L253:
            java.util.ArrayList r20 = r9.m1396n(r4)
            r22 = r9
            r23 = r7
            r24 = r10
            r25 = r3
            r26 = r11
            r27 = r0
            r28 = r6
            r29 = r4
            r22.mo1383r(r23, r24, r25, r26, r27, r28, r29)
            r9.mo1375c(r2, r7)
            r16 = r9
            r17 = r2
            r18 = r1
            r19 = r4
            r21 = r34
            r16.m1397v(r17, r18, r19, r20, r21)
            r7 = 0
            m1370o(r3, r7)
            r9.mo1388x(r6, r1, r4)
            goto L295
        L282:
            r30 = r4
            r34 = r13
            r31 = r14
            r32 = r15
            r7 = 0
            androidx.fragment.app.n r1 = r0.f2376a
            androidx.fragment.app.n r3 = r0.f2379d
            androidx.fragment.app.v0 r4 = m1362g(r3, r1)
            if (r4 != 0) goto L29b
        L295:
            r24 = r31
            r26 = r32
            goto L3f5
        L29b:
            boolean r6 = r0.f2377b
            boolean r8 = r0.f2380e
            java.lang.Object r6 = m1364i(r4, r1, r6)
            java.lang.Object r15 = m1365j(r4, r3, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            androidx.fragment.app.n r12 = r0.f2376a
            androidx.fragment.app.n r11 = r0.f2379d
            if (r12 == 0) goto L365
            if (r11 != 0) goto L2bb
            goto L365
        L2bb:
            boolean r10 = r0.f2377b
            boolean r8 = r34.isEmpty()
            if (r8 == 0) goto L2c7
            r9 = r34
            r8 = 0
            goto L2cd
        L2c7:
            java.lang.Object r8 = m1367l(r4, r12, r11, r10)
            r9 = r34
        L2cd:
            s.a r7 = m1361f(r4, r9, r8, r0)
            boolean r16 = r9.isEmpty()
            if (r16 == 0) goto L2d9
            r8 = 0
            goto L2e4
        L2d9:
            r16 = r8
            java.util.Collection r8 = r7.values()
            r14.addAll(r8)
            r8 = r16
        L2e4:
            if (r6 != 0) goto L2fb
            if (r15 != 0) goto L2fb
            if (r8 != 0) goto L2fb
            r21 = r1
            r27 = r3
            r34 = r9
        L2f0:
            r23 = r13
            r25 = r14
            r3 = r15
            r24 = r31
            r26 = r32
            goto L36a
        L2fb:
            r21 = r1
            r1 = 1
            m1358c(r12, r11, r10, r7, r1)
            if (r8 == 0) goto L32d
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.mo1387w(r8, r5, r14)
            r16 = r12
            boolean r12 = r0.f2380e
            r17 = r13
            androidx.fragment.app.a r13 = r0.f2381f
            r22 = r8
            r8 = r4
            r18 = r9
            r9 = r22
            r19 = r10
            r10 = r15
            r20 = r11
            r11 = r7
            r7 = r16
            r23 = r17
            m1369n(r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L339
            r4.mo1384s(r6, r1)
            goto L339
        L32d:
            r22 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r7 = r12
            r23 = r13
            r1 = 0
        L339:
            androidx.fragment.app.s0 r13 = new androidx.fragment.app.s0
            r8 = r13
            r9 = r4
            r10 = r18
            r11 = r22
            r12 = r0
            r0 = r13
            r34 = r18
            r13 = r23
            r25 = r14
            r24 = r31
            r14 = r5
            r27 = r3
            r3 = r15
            r26 = r32
            r15 = r7
            r16 = r20
            r17 = r19
            r18 = r25
            r19 = r6
            r20 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r2, r0)
            r14 = r22
            goto L36b
        L365:
            r21 = r1
            r27 = r3
            goto L2f0
        L36a:
            r14 = 0
        L36b:
            if (r6 != 0) goto L373
            if (r14 != 0) goto L373
            if (r3 != 0) goto L373
            goto L3f5
        L373:
            r1 = r25
            r0 = r27
            java.util.ArrayList r7 = m1363h(r4, r3, r0, r1, r5)
            if (r7 == 0) goto L383
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L384
        L383:
            r3 = 0
        L384:
            r4.mo1373a(r6, r5)
            java.lang.Object r15 = r4.mo1379m(r3, r6, r14)
            if (r0 == 0) goto L3af
            if (r7 == 0) goto L3af
            int r8 = r7.size()
            if (r8 > 0) goto L39b
            int r1 = r1.size()
            if (r1 <= 0) goto L3af
        L39b:
            j0.b r1 = new j0.b
            r1.<init>()
            r8 = r44
            androidx.fragment.app.d0$d r8 = (androidx.fragment.app.AbstractC0375d0.d) r8
            r8.m1195b(r0, r1)
            androidx.fragment.app.p0 r9 = new androidx.fragment.app.p0
            r9.<init>(r8, r0, r1)
            r4.mo1386u(r0, r15, r1, r9)
        L3af:
            if (r15 == 0) goto L3f5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r4
            r9 = r15
            r10 = r6
            r11 = r0
            r12 = r3
            r13 = r7
            r1 = r15
            r15 = r23
            r8.mo1383r(r9, r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.q0 r15 = new androidx.fragment.app.q0
            r8 = r15
            r9 = r6
            r10 = r4
            r11 = r5
            r12 = r21
            r13 = r23
            r14 = r0
            r0 = r15
            r15 = r7
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r2, r0)
            androidx.fragment.app.w0 r0 = new androidx.fragment.app.w0
            r6 = r23
            r3 = r34
            r0.<init>(r4, r6, r3)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r2, r0)
            r4.mo1375c(r2, r1)
            androidx.fragment.app.x0 r0 = new androidx.fragment.app.x0
            r0.<init>(r4, r6, r3)
            p227n0.ViewTreeObserverOnPreDrawListenerC4656o.m10519a(r2, r0)
            goto L3f5
        L3ef:
            r30 = r4
            r24 = r14
            r26 = r15
        L3f5:
            int r14 = r24 + 1
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            r15 = r26
            r4 = r30
            r6 = 0
            r7 = 1
            goto L73
        L407:
            return
    }
}
