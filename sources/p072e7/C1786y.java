package p072e7;

/* renamed from: e7.y */
/* loaded from: classes.dex */
public final class C1786y extends p072e7.AbstractC1722r<java.lang.Object> {

    /* renamed from: a0 */
    public final transient java.lang.Object[] f7840a0;

    /* renamed from: b0 */
    public final transient int f7841b0;

    public C1786y(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7840a0 = r1
            r0.f7841b0 = r2
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "index"
            p052d6.C1310h0.m3799a(r3, r0, r1)
            java.lang.Object[] r0 = r2.f7840a0
            int r3 = r3 + r3
            int r1 = r2.f7841b0
            int r3 = r3 + r1
            r3 = r0[r3]
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}
