package ck;

/* renamed from: ck.b */
/* loaded from: classes.dex */
public abstract class AbstractC0993b implements p015ak.InterfaceC0118b, java.io.Serializable {

    /* renamed from: Y */
    public java.lang.String f5083Y;

    public AbstractC0993b() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p015ak.InterfaceC0118b
    /* renamed from: a */
    public java.lang.String mo177a() {
            r1 = this;
            java.lang.String r0 = r1.f5083Y
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.String r1 = r2.mo177a()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
