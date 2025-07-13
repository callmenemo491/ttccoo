package p056da;

/* renamed from: da.l */
/* loaded from: classes.dex */
public class C1368l implements p056da.C1351c0.a {

    /* renamed from: a */
    public final /* synthetic */ p056da.C1378r f6925a;

    public C1368l(p056da.C1378r r1) {
            r0 = this;
            r0.f6925a = r1
            r0.<init>()
            return
    }

    /* renamed from: a */
    public void m3884a(p188ka.InterfaceC4076c r11, java.lang.Thread r12, java.lang.Throwable r13) {
            r10 = this;
            da.r r7 = r10.f6925a
            monitor-enter(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "Handling uncaught exception \""
            r0.append(r1)     // Catch: java.lang.Throwable -> L51
            r0.append(r13)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = "\" from thread "
            r0.append(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r1 = r12.getName()     // Catch: java.lang.Throwable -> L51
            r0.append(r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L51
            r1 = 3
            java.lang.String r2 = "FirebaseCrashlytics"
            boolean r1 = android.util.Log.isLoggable(r2, r1)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L2f
            java.lang.String r1 = "FirebaseCrashlytics"
            r2 = 0
            android.util.Log.d(r1, r0, r2)     // Catch: java.lang.Throwable -> L51
        L2f:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L51
            da.f r8 = r7.f6952d     // Catch: java.lang.Throwable -> L51
            da.n r9 = new da.n     // Catch: java.lang.Throwable -> L51
            r0 = r9
            r1 = r7
            r4 = r13
            r5 = r12
            r6 = r11
            r0.<init>(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L51
            s7.i r11 = r8.m3873c(r9)     // Catch: java.lang.Throwable -> L51
            p056da.C1375o0.m3893a(r11)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L51
            goto L4f
        L47:
            r11 = move-exception
            java.lang.String r12 = "Error handling uncaught exception"
            java.lang.String r13 = "FirebaseCrashlytics"
            android.util.Log.e(r13, r12, r11)     // Catch: java.lang.Throwable -> L51
        L4f:
            monitor-exit(r7)
            return
        L51:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
    }
}
