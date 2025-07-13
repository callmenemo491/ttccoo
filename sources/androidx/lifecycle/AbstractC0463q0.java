package androidx.lifecycle;

/* renamed from: androidx.lifecycle.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC0463q0 extends androidx.lifecycle.C0465r0 implements androidx.lifecycle.InterfaceC0461p0 {
    public AbstractC0463q0() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public <T extends androidx.lifecycle.AbstractC0457n0> T mo9a(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "create(String, Class<?>) must be called on implementaions of KeyedFactory"
            r2.<init>(r0)
            throw r2
    }

    /* renamed from: c */
    public abstract <T extends androidx.lifecycle.AbstractC0457n0> T mo1426c(java.lang.String r1, java.lang.Class<T> r2);
}
