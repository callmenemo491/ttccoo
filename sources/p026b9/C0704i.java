package p026b9;

/* renamed from: b9.i */
/* loaded from: classes.dex */
public final class C0704i<T> extends p026b9.AbstractC0691b0<T> implements java.io.Serializable {

    /* renamed from: Y */
    public final java.util.Comparator<T> f3961Y;

    public C0704i(java.util.Comparator<T> r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f3961Y = r1
            return
    }

    @Override // p026b9.AbstractC0691b0, java.util.Comparator
    public int compare(T r2, T r3) {
            r1 = this;
            java.util.Comparator<T> r0 = r1.f3961Y
            int r2 = r0.compare(r2, r3)
            return r2
    }

    @Override // java.util.Comparator
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p026b9.C0704i
            if (r0 == 0) goto L13
            b9.i r2 = (p026b9.C0704i) r2
            java.util.Comparator<T> r0 = r1.f3961Y
            java.util.Comparator<T> r2 = r2.f3961Y
            boolean r2 = r0.equals(r2)
            return r2
        L13:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.f3961Y
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Comparator<T> r0 = r1.f3961Y
            java.lang.String r0 = r0.toString()
            return r0
    }
}
