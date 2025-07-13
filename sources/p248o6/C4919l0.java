package p248o6;

/* renamed from: o6.l0 */
/* loaded from: classes.dex */
public final class C4919l0 extends p248o6.AbstractC4912i {

    /* renamed from: c */
    public final java.util.HashMap<p248o6.AbstractC4912i.a, p248o6.ServiceConnectionC4923n0> f19509c;

    /* renamed from: d */
    public final android.content.Context f19510d;

    /* renamed from: e */
    public final android.os.Handler f19511e;

    /* renamed from: f */
    public final p338t6.C6181a f19512f;

    /* renamed from: g */
    public final long f19513g;

    /* renamed from: h */
    public final long f19514h;

    public C4919l0(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f19509c = r0
            android.content.Context r0 = r4.getApplicationContext()
            r3.f19510d = r0
            g7.c r0 = new g7.c
            android.os.Looper r4 = r4.getMainLooper()
            o6.m0 r1 = new o6.m0
            r2 = 0
            r1.<init>(r3, r2)
            r0.<init>(r4, r1)
            r3.f19511e = r0
            t6.a r4 = p338t6.C6181a.m12748b()
            r3.f19512f = r4
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.f19513g = r0
            r0 = 300000(0x493e0, double:1.482197E-318)
            r3.f19514h = r0
            return
    }

    @Override // p248o6.AbstractC4912i
    /* renamed from: b */
    public final boolean mo11067b(p248o6.AbstractC4912i.a r5, android.content.ServiceConnection r6, java.lang.String r7) {
            r4 = this;
            java.util.HashMap<o6.i$a, o6.n0> r0 = r4.f19509c
            monitor-enter(r0)
            java.util.HashMap<o6.i$a, o6.n0> r1 = r4.f19509c     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L6e
            o6.n0 r1 = (p248o6.ServiceConnectionC4923n0) r1     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L20
            o6.n0 r1 = new o6.n0     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r2 = r1.f19520Y     // Catch: java.lang.Throwable -> L6e
            r2.put(r6, r6)     // Catch: java.lang.Throwable -> L6e
            r1.m11073a(r7)     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap<o6.i$a, o6.n0> r6 = r4.f19509c     // Catch: java.lang.Throwable -> L6e
            r6.put(r5, r1)     // Catch: java.lang.Throwable -> L6e
            goto L49
        L20:
            android.os.Handler r2 = r4.f19511e     // Catch: java.lang.Throwable -> L6e
            r3 = 0
            r2.removeMessages(r3, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r2 = r1.f19520Y     // Catch: java.lang.Throwable -> L6e
            boolean r2 = r2.containsKey(r6)     // Catch: java.lang.Throwable -> L6e
            if (r2 != 0) goto L4d
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r5 = r1.f19520Y     // Catch: java.lang.Throwable -> L6e
            r5.put(r6, r6)     // Catch: java.lang.Throwable -> L6e
            int r5 = r1.f19521Z     // Catch: java.lang.Throwable -> L6e
            r2 = 1
            if (r5 == r2) goto L40
            r6 = 2
            if (r5 == r6) goto L3c
            goto L49
        L3c:
            r1.m11073a(r7)     // Catch: java.lang.Throwable -> L6e
            goto L49
        L40:
            android.content.ComponentName r5 = r1.f19525d0     // Catch: java.lang.Throwable -> L6e
            android.os.IBinder r7 = r1.f19523b0     // Catch: java.lang.Throwable -> L6e
            o6.c$i r6 = (p248o6.AbstractC4900c.i) r6     // Catch: java.lang.Throwable -> L6e
            r6.onServiceConnected(r5, r7)     // Catch: java.lang.Throwable -> L6e
        L49:
            boolean r5 = r1.f19522a0     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return r5
        L4d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L6e
            int r7 = r5.length()     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + 81
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r7 = "Trying to bind a GmsServiceConnection that was already connected before.  config="
            r1.append(r7)     // Catch: java.lang.Throwable -> L6e
            r1.append(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L6e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L6e
            throw r6     // Catch: java.lang.Throwable -> L6e
        L6e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r5
    }

    @Override // p248o6.AbstractC4912i
    /* renamed from: c */
    public final void mo11068c(p248o6.AbstractC4912i.a r3, android.content.ServiceConnection r4, java.lang.String r5) {
            r2 = this;
            java.lang.String r5 = "ServiceConnection must not be null"
            com.google.android.gms.common.internal.C1101a.m3104i(r4, r5)
            java.util.HashMap<o6.i$a, o6.n0> r5 = r2.f19509c
            monitor-enter(r5)
            java.util.HashMap<o6.i$a, o6.n0> r0 = r2.f19509c     // Catch: java.lang.Throwable -> L79
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L79
            o6.n0 r0 = (p248o6.ServiceConnectionC4923n0) r0     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L58
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r1 = r0.f19520Y     // Catch: java.lang.Throwable -> L79
            boolean r1 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L37
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r1 = r0.f19520Y     // Catch: java.lang.Throwable -> L79
            r1.remove(r4)     // Catch: java.lang.Throwable -> L79
            java.util.Map<android.content.ServiceConnection, android.content.ServiceConnection> r4 = r0.f19520Y     // Catch: java.lang.Throwable -> L79
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L79
            if (r4 == 0) goto L35
            android.os.Handler r4 = r2.f19511e     // Catch: java.lang.Throwable -> L79
            r0 = 0
            android.os.Message r3 = r4.obtainMessage(r0, r3)     // Catch: java.lang.Throwable -> L79
            android.os.Handler r4 = r2.f19511e     // Catch: java.lang.Throwable -> L79
            long r0 = r2.f19513g     // Catch: java.lang.Throwable -> L79
            r4.sendMessageDelayed(r3, r0)     // Catch: java.lang.Throwable -> L79
        L35:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            return
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L79
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "Trying to unbind a GmsServiceConnection  that was not bound before.  config="
            r1.append(r0)     // Catch: java.lang.Throwable -> L79
            r1.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L79
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L79
            throw r4     // Catch: java.lang.Throwable -> L79
        L58:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L79
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L79
            int r0 = r0 + 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "Nonexistent connection status for service config: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L79
            r1.append(r3)     // Catch: java.lang.Throwable -> L79
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L79
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L79
            throw r4     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L79
            throw r3
    }
}
