package p026b9;

/* renamed from: b9.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC0691b0<T> implements java.util.Comparator<T> {
    public AbstractC0691b0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static <T> p026b9.AbstractC0691b0<T> m2258a(java.util.Comparator<T> r1) {
            boolean r0 = r1 instanceof p026b9.AbstractC0691b0
            if (r0 == 0) goto L7
            b9.b0 r1 = (p026b9.AbstractC0691b0) r1
            goto Ld
        L7:
            b9.i r0 = new b9.i
            r0.<init>(r1)
            r1 = r0
        Ld:
            return r1
    }

    /* renamed from: b */
    public <S extends T> p026b9.AbstractC0691b0<S> mo2256b() {
            r1 = this;
            b9.g0 r0 = new b9.g0
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Comparator
    public abstract int compare(T r1, T r2);
}
