package p379vh;

/* renamed from: vh.g1 */
/* loaded from: classes.dex */
public class C6702g1 implements p379vh.InterfaceC6687b1, p379vh.InterfaceC6724o, p379vh.InterfaceC6726o1 {

    /* renamed from: Y */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f25974Y = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle;
    private volatile /* synthetic */ java.lang.Object _state;

    /* renamed from: vh.g1$a */
    public static final class a<T> extends p379vh.C6706i<T> {

        /* renamed from: g0 */
        public final p379vh.C6702g1 f25975g0;

        public a(p101fh.InterfaceC2172d<? super T> r2, p379vh.C6702g1 r3) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                r1.f25975g0 = r3
                return
        }

        @Override // p379vh.C6706i
        /* renamed from: C */
        public java.lang.String mo13598C() {
                r1 = this;
                java.lang.String r0 = "AwaitContinuation"
                return r0
        }

        @Override // p379vh.C6706i
        /* renamed from: v */
        public java.lang.Throwable mo13599v(p379vh.InterfaceC6687b1 r3) {
                r2 = this;
                vh.g1 r0 = r2.f25975g0
                java.lang.Object r0 = r0.m13573C()
                boolean r1 = r0 instanceof p379vh.C6702g1.c
                if (r1 == 0) goto L15
                r1 = r0
                vh.g1$c r1 = (p379vh.C6702g1.c) r1
                java.lang.Throwable r1 = r1.m13602e()
                if (r1 != 0) goto L14
                goto L15
            L14:
                return r1
            L15:
                boolean r1 = r0 instanceof p379vh.C6739t
                if (r1 == 0) goto L1e
                vh.t r0 = (p379vh.C6739t) r0
                java.lang.Throwable r3 = r0.f26037a
                return r3
            L1e:
                vh.g1 r3 = (p379vh.C6702g1) r3
                java.util.concurrent.CancellationException r3 = r3.mo13551S()
                return r3
        }
    }

    /* renamed from: vh.g1$b */
    public static final class b extends p379vh.AbstractC6699f1 {

        /* renamed from: c0 */
        public final p379vh.C6702g1 f25976c0;

        /* renamed from: d0 */
        public final p379vh.C6702g1.c f25977d0;

        /* renamed from: e0 */
        public final p379vh.C6721n f25978e0;

        /* renamed from: f0 */
        public final java.lang.Object f25979f0;

        public b(p379vh.C6702g1 r1, p379vh.C6702g1.c r2, p379vh.C6721n r3, java.lang.Object r4) {
                r0 = this;
                r0.<init>()
                r0.f25976c0 = r1
                r0.f25977d0 = r2
                r0.f25978e0 = r3
                r0.f25979f0 = r4
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public /* bridge */ /* synthetic */ ch.C0985l mo107b(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.mo13549q(r1)
                ch.l r1 = ch.C0985l.f5061a
                return r1
        }

        @Override // p379vh.AbstractC6745v
        /* renamed from: q */
        public void mo13549q(java.lang.Throwable r5) {
                r4 = this;
                vh.g1 r5 = r4.f25976c0
                vh.g1$c r0 = r4.f25977d0
                vh.n r1 = r4.f25978e0
                java.lang.Object r2 = r4.f25979f0
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p379vh.C6702g1.f25974Y
                vh.n r1 = r5.m13578J(r1)
                if (r1 == 0) goto L17
                boolean r1 = r5.m13587X(r0, r1, r2)
                if (r1 == 0) goto L17
                goto L1e
            L17:
                java.lang.Object r0 = r5.m13596w(r0, r2)
                r5.mo13589e(r0)
            L1e:
                return
        }
    }

    /* renamed from: vh.g1$c */
    public static final class c implements p379vh.InterfaceC6752x0 {

        /* renamed from: Y */
        public final p379vh.C6717l1 f25980Y;
        private volatile /* synthetic */ java.lang.Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ java.lang.Object _rootCause;

        public c(p379vh.C6717l1 r1, boolean r2, java.lang.Throwable r3) {
                r0 = this;
                r0.<init>()
                r0.f25980Y = r1
                r0._isCompleting = r2
                r0._rootCause = r3
                r1 = 0
                r0._exceptionsHolder = r1
                return
        }

        @Override // p379vh.InterfaceC6752x0
        /* renamed from: a */
        public boolean mo13568a() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        /* renamed from: b */
        public final void m13600b(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 != 0) goto L9
                r2._rootCause = r3
                return
            L9:
                if (r3 != r0) goto Lc
                return
            Lc:
                java.lang.Object r0 = r2._exceptionsHolder
                if (r0 != 0) goto L13
                r2._exceptionsHolder = r3
                goto L30
            L13:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L27
                if (r3 != r0) goto L1a
                return
            L1a:
                java.util.ArrayList r1 = r2.m13601d()
                r1.add(r0)
                r1.add(r3)
                r2._exceptionsHolder = r1
                goto L30
            L27:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L31
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                r0.add(r3)
            L30:
                return
            L31:
                java.lang.String r3 = "State is "
                java.lang.String r3 = p214m2.C4339q.m9711u(r3, r0)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r3 = r3.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // p379vh.InterfaceC6752x0
        /* renamed from: c */
        public p379vh.C6717l1 mo13569c() {
                r1 = this;
                vh.l1 r0 = r1.f25980Y
                return r0
        }

        /* renamed from: d */
        public final java.util.ArrayList<java.lang.Throwable> m13601d() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 4
                r0.<init>(r1)
                return r0
        }

        /* renamed from: e */
        public final java.lang.Throwable m13602e() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                return r0
        }

        /* renamed from: f */
        public final boolean m13603f() {
                r1 = this;
                java.lang.Object r0 = r1._rootCause
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        /* renamed from: g */
        public final boolean m13604g() {
                r1 = this;
                int r0 = r1._isCompleting
                return r0
        }

        /* renamed from: h */
        public final boolean m13605h() {
                r2 = this;
                java.lang.Object r0 = r2._exceptionsHolder
                zh.p r1 = p379vh.C6705h1.f25992e
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        /* renamed from: i */
        public final java.util.List<java.lang.Throwable> m13606i(java.lang.Throwable r4) {
                r3 = this;
                java.lang.Object r0 = r3._exceptionsHolder
                if (r0 != 0) goto L9
                java.util.ArrayList r0 = r3.m13601d()
                goto L1c
            L9:
                boolean r1 = r0 instanceof java.lang.Throwable
                if (r1 == 0) goto L16
                java.util.ArrayList r1 = r3.m13601d()
                r1.add(r0)
                r0 = r1
                goto L1c
            L16:
                boolean r1 = r0 instanceof java.util.ArrayList
                if (r1 == 0) goto L37
                java.util.ArrayList r0 = (java.util.ArrayList) r0
            L1c:
                java.lang.Object r1 = r3._rootCause
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 != 0) goto L23
                goto L27
            L23:
                r2 = 0
                r0.add(r2, r1)
            L27:
                if (r4 == 0) goto L32
                boolean r1 = p214m2.C4339q.m9702c(r4, r1)
                if (r1 != 0) goto L32
                r0.add(r4)
            L32:
                zh.p r4 = p379vh.C6705h1.f25992e
                r3._exceptionsHolder = r4
                return r0
            L37:
                java.lang.String r4 = "State is "
                java.lang.String r4 = p214m2.C4339q.m9711u(r4, r0)
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        /* renamed from: j */
        public final void m13607j(boolean r1) {
                r0 = this;
                r0._isCompleting = r1
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "Finishing[cancelling="
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                boolean r1 = r2.m13603f()
                r0.append(r1)
                java.lang.String r1 = ", completing="
                r0.append(r1)
                int r1 = r2._isCompleting
                r0.append(r1)
                java.lang.String r1 = ", rootCause="
                r0.append(r1)
                java.lang.Object r1 = r2._rootCause
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.append(r1)
                java.lang.String r1 = ", exceptions="
                r0.append(r1)
                java.lang.Object r1 = r2._exceptionsHolder
                r0.append(r1)
                java.lang.String r1 = ", list="
                r0.append(r1)
                vh.l1 r1 = r2.f25980Y
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: vh.g1$d */
    public static final class d extends p459zh.C7343i.a {

        /* renamed from: d */
        public final /* synthetic */ p379vh.C6702g1 f25981d;

        /* renamed from: e */
        public final /* synthetic */ java.lang.Object f25982e;

        public d(p459zh.C7343i r1, p379vh.C6702g1 r2, java.lang.Object r3) {
                r0 = this;
                r0.f25981d = r2
                r0.f25982e = r3
                r0.<init>(r1)
                return
        }

        @Override // p459zh.AbstractC7336b
        /* renamed from: c */
        public java.lang.Object mo13608c(p459zh.C7343i r2) {
                r1 = this;
                zh.i r2 = (p459zh.C7343i) r2
                vh.g1 r2 = r1.f25981d
                java.lang.Object r2 = r2.m13573C()
                java.lang.Object r0 = r1.f25982e
                if (r2 != r0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                if (r2 == 0) goto L13
                r2 = 0
                goto L15
            L13:
                java.lang.Object r2 = p459zh.C7342h.f28091a
            L15:
                return r2
        }
    }

    @p134hh.InterfaceC3044e(m7451c = "kotlinx.coroutines.JobSupport$children$1", m7452f = "JobSupport.kt", m7453l = {952, 954}, m7454m = "invokeSuspend")
    /* renamed from: vh.g1$e */
    public static final class e extends p134hh.AbstractC3047h implements mh.InterfaceC4624p<th.AbstractC6248f<? super p379vh.InterfaceC6724o>, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

        /* renamed from: a0 */
        public java.lang.Object f25983a0;

        /* renamed from: b0 */
        public java.lang.Object f25984b0;

        /* renamed from: c0 */
        public int f25985c0;

        /* renamed from: d0 */
        public /* synthetic */ java.lang.Object f25986d0;

        /* renamed from: e0 */
        public final /* synthetic */ p379vh.C6702g1 f25987e0;

        public e(p379vh.C6702g1 r1, p101fh.InterfaceC2172d<? super p379vh.C6702g1.e> r2) {
                r0 = this;
                r0.f25987e0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: h */
        public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r3, p101fh.InterfaceC2172d<?> r4) {
                r2 = this;
                vh.g1$e r0 = new vh.g1$e
                vh.g1 r1 = r2.f25987e0
                r0.<init>(r1, r4)
                r0.f25986d0 = r3
                return r0
        }

        @Override // mh.InterfaceC4624p
        /* renamed from: l */
        public java.lang.Object mo122l(th.AbstractC6248f<? super p379vh.InterfaceC6724o> r3, p101fh.InterfaceC2172d<? super ch.C0985l> r4) {
                r2 = this;
                th.f r3 = (th.AbstractC6248f) r3
                fh.d r4 = (p101fh.InterfaceC2172d) r4
                vh.g1$e r0 = new vh.g1$e
                vh.g1 r1 = r2.f25987e0
                r0.<init>(r1, r4)
                r0.f25986d0 = r3
                ch.l r3 = ch.C0985l.f5061a
                java.lang.Object r3 = r0.mo123o(r3)
                return r3
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r8) {
                r7 = this;
                gh.a r0 = gh.EnumC2389a.f10764Y
                int r1 = r7.f25985c0
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L29
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r7.f25984b0
                zh.i r1 = (p459zh.C7343i) r1
                java.lang.Object r3 = r7.f25983a0
                zh.g r3 = (p459zh.C7341g) r3
                java.lang.Object r4 = r7.f25986d0
                th.f r4 = (th.AbstractC6248f) r4
                p074e9.C1805a.m4540y(r8)
                r8 = r7
                goto L7d
            L1d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L25:
                p074e9.C1805a.m4540y(r8)
                goto L82
            L29:
                p074e9.C1805a.m4540y(r8)
                java.lang.Object r8 = r7.f25986d0
                th.f r8 = (th.AbstractC6248f) r8
                vh.g1 r1 = r7.f25987e0
                java.lang.Object r1 = r1.m13573C()
                boolean r4 = r1 instanceof p379vh.C6721n
                if (r4 == 0) goto L47
                vh.n r1 = (p379vh.C6721n) r1
                vh.o r1 = r1.f26010c0
                r7.f25985c0 = r3
                java.lang.Object r8 = r8.mo12829a(r1, r7)
                if (r8 != r0) goto L82
                return r0
            L47:
                boolean r3 = r1 instanceof p379vh.InterfaceC6752x0
                if (r3 == 0) goto L82
                vh.x0 r1 = (p379vh.InterfaceC6752x0) r1
                vh.l1 r1 = r1.mo13569c()
                if (r1 != 0) goto L54
                goto L82
            L54:
                java.lang.Object r3 = r1.m14422j()
                zh.i r3 = (p459zh.C7343i) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L5f:
                boolean r5 = p214m2.C4339q.m9702c(r1, r3)
                if (r5 != 0) goto L82
                boolean r5 = r1 instanceof p379vh.C6721n
                if (r5 == 0) goto L7d
                r5 = r1
                vh.n r5 = (p379vh.C6721n) r5
                vh.o r5 = r5.f26010c0
                r8.f25986d0 = r4
                r8.f25983a0 = r3
                r8.f25984b0 = r1
                r8.f25985c0 = r2
                java.lang.Object r5 = r4.mo12829a(r5, r8)
                if (r5 != r0) goto L7d
                return r0
            L7d:
                zh.i r1 = r1.m14423m()
                goto L5f
            L82:
                ch.l r8 = ch.C0985l.f5061a
                return r8
        }
    }

    static {
            java.lang.Class<vh.g1> r0 = p379vh.C6702g1.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p379vh.C6702g1.f25974Y = r0
            return
    }

    public C6702g1(boolean r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            vh.n0 r1 = p379vh.C6705h1.f25994g
            goto La
        L8:
            vh.n0 r1 = p379vh.C6705h1.f25993f
        La:
            r0._state = r1
            r1 = 0
            r0._parentHandle = r1
            return
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: A */
    public final th.InterfaceC6246d<p379vh.InterfaceC6687b1> mo13550A() {
            r2 = this;
            vh.g1$e r0 = new vh.g1$e
            r1 = 0
            r0.<init>(r2, r1)
            th.h r1 = new th.h
            r1.<init>(r0)
            return r1
    }

    /* renamed from: B */
    public final p379vh.InterfaceC6718m m13572B() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            vh.m r0 = (p379vh.InterfaceC6718m) r0
            return r0
    }

    /* renamed from: C */
    public final java.lang.Object m13573C() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._state
            boolean r1 = r0 instanceof p459zh.AbstractC7347m
            if (r1 != 0) goto L7
            return r0
        L7:
            zh.m r0 = (p459zh.AbstractC7347m) r0
            r0.mo14411a(r2)
            goto L0
    }

    /* renamed from: D */
    public boolean mo13574D(java.lang.Throwable r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: E */
    public void mo13540E(java.lang.Throwable r1) {
            r0 = this;
            throw r1
    }

    /* renamed from: F */
    public final void m13575F(p379vh.InterfaceC6687b1 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            vh.m1 r2 = p379vh.C6720m1.f26009Y
            r1._parentHandle = r2
            return
        L7:
            r2.start()
            vh.m r2 = r2.mo13552Z(r1)
            r1._parentHandle = r2
            java.lang.Object r0 = r1.m13573C()
            boolean r0 = r0 instanceof p379vh.InterfaceC6752x0
            r0 = r0 ^ 1
            if (r0 == 0) goto L21
            r2.mo13570h()
            vh.m1 r2 = p379vh.C6720m1.f26009Y
            r1._parentHandle = r2
        L21:
            return
    }

    /* renamed from: G */
    public boolean mo13576G() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: H */
    public final java.lang.Object m13577H(java.lang.Object r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.m13573C()
            java.lang.Object r0 = r4.m13586W(r0, r5)
            zh.p r1 = p379vh.C6705h1.f25988a
            if (r0 != r1) goto L39
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Job "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " is already complete or completing, but is being completed with "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            boolean r2 = r5 instanceof p379vh.C6739t
            r3 = 0
            if (r2 == 0) goto L2f
            vh.t r5 = (p379vh.C6739t) r5
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 != 0) goto L33
            goto L35
        L33:
            java.lang.Throwable r3 = r5.f26037a
        L35:
            r0.<init>(r1, r3)
            throw r0
        L39:
            zh.p r1 = p379vh.C6705h1.f25990c
            if (r0 != r1) goto L3e
            goto L0
        L3e:
            return r0
    }

    /* renamed from: I */
    public java.lang.String mo13541I() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            return r0
    }

    /* renamed from: J */
    public final p379vh.C6721n m13578J(p459zh.C7343i r2) {
            r1 = this;
        L0:
            boolean r0 = r2.mo14419o()
            if (r0 == 0) goto Lb
            zh.i r2 = r2.m14424n()
            goto L0
        Lb:
            zh.i r2 = r2.m14423m()
            boolean r0 = r2.mo14419o()
            if (r0 == 0) goto L16
            goto Lb
        L16:
            boolean r0 = r2 instanceof p379vh.C6721n
            if (r0 == 0) goto L1d
            vh.n r2 = (p379vh.C6721n) r2
            return r2
        L1d:
            boolean r0 = r2 instanceof p379vh.C6717l1
            if (r0 == 0) goto Lb
            r2 = 0
            return r2
    }

    /* renamed from: K */
    public final void m13579K(p379vh.C6717l1 r8, java.lang.Throwable r9) {
            r7 = this;
            java.lang.Object r0 = r8.m14422j()
            zh.i r0 = (p459zh.C7343i) r0
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = p214m2.C4339q.m9702c(r0, r8)
            if (r3 != 0) goto L47
            boolean r3 = r0 instanceof p379vh.AbstractC6693d1
            if (r3 == 0) goto L42
            r3 = r0
            vh.f1 r3 = (p379vh.AbstractC6699f1) r3
            r3.mo13549q(r9)     // Catch: java.lang.Throwable -> L19
            goto L42
        L19:
            r4 = move-exception
            if (r2 != 0) goto L1e
            r5 = r1
            goto L22
        L1e:
            p185k7.C3836i.m8616a(r2, r4)
            r5 = r2
        L22:
            if (r5 != 0) goto L42
            vh.w r2 = new vh.w
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Exception in completion handler "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " for "
            r5.append(r3)
            r5.append(r7)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3, r4)
        L42:
            zh.i r0 = r0.m14423m()
            goto L8
        L47:
            if (r2 != 0) goto L4a
            goto L4d
        L4a:
            r7.mo13540E(r2)
        L4d:
            r7.m13592o(r9)
            return
    }

    /* renamed from: M */
    public void mo13542M(java.lang.Object r1) {
            r0 = this;
            return
    }

    /* renamed from: N */
    public void mo13580N() {
            r0 = this;
            return
    }

    /* renamed from: O */
    public final void m13581O(p379vh.AbstractC6699f1 r3) {
            r2 = this;
            vh.l1 r0 = new vh.l1
            r0.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28093Z
            r1.lazySet(r0, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28092Y
            r1.lazySet(r0, r3)
        Lf:
            java.lang.Object r1 = r3.m14422j()
            if (r1 == r3) goto L16
            goto L21
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28092Y
            boolean r1 = r1.compareAndSet(r3, r3, r0)
            if (r1 == 0) goto Lf
            r0.m14421f(r3)
        L21:
            zh.i r0 = r3.m14423m()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p379vh.C6702g1.f25974Y
            r1.compareAndSet(r2, r3, r0)
            return
    }

    /* renamed from: P */
    public final int m13582P(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof p379vh.C6722n0
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L1e
            r0 = r5
            vh.n0 r0 = (p379vh.C6722n0) r0
            boolean r0 = r0.f26011Y
            if (r0 == 0) goto Lf
            return r3
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p379vh.C6702g1.f25974Y
            vh.n0 r3 = p379vh.C6705h1.f25994g
            boolean r5 = r0.compareAndSet(r4, r5, r3)
            if (r5 != 0) goto L1a
            return r1
        L1a:
            r4.mo13580N()
            return r2
        L1e:
            boolean r0 = r5 instanceof p379vh.C6749w0
            if (r0 == 0) goto L34
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p379vh.C6702g1.f25974Y
            r3 = r5
            vh.w0 r3 = (p379vh.C6749w0) r3
            vh.l1 r3 = r3.f26046Y
            boolean r5 = r0.compareAndSet(r4, r5, r3)
            if (r5 != 0) goto L30
            return r1
        L30:
            r4.mo13580N()
            return r2
        L34:
            return r3
    }

    @Override // p379vh.InterfaceC6726o1
    /* renamed from: R */
    public java.util.concurrent.CancellationException mo13583R() {
            r4 = this;
            java.lang.Object r0 = r4.m13573C()
            boolean r1 = r0 instanceof p379vh.C6702g1.c
            r2 = 0
            if (r1 == 0) goto L11
            r1 = r0
            vh.g1$c r1 = (p379vh.C6702g1.c) r1
            java.lang.Throwable r1 = r1.m13602e()
            goto L20
        L11:
            boolean r1 = r0 instanceof p379vh.C6739t
            if (r1 == 0) goto L1b
            r1 = r0
            vh.t r1 = (p379vh.C6739t) r1
            java.lang.Throwable r1 = r1.f26037a
            goto L20
        L1b:
            boolean r1 = r0 instanceof p379vh.InterfaceC6752x0
            if (r1 != 0) goto L39
            r1 = r2
        L20:
            boolean r3 = r1 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L27
            r2 = r1
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L27:
            if (r2 != 0) goto L38
            vh.c1 r2 = new vh.c1
            java.lang.String r0 = r4.m13584T(r0)
            java.lang.String r3 = "Parent job is "
            java.lang.String r0 = p214m2.C4339q.m9711u(r3, r0)
            r2.<init>(r0, r1, r4)
        L38:
            return r2
        L39:
            java.lang.String r1 = "Cannot be cancelling child in this state: "
            java.lang.String r0 = p214m2.C4339q.m9711u(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: S */
    public final java.util.concurrent.CancellationException mo13551S() {
            r4 = this;
            java.lang.Object r0 = r4.m13573C()
            boolean r1 = r0 instanceof p379vh.C6702g1.c
            java.lang.String r2 = "Job is still new or active: "
            if (r1 == 0) goto L33
            vh.g1$c r0 = (p379vh.C6702g1.c) r0
            java.lang.Throwable r0 = r0.m13602e()
            if (r0 == 0) goto L25
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r2 = " is cancelling"
            java.lang.String r1 = p214m2.C4339q.m9711u(r1, r2)
            java.util.concurrent.CancellationException r0 = r4.m13585U(r0, r1)
            goto L58
        L25:
            java.lang.String r0 = p214m2.C4339q.m9711u(r2, r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L33:
            boolean r1 = r0 instanceof p379vh.InterfaceC6752x0
            if (r1 != 0) goto L59
            boolean r1 = r0 instanceof p379vh.C6739t
            r2 = 0
            if (r1 == 0) goto L45
            vh.t r0 = (p379vh.C6739t) r0
            java.lang.Throwable r0 = r0.f26037a
            java.util.concurrent.CancellationException r0 = r4.m13585U(r0, r2)
            goto L58
        L45:
            vh.c1 r0 = new vh.c1
            java.lang.Class r1 = r4.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = " has completed normally"
            java.lang.String r1 = p214m2.C4339q.m9711u(r1, r3)
            r0.<init>(r1, r2, r4)
        L58:
            return r0
        L59:
            java.lang.String r0 = p214m2.C4339q.m9711u(r2, r4)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: T */
    public final java.lang.String m13584T(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p379vh.C6702g1.c
            java.lang.String r1 = "Active"
            if (r0 == 0) goto L1a
            vh.g1$c r3 = (p379vh.C6702g1.c) r3
            boolean r0 = r3.m13603f()
            if (r0 == 0) goto L11
            java.lang.String r1 = "Cancelling"
            goto L33
        L11:
            boolean r3 = r3.m13604g()
            if (r3 == 0) goto L33
            java.lang.String r1 = "Completing"
            goto L33
        L1a:
            boolean r0 = r3 instanceof p379vh.InterfaceC6752x0
            if (r0 == 0) goto L2a
            vh.x0 r3 = (p379vh.InterfaceC6752x0) r3
            boolean r3 = r3.mo13568a()
            if (r3 == 0) goto L27
            goto L33
        L27:
            java.lang.String r1 = "New"
            goto L33
        L2a:
            boolean r3 = r3 instanceof p379vh.C6739t
            if (r3 == 0) goto L31
            java.lang.String r1 = "Cancelled"
            goto L33
        L31:
            java.lang.String r1 = "Completed"
        L33:
            return r1
    }

    /* renamed from: U */
    public final java.util.concurrent.CancellationException m13585U(java.lang.Throwable r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L8
            r0 = r2
            java.util.concurrent.CancellationException r0 = (java.util.concurrent.CancellationException) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 != 0) goto L16
            vh.c1 r0 = new vh.c1
            if (r3 != 0) goto L13
            java.lang.String r3 = r1.mo13547s()
        L13:
            r0.<init>(r3, r2, r1)
        L16:
            return r0
    }

    /* renamed from: W */
    public final java.lang.Object m13586W(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r7 instanceof p379vh.InterfaceC6752x0
            if (r0 != 0) goto L7
            zh.p r7 = p379vh.C6705h1.f25988a
            return r7
        L7:
            boolean r0 = r7 instanceof p379vh.C6722n0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L11
            boolean r0 = r7 instanceof p379vh.AbstractC6699f1
            if (r0 == 0) goto L3f
        L11:
            boolean r0 = r7 instanceof p379vh.C6721n
            if (r0 != 0) goto L3f
            boolean r0 = r8 instanceof p379vh.C6739t
            if (r0 != 0) goto L3f
            vh.x0 r7 = (p379vh.InterfaceC6752x0) r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p379vh.C6702g1.f25974Y
            boolean r3 = r8 instanceof p379vh.InterfaceC6752x0
            if (r3 == 0) goto L2a
            vh.y0 r3 = new vh.y0
            r4 = r8
            vh.x0 r4 = (p379vh.InterfaceC6752x0) r4
            r3.<init>(r4)
            goto L2b
        L2a:
            r3 = r8
        L2b:
            boolean r0 = r0.compareAndSet(r6, r7, r3)
            if (r0 != 0) goto L33
            r1 = 0
            goto L39
        L33:
            r6.mo13542M(r8)
            r6.m13594u(r7, r8)
        L39:
            if (r1 == 0) goto L3c
            return r8
        L3c:
            zh.p r7 = p379vh.C6705h1.f25990c
            return r7
        L3f:
            vh.x0 r7 = (p379vh.InterfaceC6752x0) r7
            vh.l1 r0 = r6.m13597z(r7)
            if (r0 != 0) goto L4b
            zh.p r7 = p379vh.C6705h1.f25990c
            goto Lc4
        L4b:
            boolean r3 = r7 instanceof p379vh.C6702g1.c
            r4 = 0
            if (r3 == 0) goto L54
            r3 = r7
            vh.g1$c r3 = (p379vh.C6702g1.c) r3
            goto L55
        L54:
            r3 = r4
        L55:
            if (r3 != 0) goto L5c
            vh.g1$c r3 = new vh.g1$c
            r3.<init>(r0, r2, r4)
        L5c:
            monitor-enter(r3)
            boolean r2 = r3.m13604g()     // Catch: java.lang.Throwable -> Lc5
            if (r2 == 0) goto L68
            zh.p r7 = p379vh.C6705h1.f25988a     // Catch: java.lang.Throwable -> Lc5
        L65:
            monitor-exit(r3)
            goto Lc4
        L68:
            r3.m13607j(r1)     // Catch: java.lang.Throwable -> Lc5
            if (r3 == r7) goto L78
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p379vh.C6702g1.f25974Y     // Catch: java.lang.Throwable -> Lc5
            boolean r2 = r2.compareAndSet(r6, r7, r3)     // Catch: java.lang.Throwable -> Lc5
            if (r2 != 0) goto L78
            zh.p r7 = p379vh.C6705h1.f25990c     // Catch: java.lang.Throwable -> Lc5
            goto L65
        L78:
            boolean r2 = r3.m13603f()     // Catch: java.lang.Throwable -> Lc5
            boolean r5 = r8 instanceof p379vh.C6739t     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto L84
            r5 = r8
            vh.t r5 = (p379vh.C6739t) r5     // Catch: java.lang.Throwable -> Lc5
            goto L85
        L84:
            r5 = r4
        L85:
            if (r5 != 0) goto L88
            goto L8d
        L88:
            java.lang.Throwable r5 = r5.f26037a     // Catch: java.lang.Throwable -> Lc5
            r3.m13600b(r5)     // Catch: java.lang.Throwable -> Lc5
        L8d:
            java.lang.Throwable r5 = r3.m13602e()     // Catch: java.lang.Throwable -> Lc5
            r1 = r1 ^ r2
            if (r1 == 0) goto L95
            goto L96
        L95:
            r5 = r4
        L96:
            monitor-exit(r3)
            if (r5 != 0) goto L9a
            goto L9d
        L9a:
            r6.m13579K(r0, r5)
        L9d:
            boolean r0 = r7 instanceof p379vh.C6721n
            if (r0 == 0) goto La5
            r0 = r7
            vh.n r0 = (p379vh.C6721n) r0
            goto La6
        La5:
            r0 = r4
        La6:
            if (r0 != 0) goto Lb4
            vh.l1 r7 = r7.mo13569c()
            if (r7 != 0) goto Laf
            goto Lb5
        Laf:
            vh.n r4 = r6.m13578J(r7)
            goto Lb5
        Lb4:
            r4 = r0
        Lb5:
            if (r4 == 0) goto Lc0
            boolean r7 = r6.m13587X(r3, r4, r8)
            if (r7 == 0) goto Lc0
            zh.p r7 = p379vh.C6705h1.f25989b
            goto Lc4
        Lc0:
            java.lang.Object r7 = r6.m13596w(r3, r8)
        Lc4:
            return r7
        Lc5:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
    }

    /* renamed from: X */
    public final boolean m13587X(p379vh.C6702g1.c r7, p379vh.C6721n r8, java.lang.Object r9) {
            r6 = this;
        L0:
            vh.o r0 = r8.f26010c0
            r1 = 0
            r2 = 0
            vh.g1$b r3 = new vh.g1$b
            r3.<init>(r6, r7, r8, r9)
            r4 = 1
            r5 = 0
            vh.m0 r0 = p379vh.InterfaceC6687b1.a.m13557b(r0, r1, r2, r3, r4, r5)
            vh.m1 r1 = p379vh.C6720m1.f26009Y
            if (r0 == r1) goto L15
            r7 = 1
            return r7
        L15:
            vh.n r8 = r6.m13578J(r8)
            if (r8 != 0) goto L0
            r7 = 0
            return r7
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: Z */
    public final p379vh.InterfaceC6718m mo13552Z(p379vh.InterfaceC6724o r7) {
            r6 = this;
            vh.n r3 = new vh.n
            r3.<init>(r7)
            r1 = 1
            r2 = 0
            r4 = 2
            r5 = 0
            r0 = r6
            vh.m0 r7 = p379vh.InterfaceC6687b1.a.m13557b(r0, r1, r2, r3, r4, r5)
            vh.m r7 = (p379vh.InterfaceC6718m) r7
            return r7
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: a */
    public boolean mo13544a() {
            r2 = this;
            java.lang.Object r0 = r2.m13573C()
            boolean r1 = r0 instanceof p379vh.InterfaceC6752x0
            if (r1 == 0) goto L12
            vh.x0 r0 = (p379vh.InterfaceC6752x0) r0
            boolean r0 = r0.mo13568a()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    /* renamed from: b */
    public final boolean m13588b(java.lang.Object r6, p379vh.C6717l1 r7, p379vh.AbstractC6699f1 r8) {
            r5 = this;
            vh.g1$d r0 = new vh.g1$d
            r0.<init>(r8, r5, r6)
        L5:
            zh.i r6 = r7.m14424n()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28093Z
            r1.lazySet(r8, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p459zh.C7343i.f28092Y
            r1.lazySet(r8, r7)
            r0.f28096c = r7
            boolean r1 = r1.compareAndSet(r6, r7, r0)
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 != 0) goto L20
            r6 = 0
            goto L29
        L20:
            java.lang.Object r6 = r0.mo14411a(r6)
            if (r6 != 0) goto L28
            r6 = 1
            goto L29
        L28:
            r6 = 2
        L29:
            if (r6 == r4) goto L2e
            if (r6 == r3) goto L2f
            goto L5
        L2e:
            r2 = 1
        L2f:
            return r2
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: d0 */
    public void mo13553d0(java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Ld
            r3 = 0
            vh.c1 r0 = new vh.c1
            java.lang.String r1 = r2.mo13547s()
            r0.<init>(r1, r3, r2)
            r3 = r0
        Ld:
            r2.m13591g(r3)
            return
    }

    /* renamed from: e */
    public void mo13589e(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // p379vh.InterfaceC6724o
    /* renamed from: f0 */
    public final void mo13590f0(p379vh.InterfaceC6726o1 r1) {
            r0 = this;
            r0.m13591g(r1)
            return
    }

    @Override // p101fh.InterfaceC2175g
    public <R> R fold(R r1, mh.InterfaceC4624p<? super R, ? super p101fh.InterfaceC2175g.a, ? extends R> r2) {
            r0 = this;
            java.lang.Object r1 = p101fh.InterfaceC2175g.a.C7391a.m5737a(r0, r1, r2)
            return r1
    }

    /* renamed from: g */
    public final boolean m13591g(java.lang.Object r10) {
            r9 = this;
            zh.p r0 = p379vh.C6705h1.f25988a
            boolean r1 = r9.mo13565y()
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L3a
        Lb:
            java.lang.Object r0 = r9.m13573C()
            boolean r1 = r0 instanceof p379vh.InterfaceC6752x0
            if (r1 == 0) goto L33
            boolean r1 = r0 instanceof p379vh.C6702g1.c
            if (r1 == 0) goto L21
            r1 = r0
            vh.g1$c r1 = (p379vh.C6702g1.c) r1
            boolean r1 = r1.m13604g()
            if (r1 == 0) goto L21
            goto L33
        L21:
            vh.t r1 = new vh.t
            java.lang.Throwable r5 = r9.m13595v(r10)
            r1.<init>(r5, r3, r2)
            java.lang.Object r0 = r9.m13586W(r0, r1)
            zh.p r1 = p379vh.C6705h1.f25990c
            if (r0 == r1) goto Lb
            goto L35
        L33:
            zh.p r0 = p379vh.C6705h1.f25988a
        L35:
            zh.p r1 = p379vh.C6705h1.f25989b
            if (r0 != r1) goto L3a
            return r4
        L3a:
            zh.p r1 = p379vh.C6705h1.f25988a
            if (r0 != r1) goto Le3
            r0 = 0
            r1 = r0
        L40:
            java.lang.Object r5 = r9.m13573C()
            boolean r6 = r5 instanceof p379vh.C6702g1.c
            if (r6 == 0) goto L89
            monitor-enter(r5)
            r2 = r5
            vh.g1$c r2 = (p379vh.C6702g1.c) r2     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.m13605h()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L57
            zh.p r10 = p379vh.C6705h1.f25991d     // Catch: java.lang.Throwable -> L86
            monitor-exit(r5)
            goto Le2
        L57:
            r2 = r5
            vh.g1$c r2 = (p379vh.C6702g1.c) r2     // Catch: java.lang.Throwable -> L86
            boolean r2 = r2.m13603f()     // Catch: java.lang.Throwable -> L86
            if (r10 != 0) goto L62
            if (r2 != 0) goto L6e
        L62:
            if (r1 != 0) goto L68
            java.lang.Throwable r1 = r9.m13595v(r10)     // Catch: java.lang.Throwable -> L86
        L68:
            r10 = r5
            vh.g1$c r10 = (p379vh.C6702g1.c) r10     // Catch: java.lang.Throwable -> L86
            r10.m13600b(r1)     // Catch: java.lang.Throwable -> L86
        L6e:
            r10 = r5
            vh.g1$c r10 = (p379vh.C6702g1.c) r10     // Catch: java.lang.Throwable -> L86
            java.lang.Throwable r10 = r10.m13602e()     // Catch: java.lang.Throwable -> L86
            r1 = r2 ^ 1
            if (r1 == 0) goto L7a
            r0 = r10
        L7a:
            monitor-exit(r5)
            if (r0 != 0) goto L7e
            goto Lb8
        L7e:
            vh.g1$c r5 = (p379vh.C6702g1.c) r5
            vh.l1 r10 = r5.f25980Y
            r9.m13579K(r10, r0)
            goto Lb8
        L86:
            r10 = move-exception
            monitor-exit(r5)
            throw r10
        L89:
            boolean r6 = r5 instanceof p379vh.InterfaceC6752x0
            if (r6 == 0) goto Le0
            if (r1 != 0) goto L93
            java.lang.Throwable r1 = r9.m13595v(r10)
        L93:
            r6 = r5
            vh.x0 r6 = (p379vh.InterfaceC6752x0) r6
            boolean r7 = r6.mo13568a()
            if (r7 == 0) goto Lbb
            vh.l1 r5 = r9.m13597z(r6)
            if (r5 != 0) goto La3
            goto Lb0
        La3:
            vh.g1$c r7 = new vh.g1$c
            r7.<init>(r5, r3, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = p379vh.C6702g1.f25974Y
            boolean r6 = r8.compareAndSet(r9, r6, r7)
            if (r6 != 0) goto Lb2
        Lb0:
            r5 = 0
            goto Lb6
        Lb2:
            r9.m13579K(r5, r1)
            r5 = 1
        Lb6:
            if (r5 == 0) goto L40
        Lb8:
            zh.p r10 = p379vh.C6705h1.f25988a
            goto Le2
        Lbb:
            vh.t r6 = new vh.t
            r6.<init>(r1, r3, r2)
            java.lang.Object r6 = r9.m13586W(r5, r6)
            zh.p r7 = p379vh.C6705h1.f25988a
            if (r6 == r7) goto Ld0
            zh.p r5 = p379vh.C6705h1.f25990c
            if (r6 != r5) goto Lce
            goto L40
        Lce:
            r0 = r6
            goto Le3
        Ld0:
            java.lang.String r10 = "Cannot happen in "
            java.lang.String r10 = p214m2.C4339q.m9711u(r10, r5)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r10 = r10.toString()
            r0.<init>(r10)
            throw r0
        Le0:
            zh.p r10 = p379vh.C6705h1.f25991d
        Le2:
            r0 = r10
        Le3:
            zh.p r10 = p379vh.C6705h1.f25988a
            if (r0 != r10) goto Le9
        Le7:
            r3 = 1
            goto Lf7
        Le9:
            zh.p r10 = p379vh.C6705h1.f25989b
            if (r0 != r10) goto Lee
            goto Le7
        Lee:
            zh.p r10 = p379vh.C6705h1.f25991d
            if (r0 != r10) goto Lf3
            goto Lf7
        Lf3:
            r9.mo13589e(r0)
            goto Le7
        Lf7:
            return r3
    }

    @Override // p101fh.InterfaceC2175g.a, p101fh.InterfaceC2175g
    public <E extends p101fh.InterfaceC2175g.a> E get(p101fh.InterfaceC2175g.b<E> r1) {
            r0 = this;
            fh.g$a r1 = p101fh.InterfaceC2175g.a.C7391a.m5738b(r0, r1)
            return r1
    }

    @Override // p101fh.InterfaceC2175g.a
    public final p101fh.InterfaceC2175g.b<?> getKey() {
            r1 = this;
            vh.b1$b r0 = p379vh.InterfaceC6687b1.b.f25958Y
            return r0
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: m0 */
    public final p379vh.InterfaceC6719m0 mo13554m0(boolean r8, boolean r9, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r10) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L14
            boolean r1 = r10 instanceof p379vh.AbstractC6693d1
            if (r1 == 0) goto Lb
            r1 = r10
            vh.d1 r1 = (p379vh.AbstractC6693d1) r1
            goto Lc
        Lb:
            r1 = r0
        Lc:
            if (r1 != 0) goto L27
            vh.z0 r1 = new vh.z0
            r1.<init>(r10)
            goto L27
        L14:
            boolean r1 = r10 instanceof p379vh.AbstractC6699f1
            if (r1 == 0) goto L1c
            r1 = r10
            vh.f1 r1 = (p379vh.AbstractC6699f1) r1
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 != 0) goto L20
            r1 = r0
        L20:
            if (r1 != 0) goto L27
            vh.a1 r1 = new vh.a1
            r1.<init>(r10)
        L27:
            r1.f25973b0 = r7
        L29:
            java.lang.Object r2 = r7.m13573C()
            boolean r3 = r2 instanceof p379vh.C6722n0
            if (r3 == 0) goto L57
            r3 = r2
            vh.n0 r3 = (p379vh.C6722n0) r3
            boolean r4 = r3.f26011Y
            if (r4 == 0) goto L41
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p379vh.C6702g1.f25974Y
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L29
            return r1
        L41:
            vh.l1 r2 = new vh.l1
            r2.<init>()
            boolean r4 = r3.f26011Y
            if (r4 == 0) goto L4b
            goto L51
        L4b:
            vh.w0 r4 = new vh.w0
            r4.<init>(r2)
            r2 = r4
        L51:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p379vh.C6702g1.f25974Y
            r4.compareAndSet(r7, r3, r2)
            goto L29
        L57:
            boolean r3 = r2 instanceof p379vh.InterfaceC6752x0
            if (r3 == 0) goto Lb0
            r3 = r2
            vh.x0 r3 = (p379vh.InterfaceC6752x0) r3
            vh.l1 r3 = r3.mo13569c()
            if (r3 != 0) goto L6f
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            java.util.Objects.requireNonNull(r2, r3)
            vh.f1 r2 = (p379vh.AbstractC6699f1) r2
            r7.m13581O(r2)
            goto L29
        L6f:
            vh.m1 r4 = p379vh.C6720m1.f26009Y
            if (r8 == 0) goto La0
            boolean r5 = r2 instanceof p379vh.C6702g1.c
            if (r5 == 0) goto La0
            monitor-enter(r2)
            r5 = r2
            vh.g1$c r5 = (p379vh.C6702g1.c) r5     // Catch: java.lang.Throwable -> L9d
            java.lang.Throwable r5 = r5.m13602e()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L8e
            boolean r6 = r10 instanceof p379vh.C6721n     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L9b
            r6 = r2
            vh.g1$c r6 = (p379vh.C6702g1.c) r6     // Catch: java.lang.Throwable -> L9d
            boolean r6 = r6.m13604g()     // Catch: java.lang.Throwable -> L9d
            if (r6 != 0) goto L9b
        L8e:
            boolean r4 = r7.m13588b(r2, r3, r1)     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L96
            monitor-exit(r2)
            goto L29
        L96:
            if (r5 != 0) goto L9a
            monitor-exit(r2)
            return r1
        L9a:
            r4 = r1
        L9b:
            monitor-exit(r2)
            goto La1
        L9d:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        La0:
            r5 = r0
        La1:
            if (r5 == 0) goto La9
            if (r9 == 0) goto La8
            r10.mo107b(r5)
        La8:
            return r4
        La9:
            boolean r2 = r7.m13588b(r2, r3, r1)
            if (r2 == 0) goto L29
            return r1
        Lb0:
            if (r9 == 0) goto Lc2
            boolean r8 = r2 instanceof p379vh.C6739t
            if (r8 == 0) goto Lb9
            vh.t r2 = (p379vh.C6739t) r2
            goto Lba
        Lb9:
            r2 = r0
        Lba:
            if (r2 != 0) goto Lbd
            goto Lbf
        Lbd:
            java.lang.Throwable r0 = r2.f26037a
        Lbf:
            r10.mo107b(r0)
        Lc2:
            vh.m1 r8 = p379vh.C6720m1.f26009Y
            return r8
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g minusKey(p101fh.InterfaceC2175g.b<?> r1) {
            r0 = this;
            fh.g r1 = p101fh.InterfaceC2175g.a.C7391a.m5739c(r0, r1)
            return r1
    }

    @Override // p379vh.InterfaceC6687b1
    /* renamed from: n */
    public final p379vh.InterfaceC6719m0 mo13555n(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            vh.m0 r3 = r2.mo13554m0(r0, r1, r3)
            return r3
    }

    /* renamed from: o */
    public final boolean m13592o(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.mo13576G()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            java.lang.Object r2 = r4._parentHandle
            vh.m r2 = (p379vh.InterfaceC6718m) r2
            if (r2 == 0) goto L20
            vh.m1 r3 = p379vh.C6720m1.f26009Y
            if (r2 != r3) goto L15
            goto L20
        L15:
            boolean r5 = r2.mo13642k(r5)
            if (r5 != 0) goto L1f
            if (r0 == 0) goto L1e
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
        L20:
            return r0
    }

    @Override // p101fh.InterfaceC2175g
    public p101fh.InterfaceC2175g plus(p101fh.InterfaceC2175g r1) {
            r0 = this;
            fh.g r1 = p101fh.InterfaceC2175g.a.C7391a.m5740d(r0, r1)
            return r1
    }

    /* renamed from: s */
    public java.lang.String mo13547s() {
            r1 = this;
            java.lang.String r0 = "Job was cancelled"
            return r0
    }

    @Override // p379vh.InterfaceC6687b1
    public final boolean start() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2.m13573C()
            int r0 = r2.m13582P(r0)
            if (r0 == 0) goto Lf
            r1 = 1
            if (r0 == r1) goto Le
            goto L0
        Le:
            return r1
        Lf:
            r0 = 0
            return r0
    }

    /* renamed from: t */
    public boolean mo13593t(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            boolean r3 = r2.m13591g(r3)
            if (r3 == 0) goto L13
            boolean r3 = r2.mo13564x()
            if (r3 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.mo13541I()
            r1.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r1.append(r2)
            java.lang.Object r2 = r3.m13573C()
            java.lang.String r2 = r3.m13584T(r2)
            r1.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = gh.C2390b.m6121k(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public final void m13594u(p379vh.InterfaceC6752x0 r9, java.lang.Object r10) {
            r8 = this;
            java.lang.Object r0 = r8._parentHandle
            vh.m r0 = (p379vh.InterfaceC6718m) r0
            if (r0 != 0) goto L7
            goto Le
        L7:
            r0.mo13570h()
            vh.m1 r0 = p379vh.C6720m1.f26009Y
            r8._parentHandle = r0
        Le:
            boolean r0 = r10 instanceof p379vh.C6739t
            r1 = 0
            if (r0 == 0) goto L16
            vh.t r10 = (p379vh.C6739t) r10
            goto L17
        L16:
            r10 = r1
        L17:
            if (r10 != 0) goto L1b
            r10 = r1
            goto L1d
        L1b:
            java.lang.Throwable r10 = r10.f26037a
        L1d:
            boolean r0 = r9 instanceof p379vh.AbstractC6699f1
            java.lang.String r2 = " for "
            java.lang.String r3 = "Exception in completion handler "
            if (r0 == 0) goto L4c
            r0 = r9
            vh.f1 r0 = (p379vh.AbstractC6699f1) r0     // Catch: java.lang.Throwable -> L2d
            r0.mo13549q(r10)     // Catch: java.lang.Throwable -> L2d
            goto L9b
        L2d:
            r10 = move-exception
            vh.w r0 = new vh.w
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r9)
            r1.append(r2)
            r1.append(r8)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r10)
            r8.mo13540E(r0)
            goto L9b
        L4c:
            vh.l1 r9 = r9.mo13569c()
            if (r9 != 0) goto L53
            goto L9b
        L53:
            java.lang.Object r0 = r9.m14422j()
            zh.i r0 = (p459zh.C7343i) r0
            r4 = r1
        L5a:
            boolean r5 = p214m2.C4339q.m9702c(r0, r9)
            if (r5 != 0) goto L95
            boolean r5 = r0 instanceof p379vh.AbstractC6699f1
            if (r5 == 0) goto L90
            r5 = r0
            vh.f1 r5 = (p379vh.AbstractC6699f1) r5
            r5.mo13549q(r10)     // Catch: java.lang.Throwable -> L6b
            goto L90
        L6b:
            r6 = move-exception
            if (r4 != 0) goto L70
            r7 = r1
            goto L74
        L70:
            p185k7.C3836i.m8616a(r4, r6)
            r7 = r4
        L74:
            if (r7 != 0) goto L90
            vh.w r4 = new vh.w
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r3)
            r7.append(r5)
            r7.append(r2)
            r7.append(r8)
            java.lang.String r5 = r7.toString()
            r4.<init>(r5, r6)
        L90:
            zh.i r0 = r0.m14423m()
            goto L5a
        L95:
            if (r4 != 0) goto L98
            goto L9b
        L98:
            r8.mo13540E(r4)
        L9b:
            return
    }

    /* renamed from: v */
    public final java.lang.Throwable m13595v(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r0 = 1
            goto L6
        L4:
            boolean r0 = r3 instanceof java.lang.Throwable
        L6:
            if (r0 == 0) goto L18
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 != 0) goto L23
            r3 = 0
            vh.c1 r0 = new vh.c1
            java.lang.String r1 = r2.mo13547s()
            r0.<init>(r1, r3, r2)
            r3 = r0
            goto L23
        L18:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.ParentJob"
            java.util.Objects.requireNonNull(r3, r0)
            vh.o1 r3 = (p379vh.InterfaceC6726o1) r3
            java.util.concurrent.CancellationException r3 = r3.mo13583R()
        L23:
            return r3
    }

    /* renamed from: w */
    public final java.lang.Object m13596w(p379vh.C6702g1.c r9, java.lang.Object r10) {
            r8 = this;
            boolean r0 = r10 instanceof p379vh.C6739t
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r10
            vh.t r0 = (p379vh.C6739t) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto Le
            r0 = r1
            goto L10
        Le:
            java.lang.Throwable r0 = r0.f26037a
        L10:
            monitor-enter(r9)
            r9.m13603f()     // Catch: java.lang.Throwable -> Ld3
            java.util.List r2 = r9.m13606i(r0)     // Catch: java.lang.Throwable -> Ld3
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> Ld3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L31
            boolean r3 = r9.m13603f()     // Catch: java.lang.Throwable -> Ld3
            if (r3 == 0) goto L53
            vh.c1 r3 = new vh.c1     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r6 = r8.mo13547s()     // Catch: java.lang.Throwable -> Ld3
            r3.<init>(r6, r1, r8)     // Catch: java.lang.Throwable -> Ld3
            r1 = r3
            goto L53
        L31:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Ld3
        L35:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto L48
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> Ld3
            r7 = r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch: java.lang.Throwable -> Ld3
            boolean r7 = r7 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Ld3
            r7 = r7 ^ r4
            if (r7 == 0) goto L35
            r1 = r6
        L48:
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Ld3
            if (r1 == 0) goto L4d
            goto L53
        L4d:
            java.lang.Object r1 = r2.get(r5)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> Ld3
        L53:
            if (r1 == 0) goto L8b
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            if (r3 > r4) goto L5c
            goto L8b
        L5c:
            int r3 = r2.size()     // Catch: java.lang.Throwable -> Ld3
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch: java.lang.Throwable -> Ld3
            r6.<init>(r3)     // Catch: java.lang.Throwable -> Ld3
            java.util.Set r3 = java.util.Collections.newSetFromMap(r6)     // Catch: java.lang.Throwable -> Ld3
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ld3
        L6d:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld3
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> Ld3
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> Ld3
            if (r6 == r1) goto L6d
            if (r6 == r1) goto L6d
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> Ld3
            if (r7 != 0) goto L6d
            boolean r7 = r3.add(r6)     // Catch: java.lang.Throwable -> Ld3
            if (r7 == 0) goto L6d
            p185k7.C3836i.m8616a(r1, r6)     // Catch: java.lang.Throwable -> Ld3
            goto L6d
        L8b:
            monitor-exit(r9)
            if (r1 != 0) goto L8f
            goto L98
        L8f:
            if (r1 != r0) goto L92
            goto L98
        L92:
            vh.t r10 = new vh.t
            r0 = 2
            r10.<init>(r1, r5, r0)
        L98:
            if (r1 == 0) goto Lb9
            boolean r0 = r8.m13592o(r1)
            if (r0 != 0) goto La9
            boolean r0 = r8.mo13574D(r1)
            if (r0 == 0) goto La7
            goto La9
        La7:
            r0 = 0
            goto Laa
        La9:
            r0 = 1
        Laa:
            if (r0 == 0) goto Lb9
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            java.util.Objects.requireNonNull(r10, r0)
            r0 = r10
            vh.t r0 = (p379vh.C6739t) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p379vh.C6739t.f26036b
            r1.compareAndSet(r0, r5, r4)
        Lb9:
            r8.mo13542M(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p379vh.C6702g1.f25974Y
            boolean r1 = r10 instanceof p379vh.InterfaceC6752x0
            if (r1 == 0) goto Lcb
            vh.y0 r1 = new vh.y0
            r2 = r10
            vh.x0 r2 = (p379vh.InterfaceC6752x0) r2
            r1.<init>(r2)
            goto Lcc
        Lcb:
            r1 = r10
        Lcc:
            r0.compareAndSet(r8, r9, r1)
            r8.m13594u(r9, r10)
            return r10
        Ld3:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    /* renamed from: x */
    public boolean mo13564x() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* renamed from: y */
    public boolean mo13565y() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: z */
    public final p379vh.C6717l1 m13597z(p379vh.InterfaceC6752x0 r2) {
            r1 = this;
            vh.l1 r0 = r2.mo13569c()
            if (r0 != 0) goto L2b
            boolean r0 = r2 instanceof p379vh.C6722n0
            if (r0 == 0) goto L10
            vh.l1 r0 = new vh.l1
            r0.<init>()
            goto L2b
        L10:
            boolean r0 = r2 instanceof p379vh.AbstractC6699f1
            if (r0 == 0) goto L1b
            vh.f1 r2 = (p379vh.AbstractC6699f1) r2
            r1.m13581O(r2)
            r0 = 0
            goto L2b
        L1b:
            java.lang.String r0 = "State should have list: "
            java.lang.String r2 = p214m2.C4339q.m9711u(r0, r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L2b:
            return r0
    }
}
