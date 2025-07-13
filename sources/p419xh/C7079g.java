package p419xh;

/* renamed from: xh.g */
/* loaded from: classes.dex */
public final class C7079g<T> extends p439yh.AbstractC7204a<p419xh.C7081i> implements p419xh.InterfaceC7078f<T>, p419xh.InterfaceC7073a {
    private volatile /* synthetic */ java.lang.Object _state;

    /* renamed from: b0 */
    public int f27405b0;

    @p134hh.InterfaceC3044e(m7451c = "kotlinx.coroutines.flow.StateFlowImpl", m7452f = "StateFlow.kt", m7453l = {386, 398, 403}, m7454m = "collect")
    /* renamed from: xh.g$a */
    public static final class a extends p134hh.AbstractC3042c {

        /* renamed from: b0 */
        public java.lang.Object f27406b0;

        /* renamed from: c0 */
        public java.lang.Object f27407c0;

        /* renamed from: d0 */
        public java.lang.Object f27408d0;

        /* renamed from: e0 */
        public java.lang.Object f27409e0;

        /* renamed from: f0 */
        public java.lang.Object f27410f0;

        /* renamed from: g0 */
        public /* synthetic */ java.lang.Object f27411g0;

        /* renamed from: h0 */
        public final /* synthetic */ p419xh.C7079g<T> f27412h0;

        /* renamed from: i0 */
        public int f27413i0;

        public a(p419xh.C7079g<T> r1, p101fh.InterfaceC2172d<? super p419xh.C7079g.a> r2) {
                r0 = this;
                r0.f27412h0 = r1
                r0.<init>(r2)
                return
        }

        @Override // p134hh.AbstractC3040a
        /* renamed from: o */
        public final java.lang.Object mo123o(java.lang.Object r2) {
                r1 = this;
                r1.f27411g0 = r2
                int r2 = r1.f27413i0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f27413i0 = r2
                xh.g<T> r2 = r1.f27412h0
                r0 = 0
                java.lang.Object r2 = r2.mo14181b(r0, r1)
                return r2
        }
    }

    public C7079g(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    @Override // p419xh.InterfaceC7074b
    /* renamed from: a */
    public java.lang.Object mo1443a(T r1, p101fh.InterfaceC2172d<? super ch.C0985l> r2) {
            r0 = this;
            if (r1 != 0) goto L4
            zh.p r1 = p439yh.C7209f.f27750a
        L4:
            r2 = 0
            r0.m14183c(r2, r1)
            ch.l r1 = ch.C0985l.f5061a
            return r1
    }

    @Override // p419xh.InterfaceC7073a
    /* renamed from: b */
    public java.lang.Object mo14181b(p419xh.InterfaceC7074b<? super T> r19, p101fh.InterfaceC2172d<? super ch.C0985l> r20) {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            gh.a r3 = gh.EnumC2389a.f10764Y
            boolean r4 = r2 instanceof p419xh.C7079g.a
            if (r4 == 0) goto L1b
            r4 = r2
            xh.g$a r4 = (p419xh.C7079g.a) r4
            int r5 = r4.f27413i0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f27413i0 = r5
            goto L20
        L1b:
            xh.g$a r4 = new xh.g$a
            r4.<init>(r1, r2)
        L20:
            java.lang.Object r2 = r4.f27411g0
            int r5 = r4.f27413i0
            r7 = 3
            r8 = 0
            r9 = 2
            r10 = 1
            if (r5 == 0) goto L84
            if (r5 == r10) goto L6f
            if (r5 == r9) goto L57
            if (r5 != r7) goto L4f
            java.lang.Object r0 = r4.f27410f0
            java.lang.Object r5 = r4.f27409e0
            vh.b1 r5 = (p379vh.InterfaceC6687b1) r5
            java.lang.Object r11 = r4.f27408d0
            xh.i r11 = (p419xh.C7081i) r11
            java.lang.Object r12 = r4.f27407c0
            xh.b r12 = (p419xh.InterfaceC7074b) r12
            java.lang.Object r13 = r4.f27406b0
            xh.g r13 = (p419xh.C7079g) r13
            p074e9.C1805a.m4540y(r2)     // Catch: java.lang.Throwable -> L81
            r2 = r5
            r5 = r4
            r4 = r3
            r16 = r12
            r12 = r0
            r0 = r16
            goto L18c
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L57:
            java.lang.Object r0 = r4.f27410f0
            java.lang.Object r5 = r4.f27409e0
            vh.b1 r5 = (p379vh.InterfaceC6687b1) r5
            java.lang.Object r11 = r4.f27408d0
            xh.i r11 = (p419xh.C7081i) r11
            java.lang.Object r12 = r4.f27407c0
            xh.b r12 = (p419xh.InterfaceC7074b) r12
            java.lang.Object r13 = r4.f27406b0
            xh.g r13 = (p419xh.C7079g) r13
            p074e9.C1805a.m4540y(r2)     // Catch: java.lang.Throwable -> L81
            r2 = r3
            goto L139
        L6f:
            java.lang.Object r0 = r4.f27408d0
            r11 = r0
            xh.i r11 = (p419xh.C7081i) r11
            java.lang.Object r0 = r4.f27407c0
            xh.b r0 = (p419xh.InterfaceC7074b) r0
            java.lang.Object r5 = r4.f27406b0
            r13 = r5
            xh.g r13 = (p419xh.C7079g) r13
            p074e9.C1805a.m4540y(r2)     // Catch: java.lang.Throwable -> L81
            goto Le3
        L81:
            r0 = move-exception
            goto L196
        L84:
            p074e9.C1805a.m4540y(r2)
            monitor-enter(r18)
            S extends yh.c<?>[] r2 = r1.f27743Y     // Catch: java.lang.Throwable -> L1bb
            if (r2 != 0) goto L91
            xh.i[] r2 = new p419xh.C7081i[r9]     // Catch: java.lang.Throwable -> L1bb
            r1.f27743Y = r2     // Catch: java.lang.Throwable -> L1bb
            goto La9
        L91:
            int r5 = r1.f27744Z     // Catch: java.lang.Throwable -> L1bb
            int r11 = r2.length     // Catch: java.lang.Throwable -> L1bb
            if (r5 < r11) goto La9
            int r5 = r2.length     // Catch: java.lang.Throwable -> L1bb
            int r5 = r5 * 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch: java.lang.Throwable -> L1bb
            java.lang.String r5 = "java.util.Arrays.copyOf(this, newSize)"
            p214m2.C4339q.m9705j(r2, r5)     // Catch: java.lang.Throwable -> L1bb
            r5 = r2
            yh.c[] r5 = (p439yh.AbstractC7206c[]) r5     // Catch: java.lang.Throwable -> L1bb
            r1.f27743Y = r5     // Catch: java.lang.Throwable -> L1bb
            yh.c[] r2 = (p439yh.AbstractC7206c[]) r2     // Catch: java.lang.Throwable -> L1bb
        La9:
            int r5 = r1.f27745a0     // Catch: java.lang.Throwable -> L1bb
        Lab:
            r11 = r2[r5]     // Catch: java.lang.Throwable -> L1bb
            if (r11 != 0) goto Lb6
            xh.i r11 = new xh.i     // Catch: java.lang.Throwable -> L1bb
            r11.<init>()     // Catch: java.lang.Throwable -> L1bb
            r2[r5] = r11     // Catch: java.lang.Throwable -> L1bb
        Lb6:
            int r5 = r5 + 1
            int r12 = r2.length     // Catch: java.lang.Throwable -> L1bb
            if (r5 < r12) goto Lbc
            r5 = 0
        Lbc:
            boolean r12 = r11.mo14184a(r1)     // Catch: java.lang.Throwable -> L1bb
            if (r12 == 0) goto Lab
            r1.f27745a0 = r5     // Catch: java.lang.Throwable -> L1bb
            int r2 = r1.f27744Z     // Catch: java.lang.Throwable -> L1bb
            int r2 = r2 + r10
            r1.f27744Z = r2     // Catch: java.lang.Throwable -> L1bb
            monitor-exit(r18)
            xh.i r11 = (p419xh.C7081i) r11
            boolean r2 = r0 instanceof p419xh.C7082j     // Catch: java.lang.Throwable -> L194
            if (r2 == 0) goto Le2
            r2 = r0
            xh.j r2 = (p419xh.C7082j) r2     // Catch: java.lang.Throwable -> L194
            r4.f27406b0 = r1     // Catch: java.lang.Throwable -> L194
            r4.f27407c0 = r0     // Catch: java.lang.Throwable -> L194
            r4.f27408d0 = r11     // Catch: java.lang.Throwable -> L194
            r4.f27413i0 = r10     // Catch: java.lang.Throwable -> L194
            java.lang.Object r2 = r2.m14186b(r4)     // Catch: java.lang.Throwable -> L194
            if (r2 != r3) goto Le2
            return r3
        Le2:
            r13 = r1
        Le3:
            fh.g r2 = r4.f12244Z     // Catch: java.lang.Throwable -> L81
            p214m2.C4339q.m9704i(r2)     // Catch: java.lang.Throwable -> L81
            int r5 = p379vh.InterfaceC6687b1.f25957X     // Catch: java.lang.Throwable -> L81
            vh.b1$b r5 = p379vh.InterfaceC6687b1.b.f25958Y     // Catch: java.lang.Throwable -> L81
            fh.g$a r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L81
            vh.b1 r2 = (p379vh.InterfaceC6687b1) r2     // Catch: java.lang.Throwable -> L81
            r5 = r4
            r12 = 0
            r4 = r3
        Lf5:
            java.lang.Object r14 = r13._state     // Catch: java.lang.Throwable -> L81
            if (r2 != 0) goto Lfa
            goto L100
        Lfa:
            boolean r15 = r2.mo13544a()     // Catch: java.lang.Throwable -> L81
            if (r15 == 0) goto L18f
        L100:
            if (r12 == 0) goto L116
            boolean r15 = p214m2.C4339q.m9702c(r12, r14)     // Catch: java.lang.Throwable -> L81
            if (r15 != 0) goto L109
            goto L116
        L109:
            r16 = r12
            r12 = r0
            r0 = r16
            r17 = r5
            r5 = r2
            r2 = r3
            r3 = r4
            r4 = r17
            goto L139
        L116:
            zh.p r12 = p439yh.C7209f.f27750a     // Catch: java.lang.Throwable -> L81
            if (r14 != r12) goto L11c
            r12 = 0
            goto L11d
        L11c:
            r12 = r14
        L11d:
            r5.f27406b0 = r13     // Catch: java.lang.Throwable -> L81
            r5.f27407c0 = r0     // Catch: java.lang.Throwable -> L81
            r5.f27408d0 = r11     // Catch: java.lang.Throwable -> L81
            r5.f27409e0 = r2     // Catch: java.lang.Throwable -> L81
            r5.f27410f0 = r14     // Catch: java.lang.Throwable -> L81
            r5.f27413i0 = r9     // Catch: java.lang.Throwable -> L81
            java.lang.Object r12 = r0.mo1443a(r12, r5)     // Catch: java.lang.Throwable -> L81
            if (r12 != r3) goto L130
            return r3
        L130:
            r12 = r0
            r0 = r14
            r16 = r5
            r5 = r2
            r2 = r3
            r3 = r4
            r4 = r16
        L139:
            java.util.Objects.requireNonNull(r11)     // Catch: java.lang.Throwable -> L81
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = p419xh.C7081i.f27416a     // Catch: java.lang.Throwable -> L81
            zh.p r15 = p419xh.C7080h.f27414a     // Catch: java.lang.Throwable -> L81
            java.lang.Object r6 = r14.getAndSet(r11, r15)     // Catch: java.lang.Throwable -> L81
            p214m2.C4339q.m9704i(r6)     // Catch: java.lang.Throwable -> L81
            zh.p r9 = p419xh.C7080h.f27415b     // Catch: java.lang.Throwable -> L81
            if (r6 != r9) goto L14d
            r6 = 1
            goto L14e
        L14d:
            r6 = 0
        L14e:
            if (r6 != 0) goto L180
            r4.f27406b0 = r13     // Catch: java.lang.Throwable -> L81
            r4.f27407c0 = r12     // Catch: java.lang.Throwable -> L81
            r4.f27408d0 = r11     // Catch: java.lang.Throwable -> L81
            r4.f27409e0 = r5     // Catch: java.lang.Throwable -> L81
            r4.f27410f0 = r0     // Catch: java.lang.Throwable -> L81
            r4.f27413i0 = r7     // Catch: java.lang.Throwable -> L81
            vh.i r6 = new vh.i     // Catch: java.lang.Throwable -> L81
            fh.d r9 = gh.C2390b.m6127q(r4)     // Catch: java.lang.Throwable -> L81
            r6.<init>(r9, r10)     // Catch: java.lang.Throwable -> L81
            r6.m13634x()     // Catch: java.lang.Throwable -> L81
            boolean r9 = r14.compareAndSet(r11, r15, r6)     // Catch: java.lang.Throwable -> L81
            if (r9 == 0) goto L16f
            goto L174
        L16f:
            ch.l r9 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L81
            r6.mo5707k(r9)     // Catch: java.lang.Throwable -> L81
        L174:
            java.lang.Object r6 = r6.m13633w()     // Catch: java.lang.Throwable -> L81
            if (r6 != r3) goto L17b
            goto L17d
        L17b:
            ch.l r6 = ch.C0985l.f5061a     // Catch: java.lang.Throwable -> L81
        L17d:
            if (r6 != r2) goto L180
            return r2
        L180:
            r16 = r12
            r12 = r0
            r0 = r16
            r17 = r3
            r3 = r2
            r2 = r5
            r5 = r4
            r4 = r17
        L18c:
            r9 = 2
            goto Lf5
        L18f:
            java.util.concurrent.CancellationException r0 = r2.mo13551S()     // Catch: java.lang.Throwable -> L81
            throw r0     // Catch: java.lang.Throwable -> L81
        L194:
            r0 = move-exception
            r13 = r1
        L196:
            monitor-enter(r13)
            int r2 = r13.f27744Z     // Catch: java.lang.Throwable -> L1b8
            int r2 = r2 + (-1)
            r13.f27744Z = r2     // Catch: java.lang.Throwable -> L1b8
            if (r2 != 0) goto L1a1
            r13.f27745a0 = r8     // Catch: java.lang.Throwable -> L1b8
        L1a1:
            r11.m14185b(r13)     // Catch: java.lang.Throwable -> L1b8
            kotlin.coroutines.Continuation<kotlin.Unit>[] r2 = p439yh.C7205b.f27746a     // Catch: java.lang.Throwable -> L1b8
            monitor-exit(r13)
            int r3 = r2.length
        L1a8:
            if (r8 >= r3) goto L1b7
            r4 = r2[r8]
            int r8 = r8 + 1
            if (r4 != 0) goto L1b1
            goto L1a8
        L1b1:
            ch.l r5 = ch.C0985l.f5061a
            r4.mo5707k(r5)
            goto L1a8
        L1b7:
            throw r0
        L1b8:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L1bb:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
    }

    /* renamed from: c */
    public final boolean m14183c(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9._state     // Catch: java.lang.Throwable -> L76
            r1 = 0
            if (r10 == 0) goto Le
            boolean r10 = p214m2.C4339q.m9702c(r0, r10)     // Catch: java.lang.Throwable -> L76
            if (r10 != 0) goto Le
            monitor-exit(r9)
            return r1
        Le:
            boolean r10 = p214m2.C4339q.m9702c(r0, r11)     // Catch: java.lang.Throwable -> L76
            r0 = 1
            if (r10 == 0) goto L17
            monitor-exit(r9)
            return r0
        L17:
            r9._state = r11     // Catch: java.lang.Throwable -> L76
            int r10 = r9.f27405b0     // Catch: java.lang.Throwable -> L76
            r11 = r10 & 1
            if (r11 != 0) goto L70
            int r10 = r10 + r0
            r9.f27405b0 = r10     // Catch: java.lang.Throwable -> L76
            S extends yh.c<?>[] r11 = r9.f27743Y     // Catch: java.lang.Throwable -> L76
            monitor-exit(r9)
        L25:
            xh.i[] r11 = (p419xh.C7081i[]) r11
            if (r11 != 0) goto L2a
            goto L5c
        L2a:
            int r2 = r11.length
            r3 = 0
        L2c:
            if (r3 >= r2) goto L5c
            r4 = r11[r3]
            if (r4 != 0) goto L33
            goto L59
        L33:
            java.lang.Object r5 = r4._state
            if (r5 != 0) goto L38
            goto L59
        L38:
            zh.p r6 = p419xh.C7080h.f27415b
            if (r5 != r6) goto L3d
            goto L59
        L3d:
            zh.p r7 = p419xh.C7080h.f27414a
            if (r5 != r7) goto L4a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p419xh.C7081i.f27416a
            boolean r5 = r7.compareAndSet(r4, r5, r6)
            if (r5 == 0) goto L33
            goto L59
        L4a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = p419xh.C7081i.f27416a
            boolean r6 = r6.compareAndSet(r4, r5, r7)
            if (r6 == 0) goto L33
            vh.i r5 = (p379vh.C6706i) r5
            ch.l r4 = ch.C0985l.f5061a
            r5.mo5707k(r4)
        L59:
            int r3 = r3 + 1
            goto L2c
        L5c:
            monitor-enter(r9)
            int r11 = r9.f27405b0     // Catch: java.lang.Throwable -> L6d
            if (r11 != r10) goto L66
            int r10 = r10 + r0
            r9.f27405b0 = r10     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r9)
            return r0
        L66:
            S extends yh.c<?>[] r10 = r9.f27743Y     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L25
        L6d:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        L70:
            int r10 = r10 + 2
            r9.f27405b0 = r10     // Catch: java.lang.Throwable -> L76
            monitor-exit(r9)
            return r0
        L76:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    @Override // p419xh.InterfaceC7078f
    public void setValue(T r2) {
            r1 = this;
            r0 = 0
            r1.m14183c(r0, r2)
            return
    }
}
