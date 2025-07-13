package p124h7;

/* renamed from: h7.k */
/* loaded from: classes.dex */
public final class C2701k extends p124h7.AbstractC2737m {

    /* renamed from: c */
    public static final java.lang.Class<?> f11685c = null;

    static {
            java.util.List r0 = java.util.Collections.emptyList()
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Class r0 = r0.getClass()
            p124h7.C2701k.f11685c = r0
            return
    }

    public /* synthetic */ C2701k() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: d */
    public static <L> java.util.List<L> m6883d(java.lang.Object r3, long r4, int r6) {
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L31
            boolean r1 = r0 instanceof p124h7.InterfaceC2683j
            if (r1 == 0) goto L16
            h7.i r0 = new h7.i
            r0.<init>(r6)
            goto L2b
        L16:
            boolean r1 = r0 instanceof p124h7.InterfaceC2594e0
            if (r1 == 0) goto L26
            boolean r1 = r0 instanceof p124h7.InterfaceC2557c
            if (r1 == 0) goto L26
            h7.c r0 = (p124h7.InterfaceC2557c) r0
            h7.c r6 = r0.mo6521k(r6)
            r0 = r6
            goto L2b
        L26:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L2b:
            e7.i8 r6 = p124h7.C2577d1.f11435c
            r6.m4264N(r3, r4, r0)
            goto L8a
        L31:
            java.lang.Class<?> r1 = p124h7.C2701k.f11685c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L51
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
        L4a:
            e7.i8 r6 = p124h7.C2577d1.f11435c
            r6.m4264N(r3, r4, r1)
            r0 = r1
            goto L8a
        L51:
            boolean r1 = r0 instanceof p124h7.C2972z0
            if (r1 == 0) goto L69
            h7.i r1 = new h7.i
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            h7.z0 r0 = (p124h7.C2972z0) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            goto L4a
        L69:
            boolean r1 = r0 instanceof p124h7.InterfaceC2594e0
            if (r1 == 0) goto L8a
            boolean r1 = r0 instanceof p124h7.InterfaceC2557c
            if (r1 == 0) goto L8a
            r1 = r0
            h7.c r1 = (p124h7.InterfaceC2557c) r1
            boolean r2 = r1.mo6520c()
            if (r2 == 0) goto L7b
            goto L8a
        L7b:
            int r0 = r0.size()
            int r0 = r0 + r6
            h7.c r6 = r1.mo6521k(r0)
            e7.i8 r0 = p124h7.C2577d1.f11435c
            r0.m4264N(r3, r4, r6)
            return r6
        L8a:
            return r0
    }

    @Override // p124h7.AbstractC2737m
    /* renamed from: a */
    public final <L> java.util.List<L> mo6884a(java.lang.Object r2, long r3) {
            r1 = this;
            r0 = 10
            java.util.List r2 = m6883d(r2, r3, r0)
            return r2
    }

    @Override // p124h7.AbstractC2737m
    /* renamed from: b */
    public final void mo6885b(java.lang.Object r4, long r5) {
            r3 = this;
            java.lang.Object r0 = p124h7.C2577d1.m6550j(r4, r5)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0 instanceof p124h7.InterfaceC2683j
            if (r1 == 0) goto L11
            h7.j r0 = (p124h7.InterfaceC2683j) r0
            h7.j r0 = r0.mo6821d()
            goto L36
        L11:
            java.lang.Class<?> r1 = p124h7.C2701k.f11685c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L1e
            return
        L1e:
            boolean r1 = r0 instanceof p124h7.InterfaceC2594e0
            if (r1 == 0) goto L32
            boolean r1 = r0 instanceof p124h7.InterfaceC2557c
            if (r1 == 0) goto L32
            h7.c r0 = (p124h7.InterfaceC2557c) r0
            boolean r4 = r0.mo6520c()
            if (r4 == 0) goto L31
            r0.mo6519b()
        L31:
            return
        L32:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
        L36:
            e7.i8 r1 = p124h7.C2577d1.f11435c
            r1.m4264N(r4, r5, r0)
            return
    }

    @Override // p124h7.AbstractC2737m
    /* renamed from: c */
    public final <E> void mo6886c(java.lang.Object r4, java.lang.Object r5, long r6) {
            r3 = this;
            java.lang.Object r5 = p124h7.C2577d1.m6550j(r5, r6)
            java.util.List r5 = (java.util.List) r5
            int r0 = r5.size()
            java.util.List r0 = m6883d(r4, r6, r0)
            int r1 = r0.size()
            int r2 = r5.size()
            if (r1 <= 0) goto L1d
            if (r2 <= 0) goto L1d
            r0.addAll(r5)
        L1d:
            if (r1 <= 0) goto L20
            r5 = r0
        L20:
            e7.i8 r0 = p124h7.C2577d1.f11435c
            r0.m4264N(r4, r6, r5)
            return
    }
}
