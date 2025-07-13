package p249o7;

/* renamed from: o7.m3 */
/* loaded from: classes.dex */
public final class C5049m3 extends android.content.BroadcastReceiver {

    /* renamed from: a */
    public final p249o7.C5052m6 f19842a;

    /* renamed from: b */
    public boolean f19843b;

    /* renamed from: c */
    public boolean f19844c;

    static {
            java.lang.Class<o7.m3> r0 = p249o7.C5049m3.class
            return
    }

    public C5049m3(p249o7.C5052m6 r1) {
            r0 = this;
            r0.<init>()
            r0.f19842a = r1
            return
    }

    /* renamed from: a */
    public final void m11314a() {
            r3 = this;
            o7.m6 r0 = r3.f19842a
            r0.m11348g()
            o7.m6 r0 = r3.f19842a
            o7.f4 r0 = r0.mo3160b()
            r0.mo3183i()
            o7.m6 r0 = r3.f19842a
            o7.f4 r0 = r0.mo3160b()
            r0.mo3183i()
            boolean r0 = r3.f19843b
            if (r0 == 0) goto L45
            o7.m6 r0 = r3.f19842a
            com.google.android.gms.measurement.internal.b r0 = r0.mo3162d()
            o7.f3 r0 = r0.f5680n
            java.lang.String r1 = "Unregistering connectivity change receiver"
            r0.m11169c(r1)
            r0 = 0
            r3.f19843b = r0
            r3.f19844c = r0
            o7.m6 r0 = r3.f19842a
            com.google.android.gms.measurement.internal.d r0 = r0.f19871l
            android.content.Context r0 = r0.f5710a
            r0.unregisterReceiver(r3)     // Catch: java.lang.IllegalArgumentException -> L37
            return
        L37:
            r0 = move-exception
            o7.m6 r1 = r3.f19842a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5672f
            java.lang.String r2 = "Failed to unregister the network broadcast receiver"
            r1.m11170d(r2, r0)
        L45:
            return
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r2, android.content.Intent r3) {
            r1 = this;
            o7.m6 r2 = r1.f19842a
            r2.m11348g()
            java.lang.String r2 = r3.getAction()
            o7.m6 r3 = r1.f19842a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5680n
            java.lang.String r0 = "NetworkBroadcastReceiver received action"
            r3.m11170d(r0, r2)
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L3e
            o7.m6 r2 = r1.f19842a
            o7.k3 r2 = r2.f19861b
            p249o7.C5052m6.m11327I(r2)
            boolean r2 = r2.m11288n()
            boolean r3 = r1.f19844c
            if (r3 == r2) goto L3d
            r1.f19844c = r2
            o7.m6 r3 = r1.f19842a
            o7.f4 r3 = r3.mo3160b()
            o7.l3 r0 = new o7.l3
            r0.<init>(r1, r2)
            r3.m11176s(r0)
        L3d:
            return
        L3e:
            o7.m6 r3 = r1.f19842a
            com.google.android.gms.measurement.internal.b r3 = r3.mo3162d()
            o7.f3 r3 = r3.f5675i
            java.lang.String r0 = "NetworkBroadcastReceiver received unknown action"
            r3.m11170d(r0, r2)
            return
    }
}
