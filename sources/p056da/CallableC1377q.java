package p056da;

/* renamed from: da.q */
/* loaded from: classes.dex */
public class CallableC1377q implements java.util.concurrent.Callable<p327s7.AbstractC5985i<java.lang.Void>> {

    /* renamed from: a */
    public final /* synthetic */ java.lang.Boolean f6946a;

    /* renamed from: b */
    public final /* synthetic */ p056da.C1378r.a f6947b;

    public CallableC1377q(p056da.C1378r.a r1, java.lang.Boolean r2) {
            r0 = this;
            r0.f6947b = r1
            r0.f6946a = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public p327s7.AbstractC5985i<java.lang.Void> call() {
            r5 = this;
            java.lang.Boolean r0 = r5.f6946a
            boolean r0 = r0.booleanValue()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            r3 = 0
            if (r0 != 0) goto L65
            r0 = 2
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L18
            java.lang.String r0 = "Deleting cached crash reports..."
            android.util.Log.v(r2, r0, r3)
        L18:
            da.r$a r0 = r5.f6947b
            da.r r0 = r0.f6967Z
            da.j r2 = p056da.C1364j.f6918a
            java.io.File r0 = r0.m3900g()
            java.io.File[] r0 = r0.listFiles(r2)
            if (r0 != 0) goto L2a
            java.io.File[] r0 = new java.io.File[r1]
        L2a:
            int r2 = r0.length
        L2b:
            if (r1 >= r2) goto L35
            r4 = r0[r1]
            r4.delete()
            int r1 = r1 + 1
            goto L2b
        L35:
            da.r$a r0 = r5.f6947b
            da.r r0 = r0.f6967Z
            da.l0 r0 = r0.f6961m
            ia.e r0 = r0.f6927b
            java.util.List r0 = r0.m7586c()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            r1.delete()
            goto L47
        L57:
            da.r$a r0 = r5.f6947b
            da.r r0 = r0.f6967Z
            s7.j<java.lang.Void> r0 = r0.f6965q
            r0.m12459b(r3)
            s7.i r0 = p327s7.C5988l.m12464e(r3)
            goto L9a
        L65:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = "Sending cached crash reports..."
            android.util.Log.d(r2, r0, r3)
        L71:
            java.lang.Boolean r0 = r5.f6946a
            boolean r0 = r0.booleanValue()
            da.r$a r1 = r5.f6947b
            da.r r1 = r1.f6967Z
            da.d0 r1 = r1.f6950b
            java.util.Objects.requireNonNull(r1)
            if (r0 == 0) goto L9b
            s7.j<java.lang.Void> r0 = r1.f6890g
            r0.m12459b(r3)
            da.r$a r0 = r5.f6947b
            da.r r1 = r0.f6967Z
            da.f r1 = r1.f6952d
            java.util.concurrent.Executor r1 = r1.f6899a
            s7.i r0 = r0.f6966Y
            da.p r2 = new da.p
            r2.<init>(r5, r1)
            s7.i r0 = r0.mo12456n(r1, r2)
        L9a:
            return r0
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "An invalid data collection token was used."
            r0.<init>(r1)
            throw r0
    }
}
