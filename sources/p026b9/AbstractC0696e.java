package p026b9;

/* renamed from: b9.e */
/* loaded from: classes.dex */
public abstract class AbstractC0696e<K, V> extends p026b9.AbstractC0700g<K, V> implements java.io.Serializable {

    /* renamed from: b0 */
    public transient java.util.Map<K, java.util.Collection<V>> f3915b0;

    /* renamed from: c0 */
    public transient int f3916c0;

    /* renamed from: b9.e$a */
    public class a extends p026b9.C0722v.d<K, java.util.Collection<V>> {

        /* renamed from: a0 */
        public final transient java.util.Map<K, java.util.Collection<V>> f3917a0;

        /* renamed from: b0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3918b0;

        /* renamed from: b9.e$a$a, reason: collision with other inner class name */
        public class C7368a extends p026b9.C0722v.a<K, java.util.Collection<V>> {

            /* renamed from: Y */
            public final /* synthetic */ p026b9.AbstractC0696e.a f3919Y;

            public C7368a(p026b9.AbstractC0696e.a r1) {
                    r0 = this;
                    r0.f3919Y = r1
                    r0.<init>()
                    return
            }

            @Override // p026b9.C0722v.a, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(java.lang.Object r2) {
                    r1 = this;
                    b9.e$a r0 = r1.f3919Y
                    java.util.Map<K, java.util.Collection<V>> r0 = r0.f3917a0
                    java.util.Set r0 = r0.entrySet()
                    java.util.Objects.requireNonNull(r0)
                    boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> L10
                    goto L11
                L10:
                    r2 = 0
                L11:
                    return r2
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> iterator() {
                    r2 = this;
                    b9.e$a$b r0 = new b9.e$a$b
                    b9.e$a r1 = r2.f3919Y
                    r0.<init>(r1)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(java.lang.Object r3) {
                    r2 = this;
                    boolean r0 = r2.contains(r3)
                    if (r0 != 0) goto L8
                    r3 = 0
                    return r3
                L8:
                    java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                    b9.e$a r0 = r2.f3919Y
                    b9.e r0 = r0.f3918b0
                    java.lang.Object r3 = r3.getKey()
                    java.util.Map<K, java.util.Collection<V>> r1 = r0.f3915b0
                    java.util.Objects.requireNonNull(r1)
                    java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L1c
                    goto L1d
                L1c:
                    r3 = 0
                L1d:
                    java.util.Collection r3 = (java.util.Collection) r3
                    if (r3 == 0) goto L2d
                    int r1 = r3.size()
                    r3.clear()
                    int r3 = r0.f3916c0
                    int r3 = r3 - r1
                    r0.f3916c0 = r3
                L2d:
                    r3 = 1
                    return r3
            }
        }

        /* renamed from: b9.e$a$b */
        public class b implements java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> {

            /* renamed from: Y */
            public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> f3920Y;

            /* renamed from: Z */
            public java.util.Collection<V> f3921Z;

            /* renamed from: a0 */
            public final /* synthetic */ p026b9.AbstractC0696e.a f3922a0;

            public b(p026b9.AbstractC0696e.a r1) {
                    r0 = this;
                    r0.f3922a0 = r1
                    r0.<init>()
                    java.util.Map<K, java.util.Collection<V>> r1 = r1.f3917a0
                    java.util.Set r1 = r1.entrySet()
                    java.util.Iterator r1 = r1.iterator()
                    r0.f3920Y = r1
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r1.f3920Y
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                    r2 = this;
                    java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r2.f3920Y
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    java.util.Collection r1 = (java.util.Collection) r1
                    r2.f3921Z = r1
                    b9.e$a r1 = r2.f3922a0
                    java.util.Map$Entry r0 = r1.m2277a(r0)
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r3 = this;
                    java.util.Collection<V> r0 = r3.f3921Z
                    if (r0 == 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    p026b9.C0720t.m2329c(r0)
                    java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r3.f3920Y
                    r0.remove()
                    b9.e$a r0 = r3.f3922a0
                    b9.e r0 = r0.f3918b0
                    int r1 = r0.f3916c0
                    java.util.Collection<V> r2 = r3.f3921Z
                    int r2 = r2.size()
                    int r1 = r1 - r2
                    r0.f3916c0 = r1
                    java.util.Collection<V> r0 = r3.f3921Z
                    r0.clear()
                    r0 = 0
                    r3.f3921Z = r0
                    return
            }
        }

        public a(p026b9.AbstractC0696e r1, java.util.Map<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.f3918b0 = r1
                r0.<init>()
                r0.f3917a0 = r2
                return
        }

        /* renamed from: a */
        public java.util.Map.Entry<K, java.util.Collection<V>> m2277a(java.util.Map.Entry<K, java.util.Collection<V>> r5) {
                r4 = this;
                java.lang.Object r0 = r5.getKey()
                b9.e r1 = r4.f3918b0
                java.lang.Object r5 = r5.getValue()
                java.util.Collection r5 = (java.util.Collection) r5
                b9.c r1 = (p026b9.AbstractC0692c) r1
                java.util.Objects.requireNonNull(r1)
                java.util.List r5 = (java.util.List) r5
                boolean r2 = r5 instanceof java.util.RandomAccess
                r3 = 0
                if (r2 == 0) goto L1e
                b9.e$f r2 = new b9.e$f
                r2.<init>(r1, r0, r5, r3)
                goto L23
            L1e:
                b9.e$j r2 = new b9.e$j
                r2.<init>(r1, r0, r5, r3)
            L23:
                b9.m r5 = new b9.m
                r5.<init>(r0, r2)
                return r5
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
                r5 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r5.f3917a0
                b9.e r1 = r5.f3918b0
                java.util.Map<K, java.util.Collection<V>> r2 = r1.f3915b0
                if (r0 != r2) goto Lc
                r1.m2275d()
                goto L45
            Lc:
                java.util.Map<K, java.util.Collection<V>> r0 = r5.f3917a0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L16:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L45
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                java.util.Collection r2 = (java.util.Collection) r2
                r5.m2277a(r1)
                if (r2 == 0) goto L2f
                r1 = 1
                goto L30
            L2f:
                r1 = 0
            L30:
                p026b9.C0720t.m2329c(r1)
                r0.remove()
                b9.e r1 = r5.f3918b0
                int r3 = r1.f3916c0
                int r4 = r2.size()
                int r3 = r3 - r4
                r1.f3916c0 = r3
                r2.clear()
                goto L16
            L45:
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                java.util.Objects.requireNonNull(r0)
                boolean r2 = r0.containsKey(r2)     // Catch: java.lang.Throwable -> La
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto Ld
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto Lb
                goto Ld
            Lb:
                r2 = 0
                goto Le
            Ld:
                r2 = 1
            Le:
                return r2
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.lang.Object get(java.lang.Object r5) {
                r4 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r4.f3917a0
                java.util.Objects.requireNonNull(r0)
                r1 = 0
                java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> Lb
                goto Lc
            Lb:
                r0 = r1
            Lc:
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 != 0) goto L11
                goto L2a
            L11:
                b9.e r2 = r4.f3918b0
                b9.c r2 = (p026b9.AbstractC0692c) r2
                java.util.Objects.requireNonNull(r2)
                java.util.List r0 = (java.util.List) r0
                boolean r3 = r0 instanceof java.util.RandomAccess
                if (r3 == 0) goto L24
                b9.e$f r3 = new b9.e$f
                r3.<init>(r2, r5, r0, r1)
                goto L29
            L24:
                b9.e$j r3 = new b9.e$j
                r3.<init>(r2, r5, r0, r1)
            L29:
                r1 = r3
            L2a:
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<K> keySet() {
                r4 = this;
                b9.e r0 = r4.f3918b0
                java.util.Set<K> r1 = r0.f3954Y
                if (r1 != 0) goto L32
                r1 = r0
                b9.y r1 = (p026b9.C0725y) r1
                java.util.Map<K, java.util.Collection<V>> r2 = r1.f3915b0
                boolean r3 = r2 instanceof java.util.NavigableMap
                if (r3 == 0) goto L1a
                b9.e$e r2 = new b9.e$e
                java.util.Map<K, java.util.Collection<V>> r3 = r1.f3915b0
                java.util.NavigableMap r3 = (java.util.NavigableMap) r3
                r2.<init>(r1, r3)
            L18:
                r1 = r2
                goto L30
            L1a:
                boolean r2 = r2 instanceof java.util.SortedMap
                if (r2 == 0) goto L28
                b9.e$h r2 = new b9.e$h
                java.util.Map<K, java.util.Collection<V>> r3 = r1.f3915b0
                java.util.SortedMap r3 = (java.util.SortedMap) r3
                r2.<init>(r1, r3)
                goto L18
            L28:
                b9.e$c r2 = new b9.e$c
                java.util.Map<K, java.util.Collection<V>> r3 = r1.f3915b0
                r2.<init>(r1, r3)
                goto L18
            L30:
                r0.f3954Y = r1
            L32:
                return r1
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.lang.Object remove(java.lang.Object r5) {
                r4 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r4.f3917a0
                java.lang.Object r5 = r0.remove(r5)
                java.util.Collection r5 = (java.util.Collection) r5
                if (r5 != 0) goto Lc
                r5 = 0
                goto L24
            Lc:
                b9.e r0 = r4.f3918b0
                java.util.Collection r0 = r0.mo2276e()
                r0.addAll(r5)
                b9.e r1 = r4.f3918b0
                int r2 = r1.f3916c0
                int r3 = r5.size()
                int r2 = r2 - r3
                r1.f3916c0 = r2
                r5.clear()
                r5 = r0
            L24:
                return r5
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractMap
        public java.lang.String toString() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: b9.e$b */
    public abstract class b<T> implements java.util.Iterator<T> {

        /* renamed from: Y */
        public final java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> f3923Y;

        /* renamed from: Z */
        public K f3924Z;

        /* renamed from: a0 */
        public java.util.Collection<V> f3925a0;

        /* renamed from: b0 */
        public java.util.Iterator<V> f3926b0;

        /* renamed from: c0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3927c0;

        public b(p026b9.AbstractC0696e r1) {
                r0 = this;
                r0.f3927c0 = r1
                r0.<init>()
                java.util.Map<K, java.util.Collection<V>> r1 = r1.f3915b0
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r0.f3923Y = r1
                r1 = 0
                r0.f3924Z = r1
                r0.f3925a0 = r1
                b9.s r1 = p026b9.EnumC0719s.f3995Y
                r0.f3926b0 = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r1.f3923Y
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L13
                java.util.Iterator<V> r0 = r1.f3926b0
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L11
                goto L13
            L11:
                r0 = 0
                goto L14
            L13:
                r0 = 1
            L14:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r2 = this;
                java.util.Iterator<V> r0 = r2.f3926b0
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L24
                java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r2.f3923Y
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                r2.f3924Z = r1
                java.lang.Object r0 = r0.getValue()
                java.util.Collection r0 = (java.util.Collection) r0
                r2.f3925a0 = r0
                java.util.Iterator r0 = r0.iterator()
                r2.f3926b0 = r0
            L24:
                java.util.Iterator<V> r0 = r2.f3926b0
                java.lang.Object r0 = r0.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<V> r0 = r1.f3926b0
                r0.remove()
                java.util.Collection<V> r0 = r1.f3925a0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L12
                java.util.Iterator<java.util.Map$Entry<K, java.util.Collection<V>>> r0 = r1.f3923Y
                r0.remove()
            L12:
                b9.e r0 = r1.f3927c0
                p026b9.AbstractC0696e.m2274c(r0)
                return
        }
    }

    /* renamed from: b9.e$c */
    public class c extends p026b9.C0722v.b<K, java.util.Collection<V>> {

        /* renamed from: Z */
        public final /* synthetic */ p026b9.AbstractC0696e f3928Z;

        /* renamed from: b9.e$c$a */
        public class a implements java.util.Iterator<K> {

            /* renamed from: Y */
            public java.util.Map.Entry<K, java.util.Collection<V>> f3929Y;

            /* renamed from: Z */
            public final /* synthetic */ java.util.Iterator f3930Z;

            /* renamed from: a0 */
            public final /* synthetic */ p026b9.AbstractC0696e.c f3931a0;

            public a(p026b9.AbstractC0696e.c r1, java.util.Iterator r2) {
                    r0 = this;
                    r0.f3931a0 = r1
                    r0.f3930Z = r2
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f3930Z
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public K next() {
                    r1 = this;
                    java.util.Iterator r0 = r1.f3930Z
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    r1.f3929Y = r0
                    java.lang.Object r0 = r0.getKey()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r4 = this;
                    java.util.Map$Entry<K, java.util.Collection<V>> r0 = r4.f3929Y
                    if (r0 == 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    p026b9.C0720t.m2329c(r0)
                    java.util.Map$Entry<K, java.util.Collection<V>> r0 = r4.f3929Y
                    java.lang.Object r0 = r0.getValue()
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.util.Iterator r1 = r4.f3930Z
                    r1.remove()
                    b9.e$c r1 = r4.f3931a0
                    b9.e r1 = r1.f3928Z
                    int r2 = r1.f3916c0
                    int r3 = r0.size()
                    int r2 = r2 - r3
                    r1.f3916c0 = r2
                    r0.clear()
                    r0 = 0
                    r4.f3929Y = r0
                    return
            }
        }

        public c(p026b9.AbstractC0696e r1, java.util.Map<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.f3928Z = r1
                r0.<init>(r2)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r3 = this;
                java.util.Iterator r0 = r3.iterator()
            L4:
                r1 = r0
                b9.e$c$a r1 = (p026b9.AbstractC0696e.c.a) r1
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L14
                r1.next()
                r1.remove()
                goto L4
            L14:
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                java.util.Set r0 = r0.keySet()
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r1 == r2) goto L11
                java.util.Map<K, V> r0 = r1.f3997Y
                java.util.Set r0 = r0.keySet()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                goto L12
            L11:
                r2 = 1
            L12:
                return r2
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                java.util.Set r0 = r0.keySet()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.f3997Y
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                b9.e$c$a r1 = new b9.e$c$a
                r1.<init>(r2, r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                java.util.Map<K, V> r0 = r3.f3997Y
                java.lang.Object r4 = r0.remove(r4)
                java.util.Collection r4 = (java.util.Collection) r4
                r0 = 0
                if (r4 == 0) goto L1a
                int r1 = r4.size()
                r4.clear()
                b9.e r4 = r3.f3928Z
                int r2 = r4.f3916c0
                int r2 = r2 - r1
                r4.f3916c0 = r2
                goto L1b
            L1a:
                r1 = 0
            L1b:
                if (r1 <= 0) goto L1e
                r0 = 1
            L1e:
                return r0
        }
    }

    /* renamed from: b9.e$d */
    public class d extends p026b9.AbstractC0696e<K, V>.g implements java.util.NavigableMap<K, java.util.Collection<V>> {

        /* renamed from: e0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3932e0;

        public d(p026b9.AbstractC0696e r1, java.util.NavigableMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.f3932e0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // p026b9.AbstractC0696e.g
        /* renamed from: b */
        public java.util.SortedSet mo2278b() {
                r3 = this;
                b9.e$e r0 = new b9.e$e
                b9.e r1 = r3.f3932e0
                java.util.NavigableMap r2 = r3.m2283g()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // p026b9.AbstractC0696e.g
        /* renamed from: c */
        public /* bridge */ /* synthetic */ java.util.SortedSet mo2279c() {
                r1 = this;
                java.util.NavigableSet r0 = r1.m2281e()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.util.Map$Entry r2 = r0.ceilingEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.m2277a(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        @Override // p026b9.AbstractC0696e.g
        /* renamed from: d */
        public /* bridge */ /* synthetic */ java.util.SortedMap mo2280d() {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> descendingKeySet() {
                r1 = this;
                java.util.NavigableMap r0 = r1.descendingMap()
                b9.e$d r0 = (p026b9.AbstractC0696e.d) r0
                java.util.NavigableSet r0 = r0.navigableKeySet()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> descendingMap() {
                r3 = this;
                b9.e$d r0 = new b9.e$d
                b9.e r1 = r3.f3932e0
                java.util.NavigableMap r2 = r3.m2283g()
                java.util.NavigableMap r2 = r2.descendingMap()
                r0.<init>(r1, r2)
                return r0
        }

        /* renamed from: e */
        public java.util.NavigableSet<K> m2281e() {
                r1 = this;
                java.util.SortedSet<K> r0 = r1.f3934c0
                if (r0 != 0) goto La
                java.util.SortedSet r0 = r1.mo2278b()
                r1.f3934c0 = r0
            La:
                java.util.NavigableSet r0 = (java.util.NavigableSet) r0
                return r0
        }

        /* renamed from: f */
        public java.util.Map.Entry<K, java.util.Collection<V>> m2282f(java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> r4) {
                r3 = this;
                boolean r0 = r4.hasNext()
                if (r0 != 0) goto L8
                r4 = 0
                return r4
            L8:
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                b9.e r1 = r3.f3932e0
                java.util.Collection r1 = r1.mo2276e()
                java.lang.Object r2 = r0.getValue()
                java.util.Collection r2 = (java.util.Collection) r2
                r1.addAll(r2)
                r4.remove()
                java.lang.Object r4 = r0.getKey()
                b9.e r0 = r3.f3932e0
                b9.c r0 = (p026b9.AbstractC0692c) r0
                java.util.Objects.requireNonNull(r0)
                java.util.List r1 = (java.util.List) r1
                java.util.List r0 = java.util.Collections.unmodifiableList(r1)
                b9.m r1 = new b9.m
                r1.<init>(r4, r0)
                return r1
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> firstEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.util.Map$Entry r0 = r0.firstEntry()
                if (r0 != 0) goto Lc
                r0 = 0
                goto L10
            Lc:
                java.util.Map$Entry r0 = r1.m2277a(r0)
            L10:
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> floorEntry(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.util.Map$Entry r2 = r0.floorEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.m2277a(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        public K floorKey(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        /* renamed from: g */
        public java.util.NavigableMap<K, java.util.Collection<V>> m2283g() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> headMap(K r4, boolean r5) {
                r3 = this;
                b9.e$d r0 = new b9.e$d
                b9.e r1 = r3.f3932e0
                java.util.NavigableMap r2 = r3.m2283g()
                java.util.NavigableMap r4 = r2.headMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.g, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap headMap(java.lang.Object r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableMap r2 = r1.headMap(r2, r0)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> higherEntry(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.util.Map$Entry r2 = r0.higherEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.m2277a(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        public K higherKey(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // p026b9.AbstractC0696e.g, p026b9.AbstractC0696e.a, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.m2281e()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> lastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.util.Map$Entry r0 = r0.lastEntry()
                if (r0 != 0) goto Lc
                r0 = 0
                goto L10
            Lc:
                java.util.Map$Entry r0 = r1.m2277a(r0)
            L10:
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.util.Map$Entry r2 = r0.lowerEntry(r2)
                if (r2 != 0) goto Lc
                r2 = 0
                goto L10
            Lc:
                java.util.Map$Entry r2 = r1.m2277a(r2)
            L10:
                return r2
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2283g()
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableSet<K> navigableKeySet() {
                r1 = this;
                java.util.NavigableSet r0 = r1.m2281e()
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
                r1 = this;
                java.util.Set r0 = r1.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Map$Entry r0 = r1.m2282f(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
                r1 = this;
                java.util.NavigableMap r0 = r1.descendingMap()
                b9.v$d r0 = (p026b9.C0722v.d) r0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                java.util.Map$Entry r0 = r1.m2282f(r0)
                return r0
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> subMap(K r4, boolean r5, K r6, boolean r7) {
                r3 = this;
                b9.e$d r0 = new b9.e$d
                b9.e r1 = r3.f3932e0
                java.util.NavigableMap r2 = r3.m2283g()
                java.util.NavigableMap r4 = r2.subMap(r4, r5, r6, r7)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.g, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap subMap(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableMap r3 = r2.subMap(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableMap
        public java.util.NavigableMap<K, java.util.Collection<V>> tailMap(K r4, boolean r5) {
                r3 = this;
                b9.e$d r0 = new b9.e$d
                b9.e r1 = r3.f3932e0
                java.util.NavigableMap r2 = r3.m2283g()
                java.util.NavigableMap r4 = r2.tailMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.g, java.util.SortedMap, java.util.NavigableMap
        public java.util.SortedMap tailMap(java.lang.Object r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableMap r2 = r1.tailMap(r2, r0)
                return r2
        }
    }

    /* renamed from: b9.e$e */
    public class e extends p026b9.AbstractC0696e<K, V>.h implements java.util.NavigableSet<K> {

        /* renamed from: b0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3933b0;

        public e(p026b9.AbstractC0696e r1, java.util.NavigableMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.f3933b0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // p026b9.AbstractC0696e.h
        /* renamed from: a */
        public /* bridge */ /* synthetic */ java.util.SortedMap mo2284a() {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2285e()
                return r0
        }

        @Override // java.util.NavigableSet
        public K ceiling(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2285e()
                java.lang.Object r2 = r0.ceilingKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.Iterator<K> descendingIterator() {
                r1 = this;
                java.util.NavigableSet r0 = r1.descendingSet()
                b9.e$c r0 = (p026b9.AbstractC0696e.c) r0
                java.util.Iterator r0 = r0.iterator()
                return r0
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> descendingSet() {
                r3 = this;
                b9.e$e r0 = new b9.e$e
                b9.e r1 = r3.f3933b0
                java.util.NavigableMap r2 = r3.m2285e()
                java.util.NavigableMap r2 = r2.descendingMap()
                r0.<init>(r1, r2)
                return r0
        }

        /* renamed from: e */
        public java.util.NavigableMap<K, java.util.Collection<V>> m2285e() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                java.util.NavigableMap r0 = (java.util.NavigableMap) r0
                return r0
        }

        @Override // java.util.NavigableSet
        public K floor(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2285e()
                java.lang.Object r2 = r0.floorKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> headSet(K r4, boolean r5) {
                r3 = this;
                b9.e$e r0 = new b9.e$e
                b9.e r1 = r3.f3933b0
                java.util.NavigableMap r2 = r3.m2285e()
                java.util.NavigableMap r4 = r2.headMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.h, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet headSet(java.lang.Object r2) {
                r1 = this;
                r0 = 0
                java.util.NavigableSet r2 = r1.headSet(r2, r0)
                return r2
        }

        @Override // java.util.NavigableSet
        public K higher(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2285e()
                java.lang.Object r2 = r0.higherKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public K lower(K r2) {
                r1 = this;
                java.util.NavigableMap r0 = r1.m2285e()
                java.lang.Object r2 = r0.lowerKey(r2)
                return r2
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
                r2 = this;
                java.util.Iterator r0 = r2.iterator()
                b9.e$c$a r0 = (p026b9.AbstractC0696e.c.a) r0
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L14
                java.lang.Object r1 = r0.next()
                r0.remove()
                goto L15
            L14:
                r1 = 0
            L15:
                return r1
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
                r2 = this;
                java.util.Iterator r0 = r2.descendingIterator()
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L12
                java.lang.Object r1 = r0.next()
                r0.remove()
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> subSet(K r4, boolean r5, K r6, boolean r7) {
                r3 = this;
                b9.e$e r0 = new b9.e$e
                b9.e r1 = r3.f3933b0
                java.util.NavigableMap r2 = r3.m2285e()
                java.util.NavigableMap r4 = r2.subMap(r4, r5, r6, r7)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.h, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet subSet(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                java.util.NavigableSet r3 = r2.subSet(r3, r0, r4, r1)
                return r3
        }

        @Override // java.util.NavigableSet
        public java.util.NavigableSet<K> tailSet(K r4, boolean r5) {
                r3 = this;
                b9.e$e r0 = new b9.e$e
                b9.e r1 = r3.f3933b0
                java.util.NavigableMap r2 = r3.m2285e()
                java.util.NavigableMap r4 = r2.tailMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.h, java.util.SortedSet, java.util.NavigableSet
        public java.util.SortedSet tailSet(java.lang.Object r2) {
                r1 = this;
                r0 = 1
                java.util.NavigableSet r2 = r1.tailSet(r2, r0)
                return r2
        }
    }

    /* renamed from: b9.e$f */
    public class f extends p026b9.AbstractC0696e<K, V>.j implements java.util.RandomAccess {
        public f(p026b9.AbstractC0696e r1, K r2, java.util.List<V> r3, p026b9.AbstractC0696e<K, V>.i r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }
    }

    /* renamed from: b9.e$g */
    public class g extends p026b9.AbstractC0696e<K, V>.a implements java.util.SortedMap<K, java.util.Collection<V>> {

        /* renamed from: c0 */
        public java.util.SortedSet<K> f3934c0;

        /* renamed from: d0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3935d0;

        public g(p026b9.AbstractC0696e r1, java.util.SortedMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.f3935d0 = r1
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: b */
        public java.util.SortedSet<K> mo2278b() {
                r3 = this;
                b9.e$h r0 = new b9.e$h
                b9.e r1 = r3.f3935d0
                java.util.SortedMap r2 = r3.mo2280d()
                r0.<init>(r1, r2)
                return r0
        }

        /* renamed from: c */
        public java.util.SortedSet<K> mo2279c() {
                r1 = this;
                java.util.SortedSet<K> r0 = r1.f3934c0
                if (r0 != 0) goto La
                java.util.SortedSet r0 = r1.mo2278b()
                r1.f3934c0 = r0
            La:
                return r0
        }

        @Override // java.util.SortedMap
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedMap r0 = r1.mo2280d()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        /* renamed from: d */
        public java.util.SortedMap<K, java.util.Collection<V>> mo2280d() {
                r1 = this;
                java.util.Map<K, java.util.Collection<V>> r0 = r1.f3917a0
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        @Override // java.util.SortedMap
        public K firstKey() {
                r1 = this;
                java.util.SortedMap r0 = r1.mo2280d()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> headMap(K r4) {
                r3 = this;
                b9.e$g r0 = new b9.e$g
                b9.e r1 = r3.f3935d0
                java.util.SortedMap r2 = r3.mo2280d()
                java.util.SortedMap r4 = r2.headMap(r4)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // p026b9.AbstractC0696e.a, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.util.Set keySet() {
                r1 = this;
                java.util.SortedSet r0 = r1.mo2279c()
                return r0
        }

        @Override // java.util.SortedMap
        public K lastKey() {
                r1 = this;
                java.util.SortedMap r0 = r1.mo2280d()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> subMap(K r4, K r5) {
                r3 = this;
                b9.e$g r0 = new b9.e$g
                b9.e r1 = r3.f3935d0
                java.util.SortedMap r2 = r3.mo2280d()
                java.util.SortedMap r4 = r2.subMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        public java.util.SortedMap<K, java.util.Collection<V>> tailMap(K r4) {
                r3 = this;
                b9.e$g r0 = new b9.e$g
                b9.e r1 = r3.f3935d0
                java.util.SortedMap r2 = r3.mo2280d()
                java.util.SortedMap r4 = r2.tailMap(r4)
                r0.<init>(r1, r4)
                return r0
        }
    }

    /* renamed from: b9.e$h */
    public class h extends p026b9.AbstractC0696e<K, V>.c implements java.util.SortedSet<K> {

        /* renamed from: a0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3936a0;

        public h(p026b9.AbstractC0696e r1, java.util.SortedMap<K, java.util.Collection<V>> r2) {
                r0 = this;
                r0.f3936a0 = r1
                r0.<init>(r1, r2)
                return
        }

        /* renamed from: a */
        public java.util.SortedMap<K, java.util.Collection<V>> mo2284a() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                java.util.SortedMap r0 = (java.util.SortedMap) r0
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super K> comparator() {
                r1 = this;
                java.util.SortedMap r0 = r1.mo2284a()
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        public K first() {
                r1 = this;
                java.util.SortedMap r0 = r1.mo2284a()
                java.lang.Object r0 = r0.firstKey()
                return r0
        }

        public java.util.SortedSet<K> headSet(K r4) {
                r3 = this;
                b9.e$h r0 = new b9.e$h
                b9.e r1 = r3.f3936a0
                java.util.SortedMap r2 = r3.mo2284a()
                java.util.SortedMap r4 = r2.headMap(r4)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // java.util.SortedSet
        public K last() {
                r1 = this;
                java.util.SortedMap r0 = r1.mo2284a()
                java.lang.Object r0 = r0.lastKey()
                return r0
        }

        public java.util.SortedSet<K> subSet(K r4, K r5) {
                r3 = this;
                b9.e$h r0 = new b9.e$h
                b9.e r1 = r3.f3936a0
                java.util.SortedMap r2 = r3.mo2284a()
                java.util.SortedMap r4 = r2.subMap(r4, r5)
                r0.<init>(r1, r4)
                return r0
        }

        public java.util.SortedSet<K> tailSet(K r4) {
                r3 = this;
                b9.e$h r0 = new b9.e$h
                b9.e r1 = r3.f3936a0
                java.util.SortedMap r2 = r3.mo2284a()
                java.util.SortedMap r4 = r2.tailMap(r4)
                r0.<init>(r1, r4)
                return r0
        }
    }

    /* renamed from: b9.e$i */
    public class i extends java.util.AbstractCollection<V> {

        /* renamed from: Y */
        public final K f3937Y;

        /* renamed from: Z */
        public java.util.Collection<V> f3938Z;

        /* renamed from: a0 */
        public final p026b9.AbstractC0696e<K, V>.i f3939a0;

        /* renamed from: b0 */
        public final java.util.Collection<V> f3940b0;

        /* renamed from: c0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3941c0;

        /* renamed from: b9.e$i$a */
        public class a implements java.util.Iterator<V> {

            /* renamed from: Y */
            public final java.util.Iterator<V> f3942Y;

            /* renamed from: Z */
            public final java.util.Collection<V> f3943Z;

            /* renamed from: a0 */
            public final /* synthetic */ p026b9.AbstractC0696e.i f3944a0;

            public a(p026b9.AbstractC0696e.i r2) {
                    r1 = this;
                    r1.f3944a0 = r2
                    r1.<init>()
                    java.util.Collection<V> r2 = r2.f3938Z
                    r1.f3943Z = r2
                    boolean r0 = r2 instanceof java.util.List
                    if (r0 == 0) goto L14
                    java.util.List r2 = (java.util.List) r2
                    java.util.ListIterator r2 = r2.listIterator()
                    goto L18
                L14:
                    java.util.Iterator r2 = r2.iterator()
                L18:
                    r1.f3942Y = r2
                    return
            }

            public a(p026b9.AbstractC0696e.i r1, java.util.Iterator<V> r2) {
                    r0 = this;
                    r0.f3944a0 = r1
                    r0.<init>()
                    java.util.Collection<V> r1 = r1.f3938Z
                    r0.f3943Z = r1
                    r0.f3942Y = r2
                    return
            }

            /* renamed from: a */
            public void m2289a() {
                    r2 = this;
                    b9.e$i r0 = r2.f3944a0
                    r0.m2287e()
                    b9.e$i r0 = r2.f3944a0
                    java.util.Collection<V> r0 = r0.f3938Z
                    java.util.Collection<V> r1 = r2.f3943Z
                    if (r0 != r1) goto Le
                    return
                Le:
                    java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    r1.m2289a()
                    java.util.Iterator<V> r0 = r1.f3942Y
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public V next() {
                    r1 = this;
                    r1.m2289a()
                    java.util.Iterator<V> r0 = r1.f3942Y
                    java.lang.Object r0 = r0.next()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.util.Iterator<V> r0 = r1.f3942Y
                    r0.remove()
                    b9.e$i r0 = r1.f3944a0
                    b9.e r0 = r0.f3941c0
                    p026b9.AbstractC0696e.m2274c(r0)
                    b9.e$i r0 = r1.f3944a0
                    r0.m2288h()
                    return
            }
        }

        public i(p026b9.AbstractC0696e r1, K r2, java.util.Collection<V> r3, p026b9.AbstractC0696e<K, V>.i r4) {
                r0 = this;
                r0.f3941c0 = r1
                r0.<init>()
                r0.f3937Y = r2
                r0.f3938Z = r3
                r0.f3939a0 = r4
                if (r4 != 0) goto Lf
                r1 = 0
                goto L11
            Lf:
                java.util.Collection<V> r1 = r4.f3938Z
            L11:
                r0.f3940b0 = r1
                return
        }

        /* renamed from: a */
        public void m2286a() {
                r3 = this;
                b9.e<K, V>$i r0 = r3.f3939a0
                if (r0 == 0) goto L8
                r0.m2286a()
                goto L13
            L8:
                b9.e r0 = r3.f3941c0
                java.util.Map<K, java.util.Collection<V>> r0 = r0.f3915b0
                K r1 = r3.f3937Y
                java.util.Collection<V> r2 = r3.f3938Z
                r0.put(r1, r2)
            L13:
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V r3) {
                r2 = this;
                r2.m2287e()
                java.util.Collection<V> r0 = r2.f3938Z
                boolean r0 = r0.isEmpty()
                java.util.Collection<V> r1 = r2.f3938Z
                boolean r3 = r1.add(r3)
                if (r3 == 0) goto L1b
                b9.e r1 = r2.f3941c0
                p026b9.AbstractC0696e.m2273b(r1)
                if (r0 == 0) goto L1b
                r2.m2286a()
            L1b:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r5) {
                r4 = this;
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L8
                r5 = 0
                return r5
            L8:
                int r0 = r4.size()
                java.util.Collection<V> r1 = r4.f3938Z
                boolean r5 = r1.addAll(r5)
                if (r5 == 0) goto L27
                java.util.Collection<V> r1 = r4.f3938Z
                int r1 = r1.size()
                b9.e r2 = r4.f3941c0
                int r3 = r2.f3916c0
                int r1 = r1 - r0
                int r1 = r1 + r3
                r2.f3916c0 = r1
                if (r0 != 0) goto L27
                r4.m2286a()
            L27:
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r3 = this;
                int r0 = r3.size()
                if (r0 != 0) goto L7
                return
            L7:
                java.util.Collection<V> r1 = r3.f3938Z
                r1.clear()
                b9.e r1 = r3.f3941c0
                int r2 = r1.f3916c0
                int r2 = r2 - r0
                r1.f3916c0 = r2
                r3.m2288h()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                boolean r2 = r0.containsAll(r2)
                return r2
        }

        /* renamed from: e */
        public void m2287e() {
                r2 = this;
                b9.e<K, V>$i r0 = r2.f3939a0
                if (r0 == 0) goto L16
                r0.m2287e()
                b9.e<K, V>$i r0 = r2.f3939a0
                java.util.Collection<V> r0 = r0.f3938Z
                java.util.Collection<V> r1 = r2.f3940b0
                if (r0 != r1) goto L10
                goto L2e
            L10:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L16:
                java.util.Collection<V> r0 = r2.f3938Z
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L2e
                b9.e r0 = r2.f3941c0
                java.util.Map<K, java.util.Collection<V>> r0 = r0.f3915b0
                K r1 = r2.f3937Y
                java.lang.Object r0 = r0.get(r1)
                java.util.Collection r0 = (java.util.Collection) r0
                if (r0 == 0) goto L2e
                r2.f3938Z = r0
            L2e:
                return
        }

        @Override // java.util.Collection
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                if (r2 != r1) goto L4
                r2 = 1
                return r2
            L4:
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                boolean r2 = r0.equals(r2)
                return r2
        }

        /* renamed from: h */
        public void m2288h() {
                r2 = this;
                b9.e<K, V>$i r0 = r2.f3939a0
                if (r0 == 0) goto L8
                r0.m2288h()
                goto L19
            L8:
                java.util.Collection<V> r0 = r2.f3938Z
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L19
                b9.e r0 = r2.f3941c0
                java.util.Map<K, java.util.Collection<V>> r0 = r0.f3915b0
                K r1 = r2.f3937Y
                r0.remove(r1)
            L19:
                return
        }

        @Override // java.util.Collection
        public int hashCode() {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r1 = this;
                r1.m2287e()
                b9.e$i$a r0 = new b9.e$i$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L13
                b9.e r0 = r1.f3941c0
                p026b9.AbstractC0696e.m2274c(r0)
                r1.m2288h()
            L13:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L8
                r5 = 0
                return r5
            L8:
                int r0 = r4.size()
                java.util.Collection<V> r1 = r4.f3938Z
                boolean r5 = r1.removeAll(r5)
                if (r5 == 0) goto L25
                java.util.Collection<V> r1 = r4.f3938Z
                int r1 = r1.size()
                b9.e r2 = r4.f3941c0
                int r3 = r2.f3916c0
                int r1 = r1 - r0
                int r1 = r1 + r3
                r2.f3916c0 = r1
                r4.m2288h()
            L25:
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Objects.requireNonNull(r5)
                int r0 = r4.size()
                java.util.Collection<V> r1 = r4.f3938Z
                boolean r5 = r1.retainAll(r5)
                if (r5 == 0) goto L20
                java.util.Collection<V> r1 = r4.f3938Z
                int r1 = r1.size()
                b9.e r2 = r4.f3941c0
                int r3 = r2.f3916c0
                int r1 = r1 - r0
                int r1 = r1 + r3
                r2.f3916c0 = r1
                r4.m2288h()
            L20:
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: b9.e$j */
    public class j extends p026b9.AbstractC0696e<K, V>.i implements java.util.List<V> {

        /* renamed from: d0 */
        public final /* synthetic */ p026b9.AbstractC0696e f3945d0;

        /* renamed from: b9.e$j$a */
        public class a extends p026b9.AbstractC0696e<K, V>.i.a implements java.util.ListIterator<V> {

            /* renamed from: b0 */
            public final /* synthetic */ p026b9.AbstractC0696e.j f3946b0;

            public a(p026b9.AbstractC0696e.j r1) {
                    r0 = this;
                    r0.f3946b0 = r1
                    r0.<init>(r1)
                    return
            }

            public a(p026b9.AbstractC0696e.j r2, int r3) {
                    r1 = this;
                    r1.f3946b0 = r2
                    java.util.Collection<V> r0 = r2.f3938Z
                    java.util.List r0 = (java.util.List) r0
                    java.util.ListIterator r3 = r0.listIterator(r3)
                    r1.<init>(r2, r3)
                    return
            }

            @Override // java.util.ListIterator
            public void add(V r3) {
                    r2 = this;
                    b9.e$j r0 = r2.f3946b0
                    boolean r0 = r0.isEmpty()
                    java.util.ListIterator r1 = r2.m2290b()
                    r1.add(r3)
                    b9.e$j r3 = r2.f3946b0
                    b9.e r3 = r3.f3945d0
                    p026b9.AbstractC0696e.m2273b(r3)
                    if (r0 == 0) goto L1b
                    b9.e$j r3 = r2.f3946b0
                    r3.m2286a()
                L1b:
                    return
            }

            /* renamed from: b */
            public final java.util.ListIterator<V> m2290b() {
                    r1 = this;
                    r1.m2289a()
                    java.util.Iterator<V> r0 = r1.f3942Y
                    java.util.ListIterator r0 = (java.util.ListIterator) r0
                    return r0
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.m2290b()
                    boolean r0 = r0.hasPrevious()
                    return r0
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.m2290b()
                    int r0 = r0.nextIndex()
                    return r0
            }

            @Override // java.util.ListIterator
            public V previous() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.m2290b()
                    java.lang.Object r0 = r0.previous()
                    return r0
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                    r1 = this;
                    java.util.ListIterator r0 = r1.m2290b()
                    int r0 = r0.previousIndex()
                    return r0
            }

            @Override // java.util.ListIterator
            public void set(V r2) {
                    r1 = this;
                    java.util.ListIterator r0 = r1.m2290b()
                    r0.set(r2)
                    return
            }
        }

        public j(p026b9.AbstractC0696e r1, K r2, java.util.List<V> r3, p026b9.AbstractC0696e<K, V>.i r4) {
                r0 = this;
                r0.f3945d0 = r1
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // java.util.List
        public void add(int r3, V r4) {
                r2 = this;
                r2.m2287e()
                java.util.Collection<V> r0 = r2.f3938Z
                boolean r0 = r0.isEmpty()
                java.util.Collection<V> r1 = r2.f3938Z
                java.util.List r1 = (java.util.List) r1
                r1.add(r3, r4)
                b9.e r3 = r2.f3945d0
                p026b9.AbstractC0696e.m2273b(r3)
                if (r0 == 0) goto L1a
                r2.m2286a()
            L1a:
                return
        }

        @Override // java.util.List
        public boolean addAll(int r4, java.util.Collection<? extends V> r5) {
                r3 = this;
                boolean r0 = r5.isEmpty()
                if (r0 == 0) goto L8
                r4 = 0
                return r4
            L8:
                int r0 = r3.size()
                java.util.Collection<V> r1 = r3.f3938Z
                java.util.List r1 = (java.util.List) r1
                boolean r4 = r1.addAll(r4, r5)
                if (r4 == 0) goto L29
                java.util.Collection<V> r5 = r3.f3938Z
                int r5 = r5.size()
                b9.e r1 = r3.f3945d0
                int r2 = r1.f3916c0
                int r5 = r5 - r0
                int r5 = r5 + r2
                r1.f3916c0 = r5
                if (r0 != 0) goto L29
                r3.m2286a()
            L29:
                return r4
        }

        @Override // java.util.List
        public V get(int r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // java.util.List
        public int indexOf(java.lang.Object r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                java.util.List r0 = (java.util.List) r0
                int r2 = r0.indexOf(r2)
                return r2
        }

        @Override // java.util.List
        public int lastIndexOf(java.lang.Object r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                java.util.List r0 = (java.util.List) r0
                int r2 = r0.lastIndexOf(r2)
                return r2
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator() {
                r1 = this;
                r1.m2287e()
                b9.e$j$a r0 = new b9.e$j$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.List
        public java.util.ListIterator<V> listIterator(int r2) {
                r1 = this;
                r1.m2287e()
                b9.e$j$a r0 = new b9.e$j$a
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.List
        public V remove(int r2) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r0.remove(r2)
                b9.e r0 = r1.f3945d0
                p026b9.AbstractC0696e.m2274c(r0)
                r1.m2288h()
                return r2
        }

        @Override // java.util.List
        public V set(int r2, V r3) {
                r1 = this;
                r1.m2287e()
                java.util.Collection<V> r0 = r1.f3938Z
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r2 = r0.set(r2, r3)
                return r2
        }

        @Override // java.util.List
        public java.util.List<V> subList(int r4, int r5) {
                r3 = this;
                r3.m2287e()
                b9.e r0 = r3.f3945d0
                K r1 = r3.f3937Y
                java.util.Collection<V> r2 = r3.f3938Z
                java.util.List r2 = (java.util.List) r2
                java.util.List r4 = r2.subList(r4, r5)
                b9.e<K, V>$i r5 = r3.f3939a0
                if (r5 != 0) goto L14
                r5 = r3
            L14:
                java.util.Objects.requireNonNull(r0)
                boolean r2 = r4 instanceof java.util.RandomAccess
                if (r2 == 0) goto L21
                b9.e$f r2 = new b9.e$f
                r2.<init>(r0, r1, r4, r5)
                goto L26
            L21:
                b9.e$j r2 = new b9.e$j
                r2.<init>(r0, r1, r4, r5)
            L26:
                return r2
        }
    }

    public AbstractC0696e(java.util.Map<K, java.util.Collection<V>> r2) {
            r1 = this;
            r1.<init>()
            boolean r0 = r2.isEmpty()
            p124h7.C2939x3.m7276b(r0)
            r1.f3915b0 = r2
            return
    }

    /* renamed from: b */
    public static /* synthetic */ int m2273b(p026b9.AbstractC0696e r2) {
            int r0 = r2.f3916c0
            int r1 = r0 + 1
            r2.f3916c0 = r1
            return r0
    }

    /* renamed from: c */
    public static /* synthetic */ int m2274c(p026b9.AbstractC0696e r2) {
            int r0 = r2.f3916c0
            int r1 = r0 + (-1)
            r2.f3916c0 = r1
            return r0
    }

    /* renamed from: d */
    public void m2275d() {
            r2 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r2.f3915b0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r1.clear()
            goto La
        L1a:
            java.util.Map<K, java.util.Collection<V>> r0 = r2.f3915b0
            r0.clear()
            r0 = 0
            r2.f3916c0 = r0
            return
    }

    /* renamed from: e */
    public abstract java.util.Collection<V> mo2276e();
}
