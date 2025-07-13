package p400wj;

/* renamed from: wj.c */
/* loaded from: classes.dex */
public final class C6890c implements java.security.PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ java.lang.String f26793a;

    public C6890c(java.lang.String r1) {
            r0 = this;
            r0.f26793a = r1
            r0.<init>()
            return
    }

    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
            r2 = this;
            java.lang.ThreadLocal r0 = p400wj.C6891d.f26794a
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L11
            java.lang.String r1 = r2.f26793a
            java.lang.Object r0 = r0.get(r1)
            return r0
        L11:
            java.lang.String r0 = r2.f26793a
            java.lang.String r0 = java.lang.System.getProperty(r0)
            return r0
    }
}
