package p221m9;

import java.lang.Comparable;

/* renamed from: m9.i1 */
/* loaded from: classes.dex */
public class C4459i1<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {

    /* renamed from: e0 */
    public static final /* synthetic */ int f18161e0 = 0;

    /* renamed from: Y */
    public final int f18162Y;

    /* renamed from: Z */
    public java.util.List<p221m9.C4459i1<K, V>.b> f18163Z;

    /* renamed from: a0 */
    public java.util.Map<K, V> f18164a0;

    /* renamed from: b0 */
    public boolean f18165b0;

    /* renamed from: c0 */
    public volatile p221m9.C4459i1<K, V>.d f18166c0;

    /* renamed from: d0 */
    public java.util.Map<K, V> f18167d0;

    /* renamed from: m9.i1$a */
    public static class a {

        /* renamed from: a */
        public static final java.util.Iterator<java.lang.Object> f18168a = null;

        /* renamed from: b */
        public static final java.lang.Iterable<java.lang.Object> f18169b = null;

        /* renamed from: m9.i1$a$a, reason: collision with other inner class name */
        public class C7406a implements java.util.Iterator<java.lang.Object> {
            public C7406a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                    r1 = this;
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r1 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    r0.<init>()
                    throw r0
            }
        }

        /* renamed from: m9.i1$a$b */
        public class b implements java.lang.Iterable<java.lang.Object> {
            public b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<java.lang.Object> iterator() {
                    r1 = this;
                    java.util.Iterator<java.lang.Object> r0 = p221m9.C4459i1.a.f18168a
                    return r0
            }
        }

        static {
                m9.i1$a$a r0 = new m9.i1$a$a
                r0.<init>()
                p221m9.C4459i1.a.f18168a = r0
                m9.i1$a$b r0 = new m9.i1$a$b
                r0.<init>()
                p221m9.C4459i1.a.f18169b = r0
                return
        }
    }

    /* renamed from: m9.i1$b */
    public class b implements java.util.Map.Entry<K, V>, java.lang.Comparable<p221m9.C4459i1<K, V>.b> {

        /* renamed from: Y */
        public final K f18170Y;

        /* renamed from: Z */
        public V f18171Z;

        /* renamed from: a0 */
        public final /* synthetic */ p221m9.C4459i1 f18172a0;

        public b(p221m9.C4459i1 r1, K r2, V r3) {
                r0 = this;
                r0.f18172a0 = r1
                r0.<init>()
                r0.f18170Y = r2
                r0.f18171Z = r3
                return
        }

        public b(p221m9.C4459i1 r2, java.util.Map.Entry<K, V> r3) {
                r1 = this;
                java.lang.Object r0 = r3.getKey()
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                java.lang.Object r3 = r3.getValue()
                r1.f18172a0 = r2
                r1.<init>()
                r1.f18170Y = r0
                r1.f18171Z = r3
                return
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Object r2) {
                r1 = this;
                m9.i1$b r2 = (p221m9.C4459i1.b) r2
                K extends java.lang.Comparable<K> r0 = r1.f18170Y
                K extends java.lang.Comparable<K> r2 = r2.f18170Y
                int r2 = r0.compareTo(r2)
                return r2
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof java.util.Map.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                K extends java.lang.Comparable<K> r1 = r4.f18170Y
                java.lang.Object r3 = r5.getKey()
                if (r1 != 0) goto L1a
                if (r3 != 0) goto L18
                r1 = 1
                goto L1e
            L18:
                r1 = 0
                goto L1e
            L1a:
                boolean r1 = r1.equals(r3)
            L1e:
                if (r1 == 0) goto L35
                V r1 = r4.f18171Z
                java.lang.Object r5 = r5.getValue()
                if (r1 != 0) goto L2e
                if (r5 != 0) goto L2c
                r5 = 1
                goto L32
            L2c:
                r5 = 0
                goto L32
            L2e:
                boolean r5 = r1.equals(r5)
            L32:
                if (r5 == 0) goto L35
                goto L36
            L35:
                r0 = 0
            L36:
                return r0
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getKey() {
                r1 = this;
                K extends java.lang.Comparable<K> r0 = r1.f18170Y
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.f18171Z
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K extends java.lang.Comparable<K> r0 = r3.f18170Y
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.f18171Z
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                m9.i1 r0 = r2.f18172a0
                int r1 = p221m9.C4459i1.f18161e0
                r0.m10110b()
                V r0 = r2.f18171Z
                r2.f18171Z = r3
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K extends java.lang.Comparable<K> r1 = r2.f18170Y
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.f18171Z
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: m9.i1$c */
    public class c implements java.util.Iterator<java.util.Map.Entry<K, V>> {

        /* renamed from: Y */
        public int f18173Y;

        /* renamed from: Z */
        public boolean f18174Z;

        /* renamed from: a0 */
        public java.util.Iterator<java.util.Map.Entry<K, V>> f18175a0;

        /* renamed from: b0 */
        public final /* synthetic */ p221m9.C4459i1 f18176b0;

        public c(p221m9.C4459i1 r1, p221m9.C4456h1 r2) {
                r0 = this;
                r0.f18176b0 = r1
                r0.<init>()
                r1 = -1
                r0.f18173Y = r1
                return
        }

        /* renamed from: a */
        public final java.util.Iterator<java.util.Map.Entry<K, V>> m10117a() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.f18175a0
                if (r0 != 0) goto L12
                m9.i1 r0 = r1.f18176b0
                java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f18164a0
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1.f18175a0 = r0
            L12:
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.f18175a0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.f18173Y
                r1 = 1
                int r0 = r0 + r1
                m9.i1 r2 = r3.f18176b0
                java.util.List<m9.i1<K, V>$b> r2 = r2.f18163Z
                int r2 = r2.size()
                if (r0 < r2) goto L24
                m9.i1 r0 = r3.f18176b0
                java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f18164a0
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L23
                java.util.Iterator r0 = r3.m10117a()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L23
                goto L24
            L23:
                r1 = 0
            L24:
                return r1
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r2 = this;
                r0 = 1
                r2.f18174Z = r0
                int r1 = r2.f18173Y
                int r1 = r1 + r0
                r2.f18173Y = r1
                m9.i1 r0 = r2.f18176b0
                java.util.List<m9.i1<K, V>$b> r0 = r0.f18163Z
                int r0 = r0.size()
                if (r1 >= r0) goto L1d
                m9.i1 r0 = r2.f18176b0
                java.util.List<m9.i1<K, V>$b> r0 = r0.f18163Z
                int r1 = r2.f18173Y
                java.lang.Object r0 = r0.get(r1)
                goto L25
            L1d:
                java.util.Iterator r0 = r2.m10117a()
                java.lang.Object r0 = r0.next()
            L25:
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                boolean r0 = r3.f18174Z
                if (r0 == 0) goto L2e
                r0 = 0
                r3.f18174Z = r0
                m9.i1 r0 = r3.f18176b0
                int r1 = p221m9.C4459i1.f18161e0
                r0.m10110b()
                int r0 = r3.f18173Y
                m9.i1 r1 = r3.f18176b0
                java.util.List<m9.i1<K, V>$b> r1 = r1.f18163Z
                int r1 = r1.size()
                if (r0 >= r1) goto L26
                m9.i1 r0 = r3.f18176b0
                int r1 = r3.f18173Y
                int r2 = r1 + (-1)
                r3.f18173Y = r2
                r0.m10116i(r1)
                goto L2d
            L26:
                java.util.Iterator r0 = r3.m10117a()
                r0.remove()
            L2d:
                return
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() was called before next()"
                r0.<init>(r1)
                throw r0
        }
    }

    /* renamed from: m9.i1$d */
    public class d extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {

        /* renamed from: Y */
        public final /* synthetic */ p221m9.C4459i1 f18177Y;

        public d(p221m9.C4459i1 r1, p221m9.C4456h1 r2) {
                r0 = this;
                r0.f18177Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(java.lang.Object r3) {
                r2 = this;
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                boolean r0 = r2.contains(r3)
                if (r0 != 0) goto L19
                m9.i1 r0 = r2.f18177Y
                java.lang.Object r1 = r3.getKey()
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Object r3 = r3.getValue()
                r0.m10115h(r1, r3)
                r3 = 1
                goto L1a
            L19:
                r3 = 0
            L1a:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                m9.i1 r0 = r1.f18177Y
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                m9.i1 r0 = r2.f18177Y
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r0 = r0.get(r1)
                java.lang.Object r3 = r3.getValue()
                if (r0 == r3) goto L1d
                if (r0 == 0) goto L1b
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L1b
                goto L1d
            L1b:
                r3 = 0
                goto L1e
            L1d:
                r3 = 1
            L1e:
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r3 = this;
                m9.i1$c r0 = new m9.i1$c
                m9.i1 r1 = r3.f18177Y
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto L13
                m9.i1 r0 = r1.f18177Y
                java.lang.Object r2 = r2.getKey()
                r0.remove(r2)
                r2 = 1
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                m9.i1 r0 = r1.f18177Y
                int r0 = r0.size()
                return r0
        }
    }

    public C4459i1(int r1, p221m9.C4456h1 r2) {
            r0 = this;
            r0.<init>()
            r0.f18162Y = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.f18163Z = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f18164a0 = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f18167d0 = r1
            return
    }

    /* renamed from: a */
    public final int m10109a(K r5) {
            r4 = this;
            java.util.List<m9.i1<K, V>$b> r0 = r4.f18163Z
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L21
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            java.lang.Object r1 = r1.get(r0)
            m9.i1$b r1 = (p221m9.C4459i1.b) r1
            K extends java.lang.Comparable<K> r1 = r1.f18170Y
            int r1 = r5.compareTo(r1)
            if (r1 <= 0) goto L1e
            int r0 = r0 + 2
            int r5 = -r0
            return r5
        L1e:
            if (r1 != 0) goto L21
            return r0
        L21:
            r1 = 0
        L22:
            if (r1 > r0) goto L43
            int r2 = r1 + r0
            int r2 = r2 / 2
            java.util.List<m9.i1<K, V>$b> r3 = r4.f18163Z
            java.lang.Object r3 = r3.get(r2)
            m9.i1$b r3 = (p221m9.C4459i1.b) r3
            K extends java.lang.Comparable<K> r3 = r3.f18170Y
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3c
            int r2 = r2 + (-1)
            r0 = r2
            goto L22
        L3c:
            if (r3 <= 0) goto L42
            int r2 = r2 + 1
            r1 = r2
            goto L22
        L42:
            return r2
        L43:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    /* renamed from: b */
    public final void m10110b() {
            r1 = this;
            boolean r0 = r1.f18165b0
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    /* renamed from: c */
    public java.util.Map.Entry<K, V> m10111c(int r2) {
            r1 = this;
            java.util.List<m9.i1<K, V>$b> r0 = r1.f18163Z
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r1.m10110b()
            java.util.List<m9.i1<K, V>$b> r0 = r1.f18163Z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List<m9.i1<K, V>$b> r0 = r1.f18163Z
            r0.clear()
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.m10109a(r2)
            if (r0 >= 0) goto L13
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    /* renamed from: d */
    public int m10112d() {
            r1 = this;
            java.util.List<m9.i1<K, V>$b> r0 = r1.f18163Z
            int r0 = r0.size()
            return r0
    }

    /* renamed from: e */
    public java.lang.Iterable<java.util.Map.Entry<K, V>> m10113e() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            java.lang.Iterable<java.lang.Object> r0 = p221m9.C4459i1.a.f18169b
            goto L11
        Lb:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            java.util.Set r0 = r0.entrySet()
        L11:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            m9.i1<K, V>$d r0 = r2.f18166c0
            if (r0 != 0) goto Lc
            m9.i1$d r0 = new m9.i1$d
            r1 = 0
            r0.<init>(r2, r1)
            r2.f18166c0 = r0
        Lc:
            m9.i1<K, V>$d r0 = r2.f18166c0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p221m9.C4459i1
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r8)
            return r8
        Ld:
            m9.i1 r8 = (p221m9.C4459i1) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 == r2) goto L1b
            return r3
        L1b:
            int r2 = r7.m10112d()
            int r4 = r8.m10112d()
            if (r2 == r4) goto L32
            java.util.Set r0 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            boolean r8 = r0.equals(r8)
            return r8
        L32:
            r4 = 0
        L33:
            if (r4 >= r2) goto L47
            java.util.Map$Entry r5 = r7.m10111c(r4)
            java.util.Map$Entry r6 = r8.m10111c(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L44
            return r3
        L44:
            int r4 = r4 + 1
            goto L33
        L47:
            if (r2 == r1) goto L52
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r7.f18164a0
            java.util.Map<K extends java.lang.Comparable<K>, V> r8 = r8.f18164a0
            boolean r8 = r0.equals(r8)
            return r8
        L52:
            return r0
    }

    /* renamed from: f */
    public final java.util.SortedMap<K, V> m10114f() {
            r1 = this;
            r1.m10110b()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L20
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.f18164a0 = r0
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.NavigableMap r0 = r0.descendingMap()
            r1.f18167d0 = r0
        L20:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    /* renamed from: g */
    public void mo10071g() {
            r1 = this;
            boolean r0 = r1.f18165b0
            if (r0 != 0) goto L31
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L17
        L11:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L17:
            r1.f18164a0 = r0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18167d0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L2c
        L26:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18167d0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L2c:
            r1.f18167d0 = r0
            r0 = 1
            r1.f18165b0 = r0
        L31:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.m10109a(r2)
            if (r0 < 0) goto L13
            java.util.List<m9.i1<K, V>$b> r2 = r1.f18163Z
            java.lang.Object r2 = r2.get(r0)
            m9.i1$b r2 = (p221m9.C4459i1.b) r2
            V r2 = r2.f18171Z
            return r2
        L13:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* renamed from: h */
    public V m10115h(K r5, V r6) {
            r4 = this;
            r4.m10110b()
            int r0 = r4.m10109a(r5)
            if (r0 < 0) goto L1b
            java.util.List<m9.i1<K, V>$b> r5 = r4.f18163Z
            java.lang.Object r5 = r5.get(r0)
            m9.i1$b r5 = (p221m9.C4459i1.b) r5
            m9.i1 r0 = r5.f18172a0
            r0.m10110b()
            V r0 = r5.f18171Z
            r5.f18171Z = r6
            return r0
        L1b:
            r4.m10110b()
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L35
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            boolean r1 = r1 instanceof java.util.ArrayList
            if (r1 != 0) goto L35
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.f18162Y
            r1.<init>(r2)
            r4.f18163Z = r1
        L35:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r4.f18162Y
            if (r0 < r1) goto L45
            java.util.SortedMap r0 = r4.m10114f()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L45:
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            int r1 = r1.size()
            int r2 = r4.f18162Y
            if (r1 != r2) goto L64
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            m9.i1$b r1 = (p221m9.C4459i1.b) r1
            java.util.SortedMap r2 = r4.m10114f()
            K extends java.lang.Comparable<K> r3 = r1.f18170Y
            V r1 = r1.f18171Z
            r2.put(r3, r1)
        L64:
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            m9.i1$b r2 = new m9.i1$b
            r2.<init>(r4, r5, r6)
            r1.add(r0, r2)
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
            r4 = this;
            int r0 = r4.m10112d()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L18
            java.util.List<m9.i1<K, V>$b> r3 = r4.f18163Z
            java.lang.Object r3 = r3.get(r1)
            m9.i1$b r3 = (p221m9.C4459i1.b) r3
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L18:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.f18164a0
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.f18164a0
            int r0 = r0.hashCode()
            int r2 = r2 + r0
        L27:
            return r2
    }

    /* renamed from: i */
    public final V m10116i(int r5) {
            r4 = this;
            r4.m10110b()
            java.util.List<m9.i1<K, V>$b> r0 = r4.f18163Z
            java.lang.Object r5 = r0.remove(r5)
            m9.i1$b r5 = (p221m9.C4459i1.b) r5
            V r5 = r5.f18171Z
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.f18164a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L34
            java.util.SortedMap r0 = r4.m10114f()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List<m9.i1<K, V>$b> r1 = r4.f18163Z
            m9.i1$b r2 = new m9.i1$b
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.<init>(r4, r3)
            r1.add(r2)
            r0.remove()
        L34:
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.m10115h(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            r1.m10110b()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.m10109a(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.m10116i(r0)
            return r2
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f18164a0
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            java.util.List<m9.i1<K, V>$b> r0 = r2.f18163Z
            int r0 = r0.size()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.f18164a0
            int r1 = r1.size()
            int r1 = r1 + r0
            return r1
    }
}
