package p026b9;

/* renamed from: b9.y */
/* loaded from: classes.dex */
public class C0725y<K, V> extends p026b9.AbstractC0692c<K, V> {

    /* renamed from: d0 */
    public transient p010a9.InterfaceC0044l<? extends java.util.List<V>> f4002d0;

    public C0725y(java.util.Map<K, java.util.Collection<V>> r1, p010a9.InterfaceC0044l<? extends java.util.List<V>> r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.Objects.requireNonNull(r2)
            r0.f4002d0 = r2
            return
    }

    @Override // p026b9.AbstractC0696e
    /* renamed from: e */
    public java.util.Collection mo2276e() {
            r1 = this;
            a9.l<? extends java.util.List<V>> r0 = r1.f4002d0
            java.lang.Object r0 = r0.get()
            java.util.List r0 = (java.util.List) r0
            return r0
    }
}
