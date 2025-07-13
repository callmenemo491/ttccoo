package p026b9;

/* renamed from: b9.g0 */
/* loaded from: classes.dex */
public final class C0701g0<T> extends p026b9.AbstractC0691b0<T> implements java.io.Serializable {

    /* renamed from: Y */
    public final p026b9.AbstractC0691b0<? super T> f3958Y;

    public C0701g0(p026b9.AbstractC0691b0<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.f3958Y = r1
            return
    }

    @Override // p026b9.AbstractC0691b0
    /* renamed from: b */
    public <S extends T> p026b9.AbstractC0691b0<S> mo2256b() {
            r1 = this;
            b9.b0<? super T> r0 = r1.f3958Y
            return r0
    }

    @Override // p026b9.AbstractC0691b0, java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            b9.b0<? super T> r0 = r1.f3958Y
            int r2 = r0.compare(r3, r2)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p026b9.C0701g0
            if (r0 == 0) goto L13
            b9.g0 r2 = (p026b9.C0701g0) r2
            b9.b0<? super T> r0 = r1.f3958Y
            b9.b0<? super T> r2 = r2.f3958Y
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            b9.b0<? super T> r0 = r1.f3958Y
            int r0 = r0.hashCode()
            int r0 = -r0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            b9.b0<? super T> r1 = r2.f3958Y
            r0.append(r1)
            java.lang.String r1 = ".reverse()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
