package p226n;

/* renamed from: n.b */
/* loaded from: classes.dex */
public class C4640b<K, V> implements java.lang.Iterable<java.util.Map.Entry<K, V>> {

    /* renamed from: Y */
    public p226n.C4640b.c<K, V> f18488Y;

    /* renamed from: Z */
    public p226n.C4640b.c<K, V> f18489Z;

    /* renamed from: a0 */
    public java.util.WeakHashMap<p226n.C4640b.f<K, V>, java.lang.Boolean> f18490a0;

    /* renamed from: b0 */
    public int f18491b0;

    /* renamed from: n.b$a */
    public static class a<K, V> extends p226n.C4640b.e<K, V> {
        public a(p226n.C4640b.c<K, V> r1, p226n.C4640b.c<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p226n.C4640b.e
        /* renamed from: b */
        public p226n.C4640b.c<K, V> mo10459b(p226n.C4640b.c<K, V> r1) {
                r0 = this;
                n.b$c<K, V> r1 = r1.f18495b0
                return r1
        }

        @Override // p226n.C4640b.e
        /* renamed from: c */
        public p226n.C4640b.c<K, V> mo10460c(p226n.C4640b.c<K, V> r1) {
                r0 = this;
                n.b$c<K, V> r1 = r1.f18494a0
                return r1
        }
    }

    /* renamed from: n.b$b */
    public static class b<K, V> extends p226n.C4640b.e<K, V> {
        public b(p226n.C4640b.c<K, V> r1, p226n.C4640b.c<K, V> r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // p226n.C4640b.e
        /* renamed from: b */
        public p226n.C4640b.c<K, V> mo10459b(p226n.C4640b.c<K, V> r1) {
                r0 = this;
                n.b$c<K, V> r1 = r1.f18494a0
                return r1
        }

        @Override // p226n.C4640b.e
        /* renamed from: c */
        public p226n.C4640b.c<K, V> mo10460c(p226n.C4640b.c<K, V> r1) {
                r0 = this;
                n.b$c<K, V> r1 = r1.f18495b0
                return r1
        }
    }

    /* renamed from: n.b$c */
    public static class c<K, V> implements java.util.Map.Entry<K, V> {

        /* renamed from: Y */
        public final K f18492Y;

        /* renamed from: Z */
        public final V f18493Z;

        /* renamed from: a0 */
        public p226n.C4640b.c<K, V> f18494a0;

        /* renamed from: b0 */
        public p226n.C4640b.c<K, V> f18495b0;

        public c(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.f18492Y = r1
                r0.f18493Z = r2
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof p226n.C4640b.c
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                n.b$c r5 = (p226n.C4640b.c) r5
                K r1 = r4.f18492Y
                K r3 = r5.f18492Y
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                V r1 = r4.f18493Z
                V r5 = r5.f18493Z
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = 0
            L22:
                return r0
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.f18492Y
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.f18493Z
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r2 = this;
                K r0 = r2.f18492Y
                int r0 = r0.hashCode()
                V r1 = r2.f18493Z
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "An entry modification is not supported"
                r2.<init>(r0)
                throw r2
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.f18492Y
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.f18493Z
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* renamed from: n.b$d */
    public class d implements java.util.Iterator<java.util.Map.Entry<K, V>>, p226n.C4640b.f<K, V> {

        /* renamed from: Y */
        public p226n.C4640b.c<K, V> f18496Y;

        /* renamed from: Z */
        public boolean f18497Z;

        /* renamed from: a0 */
        public final /* synthetic */ p226n.C4640b f18498a0;

        public d(p226n.C4640b r1) {
                r0 = this;
                r0.f18498a0 = r1
                r0.<init>()
                r1 = 1
                r0.f18497Z = r1
                return
        }

        @Override // p226n.C4640b.f
        /* renamed from: a */
        public void mo10461a(p226n.C4640b.c<K, V> r2) {
                r1 = this;
                n.b$c<K, V> r0 = r1.f18496Y
                if (r2 != r0) goto Lf
                n.b$c<K, V> r2 = r0.f18495b0
                r1.f18496Y = r2
                if (r2 != 0) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                r1.f18497Z = r2
            Lf:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                boolean r0 = r3.f18497Z
                r1 = 1
                r2 = 0
                if (r0 == 0) goto Lf
                n.b r0 = r3.f18498a0
                n.b$c<K, V> r0 = r0.f18488Y
                if (r0 == 0) goto Ld
                goto Le
            Ld:
                r1 = 0
            Le:
                return r1
            Lf:
                n.b$c<K, V> r0 = r3.f18496Y
                if (r0 == 0) goto L18
                n.b$c<K, V> r0 = r0.f18494a0
                if (r0 == 0) goto L18
                goto L19
            L18:
                r1 = 0
            L19:
                return r1
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r1 = this;
                boolean r0 = r1.f18497Z
                if (r0 == 0) goto Lc
                r0 = 0
                r1.f18497Z = r0
                n.b r0 = r1.f18498a0
                n.b$c<K, V> r0 = r0.f18488Y
                goto L14
            Lc:
                n.b$c<K, V> r0 = r1.f18496Y
                if (r0 == 0) goto L13
                n.b$c<K, V> r0 = r0.f18494a0
                goto L14
            L13:
                r0 = 0
            L14:
                r1.f18496Y = r0
                return r0
        }
    }

    /* renamed from: n.b$e */
    public static abstract class e<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, p226n.C4640b.f<K, V> {

        /* renamed from: Y */
        public p226n.C4640b.c<K, V> f18499Y;

        /* renamed from: Z */
        public p226n.C4640b.c<K, V> f18500Z;

        public e(p226n.C4640b.c<K, V> r1, p226n.C4640b.c<K, V> r2) {
                r0 = this;
                r0.<init>()
                r0.f18499Y = r2
                r0.f18500Z = r1
                return
        }

        @Override // p226n.C4640b.f
        /* renamed from: a */
        public void mo10461a(p226n.C4640b.c<K, V> r3) {
                r2 = this;
                n.b$c<K, V> r0 = r2.f18499Y
                r1 = 0
                if (r0 != r3) goto Ld
                n.b$c<K, V> r0 = r2.f18500Z
                if (r3 != r0) goto Ld
                r2.f18500Z = r1
                r2.f18499Y = r1
            Ld:
                n.b$c<K, V> r0 = r2.f18499Y
                if (r0 != r3) goto L17
                n.b$c r0 = r2.mo10459b(r0)
                r2.f18499Y = r0
            L17:
                n.b$c<K, V> r0 = r2.f18500Z
                if (r0 != r3) goto L28
                n.b$c<K, V> r3 = r2.f18499Y
                if (r0 == r3) goto L26
                if (r3 != 0) goto L22
                goto L26
            L22:
                n.b$c r1 = r2.mo10460c(r0)
            L26:
                r2.f18500Z = r1
            L28:
                return
        }

        /* renamed from: b */
        public abstract p226n.C4640b.c<K, V> mo10459b(p226n.C4640b.c<K, V> r1);

        /* renamed from: c */
        public abstract p226n.C4640b.c<K, V> mo10460c(p226n.C4640b.c<K, V> r1);

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                n.b$c<K, V> r0 = r1.f18500Z
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r2 = this;
                n.b$c<K, V> r0 = r2.f18500Z
                n.b$c<K, V> r1 = r2.f18499Y
                if (r0 == r1) goto Le
                if (r1 != 0) goto L9
                goto Le
            L9:
                n.b$c r1 = r2.mo10460c(r0)
                goto Lf
            Le:
                r1 = 0
            Lf:
                r2.f18500Z = r1
                return r0
        }
    }

    /* renamed from: n.b$f */
    public interface f<K, V> {
        /* renamed from: a */
        void mo10461a(p226n.C4640b.c<K, V> r1);
    }

    public C4640b() {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f18490a0 = r0
            r0 = 0
            r1.f18491b0 = r0
            return
    }

    /* renamed from: a */
    public p226n.C4640b.c<K, V> mo10454a(K r3) {
            r2 = this;
            n.b$c<K, V> r0 = r2.f18488Y
        L2:
            if (r0 == 0) goto L10
            K r1 = r0.f18492Y
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Ld
            goto L10
        Ld:
            n.b$c<K, V> r0 = r0.f18494a0
            goto L2
        L10:
            return r0
    }

    /* renamed from: e */
    public p226n.C4640b<K, V>.d m10457e() {
            r3 = this;
            n.b$d r0 = new n.b$d
            r0.<init>(r3)
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r3.f18490a0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof p226n.C4640b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.b r7 = (p226n.C4640b) r7
            int r1 = r6.f18491b0
            int r3 = r7.f18491b0
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.b$e r3 = (p226n.C4640b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.b$e r4 = (p226n.C4640b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.b$e r7 = (p226n.C4640b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
    }

    /* renamed from: h */
    public p226n.C4640b.c<K, V> m10458h(K r2, V r3) {
            r1 = this;
            n.b$c r0 = new n.b$c
            r0.<init>(r2, r3)
            int r2 = r1.f18491b0
            int r2 = r2 + 1
            r1.f18491b0 = r2
            n.b$c<K, V> r2 = r1.f18489Z
            if (r2 != 0) goto L14
            r1.f18488Y = r0
        L11:
            r1.f18489Z = r0
            return r0
        L14:
            r2.f18494a0 = r0
            r0.f18495b0 = r2
            goto L11
    }

    public int hashCode() {
            r4 = this;
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        L5:
            r2 = r0
            n.b$e r2 = (p226n.C4640b.e) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            goto L5
        L1a:
            return r1
    }

    /* renamed from: i */
    public V mo10455i(K r2, V r3) {
            r1 = this;
            n.b$c r0 = r1.mo10454a(r2)
            if (r0 == 0) goto L9
            V r2 = r0.f18493Z
            return r2
        L9:
            r1.m10458h(r2, r3)
            r2 = 0
            return r2
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r3 = this;
            n.b$a r0 = new n.b$a
            n.b$c<K, V> r1 = r3.f18488Y
            n.b$c<K, V> r2 = r3.f18489Z
            r0.<init>(r1, r2)
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r3.f18490a0
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r0, r2)
            return r0
    }

    /* renamed from: l */
    public V mo10456l(K r4) {
            r3 = this;
            n.b$c r4 = r3.mo10454a(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            int r1 = r3.f18491b0
            int r1 = r1 + (-1)
            r3.f18491b0 = r1
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r3.f18490a0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L30
            java.util.WeakHashMap<n.b$f<K, V>, java.lang.Boolean> r1 = r3.f18490a0
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r1.next()
            n.b$f r2 = (p226n.C4640b.f) r2
            r2.mo10461a(r4)
            goto L20
        L30:
            n.b$c<K, V> r1 = r4.f18495b0
            n.b$c<K, V> r2 = r4.f18494a0
            if (r1 == 0) goto L39
            r1.f18494a0 = r2
            goto L3b
        L39:
            r3.f18488Y = r2
        L3b:
            n.b$c<K, V> r2 = r4.f18494a0
            if (r2 == 0) goto L42
            r2.f18495b0 = r1
            goto L44
        L42:
            r3.f18489Z = r1
        L44:
            r4.f18494a0 = r0
            r4.f18495b0 = r0
            V r4 = r4.f18493Z
            return r4
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "["
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.Iterator r1 = r4.iterator()
        La:
            r2 = r1
            n.b$e r2 = (p226n.C4640b.e) r2
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto La
            java.lang.String r2 = ", "
            r0.append(r2)
            goto La
        L2c:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
