package p185k7;

/* renamed from: k7.w4 */
/* loaded from: classes.dex */
public final class C4025w4<T> implements java.io.Serializable, p185k7.InterfaceC3986t4 {

    /* renamed from: Y */
    public final T f16922Y;

    public C4025w4(T r1) {
            r0 = this;
            r0.<init>()
            r0.f16922Y = r1
            return
    }

    @Override // p185k7.InterfaceC3986t4
    /* renamed from: a */
    public final T mo8217a() {
            r1 = this;
            T r0 = r1.f16922Y
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p185k7.C4025w4
            r1 = 0
            if (r0 == 0) goto L17
            k7.w4 r3 = (p185k7.C4025w4) r3
            T r0 = r2.f16922Y
            T r3 = r3.f16922Y
            if (r0 == r3) goto L15
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L14
            goto L15
        L14:
            return r1
        L15:
            r3 = 1
            return r3
        L17:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            T r1 = r3.f16922Y
            r2 = 0
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            T r0 = r4.f16922Y
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 22
            r2.<init>(r1)
            java.lang.String r1 = "Suppliers.ofInstance("
            java.lang.String r3 = ")"
            java.lang.String r0 = p083f.C1932s.m4774a(r2, r1, r0, r3)
            return r0
    }
}
