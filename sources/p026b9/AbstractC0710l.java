package p026b9;

/* renamed from: b9.l */
/* loaded from: classes.dex */
public abstract class AbstractC0710l<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {

    /* renamed from: Y */
    public static final java.lang.Object[] f3972Y = null;

    /* renamed from: b9.l$a */
    public static abstract class a<E> extends p026b9.AbstractC0710l.b<E> {

        /* renamed from: a */
        public java.lang.Object[] f3973a;

        /* renamed from: b */
        public int f3974b;

        /* renamed from: c */
        public boolean f3975c;

        public a(int r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "initialCapacity"
                p026b9.C0720t.m2328b(r2, r0)
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r1.f3973a = r2
                r2 = 0
                r1.f3974b = r2
                return
        }
    }

    /* renamed from: b9.l$b */
    public static abstract class b<E> {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static int m2305a(int r1, int r2) {
                if (r2 < 0) goto L17
                int r0 = r1 >> 1
                int r1 = r1 + r0
                int r1 = r1 + 1
                if (r1 >= r2) goto L11
                int r2 = r2 + (-1)
                int r1 = java.lang.Integer.highestOneBit(r2)
                int r1 = r1 << 1
            L11:
                if (r1 >= 0) goto L16
                r1 = 2147483647(0x7fffffff, float:NaN)
            L16:
                return r1
            L17:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                java.lang.String r2 = "cannot store more than MAX_VALUE elements"
                r1.<init>(r2)
                throw r1
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            p026b9.AbstractC0710l.f3972Y = r0
            return
    }

    public AbstractC0710l() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public p026b9.AbstractC0714n<E> mo2272a() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            b9.a<java.lang.Object> r0 = p026b9.AbstractC0714n.f3979Z
            b9.n<java.lang.Object> r0 = p026b9.C0693c0.f3898c0
            goto L13
        Lb:
            java.lang.Object[] r0 = r1.toArray()
            b9.n r0 = p026b9.AbstractC0714n.m2308p(r0)
        L13:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(E r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection<? extends E> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(java.lang.Object r1);

    /* renamed from: e */
    public int mo2260e(java.lang.Object[] r4, int r5) {
            r3 = this;
            b9.m0 r0 = r3.mo2270n()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r0.next()
            int r2 = r5 + 1
            r4[r5] = r1
            r5 = r2
            goto L4
        L14:
            return r5
    }

    /* renamed from: h */
    public java.lang.Object[] mo2261h() {
            r1 = this;
            r0 = 0
            return r0
    }

    /* renamed from: i */
    public int mo2262i() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ java.util.Iterator iterator() {
            r1 = this;
            b9.m0 r0 = r1.mo2270n()
            return r0
    }

    /* renamed from: l */
    public int mo2263l() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* renamed from: m */
    public abstract boolean mo2264m();

    /* renamed from: n */
    public abstract p026b9.AbstractC0713m0<E> mo2270n();

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection<?> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = p026b9.AbstractC0710l.f3972Y
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            int r0 = r3.size()
            int r1 = r4.length
            if (r1 >= r0) goto L30
            java.lang.Object[] r1 = r3.mo2261h()
            if (r1 == 0) goto L21
            int r0 = r3.mo2263l()
            int r2 = r3.mo2262i()
            java.lang.Class r4 = r4.getClass()
            java.lang.Object[] r4 = java.util.Arrays.copyOfRange(r1, r0, r2, r4)
            return r4
        L21:
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            goto L36
        L30:
            int r1 = r4.length
            if (r1 <= r0) goto L36
            r1 = 0
            r4[r0] = r1
        L36:
            r0 = 0
            r3.mo2260e(r4, r0)
            return r4
    }
}
