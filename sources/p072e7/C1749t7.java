package p072e7;

/* renamed from: e7.t7 */
/* loaded from: classes.dex */
public final class C1749t7 implements java.util.Iterator<java.util.Map.Entry> {

    /* renamed from: Y */
    public int f7791Y;

    /* renamed from: Z */
    public boolean f7792Z;

    /* renamed from: a0 */
    public java.util.Iterator<java.util.Map.Entry> f7793a0;

    /* renamed from: b0 */
    public final /* synthetic */ p072e7.C1767v7 f7794b0;

    public /* synthetic */ C1749t7(p072e7.C1767v7 r1) {
            r0 = this;
            r0.f7794b0 = r1
            r0.<init>()
            r1 = -1
            r0.f7791Y = r1
            return
    }

    /* renamed from: a */
    public final java.util.Iterator<java.util.Map.Entry> m4450a() {
            r1 = this;
            java.util.Iterator<java.util.Map$Entry> r0 = r1.f7793a0
            if (r0 != 0) goto L12
            e7.v7 r0 = r1.f7794b0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f7821a0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.f7793a0 = r0
        L12:
            java.util.Iterator<java.util.Map$Entry> r0 = r1.f7793a0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f7791Y
            r1 = 1
            int r0 = r0 + r1
            e7.v7 r2 = r4.f7794b0
            java.util.List<e7.s7> r2 = r2.f7820Z
            int r2 = r2.size()
            r3 = 0
            if (r0 < r2) goto L26
            e7.v7 r0 = r4.f7794b0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            java.util.Iterator r0 = r4.m4450a()
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L24
            goto L26
        L24:
            return r3
        L25:
            r1 = 0
        L26:
            return r1
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.util.Map.Entry next() {
            r2 = this;
            r0 = 1
            r2.f7792Z = r0
            int r1 = r2.f7791Y
            int r1 = r1 + r0
            r2.f7791Y = r1
            e7.v7 r0 = r2.f7794b0
            java.util.List<e7.s7> r0 = r0.f7820Z
            int r0 = r0.size()
            if (r1 >= r0) goto L1d
            e7.v7 r0 = r2.f7794b0
            java.util.List<e7.s7> r0 = r0.f7820Z
            int r1 = r2.f7791Y
            java.lang.Object r0 = r0.get(r1)
            goto L25
        L1d:
            java.util.Iterator r0 = r2.m4450a()
            java.lang.Object r0 = r0.next()
        L25:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.f7792Z
            if (r0 == 0) goto L2e
            r0 = 0
            r3.f7792Z = r0
            e7.v7 r0 = r3.f7794b0
            int r1 = p072e7.C1767v7.f7818e0
            r0.m4469h()
            int r0 = r3.f7791Y
            e7.v7 r1 = r3.f7794b0
            java.util.List<e7.s7> r1 = r1.f7820Z
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            e7.v7 r0 = r3.f7794b0
            int r1 = r3.f7791Y
            int r2 = r1 + (-1)
            r3.f7791Y = r2
            r0.m4467f(r1)
            return
        L26:
            java.util.Iterator r0 = r3.m4450a()
            r0.remove()
            return
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
