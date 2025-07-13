package p432y9;

/* renamed from: y9.c */
/* loaded from: classes.dex */
public final class C7136c<T> {

    /* renamed from: a */
    public final java.util.Set<java.lang.Class<? super T>> f27559a;

    /* renamed from: b */
    public final java.util.Set<p432y9.C7144k> f27560b;

    /* renamed from: c */
    public final int f27561c;

    /* renamed from: d */
    public final int f27562d;

    /* renamed from: e */
    public final p432y9.InterfaceC7139f<T> f27563e;

    /* renamed from: f */
    public final java.util.Set<java.lang.Class<?>> f27564f;

    /* renamed from: y9.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: y9.c$b */
    public static class b<T> {

        /* renamed from: a */
        public final java.util.Set<java.lang.Class<? super T>> f27565a;

        /* renamed from: b */
        public final java.util.Set<p432y9.C7144k> f27566b;

        /* renamed from: c */
        public int f27567c;

        /* renamed from: d */
        public int f27568d;

        /* renamed from: e */
        public p432y9.InterfaceC7139f<T> f27569e;

        /* renamed from: f */
        public java.util.Set<java.lang.Class<?>> f27570f;

        public b(java.lang.Class r3, java.lang.Class[] r4, p432y9.C7136c.a r5) {
                r2 = this;
                r2.<init>()
                java.util.HashSet r5 = new java.util.HashSet
                r5.<init>()
                r2.f27565a = r5
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r2.f27566b = r0
                r0 = 0
                r2.f27567c = r0
                r2.f27568d = r0
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r2.f27570f = r1
                java.lang.String r1 = "Null interface"
                java.util.Objects.requireNonNull(r3, r1)
                r5.add(r3)
                int r3 = r4.length
            L26:
                if (r0 >= r3) goto L30
                r5 = r4[r0]
                java.util.Objects.requireNonNull(r5, r1)
                int r0 = r0 + 1
                goto L26
            L30:
                java.util.Set<java.lang.Class<? super T>> r3 = r2.f27565a
                java.util.Collections.addAll(r3, r4)
                return
        }

        /* renamed from: a */
        public p432y9.C7136c.b<T> m14251a(p432y9.C7144k r3) {
                r2 = this;
                java.lang.Class<?> r0 = r3.f27588a
                java.util.Set<java.lang.Class<? super T>> r1 = r2.f27565a
                boolean r0 = r1.contains(r0)
                r0 = r0 ^ 1
                if (r0 == 0) goto L12
                java.util.Set<y9.k> r0 = r2.f27566b
                r0.add(r3)
                return r2
            L12:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Components are not allowed to depend on interfaces they themselves provide."
                r3.<init>(r0)
                throw r3
        }

        /* renamed from: b */
        public p432y9.C7136c<T> m14252b() {
                r9 = this;
                y9.f<T> r0 = r9.f27569e
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                if (r0 == 0) goto L27
                y9.c r0 = new y9.c
                java.util.HashSet r2 = new java.util.HashSet
                java.util.Set<java.lang.Class<? super T>> r1 = r9.f27565a
                r2.<init>(r1)
                java.util.HashSet r3 = new java.util.HashSet
                java.util.Set<y9.k> r1 = r9.f27566b
                r3.<init>(r1)
                int r4 = r9.f27567c
                int r5 = r9.f27568d
                y9.f<T> r6 = r9.f27569e
                java.util.Set<java.lang.Class<?>> r7 = r9.f27570f
                r8 = 0
                r1 = r0
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return r0
            L27:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Missing required property: factory."
                r0.<init>(r1)
                throw r0
        }

        /* renamed from: c */
        public p432y9.C7136c.b<T> m14253c(p432y9.InterfaceC7139f<T> r1) {
                r0 = this;
                r0.f27569e = r1
                return r0
        }

        /* renamed from: d */
        public final p432y9.C7136c.b<T> m14254d(int r2) {
                r1 = this;
                int r0 = r1.f27567c
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                if (r0 == 0) goto Lc
                r1.f27567c = r2
                return r1
            Lc:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Instantiation type has already been set."
                r2.<init>(r0)
                throw r2
        }
    }

    public C7136c(java.util.Set r1, java.util.Set r2, int r3, int r4, p432y9.InterfaceC7139f r5, java.util.Set r6, p432y9.C7136c.a r7) {
            r0 = this;
            r0.<init>()
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r1)
            r0.f27559a = r1
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r0.f27560b = r1
            r0.f27561c = r3
            r0.f27562d = r4
            r0.f27563e = r5
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r6)
            r0.f27564f = r1
            return
    }

    /* renamed from: a */
    public static <T> p432y9.C7136c.b<T> m14248a(java.lang.Class<T> r3) {
            y9.c$b r0 = new y9.c$b
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @java.lang.SafeVarargs
    /* renamed from: c */
    public static <T> p432y9.C7136c<T> m14249c(T r2, java.lang.Class<T> r3, java.lang.Class<? super T>... r4) {
            y9.c$b r0 = new y9.c$b
            r1 = 0
            r0.<init>(r3, r4, r1)
            y9.b r3 = new y9.b
            r4 = 1
            r3.<init>(r2, r4)
            r0.f27569e = r3
            y9.c r2 = r0.m14252b()
            return r2
    }

    /* renamed from: b */
    public boolean m14250b() {
            r1 = this;
            int r0 = r1.f27562d
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Component<"
            r0.<init>(r1)
            java.util.Set<java.lang.Class<? super T>> r1 = r2.f27559a
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ">{"
            r0.append(r1)
            int r1 = r2.f27561c
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r2.f27562d
            r0.append(r1)
            java.lang.String r1 = ", deps="
            r0.append(r1)
            java.util.Set<y9.k> r1 = r2.f27560b
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
