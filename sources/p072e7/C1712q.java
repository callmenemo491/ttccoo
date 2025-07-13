package p072e7;

/* renamed from: e7.q */
/* loaded from: classes.dex */
public final class C1712q extends p072e7.AbstractC1722r {

    /* renamed from: a0 */
    public final transient int f7740a0;

    /* renamed from: b0 */
    public final transient int f7741b0;

    /* renamed from: c0 */
    public final /* synthetic */ p072e7.AbstractC1722r f7742c0;

    public C1712q(p072e7.AbstractC1722r r1, int r2, int r3) {
            r0 = this;
            r0.f7742c0 = r1
            r0.<init>()
            r0.f7740a0 = r2
            r0.f7741b0 = r3
            return
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: e */
    public final int mo4402e() {
            r2 = this;
            e7.r r0 = r2.f7742c0
            int r0 = r0.mo4403h()
            int r1 = r2.f7740a0
            int r0 = r0 + r1
            int r1 = r2.f7741b0
            int r0 = r0 + r1
            return r0
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.f7741b0
            java.lang.String r1 = "index"
            p052d6.C1310h0.m3799a(r3, r0, r1)
            e7.r r0 = r2.f7742c0
            int r1 = r2.f7740a0
            int r3 = r3 + r1
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: h */
    public final int mo4403h() {
            r2 = this;
            e7.r r0 = r2.f7742c0
            int r0 = r0.mo4403h()
            int r1 = r2.f7740a0
            int r0 = r0 + r1
            return r0
    }

    @Override // p072e7.AbstractC1692o
    /* renamed from: i */
    public final java.lang.Object[] mo4404i() {
            r1 = this;
            e7.r r0 = r1.f7742c0
            java.lang.Object[] r0 = r0.mo4404i()
            return r0
    }

    @Override // p072e7.AbstractC1722r
    /* renamed from: l */
    public final p072e7.AbstractC1722r mo4416l(int r3, int r4) {
            r2 = this;
            int r0 = r2.f7741b0
            p052d6.C1310h0.m3805g(r3, r4, r0)
            e7.r r0 = r2.f7742c0
            int r1 = r2.f7740a0
            int r3 = r3 + r1
            int r4 = r4 + r1
            e7.r r3 = r0.mo4416l(r3, r4)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.f7741b0
            return r0
    }

    @Override // p072e7.AbstractC1722r, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            e7.r r1 = r0.mo4416l(r1, r2)
            return r1
    }
}
