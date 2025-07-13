package lb;

/* renamed from: lb.r */
/* loaded from: classes.dex */
public final class C4255r<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {

    /* renamed from: f0 */
    public static final java.util.Comparator<java.lang.Comparable> f17436f0 = null;

    /* renamed from: Y */
    public java.util.Comparator<? super K> f17437Y;

    /* renamed from: Z */
    public lb.C4255r.e<K, V> f17438Z;

    /* renamed from: a0 */
    public int f17439a0;

    /* renamed from: b0 */
    public int f17440b0;

    /* renamed from: c0 */
    public final lb.C4255r.e<K, V> f17441c0;

    /* renamed from: d0 */
    public lb.C4255r<K, V>.b f17442d0;

    /* renamed from: e0 */
    public lb.C4255r<K, V>.c f17443e0;

    /* renamed from: lb.r$a */
    public class a implements java.util.Comparator<java.lang.Comparable> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public int compare(java.lang.Comparable r1, java.lang.Comparable r2) {
                r0 = this;
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Comparable r2 = (java.lang.Comparable) r2
                int r1 = r1.compareTo(r2)
                return r1
        }
    }

    /* renamed from: lb.r$b */
    public class b extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {

        /* renamed from: Y */
        public final /* synthetic */ lb.C4255r f17444Y;

        /* renamed from: lb.r$b$a */
        public class a extends lb.C4255r<K, V>.d<java.util.Map.Entry<K, V>> {
            public a(lb.C4255r.b r1) {
                    r0 = this;
                    lb.r r1 = r1.f17444Y
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.Iterator
            public java.lang.Object next() {
                    r1 = this;
                    lb.r$e r0 = r1.m9566a()
                    return r0
            }
        }

        public b(lb.C4255r r1) {
                r0 = this;
                r0.f17444Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                lb.r r0 = r1.f17444Y
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.Map.Entry
                if (r0 == 0) goto L10
                lb.r r0 = r1.f17444Y
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                lb.r$e r2 = r0.m9559b(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                lb.r$b$a r0 = new lb.r$b$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                lb.r r0 = r2.f17444Y
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                lb.r$e r3 = r0.m9559b(r3)
                if (r3 != 0) goto L11
                return r1
            L11:
                lb.r r0 = r2.f17444Y
                r1 = 1
                r0.m9562e(r3, r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                lb.r r0 = r1.f17444Y
                int r0 = r0.f17439a0
                return r0
        }
    }

    /* renamed from: lb.r$c */
    public final class c extends java.util.AbstractSet<K> {

        /* renamed from: Y */
        public final /* synthetic */ lb.C4255r f17445Y;

        /* renamed from: lb.r$c$a */
        public class a extends lb.C4255r<K, V>.d<K> {
            public a(lb.C4255r.c r1) {
                    r0 = this;
                    lb.r r1 = r1.f17445Y
                    r0.<init>(r1)
                    return
            }

            @Override // java.util.Iterator
            public K next() {
                    r1 = this;
                    lb.r$e r0 = r1.m9566a()
                    K r0 = r0.f17455d0
                    return r0
            }
        }

        public c(lb.C4255r r1) {
                r0 = this;
                r0.f17445Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                lb.r r0 = r1.f17445Y
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                lb.r r0 = r1.f17445Y
                lb.r$e r2 = r0.m9560c(r2)
                if (r2 == 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                lb.r$c$a r0 = new lb.r$c$a
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                lb.r r0 = r2.f17445Y
                lb.r$e r3 = r0.m9560c(r3)
                r1 = 1
                if (r3 == 0) goto Lc
                r0.m9562e(r3, r1)
            Lc:
                if (r3 == 0) goto Lf
                goto L10
            Lf:
                r1 = 0
            L10:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                lb.r r0 = r1.f17445Y
                int r0 = r0.f17439a0
                return r0
        }
    }

    /* renamed from: lb.r$d */
    public abstract class d<T> implements java.util.Iterator<T> {

        /* renamed from: Y */
        public lb.C4255r.e<K, V> f17446Y;

        /* renamed from: Z */
        public lb.C4255r.e<K, V> f17447Z;

        /* renamed from: a0 */
        public int f17448a0;

        /* renamed from: b0 */
        public final /* synthetic */ lb.C4255r f17449b0;

        public d(lb.C4255r r2) {
                r1 = this;
                r1.f17449b0 = r2
                r1.<init>()
                lb.r$e<K, V> r0 = r2.f17441c0
                lb.r$e<K, V> r0 = r0.f17453b0
                r1.f17446Y = r0
                r0 = 0
                r1.f17447Z = r0
                int r2 = r2.f17440b0
                r1.f17448a0 = r2
                return
        }

        /* renamed from: a */
        public final lb.C4255r.e<K, V> m9566a() {
                r3 = this;
                lb.r$e<K, V> r0 = r3.f17446Y
                lb.r r1 = r3.f17449b0
                lb.r$e<K, V> r2 = r1.f17441c0
                if (r0 == r2) goto L1b
                int r1 = r1.f17440b0
                int r2 = r3.f17448a0
                if (r1 != r2) goto L15
                lb.r$e<K, V> r1 = r0.f17453b0
                r3.f17446Y = r1
                r3.f17447Z = r0
                return r0
            L15:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L1b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                lb.r$e<K, V> r0 = r2.f17446Y
                lb.r r1 = r2.f17449b0
                lb.r$e<K, V> r1 = r1.f17441c0
                if (r0 == r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r3 = this;
                lb.r$e<K, V> r0 = r3.f17447Z
                if (r0 == 0) goto L14
                lb.r r1 = r3.f17449b0
                r2 = 1
                r1.m9562e(r0, r2)
                r0 = 0
                r3.f17447Z = r0
                lb.r r0 = r3.f17449b0
                int r0 = r0.f17440b0
                r3.f17448a0 = r0
                return
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* renamed from: lb.r$e */
    public static final class e<K, V> implements java.util.Map.Entry<K, V> {

        /* renamed from: Y */
        public lb.C4255r.e<K, V> f17450Y;

        /* renamed from: Z */
        public lb.C4255r.e<K, V> f17451Z;

        /* renamed from: a0 */
        public lb.C4255r.e<K, V> f17452a0;

        /* renamed from: b0 */
        public lb.C4255r.e<K, V> f17453b0;

        /* renamed from: c0 */
        public lb.C4255r.e<K, V> f17454c0;

        /* renamed from: d0 */
        public final K f17455d0;

        /* renamed from: e0 */
        public V f17456e0;

        /* renamed from: f0 */
        public int f17457f0;

        public e() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f17455d0 = r0
                r1.f17454c0 = r1
                r1.f17453b0 = r1
                return
        }

        public e(lb.C4255r.e<K, V> r1, K r2, lb.C4255r.e<K, V> r3, lb.C4255r.e<K, V> r4) {
                r0 = this;
                r0.<init>()
                r0.f17450Y = r1
                r0.f17455d0 = r2
                r1 = 1
                r0.f17457f0 = r1
                r0.f17453b0 = r3
                r0.f17454c0 = r4
                r4.f17453b0 = r0
                r3.f17454c0 = r0
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L2e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f17455d0
                if (r0 != 0) goto L12
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L2e
                goto L1c
            L12:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L2e
            L1c:
                V r0 = r3.f17456e0
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L27
                if (r4 != 0) goto L2e
                goto L2d
            L27:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L2e
            L2d:
                r1 = 1
            L2e:
                return r1
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.f17455d0
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.f17456e0
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K r0 = r3.f17455d0
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.f17456e0
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                V r0 = r1.f17456e0
                r1.f17456e0 = r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.f17455d0
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.f17456e0
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<lb.r> r0 = lb.C4255r.class
            lb.r$a r0 = new lb.r$a
            r0.<init>()
            lb.C4255r.f17436f0 = r0
            return
    }

    public C4255r() {
            r2 = this;
            java.util.Comparator<java.lang.Comparable> r0 = lb.C4255r.f17436f0
            r2.<init>()
            r1 = 0
            r2.f17439a0 = r1
            r2.f17440b0 = r1
            lb.r$e r1 = new lb.r$e
            r1.<init>()
            r2.f17441c0 = r1
            r2.f17437Y = r0
            return
    }

    /* renamed from: a */
    public lb.C4255r.e<K, V> m9558a(K r7, boolean r8) {
            r6 = this;
            java.util.Comparator<? super K> r0 = r6.f17437Y
            lb.r$e<K, V> r1 = r6.f17438Z
            r2 = 0
            if (r1 == 0) goto L2c
            java.util.Comparator<java.lang.Comparable> r3 = lb.C4255r.f17436f0
            if (r0 != r3) goto Lf
            r3 = r7
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            goto L10
        Lf:
            r3 = r2
        L10:
            K r4 = r1.f17455d0
            if (r3 == 0) goto L19
            int r4 = r3.compareTo(r4)
            goto L1d
        L19:
            int r4 = r0.compare(r7, r4)
        L1d:
            if (r4 != 0) goto L20
            return r1
        L20:
            if (r4 >= 0) goto L25
            lb.r$e<K, V> r5 = r1.f17451Z
            goto L27
        L25:
            lb.r$e<K, V> r5 = r1.f17452a0
        L27:
            if (r5 != 0) goto L2a
            goto L2d
        L2a:
            r1 = r5
            goto L10
        L2c:
            r4 = 0
        L2d:
            if (r8 != 0) goto L30
            return r2
        L30:
            lb.r$e<K, V> r8 = r6.f17441c0
            r2 = 1
            if (r1 != 0) goto L67
            java.util.Comparator<java.lang.Comparable> r3 = lb.C4255r.f17436f0
            if (r0 != r3) goto L5d
            boolean r0 = r7 instanceof java.lang.Comparable
            if (r0 == 0) goto L3e
            goto L5d
        L3e:
            java.lang.ClassCastException r8 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r0.append(r7)
            java.lang.String r7 = " is not Comparable"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L5d:
            lb.r$e r0 = new lb.r$e
            lb.r$e<K, V> r3 = r8.f17454c0
            r0.<init>(r1, r7, r8, r3)
            r6.f17438Z = r0
            goto L78
        L67:
            lb.r$e r0 = new lb.r$e
            lb.r$e<K, V> r3 = r8.f17454c0
            r0.<init>(r1, r7, r8, r3)
            if (r4 >= 0) goto L73
            r1.f17451Z = r0
            goto L75
        L73:
            r1.f17452a0 = r0
        L75:
            r6.m9561d(r1, r2)
        L78:
            int r7 = r6.f17439a0
            int r7 = r7 + r2
            r6.f17439a0 = r7
            int r7 = r6.f17440b0
            int r7 = r7 + r2
            r6.f17440b0 = r7
            return r0
    }

    /* renamed from: b */
    public lb.C4255r.e<K, V> m9559b(java.util.Map.Entry<?, ?> r5) {
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            lb.r$e r0 = r4.m9560c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L23
            V r3 = r0.f17456e0
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L1f
            if (r3 == 0) goto L1d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L1d
            goto L1f
        L1d:
            r5 = 0
            goto L20
        L1f:
            r5 = 1
        L20:
            if (r5 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            return r0
    }

    /* renamed from: c */
    public lb.C4255r.e<K, V> m9560c(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            lb.r$e r0 = r2.m9558a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
        L9:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r0 = 0
            r1.f17438Z = r0
            r0 = 0
            r1.f17439a0 = r0
            int r0 = r1.f17440b0
            int r0 = r0 + 1
            r1.f17440b0 = r0
            lb.r$e<K, V> r0 = r1.f17441c0
            r0.f17454c0 = r0
            r0.f17453b0 = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            lb.r$e r1 = r0.m9560c(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    /* renamed from: d */
    public final void m9561d(lb.C4255r.e<K, V> r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L71
            lb.r$e<K, V> r0 = r8.f17451Z
            lb.r$e<K, V> r1 = r8.f17452a0
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.f17457f0
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.f17457f0
            goto L13
        L12:
            r4 = 0
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L38
            lb.r$e<K, V> r0 = r1.f17451Z
            lb.r$e<K, V> r3 = r1.f17452a0
            if (r3 == 0) goto L21
            int r3 = r3.f17457f0
            goto L22
        L21:
            r3 = 0
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.f17457f0
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L32
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L32
        L2f:
            r7.m9565h(r1)
        L32:
            r7.m9564g(r8)
            if (r9 == 0) goto L6e
            goto L71
        L38:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L5b
            lb.r$e<K, V> r1 = r0.f17451Z
            lb.r$e<K, V> r3 = r0.f17452a0
            if (r3 == 0) goto L45
            int r3 = r3.f17457f0
            goto L46
        L45:
            r3 = 0
        L46:
            if (r1 == 0) goto L4a
            int r2 = r1.f17457f0
        L4a:
            int r2 = r2 - r3
            if (r2 == r6) goto L55
            if (r2 != 0) goto L52
            if (r9 != 0) goto L52
            goto L55
        L52:
            r7.m9564g(r0)
        L55:
            r7.m9565h(r8)
            if (r9 == 0) goto L6e
            goto L71
        L5b:
            if (r5 != 0) goto L64
            int r3 = r3 + 1
            r8.f17457f0 = r3
            if (r9 == 0) goto L6e
            goto L71
        L64:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.f17457f0 = r0
            if (r9 != 0) goto L6e
            goto L71
        L6e:
            lb.r$e<K, V> r8 = r8.f17450Y
            goto L0
        L71:
            return
    }

    /* renamed from: e */
    public void m9562e(lb.C4255r.e<K, V> r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto Lc
            lb.r$e<K, V> r8 = r7.f17454c0
            lb.r$e<K, V> r0 = r7.f17453b0
            r8.f17453b0 = r0
            lb.r$e<K, V> r0 = r7.f17453b0
            r0.f17454c0 = r8
        Lc:
            lb.r$e<K, V> r8 = r7.f17451Z
            lb.r$e<K, V> r0 = r7.f17452a0
            lb.r$e<K, V> r1 = r7.f17450Y
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L58
            if (r0 == 0) goto L58
            int r1 = r8.f17457f0
            int r4 = r0.f17457f0
            if (r1 <= r4) goto L26
        L1e:
            lb.r$e<K, V> r0 = r8.f17452a0
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L2f
            goto L1e
        L26:
            lb.r$e<K, V> r8 = r0.f17451Z
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L2e
            goto L26
        L2e:
            r0 = r8
        L2f:
            r6.m9562e(r0, r2)
            lb.r$e<K, V> r8 = r7.f17451Z
            if (r8 == 0) goto L3f
            int r1 = r8.f17457f0
            r0.f17451Z = r8
            r8.f17450Y = r0
            r7.f17451Z = r3
            goto L40
        L3f:
            r1 = 0
        L40:
            lb.r$e<K, V> r8 = r7.f17452a0
            if (r8 == 0) goto L4c
            int r2 = r8.f17457f0
            r0.f17452a0 = r8
            r8.f17450Y = r0
            r7.f17452a0 = r3
        L4c:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.f17457f0 = r8
            r6.m9563f(r7, r0)
            return
        L58:
            if (r8 == 0) goto L60
            r6.m9563f(r7, r8)
            r7.f17451Z = r3
            goto L6b
        L60:
            if (r0 == 0) goto L68
            r6.m9563f(r7, r0)
            r7.f17452a0 = r3
            goto L6b
        L68:
            r6.m9563f(r7, r3)
        L6b:
            r6.m9561d(r1, r2)
            int r7 = r6.f17439a0
            int r7 = r7 + (-1)
            r6.f17439a0 = r7
            int r7 = r6.f17440b0
            int r7 = r7 + 1
            r6.f17440b0 = r7
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            lb.r<K, V>$b r0 = r1.f17442d0
            if (r0 == 0) goto L5
            goto Lc
        L5:
            lb.r$b r0 = new lb.r$b
            r0.<init>(r1)
            r1.f17442d0 = r0
        Lc:
            return r0
    }

    /* renamed from: f */
    public final void m9563f(lb.C4255r.e<K, V> r3, lb.C4255r.e<K, V> r4) {
            r2 = this;
            lb.r$e<K, V> r0 = r3.f17450Y
            r1 = 0
            r3.f17450Y = r1
            if (r4 == 0) goto L9
            r4.f17450Y = r0
        L9:
            if (r0 == 0) goto L15
            lb.r$e<K, V> r1 = r0.f17451Z
            if (r1 != r3) goto L12
            r0.f17451Z = r4
            goto L17
        L12:
            r0.f17452a0 = r4
            goto L17
        L15:
            r2.f17438Z = r4
        L17:
            return
    }

    /* renamed from: g */
    public final void m9564g(lb.C4255r.e<K, V> r6) {
            r5 = this;
            lb.r$e<K, V> r0 = r6.f17451Z
            lb.r$e<K, V> r1 = r6.f17452a0
            lb.r$e<K, V> r2 = r1.f17451Z
            lb.r$e<K, V> r3 = r1.f17452a0
            r6.f17452a0 = r2
            if (r2 == 0) goto Le
            r2.f17450Y = r6
        Le:
            r5.m9563f(r6, r1)
            r1.f17451Z = r6
            r6.f17450Y = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.f17457f0
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.f17457f0
            goto L22
        L21:
            r2 = 0
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r6.f17457f0 = r0
            if (r3 == 0) goto L2e
            int r4 = r3.f17457f0
        L2e:
            int r6 = java.lang.Math.max(r0, r4)
            int r6 = r6 + 1
            r1.f17457f0 = r6
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r1) {
            r0 = this;
            lb.r$e r1 = r0.m9560c(r1)
            if (r1 == 0) goto L9
            V r1 = r1.f17456e0
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    /* renamed from: h */
    public final void m9565h(lb.C4255r.e<K, V> r6) {
            r5 = this;
            lb.r$e<K, V> r0 = r6.f17451Z
            lb.r$e<K, V> r1 = r6.f17452a0
            lb.r$e<K, V> r2 = r0.f17451Z
            lb.r$e<K, V> r3 = r0.f17452a0
            r6.f17451Z = r3
            if (r3 == 0) goto Le
            r3.f17450Y = r6
        Le:
            r5.m9563f(r6, r0)
            r0.f17452a0 = r6
            r6.f17450Y = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.f17457f0
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.f17457f0
            goto L22
        L21:
            r3 = 0
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r6.f17457f0 = r1
            if (r2 == 0) goto L2e
            int r4 = r2.f17457f0
        L2e:
            int r6 = java.lang.Math.max(r1, r4)
            int r6 = r6 + 1
            r0.f17457f0 = r6
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            lb.r<K, V>$c r0 = r1.f17443e0
            if (r0 == 0) goto L5
            goto Lc
        L5:
            lb.r$c r0 = new lb.r$c
            r0.<init>(r1)
            r1.f17443e0 = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r2, r0)
            r0 = 1
            lb.r$e r2 = r1.m9558a(r2, r0)
            V r0 = r2.f17456e0
            r2.f17456e0 = r3
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            lb.r$e r2 = r1.m9560c(r2)
            if (r2 == 0) goto La
            r0 = 1
            r1.m9562e(r2, r0)
        La:
            if (r2 == 0) goto Lf
            V r2 = r2.f17456e0
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.f17439a0
            return r0
    }
}
