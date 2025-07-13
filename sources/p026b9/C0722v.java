package p026b9;

/* renamed from: b9.v */
/* loaded from: classes.dex */
public final class C0722v {

    /* renamed from: b9.v$a */
    public static abstract class a<K, V> extends p026b9.C0707j0.d<java.util.Map.Entry<K, V>> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                r0 = r1
                b9.e$a$a r0 = (p026b9.AbstractC0696e.a.C7368a) r0
                b9.e$a r0 = r0.f3919Y
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(java.lang.Object r1);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                r0 = r1
                b9.e$a$a r0 = (p026b9.AbstractC0696e.a.C7368a) r0
                b9.e$a r0 = r0.f3919Y
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // p026b9.C0707j0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.util.Objects.requireNonNull(r1)     // Catch: java.lang.UnsupportedOperationException -> L8
                boolean r1 = super.removeAll(r1)     // Catch: java.lang.UnsupportedOperationException -> L8
                return r1
            L8:
                java.util.Iterator r1 = r1.iterator()
                boolean r1 = p026b9.C0707j0.m2303f(r0, r1)
                return r1
        }

        @Override // p026b9.C0707j0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r4) {
                r3 = this;
                java.util.Objects.requireNonNull(r4)     // Catch: java.lang.UnsupportedOperationException -> L8
                boolean r4 = super.retainAll(r4)     // Catch: java.lang.UnsupportedOperationException -> L8
                return r4
            L8:
                int r0 = r4.size()
                java.util.HashSet r1 = new java.util.HashSet
                r2 = 3
                if (r0 >= r2) goto L19
                java.lang.String r2 = "expectedSize"
                p026b9.C0720t.m2328b(r0, r2)
                int r0 = r0 + 1
                goto L29
            L19:
                r2 = 1073741824(0x40000000, float:2.0)
                if (r0 >= r2) goto L26
                float r0 = (float) r0
                r2 = 1061158912(0x3f400000, float:0.75)
                float r0 = r0 / r2
                r2 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 + r2
                int r0 = (int) r0
                goto L29
            L26:
                r0 = 2147483647(0x7fffffff, float:NaN)
            L29:
                r1.<init>(r0)
                java.util.Iterator r4 = r4.iterator()
            L30:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L4a
                java.lang.Object r0 = r4.next()
                boolean r2 = r3.contains(r0)
                if (r2 == 0) goto L30
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r0 = r0.getKey()
                r1.add(r0)
                goto L30
            L4a:
                r4 = r3
                b9.e$a$a r4 = (p026b9.AbstractC0696e.a.C7368a) r4
                b9.e$a r4 = r4.f3919Y
                java.util.Set r4 = r4.keySet()
                boolean r4 = r4.retainAll(r1)
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                r0 = r1
                b9.e$a$a r0 = (p026b9.AbstractC0696e.a.C7368a) r0
                b9.e$a r0 = r0.f3919Y
                int r0 = r0.size()
                return r0
        }
    }

    /* renamed from: b9.v$b */
    public static class b<K, V> extends p026b9.C0707j0.d<K> {

        /* renamed from: Y */
        public final java.util.Map<K, V> f3997Y;

        public b(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                r0.f3997Y = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3997Y
                int r0 = r0.size()
                return r0
        }
    }

    /* renamed from: b9.v$c */
    public static class c<K, V> extends java.util.AbstractCollection<V> {

        /* renamed from: Y */
        public final java.util.Map<K, V> f3998Y;

        public c(java.util.Map<K, V> r1) {
                r0 = this;
                r0.<init>()
                r0.f3998Y = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3998Y
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3998Y
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3998Y
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                java.util.Map<K, V> r0 = r2.f3998Y
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                b9.u r1 = new b9.u
                r1.<init>(r0)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r4) {
                r3 = this;
                boolean r4 = super.remove(r4)     // Catch: java.lang.UnsupportedOperationException -> L5
                return r4
            L5:
                java.util.Map<K, V> r0 = r3.f3998Y
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            Lf:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                boolean r2 = p185k7.C3836i.m8619d(r4, r2)
                if (r2 == 0) goto Lf
                java.util.Map<K, V> r4 = r3.f3998Y
                java.lang.Object r0 = r1.getKey()
                r4.remove(r0)
                r4 = 1
                return r4
            L30:
                r4 = 0
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Objects.requireNonNull(r5)     // Catch: java.lang.UnsupportedOperationException -> L8
                boolean r5 = super.removeAll(r5)     // Catch: java.lang.UnsupportedOperationException -> L8
                return r5
            L8:
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Map<K, V> r1 = r4.f3998Y
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L17:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                boolean r3 = r5.contains(r3)
                if (r3 == 0) goto L17
                java.lang.Object r2 = r2.getKey()
                r0.add(r2)
                goto L17
            L35:
                java.util.Map<K, V> r5 = r4.f3998Y
                java.util.Set r5 = r5.keySet()
                boolean r5 = r5.removeAll(r0)
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Objects.requireNonNull(r5)     // Catch: java.lang.UnsupportedOperationException -> L8
                boolean r5 = super.retainAll(r5)     // Catch: java.lang.UnsupportedOperationException -> L8
                return r5
            L8:
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                java.util.Map<K, V> r1 = r4.f3998Y
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L17:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                boolean r3 = r5.contains(r3)
                if (r3 == 0) goto L17
                java.lang.Object r2 = r2.getKey()
                r0.add(r2)
                goto L17
            L35:
                java.util.Map<K, V> r5 = r4.f3998Y
                java.util.Set r5 = r5.keySet()
                boolean r5 = r5.retainAll(r0)
                return r5
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                java.util.Map<K, V> r0 = r1.f3998Y
                int r0 = r0.size()
                return r0
        }
    }

    /* renamed from: b9.v$d */
    public static abstract class d<K, V> extends java.util.AbstractMap<K, V> {

        /* renamed from: Y */
        public transient java.util.Set<java.util.Map.Entry<K, V>> f3999Y;

        /* renamed from: Z */
        public transient java.util.Collection<V> f4000Z;

        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
                r2 = this;
                java.util.Set<java.util.Map$Entry<K, V>> r0 = r2.f3999Y
                if (r0 != 0) goto Lf
                r0 = r2
                b9.e$a r0 = (p026b9.AbstractC0696e.a) r0
                b9.e$a$a r1 = new b9.e$a$a
                r1.<init>(r0)
                r2.f3999Y = r1
                r0 = r1
            Lf:
                return r0
        }

        @Override // java.util.AbstractMap, java.util.Map
        public java.util.Collection<V> values() {
                r1 = this;
                java.util.Collection<V> r0 = r1.f4000Z
                if (r0 != 0) goto Lb
                b9.v$c r0 = new b9.v$c
                r0.<init>(r1)
                r1.f4000Z = r0
            Lb:
                return r0
        }
    }

    /* renamed from: a */
    public static boolean m2331a(java.util.Map<?, ?> r1, java.lang.Object r2) {
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L17
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r1 = r1.entrySet()
            java.util.Set r2 = r2.entrySet()
            boolean r1 = r1.equals(r2)
            return r1
        L17:
            r1 = 0
            return r1
    }
}
