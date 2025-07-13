package p026b9;

/* renamed from: b9.m */
/* loaded from: classes.dex */
public class C0712m<K, V> extends p026b9.AbstractC0698f<K, V> implements java.io.Serializable {

    /* renamed from: Y */
    public final K f3977Y;

    /* renamed from: Z */
    public final V f3978Z;

    public C0712m(K r1, V r2) {
            r0 = this;
            r0.<init>()
            r0.f3977Y = r1
            r0.f3978Z = r2
            return
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
            r1 = this;
            K r0 = r1.f3977Y
            return r0
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
            r1 = this;
            V r0 = r1.f3978Z
            return r0
    }

    @Override // java.util.Map.Entry
    public final V setValue(V r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
