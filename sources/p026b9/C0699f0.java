package p026b9;

/* renamed from: b9.f0 */
/* loaded from: classes.dex */
public final class C0699f0 extends p026b9.AbstractC0691b0<java.lang.Comparable> implements java.io.Serializable {

    /* renamed from: Y */
    public static final p026b9.C0699f0 f3953Y = null;

    static {
            b9.f0 r0 = new b9.f0
            r0.<init>()
            p026b9.C0699f0.f3953Y = r0
            return
    }

    public C0699f0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p026b9.AbstractC0691b0
    /* renamed from: b */
    public <S extends java.lang.Comparable> p026b9.AbstractC0691b0<S> mo2256b() {
            r1 = this;
            b9.a0 r0 = p026b9.C0689a0.f3895Y
            return r0
    }

    @Override // p026b9.AbstractC0691b0, java.util.Comparator
    public int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.util.Objects.requireNonNull(r1)
            if (r1 != r2) goto Lb
            r1 = 0
            goto Lf
        Lb:
            int r1 = r2.compareTo(r1)
        Lf:
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural().reverse()"
            return r0
    }
}
