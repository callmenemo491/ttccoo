package p319s;

/* renamed from: s.g */
/* loaded from: classes.dex */
public abstract class AbstractC5940g<K, V> {

    /* renamed from: a */
    public p319s.AbstractC5940g<K, V>.b f22791a;

    /* renamed from: b */
    public p319s.AbstractC5940g<K, V>.c f22792b;

    /* renamed from: c */
    public p319s.AbstractC5940g<K, V>.e f22793c;

    /* renamed from: s.g$a */
    public final class a<T> implements java.util.Iterator<T> {

        /* renamed from: Y */
        public final int f22794Y;

        /* renamed from: Z */
        public int f22795Z;

        /* renamed from: a0 */
        public int f22796a0;

        /* renamed from: b0 */
        public boolean f22797b0;

        /* renamed from: c0 */
        public final /* synthetic */ p319s.AbstractC5940g f22798c0;

        public a(p319s.AbstractC5940g r2, int r3) {
                r1 = this;
                r1.f22798c0 = r2
                r1.<init>()
                r0 = 0
                r1.f22797b0 = r0
                r1.f22794Y = r3
                int r2 = r2.mo12303d()
                r1.f22795Z = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22796a0
                int r1 = r2.f22795Z
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                s.g r0 = r3.f22798c0
                int r1 = r3.f22796a0
                int r2 = r3.f22794Y
                java.lang.Object r0 = r0.mo12301b(r1, r2)
                int r1 = r3.f22796a0
                r2 = 1
                int r1 = r1 + r2
                r3.f22796a0 = r1
                r3.f22797b0 = r2
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f22797b0
                if (r0 == 0) goto L19
                int r0 = r2.f22796a0
                int r0 = r0 + (-1)
                r2.f22796a0 = r0
                int r1 = r2.f22795Z
                int r1 = r1 + (-1)
                r2.f22795Z = r1
                r1 = 0
                r2.f22797b0 = r1
                s.g r1 = r2.f22798c0
                r1.mo12307h(r0)
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* renamed from: s.g$b */
    public final class b implements java.util.Set<java.util.Map.Entry<K, V>> {

        /* renamed from: Y */
        public final /* synthetic */ p319s.AbstractC5940g f22799Y;

        public b(p319s.AbstractC5940g r1) {
                r0 = this;
                r0.f22799Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> r5) {
                r4 = this;
                s.g r0 = r4.f22799Y
                int r0 = r0.mo12303d()
                java.util.Iterator r5 = r5.iterator()
            La:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r5.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                s.g r2 = r4.f22799Y
                java.lang.Object r3 = r1.getKey()
                java.lang.Object r1 = r1.getValue()
                r2.mo12306g(r3, r1)
                goto La
            L24:
                s.g r5 = r4.f22799Y
                int r5 = r5.mo12303d()
                if (r0 == r5) goto L2e
                r5 = 1
                goto L2f
            L2e:
                r5 = 0
            L2f:
                return r5
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                s.g r0 = r1.f22799Y
                r0.mo12300a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                s.g r0 = r3.f22799Y
                java.lang.Object r2 = r4.getKey()
                int r0 = r0.mo12304e(r2)
                if (r0 >= 0) goto L15
                return r1
            L15:
                s.g r1 = r3.f22799Y
                r2 = 1
                java.lang.Object r0 = r1.mo12301b(r0, r2)
                java.lang.Object r4 = r4.getValue()
                boolean r4 = p319s.C5937d.m12316c(r0, r4)
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = p319s.AbstractC5940g.m12332j(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r6 = this;
                s.g r0 = r6.f22799Y
                int r0 = r0.mo12303d()
                r1 = 1
                int r0 = r0 - r1
                r2 = 0
                r3 = 0
            La:
                if (r0 < 0) goto L2d
                s.g r4 = r6.f22799Y
                java.lang.Object r4 = r4.mo12301b(r0, r2)
                s.g r5 = r6.f22799Y
                java.lang.Object r5 = r5.mo12301b(r0, r1)
                if (r4 != 0) goto L1c
                r4 = 0
                goto L20
            L1c:
                int r4 = r4.hashCode()
            L20:
                if (r5 != 0) goto L24
                r5 = 0
                goto L28
            L24:
                int r5 = r5.hashCode()
            L28:
                r4 = r4 ^ r5
                int r3 = r3 + r4
                int r0 = r0 + (-1)
                goto La
            L2d:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                s.g r0 = r1.f22799Y
                int r0 = r0.mo12303d()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r2 = this;
                s.g$d r0 = new s.g$d
                s.g r1 = r2.f22799Y
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                s.g r0 = r1.f22799Y
                int r0 = r0.mo12303d()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* renamed from: s.g$c */
    public final class c implements java.util.Set<K> {

        /* renamed from: Y */
        public final /* synthetic */ p319s.AbstractC5940g f22800Y;

        public c(p319s.AbstractC5940g r1) {
                r0 = this;
                r0.f22800Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                s.g r0 = r1.f22800Y
                r0.mo12300a()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                s.g r0 = r1.f22800Y
                int r2 = r0.mo12304e(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r3) {
                r2 = this;
                s.g r0 = r2.f22800Y
                java.util.Map r0 = r0.mo12302c()
                java.util.Iterator r3 = r3.iterator()
            La:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L1c
                java.lang.Object r1 = r3.next()
                boolean r1 = r0.containsKey(r1)
                if (r1 != 0) goto La
                r3 = 0
                goto L1d
            L1c:
                r3 = 1
            L1d:
                return r3
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = p319s.AbstractC5940g.m12332j(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                s.g r0 = r4.f22800Y
                int r0 = r0.mo12303d()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = 0
            La:
                if (r0 < 0) goto L1e
                s.g r3 = r4.f22800Y
                java.lang.Object r3 = r3.mo12301b(r0, r1)
                if (r3 != 0) goto L16
                r3 = 0
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto La
            L1e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                s.g r0 = r1.f22800Y
                int r0 = r0.mo12303d()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r3 = this;
                s.g$a r0 = new s.g$a
                s.g r1 = r3.f22800Y
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                s.g r0 = r1.f22800Y
                int r2 = r0.mo12304e(r2)
                if (r2 < 0) goto Lf
                s.g r0 = r1.f22800Y
                r0.mo12307h(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                s.g r0 = r3.f22800Y
                java.util.Map r0 = r0.mo12302c()
                int r1 = r0.size()
                java.util.Iterator r4 = r4.iterator()
            Le:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L1c
                java.lang.Object r2 = r4.next()
                r0.remove(r2)
                goto Le
            L1c:
                int r4 = r0.size()
                if (r1 == r4) goto L24
                r4 = 1
                goto L25
            L24:
                r4 = 0
            L25:
                return r4
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                s.g r0 = r1.f22800Y
                java.util.Map r0 = r0.mo12302c()
                boolean r2 = p319s.AbstractC5940g.m12333k(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                s.g r0 = r1.f22800Y
                int r0 = r0.mo12303d()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                s.g r0 = r2.f22800Y
                r1 = 0
                java.lang.Object[] r0 = r0.m12334l(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                s.g r0 = r2.f22800Y
                r1 = 0
                java.lang.Object[] r3 = r0.m12335m(r3, r1)
                return r3
        }
    }

    /* renamed from: s.g$d */
    public final class d implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {

        /* renamed from: Y */
        public int f22801Y;

        /* renamed from: Z */
        public int f22802Z;

        /* renamed from: a0 */
        public boolean f22803a0;

        /* renamed from: b0 */
        public final /* synthetic */ p319s.AbstractC5940g f22804b0;

        public d(p319s.AbstractC5940g r2) {
                r1 = this;
                r1.f22804b0 = r2
                r1.<init>()
                r0 = 0
                r1.f22803a0 = r0
                int r2 = r2.mo12303d()
                int r2 = r2 + (-1)
                r1.f22801Y = r2
                r2 = -1
                r1.f22802Z = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                boolean r0 = r4.f22803a0
                if (r0 == 0) goto L33
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto La
                return r1
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r0 = r5.getKey()
                s.g r2 = r4.f22804b0
                int r3 = r4.f22802Z
                java.lang.Object r2 = r2.mo12301b(r3, r1)
                boolean r0 = p319s.C5937d.m12316c(r0, r2)
                r2 = 1
                if (r0 == 0) goto L32
                java.lang.Object r5 = r5.getValue()
                s.g r0 = r4.f22804b0
                int r3 = r4.f22802Z
                java.lang.Object r0 = r0.mo12301b(r3, r2)
                boolean r5 = p319s.C5937d.m12316c(r5, r0)
                if (r5 == 0) goto L32
                r1 = 1
            L32:
                return r1
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r5.<init>(r0)
                throw r5
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r3 = this;
                boolean r0 = r3.f22803a0
                if (r0 == 0) goto Le
                s.g r0 = r3.f22804b0
                int r1 = r3.f22802Z
                r2 = 0
                java.lang.Object r0 = r0.mo12301b(r1, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r3 = this;
                boolean r0 = r3.f22803a0
                if (r0 == 0) goto Le
                s.g r0 = r3.f22804b0
                int r1 = r3.f22802Z
                r2 = 1
                java.lang.Object r0 = r0.mo12301b(r1, r2)
                return r0
            Le:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f22802Z
                int r1 = r2.f22801Y
                if (r0 >= r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r5 = this;
                boolean r0 = r5.f22803a0
                if (r0 == 0) goto L27
                s.g r0 = r5.f22804b0
                int r1 = r5.f22802Z
                r2 = 0
                java.lang.Object r0 = r0.mo12301b(r1, r2)
                s.g r1 = r5.f22804b0
                int r3 = r5.f22802Z
                r4 = 1
                java.lang.Object r1 = r1.mo12301b(r3, r4)
                if (r0 != 0) goto L1a
                r0 = 0
                goto L1e
            L1a:
                int r0 = r0.hashCode()
            L1e:
                if (r1 != 0) goto L21
                goto L25
            L21:
                int r2 = r1.hashCode()
            L25:
                r0 = r0 ^ r2
                return r0
            L27:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "This container does not support retaining Map.Entry objects"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto Lf
                int r0 = r2.f22802Z
                r1 = 1
                int r0 = r0 + r1
                r2.f22802Z = r0
                r2.f22803a0 = r1
                return r2
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f22803a0
                if (r0 == 0) goto L1b
                s.g r0 = r2.f22804b0
                int r1 = r2.f22802Z
                r0.mo12307h(r1)
                int r0 = r2.f22802Z
                int r0 = r0 + (-1)
                r2.f22802Z = r0
                int r0 = r2.f22801Y
                int r0 = r0 + (-1)
                r2.f22801Y = r0
                r0 = 0
                r2.f22803a0 = r0
                return
            L1b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r3) {
                r2 = this;
                boolean r0 = r2.f22803a0
                if (r0 == 0) goto Ld
                s.g r0 = r2.f22804b0
                int r1 = r2.f22802Z
                java.lang.Object r3 = r0.mo12308i(r1, r3)
                return r3
            Ld:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This container does not support retaining Map.Entry objects"
                r3.<init>(r0)
                throw r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: s.g$e */
    public final class e implements java.util.Collection<V> {

        /* renamed from: Y */
        public final /* synthetic */ p319s.AbstractC5940g f22805Y;

        public e(p319s.AbstractC5940g r1) {
                r0 = this;
                r0.f22805Y = r1
                r0.<init>()
                return
        }

        @Override // java.util.Collection
        public boolean add(V r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public boolean addAll(java.util.Collection<? extends V> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Collection
        public void clear() {
                r1 = this;
                s.g r0 = r1.f22805Y
                r0.mo12300a()
                return
        }

        @Override // java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                s.g r0 = r1.f22805Y
                int r2 = r0.mo12305f(r2)
                if (r2 < 0) goto La
                r2 = 1
                goto Lb
            La:
                r2 = 0
            Lb:
                return r2
        }

        @Override // java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Iterator r2 = r2.iterator()
            L4:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L16
                java.lang.Object r0 = r2.next()
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L4
                r2 = 0
                return r2
            L16:
                r2 = 1
                return r2
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                s.g r0 = r1.f22805Y
                int r0 = r0.mo12303d()
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r3 = this;
                s.g$a r0 = new s.g$a
                s.g r1 = r3.f22805Y
                r2 = 1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                s.g r0 = r1.f22805Y
                int r2 = r0.mo12305f(r2)
                if (r2 < 0) goto Lf
                s.g r0 = r1.f22805Y
                r0.mo12307h(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Collection
        public boolean removeAll(java.util.Collection<?> r6) {
                r5 = this;
                s.g r0 = r5.f22805Y
                int r0 = r0.mo12303d()
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L23
                s.g r3 = r5.f22805Y
                r4 = 1
                java.lang.Object r3 = r3.mo12301b(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 == 0) goto L21
                s.g r2 = r5.f22805Y
                r2.mo12307h(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = 1
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public boolean retainAll(java.util.Collection<?> r6) {
                r5 = this;
                s.g r0 = r5.f22805Y
                int r0 = r0.mo12303d()
                r1 = 0
                r2 = 0
            L8:
                if (r1 >= r0) goto L23
                s.g r3 = r5.f22805Y
                r4 = 1
                java.lang.Object r3 = r3.mo12301b(r1, r4)
                boolean r3 = r6.contains(r3)
                if (r3 != 0) goto L21
                s.g r2 = r5.f22805Y
                r2.mo12307h(r1)
                int r1 = r1 + (-1)
                int r0 = r0 + (-1)
                r2 = 1
            L21:
                int r1 = r1 + r4
                goto L8
            L23:
                return r2
        }

        @Override // java.util.Collection
        public int size() {
                r1 = this;
                s.g r0 = r1.f22805Y
                int r0 = r0.mo12303d()
                return r0
        }

        @Override // java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                s.g r0 = r2.f22805Y
                r1 = 1
                java.lang.Object[] r0 = r0.m12334l(r1)
                return r0
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                s.g r0 = r2.f22805Y
                r1 = 1
                java.lang.Object[] r3 = r0.m12335m(r3, r1)
                return r3
        }
    }

    public AbstractC5940g() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: j */
    public static <T> boolean m12332j(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1e
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1e
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1e
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
        L1e:
            return r2
    }

    /* renamed from: k */
    public static <K, V> boolean m12333k(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            int r0 = r3.size()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto Lc
            r1.remove()
            goto Lc
        L20:
            int r3 = r3.size()
            if (r0 == r3) goto L28
            r3 = 1
            goto L29
        L28:
            r3 = 0
        L29:
            return r3
    }

    /* renamed from: a */
    public abstract void mo12300a();

    /* renamed from: b */
    public abstract java.lang.Object mo12301b(int r1, int r2);

    /* renamed from: c */
    public abstract java.util.Map<K, V> mo12302c();

    /* renamed from: d */
    public abstract int mo12303d();

    /* renamed from: e */
    public abstract int mo12304e(java.lang.Object r1);

    /* renamed from: f */
    public abstract int mo12305f(java.lang.Object r1);

    /* renamed from: g */
    public abstract void mo12306g(K r1, V r2);

    /* renamed from: h */
    public abstract void mo12307h(int r1);

    /* renamed from: i */
    public abstract V mo12308i(int r1, V r2);

    /* renamed from: l */
    public java.lang.Object[] m12334l(int r5) {
            r4 = this;
            int r0 = r4.mo12303d()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r4.mo12301b(r2, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L12:
            return r1
    }

    /* renamed from: m */
    public <T> T[] m12335m(T[] r4, int r5) {
            r3 = this;
            int r0 = r3.mo12303d()
            int r1 = r4.length
            if (r1 >= r0) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.mo12301b(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r5 = r4.length
            if (r5 <= r0) goto L27
            r5 = 0
            r4[r0] = r5
        L27:
            return r4
    }
}
