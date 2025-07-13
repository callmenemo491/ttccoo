package p221m9;

/* renamed from: m9.c0 */
/* loaded from: classes.dex */
public class C4440c0 extends p221m9.C4443d0 {

    /* renamed from: m9.c0$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: m9.c0$b */
    public static class b<K> implements java.util.Map.Entry<K, java.lang.Object> {

        /* renamed from: Y */
        public java.util.Map.Entry<K, p221m9.C4440c0> f18112Y;

        public b(java.util.Map.Entry r1, p221m9.C4440c0.a r2) {
                r0 = this;
                r0.<init>()
                r0.f18112Y = r1
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                java.util.Map$Entry<K, m9.c0> r0 = r1.f18112Y
                java.lang.Object r0 = r0.getKey()
                return r0
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
                r1 = this;
                java.util.Map$Entry<K, m9.c0> r0 = r1.f18112Y
                java.lang.Object r0 = r0.getValue()
                m9.c0 r0 = (p221m9.C4440c0) r0
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                m9.q0 r0 = r0.m9911c()
                return r0
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p221m9.InterfaceC4482q0
                if (r0 == 0) goto L16
                java.util.Map$Entry<K, m9.c0> r0 = r3.f18112Y
                java.lang.Object r0 = r0.getValue()
                m9.c0 r0 = (p221m9.C4440c0) r0
                m9.q0 r4 = (p221m9.InterfaceC4482q0) r4
                m9.q0 r1 = r0.f18120a
                r2 = 0
                r0.f18121b = r2
                r0.f18120a = r4
                return r1
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
                r4.<init>(r0)
                throw r4
        }
    }

    /* renamed from: m9.c0$c */
    public static class c<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {

        /* renamed from: Y */
        public java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> f18113Y;

        public c(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> r1) {
                r0 = this;
                r0.<init>()
                r0.f18113Y = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.f18113Y
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r3 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r3.f18113Y
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                boolean r1 = r1 instanceof p221m9.C4440c0
                if (r1 == 0) goto L17
                m9.c0$b r1 = new m9.c0$b
                r2 = 0
                r1.<init>(r0, r2)
                r0 = r1
            L17:
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.f18113Y
                r0.remove()
                return
        }
    }

    /* renamed from: c */
    public p221m9.InterfaceC4482q0 m9911c() {
            r1 = this;
            r0 = 0
            m9.q0 r0 = r1.m9916a(r0)
            return r0
    }

    @Override // p221m9.C4443d0
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            m9.q0 r0 = r1.m9911c()
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // p221m9.C4443d0
    public int hashCode() {
            r1 = this;
            m9.q0 r0 = r1.m9911c()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            m9.q0 r0 = r1.m9911c()
            java.lang.String r0 = r0.toString()
            return r0
    }
}
