package p072e7;

/* renamed from: e7.v */
/* loaded from: classes.dex */
public final class C1759v extends p072e7.AbstractC1722r<java.util.Map.Entry> {

    /* renamed from: a0 */
    public final /* synthetic */ p072e7.C1768w f7809a0;

    public C1759v(p072e7.C1768w r1) {
            r0 = this;
            r0.f7809a0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object get(int r3) {
            r2 = this;
            r0 = 0
            java.lang.String r1 = "index"
            p052d6.C1310h0.m3799a(r3, r0, r1)
            int r3 = r3 + r3
            e7.w r0 = r2.f7809a0
            java.lang.Object[] r0 = r0.f7825a0
            r0 = r0[r3]
            java.util.Objects.requireNonNull(r0)
            e7.w r1 = r2.f7809a0
            java.lang.Object[] r1 = r1.f7825a0
            int r3 = r3 + 1
            r3 = r1[r3]
            java.util.Objects.requireNonNull(r3)
            java.util.AbstractMap$SimpleImmutableEntry r1 = new java.util.AbstractMap$SimpleImmutableEntry
            r1.<init>(r0, r3)
            return r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}
