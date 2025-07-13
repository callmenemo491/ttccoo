package p319s;

/* renamed from: s.a */
/* loaded from: classes.dex */
public class C5934a<K, V> extends p319s.C5941h<K, V> implements java.util.Map<K, V> {

    /* renamed from: f0 */
    public p319s.AbstractC5940g<K, V> f22762f0;

    /* renamed from: s.a$a */
    public class a extends p319s.AbstractC5940g<K, V> {

        /* renamed from: d */
        public final /* synthetic */ p319s.C5934a f22763d;

        public a(p319s.C5934a r1) {
                r0 = this;
                r0.f22763d = r1
                r0.<init>()
                return
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: a */
        public void mo12300a() {
                r1 = this;
                s.a r0 = r1.f22763d
                r0.clear()
                return
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: b */
        public java.lang.Object mo12301b(int r2, int r3) {
                r1 = this;
                s.a r0 = r1.f22763d
                java.lang.Object[] r0 = r0.f22811Z
                int r2 = r2 << 1
                int r2 = r2 + r3
                r2 = r0[r2]
                return r2
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: c */
        public java.util.Map<K, V> mo12302c() {
                r1 = this;
                s.a r0 = r1.f22763d
                return r0
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: d */
        public int mo12303d() {
                r1 = this;
                s.a r0 = r1.f22763d
                int r0 = r0.f22812a0
                return r0
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: e */
        public int mo12304e(java.lang.Object r2) {
                r1 = this;
                s.a r0 = r1.f22763d
                int r2 = r0.m12340e(r2)
                return r2
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: f */
        public int mo12305f(java.lang.Object r2) {
                r1 = this;
                s.a r0 = r1.f22763d
                int r2 = r0.m12342g(r2)
                return r2
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: g */
        public void mo12306g(K r2, V r3) {
                r1 = this;
                s.a r0 = r1.f22763d
                r0.put(r2, r3)
                return
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: h */
        public void mo12307h(int r2) {
                r1 = this;
                s.a r0 = r1.f22763d
                r0.mo5830j(r2)
                return
        }

        @Override // p319s.AbstractC5940g
        /* renamed from: i */
        public V mo12308i(int r2, V r3) {
                r1 = this;
                s.a r0 = r1.f22763d
                java.lang.Object r2 = r0.mo5831k(r2, r3)
                return r2
        }
    }

    public C5934a() {
            r0 = this;
            r0.<init>()
            return
    }

    public C5934a(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C5934a(p319s.C5941h r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.mo5829i(r1)
        L8:
            return
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            s.g r0 = r2.m12299m()
            s.g<K, V>$b r1 = r0.f22791a
            if (r1 != 0) goto Lf
            s.g$b r1 = new s.g$b
            r1.<init>(r0)
            r0.f22791a = r1
        Lf:
            s.g<K, V>$b r0 = r0.f22791a
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<K> keySet() {
            r2 = this;
            s.g r0 = r2.m12299m()
            s.g<K, V>$c r1 = r0.f22792b
            if (r1 != 0) goto Lf
            s.g$c r1 = new s.g$c
            r1.<init>(r0)
            r0.f22792b = r1
        Lf:
            s.g<K, V>$c r0 = r0.f22792b
            return r0
    }

    /* renamed from: m */
    public final p319s.AbstractC5940g<K, V> m12299m() {
            r1 = this;
            s.g<K, V> r0 = r1.f22762f0
            if (r0 != 0) goto Lb
            s.a$a r0 = new s.a$a
            r0.<init>(r1)
            r1.f22762f0 = r0
        Lb:
            s.g<K, V> r0 = r1.f22762f0
            return r0
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r3) {
            r2 = this;
            int r0 = r2.f22812a0
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.m12338b(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r2 = this;
            s.g r0 = r2.m12299m()
            s.g<K, V>$e r1 = r0.f22793c
            if (r1 != 0) goto Lf
            s.g$e r1 = new s.g$e
            r1.<init>(r0)
            r0.f22793c = r1
        Lf:
            s.g<K, V>$e r0 = r0.f22793c
            return r0
    }
}
