package gh;

/* renamed from: gh.b */
/* loaded from: classes.dex */
public class C2390b {

    /* renamed from: gh.b$a */
    public static final class a extends p134hh.AbstractC3046g {

        /* renamed from: Z */
        public int f10768Z;

        /* renamed from: a0 */
        public final /* synthetic */ mh.InterfaceC4624p f10769a0;

        /* renamed from: b0 */
        public final /* synthetic */ java.lang.Object f10770b0;

        public a(p101fh.InterfaceC2172d r1, mh.InterfaceC4624p r2, java.lang.Object r3) {
                r0 = this;
                r0.f10769a0 = r2
                r0.f10770b0 = r3
                r0.<init>(r1)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public java.lang.Object mo123o(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.f10768Z
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1a
                if (r0 != r2) goto Le
                r3.f10768Z = r1
                p074e9.C1805a.m4540y(r4)
                goto L2c
            Le:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L1a:
                r3.f10768Z = r2
                p074e9.C1805a.m4540y(r4)
                mh.p r4 = r3.f10769a0
                p239nh.C4840t.m10855a(r4, r1)
                mh.p r4 = (mh.InterfaceC4624p) r4
                java.lang.Object r0 = r3.f10770b0
                java.lang.Object r4 = r4.mo122l(r0, r3)
            L2c:
                return r4
        }
    }

    /* renamed from: gh.b$b */
    public static final class b extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public int f10771b0;

        /* renamed from: c0 */
        public final /* synthetic */ mh.InterfaceC4624p f10772c0;

        /* renamed from: d0 */
        public final /* synthetic */ java.lang.Object f10773d0;

        public b(p101fh.InterfaceC2172d r1, p101fh.InterfaceC2175g r2, mh.InterfaceC4624p r3, java.lang.Object r4) {
                r0 = this;
                r0.f10772c0 = r3
                r0.f10773d0 = r4
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public java.lang.Object mo123o(java.lang.Object r4) {
                r3 = this;
                int r0 = r3.f10771b0
                r1 = 2
                r2 = 1
                if (r0 == 0) goto L1a
                if (r0 != r2) goto Le
                r3.f10771b0 = r1
                p074e9.C1805a.m4540y(r4)
                goto L2c
            Le:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                java.lang.String r0 = r0.toString()
                r4.<init>(r0)
                throw r4
            L1a:
                r3.f10771b0 = r2
                p074e9.C1805a.m4540y(r4)
                mh.p r4 = r3.f10772c0
                p239nh.C4840t.m10855a(r4, r1)
                mh.p r4 = (mh.InterfaceC4624p) r4
                java.lang.Object r0 = r3.f10773d0
                java.lang.Object r4 = r4.mo122l(r0, r3)
            L2c:
                return r4
        }
    }

    /* renamed from: A */
    public static long m6110A(long r5) {
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 2459565876494606882(0x2222222222222222, double:2.9043552100789517E-144)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 2
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 868082074056920076(0xc0c0c0c0c0c0c0c, double:1.224167783418391E-250)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 4
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 67555025218437360(0xf000f000f000f0, double:3.646395425207308E-304)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 8
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 280375465148160(0xff000000ff00, double:1.385238852664656E-309)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 16
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 4294901760(0xffff0000, double:2.121963412E-314)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            return r5
    }

    /* renamed from: a */
    public static void m6111a(long[] r5, long[] r6, long[] r7) {
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
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 4
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 5
            r1 = r5[r0]
            r3 = r6[r0]
            long r1 = r1 ^ r3
            r7[r0] = r1
            r0 = 6
            r1 = r5[r0]
            r5 = r6[r0]
            long r5 = r5 ^ r1
            r7[r0] = r5
            return
    }

    /* renamed from: b */
    public static final int m6112b(int r4) {
            r0 = 0
            r1 = 2
            if (r1 > r4) goto L9
            r2 = 37
            if (r4 >= r2) goto L9
            r0 = 1
        L9:
            if (r0 == 0) goto Lc
            return r4
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "radix "
            java.lang.String r3 = " was not in valid range "
            java.lang.StringBuilder r4 = androidx.appcompat.widget.C0300r0.m777a(r2, r4, r3)
            rh.c r2 = new rh.c
            r3 = 36
            r2.<init>(r1, r3)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: c */
    public static final <R, T> p101fh.InterfaceC2172d<ch.C0985l> m6113c(mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2172d<? super T>, ? extends java.lang.Object> r2, R r3, p101fh.InterfaceC2172d<? super T> r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "completion"
            p214m2.C4339q.m9706k(r4, r0)
            boolean r0 = r2 instanceof p134hh.AbstractC3040a
            if (r0 == 0) goto L15
            hh.a r2 = (p134hh.AbstractC3040a) r2
            fh.d r2 = r2.mo121h(r3, r4)
            goto L2a
        L15:
            fh.g r0 = r4.mo5706c()
            fh.i r1 = p101fh.C2177i.f9918Y
            if (r0 != r1) goto L24
            gh.b$a r0 = new gh.b$a
            r0.<init>(r4, r2, r3)
            r2 = r0
            goto L2a
        L24:
            gh.b$b r1 = new gh.b$b
            r1.<init>(r4, r0, r2, r3)
            r2 = r1
        L2a:
            return r2
    }

    /* renamed from: d */
    public static final java.net.InetAddress m6114d(java.lang.String r17, int r18, int r19) {
            r0 = r17
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r18
            r7 = 0
            r8 = -1
            r9 = -1
        Lf:
            r10 = 0
            if (r6 >= r1) goto Lda
            if (r7 != r2) goto L15
            return r10
        L15:
            int r11 = r6 + 2
            r12 = 4
            r13 = 255(0xff, float:3.57E-43)
            if (r11 > r1) goto L31
            java.lang.String r14 = "::"
            boolean r14 = p362uh.C6463i.m13060Q(r0, r14, r6, r5, r12)
            if (r14 == 0) goto L31
            if (r8 == r4) goto L27
            return r10
        L27:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r1) goto L2e
            goto Lda
        L2e:
            r9 = r11
            goto La7
        L31:
            if (r7 == 0) goto La6
            java.lang.String r11 = ":"
            boolean r11 = p362uh.C6463i.m13060Q(r0, r11, r6, r5, r12)
            if (r11 == 0) goto L3f
            int r6 = r6 + 1
            goto La6
        L3f:
            java.lang.String r11 = "."
            boolean r6 = p362uh.C6463i.m13060Q(r0, r11, r6, r5, r12)
            if (r6 == 0) goto La5
            int r6 = r7 + (-2)
            r11 = r6
        L4a:
            if (r9 >= r1) goto L99
            if (r11 != r2) goto L4f
            goto L9e
        L4f:
            if (r11 == r6) goto L5c
            char r14 = r0.charAt(r9)
            r15 = 46
            if (r14 == r15) goto L5a
            goto L9e
        L5a:
            int r9 = r9 + 1
        L5c:
            r14 = r9
            r15 = 0
        L5e:
            if (r14 >= r1) goto L88
            char r5 = r0.charAt(r14)
            r2 = 48
            int r16 = p214m2.C4339q.m9708m(r5, r2)
            if (r16 < 0) goto L88
            r4 = 57
            int r4 = p214m2.C4339q.m9708m(r5, r4)
            if (r4 <= 0) goto L75
            goto L88
        L75:
            if (r15 != 0) goto L7a
            if (r9 == r14) goto L7a
            goto L9e
        L7a:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r13) goto L81
            goto L9e
        L81:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L5e
        L88:
            int r2 = r14 - r9
            if (r2 != 0) goto L8d
            goto L9e
        L8d:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            goto L4a
        L99:
            int r6 = r6 + r12
            if (r11 != r6) goto L9e
            r0 = 1
            goto L9f
        L9e:
            r0 = 0
        L9f:
            if (r0 != 0) goto La2
            return r10
        La2:
            int r7 = r7 + 2
            goto Lda
        La5:
            return r10
        La6:
            r9 = r6
        La7:
            r6 = r9
            r2 = 0
        La9:
            if (r6 >= r1) goto Lbd
            char r4 = r0.charAt(r6)
            int r4 = ci.C0988c.m2711p(r4)
            r5 = -1
            if (r4 != r5) goto Lb7
            goto Lbd
        Lb7:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto La9
        Lbd:
            int r4 = r6 - r9
            if (r4 == 0) goto Ld9
            if (r4 <= r12) goto Lc4
            goto Ld9
        Lc4:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r13
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto Lf
        Ld9:
            return r10
        Lda:
            r0 = 16
            if (r7 == r0) goto Lf1
            r1 = -1
            if (r8 != r1) goto Le2
            return r10
        Le2:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        Lf1:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
    }

    /* renamed from: e */
    public static final boolean m6115e(char r2, char r3, boolean r4) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            r1 = 0
            if (r4 != 0) goto L8
            return r1
        L8:
            char r2 = java.lang.Character.toUpperCase(r2)
            char r3 = java.lang.Character.toUpperCase(r3)
            if (r2 == r3) goto L1e
            char r2 = java.lang.Character.toLowerCase(r2)
            char r3 = java.lang.Character.toLowerCase(r3)
            if (r2 != r3) goto L1d
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
    }

    /* renamed from: f */
    public static int m6116f(int r1) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r0 = r1 << 8
            r1 = r1 | r0
            r0 = 16711935(0xff00ff, float:2.3418409E-38)
            r1 = r1 & r0
            int r0 = r1 << 4
            r1 = r1 | r0
            r0 = 252645135(0xf0f0f0f, float:7.0533445E-30)
            r1 = r1 & r0
            int r0 = r1 << 2
            r1 = r1 | r0
            r0 = 858993459(0x33333333, float:4.172325E-8)
            r1 = r1 & r0
            int r0 = r1 << 1
            r1 = r1 | r0
            r0 = 1431655765(0x55555555, float:1.4660155E13)
            r1 = r1 & r0
            return r1
    }

    /* renamed from: g */
    public static long m6117g(int r6) {
            int r0 = r6 >>> 8
            r0 = r0 ^ r6
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r1 = r0 << 8
            r0 = r0 ^ r1
            r6 = r6 ^ r0
            int r0 = r6 >>> 4
            r0 = r0 ^ r6
            r1 = 15728880(0xf000f0, float:2.2040855E-38)
            r0 = r0 & r1
            int r1 = r0 << 4
            r0 = r0 ^ r1
            r6 = r6 ^ r0
            int r0 = r6 >>> 2
            r0 = r0 ^ r6
            r1 = 202116108(0xc0c0c0c, float:1.0788833E-31)
            r0 = r0 & r1
            int r1 = r0 << 2
            r0 = r0 ^ r1
            r6 = r6 ^ r0
            int r0 = r6 >>> 1
            r0 = r0 ^ r6
            r1 = 572662306(0x22222222, float:2.1973164E-18)
            r0 = r0 & r1
            int r1 = r0 << 1
            r0 = r0 ^ r1
            r6 = r6 ^ r0
            int r0 = r6 >>> 1
            long r0 = (long) r0
            r2 = 1431655765(0x55555555, double:7.0733193E-315)
            long r0 = r0 & r2
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r6
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
    }

    /* renamed from: h */
    public static void m6118h(long r5, long[] r7, int r8) {
            r0 = 16
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 4294901760(0xffff0000, double:2.121963412E-314)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 8
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 280375465148160(0xff000000ff00, double:1.385238852664656E-309)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 4
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 67555025218437360(0xf000f000f000f0, double:3.646395425207308E-304)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 2
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 868082074056920076(0xc0c0c0c0c0c0c0c, double:1.224167783418391E-250)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r0 = r1 ^ r3
            long r5 = r5 ^ r0
            r0 = 1
            long r1 = r5 >>> r0
            long r1 = r1 ^ r5
            r3 = 2459565876494606882(0x2222222222222222, double:2.9043552100789517E-144)
            long r1 = r1 & r3
            long r3 = r1 << r0
            long r1 = r1 ^ r3
            long r5 = r5 ^ r1
            r1 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r3 = r5 & r1
            r7[r8] = r3
            int r8 = r8 + r0
            long r5 = r5 >>> r0
            long r5 = r5 & r1
            r7[r8] = r5
            return
    }

    /* renamed from: i */
    public static int m6119i(int r1) {
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r0 = r1 << 4
            r1 = r1 | r0
            r1 = r1 & 3855(0xf0f, float:5.402E-42)
            int r0 = r1 << 2
            r1 = r1 | r0
            r1 = r1 & 13107(0x3333, float:1.8367E-41)
            int r0 = r1 << 1
            r1 = r1 | r0
            r1 = r1 & 21845(0x5555, float:3.0611E-41)
            return r1
    }

    /* renamed from: j */
    public static final java.lang.String m6120j(java.lang.Object r0) {
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    /* renamed from: k */
    public static final java.lang.String m6121k(java.lang.Object r0) {
            int r0 = java.lang.System.identityHashCode(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            return r0
    }

    /* renamed from: l */
    public static final void m6122l(p101fh.InterfaceC2175g r3, java.lang.Throwable r4) {
            int r0 = kotlinx.coroutines.CoroutineExceptionHandler.f17182O     // Catch: java.lang.Throwable -> L14
            kotlinx.coroutines.CoroutineExceptionHandler$a r0 = kotlinx.coroutines.CoroutineExceptionHandler.C4149a.f17183Y     // Catch: java.lang.Throwable -> L14
            fh.g$a r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L14
            kotlinx.coroutines.CoroutineExceptionHandler r0 = (kotlinx.coroutines.CoroutineExceptionHandler) r0     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L10
            p379vh.C6683a0.m13548a(r3, r4)
            return
        L10:
            r0.handleException(r3, r4)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            if (r4 != r0) goto L18
            goto L23
        L18:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Exception while trying to handle coroutine exception"
            r1.<init>(r2, r0)
            p185k7.C3836i.m8616a(r1, r4)
            r4 = r1
        L23:
            p379vh.C6683a0.m13548a(r3, r4)
            return
    }

    /* renamed from: m */
    public static void m6123m(long[] r16, long[] r17) {
            r0 = 0
            r1 = r16[r0]
            r3 = 1
            r4 = r16[r3]
            r6 = 2
            r7 = r16[r6]
            r9 = 3
            r10 = r16[r9]
            r12 = 562949953421311(0x1ffffffffffff, double:2.781342323133997E-309)
            long r14 = r1 & r12
            r17[r0] = r14
            r0 = 49
            long r0 = r1 >>> r0
            r2 = 15
            long r14 = r4 << r2
            long r0 = r0 ^ r14
            long r0 = r0 & r12
            r17[r3] = r0
            r0 = 34
            long r0 = r4 >>> r0
            r2 = 30
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            long r0 = r0 & r12
            r17[r6] = r0
            r0 = 19
            long r0 = r7 >>> r0
            r2 = 45
            long r2 = r10 << r2
            long r0 = r0 ^ r2
            r17[r9] = r0
            return
    }

    /* renamed from: n */
    public static void m6124n(long[] r26, long[] r27, long[] r28) {
            r6 = 4
            long[] r7 = new long[r6]
            long[] r8 = new long[r6]
            r0 = r26
            m6123m(r0, r7)
            r0 = r27
            m6123m(r0, r8)
            r9 = 0
            r0 = r7[r9]
            r2 = r8[r9]
            r5 = 0
            r4 = r28
            m6125o(r0, r2, r4, r5)
            r10 = 1
            r0 = r7[r10]
            r2 = r8[r10]
            r5 = 1
            m6125o(r0, r2, r4, r5)
            r11 = 2
            r0 = r7[r11]
            r2 = r8[r11]
            r5 = 2
            m6125o(r0, r2, r4, r5)
            r12 = 3
            r0 = r7[r12]
            r2 = r8[r12]
            r5 = 3
            m6125o(r0, r2, r4, r5)
            r13 = 5
            r0 = 5
        L37:
            if (r0 <= 0) goto L44
            r1 = r28[r0]
            int r3 = r0 + (-1)
            r4 = r28[r3]
            long r1 = r1 ^ r4
            r28[r0] = r1
            r0 = r3
            goto L37
        L44:
            r0 = r7[r9]
            r2 = r7[r10]
            long r0 = r0 ^ r2
            r2 = r8[r9]
            r4 = r8[r10]
            long r2 = r2 ^ r4
            r5 = 1
            r4 = r28
            m6125o(r0, r2, r4, r5)
            r0 = r7[r11]
            r2 = r7[r12]
            long r0 = r0 ^ r2
            r2 = r8[r11]
            r4 = r8[r12]
            long r2 = r2 ^ r4
            r5 = 3
            r4 = r28
            m6125o(r0, r2, r4, r5)
            r14 = 7
            r0 = 7
        L66:
            if (r0 <= r10) goto L74
            r1 = r28[r0]
            int r3 = r0 + (-2)
            r3 = r28[r3]
            long r1 = r1 ^ r3
            r28[r0] = r1
            int r0 = r0 + (-1)
            goto L66
        L74:
            r0 = r7[r9]
            r2 = r7[r11]
            long r15 = r0 ^ r2
            r0 = r7[r10]
            r2 = r7[r12]
            long r21 = r0 ^ r2
            r0 = r8[r9]
            r2 = r8[r11]
            long r17 = r0 ^ r2
            r0 = r8[r10]
            r2 = r8[r12]
            long r7 = r0 ^ r2
            long r0 = r15 ^ r21
            long r2 = r17 ^ r7
            r5 = 3
            r4 = r28
            m6125o(r0, r2, r4, r5)
            long[] r0 = new long[r12]
            r20 = 0
            r19 = r0
            m6125o(r15, r17, r19, r20)
            r1 = 1
            r17 = r21
            r19 = r7
            r21 = r0
            r22 = r1
            m6125o(r17, r19, r21, r22)
            r1 = r0[r9]
            r3 = r0[r10]
            r7 = r0[r11]
            r15 = r28[r11]
            long r15 = r15 ^ r1
            r28[r11] = r15
            r15 = r28[r12]
            long r0 = r1 ^ r3
            long r0 = r0 ^ r15
            r28[r12] = r0
            r0 = r28[r6]
            long r2 = r7 ^ r3
            long r0 = r0 ^ r2
            r28[r6] = r0
            r0 = r28[r13]
            long r0 = r0 ^ r7
            r28[r13] = r0
            r0 = r28[r9]
            r2 = r28[r10]
            r4 = r28[r11]
            r7 = r28[r12]
            r15 = r28[r6]
            r17 = r28[r13]
            r19 = 6
            r20 = r28[r19]
            r22 = r28[r14]
            r24 = 49
            long r24 = r2 << r24
            long r0 = r0 ^ r24
            r28[r9] = r0
            r0 = 15
            long r0 = r2 >>> r0
            r2 = 34
            long r2 = r4 << r2
            long r0 = r0 ^ r2
            r28[r10] = r0
            r0 = 30
            long r0 = r4 >>> r0
            r2 = 19
            long r2 = r7 << r2
            long r0 = r0 ^ r2
            r28[r11] = r0
            r0 = 45
            long r0 = r7 >>> r0
            long r2 = r15 << r6
            long r0 = r0 ^ r2
            r2 = 53
            long r2 = r17 << r2
            long r0 = r0 ^ r2
            r28[r12] = r0
            r0 = 60
            long r0 = r15 >>> r0
            r2 = 38
            long r2 = r20 << r2
            long r0 = r0 ^ r2
            r2 = 11
            long r2 = r17 >>> r2
            long r0 = r0 ^ r2
            r28[r6] = r0
            r0 = 26
            long r0 = r20 >>> r0
            r2 = 23
            long r2 = r22 << r2
            long r0 = r0 ^ r2
            r28[r13] = r0
            r0 = 41
            long r0 = r22 >>> r0
            r28[r19] = r0
            r0 = 0
            r28[r14] = r0
            return
    }

    /* renamed from: o */
    public static void m6125o(long r18, long r20, long[] r22, int r23) {
            r0 = r18
            r2 = 8
            long[] r2 = new long[r2]
            r3 = 1
            r2[r3] = r20
            r4 = r2[r3]
            long r4 = r4 << r3
            r6 = 2
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r20
            r7 = 3
            r2[r7] = r4
            r4 = r2[r6]
            long r4 = r4 << r3
            r6 = 4
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r20
            r6 = 5
            r2[r6] = r4
            r4 = r2[r7]
            long r4 = r4 << r3
            r6 = 6
            r2[r6] = r4
            r4 = r2[r6]
            long r4 = r4 ^ r20
            r8 = 7
            r2[r8] = r4
            int r4 = (int) r0
            r5 = r4 & 7
            r9 = r2[r5]
            int r4 = r4 >>> r7
            r4 = r4 & r8
            r4 = r2[r4]
            long r4 = r4 << r7
            long r4 = r4 ^ r9
            r9 = 0
            r11 = 36
        L3f:
            long r12 = r0 >>> r11
            int r13 = (int) r12
            r12 = r13 & 7
            r14 = r2[r12]
            int r12 = r13 >>> 3
            r12 = r12 & r8
            r16 = r2[r12]
            long r16 = r16 << r7
            long r14 = r14 ^ r16
            int r12 = r13 >>> 6
            r12 = r12 & r8
            r16 = r2[r12]
            long r16 = r16 << r6
            long r14 = r14 ^ r16
            int r12 = r13 >>> 9
            r12 = r12 & r8
            r16 = r2[r12]
            r12 = 9
            long r16 = r16 << r12
            long r14 = r14 ^ r16
            r12 = 12
            int r13 = r13 >>> r12
            r13 = r13 & r8
            r16 = r2[r13]
            long r12 = r16 << r12
            long r12 = r12 ^ r14
            long r14 = r12 << r11
            long r4 = r4 ^ r14
            int r14 = -r11
            long r12 = r12 >>> r14
            long r9 = r9 ^ r12
            int r11 = r11 + (-15)
            if (r11 > 0) goto L3f
            r0 = r22[r23]
            r6 = 562949953421311(0x1ffffffffffff, double:2.781342323133997E-309)
            long r6 = r6 & r4
            long r0 = r0 ^ r6
            r22[r23] = r0
            int r0 = r23 + 1
            r1 = r22[r0]
            r3 = 49
            long r3 = r4 >>> r3
            r5 = 15
            long r5 = r9 << r5
            long r3 = r3 ^ r5
            long r1 = r1 ^ r3
            r22[r0] = r1
            return
    }

    /* renamed from: p */
    public static void m6126p(long[] r4, long[] r5) {
            r0 = 0
            r1 = r4[r0]
            m6118h(r1, r5, r0)
            r0 = 1
            r0 = r4[r0]
            r2 = 2
            m6118h(r0, r5, r2)
            r0 = r4[r2]
            r2 = 4
            m6118h(r0, r5, r2)
            r0 = 3
            r0 = r4[r0]
            r2 = 1
            long r0 = r0 & r2
            r4 = 6
            r5[r4] = r0
            return
    }

    /* renamed from: q */
    public static final <T> p101fh.InterfaceC2172d<T> m6127q(p101fh.InterfaceC2172d<? super T> r2) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r2, r0)
            boolean r0 = r2 instanceof p134hh.AbstractC3042c
            if (r0 == 0) goto Ld
            r0 = r2
            hh.c r0 = (p134hh.AbstractC3042c) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L2d
            fh.d<java.lang.Object> r2 = r0.f12245a0
            if (r2 != 0) goto L2d
            fh.g r2 = r0.mo5706c()
            int r1 = p101fh.InterfaceC2173e.f9915a
            fh.e$a r1 = p101fh.InterfaceC2173e.a.f9916Y
            fh.g$a r2 = r2.get(r1)
            fh.e r2 = (p101fh.InterfaceC2173e) r2
            if (r2 == 0) goto L2a
            fh.d r2 = r2.mo5708V(r0)
            if (r2 != 0) goto L2b
        L2a:
            r2 = r0
        L2b:
            r0.f12245a0 = r2
        L2d:
            return r2
    }

    /* renamed from: r */
    public static final boolean m6128r(char r1) {
            boolean r0 = java.lang.Character.isWhitespace(r1)
            if (r0 != 0) goto Lf
            boolean r1 = java.lang.Character.isSpaceChar(r1)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            return r1
    }

    /* renamed from: s */
    public static void m6129s(long[] r1, long[] r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m6124n(r1, r2, r0)
            m6131u(r0, r3)
            return
    }

    /* renamed from: t */
    public static void m6130t(long[] r1, long[] r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m6124n(r1, r2, r0)
            m6111a(r3, r0, r3)
            return
    }

    /* renamed from: u */
    public static void m6131u(long[] r24, long[] r25) {
            r0 = 0
            r1 = r24[r0]
            r3 = 1
            r4 = r24[r3]
            r6 = 2
            r7 = r24[r6]
            r9 = 3
            r10 = r24[r9]
            r12 = 4
            r12 = r24[r12]
            r14 = 5
            r14 = r24[r14]
            r16 = 6
            r16 = r24[r16]
            r18 = 63
            long r19 = r16 << r18
            long r7 = r7 ^ r19
            long r19 = r16 >>> r3
            r21 = 14
            long r22 = r16 << r21
            long r19 = r19 ^ r22
            long r10 = r10 ^ r19
            r19 = 50
            long r16 = r16 >>> r19
            long r12 = r12 ^ r16
            long r16 = r14 << r18
            long r4 = r4 ^ r16
            long r16 = r14 >>> r3
            long r22 = r14 << r21
            long r16 = r16 ^ r22
            long r7 = r7 ^ r16
            long r14 = r14 >>> r19
            long r10 = r10 ^ r14
            long r14 = r12 << r18
            long r1 = r1 ^ r14
            long r14 = r12 >>> r3
            long r16 = r12 << r21
            long r14 = r14 ^ r16
            long r4 = r4 ^ r14
            long r12 = r12 >>> r19
            long r7 = r7 ^ r12
            long r12 = r10 >>> r3
            long r1 = r1 ^ r12
            r14 = 15
            long r14 = r12 << r14
            long r1 = r1 ^ r14
            r25[r0] = r1
            r0 = 49
            long r0 = r12 >>> r0
            long r0 = r0 ^ r4
            r25[r3] = r0
            r25[r6] = r7
            r0 = 1
            long r0 = r0 & r10
            r25[r9] = r0
            return
    }

    /* renamed from: v */
    public static final int m6132v(p260oi.C5301w r4, int r5) {
            int[] r0 = r4.f20548e0
            int r5 = r5 + 1
            r1 = 0
            byte[][] r4 = r4.f20547d0
            int r4 = r4.length
            java.lang.String r2 = "$this$binarySearch"
            p214m2.C4339q.m9706k(r0, r2)
            int r4 = r4 + (-1)
        Lf:
            if (r1 > r4) goto L21
            int r2 = r1 + r4
            int r2 = r2 >>> 1
            r3 = r0[r2]
            if (r3 >= r5) goto L1c
            int r1 = r2 + 1
            goto Lf
        L1c:
            if (r3 <= r5) goto L24
            int r4 = r2 + (-1)
            goto Lf
        L21:
            int r4 = -r1
            int r2 = r4 + (-1)
        L24:
            if (r2 < 0) goto L27
            goto L28
        L27:
            int r2 = ~r2
        L28:
            return r2
    }

    /* renamed from: w */
    public static void m6133w(long[] r1, int r2, long[] r3) {
            r0 = 8
            long[] r0 = new long[r0]
            m6126p(r1, r0)
        L7:
            m6131u(r0, r3)
            int r2 = r2 + (-1)
            if (r2 <= 0) goto L12
            m6126p(r3, r0)
            goto L7
        L12:
            return
    }

    /* renamed from: x */
    public static final <T, R> java.lang.Object m6134x(p459zh.C7349o<? super T> r2, R r3, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2172d<? super T>, ? extends java.lang.Object> r4) {
            r0 = 2
            if (r4 == 0) goto Lb
            p239nh.C4840t.m10855a(r4, r0)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r3 = r4.mo122l(r3, r2)     // Catch: java.lang.Throwable -> L13
            goto L1b
        Lb:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L13
            java.lang.String r4 = "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L13
            throw r3     // Catch: java.lang.Throwable -> L13
        L13:
            r3 = move-exception
            vh.t r4 = new vh.t
            r1 = 0
            r4.<init>(r3, r1, r0)
            r3 = r4
        L1b:
            gh.a r4 = gh.EnumC2389a.f10764Y
            if (r3 != r4) goto L20
            goto L31
        L20:
            java.lang.Object r2 = r2.m13577H(r3)
            zh.p r3 = p379vh.C6705h1.f25989b
            if (r2 != r3) goto L29
            goto L31
        L29:
            boolean r3 = r2 instanceof p379vh.C6739t
            if (r3 != 0) goto L32
            java.lang.Object r4 = p379vh.C6705h1.m13616a(r2)
        L31:
            return r4
        L32:
            vh.t r2 = (p379vh.C6739t) r2
            java.lang.Throwable r2 = r2.f26037a
            throw r2
    }

    /* renamed from: y */
    public static final java.lang.String m6135y(java.lang.String r9) {
            java.lang.String r0 = "$this$toCanonicalHost"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            boolean r0 = p362uh.C6467m.m13064U(r9, r0, r1, r2)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r0 == 0) goto Lbb
            java.lang.String r0 = "["
            boolean r0 = p362uh.C6463i.m13061R(r9, r0, r1, r2)
            if (r0 == 0) goto L2c
            java.lang.String r0 = "]"
            boolean r0 = p362uh.C6463i.m13052I(r9, r0, r1, r2)
            if (r0 == 0) goto L2c
            int r0 = r9.length()
            int r0 = r0 - r5
            java.net.InetAddress r0 = m6114d(r9, r5, r0)
            goto L34
        L2c:
            int r0 = r9.length()
            java.net.InetAddress r0 = m6114d(r9, r1, r0)
        L34:
            if (r0 == 0) goto Lba
            byte[] r2 = r0.getAddress()
            int r4 = r2.length
            r5 = 4
            r6 = 16
            if (r4 != r6) goto L96
            r9 = 0
            r0 = 0
        L42:
            int r4 = r2.length
            if (r9 >= r4) goto L60
            r4 = r9
        L46:
            if (r4 >= r6) goto L55
            r7 = r2[r4]
            if (r7 != 0) goto L55
            int r7 = r4 + 1
            r7 = r2[r7]
            if (r7 != 0) goto L55
            int r4 = r4 + 2
            goto L46
        L55:
            int r7 = r4 - r9
            if (r7 <= r0) goto L5d
            if (r7 < r5) goto L5d
            r3 = r9
            r0 = r7
        L5d:
            int r9 = r4 + 2
            goto L42
        L60:
            oi.e r9 = new oi.e
            r9.<init>()
        L65:
            int r4 = r2.length
            if (r1 >= r4) goto L91
            r4 = 58
            if (r1 != r3) goto L76
            r9.m11539D0(r4)
            int r1 = r1 + r0
            if (r1 != r6) goto L65
            r9.m11539D0(r4)
            goto L65
        L76:
            if (r1 <= 0) goto L7b
            r9.m11539D0(r4)
        L7b:
            r4 = r2[r1]
            byte[] r5 = ci.C0988c.f5065a
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r5 = r1 + 1
            r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            long r4 = (long) r4
            r9.m11542F0(r4)
            int r1 = r1 + 2
            goto L65
        L91:
            java.lang.String r9 = r9.m11565i0()
            return r9
        L96:
            int r1 = r2.length
            if (r1 != r5) goto L9e
            java.lang.String r9 = r0.getHostAddress()
            return r9
        L9e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r9)
            r9 = 39
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        Lba:
            return r4
        Lbb:
            java.lang.String r9 = java.net.IDN.toASCII(r9)     // Catch: java.lang.IllegalArgumentException -> L10e
            java.lang.String r0 = "IDN.toASCII(host)"
            p214m2.C4339q.m9705j(r9, r0)     // Catch: java.lang.IllegalArgumentException -> L10e
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L10e
            java.lang.String r2 = "Locale.US"
            p214m2.C4339q.m9705j(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L10e
            java.lang.String r9 = r9.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L10e
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            p214m2.C4339q.m9705j(r9, r0)     // Catch: java.lang.IllegalArgumentException -> L10e
            int r0 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L10e
            if (r0 != 0) goto Ldc
            r0 = 1
            goto Ldd
        Ldc:
            r0 = 0
        Ldd:
            if (r0 == 0) goto Le0
            return r4
        Le0:
            int r0 = r9.length()     // Catch: java.lang.IllegalArgumentException -> L10e
            r2 = 0
        Le5:
            if (r2 >= r0) goto L10a
            char r6 = r9.charAt(r2)     // Catch: java.lang.IllegalArgumentException -> L10e
            r7 = 31
            int r7 = p214m2.C4339q.m9708m(r6, r7)     // Catch: java.lang.IllegalArgumentException -> L10e
            if (r7 <= 0) goto L109
            r7 = 127(0x7f, float:1.78E-43)
            int r7 = p214m2.C4339q.m9708m(r6, r7)     // Catch: java.lang.IllegalArgumentException -> L10e
            if (r7 < 0) goto Lfc
            goto L109
        Lfc:
            r7 = 6
            java.lang.String r8 = " #%/:?@[\\]"
            int r6 = p362uh.C6467m.m13069Z(r8, r6, r1, r1, r7)     // Catch: java.lang.IllegalArgumentException -> L10e
            if (r6 == r3) goto L106
            goto L109
        L106:
            int r2 = r2 + 1
            goto Le5
        L109:
            r1 = 1
        L10a:
            if (r1 == 0) goto L10d
            goto L10e
        L10d:
            r4 = r9
        L10e:
            return r4
    }

    /* renamed from: z */
    public static final java.lang.String m6136z(p101fh.InterfaceC2172d<?> r3) {
            boolean r0 = r3 instanceof p459zh.C7339e
            if (r0 == 0) goto L9
            java.lang.String r3 = r3.toString()
            goto L4f
        L9:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            r1.append(r3)     // Catch: java.lang.Throwable -> L22
            r1.append(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = m6121k(r3)     // Catch: java.lang.Throwable -> L22
            r1.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L22
            goto L27
        L22:
            r1 = move-exception
            java.lang.Object r1 = p074e9.C1805a.m4520e(r1)
        L27:
            java.lang.Throwable r2 = ch.C0979f.m2690b(r1)
            if (r2 != 0) goto L2e
            goto L4c
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = m6121k(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L4c:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L4f:
            return r3
    }
}
