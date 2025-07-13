package p185k7;

/* renamed from: k7.ba */
/* loaded from: classes.dex */
public final class C3749ba implements p185k7.InterfaceC3735aa {

    /* renamed from: a */
    public static final p185k7.AbstractC3921o4<java.lang.Boolean> f16535a = null;

    static {
            k7.m4 r0 = new k7.m4
            java.lang.String r1 = "com.google.android.gms.measurement"
            android.net.Uri r1 = p185k7.C3813g4.m8551a(r1)
            r0.<init>(r1)
            java.lang.String r1 = "measurement.client.sessions.check_on_reset_and_enable2"
            r2 = 1
            k7.o4 r1 = r0.m8817b(r1, r2)
            p185k7.C3749ba.f16535a = r1
            java.lang.String r1 = "measurement.client.sessions.check_on_startup"
            r0.m8817b(r1, r2)
            java.lang.String r1 = "measurement.client.sessions.start_session_before_view_screen"
            r0.m8817b(r1, r2)
            return
    }

    public C3749ba() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.InterfaceC3735aa
    /* renamed from: a */
    public final boolean mo8213a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // p185k7.InterfaceC3735aa
    /* renamed from: b */
    public final boolean mo8214b() {
            r1 = this;
            k7.o4<java.lang.Boolean> r0 = p185k7.C3749ba.f16535a
            java.lang.Object r0 = r0.m8860b()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }
}
