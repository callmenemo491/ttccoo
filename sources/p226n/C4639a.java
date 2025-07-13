package p226n;

/* renamed from: n.a */
/* loaded from: classes.dex */
public class C4639a<K, V> extends p226n.C4640b<K, V> {

    /* renamed from: c0 */
    public java.util.HashMap<K, p226n.C4640b.c<K, V>> f18487c0;

    public C4639a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f18487c0 = r0
            return
    }

    @Override // p226n.C4640b
    /* renamed from: a */
    public p226n.C4640b.c<K, V> mo10454a(K r2) {
            r1 = this;
            java.util.HashMap<K, n.b$c<K, V>> r0 = r1.f18487c0
            java.lang.Object r2 = r0.get(r2)
            n.b$c r2 = (p226n.C4640b.c) r2
            return r2
    }

    public boolean contains(K r2) {
            r1 = this;
            java.util.HashMap<K, n.b$c<K, V>> r0 = r1.f18487c0
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // p226n.C4640b
    /* renamed from: i */
    public V mo10455i(K r2, V r3) {
            r1 = this;
            java.util.HashMap<K, n.b$c<K, V>> r0 = r1.f18487c0
            java.lang.Object r0 = r0.get(r2)
            n.b$c r0 = (p226n.C4640b.c) r0
            if (r0 == 0) goto Ld
            V r2 = r0.f18493Z
            return r2
        Ld:
            java.util.HashMap<K, n.b$c<K, V>> r0 = r1.f18487c0
            n.b$c r3 = r1.m10458h(r2, r3)
            r0.put(r2, r3)
            r2 = 0
            return r2
    }

    @Override // p226n.C4640b
    /* renamed from: l */
    public V mo10456l(K r3) {
            r2 = this;
            java.lang.Object r0 = super.mo10456l(r3)
            java.util.HashMap<K, n.b$c<K, V>> r1 = r2.f18487c0
            r1.remove(r3)
            return r0
    }
}
