package p062dh;

/* renamed from: dh.l */
/* loaded from: classes.dex */
public final class C1476l implements java.util.Map, java.io.Serializable, p259oh.InterfaceC5277a {

    /* renamed from: Y */
    public static final p062dh.C1476l f7238Y = null;

    static {
            dh.l r0 = new dh.l
            r0.<init>()
            p062dh.C1476l.f7238Y = r0
            return
    }

    public C1476l() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Void
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Void r3 = (java.lang.Void) r3
            java.lang.String r0 = "value"
            p214m2.C4339q.m9706k(r3, r0)
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry> entrySet() {
            r1 = this;
            dh.m r0 = p062dh.C1477m.f7239Y
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Le
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.lang.Object> keySet() {
            r1 = this;
            dh.m r0 = p062dh.C1477m.f7239Y
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "{}"
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
            r1 = this;
            dh.k r0 = p062dh.C1475k.f7237Y
            return r0
    }
}
