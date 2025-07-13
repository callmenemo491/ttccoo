package p094fa;

/* renamed from: fa.b0 */
/* loaded from: classes.dex */
public final class C2105b0<E> implements java.util.List<E>, java.util.RandomAccess {

    /* renamed from: Y */
    public final java.util.List<E> f9666Y;

    public C2105b0(java.util.List<E> r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r0.f9666Y = r1
            return
    }

    @Override // java.util.List
    public void add(int r2, E r3) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            r0.add(r2, r3)
            return
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.add(r2)
            return r2
    }

    @Override // java.util.List
    public boolean addAll(int r2, java.util.Collection<? extends E> r3) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.addAll(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.addAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            r0.clear()
            return
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.containsAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            int r2 = r0.lastIndexOf(r2)
            return r2
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.util.ListIterator r0 = r0.listIterator()
            return r0
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.util.ListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // java.util.List
    public E remove(int r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.removeAll(r2)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<?> r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            boolean r2 = r0.retainAll(r2)
            return r2
    }

    @Override // java.util.List
    public E set(int r2, E r3) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.lang.Object r2 = r0.set(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.List
    public java.util.List<E> subList(int r2, int r3) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.util.List r2 = r0.subList(r2, r3)
            return r2
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.lang.Object[] r0 = r0.toArray()
            return r0
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] r2) {
            r1 = this;
            java.util.List<E> r0 = r1.f9666Y
            java.lang.Object[] r2 = r0.toArray(r2)
            return r2
    }
}
