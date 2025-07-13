package p026b9;

/* renamed from: b9.x */
/* loaded from: classes.dex */
public final class C0724x<V> implements p010a9.InterfaceC0044l<java.util.List<V>>, java.io.Serializable {

    /* renamed from: Y */
    public final int f4001Y;

    public C0724x(int r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "expectedValuesPerKey"
            p026b9.C0720t.m2328b(r2, r0)
            r1.f4001Y = r2
            return
    }

    @Override // p010a9.InterfaceC0044l
    public java.lang.Object get() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.f4001Y
            r0.<init>(r1)
            return r0
    }
}
