package p379vh;

/* renamed from: vh.i */
/* loaded from: classes.dex */
public class C6706i<T> extends p379vh.AbstractC6710j0<T> implements p379vh.InterfaceC6703h<T>, p134hh.InterfaceC3043d {

    /* renamed from: e0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f25995e0 = null;

    /* renamed from: f0 */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f25996f0 = null;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ java.lang.Object _state;

    /* renamed from: b0 */
    public final p101fh.InterfaceC2172d<T> f25997b0;

    /* renamed from: c0 */
    public final p101fh.InterfaceC2175g f25998c0;

    /* renamed from: d0 */
    public p379vh.InterfaceC6719m0 f25999d0;

    static {
            java.lang.Class<vh.i> r0 = p379vh.C6706i.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p379vh.C6706i.f25995e0 = r0
            java.lang.Class<vh.i> r0 = p379vh.C6706i.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            p379vh.C6706i.f25996f0 = r0
            return
    }

    public C6706i(p101fh.InterfaceC2172d<? super T> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f25997b0 = r1
            fh.g r1 = r1.mo5706c()
            r0.f25998c0 = r1
            r1 = 0
            r0._decision = r1
            vh.b r1 = p379vh.C6685b.f25956Y
            r0._state = r1
            return
    }

    /* renamed from: A */
    public final boolean m13617A() {
            r4 = this;
            int r0 = r4.f26003a0
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L17
            fh.d<T> r0 = r4.f25997b0
            zh.e r0 = (p459zh.C7339e) r0
            boolean r0 = r0.m14413l()
            if (r0 == 0) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    /* renamed from: B */
    public final void m13618B(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3, java.lang.Object r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "It's prohibited to register multiple handlers, tried to register "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", already has "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: C */
    public java.lang.String mo13598C() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    /* renamed from: D */
    public final void m13619D() {
            r3 = this;
            fh.d<T> r0 = r3.f25997b0
            boolean r1 = r0 instanceof p459zh.C7339e
            r2 = 0
            if (r1 == 0) goto La
            zh.e r0 = (p459zh.C7339e) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Le
            goto L12
        Le:
            java.lang.Throwable r2 = r0.m14416s(r3)
        L12:
            if (r2 != 0) goto L15
            return
        L15:
            r3.m13630s()
            r3.mo13611m(r2)
            return
    }

    /* renamed from: E */
    public final void m13620E(java.lang.Object r9, int r10, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r11) {
            r8 = this;
        L0:
            java.lang.Object r0 = r8._state
            boolean r1 = r0 instanceof p379vh.InterfaceC6723n1
            if (r1 == 0) goto L22
            r3 = r0
            vh.n1 r3 = (p379vh.InterfaceC6723n1) r3
            r7 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            java.lang.Object r1 = r2.m13621F(r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p379vh.C6706i.f25996f0
            boolean r0 = r2.compareAndSet(r8, r0, r1)
            if (r0 != 0) goto L1b
            goto L0
        L1b:
            r8.m13631t()
            r8.m13632u(r10)
            return
        L22:
            boolean r10 = r0 instanceof p379vh.C6712k
            if (r10 == 0) goto L3e
            vh.k r0 = (p379vh.C6712k) r0
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r10 = p379vh.C6712k.f26005c
            r1 = 0
            r2 = 1
            boolean r10 = r10.compareAndSet(r0, r1, r2)
            if (r10 == 0) goto L3e
            if (r11 != 0) goto L38
            goto L3d
        L38:
            java.lang.Throwable r9 = r0.f26037a
            r8.m13629o(r11, r9)
        L3d:
            return
        L3e:
            java.lang.String r10 = "Already resumed, but proposed with update "
            java.lang.String r9 = p214m2.C4339q.m9711u(r10, r9)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    /* renamed from: F */
    public final java.lang.Object m13621F(p379vh.InterfaceC6723n1 r8, java.lang.Object r9, int r10, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r11, java.lang.Object r12) {
            r7 = this;
            boolean r0 = r9 instanceof p379vh.C6739t
            if (r0 == 0) goto L5
            goto L2d
        L5:
            boolean r10 = p101fh.C2174f.m5727q(r10)
            if (r10 != 0) goto Le
            if (r12 != 0) goto Le
            goto L2d
        Le:
            if (r11 != 0) goto L17
            boolean r10 = r8 instanceof p379vh.AbstractC6697f
            if (r10 == 0) goto L15
            goto L17
        L15:
            if (r12 == 0) goto L2d
        L17:
            vh.s r10 = new vh.s
            boolean r0 = r8 instanceof p379vh.AbstractC6697f
            if (r0 == 0) goto L20
            vh.f r8 = (p379vh.AbstractC6697f) r8
            goto L21
        L20:
            r8 = 0
        L21:
            r2 = r8
            r5 = 0
            r6 = 16
            r0 = r10
            r1 = r9
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9 = r10
        L2d:
            return r9
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: a */
    public void mo13622a(java.lang.Object r10, java.lang.Throwable r11) {
            r9 = this;
        L0:
            java.lang.Object r10 = r9._state
            boolean r0 = r10 instanceof p379vh.InterfaceC6723n1
            if (r0 != 0) goto L64
            boolean r0 = r10 instanceof p379vh.C6739t
            if (r0 == 0) goto Lb
            return
        Lb:
            boolean r0 = r10 instanceof p379vh.C6736s
            if (r0 == 0) goto L4e
            r0 = r10
            vh.s r0 = (p379vh.C6736s) r0
            java.lang.Throwable r1 = r0.f26032e
            r2 = 1
            if (r1 == 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            r1 = r1 ^ r2
            if (r1 == 0) goto L42
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 15
            r1 = r0
            r6 = r11
            vh.s r1 = p379vh.C6736s.m13664a(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p379vh.C6706i.f25996f0
            boolean r10 = r2.compareAndSet(r9, r10, r1)
            if (r10 == 0) goto L0
            vh.f r10 = r0.f26029b
            if (r10 != 0) goto L36
            goto L39
        L36:
            r9.m13628n(r10, r11)
        L39:
            mh.l<java.lang.Throwable, ch.l> r10 = r0.f26030c
            if (r10 != 0) goto L3e
            goto L41
        L3e:
            r9.m13629o(r10, r11)
        L41:
            return
        L42:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Must be called at most once"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L4e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p379vh.C6706i.f25996f0
            vh.s r8 = new vh.s
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 14
            r0 = r8
            r1 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            boolean r10 = r7.compareAndSet(r9, r10, r8)
            if (r10 == 0) goto L0
            return
        L64:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Not completed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: b */
    public final p101fh.InterfaceC2172d<T> mo13623b() {
            r1 = this;
            fh.d<T> r0 = r1.f25997b0
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: c */
    public p101fh.InterfaceC2175g mo5706c() {
            r1 = this;
            fh.g r0 = r1.f25998c0
            return r0
    }

    @Override // p379vh.InterfaceC6703h
    /* renamed from: d */
    public void mo13609d(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r11) {
            r10 = this;
            boolean r0 = r11 instanceof p379vh.AbstractC6697f
            if (r0 == 0) goto L8
            r0 = r11
            vh.f r0 = (p379vh.AbstractC6697f) r0
            goto Ld
        L8:
            vh.e r0 = new vh.e
            r0.<init>(r11)
        Ld:
            java.lang.Object r8 = r10._state
            boolean r1 = r8 instanceof p379vh.C6685b
            if (r1 == 0) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p379vh.C6706i.f25996f0
            boolean r1 = r1.compareAndSet(r10, r8, r0)
            if (r1 == 0) goto Ld
            return
        L1c:
            boolean r1 = r8 instanceof p379vh.AbstractC6697f
            r2 = 0
            if (r1 != 0) goto L8f
            boolean r1 = r8 instanceof p379vh.C6739t
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L4a
            r0 = r8
            vh.t r0 = (p379vh.C6739t) r0
            java.util.Objects.requireNonNull(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = p379vh.C6739t.f26036b
            boolean r3 = r5.compareAndSet(r0, r4, r3)
            if (r3 == 0) goto L46
            boolean r3 = r8 instanceof p379vh.C6712k
            if (r3 == 0) goto L45
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 != 0) goto L40
            goto L42
        L40:
            java.lang.Throwable r2 = r0.f26037a
        L42:
            r10.m13627l(r11, r2)
        L45:
            return
        L46:
            r10.m13618B(r11, r8)
            throw r2
        L4a:
            boolean r1 = r8 instanceof p379vh.C6736s
            if (r1 == 0) goto L79
            r1 = r8
            vh.s r1 = (p379vh.C6736s) r1
            vh.f r5 = r1.f26029b
            if (r5 != 0) goto L75
            java.lang.Throwable r2 = r1.f26032e
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r3 = 0
        L5b:
            if (r3 == 0) goto L61
            r10.m13627l(r11, r2)
            return
        L61:
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 29
            r3 = r0
            vh.s r1 = p379vh.C6736s.m13664a(r1, r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p379vh.C6706i.f25996f0
            boolean r1 = r2.compareAndSet(r10, r8, r1)
            if (r1 == 0) goto Ld
            return
        L75:
            r10.m13618B(r11, r8)
            throw r2
        L79:
            vh.s r9 = new vh.s
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 28
            r1 = r9
            r2 = r8
            r3 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p379vh.C6706i.f25996f0
            boolean r1 = r1.compareAndSet(r10, r8, r9)
            if (r1 == 0) goto Ld
            return
        L8f:
            r10.m13618B(r11, r8)
            throw r2
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: e */
    public java.lang.Throwable mo13624e(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.mo13624e(r1)
            if (r1 != 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @Override // p379vh.InterfaceC6703h
    /* renamed from: f */
    public void mo13610f(T r2, mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3) {
            r1 = this;
            int r0 = r1.f26003a0
            r1.m13620E(r2, r0, r3)
            return
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: g */
    public <T> T mo13625g(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p379vh.C6736s
            if (r0 == 0) goto L8
            vh.s r2 = (p379vh.C6736s) r2
            java.lang.Object r2 = r2.f26028a
        L8:
            return r2
    }

    @Override // p379vh.AbstractC6710j0
    /* renamed from: i */
    public java.lang.Object mo13626i() {
            r1 = this;
            java.lang.Object r0 = r1._state
            return r0
    }

    @Override // p134hh.InterfaceC3043d
    /* renamed from: j */
    public p134hh.InterfaceC3043d mo5742j() {
            r2 = this;
            fh.d<T> r0 = r2.f25997b0
            boolean r1 = r0 instanceof p134hh.InterfaceC3043d
            if (r1 == 0) goto L9
            hh.d r0 = (p134hh.InterfaceC3043d) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // p101fh.InterfaceC2172d
    /* renamed from: k */
    public void mo5707k(java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = ch.C0979f.m2690b(r4)
            if (r0 != 0) goto L7
            goto Le
        L7:
            vh.t r4 = new vh.t
            r1 = 0
            r2 = 2
            r4.<init>(r0, r1, r2)
        Le:
            int r0 = r3.f26003a0
            r1 = 0
            r3.m13620E(r4, r0, r1)
            return
    }

    /* renamed from: l */
    public final void m13627l(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3, java.lang.Throwable r4) {
            r2 = this;
            r3.mo107b(r4)     // Catch: java.lang.Throwable -> L4
            goto L15
        L4:
            r3 = move-exception
            fh.g r4 = r2.f25998c0
            vh.w r0 = new vh.w
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            java.lang.String r1 = p214m2.C4339q.m9711u(r1, r2)
            r0.<init>(r1, r3)
            gh.C2390b.m6122l(r4, r0)
        L15:
            return
    }

    @Override // p379vh.InterfaceC6703h
    /* renamed from: m */
    public boolean mo13611m(java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof p379vh.InterfaceC6723n1
            if (r1 != 0) goto L8
            r5 = 0
            return r5
        L8:
            vh.k r1 = new vh.k
            boolean r2 = r0 instanceof p379vh.AbstractC6697f
            r1.<init>(r4, r5, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = p379vh.C6706i.f25996f0
            boolean r1 = r3.compareAndSet(r4, r0, r1)
            if (r1 != 0) goto L18
            goto L0
        L18:
            if (r2 == 0) goto L1d
            vh.f r0 = (p379vh.AbstractC6697f) r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L21
            goto L24
        L21:
            r4.m13628n(r0, r5)
        L24:
            r4.m13631t()
            int r5 = r4.f26003a0
            r4.m13632u(r5)
            r5 = 1
            return r5
    }

    /* renamed from: n */
    public final void m13628n(p379vh.AbstractC6697f r3, java.lang.Throwable r4) {
            r2 = this;
            r3.mo13559a(r4)     // Catch: java.lang.Throwable -> L4
            goto L15
        L4:
            r3 = move-exception
            fh.g r4 = r2.f25998c0
            vh.w r0 = new vh.w
            java.lang.String r1 = "Exception in invokeOnCancellation handler for "
            java.lang.String r1 = p214m2.C4339q.m9711u(r1, r2)
            r0.<init>(r1, r3)
            gh.C2390b.m6122l(r4, r0)
        L15:
            return
    }

    /* renamed from: o */
    public final void m13629o(mh.InterfaceC4620l<? super java.lang.Throwable, ch.C0985l> r3, java.lang.Throwable r4) {
            r2 = this;
            r3.mo107b(r4)     // Catch: java.lang.Throwable -> L4
            goto L15
        L4:
            r3 = move-exception
            fh.g r4 = r2.f25998c0
            vh.w r0 = new vh.w
            java.lang.String r1 = "Exception in resume onCancellation handler for "
            java.lang.String r1 = p214m2.C4339q.m9711u(r1, r2)
            r0.<init>(r1, r3)
            gh.C2390b.m6122l(r4, r0)
        L15:
            return
    }

    @Override // p379vh.InterfaceC6703h
    /* renamed from: p */
    public void mo13612p(p379vh.AbstractC6755z r4, T r5) {
            r3 = this;
            fh.d<T> r0 = r3.f25997b0
            boolean r1 = r0 instanceof p459zh.C7339e
            r2 = 0
            if (r1 == 0) goto La
            zh.e r0 = (p459zh.C7339e) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Lf
            r0 = r2
            goto L11
        Lf:
            vh.z r0 = r0.f28085b0
        L11:
            if (r0 != r4) goto L15
            r4 = 4
            goto L17
        L15:
            int r4 = r3.f26003a0
        L17:
            r3.m13620E(r5, r4, r2)
            return
    }

    @Override // p379vh.InterfaceC6703h
    /* renamed from: q */
    public java.lang.Object mo13613q(java.lang.Throwable r8) {
            r7 = this;
            vh.t r6 = new vh.t
            r0 = 0
            r1 = 2
            r6.<init>(r8, r0, r1)
        L7:
            java.lang.Object r8 = r7._state
            boolean r0 = r8 instanceof p379vh.InterfaceC6723n1
            if (r0 == 0) goto L29
            r1 = r8
            vh.n1 r1 = (p379vh.InterfaceC6723n1) r1
            int r3 = r7.f26003a0
            r5 = 0
            r4 = 0
            r0 = r7
            r2 = r6
            java.lang.Object r0 = r0.m13621F(r1, r2, r3, r4, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p379vh.C6706i.f25996f0
            boolean r8 = r1.compareAndSet(r7, r8, r0)
            if (r8 != 0) goto L23
            goto L7
        L23:
            r7.m13631t()
            zh.p r8 = p379vh.C6709j.f26002a
            goto L2c
        L29:
            boolean r8 = r8 instanceof p379vh.C6736s
            r8 = 0
        L2c:
            return r8
    }

    @Override // p379vh.InterfaceC6703h
    /* renamed from: r */
    public void mo13614r(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.f26003a0
            r0.m13632u(r1)
            return
    }

    /* renamed from: s */
    public final void m13630s() {
            r1 = this;
            vh.m0 r0 = r1.f25999d0
            if (r0 != 0) goto L5
            return
        L5:
            r0.mo13570h()
            vh.m1 r0 = p379vh.C6720m1.f26009Y
            r1.f25999d0 = r0
            return
    }

    /* renamed from: t */
    public final void m13631t() {
            r1 = this;
            boolean r0 = r1.m13617A()
            if (r0 != 0) goto L9
            r1.m13630s()
        L9:
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.mo13598C()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            fh.d<T> r1 = r3.f25997b0
            java.lang.String r1 = gh.C2390b.m6136z(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.Object r1 = r3._state
            boolean r2 = r1 instanceof p379vh.InterfaceC6723n1
            if (r2 == 0) goto L28
            java.lang.String r1 = "Active"
            goto L31
        L28:
            boolean r1 = r1 instanceof p379vh.C6712k
            if (r1 == 0) goto L2f
            java.lang.String r1 = "Cancelled"
            goto L31
        L2f:
            java.lang.String r1 = "Completed"
        L31:
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = gh.C2390b.m6121k(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* renamed from: u */
    public final void m13632u(int r5) {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 != r2) goto La
            r0 = 0
            goto L20
        La:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p379vh.C6706i.f25995e0
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            r0 = 1
        L20:
            if (r0 == 0) goto L23
            return
        L23:
            fh.d r0 = r4.mo13623b()
            r3 = 4
            if (r5 != r3) goto L2b
            r1 = 1
        L2b:
            if (r1 != 0) goto L7f
            boolean r3 = r0 instanceof p459zh.C7339e
            if (r3 == 0) goto L7f
            boolean r5 = p101fh.C2174f.m5727q(r5)
            int r3 = r4.f26003a0
            boolean r3 = p101fh.C2174f.m5727q(r3)
            if (r5 != r3) goto L7f
            r5 = r0
            zh.e r5 = (p459zh.C7339e) r5
            vh.z r5 = r5.f28085b0
            fh.g r0 = r0.mo5706c()
            boolean r1 = r5.mo1433y0(r0)
            if (r1 == 0) goto L50
            r5.mo156x0(r0, r4)
            goto L82
        L50:
            vh.s1 r5 = p379vh.C6738s1.f26034a
            vh.o0 r5 = p379vh.C6738s1.m13665a()
            boolean r0 = r5.m13646D0()
            if (r0 == 0) goto L60
            r5.m13644B0(r4)
            goto L82
        L60:
            r5.m13645C0(r2)
            fh.d r0 = r4.mo13623b()     // Catch: java.lang.Throwable -> L71
            p101fh.C2174f.m5732v(r4, r0, r2)     // Catch: java.lang.Throwable -> L71
        L6a:
            boolean r0 = r5.m13647E0()     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L6a
            goto L76
        L71:
            r0 = move-exception
            r1 = 0
            r4.m13638h(r0, r1)     // Catch: java.lang.Throwable -> L7a
        L76:
            r5.m13648z0(r2)
            goto L82
        L7a:
            r0 = move-exception
            r5.m13648z0(r2)
            throw r0
        L7f:
            p101fh.C2174f.m5732v(r4, r0, r1)
        L82:
            return
    }

    /* renamed from: v */
    public java.lang.Throwable mo13599v(p379vh.InterfaceC6687b1 r1) {
            r0 = this;
            vh.g1 r1 = (p379vh.C6702g1) r1
            java.util.concurrent.CancellationException r1 = r1.mo13551S()
            return r1
    }

    /* renamed from: w */
    public final java.lang.Object m13633w() {
            r4 = this;
            boolean r0 = r4.m13617A()
        L4:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p379vh.C6706i.f25995e0
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L4
            r2 = 1
        L23:
            if (r2 == 0) goto L34
            vh.m0 r1 = r4.f25999d0
            if (r1 != 0) goto L2c
            r4.m13635y()
        L2c:
            if (r0 == 0) goto L31
            r4.m13619D()
        L31:
            gh.a r0 = gh.EnumC2389a.f10764Y
            return r0
        L34:
            if (r0 == 0) goto L39
            r4.m13619D()
        L39:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof p379vh.C6739t
            if (r1 != 0) goto L69
            int r1 = r4.f26003a0
            boolean r1 = p101fh.C2174f.m5727q(r1)
            if (r1 == 0) goto L64
            fh.g r1 = r4.f25998c0
            int r2 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r2 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r1 = r1.get(r2)
            vh.b1 r1 = (p379vh.InterfaceC6687b1) r1
            if (r1 == 0) goto L64
            boolean r2 = r1.mo13544a()
            if (r2 == 0) goto L5c
            goto L64
        L5c:
            java.util.concurrent.CancellationException r1 = r1.mo13551S()
            r4.mo13622a(r0, r1)
            throw r1
        L64:
            java.lang.Object r0 = r4.mo13625g(r0)
            return r0
        L69:
            vh.t r0 = (p379vh.C6739t) r0
            java.lang.Throwable r0 = r0.f26037a
            throw r0
    }

    /* renamed from: x */
    public void m13634x() {
            r2 = this;
            vh.m0 r0 = r2.m13635y()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.Object r1 = r2._state
            boolean r1 = r1 instanceof p379vh.InterfaceC6723n1
            r1 = r1 ^ 1
            if (r1 == 0) goto L16
            r0.mo13570h()
            vh.m1 r0 = p379vh.C6720m1.f26009Y
            r2.f25999d0 = r0
        L16:
            return
    }

    /* renamed from: y */
    public final p379vh.InterfaceC6719m0 m13635y() {
            r7 = this;
            fh.g r0 = r7.f25998c0
            int r1 = p379vh.InterfaceC6687b1.f25957X
            vh.b1$b r1 = p379vh.InterfaceC6687b1.b.f25958Y
            fh.g$a r0 = r0.get(r1)
            r1 = r0
            vh.b1 r1 = (p379vh.InterfaceC6687b1) r1
            if (r1 != 0) goto L11
            r0 = 0
            return r0
        L11:
            r2 = 1
            r3 = 0
            vh.l r4 = new vh.l
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            vh.m0 r0 = p379vh.InterfaceC6687b1.a.m13557b(r1, r2, r3, r4, r5, r6)
            r7.f25999d0 = r0
            return r0
    }

    /* renamed from: z */
    public boolean m13636z() {
            r1 = this;
            java.lang.Object r0 = r1._state
            boolean r0 = r0 instanceof p379vh.InterfaceC6723n1
            r0 = r0 ^ 1
            return r0
    }
}
