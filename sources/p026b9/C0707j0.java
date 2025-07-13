package p026b9;

/* renamed from: b9.j0 */
/* loaded from: classes.dex */
public final class C0707j0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: b9.j0$a */
    public static class a<E> extends p026b9.C0707j0.e<E> {

        /* renamed from: Y */
        public final /* synthetic */ java.util.Set f3968Y;

        /* renamed from: Z */
        public final /* synthetic */ java.util.Set f3969Z;

        public a(java.util.Set r1, java.util.Set r2) {
                r0 = this;
                r0.f3968Y = r1
                r0.f3969Z = r2
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Set r0 = r1.f3968Y
                boolean r0 = r0.contains(r2)
                if (r0 == 0) goto L12
                java.util.Set r0 = r1.f3969Z
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                java.util.Set r0 = r1.f3968Y
                boolean r0 = r0.containsAll(r2)
                if (r0 == 0) goto L12
                java.util.Set r0 = r1.f3969Z
                boolean r2 = r0.containsAll(r2)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r2 = this;
                java.util.Set r0 = r2.f3969Z
                java.util.Set r1 = r2.f3968Y
                boolean r0 = java.util.Collections.disjoint(r0, r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator iterator() {
                r1 = this;
                b9.i0 r0 = new b9.i0
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r4 = this;
                java.util.Set r0 = r4.f3968Y
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L1c
                java.lang.Object r2 = r0.next()
                java.util.Set r3 = r4.f3969Z
                boolean r2 = r3.contains(r2)
                if (r2 == 0) goto L7
                int r1 = r1 + 1
                goto L7
            L1c:
                return r1
        }
    }

    /* renamed from: b9.j0$b */
    public static class b<E> extends p026b9.C0702h<E> implements java.util.Set<E> {
        public b(java.util.Set<E> r1, p010a9.InterfaceC0039g<? super E> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = p026b9.C0707j0.m2298a(r0, r1)
                return r1
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
                r1 = this;
                int r0 = p026b9.C0707j0.m2300c(r1)
                return r0
        }
    }

    /* renamed from: b9.j0$c */
    public static class c<E> extends p026b9.C0707j0.b<E> implements java.util.SortedSet<E> {
        public c(java.util.SortedSet<E> r1, p010a9.InterfaceC0039g<? super E> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // java.util.SortedSet
        public java.util.Comparator<? super E> comparator() {
                r1 = this;
                java.util.Collection<E> r0 = r1.f3959Y
                java.util.SortedSet r0 = (java.util.SortedSet) r0
                java.util.Comparator r0 = r0.comparator()
                return r0
        }

        @Override // java.util.SortedSet
        public E first() {
                r4 = this;
                java.util.Collection<E> r0 = r4.f3959Y
                java.util.Iterator r0 = r0.iterator()
                a9.g<? super E> r1 = r4.f3960Z
                java.util.Objects.requireNonNull(r0)
                java.util.Objects.requireNonNull(r1)
            Le:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r0.next()
                boolean r3 = r1.apply(r2)
                if (r3 == 0) goto Le
                return r2
            L1f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> headSet(E r3) {
                r2 = this;
                b9.j0$c r0 = new b9.j0$c
                java.util.Collection<E> r1 = r2.f3959Y
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.SortedSet r3 = r1.headSet(r3)
                a9.g<? super E> r1 = r2.f3960Z
                r0.<init>(r3, r1)
                return r0
        }

        @Override // java.util.SortedSet
        public E last() {
                r3 = this;
                java.util.Collection<E> r0 = r3.f3959Y
                java.util.SortedSet r0 = (java.util.SortedSet) r0
            L4:
                java.lang.Object r1 = r0.last()
                a9.g<? super E> r2 = r3.f3960Z
                boolean r2 = r2.apply(r1)
                if (r2 == 0) goto L11
                return r1
            L11:
                java.util.SortedSet r0 = r0.headSet(r1)
                goto L4
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> subSet(E r3, E r4) {
                r2 = this;
                b9.j0$c r0 = new b9.j0$c
                java.util.Collection<E> r1 = r2.f3959Y
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.SortedSet r3 = r1.subSet(r3, r4)
                a9.g<? super E> r4 = r2.f3960Z
                r0.<init>(r3, r4)
                return r0
        }

        @Override // java.util.SortedSet
        public java.util.SortedSet<E> tailSet(E r3) {
                r2 = this;
                b9.j0$c r0 = new b9.j0$c
                java.util.Collection<E> r1 = r2.f3959Y
                java.util.SortedSet r1 = (java.util.SortedSet) r1
                java.util.SortedSet r3 = r1.tailSet(r3)
                a9.g<? super E> r1 = r2.f3960Z
                r0.<init>(r3, r1)
                return r0
        }
    }

    /* renamed from: b9.j0$d */
    public static abstract class d<E> extends java.util.AbstractSet<E> {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(java.util.Collection<?> r4) {
                r3 = this;
                java.util.Objects.requireNonNull(r4)
                boolean r0 = r4 instanceof p026b9.InterfaceC0726z
                if (r0 == 0) goto Ld
                b9.z r4 = (p026b9.InterfaceC0726z) r4
                java.util.Set r4 = r4.m2332x()
            Ld:
                boolean r0 = r4 instanceof java.util.Set
                if (r0 == 0) goto L35
                int r0 = r4.size()
                int r1 = r3.size()
                if (r0 <= r1) goto L35
                java.util.Iterator r0 = r3.iterator()
                r1 = 0
            L20:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L3d
                java.lang.Object r2 = r0.next()
                boolean r2 = r4.contains(r2)
                if (r2 == 0) goto L20
                r0.remove()
                r1 = 1
                goto L20
            L35:
                java.util.Iterator r4 = r4.iterator()
                boolean r1 = p026b9.C0707j0.m2303f(r3, r4)
            L3d:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.util.Objects.requireNonNull(r1)
                boolean r1 = super.retainAll(r1)
                return r1
        }
    }

    /* renamed from: b9.j0$e */
    public static abstract class e<E> extends java.util.AbstractSet<E> {
        public e(p026b9.C0703h0 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean add(E r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean addAll(java.util.Collection<? extends E> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final void clear() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean remove(java.lang.Object r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean removeAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @java.lang.Deprecated
        public final boolean retainAll(java.util.Collection<?> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }
    }

    /* renamed from: a */
    public static boolean m2298a(java.util.Set<?> r4, java.lang.Object r5) {
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

    /* renamed from: b */
    public static <E> java.util.Set<E> m2299b(java.util.Set<E> r1, p010a9.InterfaceC0039g<? super E> r2) {
            boolean r0 = r1 instanceof java.util.SortedSet
            if (r0 == 0) goto L25
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            boolean r0 = r1 instanceof p026b9.C0707j0.b
            if (r0 == 0) goto L1c
            b9.j0$b r1 = (p026b9.C0707j0.b) r1
            a9.g<? super E> r0 = r1.f3960Z
            a9.g r2 = p010a9.C0040h.m40a(r0, r2)
            b9.j0$c r0 = new b9.j0$c
            java.util.Collection<E> r1 = r1.f3959Y
            java.util.SortedSet r1 = (java.util.SortedSet) r1
            r0.<init>(r1, r2)
            goto L24
        L1c:
            b9.j0$c r0 = new b9.j0$c
            java.util.Objects.requireNonNull(r1)
            r0.<init>(r1, r2)
        L24:
            return r0
        L25:
            boolean r0 = r1 instanceof p026b9.C0707j0.b
            if (r0 == 0) goto L3b
            b9.j0$b r1 = (p026b9.C0707j0.b) r1
            a9.g<? super E> r0 = r1.f3960Z
            a9.g r2 = p010a9.C0040h.m40a(r0, r2)
            b9.j0$b r0 = new b9.j0$b
            java.util.Collection<E> r1 = r1.f3959Y
            java.util.Set r1 = (java.util.Set) r1
            r0.<init>(r1, r2)
            return r0
        L3b:
            b9.j0$b r0 = new b9.j0$b
            java.util.Objects.requireNonNull(r1)
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: c */
    public static int m2300c(java.util.Set<?> r3) {
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
            r1 = 0
        L6:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r3.next()
            if (r2 == 0) goto L17
            int r2 = r2.hashCode()
            goto L18
        L17:
            r2 = 0
        L18:
            int r1 = r1 + r2
            int r1 = ~r1
            int r1 = ~r1
            goto L6
        L1c:
            return r1
    }

    /* renamed from: d */
    public static <E> p026b9.C0707j0.e<E> m2301d(java.util.Set<E> r1, java.util.Set<?> r2) {
            java.lang.String r0 = "set1"
            p124h7.C2939x3.m7281g(r1, r0)
            java.lang.String r0 = "set2"
            p124h7.C2939x3.m7281g(r2, r0)
            b9.j0$a r0 = new b9.j0$a
            r0.<init>(r1, r2)
            return r0
    }

    /* renamed from: e */
    public static <E> java.util.Set<E> m2302e() {
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            return r0
    }

    /* renamed from: f */
    public static boolean m2303f(java.util.Set<?> r2, java.util.Iterator<?> r3) {
            r0 = 0
        L1:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L11
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto L1
        L11:
            return r0
    }
}
