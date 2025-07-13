package p185k7;

/* renamed from: k7.x7 */
/* loaded from: classes.dex */
public final class C4041x7 implements java.util.Iterator<java.util.Map.Entry> {

    /* renamed from: Y */
    public int f16949Y;

    /* renamed from: Z */
    public boolean f16950Z;

    /* renamed from: a0 */
    public java.util.Iterator<java.util.Map.Entry> f16951a0;

    /* renamed from: b0 */
    public final /* synthetic */ p185k7.C4067z7 f16952b0;

    public /* synthetic */ C4041x7(p185k7.C4067z7 r1) {
            r0 = this;
            r0.f16952b0 = r1
            r0.<init>()
            r1 = -1
            r0.f16949Y = r1
            return
    }

    /* renamed from: a */
    public final java.util.Iterator<java.util.Map.Entry> m9109a() {
            r1 = this;
            java.util.Iterator<java.util.Map$Entry> r0 = r1.f16951a0
            if (r0 != 0) goto L12
            k7.z7 r0 = r1.f16952b0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f16986a0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1.f16951a0 = r0
        L12:
            java.util.Iterator<java.util.Map$Entry> r0 = r1.f16951a0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f16949Y
            r1 = 1
            int r0 = r0 + r1
            k7.z7 r2 = r4.f16952b0
            java.util.List<k7.v7> r2 = r2.f16985Z
            int r2 = r2.size()
            r3 = 0
            if (r0 < r2) goto L26
            k7.z7 r0 = r4.f16952b0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.f16986a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L25
            java.util.Iterator r0 = r4.m9109a()
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
    public final /* bridge */ /* synthetic */ java.util.Map.Entry next() {
            r2 = this;
            r0 = 1
            r2.f16950Z = r0
            int r1 = r2.f16949Y
            int r1 = r1 + r0
            r2.f16949Y = r1
            k7.z7 r0 = r2.f16952b0
            java.util.List<k7.v7> r0 = r0.f16985Z
            int r0 = r0.size()
            if (r1 >= r0) goto L1d
            k7.z7 r0 = r2.f16952b0
            java.util.List<k7.v7> r0 = r0.f16985Z
            int r1 = r2.f16949Y
            java.lang.Object r0 = r0.get(r1)
            goto L25
        L1d:
            java.util.Iterator r0 = r2.m9109a()
            java.lang.Object r0 = r0.next()
        L25:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r3 = this;
            boolean r0 = r3.f16950Z
            if (r0 == 0) goto L2e
            r0 = 0
            r3.f16950Z = r0
            k7.z7 r0 = r3.f16952b0
            int r1 = p185k7.C4067z7.f16983e0
            r0.m9167h()
            int r0 = r3.f16949Y
            k7.z7 r1 = r3.f16952b0
            java.util.List<k7.v7> r1 = r1.f16985Z
            int r1 = r1.size()
            if (r0 >= r1) goto L26
            k7.z7 r0 = r3.f16952b0
            int r1 = r3.f16949Y
            int r2 = r1 + (-1)
            r3.f16949Y = r2
            r0.m9165f(r1)
            return
        L26:
            java.util.Iterator r0 = r3.m9109a()
            r0.remove()
            return
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "remove() was called before next()"
            r0.<init>(r1)
            throw r0
    }
}
