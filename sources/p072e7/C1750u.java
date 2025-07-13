package p072e7;

/* renamed from: e7.u */
/* loaded from: classes.dex */
public final class C1750u<E> extends p072e7.AbstractC1722r<E> {

    /* renamed from: c0 */
    public static final p072e7.AbstractC1722r<java.lang.Object> f7795c0 = null;

    /* renamed from: a0 */
    public final transient java.lang.Object[] f7796a0;

    /* renamed from: b0 */
    public final transient int f7797b0;

    static {
            e7.u r0 = new e7.u
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2, r1)
            p072e7.C1750u.f7795c0 = r0
            return
    }

    public C1750u(java.lang.Object[] r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f7796a0 = r1
            r0.f7797b0 = r2
            return
    }

    @Override // p072e7.AbstractC1722r, p072e7.AbstractC1692o
    /* renamed from: a */
    public final int mo4401a(java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.Object[] r4 = r2.f7796a0
            int r0 = r2.f7797b0
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
            int r3 = r2.f7797b0
            return r3
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: e */
    public final int mo4402e() {
            r1 = this;
            int r0 = r1.f7797b0
            return r0
    }

    @Override // java.util.List
    public final E get(int r3) {
            r2 = this;
            int r0 = r2.f7797b0
            java.lang.String r1 = "index"
            p052d6.C1310h0.m3799a(r3, r0, r1)
            java.lang.Object[] r0 = r2.f7796a0
            r3 = r0[r3]
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: h */
    public final int mo4403h() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: i */
    public final java.lang.Object[] mo4404i() {
            r1 = this;
            java.lang.Object[] r0 = r1.f7796a0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7797b0
            return r0
    }
}
