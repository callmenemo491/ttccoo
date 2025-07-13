package p397wg;

/* renamed from: wg.a */
/* loaded from: classes.dex */
public final class C6880a extends p418xg.C7071b {

    /* renamed from: wg.a$a */
    public static final class a<T> implements p105g2.C2222p.b {

        /* renamed from: a */
        public final /* synthetic */ p418xg.C7071b f26682a;

        /* renamed from: b */
        public final /* synthetic */ java.lang.String f26683b;

        /* renamed from: c */
        public final /* synthetic */ p101fh.InterfaceC2172d f26684c;

        public a(p418xg.C7071b r1, java.lang.String r2, p101fh.InterfaceC2172d r3) {
                r0 = this;
                r0.f26682a = r1
                r0.f26683b = r2
                r0.f26684c = r3
                r0.<init>()
                return
        }

        @Override // p105g2.C2222p.b
        /* renamed from: a */
        public void mo117a(java.lang.Object r6) {
                r5 = this;
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r0 = "CallGetTableRows"
                hk.a$b r1 = hk.C3053a.m7466a(r0)
                xg.b r2 = r5.f26682a
                java.lang.String r2 = r2.m14179c()
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r1.mo7467a(r2, r4)
                hk.a$b r1 = hk.C3053a.m7466a(r0)
                java.lang.String r2 = "requestBody: "
                java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
                java.lang.String r4 = r5.f26683b
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r1.mo7467a(r2, r4)
                hk.a$b r0 = hk.C3053a.m7466a(r0)
                java.lang.String r1 = "response: "
                java.lang.String r1 = p064e.C1493g.m4049a(r1, r6)
                java.lang.Object[] r2 = new java.lang.Object[r3]
                r0.mo7467a(r1, r2)
                fh.d r0 = r5.f26684c
                xg.b r1 = r5.f26682a
                jb.j r2 = r1.f27393b
                java.lang.String r3 = "response"
                p214m2.C4339q.m9705j(r6, r3)
                java.lang.Class<od.d0> r3 = p255od.C5198d0.class
                md.j r6 = p418xg.C7071b.m14178b(r1, r2, r6, r3)
                r0.mo5707k(r6)
                return
        }
    }

    /* renamed from: wg.a$b */
    public static final class b extends p119h2.C2448j {

        /* renamed from: p0 */
        public final /* synthetic */ java.lang.String f26685p0;

        public b(java.lang.String r1, java.lang.String r2, p397wg.C6880a.a r3, p418xg.C7070a r4) {
                r0 = this;
                r0.f26685p0 = r1
                r1 = 1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // p105g2.AbstractC2220n
        /* renamed from: l */
        public byte[] mo116l() {
                r2 = this;
                java.lang.String r0 = r2.f26685p0
                java.lang.String r1 = "requestBody"
                p214m2.C4339q.m9705j(r0, r1)
                java.nio.charset.Charset r1 = p362uh.C6455a.f25034b
                byte[] r0 = r0.getBytes(r1)
                java.lang.String r1 = "this as java.lang.String).getBytes(charset)"
                p214m2.C4339q.m9705j(r0, r1)
                return r0
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "io.tacocrypto.app.utils.chain.EosManagerService", m7452f = "EosManagerService.kt", m7453l = {36}, m7454m = "getSwapTacoPairs")
    /* renamed from: wg.a$c */
    public static final class c extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f26686b0;

        /* renamed from: c0 */
        public java.lang.Object f26687c0;

        /* renamed from: d0 */
        public java.lang.Object f26688d0;

        /* renamed from: e0 */
        public java.lang.Object f26689e0;

        /* renamed from: f0 */
        public java.lang.Object f26690f0;

        /* renamed from: g0 */
        public java.lang.Object f26691g0;

        /* renamed from: h0 */
        public java.lang.Object f26692h0;

        /* renamed from: i0 */
        public int f26693i0;

        /* renamed from: j0 */
        public /* synthetic */ java.lang.Object f26694j0;

        /* renamed from: k0 */
        public final /* synthetic */ p397wg.C6880a f26695k0;

        /* renamed from: l0 */
        public int f26696l0;

        public c(p397wg.C6880a r1, p101fh.InterfaceC2172d<? super p397wg.C6880a.c> r2) {
                r0 = this;
                r0.f26695k0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f26694j0 = r2
                int r2 = r1.f26696l0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f26696l0 = r2
                wg.a r2 = r1.f26695k0
                r0 = 0
                java.lang.Object r2 = r2.m13927d(r0, r1)
                return r2
        }
    }

    public C6880a(p105g2.C2221o r3) {
            r2 = this;
            java.lang.String r0 = "queue"
            p214m2.C4339q.m9706k(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1)
            return
    }

    /* renamed from: d */
    public final java.lang.Object m13927d(java.lang.String r28, p101fh.InterfaceC2172d<? super java.util.List<p255od.C5198d0>> r29) {
            r27 = this;
            r0 = r29
            gh.a r1 = gh.EnumC2389a.f10764Y
            boolean r2 = r0 instanceof p397wg.C6880a.c
            if (r2 == 0) goto L19
            r2 = r0
            wg.a$c r2 = (p397wg.C6880a.c) r2
            int r3 = r2.f26696l0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f26696l0 = r3
            r3 = r27
            goto L20
        L19:
            wg.a$c r2 = new wg.a$c
            r3 = r27
            r2.<init>(r3, r0)
        L20:
            java.lang.Object r0 = r2.f26694j0
            int r4 = r2.f26696l0
            java.lang.String r5 = ""
            java.lang.String r6 = "swap.taco"
            r7 = 1
            if (r4 == 0) goto L60
            if (r4 != r7) goto L58
            int r4 = r2.f26693i0
            java.lang.Object r6 = r2.f26692h0
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r2.f26691g0
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r8 = r2.f26690f0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f26689e0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f26688d0
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r2.f26687c0
            xg.b r11 = (p418xg.C7071b) r11
            java.lang.Object r12 = r2.f26686b0
            java.lang.String r12 = (java.lang.String) r12
            p074e9.C1805a.m4540y(r0)
            r7 = r6
            r14 = r9
            r15 = r10
            r13 = 1
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            goto Lff
        L58:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L60:
            p074e9.C1805a.m4540y(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r8 = "pairs"
            r13 = r0
            r4 = r2
            r11 = r3
            r10 = r5
            r14 = r6
            r15 = r14
            r12 = r8
            r0 = r28
            r2 = r1
            r6 = r10
            r5 = 10000(0x2710, float:1.4013E-41)
        L79:
            r16 = 0
            r17 = 0
            r4.f26686b0 = r0
            r4.f26687c0 = r11
            r4.f26688d0 = r15
            r4.f26689e0 = r14
            r4.f26690f0 = r12
            r4.f26691g0 = r13
            r4.f26692h0 = r10
            r4.f26693i0 = r5
            r4.f26696l0 = r7
            fh.j r9 = new fh.j
            fh.d r8 = gh.C2390b.m6127q(r4)
            r9.<init>(r8)
            yg.a r8 = new yg.a
            r18 = 0
            r19 = 0
            r20 = 8
            r21 = 0
            r28 = r8
            r7 = r9
            r9 = r15
            r22 = r10
            r10 = r12
            r23 = r11
            r11 = r14
            r24 = r12
            r12 = r18
            r25 = r13
            r13 = r5
            r26 = r14
            r14 = r22
            r22 = r15
            r15 = r16
            r16 = r17
            r17 = r19
            r18 = r20
            r19 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8 = r23
            jb.j r9 = r8.f27393b
            r10 = r28
            java.lang.String r9 = r9.m7935i(r10)
            java.lang.String r10 = r8.m14179c()
            wg.a$a r11 = new wg.a$a
            r11.<init>(r8, r9, r7)
            xg.a r12 = new xg.a
            r13 = 1
            r12.<init>(r9, r7, r13)
            wg.a$b r14 = new wg.a$b
            r14.<init>(r9, r10, r11, r12)
            if (r0 == 0) goto Le8
            r14.f10153l0 = r0
        Le8:
            g2.o r9 = r8.f27392a
            r9.m5814a(r14)
            java.lang.Object r7 = r7.m5741a()
            if (r7 != r1) goto Lf4
            return r1
        Lf4:
            r12 = r0
            r0 = r7
            r11 = r8
            r15 = r22
            r8 = r24
            r7 = r25
            r14 = r26
        Lff:
            md.j r0 = (md.C4559j) r0
            java.util.List r9 = r0.getRows()
            r7.addAll(r9)
            java.lang.String r0 = r0.getNext_key()
            if (r0 != 0) goto L110
            r10 = r6
            goto L111
        L110:
            r10 = r0
        L111:
            int r0 = r10.length()
            if (r0 <= 0) goto L119
            r0 = 1
            goto L11a
        L119:
            r0 = 0
        L11a:
            if (r0 != 0) goto L11d
            return r7
        L11d:
            r13 = r7
            r0 = r12
            r7 = 1
            r12 = r8
            goto L79
    }
}
