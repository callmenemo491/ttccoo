package p209lh;

/* renamed from: lh.a */
/* loaded from: classes.dex */
public class C4304a {
    /* renamed from: A */
    public static final <T> java.lang.Object m9595A(java.lang.Object r0, p101fh.InterfaceC2172d<? super T> r1) {
            boolean r1 = r0 instanceof p379vh.C6739t
            if (r1 == 0) goto Lc
            vh.t r0 = (p379vh.C6739t) r0
            java.lang.Throwable r0 = r0.f26037a
            java.lang.Object r0 = p074e9.C1805a.m4520e(r0)
        Lc:
            return r0
    }

    /* renamed from: B */
    public static void m9596B(long[] r16, long[] r17) {
            r0 = 0
            r1 = r16[r0]
            r3 = 1
            r4 = r16[r3]
            r6 = 2
            r6 = r16[r6]
            r8 = 3
            r8 = r16[r8]
            r10 = 15
            long r11 = r8 << r10
            r13 = 24
            long r14 = r8 << r13
            long r11 = r11 ^ r14
            long r4 = r4 ^ r11
            r11 = 49
            long r14 = r8 >>> r11
            r12 = 40
            long r8 = r8 >>> r12
            long r8 = r8 ^ r14
            long r6 = r6 ^ r8
            long r8 = r6 << r10
            long r13 = r6 << r13
            long r8 = r8 ^ r13
            long r1 = r1 ^ r8
            long r8 = r6 >>> r11
            long r6 = r6 >>> r12
            long r6 = r6 ^ r8
            long r4 = r4 ^ r6
            long r6 = r4 >>> r11
            long r1 = r1 ^ r6
            r8 = 9
            long r6 = r6 << r8
            long r1 = r1 ^ r6
            r17[r0] = r1
            r0 = 562949953421311(0x1ffffffffffff, double:2.781342323133997E-309)
            long r0 = r0 & r4
            r17[r3] = r0
            return
    }

    /* renamed from: C */
    public static void m9597C(long[] r32, long[] r33) {
            r0 = 0
            r1 = r32[r0]
            r3 = 1
            r4 = r32[r3]
            r6 = 2
            r7 = r32[r6]
            r9 = 3
            r10 = r32[r9]
            r12 = 4
            r13 = r32[r12]
            r15 = 5
            r16 = r32[r15]
            r18 = 6
            r19 = r32[r18]
            r21 = 7
            r21 = r32[r21]
            r23 = 12
            r23 = r32[r23]
            r25 = 39
            long r26 = r23 << r25
            long r16 = r16 ^ r26
            r26 = 25
            long r27 = r23 >>> r26
            r29 = 62
            long r30 = r23 << r29
            long r27 = r27 ^ r30
            long r19 = r19 ^ r27
            long r23 = r23 >>> r6
            long r21 = r21 ^ r23
            r23 = 11
            r23 = r32[r23]
            long r27 = r23 << r25
            long r13 = r13 ^ r27
            long r27 = r23 >>> r26
            long r30 = r23 << r29
            long r27 = r27 ^ r30
            long r16 = r16 ^ r27
            long r23 = r23 >>> r6
            long r19 = r19 ^ r23
            r23 = 10
            r23 = r32[r23]
            long r27 = r23 << r25
            long r10 = r10 ^ r27
            long r27 = r23 >>> r26
            long r30 = r23 << r29
            long r27 = r27 ^ r30
            long r13 = r13 ^ r27
            long r23 = r23 >>> r6
            long r16 = r16 ^ r23
            r23 = 9
            r23 = r32[r23]
            long r27 = r23 << r25
            long r7 = r7 ^ r27
            long r27 = r23 >>> r26
            long r30 = r23 << r29
            long r27 = r27 ^ r30
            long r10 = r10 ^ r27
            long r23 = r23 >>> r6
            long r13 = r13 ^ r23
            r23 = 8
            r23 = r32[r23]
            long r27 = r23 << r25
            long r4 = r4 ^ r27
            long r27 = r23 >>> r26
            long r30 = r23 << r29
            long r27 = r27 ^ r30
            long r7 = r7 ^ r27
            long r23 = r23 >>> r6
            long r10 = r10 ^ r23
            long r23 = r21 << r25
            long r1 = r1 ^ r23
            long r23 = r21 >>> r26
            long r27 = r21 << r29
            long r23 = r23 ^ r27
            long r4 = r4 ^ r23
            long r21 = r21 >>> r6
            long r7 = r7 ^ r21
            long r21 = r19 >>> r26
            long r1 = r1 ^ r21
            r33[r0] = r1
            r0 = 23
            long r0 = r21 << r0
            long r0 = r0 ^ r4
            r33[r3] = r0
            r33[r6] = r7
            r33[r9] = r10
            r33[r12] = r13
            r33[r15] = r16
            r0 = 33554431(0x1ffffff, double:1.65780916E-316)
            long r0 = r19 & r0
            r33[r18] = r0
            return
    }

    /* renamed from: D */
    public static void m9598D(long[] r1, long[] r2) {
            r0 = 4
            long[] r0 = new long[r0]
            m9626t(r1, r0)
            m9596B(r0, r2)
            return
    }

    /* renamed from: E */
    public static void m9599E(long[] r1, int r2, long[] r3) {
            r0 = 4
            long[] r0 = new long[r0]
            m9626t(r1, r0)
        L6:
            m9596B(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L11
            m9626t(r3, r0)
            goto L6
        L11:
            return
    }

    /* renamed from: F */
    public static void m9600F(long[] r1, int r2, long[] r3) {
            r0 = 13
            long[] r0 = new long[r0]
            m9627u(r1, r0)
        L7:
            m9597C(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            m9627u(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: G */
    public static final void m9601G(p101fh.InterfaceC2172d<? super ch.C0985l> r2, p101fh.InterfaceC2172d<?> r3) {
            fh.d r2 = gh.C2390b.m6127q(r2)     // Catch: java.lang.Throwable -> Lb
            ch.l r0 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            p459zh.C7340f.m14417a(r2, r0, r1)     // Catch: java.lang.Throwable -> Lb
            return
        Lb:
            r2 = move-exception
            java.lang.Object r0 = p074e9.C1805a.m4520e(r2)
            vh.a r3 = (p379vh.AbstractC6682a) r3
            r3.mo5707k(r0)
            throw r2
    }

    /* renamed from: H */
    public static void m9602H(mh.InterfaceC4624p r0, java.lang.Object r1, p101fh.InterfaceC2172d r2, mh.InterfaceC4620l r3, int r4) {
            r3 = 0
            fh.d r0 = gh.C2390b.m6113c(r0, r1, r2)     // Catch: java.lang.Throwable -> Lf
            fh.d r0 = gh.C2390b.m6127q(r0)     // Catch: java.lang.Throwable -> Lf
            ch.l r1 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> Lf
            p459zh.C7340f.m14417a(r0, r1, r3)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r0 = move-exception
            java.lang.Object r1 = p074e9.C1805a.m4520e(r0)
            r2.mo5707k(r1)
            throw r0
    }

    /* renamed from: I */
    public static final p316rh.C5852a m9603I(p316rh.C5852a r3, int r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r3, r0)
            if (r4 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r2 = "step"
            p214m2.C4339q.m9706k(r1, r2)
            if (r0 == 0) goto L25
            int r0 = r3.f22647Y
            int r1 = r3.f22648Z
            int r3 = r3.f22649a0
            if (r3 <= 0) goto L1e
            goto L1f
        L1e:
            int r4 = -r4
        L1f:
            rh.a r3 = new rh.a
            r3.<init>(r0, r1, r4)
            return r3
        L25:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Step must be positive, was: "
            r4.append(r0)
            r4.append(r1)
            r0 = 46
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: J */
    public static final <T> java.lang.Object m9604J(java.lang.Object r2, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3) {
            java.lang.Throwable r0 = ch.C0979f.m2690b(r2)
            if (r0 != 0) goto Lf
            if (r3 == 0) goto L16
            vh.u r0 = new vh.u
            r0.<init>(r2, r3)
            r2 = r0
            goto L16
        Lf:
            vh.t r2 = new vh.t
            r3 = 0
            r1 = 2
            r2.<init>(r0, r3, r1)
        L16:
            return r2
    }

    /* renamed from: K */
    public static final p316rh.C5854c m9605K(int r1, int r2) {
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 > r0) goto L9
            rh.c r1 = p316rh.C5854c.f22654b0
            rh.c r1 = p316rh.C5854c.f22655c0
            return r1
        L9:
            rh.c r0 = new rh.c
            int r2 = r2 + (-1)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: L */
    public static java.lang.String m9606L(p317ri.InterfaceC5870e r9) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            boolean r1 = r9 instanceof p317ri.InterfaceC5926x
            r2 = 0
            r3 = 35
            java.lang.String r4 = "\\"
            if (r1 == 0) goto L37
            boolean r1 = r9 instanceof p317ri.C5875f1
            if (r1 != 0) goto L37
            ri.x r9 = (p317ri.InterfaceC5926x) r9
            java.lang.String r9 = r9.mo12211h()
            int r1 = r9.length()
            if (r1 <= 0) goto L33
            char r1 = r9.charAt(r2)
            if (r1 != r3) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
        L33:
            r0.append(r9)
            goto L71
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L108
            r1.<init>()     // Catch: java.io.IOException -> L108
            java.lang.String r5 = "#"
            r1.append(r5)     // Catch: java.io.IOException -> L108
            ri.s r9 = r9.mo168e()     // Catch: java.io.IOException -> L108
            java.lang.String r5 = "DER"
            byte[] r9 = r9.m12246m(r5)     // Catch: java.io.IOException -> L108
            xj.d r5 = p421xj.C7089e.f27429a     // Catch: java.io.IOException -> L108
            int r5 = r9.length     // Catch: java.io.IOException -> L108
            byte[] r9 = p421xj.C7089e.m14195b(r9, r2, r5)     // Catch: java.io.IOException -> L108
            int r5 = r9.length     // Catch: java.io.IOException -> L108
            char[] r6 = new char[r5]     // Catch: java.io.IOException -> L108
            r7 = 0
        L56:
            if (r7 == r5) goto L62
            r8 = r9[r7]     // Catch: java.io.IOException -> L108
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r8 = (char) r8     // Catch: java.io.IOException -> L108
            r6[r7] = r8     // Catch: java.io.IOException -> L108
            int r7 = r7 + 1
            goto L56
        L62:
            java.lang.String r9 = new java.lang.String     // Catch: java.io.IOException -> L108
            r9.<init>(r6)     // Catch: java.io.IOException -> L108
            r1.append(r9)     // Catch: java.io.IOException -> L108
            java.lang.String r9 = r1.toString()     // Catch: java.io.IOException -> L108
            r0.append(r9)     // Catch: java.io.IOException -> L108
        L71:
            int r9 = r0.length()
            int r1 = r0.length()
            r5 = 92
            r6 = 2
            r7 = 1
            if (r1 < r6) goto L8c
            char r1 = r0.charAt(r2)
            if (r1 != r5) goto L8c
            char r1 = r0.charAt(r7)
            if (r1 != r3) goto L8c
            goto L8d
        L8c:
            r6 = 0
        L8d:
            if (r6 == r9) goto Ld6
            char r1 = r0.charAt(r6)
            r3 = 44
            if (r1 == r3) goto Lcd
            char r1 = r0.charAt(r6)
            r3 = 34
            if (r1 == r3) goto Lcd
            char r1 = r0.charAt(r6)
            if (r1 == r5) goto Lcd
            char r1 = r0.charAt(r6)
            r3 = 43
            if (r1 == r3) goto Lcd
            char r1 = r0.charAt(r6)
            r3 = 61
            if (r1 == r3) goto Lcd
            char r1 = r0.charAt(r6)
            r3 = 60
            if (r1 == r3) goto Lcd
            char r1 = r0.charAt(r6)
            r3 = 62
            if (r1 == r3) goto Lcd
            char r1 = r0.charAt(r6)
            r3 = 59
            if (r1 != r3) goto Ld4
        Lcd:
            r0.insert(r6, r4)
            int r6 = r6 + 1
            int r9 = r9 + 1
        Ld4:
            int r6 = r6 + r7
            goto L8d
        Ld6:
            int r9 = r0.length()
            r1 = 32
            if (r9 <= 0) goto Lf0
        Lde:
            int r9 = r0.length()
            if (r9 <= r2) goto Lf0
            char r9 = r0.charAt(r2)
            if (r9 != r1) goto Lf0
            r0.insert(r2, r4)
            int r2 = r2 + 2
            goto Lde
        Lf0:
            int r9 = r0.length()
            int r9 = r9 - r7
        Lf5:
            if (r9 < 0) goto L103
            char r2 = r0.charAt(r9)
            if (r2 != r1) goto L103
            r0.insert(r9, r5)
            int r9 = r9 + (-1)
            goto Lf5
        L103:
            java.lang.String r9 = r0.toString()
            return r9
        L108:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Other value has no encoded form"
            r9.<init>(r0)
            throw r9
    }

    /* renamed from: a */
    public static p379vh.InterfaceC6733r m9607a(p379vh.InterfaceC6687b1 r0, int r1) {
            r0 = 0
            vh.q1 r1 = new vh.q1
            r1.<init>(r0)
            return r1
    }

    /* renamed from: b */
    public static void m9608b(long[] r5, long[] r6, long[] r7) {
            r0 = 0
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 1
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 2
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 3
            r1 = r5[r0]
            r5 = r6[r0]
            long r5 = r5 ^ r1
            r7[r0] = r5
            return
    }

    /* renamed from: c */
    public static void m9609c(java.lang.StringBuffer r1, p042cj.C0989a r2, java.util.Hashtable r3) {
            ri.n r0 = r2.f5072Y
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb
            goto Lf
        Lb:
            ri.n r3 = r2.f5072Y
            java.lang.String r3 = r3.f22719Y
        Lf:
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            ri.e r2 = r2.f5073Z
            java.lang.String r2 = m9606L(r2)
            r1.append(r2)
            return
    }

    /* renamed from: d */
    public static boolean m9610d(p042cj.C0989a r4, p042cj.C0989a r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            if (r5 != 0) goto Lb
            return r1
        Lb:
            ri.n r2 = r4.f5072Y
            ri.n r3 = r5.f5072Y
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L16
            return r1
        L16:
            ri.e r4 = r4.f5073Z
            java.lang.String r4 = m9606L(r4)
            java.lang.String r4 = m9614h(r4)
            ri.e r5 = r5.f5073Z
            java.lang.String r5 = m9606L(r5)
            java.lang.String r5 = m9614h(r5)
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L31
            return r1
        L31:
            return r0
    }

    /* renamed from: e */
    public static final void m9611e(p101fh.InterfaceC2175g r1, java.util.concurrent.CancellationException r2) {
            int r0 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r0 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r1 = r1.get(r0)
            vh.b1 r1 = (p379vh.InterfaceC6687b1) r1
            if (r1 != 0) goto Ld
            goto L10
        Ld:
            r1.mo13553d0(r2)
        L10:
            return
    }

    /* renamed from: f */
    public static /* synthetic */ void m9612f(p101fh.InterfaceC2175g r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r1 = 0
            m9611e(r0, r1)
            return
    }

    /* renamed from: g */
    public static final void m9613g(p379vh.InterfaceC6687b1 r1, java.util.concurrent.CancellationException r2) {
            th.d r1 = r1.mo13550A()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            vh.b1 r0 = (p379vh.InterfaceC6687b1) r0
            r0.mo13553d0(r2)
            goto L8
        L18:
            return
    }

    /* renamed from: h */
    public static java.lang.String m9614h(java.lang.String r7) {
            java.lang.String r7 = p400wj.C6892e.m13960c(r7)
            int r0 = r7.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L47
            char r0 = r7.charAt(r1)
            r3 = 35
            if (r0 != r3) goto L47
            java.lang.String r0 = r7.substring(r2)     // Catch: java.io.IOException -> L2f
            byte[] r0 = p421xj.C7089e.m14194a(r0)     // Catch: java.io.IOException -> L2f
            ri.s r0 = p317ri.AbstractC5912s.m12271u(r0)     // Catch: java.io.IOException -> L2f
            boolean r3 = r0 instanceof p317ri.InterfaceC5926x
            if (r3 == 0) goto L47
            ri.x r0 = (p317ri.InterfaceC5926x) r0
            java.lang.String r7 = r0.mo12211h()
            java.lang.String r7 = p400wj.C6892e.m13960c(r7)
            goto L47
        L2f:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown encoding in name: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L47:
            int r0 = r7.length()
            r3 = 32
            if (r0 <= r2) goto L8f
            r0 = 0
        L50:
            int r4 = r0 + 1
            int r5 = r7.length()
            r6 = 92
            if (r4 >= r5) goto L69
            char r5 = r7.charAt(r0)
            if (r5 != r6) goto L69
            char r4 = r7.charAt(r4)
            if (r4 != r3) goto L69
            int r0 = r0 + 2
            goto L50
        L69:
            int r4 = r7.length()
            int r4 = r4 - r2
        L6e:
            int r5 = r4 + (-1)
            if (r5 <= 0) goto L81
            char r5 = r7.charAt(r5)
            if (r5 != r6) goto L81
            char r5 = r7.charAt(r4)
            if (r5 != r3) goto L81
            int r4 = r4 + (-2)
            goto L6e
        L81:
            if (r0 > 0) goto L8a
            int r5 = r7.length()
            int r5 = r5 - r2
            if (r4 >= r5) goto L8f
        L8a:
            int r4 = r4 + r2
            java.lang.String r7 = r7.substring(r0, r4)
        L8f:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            int r4 = r7.length()
            if (r4 == 0) goto Lb6
            char r1 = r7.charAt(r1)
            r0.append(r1)
        La1:
            int r4 = r7.length()
            if (r2 >= r4) goto Lb6
            char r4 = r7.charAt(r2)
            if (r1 != r3) goto Laf
            if (r4 == r3) goto Lb2
        Laf:
            r0.append(r4)
        Lb2:
            int r2 = r2 + 1
            r1 = r4
            goto La1
        Lb6:
            java.lang.String r7 = r0.toString()
            return r7
    }

    /* renamed from: i */
    public static final long m9615i(long r1, long r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            r1 = r3
        L5:
            return r1
    }

    /* renamed from: j */
    public static final int m9616j(int r2, int r3, int r4) {
            if (r3 > r4) goto L9
            if (r2 >= r3) goto L5
            return r3
        L5:
            if (r2 <= r4) goto L8
            return r4
        L8:
            return r2
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " is less than minimum "
            r0.append(r4)
            r0.append(r3)
            r3 = 46
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: k */
    public static void m9617k(java.lang.StringBuilder r6, java.lang.Object r7, java.util.Map<java.lang.Object[], java.lang.Object> r8) {
            if (r7 != 0) goto L8
            java.lang.String r7 = "null"
            r6.append(r7)
            return
        L8:
            java.lang.Class r0 = r7.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L40
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L1b
            r6.append(r8)     // Catch: java.lang.Throwable -> L1b
            goto L172
        L1b:
            r8 = move-exception
            java.lang.String r0 = "SLF4J: Failed toString() invocation on an object of type ["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r0.append(r7)
            java.lang.String r7 = "]"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            ck.C0996e.m2729b(r7, r8)
            java.lang.String r7 = "[FAILED toString()]"
            r6.append(r7)
            goto L172
        L40:
            boolean r0 = r7 instanceof boolean[]
            java.lang.String r1 = ", "
            r2 = 93
            r3 = 0
            r4 = 91
            if (r0 == 0) goto L67
            boolean[] r7 = (boolean[]) r7
            r6.append(r4)
            int r8 = r7.length
        L51:
            if (r3 >= r8) goto L62
            boolean r0 = r7[r3]
            r6.append(r0)
            int r0 = r8 + (-1)
            if (r3 == r0) goto L5f
            r6.append(r1)
        L5f:
            int r3 = r3 + 1
            goto L51
        L62:
            r6.append(r2)
            goto L172
        L67:
            boolean r0 = r7 instanceof byte[]
            if (r0 == 0) goto L87
            byte[] r7 = (byte[]) r7
            r6.append(r4)
            int r8 = r7.length
        L71:
            if (r3 >= r8) goto L82
            r0 = r7[r3]
            r6.append(r0)
            int r0 = r8 + (-1)
            if (r3 == r0) goto L7f
            r6.append(r1)
        L7f:
            int r3 = r3 + 1
            goto L71
        L82:
            r6.append(r2)
            goto L172
        L87:
            boolean r0 = r7 instanceof char[]
            if (r0 == 0) goto La7
            char[] r7 = (char[]) r7
            r6.append(r4)
            int r8 = r7.length
        L91:
            if (r3 >= r8) goto La2
            char r0 = r7[r3]
            r6.append(r0)
            int r0 = r8 + (-1)
            if (r3 == r0) goto L9f
            r6.append(r1)
        L9f:
            int r3 = r3 + 1
            goto L91
        La2:
            r6.append(r2)
            goto L172
        La7:
            boolean r0 = r7 instanceof short[]
            if (r0 == 0) goto Lc7
            short[] r7 = (short[]) r7
            r6.append(r4)
            int r8 = r7.length
        Lb1:
            if (r3 >= r8) goto Lc2
            short r0 = r7[r3]
            r6.append(r0)
            int r0 = r8 + (-1)
            if (r3 == r0) goto Lbf
            r6.append(r1)
        Lbf:
            int r3 = r3 + 1
            goto Lb1
        Lc2:
            r6.append(r2)
            goto L172
        Lc7:
            boolean r0 = r7 instanceof int[]
            if (r0 == 0) goto Le7
            int[] r7 = (int[]) r7
            r6.append(r4)
            int r8 = r7.length
        Ld1:
            if (r3 >= r8) goto Le2
            r0 = r7[r3]
            r6.append(r0)
            int r0 = r8 + (-1)
            if (r3 == r0) goto Ldf
            r6.append(r1)
        Ldf:
            int r3 = r3 + 1
            goto Ld1
        Le2:
            r6.append(r2)
            goto L172
        Le7:
            boolean r0 = r7 instanceof long[]
            if (r0 == 0) goto L107
            long[] r7 = (long[]) r7
            r6.append(r4)
            int r8 = r7.length
        Lf1:
            if (r3 >= r8) goto L102
            r4 = r7[r3]
            r6.append(r4)
            int r0 = r8 + (-1)
            if (r3 == r0) goto Lff
            r6.append(r1)
        Lff:
            int r3 = r3 + 1
            goto Lf1
        L102:
            r6.append(r2)
            goto L172
        L107:
            boolean r0 = r7 instanceof float[]
            if (r0 == 0) goto L126
            float[] r7 = (float[]) r7
            r6.append(r4)
            int r8 = r7.length
        L111:
            if (r3 >= r8) goto L122
            r0 = r7[r3]
            r6.append(r0)
            int r0 = r8 + (-1)
            if (r3 == r0) goto L11f
            r6.append(r1)
        L11f:
            int r3 = r3 + 1
            goto L111
        L122:
            r6.append(r2)
            goto L172
        L126:
            boolean r0 = r7 instanceof double[]
            if (r0 == 0) goto L145
            double[] r7 = (double[]) r7
            r6.append(r4)
            int r8 = r7.length
        L130:
            if (r3 >= r8) goto L141
            r4 = r7[r3]
            r6.append(r4)
            int r0 = r8 + (-1)
            if (r3 == r0) goto L13e
            r6.append(r1)
        L13e:
            int r3 = r3 + 1
            goto L130
        L141:
            r6.append(r2)
            goto L172
        L145:
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            r6.append(r4)
            boolean r0 = r8.containsKey(r7)
            if (r0 != 0) goto L16a
            r0 = 0
            r8.put(r7, r0)
            int r0 = r7.length
        L155:
            if (r3 >= r0) goto L166
            r4 = r7[r3]
            m9617k(r6, r4, r8)
            int r4 = r0 + (-1)
            if (r3 == r4) goto L163
            r6.append(r1)
        L163:
            int r3 = r3 + 1
            goto L155
        L166:
            r8.remove(r7)
            goto L16f
        L16a:
            java.lang.String r7 = "..."
            r6.append(r7)
        L16f:
            r6.append(r2)
        L172:
            return
    }

    /* renamed from: l */
    public static final p316rh.C5852a m9618l(int r2, int r3) {
            rh.a r0 = new rh.a
            r1 = -1
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* renamed from: m */
    public static final void m9619m(p101fh.InterfaceC2175g r1) {
            int r0 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r0 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r1 = r1.get(r0)
            vh.b1 r1 = (p379vh.InterfaceC6687b1) r1
            if (r1 != 0) goto Ld
            goto L13
        Ld:
            boolean r0 = r1.mo13544a()
            if (r0 == 0) goto L14
        L13:
            return
        L14:
            java.util.concurrent.CancellationException r1 = r1.mo13551S()
            throw r1
    }

    /* renamed from: n */
    public static final <T> java.lang.Class<T> m9620n(sh.InterfaceC6073b<T> r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            nh.c r2 = (p239nh.InterfaceC4823c) r2
            java.lang.Class r2 = r2.mo10850a()
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L12
            return r2
        L12:
            java.lang.String r0 = r2.getName()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1325958191: goto L81;
                case 104431: goto L75;
                case 3039496: goto L69;
                case 3052374: goto L5d;
                case 3327612: goto L51;
                case 3625364: goto L45;
                case 64711720: goto L39;
                case 97526364: goto L2d;
                case 109413500: goto L1f;
                default: goto L1d;
            }
        L1d:
            goto L8c
        L1f:
            java.lang.String r1 = "short"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L29
            goto L8c
        L29:
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            goto L8c
        L2d:
            java.lang.String r1 = "float"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L8c
        L36:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            goto L8c
        L39:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L42
            goto L8c
        L42:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            goto L8c
        L45:
            java.lang.String r1 = "void"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L8c
        L4e:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            goto L8c
        L51:
            java.lang.String r1 = "long"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5a
            goto L8c
        L5a:
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            goto L8c
        L5d:
            java.lang.String r1 = "char"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L66
            goto L8c
        L66:
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            goto L8c
        L69:
            java.lang.String r1 = "byte"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            goto L8c
        L75:
            java.lang.String r1 = "int"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7e
            goto L8c
        L7e:
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            goto L8c
        L81:
            java.lang.String r1 = "double"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            goto L8c
        L8a:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
        L8c:
            return r2
    }

    /* renamed from: o */
    public static p225mj.C4637a m9621o(java.lang.String r9) {
            fj.c r0 = p176jj.C3616a.m8059d(r9)
            r1 = 0
            if (r0 != 0) goto L108
            ri.n r2 = new ri.n     // Catch: java.lang.IllegalArgumentException -> L1d
            r2.<init>(r9)     // Catch: java.lang.IllegalArgumentException -> L1d
            java.util.Hashtable r3 = p176jj.C3616a.f15906I     // Catch: java.lang.IllegalArgumentException -> L1d
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.IllegalArgumentException -> L1d
            fj.d r2 = (fj.AbstractC2192d) r2     // Catch: java.lang.IllegalArgumentException -> L1d
            if (r2 != 0) goto L18
            r0 = r1
            goto L1e
        L18:
            fj.c r0 = r2.m5782b()     // Catch: java.lang.IllegalArgumentException -> L1d
            goto L1e
        L1d:
        L1e:
            if (r0 != 0) goto L108
            java.util.Hashtable r0 = fj.C2189a.f10024x
            java.lang.String r2 = p400wj.C6892e.m13960c(r9)
            java.lang.Object r0 = r0.get(r2)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 == 0) goto L3d
            java.util.Hashtable r2 = fj.C2189a.f10025y
            java.lang.Object r0 = r2.get(r0)
            fj.d r0 = (fj.AbstractC2192d) r0
            if (r0 == 0) goto L3d
            fj.c r0 = r0.m5782b()
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 != 0) goto L44
            fj.c r0 = p014aj.C0115b.m173d(r9)
        L44:
            if (r0 != 0) goto L7f
            java.util.Hashtable r0 = p420xi.C7084a.f27423a
            java.lang.String r2 = p400wj.C6892e.f26795a
            char[] r2 = r9.toCharArray()
            r3 = 0
            r4 = 0
        L50:
            int r5 = r2.length
            if (r3 == r5) goto L68
            char r5 = r2[r3]
            r6 = 97
            if (r6 > r5) goto L65
            r6 = 122(0x7a, float:1.71E-43)
            if (r6 < r5) goto L65
            int r5 = r5 + (-97)
            int r5 = r5 + 65
            char r4 = (char) r5
            r2[r3] = r4
            r4 = 1
        L65:
            int r3 = r3 + 1
            goto L50
        L68:
            if (r4 == 0) goto L70
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
            goto L71
        L70:
            r3 = r9
        L71:
            java.lang.Object r0 = r0.get(r3)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 == 0) goto L7e
            fj.c r0 = p014aj.C0115b.m174e(r0)
            goto L7f
        L7e:
            r0 = r1
        L7f:
            if (r0 != 0) goto L9f
            java.util.Hashtable r0 = bj.C0807a.f4397o
            java.lang.String r2 = p400wj.C6892e.m13960c(r9)
            java.lang.Object r0 = r0.get(r2)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 == 0) goto L9e
            java.util.Hashtable r2 = bj.C0807a.f4398p
            java.lang.Object r0 = r2.get(r0)
            fj.d r0 = (fj.AbstractC2192d) r0
            if (r0 == 0) goto L9e
            fj.c r0 = r0.m5782b()
            goto L9f
        L9e:
            r0 = r1
        L9f:
            if (r0 != 0) goto Lc0
            java.util.Hashtable r0 = si.C6078a.f23440b
            java.lang.String r2 = p400wj.C6892e.m13960c(r9)
            java.lang.Object r0 = r0.get(r2)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 != 0) goto Lb0
            goto Lba
        Lb0:
            java.util.Hashtable r2 = si.C6078a.f23441c
            java.lang.Object r0 = r2.get(r0)
            fj.d r0 = (fj.AbstractC2192d) r0
            if (r0 != 0) goto Lbc
        Lba:
            r0 = r1
            goto Lc0
        Lbc:
            fj.c r0 = r0.m5782b()
        Lc0:
            if (r0 != 0) goto Lda
            java.util.Hashtable r0 = vi.C6758b.f26059a
            java.lang.Object r0 = r0.get(r9)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 == 0) goto Ld5
            java.util.Hashtable r2 = vi.C6758b.f26060b
            java.lang.Object r0 = r2.get(r0)
            kj.f r0 = (p193kj.C4145f) r0
            goto Ld6
        Ld5:
            r0 = r1
        Ld6:
            fj.c r0 = p101fh.C2174f.m5720j(r0)
        Lda:
            if (r0 != 0) goto Lfb
            java.util.Hashtable r0 = p399wi.C6886a.f26784c
            java.lang.String r2 = p400wj.C6892e.m13960c(r9)
            java.lang.Object r0 = r0.get(r2)
            ri.n r0 = (p317ri.C5897n) r0
            if (r0 != 0) goto Leb
            goto Lf5
        Leb:
            java.util.Hashtable r2 = p399wi.C6886a.f26785d
            java.lang.Object r0 = r2.get(r0)
            fj.d r0 = (fj.AbstractC2192d) r0
            if (r0 != 0) goto Lf7
        Lf5:
            r0 = r1
            goto Lfb
        Lf7:
            fj.c r0 = r0.m5782b()
        Lfb:
            if (r0 != 0) goto L108
            ri.n r2 = new ri.n     // Catch: java.lang.IllegalArgumentException -> L107
            r2.<init>(r9)     // Catch: java.lang.IllegalArgumentException -> L107
            fj.c r0 = p101fh.C2174f.m5721k(r2)     // Catch: java.lang.IllegalArgumentException -> L107
            goto L108
        L107:
        L108:
            if (r0 != 0) goto L10b
            return r1
        L10b:
            mj.a r1 = new mj.a
            nj.c r4 = r0.f10032Z
            nj.f r5 = r0.m5781n()
            java.math.BigInteger r6 = r0.f10034b0
            java.math.BigInteger r7 = r0.f10035c0
            byte[] r0 = r0.f10036d0
            byte[] r8 = p400wj.C6888a.m13951c(r0)
            r2 = r1
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r1
    }

    /* renamed from: p */
    public static void m9622p(long[] r25, long[] r26) {
            r0 = 0
            r1 = r25[r0]
            r3 = 1
            r4 = r25[r3]
            r6 = 2
            r7 = r25[r6]
            r9 = 3
            r10 = r25[r9]
            r12 = 4
            r13 = r25[r12]
            r15 = 5
            r16 = r25[r15]
            r18 = 6
            r19 = r25[r18]
            r21 = 576460752303423487(0x7ffffffffffffff, double:3.7857669957336787E-270)
            long r23 = r1 & r21
            r26[r0] = r23
            r0 = 59
            long r0 = r1 >>> r0
            long r23 = r4 << r15
            long r0 = r0 ^ r23
            long r0 = r0 & r21
            r26[r3] = r0
            r0 = 54
            long r0 = r4 >>> r0
            r2 = 10
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r21
            r26[r6] = r0
            r0 = 49
            long r0 = r7 >>> r0
            r2 = 15
            long r2 = r10 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r21
            r26[r9] = r0
            r0 = 44
            long r0 = r10 >>> r0
            r2 = 20
            long r2 = r13 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r21
            r26[r12] = r0
            r0 = 39
            long r0 = r13 >>> r0
            r2 = 25
            long r2 = r16 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r21
            r26[r15] = r0
            r0 = 34
            long r0 = r16 >>> r0
            r2 = 30
            long r2 = r19 << r2
            long r0 = r0 ^ r2
            r26[r18] = r0
            return
    }

    /* renamed from: q */
    public static void m9623q(long[] r25, long[] r26, long[] r27) {
            r0 = 0
            r1 = r25[r0]
            r3 = 1
            r4 = r25[r3]
            r6 = 57
            long r7 = r1 >>> r6
            r9 = 7
            long r4 = r4 << r9
            long r4 = r4 ^ r7
            r7 = 144115188075855871(0x1ffffffffffffff, double:4.77830972673648E-299)
            long r4 = r4 & r7
            long r1 = r1 & r7
            r10 = r26[r0]
            r12 = r26[r3]
            long r14 = r10 >>> r6
            long r12 = r12 << r9
            long r12 = r12 ^ r14
            long r16 = r12 & r7
            long r7 = r7 & r10
            r10 = 6
            long[] r15 = new long[r10]
            r18 = 0
            r10 = r1
            r12 = r7
            r14 = r15
            r24 = r15
            r15 = r18
            m9625s(r10, r12, r14, r15)
            r15 = 2
            r10 = r4
            r12 = r16
            r14 = r24
            m9625s(r10, r12, r14, r15)
            long r18 = r1 ^ r4
            long r20 = r7 ^ r16
            r23 = 4
            r22 = r24
            m9625s(r18, r20, r22, r23)
            r1 = r24[r3]
            r4 = 2
            r7 = r24[r4]
            long r1 = r1 ^ r7
            r7 = r24[r0]
            r5 = 3
            r10 = r24[r5]
            r12 = 4
            r12 = r24[r12]
            long r12 = r12 ^ r7
            long r12 = r12 ^ r1
            r14 = 5
            r14 = r24[r14]
            long r14 = r14 ^ r10
            long r1 = r1 ^ r14
            long r14 = r12 << r6
            long r6 = r7 ^ r14
            r27[r0] = r6
            long r6 = r12 >>> r9
            r0 = 50
            long r8 = r1 << r0
            long r6 = r6 ^ r8
            r27[r3] = r6
            r0 = 14
            long r0 = r1 >>> r0
            r2 = 43
            long r2 = r10 << r2
            long r0 = r0 ^ r2
            r27[r4] = r0
            r0 = 21
            long r0 = r10 >>> r0
            r27[r5] = r0
            return
    }

    /* renamed from: r */
    public static void m9624r(long[] r46, long[] r47, long[] r48) {
            r0 = 7
            long[] r1 = new long[r0]
            long[] r2 = new long[r0]
            r3 = r46
            m9622p(r3, r1)
            r3 = r47
            m9622p(r3, r2)
            r4 = 0
        L10:
            r5 = 59
            r6 = 8
            r7 = 6
            r8 = 5
            r9 = 4
            r10 = 2
            r14 = 3
            r15 = 1
            if (r4 >= r0) goto La0
            r16 = r2[r4]
            long[] r6 = new long[r6]
            r6[r15] = r16
            r18 = r6[r15]
            long r18 = r18 << r15
            r6[r10] = r18
            r18 = r6[r10]
            long r18 = r18 ^ r16
            r6[r14] = r18
            r18 = r6[r10]
            long r18 = r18 << r15
            r6[r9] = r18
            r9 = r6[r9]
            long r9 = r9 ^ r16
            r6[r8] = r9
            r9 = r6[r14]
            long r9 = r9 << r15
            r6[r7] = r9
            r9 = r6[r7]
            long r9 = r9 ^ r16
            r6[r0] = r9
            r7 = 0
        L46:
            if (r7 >= r0) goto L99
            r9 = r1[r7]
            int r11 = (int) r9
            r12 = r11 & 7
            r16 = r6[r12]
            int r11 = r11 >>> r14
            r11 = r11 & r0
            r11 = r6[r11]
            long r11 = r11 << r14
            long r11 = r16 ^ r11
            r20 = r4
            r13 = 54
            r17 = 0
        L5c:
            long r3 = r9 >>> r13
            int r4 = (int) r3
            r3 = r4 & 7
            r21 = r6[r3]
            int r3 = r4 >>> 3
            r3 = r3 & r0
            r3 = r6[r3]
            long r3 = r3 << r14
            long r3 = r3 ^ r21
            long r21 = r3 << r13
            long r11 = r11 ^ r21
            int r0 = -r13
            long r3 = r3 >>> r0
            long r17 = r17 ^ r3
            int r13 = r13 + (-6)
            if (r13 > 0) goto L97
            int r4 = r20 + r7
            r9 = r48[r4]
            r22 = 576460752303423487(0x7ffffffffffffff, double:3.7857669957336787E-270)
            long r22 = r11 & r22
            long r9 = r9 ^ r22
            r48[r4] = r9
            int r4 = r4 + r15
            r9 = r48[r4]
            long r11 = r11 >>> r5
            long r17 = r17 << r8
            long r11 = r17 ^ r11
            long r9 = r9 ^ r11
            r48[r4] = r9
            int r7 = r7 + 1
            r4 = r20
            r0 = 7
            goto L46
        L97:
            r0 = 7
            goto L5c
        L99:
            r20 = r4
            int r4 = r20 + 1
            r0 = 7
            goto L10
        La0:
            r0 = 0
            r1 = r48[r0]
            r3 = r48[r15]
            r11 = r48[r10]
            r17 = r48[r14]
            r22 = r48[r9]
            r24 = r48[r8]
            r26 = r48[r7]
            r0 = 7
            r28 = r48[r0]
            r30 = r48[r6]
            r0 = 9
            r32 = r48[r0]
            r13 = 10
            r34 = r48[r13]
            r20 = 11
            r36 = r48[r20]
            r38 = 12
            r39 = r48[r38]
            r41 = 13
            r42 = r48[r41]
            long r44 = r3 << r5
            long r1 = r1 ^ r44
            r5 = 0
            r48[r5] = r1
            long r1 = r3 >>> r8
            r3 = 54
            long r3 = r11 << r3
            long r1 = r1 ^ r3
            r48[r15] = r1
            long r1 = r11 >>> r13
            r3 = 49
            long r3 = r17 << r3
            long r1 = r1 ^ r3
            r48[r10] = r1
            r1 = 15
            long r1 = r17 >>> r1
            r3 = 44
            long r3 = r22 << r3
            long r1 = r1 ^ r3
            r48[r14] = r1
            r1 = 20
            long r1 = r22 >>> r1
            r3 = 39
            long r3 = r24 << r3
            long r1 = r1 ^ r3
            r48[r9] = r1
            r1 = 25
            long r1 = r24 >>> r1
            r3 = 34
            long r3 = r26 << r3
            long r1 = r1 ^ r3
            r48[r8] = r1
            r1 = 30
            long r1 = r26 >>> r1
            r3 = 29
            long r3 = r28 << r3
            long r1 = r1 ^ r3
            r48[r7] = r1
            r1 = 35
            long r1 = r28 >>> r1
            r3 = 24
            long r3 = r30 << r3
            long r1 = r1 ^ r3
            r3 = 7
            r48[r3] = r1
            r1 = 40
            long r1 = r30 >>> r1
            r3 = 19
            long r3 = r32 << r3
            long r1 = r1 ^ r3
            r48[r6] = r1
            r1 = 45
            long r1 = r32 >>> r1
            r3 = 14
            long r3 = r34 << r3
            long r1 = r1 ^ r3
            r48[r0] = r1
            r1 = 50
            long r1 = r34 >>> r1
            long r3 = r36 << r0
            long r0 = r1 ^ r3
            r48[r13] = r0
            r0 = 55
            long r0 = r36 >>> r0
            long r2 = r39 << r9
            long r0 = r0 ^ r2
            r2 = 63
            long r2 = r42 << r2
            long r0 = r0 ^ r2
            r48[r20] = r0
            r0 = 60
            long r0 = r39 >>> r0
            long r2 = r42 >>> r15
            long r0 = r0 ^ r2
            r48[r38] = r0
            r0 = 0
            r48[r41] = r0
            return
    }

    /* renamed from: s */
    public static void m9625s(long r19, long r21, long[] r23, int r24) {
            r0 = r19
            r2 = 8
            long[] r3 = new long[r2]
            r4 = 1
            r3[r4] = r21
            r5 = r3[r4]
            long r5 = r5 << r4
            r7 = 2
            r3[r7] = r5
            r5 = r3[r7]
            long r5 = r5 ^ r21
            r8 = 3
            r3[r8] = r5
            r5 = r3[r7]
            long r5 = r5 << r4
            r7 = 4
            r3[r7] = r5
            r5 = r3[r7]
            long r5 = r5 ^ r21
            r7 = 5
            r3[r7] = r5
            r5 = r3[r8]
            long r5 = r5 << r4
            r7 = 6
            r3[r7] = r5
            r5 = r3[r7]
            long r5 = r5 ^ r21
            r9 = 7
            r3[r9] = r5
            int r5 = (int) r0
            r5 = r5 & r9
            r5 = r3[r5]
            r10 = 0
            r12 = 48
        L38:
            long r13 = r0 >>> r12
            int r14 = (int) r13
            r13 = r14 & 7
            r15 = r3[r13]
            int r13 = r14 >>> 3
            r13 = r13 & r9
            r17 = r3[r13]
            long r17 = r17 << r8
            long r15 = r15 ^ r17
            int r13 = r14 >>> 6
            r13 = r13 & r9
            r13 = r3[r13]
            long r13 = r13 << r7
            long r13 = r13 ^ r15
            long r15 = r13 << r12
            long r5 = r5 ^ r15
            int r15 = -r12
            long r13 = r13 >>> r15
            long r10 = r10 ^ r13
            int r12 = r12 + (-9)
            if (r12 > 0) goto L38
            r7 = 72198606942111744(0x100804020100800, double:7.519415468309625E-304)
            long r0 = r0 & r7
            long r7 = r21 << r9
            r3 = 63
            long r7 = r7 >> r3
            long r0 = r0 & r7
            long r0 = r0 >>> r2
            long r0 = r0 ^ r10
            r2 = 144115188075855871(0x1ffffffffffffff, double:4.77830972673648E-299)
            long r2 = r2 & r5
            r23[r24] = r2
            int r2 = r24 + 1
            r3 = 57
            long r3 = r5 >>> r3
            long r0 = r0 << r9
            long r0 = r0 ^ r3
            r23[r2] = r0
            return
    }

    /* renamed from: t */
    public static void m9626t(long[] r3, long[] r4) {
            r0 = 0
            r1 = r3[r0]
            gh.C2390b.m6118h(r1, r4, r0)
            r0 = 1
            r0 = r3[r0]
            r3 = 2
            gh.C2390b.m6118h(r0, r4, r3)
            return
    }

    /* renamed from: u */
    public static void m9627u(long[] r4, long[] r5) {
            r0 = 0
        L1:
            r1 = 6
            if (r0 >= r1) goto Le
            r1 = r4[r0]
            int r3 = r0 << 1
            gh.C2390b.m6118h(r1, r5, r3)
            int r0 = r0 + 1
            goto L1
        Le:
            r0 = 12
            r1 = r4[r1]
            int r4 = (int) r1
            long r1 = gh.C2390b.m6117g(r4)
            r5[r0] = r1
            return
    }

    /* renamed from: v */
    public static final boolean m9628v(p260oi.C5283e r8) {
            java.lang.String r0 = "$this$isProbablyUtf8"
            p214m2.C4339q.m9706k(r8, r0)
            r0 = 0
            oi.e r7 = new oi.e     // Catch: java.io.EOFException -> L3c
            r7.<init>()     // Catch: java.io.EOFException -> L3c
            long r1 = r8.f20501Z     // Catch: java.io.EOFException -> L3c
            r3 = 64
            long r5 = m9615i(r1, r3)     // Catch: java.io.EOFException -> L3c
            r3 = 0
            r1 = r8
            r2 = r7
            r1.m11553R(r2, r3, r5)     // Catch: java.io.EOFException -> L3c
            r8 = 16
            r1 = 0
        L1d:
            if (r1 >= r8) goto L3a
            boolean r2 = r7.mo11541F()     // Catch: java.io.EOFException -> L3c
            if (r2 == 0) goto L26
            goto L3a
        L26:
            int r2 = r7.m11572s0()     // Catch: java.io.EOFException -> L3c
            boolean r3 = java.lang.Character.isISOControl(r2)     // Catch: java.io.EOFException -> L3c
            if (r3 == 0) goto L37
            boolean r2 = java.lang.Character.isWhitespace(r2)     // Catch: java.io.EOFException -> L3c
            if (r2 != 0) goto L37
            return r0
        L37:
            int r1 = r1 + 1
            goto L1d
        L3a:
            r8 = 1
            return r8
        L3c:
            return r0
    }

    /* renamed from: w */
    public static void m9629w(long[] r1, long[] r2, long[] r3) {
            r0 = 4
            long[] r0 = new long[r0]
            m9623q(r1, r2, r0)
            m9596B(r0, r3)
            return
    }

    /* renamed from: x */
    public static void m9630x(long[] r1, long[] r2, long[] r3) {
            r0 = 14
            long[] r0 = new long[r0]
            m9624r(r1, r2, r0)
            m9597C(r0, r3)
            return
    }

    /* renamed from: y */
    public static void m9631y(long[] r1, long[] r2, long[] r3) {
            r0 = 4
            long[] r0 = new long[r0]
            m9623q(r1, r2, r0)
            m9608b(r3, r0, r3)
            return
    }

    /* renamed from: z */
    public static void m9632z(long[] r5, long[] r6, long[] r7) {
            r0 = 14
            long[] r0 = new long[r0]
            m9624r(r5, r6, r0)
            r5 = 0
        L8:
            r6 = 13
            if (r5 >= r6) goto L16
            r1 = r7[r5]
            r3 = r0[r5]
            long r1 = r1 ^ r3
            r7[r5] = r1
            int r5 = r5 + 1
            goto L8
        L16:
            return
    }
}
