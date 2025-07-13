package p026b9;

/* renamed from: b9.h */
/* loaded from: classes.dex */
public class C0702h<E> extends java.util.AbstractCollection<E> {

    /* renamed from: Y */
    public final java.util.Collection<E> f3959Y;

    /* renamed from: Z */
    public final p010a9.InterfaceC0039g<? super E> f3960Z;

    public C0702h(java.util.Collection<E> r1, p010a9.InterfaceC0039g<? super E> r2) {
            r0 = this;
            r0.<init>()
            r0.f3959Y = r1
            r0.f3960Z = r2
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(E r2) {
            r1 = this;
            a9.g<? super E> r0 = r1.f3960Z
            boolean r0 = r0.apply(r2)
            p124h7.C2939x3.m7276b(r0)
            java.util.Collection<E> r0 = r1.f3959Y
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r4) {
            r3 = this;
            java.util.Iterator r0 = r4.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            a9.g<? super E> r2 = r3.f3960Z
            boolean r1 = r2.apply(r1)
            p124h7.C2939x3.m7276b(r1)
            goto L4
        L18:
            java.util.Collection<E> r0 = r3.f3959Y
            boolean r4 = r0.addAll(r4)
            return r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
            r6 = this;
            java.util.Collection<E> r0 = r6.f3959Y
            a9.g<? super E> r1 = r6.f3960Z
            boolean r2 = r0 instanceof java.util.RandomAccess
            if (r2 == 0) goto L3e
            boolean r2 = r0 instanceof java.util.List
            if (r2 == 0) goto L3e
            java.util.List r0 = (java.util.List) r0
            java.util.Objects.requireNonNull(r1)
            r2 = 0
            r3 = 0
        L13:
            int r4 = r0.size()
            if (r2 >= r4) goto L32
            java.lang.Object r4 = r0.get(r2)
            boolean r5 = r1.apply(r4)
            if (r5 != 0) goto L2f
            if (r2 <= r3) goto L2d
            r0.set(r3, r4)     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            p185k7.C3828h5.m8576E(r0, r1, r3, r2)
            goto L59
        L2d:
            int r3 = r3 + 1
        L2f:
            int r2 = r2 + 1
            goto L13
        L32:
            int r1 = r0.size()
            java.util.List r0 = r0.subList(r3, r1)
            r0.clear()
            goto L59
        L3e:
            java.util.Iterator r0 = r0.iterator()
            java.util.Objects.requireNonNull(r1)
        L45:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r0.next()
            boolean r2 = r1.apply(r2)
            if (r2 == 0) goto L45
            r0.remove()
            goto L45
        L59:
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(java.lang.Object r3) {
            r2 = this;
            java.util.Collection<E> r0 = r2.f3959Y
            java.util.Objects.requireNonNull(r0)
            r1 = 0
            boolean r0 = r0.contains(r3)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L15
            a9.g<? super E> r0 = r2.f3960Z
            boolean r3 = r0.apply(r3)
            return r3
        L15:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
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
            goto L17
        L16:
            r2 = 1
        L17:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
            r6 = this;
            java.util.Collection<E> r0 = r6.f3959Y
            a9.g<? super E> r1 = r6.f3960Z
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r2 = "predicate"
            p124h7.C2939x3.m7281g(r1, r2)
            r2 = 0
            r3 = 0
        Lf:
            boolean r4 = r0.hasNext()
            r5 = -1
            if (r4 == 0) goto L24
            java.lang.Object r4 = r0.next()
            boolean r4 = r1.apply(r4)
            if (r4 == 0) goto L21
            goto L25
        L21:
            int r3 = r3 + 1
            goto Lf
        L24:
            r3 = -1
        L25:
            r0 = 1
            if (r3 == r5) goto L29
            r2 = 1
        L29:
            r0 = r0 ^ r2
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r3 = this;
            java.util.Collection<E> r0 = r3.f3959Y
            java.util.Iterator r0 = r0.iterator()
            a9.g<? super E> r1 = r3.f3960Z
            java.util.Objects.requireNonNull(r0)
            java.util.Objects.requireNonNull(r1)
            b9.q r2 = new b9.q
            r2.<init>(r0, r1)
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L10
            java.util.Collection<E> r0 = r1.f3959Y
            boolean r2 = r0.remove(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r5) {
            r4 = this;
            java.util.Collection<E> r0 = r4.f3959Y
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            a9.g<? super E> r3 = r4.f3960Z
            boolean r3 = r3.apply(r2)
            if (r3 == 0) goto L7
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L7
            r0.remove()
            r1 = 1
            goto L7
        L24:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r5) {
            r4 = this;
            java.util.Collection<E> r0 = r4.f3959Y
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            a9.g<? super E> r3 = r4.f3960Z
            boolean r3 = r3.apply(r2)
            if (r3 == 0) goto L7
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L7
            r0.remove()
            r1 = 1
            goto L7
        L24:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
            r4 = this;
            java.util.Collection<E> r0 = r4.f3959Y
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1c
            java.lang.Object r2 = r0.next()
            a9.g<? super E> r3 = r4.f3960Z
            boolean r2 = r3.apply(r2)
            if (r2 == 0) goto L7
            int r1 = r1 + 1
            goto L7
        L1c:
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            java.util.ArrayList r0 = p026b9.C0720t.m2330d(r0)
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.Iterator r0 = r1.iterator()
            java.util.ArrayList r0 = p026b9.C0720t.m2330d(r0)
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
