package p124h7;

/* renamed from: h7.q0 */
/* loaded from: classes.dex */
public final class C2810q0 implements java.util.Iterator<java.util.Map.Entry> {

    /* renamed from: Y */
    public int f11846Y;

    /* renamed from: Z */
    public boolean f11847Z;

    /* renamed from: a0 */
    public java.util.Iterator<java.util.Map.Entry> f11848a0;

    /* renamed from: b0 */
    public final /* synthetic */ p124h7.C2846s0 f11849b0;

    public /* synthetic */ C2810q0(p124h7.C2846s0 r1) {
            r0 = this;
            r0.f11849b0 = r1
            r0.<init>()
            r1 = -1
            r0.f11846Y = r1
            return
    }

    /* renamed from: a */
    public final java.util.Iterator<java.util.Map.Entry> m7048a() {
            r1 = this;
            java.util.Iterator<java.util.Map$Entry> r0 = r1.f11848a0
            if (r0 != 0) goto L12
            h7.s0 r0 = r1.f11849b0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f11898a0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.f11848a0 = r0
        L12:
            java.util.Iterator<java.util.Map$Entry> r0 = r1.f11848a0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f11846Y
            r1 = 1
            int r0 = r0 + r1
            h7.s0 r2 = r4.f11849b0
            java.util.List<h7.p0> r2 = r2.f11897Z
            int r2 = r2.size()
            r3 = 0
            if (r0 < r2) goto L26
            h7.s0 r0 = r4.f11849b0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f11898a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            java.util.Iterator r0 = r4.m7048a()
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
            r2.f11847Z = r0
            int r1 = r2.f11846Y
            int r1 = r1 + r0
            r2.f11846Y = r1
            h7.s0 r0 = r2.f11849b0
            java.util.List<h7.p0> r0 = r0.f11897Z
            int r0 = r0.size()
            if (r1 >= r0) goto L1d
            h7.s0 r0 = r2.f11849b0
            java.util.List<h7.p0> r0 = r0.f11897Z
            int r1 = r2.f11846Y
            java.lang.Object r0 = r0.get(r1)
            goto L25
        L1d:
            java.util.Iterator r0 = r2.m7048a()
            java.lang.Object r0 = r0.next()
        L25:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.f11847Z
            if (r0 == 0) goto L2e
            r0 = 0
            r3.f11847Z = r0
            h7.s0 r0 = r3.f11849b0
            int r1 = p124h7.C2846s0.f11895e0
            r0.m7119h()
            int r0 = r3.f11846Y
            h7.s0 r1 = r3.f11849b0
            java.util.List<h7.p0> r1 = r1.f11897Z
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            h7.s0 r0 = r3.f11849b0
            int r1 = r3.f11846Y
            int r2 = r1 + (-1)
            r3.f11846Y = r2
            r0.m7117f(r1)
            return
        L26:
            java.util.Iterator r0 = r3.m7048a()
            r0.remove()
            return
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
