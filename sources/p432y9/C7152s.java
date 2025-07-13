package p432y9;

/* renamed from: y9.s */
/* loaded from: classes.dex */
public final class C7152s extends p432y9.AbstractC7134a {

    /* renamed from: a */
    public final java.util.Set<java.lang.Class<?>> f27604a;

    /* renamed from: b */
    public final java.util.Set<java.lang.Class<?>> f27605b;

    /* renamed from: c */
    public final java.util.Set<java.lang.Class<?>> f27606c;

    /* renamed from: d */
    public final java.util.Set<java.lang.Class<?>> f27607d;

    /* renamed from: e */
    public final java.util.Set<java.lang.Class<?>> f27608e;

    /* renamed from: f */
    public final java.util.Set<java.lang.Class<?>> f27609f;

    /* renamed from: g */
    public final p432y9.InterfaceC7137d f27610g;

    /* renamed from: y9.s$a */
    public static class a implements p342ta.InterfaceC6205c {

        /* renamed from: a */
        public final p342ta.InterfaceC6205c f27611a;

        public a(java.util.Set<java.lang.Class<?>> r1, p342ta.InterfaceC6205c r2) {
                r0 = this;
                r0.<init>()
                r0.f27611a = r2
                return
        }
    }

    public C7152s(p432y9.C7136c<?> r12, p432y9.InterfaceC7137d r13) {
            r11 = this;
            r11.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set<y9.k> r5 = r12.f27560b
            java.util.Iterator r5 = r5.iterator()
        L22:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L69
            java.lang.Object r6 = r5.next()
            y9.k r6 = (p432y9.C7144k) r6
            int r7 = r6.f27590c
            r8 = 0
            r9 = 1
            if (r7 != 0) goto L36
            r10 = 1
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 == 0) goto L4b
            boolean r7 = r6.m14264a()
            if (r7 == 0) goto L45
            java.lang.Class<?> r6 = r6.f27588a
            r3.add(r6)
            goto L22
        L45:
            java.lang.Class<?> r6 = r6.f27588a
            r0.add(r6)
            goto L22
        L4b:
            r10 = 2
            if (r7 != r10) goto L4f
            r8 = 1
        L4f:
            if (r8 == 0) goto L57
            java.lang.Class<?> r6 = r6.f27588a
            r2.add(r6)
            goto L22
        L57:
            boolean r7 = r6.m14264a()
            if (r7 == 0) goto L63
            java.lang.Class<?> r6 = r6.f27588a
            r4.add(r6)
            goto L22
        L63:
            java.lang.Class<?> r6 = r6.f27588a
            r1.add(r6)
            goto L22
        L69:
            java.util.Set<java.lang.Class<?>> r5 = r12.f27564f
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L76
            java.lang.Class<ta.c> r5 = p342ta.InterfaceC6205c.class
            r0.add(r5)
        L76:
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r11.f27604a = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            r11.f27605b = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r2)
            r11.f27606c = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r3)
            r11.f27607d = r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r4)
            r11.f27608e = r0
            java.util.Set<java.lang.Class<?>> r12 = r12.f27564f
            r11.f27609f = r12
            r11.f27610g = r13
            return
    }

    @Override // p432y9.AbstractC7134a, p432y9.InterfaceC7137d
    /* renamed from: a */
    public <T> T mo14246a(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Set<java.lang.Class<?>> r0 = r3.f27604a
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L21
            y9.d r0 = r3.f27610g
            java.lang.Object r0 = r0.mo14246a(r4)
            java.lang.Class<ta.c> r1 = p342ta.InterfaceC6205c.class
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L17
            return r0
        L17:
            y9.s$a r4 = new y9.s$a
            java.util.Set<java.lang.Class<?>> r1 = r3.f27609f
            ta.c r0 = (p342ta.InterfaceC6205c) r0
            r4.<init>(r1, r0)
            return r4
        L21:
            h7.u0 r0 = new h7.u0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency %s."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // p432y9.AbstractC7134a, p432y9.InterfaceC7137d
    /* renamed from: b */
    public <T> java.util.Set<T> mo14247b(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Set<java.lang.Class<?>> r0 = r3.f27607d
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            y9.d r0 = r3.f27610g
            java.util.Set r4 = r0.mo14247b(r4)
            return r4
        Lf:
            h7.u0 r0 = new h7.u0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Set<%s>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // p432y9.InterfaceC7137d
    /* renamed from: c */
    public <T> p392wa.InterfaceC6823b<T> mo14255c(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Set<java.lang.Class<?>> r0 = r3.f27605b
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            y9.d r0 = r3.f27610g
            wa.b r4 = r0.mo14255c(r4)
            return r4
        Lf:
            h7.u0 r0 = new h7.u0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Provider<%s>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // p432y9.InterfaceC7137d
    /* renamed from: d */
    public <T> p392wa.InterfaceC6823b<java.util.Set<T>> mo14256d(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Set<java.lang.Class<?>> r0 = r3.f27608e
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            y9.d r0 = r3.f27610g
            wa.b r4 = r0.mo14256d(r4)
            return r4
        Lf:
            h7.u0 r0 = new h7.u0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Provider<Set<%s>>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // p432y9.InterfaceC7137d
    /* renamed from: e */
    public <T> p392wa.InterfaceC6822a<T> mo14257e(java.lang.Class<T> r4) {
            r3 = this;
            java.util.Set<java.lang.Class<?>> r0 = r3.f27606c
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            y9.d r0 = r3.f27610g
            wa.a r4 = r0.mo14257e(r4)
            return r4
        Lf:
            h7.u0 r0 = new h7.u0
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "Attempting to request an undeclared dependency Deferred<%s>."
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }
}
