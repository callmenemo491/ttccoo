package p031c1;

/* renamed from: c1.g */
/* loaded from: classes.dex */
public class RunnableC0839g implements java.lang.Runnable {

    /* renamed from: Y */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.l f4566Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f4567Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f4568a0;

    /* renamed from: b0 */
    public final /* synthetic */ int f4569b0;

    /* renamed from: c0 */
    public final /* synthetic */ android.os.Bundle f4570c0;

    /* renamed from: d0 */
    public final /* synthetic */ p031c1.AbstractServiceC0833a.k f4571d0;

    public RunnableC0839g(p031c1.AbstractServiceC0833a.k r1, p031c1.AbstractServiceC0833a.l r2, java.lang.String r3, int r4, int r5, android.os.Bundle r6) {
            r0 = this;
            r0.f4571d0 = r1
            r0.f4566Y = r2
            r0.f4567Z = r3
            r0.f4568a0 = r4
            r0.f4569b0 = r5
            r0.f4570c0 = r6
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r9 = this;
            c1.a$l r0 = r9.f4566Y
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0
            android.os.IBinder r0 = r0.m2512a()
            c1.a$k r1 = r9.f4571d0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            r1.remove(r0)
            c1.a$c r1 = new c1.a$c
            c1.a$k r2 = r9.f4571d0
            c1.a r3 = r2.f4553a
            java.lang.String r4 = r9.f4567Z
            int r5 = r9.f4568a0
            int r6 = r9.f4569b0
            android.os.Bundle r7 = r9.f4570c0
            c1.a$l r8 = r9.f4566Y
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            c1.a$k r2 = r9.f4571d0
            c1.a r2 = r2.f4553a
            java.util.Objects.requireNonNull(r2)
            c1.a$k r2 = r9.f4571d0
            c1.a r2 = r2.f4553a
            java.lang.String r3 = r9.f4567Z
            int r4 = r9.f4569b0
            android.os.Bundle r5 = r9.f4570c0
            c1.a$b r2 = r2.mo2502b(r3, r4, r5)
            r1.f4535f = r2
            c1.a$k r2 = r9.f4571d0
            c1.a r2 = r2.f4553a
            java.util.Objects.requireNonNull(r2)
            c1.a$b r2 = r1.f4535f
            java.lang.String r3 = "MBServiceCompat"
            if (r2 != 0) goto L86
            java.lang.String r0 = "No root for client "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r9.f4567Z
            r0.append(r1)
            java.lang.String r1 = " from service "
            r0.append(r1)
            java.lang.Class<c1.g> r1 = p031c1.RunnableC0839g.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r3, r0)
            c1.a$l r0 = r9.f4566Y     // Catch: android.os.RemoteException -> L73
            c1.a$m r0 = (p031c1.AbstractServiceC0833a.m) r0     // Catch: android.os.RemoteException -> L73
            r1 = 2
            r2 = 0
            r0.m2515d(r1, r2)     // Catch: android.os.RemoteException -> L73
            goto Lc4
        L73:
            java.lang.String r0 = "Calling onConnectFailed() failed. Ignoring. pkg="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r1 = r9.f4567Z
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r3, r0)
            goto Lc4
        L86:
            c1.a$k r2 = r9.f4571d0     // Catch: android.os.RemoteException -> La9
            c1.a r2 = r2.f4553a     // Catch: android.os.RemoteException -> La9
            s.a<android.os.IBinder, c1.a$c> r2 = r2.f4520b0     // Catch: android.os.RemoteException -> La9
            r2.put(r0, r1)     // Catch: android.os.RemoteException -> La9
            r2 = 0
            r0.linkToDeath(r1, r2)     // Catch: android.os.RemoteException -> La9
            c1.a$k r2 = r9.f4571d0     // Catch: android.os.RemoteException -> La9
            c1.a r2 = r2.f4553a     // Catch: android.os.RemoteException -> La9
            android.support.v4.media.session.MediaSessionCompat$Token r2 = r2.f4522d0     // Catch: android.os.RemoteException -> La9
            if (r2 == 0) goto Lc4
            c1.a$l r4 = r9.f4566Y     // Catch: android.os.RemoteException -> La9
            c1.a$b r1 = r1.f4535f     // Catch: android.os.RemoteException -> La9
            java.lang.String r5 = r1.f4528a     // Catch: android.os.RemoteException -> La9
            android.os.Bundle r1 = r1.f4529b     // Catch: android.os.RemoteException -> La9
            c1.a$m r4 = (p031c1.AbstractServiceC0833a.m) r4     // Catch: android.os.RemoteException -> La9
            r4.m2513b(r5, r2, r1)     // Catch: android.os.RemoteException -> La9
            goto Lc4
        La9:
            java.lang.String r1 = "Calling onConnect() failed. Dropping client. pkg="
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r9.f4567Z
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r3, r1)
            c1.a$k r1 = r9.f4571d0
            c1.a r1 = r1.f4553a
            s.a<android.os.IBinder, c1.a$c> r1 = r1.f4520b0
            r1.remove(r0)
        Lc4:
            return
    }
}
