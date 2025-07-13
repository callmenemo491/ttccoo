package p026b9;

/* renamed from: b9.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC0711l0<F, T> implements java.util.Iterator<T> {

    /* renamed from: Y */
    public final java.util.Iterator<? extends F> f3976Y;

    public AbstractC0711l0(java.util.Iterator<? extends F> r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f3976Y = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.f3976Y
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.f3976Y
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.util.Iterator<? extends F> r0 = r1.f3976Y
            r0.remove()
            return
    }
}
