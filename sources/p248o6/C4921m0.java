package p248o6;

/* renamed from: o6.m0 */
/* loaded from: classes.dex */
public final class C4921m0 implements android.os.Handler.Callback {

    /* renamed from: Y */
    public final /* synthetic */ p248o6.C4919l0 f19516Y;

    public C4921m0(p248o6.C4919l0 r1, p248o6.C4897b r2) {
            r0 = this;
            r0.f19516Y = r1
            r0.<init>()
            return
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r8) {
            r7 = this;
            int r0 = r8.what
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L68
            if (r0 == r2) goto L9
            return r1
        L9:
            o6.l0 r0 = r7.f19516Y
            java.util.HashMap<o6.i$a, o6.n0> r0 = r0.f19509c
            monitor-enter(r0)
            java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> L65
            o6.i$a r8 = (p248o6.AbstractC4912i.a) r8     // Catch: java.lang.Throwable -> L65
            o6.l0 r1 = r7.f19516Y     // Catch: java.lang.Throwable -> L65
            java.util.HashMap<o6.i$a, o6.n0> r1 = r1.f19509c     // Catch: java.lang.Throwable -> L65
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L65
            o6.n0 r1 = (p248o6.ServiceConnectionC4923n0) r1     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L63
            int r3 = r1.f19521Z     // Catch: java.lang.Throwable -> L65
            r4 = 3
            if (r3 != r4) goto L63
            java.lang.String r3 = "GmsClientSupervisor"
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L65
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L65
            int r5 = r5 + 47
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "Timeout waiting for ServiceConnection callback "
            r6.append(r5)     // Catch: java.lang.Throwable -> L65
            r6.append(r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L65
            java.lang.Exception r5 = new java.lang.Exception     // Catch: java.lang.Throwable -> L65
            r5.<init>()     // Catch: java.lang.Throwable -> L65
            android.util.Log.e(r3, r4, r5)     // Catch: java.lang.Throwable -> L65
            android.content.ComponentName r3 = r1.f19525d0     // Catch: java.lang.Throwable -> L65
            if (r3 != 0) goto L50
            java.util.Objects.requireNonNull(r8)     // Catch: java.lang.Throwable -> L65
            r3 = 0
        L50:
            if (r3 != 0) goto L60
            android.content.ComponentName r3 = new android.content.ComponentName     // Catch: java.lang.Throwable -> L65
            java.lang.String r8 = r8.f19500b     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "null reference"
            java.util.Objects.requireNonNull(r8, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "unknown"
            r3.<init>(r8, r4)     // Catch: java.lang.Throwable -> L65
        L60:
            r1.onServiceDisconnected(r3)     // Catch: java.lang.Throwable -> L65
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            return r2
        L65:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r8
        L68:
            o6.l0 r0 = r7.f19516Y
            java.util.HashMap<o6.i$a, o6.n0> r0 = r0.f19509c
            monitor-enter(r0)
            java.lang.Object r8 = r8.obj     // Catch: java.lang.Throwable -> La9
            o6.i$a r8 = (p248o6.AbstractC4912i.a) r8     // Catch: java.lang.Throwable -> La9
            o6.l0 r3 = r7.f19516Y     // Catch: java.lang.Throwable -> La9
            java.util.HashMap<o6.i$a, o6.n0> r3 = r3.f19509c     // Catch: java.lang.Throwable -> La9
            java.lang.Object r3 = r3.get(r8)     // Catch: java.lang.Throwable -> La9
            o6.n0 r3 = (p248o6.ServiceConnectionC4923n0) r3     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto La7
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r4 = r3.f19520Y     // Catch: java.lang.Throwable -> La9
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto La7
            boolean r4 = r3.f19522a0     // Catch: java.lang.Throwable -> La9
            if (r4 == 0) goto La0
            o6.l0 r4 = r3.f19526e0     // Catch: java.lang.Throwable -> La9
            android.os.Handler r4 = r4.f19511e     // Catch: java.lang.Throwable -> La9
            o6.i$a r5 = r3.f19524c0     // Catch: java.lang.Throwable -> La9
            r4.removeMessages(r2, r5)     // Catch: java.lang.Throwable -> La9
            o6.l0 r4 = r3.f19526e0     // Catch: java.lang.Throwable -> La9
            t6.a r5 = r4.f19512f     // Catch: java.lang.Throwable -> La9
            android.content.Context r4 = r4.f19510d     // Catch: java.lang.Throwable -> La9
            r5.m12750c(r4, r3)     // Catch: java.lang.Throwable -> La9
            r3.f19522a0 = r1     // Catch: java.lang.Throwable -> La9
            r1 = 2
            r3.f19521Z = r1     // Catch: java.lang.Throwable -> La9
        La0:
            o6.l0 r1 = r7.f19516Y     // Catch: java.lang.Throwable -> La9
            java.util.HashMap<o6.i$a, o6.n0> r1 = r1.f19509c     // Catch: java.lang.Throwable -> La9
            r1.remove(r8)     // Catch: java.lang.Throwable -> La9
        La7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            return r2
        La9:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
            throw r8
    }
}
