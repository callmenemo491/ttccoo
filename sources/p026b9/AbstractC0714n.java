package p026b9;

/* renamed from: b9.n */
/* loaded from: classes.dex */
public abstract class AbstractC0714n<E> extends p026b9.AbstractC0710l<E> implements java.util.List<E>, java.util.RandomAccess {

    /* renamed from: Z */
    public static final p026b9.AbstractC0688a<java.lang.Object> f3979Z = null;

    /* renamed from: b9.n$a */
    public static final class a<E> extends p026b9.AbstractC0710l.a<E> {
        public a() {
                r1 = this;
                r0 = 4
                r1.<init>(r0)
                return
        }

        /* renamed from: b */
        public p026b9.AbstractC0714n.a<E> m2316b(E r5) {
                r4 = this;
                java.util.Objects.requireNonNull(r5)
                int r0 = r4.f3974b
                int r0 = r0 + 1
                java.lang.Object[] r1 = r4.f3973a
                int r2 = r1.length
                r3 = 0
                if (r2 >= r0) goto L19
                int r2 = r1.length
                int r0 = p026b9.AbstractC0710l.b.m2305a(r2, r0)
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
                r4.f3973a = r0
                goto L25
            L19:
                boolean r0 = r4.f3975c
                if (r0 == 0) goto L27
                java.lang.Object r0 = r1.clone()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                r4.f3973a = r0
            L25:
                r4.f3975c = r3
            L27:
                java.lang.Object[] r0 = r4.f3973a
                int r1 = r4.f3974b
                int r2 = r1 + 1
                r4.f3974b = r2
                r0[r1] = r5
                return r4
        }

        /* renamed from: c */
        public p026b9.AbstractC0714n<E> m2317c() {
                r2 = this;
                r0 = 1
                r2.f3975c = r0
                java.lang.Object[] r0 = r2.f3973a
                int r1 = r2.f3974b
                b9.n r0 = p026b9.AbstractC0714n.m2309q(r0, r1)
                return r0
        }
    }

    /* renamed from: b9.n$b */
    public static class b<E> extends p026b9.AbstractC0688a<E> {

        /* renamed from: a0 */
        public final p026b9.AbstractC0714n<E> f3980a0;

        public b(p026b9.AbstractC0714n<E> r2, int r3) {
                r1 = this;
                int r0 = r2.size()
                r1.<init>(r0, r3)
                r1.f3980a0 = r2
                return
        }
    }

    /* renamed from: b9.n$c */
    public class c extends p026b9.AbstractC0714n<E> {

        /* renamed from: a0 */
        public final transient int f3981a0;

        /* renamed from: b0 */
        public final transient int f3982b0;

        /* renamed from: c0 */
        public final /* synthetic */ p026b9.AbstractC0714n f3983c0;

        public c(p026b9.AbstractC0714n r1, int r2, int r3) {
                r0 = this;
                r0.f3983c0 = r1
                r0.<init>()
                r0.f3981a0 = r2
                r0.f3982b0 = r3
                return
        }

        @Override // p026b9.AbstractC0714n
        /* renamed from: F */
        public p026b9.AbstractC0714n<E> mo2315F(int r3, int r4) {
                r2 = this;
                int r0 = r2.f3982b0
                p124h7.C2939x3.m7283i(r3, r4, r0)
                b9.n r0 = r2.f3983c0
                int r1 = r2.f3981a0
                int r3 = r3 + r1
                int r4 = r4 + r1
                b9.n r3 = r0.mo2315F(r3, r4)
                return r3
        }

        @Override // java.util.List
        public E get(int r3) {
                r2 = this;
                int r0 = r2.f3982b0
                p124h7.C2939x3.m7280f(r3, r0)
                b9.n r0 = r2.f3983c0
                int r1 = r2.f3981a0
                int r3 = r3 + r1
                java.lang.Object r3 = r0.get(r3)
                return r3
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: h */
        public java.lang.Object[] mo2261h() {
                r1 = this;
                b9.n r0 = r1.f3983c0
                java.lang.Object[] r0 = r0.mo2261h()
                return r0
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: i */
        public int mo2262i() {
                r2 = this;
                b9.n r0 = r2.f3983c0
                int r0 = r0.mo2263l()
                int r1 = r2.f3981a0
                int r0 = r0 + r1
                int r1 = r2.f3982b0
                int r0 = r0 + r1
                return r0
        }

        @Override // p026b9.AbstractC0714n, p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
                r1 = this;
                b9.a r0 = r1.m2313A()
                return r0
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: l */
        public int mo2263l() {
                r2 = this;
                b9.n r0 = r2.f3983c0
                int r0 = r0.mo2263l()
                int r1 = r2.f3981a0
                int r0 = r0 + r1
                return r0
        }

        @Override // p026b9.AbstractC0714n, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                r1 = this;
                b9.a r0 = r1.m2313A()
                return r0
        }

        @Override // p026b9.AbstractC0714n, java.util.List
        public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
                r0 = this;
                b9.a r1 = r0.m2314C(r1)
                return r1
        }

        @Override // p026b9.AbstractC0710l
        /* renamed from: m */
        public boolean mo2264m() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                int r0 = r1.f3982b0
                return r0
        }

        @Override // p026b9.AbstractC0714n, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                b9.n r1 = r0.mo2315F(r1, r2)
                return r1
        }
    }

    static {
            b9.n$b r0 = new b9.n$b
            b9.n<java.lang.Object> r1 = p026b9.C0693c0.f3898c0
            r2 = 0
            r0.<init>(r1, r2)
            p026b9.AbstractC0714n.f3979Z = r0
            return
    }

    public AbstractC0714n() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: D */
    public static <E> p026b9.AbstractC0714n<E> m2306D(E r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            b9.n r2 = m2310u(r0)
            return r2
    }

    /* renamed from: E */
    public static <E> p026b9.AbstractC0714n<E> m2307E(E r2, E r3, E r4, E r5, E r6) {
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            r2 = 4
            r0[r2] = r6
            b9.n r2 = m2310u(r0)
            return r2
    }

    /* renamed from: p */
    public static <E> p026b9.AbstractC0714n<E> m2308p(java.lang.Object[] r1) {
            int r0 = r1.length
            b9.n r1 = m2309q(r1, r0)
            return r1
    }

    /* renamed from: q */
    public static <E> p026b9.AbstractC0714n<E> m2309q(java.lang.Object[] r1, int r2) {
            if (r2 != 0) goto L5
            b9.n<java.lang.Object> r1 = p026b9.C0693c0.f3898c0
            return r1
        L5:
            b9.c0 r0 = new b9.c0
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: u */
    public static <E> p026b9.AbstractC0714n<E> m2310u(java.lang.Object... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r3[r1]
            p185k7.C3836i.m8617b(r2, r1)
            int r1 = r1 + 1
            goto L2
        Lc:
            int r0 = r3.length
            b9.n r3 = m2309q(r3, r0)
            return r3
    }

    /* renamed from: w */
    public static <E> p026b9.AbstractC0714n<E> m2311w(java.util.Collection<? extends E> r1) {
            boolean r0 = r1 instanceof p026b9.AbstractC0710l
            if (r0 == 0) goto L19
            b9.l r1 = (p026b9.AbstractC0710l) r1
            b9.n r1 = r1.mo2272a()
            boolean r0 = r1.mo2264m()
            if (r0 == 0) goto L18
            java.lang.Object[] r1 = r1.toArray()
            b9.n r1 = m2308p(r1)
        L18:
            return r1
        L19:
            java.lang.Object[] r1 = r1.toArray()
            b9.n r1 = m2310u(r1)
            return r1
    }

    /* renamed from: z */
    public static <E> p026b9.AbstractC0714n<E> m2312z(E[] r1) {
            int r0 = r1.length
            if (r0 != 0) goto L6
            b9.n<java.lang.Object> r1 = p026b9.C0693c0.f3898c0
            goto L10
        L6:
            java.lang.Object r1 = r1.clone()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            b9.n r1 = m2310u(r1)
        L10:
            return r1
    }

    /* renamed from: A */
    public p026b9.AbstractC0688a m2313A() {
            r1 = this;
            r0 = 0
            b9.a r0 = r1.m2314C(r0)
            return r0
    }

    /* renamed from: C */
    public p026b9.AbstractC0688a m2314C(int r2) {
            r1 = this;
            int r0 = r1.size()
            p124h7.C2939x3.m7282h(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L10
            b9.a<java.lang.Object> r2 = p026b9.AbstractC0714n.f3979Z
            return r2
        L10:
            b9.n$b r0 = new b9.n$b
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: F */
    public p026b9.AbstractC0714n<E> mo2315F(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            p124h7.C2939x3.m7283i(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            b9.n<java.lang.Object> r2 = p026b9.C0693c0.f3898c0
            return r2
        L14:
            b9.n$c r0 = new b9.n$c
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: a */
    public final p026b9.AbstractC0714n<E> mo2272a() {
            r0 = this;
            return r0
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int r1, java.util.Collection<? extends E> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: e */
    public int mo2260e(java.lang.Object[] r5, int r6) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            int r2 = r6 + r1
            java.lang.Object r3 = r4.get(r1)
            r5[r2] = r3
            int r1 = r1 + 1
            goto L5
        L12:
            int r6 = r6 + r0
            return r6
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 != r6) goto L6
        L4:
            r0 = 1
            goto L5b
        L6:
            boolean r2 = r7 instanceof java.util.List
            if (r2 != 0) goto Lb
            goto L5b
        Lb:
            java.util.List r7 = (java.util.List) r7
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
            goto L5b
        L18:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = 0
        L1d:
            if (r3 >= r2) goto L4
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = p185k7.C3836i.m8619d(r4, r5)
            if (r4 != 0) goto L2e
            goto L5b
        L2e:
            int r3 = r3 + 1
            goto L1d
        L31:
            java.util.Iterator r2 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L5b
        L46:
            java.lang.Object r3 = r2.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = p185k7.C3836i.m8619d(r3, r4)
            if (r3 != 0) goto L39
            goto L5b
        L55:
            boolean r7 = r7.hasNext()
            r0 = r7 ^ 1
        L5b:
            return r0
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            int r1 = ~r3
            int r1 = ~r1
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            goto L1a
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L17
            r0 = r2
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    @Override // p026b9.AbstractC0710l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
            r1 = this;
            b9.a r0 = r1.m2313A()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            goto L1a
        L4:
            int r1 = r3.size()
            int r1 = r1 + r0
        L9:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            r0 = r1
            goto L1a
        L17:
            int r1 = r1 + (-1)
            goto L9
        L1a:
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
            r1 = this;
            b9.a r0 = r1.m2313A()
            return r0
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            b9.a r1 = r0.m2314C(r1)
            return r1
    }

    @Override // p026b9.AbstractC0710l
    /* renamed from: n */
    public p026b9.AbstractC0713m0<E> mo2270n() {
            r1 = this;
            b9.a r0 = r1.m2313A()
            return r0
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int r1, E r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            b9.n r1 = r0.mo2315F(r1, r2)
            return r1
    }
}
