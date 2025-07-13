package p106g3;

/* renamed from: g3.b */
/* loaded from: classes.dex */
public final class C2230b<K, V> extends p319s.C5934a<K, V> {

    /* renamed from: g0 */
    public int f10194g0;

    public C2230b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p319s.C5941h, java.util.Map
    public void clear() {
            r1 = this;
            r0 = 0
            r1.f10194g0 = r0
            super.clear()
            return
    }

    @Override // p319s.C5941h, java.util.Map
    public int hashCode() {
            r1 = this;
            int r0 = r1.f10194g0
            if (r0 != 0) goto La
            int r0 = super.hashCode()
            r1.f10194g0 = r0
        La:
            int r0 = r1.f10194g0
            return r0
    }

    @Override // p319s.C5941h
    /* renamed from: i */
    public void mo5829i(p319s.C5941h<? extends K, ? extends V> r2) {
            r1 = this;
            r0 = 0
            r1.f10194g0 = r0
            super.mo5829i(r2)
            return
    }

    @Override // p319s.C5941h
    /* renamed from: j */
    public V mo5830j(int r2) {
            r1 = this;
            r0 = 0
            r1.f10194g0 = r0
            java.lang.Object r2 = super.mo5830j(r2)
            return r2
    }

    @Override // p319s.C5941h
    /* renamed from: k */
    public V mo5831k(int r3, V r4) {
            r2 = this;
            r0 = 0
            r2.f10194g0 = r0
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.f22811Z
            r1 = r0[r3]
            r0[r3] = r4
            return r1
    }

    @Override // p319s.C5941h, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            r0 = 0
            r1.f10194g0 = r0
            java.lang.Object r2 = super.put(r2, r3)
            return r2
    }
}
