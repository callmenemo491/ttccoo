package p221m9;

/* renamed from: m9.u0 */
/* loaded from: classes.dex */
public final class C4494u0<T> implements p221m9.InterfaceC4447e1<T> {

    /* renamed from: a */
    public final p221m9.InterfaceC4482q0 f18274a;

    /* renamed from: b */
    public final p221m9.AbstractC4471m1<?, ?> f18275b;

    /* renamed from: c */
    public final boolean f18276c;

    /* renamed from: d */
    public final p221m9.AbstractC4481q<?> f18277d;

    public C4494u0(p221m9.AbstractC4471m1<?, ?> r1, p221m9.AbstractC4481q<?> r2, p221m9.InterfaceC4482q0 r3) {
            r0 = this;
            r0.<init>()
            r0.f18275b = r1
            boolean r1 = r2.mo10227e(r3)
            r0.f18276c = r1
            r0.f18277d = r2
            r0.f18274a = r3
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: a */
    public void mo9986a(T r4, T r5) {
            r3 = this;
            m9.m1<?, ?> r0 = r3.f18275b
            java.lang.Class<?> r1 = p221m9.C4453g1.f18135a
            java.lang.Object r1 = r0.mo10204g(r4)
            java.lang.Object r2 = r0.mo10204g(r5)
            java.lang.Object r1 = r0.mo10208k(r1, r2)
            r0.mo10212o(r4, r1)
            boolean r0 = r3.f18276c
            if (r0 == 0) goto L1c
            m9.q<?> r0 = r3.f18277d
            p221m9.C4453g1.m10005A(r0, r4, r5)
        L1c:
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: b */
    public void mo9987b(T r6, p221m9.InterfaceC4498v1 r7) {
            r5 = this;
            m9.q<?> r0 = r5.f18277d
            m9.t r0 = r0.mo10225c(r6)
            java.util.Iterator r0 = r0.m10308k()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            m9.t$a r2 = (p221m9.C4490t.a) r2
            m9.u1 r3 = r2.mo10317m()
            m9.u1 r4 = p221m9.EnumC4495u1.f18286h0
            if (r3 != r4) goto L52
            boolean r3 = r2.mo10314f()
            if (r3 != 0) goto L52
            boolean r3 = r2.mo10318n()
            if (r3 != 0) goto L52
            boolean r3 = r1 instanceof p221m9.C4440c0.b
            int r2 = r2.mo10313d()
            if (r3 == 0) goto L47
            m9.c0$b r1 = (p221m9.C4440c0.b) r1
            java.util.Map$Entry<K, m9.c0> r1 = r1.f18112Y
            java.lang.Object r1 = r1.getValue()
            m9.c0 r1 = (p221m9.C4440c0) r1
            m9.h r1 = r1.m9917b()
            goto L4b
        L47:
            java.lang.Object r1 = r1.getValue()
        L4b:
            r3 = r7
            m9.l r3 = (p221m9.C4466l) r3
            r3.m10184e(r2, r1)
            goto La
        L52:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Found invalid MessageSet item."
            r6.<init>(r7)
            throw r6
        L5a:
            m9.m1<?, ?> r0 = r5.f18275b
            java.lang.Object r6 = r0.mo10204g(r6)
            r0.mo10215r(r6, r7)
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: c */
    public void mo9988c(T r10, byte[] r11, int r12, int r13, p221m9.C4445e.a r14) {
            r9 = this;
            r0 = r10
            m9.x r0 = (p221m9.AbstractC4501x) r0
            m9.n1 r1 = r0.unknownFields
            m9.n1 r2 = p221m9.C4474n1.f18195f
            if (r1 != r2) goto Lf
            m9.n1 r1 = p221m9.C4474n1.m10217b()
            r0.unknownFields = r1
        Lf:
            m9.x$c r10 = (p221m9.AbstractC4501x.c) r10
            r10.m10380w()
            r10 = 0
            r0 = r10
        L16:
            if (r12 >= r13) goto L96
            int r4 = p221m9.C4445e.m9977t(r11, r12, r14)
            int r2 = r14.f18122a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L49
            r12 = r2 & 7
            if (r12 != r3) goto L44
            m9.q<?> r12 = r9.f18277d
            m9.p r0 = r14.f18125d
            m9.q0 r3 = r9.f18274a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.mo10224b(r0, r3, r5)
            r0 = r12
            m9.x$e r0 = (p221m9.AbstractC4501x.e) r0
            if (r0 != 0) goto L41
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = p221m9.C4445e.m9975r(r2, r3, r4, r5, r6, r7)
            goto L16
        L41:
            m9.a1 r11 = p221m9.C4435a1.f18092c
            throw r10
        L44:
            int r12 = p221m9.C4445e.m9980w(r2, r11, r4, r13, r14)
            goto L16
        L49:
            r12 = 0
            r2 = r10
        L4b:
            if (r4 >= r13) goto L8c
            int r4 = p221m9.C4445e.m9977t(r11, r4, r14)
            int r5 = r14.f18122a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L6d
            r8 = 3
            if (r6 == r8) goto L5d
            goto L82
        L5d:
            if (r0 != 0) goto L6a
            if (r7 != r3) goto L82
            int r4 = p221m9.C4445e.m9958a(r11, r4, r14)
            java.lang.Object r2 = r14.f18124c
            m9.h r2 = (p221m9.AbstractC4454h) r2
            goto L4b
        L6a:
            m9.a1 r11 = p221m9.C4435a1.f18092c
            throw r10
        L6d:
            if (r7 != 0) goto L82
            int r4 = p221m9.C4445e.m9977t(r11, r4, r14)
            int r12 = r14.f18122a
            m9.q<?> r0 = r9.f18277d
            m9.p r5 = r14.f18125d
            m9.q0 r6 = r9.f18274a
            java.lang.Object r0 = r0.mo10224b(r5, r6, r12)
            m9.x$e r0 = (p221m9.AbstractC4501x.e) r0
            goto L4b
        L82:
            r6 = 12
            if (r5 != r6) goto L87
            goto L8c
        L87:
            int r4 = p221m9.C4445e.m9980w(r5, r11, r4, r13, r14)
            goto L4b
        L8c:
            if (r2 == 0) goto L94
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.m10220c(r12, r2)
        L94:
            r12 = r4
            goto L16
        L96:
            if (r12 != r13) goto L99
            return
        L99:
            m9.a0 r10 = p221m9.C4434a0.m9901g()
            throw r10
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: d */
    public void mo9989d(T r2) {
            r1 = this;
            m9.m1<?, ?> r0 = r1.f18275b
            r0.mo10207j(r2)
            m9.q<?> r0 = r1.f18277d
            r0.mo10228f(r2)
            return
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: e */
    public final boolean mo9990e(T r2) {
            r1 = this;
            m9.q<?> r0 = r1.f18277d
            m9.t r2 = r0.mo10225c(r2)
            boolean r2 = r2.m10307i()
            return r2
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: f */
    public boolean mo9991f(T r3, T r4) {
            r2 = this;
            m9.m1<?, ?> r0 = r2.f18275b
            java.lang.Object r0 = r0.mo10204g(r3)
            m9.m1<?, ?> r1 = r2.f18275b
            java.lang.Object r1 = r1.mo10204g(r4)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            r3 = 0
            return r3
        L14:
            boolean r0 = r2.f18276c
            if (r0 == 0) goto L29
            m9.q<?> r0 = r2.f18277d
            m9.t r3 = r0.mo10225c(r3)
            m9.q<?> r0 = r2.f18277d
            m9.t r4 = r0.mo10225c(r4)
            boolean r3 = r3.equals(r4)
            return r3
        L29:
            r3 = 1
            return r3
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: g */
    public int mo9992g(T r5) {
            r4 = this;
            m9.m1<?, ?> r0 = r4.f18275b
            java.lang.Object r1 = r0.mo10204g(r5)
            int r0 = r0.mo10206i(r1)
            r1 = 0
            int r0 = r0 + r1
            boolean r2 = r4.f18276c
            if (r2 == 0) goto L4a
            m9.q<?> r2 = r4.f18277d
            m9.t r5 = r2.mo10225c(r5)
            r2 = 0
        L17:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r3 = r5.f18225a
            int r3 = r3.m10112d()
            if (r1 >= r3) goto L2d
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r3 = r5.f18225a
            java.util.Map$Entry r3 = r3.m10111c(r1)
            int r3 = r5.m10305g(r3)
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L17
        L2d:
            m9.i1<T extends m9.t$a<T>, java.lang.Object> r1 = r5.f18225a
            java.lang.Iterable r1 = r1.m10113e()
            java.util.Iterator r1 = r1.iterator()
        L37:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            int r3 = r5.m10305g(r3)
            int r2 = r2 + r3
            goto L37
        L49:
            int r0 = r0 + r2
        L4a:
            return r0
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: h */
    public T mo9993h() {
            r1 = this;
            m9.q0 r0 = r1.f18274a
            m9.q0$a r0 = r0.mo10236f()
            m9.x$a r0 = (p221m9.AbstractC4501x.a) r0
            m9.x r0 = r0.m10376m()
            return r0
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: i */
    public void mo9994i(T r12, p221m9.InterfaceC4444d1 r13, p221m9.C4478p r14) {
            r11 = this;
            m9.m1<?, ?> r7 = r11.f18275b
            m9.q<?> r8 = r11.f18277d
            java.lang.Object r9 = r7.mo10203f(r12)
            m9.t r10 = r8.mo10226d(r12)
        Lc:
            int r0 = r13.mo9949r()     // Catch: java.lang.Throwable -> L28
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L19
        L15:
            r7.mo10211n(r12, r9)
            goto L27
        L19:
            r0 = r11
            r1 = r13
            r2 = r14
            r3 = r8
            r4 = r10
            r5 = r7
            r6 = r9
            boolean r0 = r0.m10361k(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L15
            goto Lc
        L27:
            return
        L28:
            r13 = move-exception
            r7.mo10211n(r12, r9)
            throw r13
    }

    @Override // p221m9.InterfaceC4447e1
    /* renamed from: j */
    public int mo9995j(T r3) {
            r2 = this;
            m9.m1<?, ?> r0 = r2.f18275b
            java.lang.Object r0 = r0.mo10204g(r3)
            int r0 = r0.hashCode()
            boolean r1 = r2.f18276c
            if (r1 == 0) goto L1b
            m9.q<?> r1 = r2.f18277d
            m9.t r3 = r1.mo10225c(r3)
            int r0 = r0 * 53
            int r3 = r3.hashCode()
            int r0 = r0 + r3
        L1b:
            return r0
    }

    /* renamed from: k */
    public final <UT, UB, ET extends p221m9.C4490t.a<ET>> boolean m10361k(p221m9.InterfaceC4444d1 r7, p221m9.C4478p r8, p221m9.AbstractC4481q<ET> r9, p221m9.C4490t<ET> r10, p221m9.AbstractC4471m1<UT, UB> r11, UB r12) {
            r6 = this;
            int r0 = r7.mo9944m()
            r1 = 1
            r2 = 11
            if (r0 == r2) goto L26
            r2 = r0 & 7
            r3 = 2
            if (r2 != r3) goto L21
            m9.q0 r2 = r6.f18274a
            int r0 = r0 >>> 3
            java.lang.Object r0 = r9.mo10224b(r8, r2, r0)
            if (r0 == 0) goto L1c
            r9.mo10230h(r7, r0, r8, r10)
            return r1
        L1c:
            boolean r7 = r11.m10209l(r12, r7)
            return r7
        L21:
            boolean r7 = r7.mo9919B()
            return r7
        L26:
            r0 = 0
            r2 = 0
            r3 = r2
        L29:
            int r4 = r7.mo9949r()
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r5) goto L33
            goto L5b
        L33:
            int r4 = r7.mo9944m()
            r5 = 16
            if (r4 != r5) goto L46
            int r0 = r7.mo9956y()
            m9.q0 r2 = r6.f18274a
            java.lang.Object r2 = r9.mo10224b(r8, r2, r0)
            goto L29
        L46:
            r5 = 26
            if (r4 != r5) goto L55
            if (r2 == 0) goto L50
            r9.mo10230h(r7, r2, r8, r10)
            goto L29
        L50:
            m9.h r3 = r7.mo9954w()
            goto L29
        L55:
            boolean r4 = r7.mo9919B()
            if (r4 != 0) goto L29
        L5b:
            int r7 = r7.mo9944m()
            r4 = 12
            if (r7 != r4) goto L6f
            if (r3 == 0) goto L6e
            if (r2 == 0) goto L6b
            r9.mo10231i(r3, r2, r8, r10)
            goto L6e
        L6b:
            r11.mo10201d(r12, r0, r3)
        L6e:
            return r1
        L6f:
            m9.a0 r7 = p221m9.C4434a0.m9895a()
            throw r7
    }
}
