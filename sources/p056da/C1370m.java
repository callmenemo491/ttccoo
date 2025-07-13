package p056da;

/* renamed from: da.m */
/* loaded from: classes.dex */
public class C1370m implements p327s7.InterfaceC5984h<la.C4233a, java.lang.Void> {

    /* renamed from: Y */
    public final /* synthetic */ java.util.concurrent.Executor f6931Y;

    /* renamed from: Z */
    public final /* synthetic */ p056da.CallableC1372n f6932Z;

    public C1370m(p056da.CallableC1372n r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.f6932Z = r1
            r0.f6931Y = r2
            r0.<init>()
            return
    }

    @Override // p327s7.InterfaceC5984h
    /* renamed from: k */
    public p327s7.AbstractC5985i<java.lang.Void> mo3892k(la.C4233a r3) {
            r2 = this;
            la.a r3 = (la.C4233a) r3
            if (r3 != 0) goto L11
            r3 = 0
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "Received null app settings, cannot send reports at crash time."
            android.util.Log.w(r0, r1, r3)
            s7.i r3 = p327s7.C5988l.m12464e(r3)
            goto L36
        L11:
            r3 = 2
            s7.i[] r3 = new p327s7.AbstractC5985i[r3]
            r0 = 0
            da.n r1 = r2.f6932Z
            da.r r1 = r1.f6939e
            s7.i r1 = p056da.C1378r.m3895b(r1)
            r3[r0] = r1
            da.n r0 = r2.f6932Z
            da.r r0 = r0.f6939e
            da.l0 r0 = r0.f6961m
            java.util.concurrent.Executor r1 = r2.f6931Y
            s7.i r0 = r0.m3891g(r1)
            r1 = 1
            r3[r1] = r0
            java.util.List r3 = java.util.Arrays.asList(r3)
            s7.i r3 = p327s7.C5988l.m12465f(r3)
        L36:
            return r3
    }
}
