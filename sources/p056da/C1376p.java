package p056da;

/* renamed from: da.p */
/* loaded from: classes.dex */
public class C1376p implements p327s7.InterfaceC5984h<la.C4233a, java.lang.Void> {

    /* renamed from: Y */
    public final /* synthetic */ java.util.concurrent.Executor f6944Y;

    /* renamed from: Z */
    public final /* synthetic */ p056da.CallableC1377q f6945Z;

    public C1376p(p056da.CallableC1377q r1, java.util.concurrent.Executor r2) {
            r0 = this;
            r0.f6945Z = r1
            r0.f6944Y = r2
            r0.<init>()
            return
    }

    @Override // p327s7.InterfaceC5984h
    /* renamed from: k */
    public p327s7.AbstractC5985i<java.lang.Void> mo3892k(la.C4233a r3) {
            r2 = this;
            la.a r3 = (la.C4233a) r3
            r0 = 0
            if (r3 != 0) goto Ld
            java.lang.String r3 = "FirebaseCrashlytics"
            java.lang.String r1 = "Received null app settings at app startup. Cannot send cached reports"
            android.util.Log.w(r3, r1, r0)
            goto L2e
        Ld:
            da.q r3 = r2.f6945Z
            da.r$a r3 = r3.f6947b
            da.r r3 = r3.f6967Z
            p056da.C1378r.m3895b(r3)
            da.q r3 = r2.f6945Z
            da.r$a r3 = r3.f6947b
            da.r r3 = r3.f6967Z
            da.l0 r3 = r3.f6961m
            java.util.concurrent.Executor r1 = r2.f6944Y
            r3.m3891g(r1)
            da.q r3 = r2.f6945Z
            da.r$a r3 = r3.f6947b
            da.r r3 = r3.f6967Z
            s7.j<java.lang.Void> r3 = r3.f6965q
            r3.m12459b(r0)
        L2e:
            s7.i r3 = p327s7.C5988l.m12464e(r0)
            return r3
    }
}
