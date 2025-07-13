package p026b9;

/* renamed from: b9.a0 */
/* loaded from: classes.dex */
public final class C0689a0 extends p026b9.AbstractC0691b0<java.lang.Comparable> implements java.io.Serializable {

    /* renamed from: Y */
    public static final p026b9.C0689a0 f3895Y = null;

    static {
            b9.a0 r0 = new b9.a0
            r0.<init>()
            p026b9.C0689a0.f3895Y = r0
            return
    }

    public C0689a0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p026b9.AbstractC0691b0
    /* renamed from: b */
    public <S extends java.lang.Comparable> p026b9.AbstractC0691b0<S> mo2256b() {
            r1 = this;
            b9.f0 r0 = p026b9.C0699f0.f3953Y
            return r0
    }

    @Override // p026b9.AbstractC0691b0, java.util.Comparator
    public int compare(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.util.Objects.requireNonNull(r1)
            java.util.Objects.requireNonNull(r2)
            int r1 = r1.compareTo(r2)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Ordering.natural()"
            return r0
    }
}
