package p026b9;

/* renamed from: b9.c */
/* loaded from: classes.dex */
public abstract class AbstractC0692c<K, V> extends p026b9.AbstractC0696e<K, V> {
    public AbstractC0692c(java.util.Map<K, java.util.Collection<V>> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p026b9.AbstractC0700g, p026b9.InterfaceC0723w
    /* renamed from: a */
    public java.util.Map<K, java.util.Collection<V>> mo2259a() {
            r3 = this;
            java.util.Map<K, java.util.Collection<V>> r0 = r3.f3956a0
            if (r0 != 0) goto L30
            r0 = r3
            b9.y r0 = (p026b9.C0725y) r0
            java.util.Map<K, java.util.Collection<V>> r1 = r0.f3915b0
            boolean r2 = r1 instanceof java.util.NavigableMap
            if (r2 == 0) goto L18
            b9.e$d r1 = new b9.e$d
            java.util.Map<K, java.util.Collection<V>> r2 = r0.f3915b0
            java.util.NavigableMap r2 = (java.util.NavigableMap) r2
            r1.<init>(r0, r2)
        L16:
            r0 = r1
            goto L2e
        L18:
            boolean r1 = r1 instanceof java.util.SortedMap
            if (r1 == 0) goto L26
            b9.e$g r1 = new b9.e$g
            java.util.Map<K, java.util.Collection<V>> r2 = r0.f3915b0
            java.util.SortedMap r2 = (java.util.SortedMap) r2
            r1.<init>(r0, r2)
            goto L16
        L26:
            b9.e$a r1 = new b9.e$a
            java.util.Map<K, java.util.Collection<V>> r2 = r0.f3915b0
            r1.<init>(r0, r2)
            goto L16
        L2e:
            r3.f3956a0 = r0
        L30:
            return r0
    }

    @Override // p026b9.AbstractC0700g
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            boolean r1 = super.equals(r1)
            return r1
    }
}
