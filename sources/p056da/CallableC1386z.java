package p056da;

/* renamed from: da.z */
/* loaded from: classes.dex */
public class CallableC1386z implements java.util.concurrent.Callable<java.lang.Boolean> {

    /* renamed from: a */
    public final /* synthetic */ p056da.C1385y f6995a;

    public CallableC1386z(p056da.C1385y r1) {
            r0 = this;
            r0.f6995a = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Boolean call() {
            r5 = this;
            da.y r0 = r5.f6995a
            da.r r0 = r0.f6986f
            androidx.appcompat.widget.x r1 = r0.f6951c
            java.io.File r1 = r1.m822m()
            boolean r1 = r1.exists()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L23
            java.lang.String r1 = r0.m3899f()
            if (r1 == 0) goto L21
            aa.a r0 = r0.f6958j
            boolean r0 = r0.mo49e(r1)
            if (r0 == 0) goto L21
            r2 = 1
        L21:
            r3 = r2
            goto L3b
        L23:
            r1 = 2
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L32
            r1 = 0
            java.lang.String r4 = "Found previous crash marker."
            android.util.Log.v(r2, r4, r1)
        L32:
            androidx.appcompat.widget.x r0 = r0.f6951c
            java.io.File r0 = r0.m822m()
            r0.delete()
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
    }
}
