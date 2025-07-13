package p056da;

/* renamed from: da.t */
/* loaded from: classes.dex */
public class RunnableC1380t implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ long f6971Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Throwable f6972Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Thread f6973a0;

    /* renamed from: b0 */
    public final /* synthetic */ p056da.C1378r f6974b0;

    public RunnableC1380t(p056da.C1378r r1, long r2, java.lang.Throwable r4, java.lang.Thread r5) {
            r0 = this;
            r0.f6974b0 = r1
            r0.f6971Y = r2
            r0.f6972Z = r4
            r0.f6973a0 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            da.r r0 = r12.f6974b0
            boolean r0 = r0.m3901h()
            if (r0 != 0) goto L4b
            long r0 = r12.f6971Y
            r2 = 1000(0x3e8, double:4.94E-321)
            long r9 = r0 / r2
            da.r r0 = r12.f6974b0
            java.lang.String r7 = r0.m3899f()
            r0 = 0
            java.lang.String r1 = "FirebaseCrashlytics"
            if (r7 != 0) goto L1f
            java.lang.String r2 = "Tried to write a non-fatal exception while no session was open."
            android.util.Log.w(r1, r2, r0)
            return
        L1f:
            da.r r2 = r12.f6974b0
            da.l0 r4 = r2.f6961m
            java.lang.Throwable r5 = r12.f6972Z
            java.lang.Thread r6 = r12.f6973a0
            java.util.Objects.requireNonNull(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Persisting non-fatal event for session "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r3 = 2
            boolean r3 = android.util.Log.isLoggable(r1, r3)
            if (r3 == 0) goto L45
            android.util.Log.v(r1, r2, r0)
        L45:
            r11 = 0
            java.lang.String r8 = "error"
            r4.m3890f(r5, r6, r7, r8, r9, r11)
        L4b:
            return
    }
}
